/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.renderer;

import org.apache.log4j.Logger;
import org.zkoss.zul.Listcell;

import com.cnk.travelogix.masterdata.core.category.model.ProductCategorySubTypeModel;
import com.cnk.travelogix.supplier.core.supplier.model.ProductCategoryInfoModel;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;
import com.cnk.travelogix.supplier.mappings.city.model.SupplierCityMappingModel;
import com.cnk.travelogix.supplier.mappings.country.model.SupplierCountryMappingModel;
import com.hybris.cockpitng.core.config.impl.jaxb.listview.ListColumn;
import com.hybris.cockpitng.dataaccess.facades.type.DataType;
import com.hybris.cockpitng.engine.WidgetInstanceManager;
import com.hybris.cockpitng.widgets.collectionbrowser.mold.impl.listview.renderer.DefaultListCellRenderer;


public class SupplierMappingProductCategorySubTypeCellRenderer extends DefaultListCellRenderer
{

	/** The log. */
	private final Logger LOGGER = Logger.getLogger(SupplierMappingProductCategorySubTypeCellRenderer.class);

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.hybris.cockpitng.widgets.collectionbrowser.mold.impl.listview.renderer.DefaultListCellRenderer#render(org.
	 * zkoss.zul.Listcell, com.hybris.cockpitng.core.config.impl.jaxb.listview.ListColumn, java.lang.Object,
	 * com.hybris.cockpitng.dataaccess.facades.type.DataType, com.hybris.cockpitng.engine.WidgetInstanceManager)
	 */
	@Override
	public void render(final Listcell parent, final ListColumn columnConfiguration, final Object object, final DataType dataType,
			final WidgetInstanceManager widgetInstanceManger)
	{
		LOGGER.debug("SupplierMappingProductCategorySubTypeCellRenderer : render() : Entering.");

		String result = "";
		try
		{
			if (object instanceof SupplierCityMappingModel
					&& columnConfiguration.getQualifier().endsWith(ProductCategoryInfoModel.PRODUCTCATEGORYSUBTYPE)
					&& ((SupplierCityMappingModel) object).getSupplierCity() != null
					&& ((SupplierCityMappingModel) object).getSupplierCity().getSupplier() != null)
			{
				LOGGER.debug("SupplierMappingProductCategorySubTypeCellRenderer : render() : Processing SupplierCityMapping");

				result = extractProductCategorySubType(((SupplierCityMappingModel) object).getSupplierCity().getSupplier());
			}
			else if (object instanceof SupplierCountryMappingModel
					&& columnConfiguration.getQualifier().endsWith(ProductCategoryInfoModel.PRODUCTCATEGORYSUBTYPE)
					&& ((SupplierCountryMappingModel) object).getSupplierCountry() != null
					&& ((SupplierCountryMappingModel) object).getSupplierCountry().getSupplier() != null)
			{
				LOGGER.debug("SupplierMappingProductCategorySubTypeCellRenderer : render() : Processing SupplierCountryMapping.");
				result = extractProductCategorySubType(((SupplierCountryMappingModel) object).getSupplierCountry().getSupplier());
			}
		}
		catch (final Exception e)
		{
			result = "";
			LOGGER.error("ERROR : " + e);
		}

		LOGGER.debug("SupplierMappingProductCategorySubTypeCellRenderer : render() : Setting value to cell : " + result);
		parent.setLabel(result);

		LOGGER.debug("SupplierMappingProductCategorySubTypeCellRenderer : render() : Exiting.");
	}

	/**
	 * Extract product category sub type.
	 *
	 * @param pSupplierModel
	 *           the supplier model
	 * @return the string
	 */
	private String extractProductCategorySubType(final SupplierModel pSupplierModel)
	{
		String result = "";

		if (!pSupplierModel.getDefaultSupplierFor().isEmpty())
		{
			final StringBuilder prodCatSubTypeStr = new StringBuilder();

			for (final ProductCategorySubTypeModel lProductCategorySubTypeModel : pSupplierModel.getDefaultSupplierFor())
			{
				prodCatSubTypeStr.append(lProductCategorySubTypeModel.getName().trim()).append(", ");
			}

			if (prodCatSubTypeStr.length() > 0)
			{
				result = prodCatSubTypeStr.replace(prodCatSubTypeStr.lastIndexOf(", "), prodCatSubTypeStr.length() - 1, "")
						.toString();
			}
		}

		return result;
	}
}
