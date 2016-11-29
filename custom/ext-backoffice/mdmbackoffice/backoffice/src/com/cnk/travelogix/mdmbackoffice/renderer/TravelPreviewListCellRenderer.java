/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.renderer;

import de.hybris.platform.core.model.ItemModel;

import org.zkoss.zul.Image;
import org.zkoss.zul.Listcell;

import com.hybris.cockpitng.core.config.impl.jaxb.listview.ListColumn;
import com.hybris.cockpitng.dataaccess.facades.type.DataType;
import com.hybris.cockpitng.engine.WidgetInstanceManager;
import com.hybris.cockpitng.util.UITools;
import com.hybris.cockpitng.widgets.collectionbrowser.mold.impl.listview.renderer.DefaultPreviewListCellRenderer;



public class TravelPreviewListCellRenderer extends DefaultPreviewListCellRenderer
{

	@Override
	public void render(final Listcell listcell, final ListColumn configuration, final Object o, final DataType dataType,
			final WidgetInstanceManager widgetInstanceManager)
	{
		Image image = new Image("/cng/images/star.png");
		if (o instanceof ItemModel)
		{
			final ItemModel model = (ItemModel) o;
			if (model.getProperty("lockedBy") != null)
			{
				image = new Image("/cng/images/lock.png");
			}
		}
		UITools.modifySClass(image, "ye-listview-def-preview-img", true);
		listcell.appendChild(image);
		fireComponentRendered(image, listcell, configuration, o);

	}
}
