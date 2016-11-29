package com.cnk.travelogix.mdmbackoffice.services;

import de.hybris.platform.core.GenericCondition;
import de.hybris.platform.core.GenericConditionList;
import de.hybris.platform.core.GenericValueCondition;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;
import de.hybris.platform.core.model.type.CollectionTypeModel;
import de.hybris.platform.core.model.type.ComposedTypeModel;
import de.hybris.platform.core.model.type.MapTypeModel;
import de.hybris.platform.core.model.type.TypeModel;
import de.hybris.platform.core.model.type.ViewTypeModel;
import de.hybris.platform.genericsearch.GenericSearchQuery;
import de.hybris.platform.genericsearch.impl.DefaultGenericSearchService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.session.SessionExecutionBody;
import de.hybris.platform.servicelayer.session.SessionService;
import de.hybris.platform.servicelayer.type.TypeService;
import de.hybris.platform.servicelayer.util.ServicesUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;


/**
 * Search customization
 */
public class TravelogixGenericSearchService extends DefaultGenericSearchService
{
	private static final Logger LOG = Logger.getLogger(TravelogixGenericSearchService.class.getName());
	private SessionService sessionService;
	private TypeService typeService;
	private FlexibleSearchService flexibleSearchService;

	@Override
	public SearchResult search(final GenericSearchQuery genericSearchQuery)
	{
		ServicesUtil.validateParameterNotNullStandardMessage("genericSearchQuery", genericSearchQuery);
		ServicesUtil.validateParameterNotNullStandardMessage("genericSearchQuery.getQuery()", genericSearchQuery.getQuery());
		if (LOG.isDebugEnabled())
		{
			LOG.debug(genericSearchQuery.getQuery());
		}
		return (SearchResult) sessionService.executeInLocalView(new SessionExecutionBody()
		{
			@Override
			public Object execute()
			{
				final ComposedTypeModel initialType = typeService
						.getComposedTypeForCode(genericSearchQuery.getQuery().getInitialTypeCode());
				if (initialType instanceof ViewTypeModel)
				{
					throw new IllegalArgumentException("searching for ViewType is currently unimplemented");
				}
				final Map values = new HashMap();
				String query = genericSearchQuery.getQuery().toFlexibleSearch(values);
				if (genericSearchQuery.getQuery().getCondition() instanceof GenericConditionList)
				{
					query = updatedInnerQuery(((GenericConditionList) genericSearchQuery.getQuery().getCondition()).getConditionList(),
							query, initialType);
				}
				return executeSearch(genericSearchQuery, values, query);
			}
		});
	}

	protected SearchResult executeSearch(final GenericSearchQuery genericSearchQuery, final Map values, final String query)
	{
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);
		fsq.setNeedTotal(genericSearchQuery.isNeedTotal());
		fsq.setResultClassList(genericSearchQuery.getQuery().getResultClasses());
		fsq.addQueryParameters(values);
		fsq.setCount(genericSearchQuery.getCount());
		fsq.setStart(genericSearchQuery.getStart());
		fsq.setFailOnUnknownFields(genericSearchQuery.isFailOnUnknownFields());
		fsq.setLocale(genericSearchQuery.getLocale());
		fsq.setLanguage(genericSearchQuery.getLanguage());
		fsq.setCatalogVersions(genericSearchQuery.getCatalogVersions());
		return flexibleSearchService.search(fsq);
	}

	protected String updatedInnerQuery(final List<GenericCondition> genericConditions, final String query,
			final ComposedTypeModel initialType)
	{
		final ComposedTypeModel composedTypeModel = initialType;
		String initialQuery = query;
		for (int j = 0; j < genericConditions.size(); j++)
		{
			if (genericConditions.get(j) instanceof GenericValueCondition)
			{
				final GenericValueCondition genericCondition = (GenericValueCondition) genericConditions.get(j);
				initialQuery = buildQuery(genericCondition, composedTypeModel, j, initialQuery);
			}
		}
		return initialQuery;
	}

	protected String buildQuery(final GenericValueCondition genericCondition, final ComposedTypeModel composedTypeModel,
			final int counter, final String initialQuery)
	{
		ComposedTypeModel model = composedTypeModel;
		if (genericCondition.getField().getQualifier().contains("."))
		{
			final StringBuilder stringBuilder = new StringBuilder();
			final List<String> qualis = Arrays.asList(genericCondition.getField().getQualifier().split("\\."));
			int index = 0;
			do
			{
				final AttributeDescriptorModel attributeDescriptor = typeService.getAttributeDescriptor(model, qualis.get(index));
				model = typeService.getComposedTypeForCode(getValueType(attributeDescriptor).getCode());
				stringBuilder.append(qualis.get(index));
				stringBuilder.append("} in ({{SELECT {C" + (index + 1) + ":PK} FROM{");
				stringBuilder.append(getValueType(attributeDescriptor).getCode());
				stringBuilder.append(" as C" + (index + 1) + "} WHERE ({C" + (index + 1) + ":");
				stringBuilder.append(qualis.get(++index));
				stringBuilder.append("} = ?gs.param." + (counter + 1));
				stringBuilder.append("}}))");
			}
			while (index < qualis.size() - 1);
			final StringBuilder newQuery = new StringBuilder();
			newQuery.append(initialQuery.replace(genericCondition.getField().getQualifier() + "} = ?gs.param." + (counter + 1),
					stringBuilder.toString()));
			return newQuery.toString();
		}
		return initialQuery;
	}

	protected TypeModel getValueType(final AttributeDescriptorModel attributeDescriptor)
	{
		TypeModel type = attributeDescriptor.getAttributeType();
		if (type instanceof CollectionTypeModel)
		{
			type = ((CollectionTypeModel) type).getElementType();
		}
		else if (type instanceof MapTypeModel)
		{
			type = ((MapTypeModel) type).getReturntype();
		}
		return type;
	}

	public SessionService getSessionService()
	{
		return sessionService;
	}

	@Override
	public void setSessionService(final SessionService sessionService)
	{
		this.sessionService = sessionService;
	}

	public TypeService getTypeService()
	{
		return typeService;
	}

	@Override
	public void setTypeService(final TypeService typeService)
	{
		this.typeService = typeService;
	}

	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}

	@Override
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}
}