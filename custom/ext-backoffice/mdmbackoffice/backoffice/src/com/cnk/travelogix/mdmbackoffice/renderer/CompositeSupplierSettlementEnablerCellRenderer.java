package com.cnk.travelogix.mdmbackoffice.renderer;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.zkoss.zul.Listcell;

import com.cnk.travelogix.supplier.mappings.compositesupplier.model.CompositeSupplierModel;
import com.cnk.travelogix.supplier.mappings.enablers.model.SupplierEnablersMappingModel;
import com.hybris.cockpitng.core.config.impl.jaxb.listview.ListColumn;
import com.hybris.cockpitng.dataaccess.facades.type.DataType;
import com.hybris.cockpitng.engine.WidgetInstanceManager;
import com.hybris.cockpitng.widgets.collectionbrowser.mold.impl.listview.renderer.DefaultListCellRenderer;





public class CompositeSupplierSettlementEnablerCellRenderer extends DefaultListCellRenderer
{
	/** The log. */
	private final Logger LOGGER = Logger.getLogger(CompositeSupplierSettlementEnablerCellRenderer.class);


	@Override
	public void render(final Listcell parent, final ListColumn columnConfiguration, final Object object, final DataType dataType,
			final WidgetInstanceManager widgetInstanceManger)
	{
		LOGGER.debug("CompositeSupplierSettlementEnablerCellRenderer : render() : Starts.");
		String result = "";
		try
		{
			if (object instanceof CompositeSupplierModel)

			{
				LOGGER.debug("CompositeSupplierSettlementEnablerCellRenderer : render() : Processing EnablersMapping");
				result = extractSettlementSuppliers(((CompositeSupplierModel) object).getEnablersMappings());
			}
		}
		catch (final Exception e)
		{
			result = "";
			LOGGER.error("ERROR : " + e);
		}
		LOGGER.error("CompositeSupplierSettlementEnablerCellRenderer : render() : Setting value to cell : " + result);
		parent.setLabel(result);
		LOGGER.error("CompositeSupplierSettlementEnablerCellRenderer : render() : Exiting : ");

	}

	/**
	 * Gets the supplier name and settlement enabler
	 *
	 * @param enablersMappings
	 *           the supplier model
	 * @return String
	 */
	private String extractSettlementSuppliers(final Collection<SupplierEnablersMappingModel> enablersMappings)
	{
		String result = "";

		final ArrayList<SupplierEnablersMappingModel> supplierEnablersMappingModel = new ArrayList<SupplierEnablersMappingModel>();
		supplierEnablersMappingModel.addAll(enablersMappings);
		final StringBuilder settlementEnablerMapping = new StringBuilder();
		for (final SupplierEnablersMappingModel supplierEnablersMappingList : enablersMappings)
		{
			settlementEnablerMapping.append(supplierEnablersMappingList.getSettlementEnabler().getName().toString().trim())
					.append(", ");
		}
		if (settlementEnablerMapping.length() > 0)
		{
			try
			{
				result = settlementEnablerMapping
						.replace(settlementEnablerMapping.lastIndexOf(", "), settlementEnablerMapping.length() - 1, "").toString();
			}
			catch (final Exception e)
			{
				LOGGER.error("ERROR : " + e);
			}
		}
		return result;
	}



}