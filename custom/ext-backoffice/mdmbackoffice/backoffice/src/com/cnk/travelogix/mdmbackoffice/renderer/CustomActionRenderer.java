/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.renderer;



import java.util.Iterator;

import org.apache.commons.lang3.StringUtils;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.HtmlBasedComponent;
import org.zkoss.zul.Button;
import org.zkoss.zul.Image;
import org.zkoss.zul.Toolbarbutton;

import com.hybris.cockpitng.actions.ActionContext;
import com.hybris.cockpitng.actions.ActionListener;
import com.hybris.cockpitng.actions.CockpitAction;
import com.hybris.cockpitng.actions.impl.DefaultActionRenderer;
import com.hybris.cockpitng.util.YTestTools;


/**
 * To render text
 */
public class CustomActionRenderer extends DefaultActionRenderer<Object, Object>
{
	@Override
	public void render(final Component parent, final CockpitAction<Object, Object> action, final ActionContext<Object> context,
			final boolean updateMode, final ActionListener<Object> listener)
	{
		parent.getChildren().clear();
		context.setParameter("viewMode", "textOnly");

		final HtmlBasedComponent container = this.getOrCreateContainer(parent);
		String sclass = this.getActionBodySclass(context);
		final boolean enabled = action.canPerform(context);
		if (enabled)
		{
			sclass = sclass + " cng-action-enabled";
		}
		else
		{
			sclass = sclass + " cng-action-disabled";
		}

		container.setSclass(sclass);
		YTestTools.modifyYTestId(container, this.createYTestId(context));
		final boolean showText = context.isShowText();
		final String iconUri = this.getIconUri(context, enabled);
		final String localizedName = this.getLocalizedName(context);
		final String iconHoverUri = this.getIconHoverUri(context, enabled);

		if (!StringUtils.isEmpty(iconUri) && !showText)
		{
			this.removeLabel(container);
		}
		else
		{
			final Button button = this.getOrCreateTypeChooserButton(container, localizedName, enabled);
			button.removeForward("onClick", button, "onMouseOut");
			if (enabled)
			{
				button.addForward("onClick", button, "onMouseOut");
				this.addEventListener(button, this.createEventListener(action, context, listener));
			}
			this.removeLabel(container);
			this.registerHoverEventsOnContainer(container, (Image) null, false, iconUri, iconHoverUri);
		}

		this.removeEventListener(container);
		container.removeForward("onClick", container, "onMouseOut");
		if (enabled)
		{
			container.addForward("onClick", container, "onMouseOut");
			this.addEventListener(container, this.createEventListener(action, context, listener));
		}
	}

	protected Button getOrCreateTypeChooserButton(final HtmlBasedComponent container, final String localizedName,
			final boolean enabled)
	{
		final Iterator openTypeChooser = container.getChildren().iterator();

		Component component;
		do
		{
			if (!openTypeChooser.hasNext())
			{
				final Button openTypeChooser1 = new Button(localizedName);
				openTypeChooser1.setSclass("y-btn-primary");
				openTypeChooser1.setDisabled(!enabled);
				container.appendChild(openTypeChooser1);
				return openTypeChooser1;
			}

			component = (Component) openTypeChooser.next();
		}
		while (!(component instanceof Toolbarbutton));

		return (Button) component;
	}
}
