package com.cnk.travelogix.mdmbackoffice.renderer;

import org.zkoss.zul.Listcell;

import com.cnk.travelogix.supplier.mappings.compositesupplier.model.CompositeSupplierModel;
import com.hybris.cockpitng.core.config.impl.jaxb.listview.ListColumn;
import com.hybris.cockpitng.dataaccess.facades.type.DataType;
import com.hybris.cockpitng.engine.WidgetInstanceManager;


/**
 * Class to display lock/unlock image with the supplier name in list view
 */

public class CompositeSupplierCellRenderer extends TravelPreviewListCellRenderer
{
	@Override
	public void render(final Listcell listcell, final ListColumn configuration, final Object o, final DataType dataType,
			final WidgetInstanceManager widgetInstanceManager)
	{

		super.render(listcell, configuration, o, dataType, widgetInstanceManager);

		listcell.setLabel(((CompositeSupplierModel) o).getSupplier().getName());
	}

}