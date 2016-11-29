/**
 *
 */
package com.cnk.travelogix.communication.services;

import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.type.TypeService;

import java.util.Date;

import org.apache.log4j.Logger;

import com.cnk.travelogix.masterdata.core.version.model.VersionDetailModel;


/**
 * @author I319924
 *
 */
public class VersionDetailService
{


	private static final Logger LOG = Logger.getLogger(VersionDetailService.class);
	private static final String FIND_VERSION = "Select {pk} from {VersionDetail} where {version}=?version AND {type} = ?typePK ";

	private FlexibleSearchService flexibleSearchService;
	private TypeService typeService;
	private ModelService modelService;

	public VersionDetailModel findVersion(final Double version, final Class composedClass)
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(FIND_VERSION);
		query.addQueryParameter("version", version);
		query.addQueryParameter("typePK", typeService.getComposedTypeForClass(composedClass).getPk());
		final SearchResult<VersionDetailModel> results = getFlexibleSearchService().search(query);
		if (results.getResult().size() == 0)
		{
			return null;
		}
		return results.getResult().get(0);
	}

	public VersionDetailModel createVersion(final Double version, final Class composedClass)
	{
		final VersionDetailModel versionDetail = getModelService().create(VersionDetailModel.class);
		versionDetail.setVersion(version);
		//versionDetail.setType(typeService.getcomposedClassForClass(paramClass));
		versionDetail.setType(typeService.getComposedTypeForClass(composedClass));
		versionDetail.setVersionDate(new Date());
		getModelService().save(versionDetail);
		return versionDetail;
	}

	public VersionDetailModel getRcommVersion(final Double currentVersion, final Class composedClass)
	{
		VersionDetailModel versionDetails = findVersion(currentVersion, composedClass);
		if (versionDetails == null)
		{
			versionDetails = createVersion(currentVersion, composedClass);
		}
		else
		{
			versionDetails = findVersion(Double.valueOf(currentVersion.doubleValue() + 1.0), composedClass);
			if (versionDetails == null)
			{
				versionDetails = createVersion(Double.valueOf(currentVersion.doubleValue() + 1.0), composedClass);
			}
		}
		return versionDetails;
	}

	public VersionDetailModel getInitVersion(final Double currentVersion, final Class composedClass)
	{
		VersionDetailModel versionDetail = findVersion(currentVersion, composedClass);
		if (versionDetail == null)
		{
			versionDetail = createVersion(currentVersion, composedClass);
		}
		return versionDetail;
	}


	/**
	 * @return the flexibleSearchService
	 */
	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}


	/**
	 * @param flexibleSearchService
	 *           the flexibleSearchService to set
	 */
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

	/**
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	/**
	 * @return the typeService
	 */
	public TypeService getTypeService()
	{
		return typeService;
	}

	/**
	 * @param typeService
	 *           the typeService to set
	 */
	public void setTypeService(final TypeService typeService)
	{
		this.typeService = typeService;
	}
}
