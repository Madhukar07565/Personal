package com.cnk.travelogix.mdmbackoffice.renderer;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.zkoss.zul.Listcell;

import com.cnk.travelogix.supplier.mappings.compositesupplier.model.CompositeSupplierModel;
import com.cnk.travelogix.supplier.mappings.enablers.model.SupplierEnablersMappingModel;
import com.hybris.cockpitng.core.config.impl.jaxb.listview.ListColumn;
import com.hybris.cockpitng.dataaccess.facades.type.DataType;
import com.hybris.cockpitng.engine.WidgetInstanceManager;
import com.hybris.cockpitng.widgets.collectionbrowser.mold.impl.listview.renderer.DefaultListCellRenderer;


public class CompositeSupplierConnectivityEnablerCellRenderer extends DefaultListCellRenderer
{
	/** The log. */
	private final Logger LOGGER = Logger.getLogger(CompositeSupplierConnectivityEnablerCellRenderer.class);

	@Override
	public void render(final Listcell parent, final ListColumn columnConfiguration, final Object object, final DataType dataType,
			final WidgetInstanceManager widgetInstanceManger)
	{
		LOGGER.debug("CompositeSupplierConnectivityEnablerCellRenderer : render() : Starts.");
		String result = "";
		try
		{
			if (object instanceof CompositeSupplierModel)

			{
				LOGGER.debug("CompositeSupplierConnectivityEnablerCellRenderer : render() : Processing EnablersMapping");

				result = extractConnectivityEnablers(((CompositeSupplierModel) object).getEnablersMappings());
			}
		}
		catch (final Exception e)
		{
			result = "";
			LOGGER.error("ERROR : " + e);
		}
		LOGGER.error("CompositeSupplierConnectivityEnablerCellRenderer : render() : Setting value to cell : " + result);
		parent.setLabel(result);
		LOGGER.error("CompositeSupplierConnectivityEnablerCellRenderer : render() : Exiting : ");

	}

	/**
	 * Fetches the supplier name for connectivity enabler
	 *
	 * @param enablersMappings
	 *           the Supplier Enablers Mapping model
	 * @return String
	 */
	private String extractConnectivityEnablers(final Collection<SupplierEnablersMappingModel> enablersMappings)
	{
		String result = "";
		final StringBuilder connectivityEnablerMapping = new StringBuilder();
		for (final SupplierEnablersMappingModel supplierEnablersMappingList : enablersMappings)
		{
			connectivityEnablerMapping.append(supplierEnablersMappingList.getConnectivityEnabler().getName().toString().trim())
					.append(", ");
		}
		if (connectivityEnablerMapping.length() > 0)
		{
			try
			{
				result = connectivityEnablerMapping
						.replace(connectivityEnablerMapping.lastIndexOf(", "), connectivityEnablerMapping.length() - 1, "").toString();
			}
			catch (final Exception e)
			{
				LOGGER.error("ERROR : " + e);
			}
		}
		return result;
	}


}