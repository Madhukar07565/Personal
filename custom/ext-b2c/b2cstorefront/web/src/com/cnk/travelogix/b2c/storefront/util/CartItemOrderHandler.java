/**
 *
 */
package com.cnk.travelogix.b2c.storefront.util;

import de.hybris.platform.commercefacades.order.data.CartData;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.commerceservices.service.data.CommerceCartParameter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.cnk.travelogix.b2c.facades.order.B2cCartFacade;
import com.cnk.travelogix.common.core.model.OrderProductInfoModel;
import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderTicketInfoModel;


/**
 * @author i054410
 *
 */
@Aspect
public class CartItemOrderHandler
{
	private static final Logger LOG = Logger.getLogger(CartItemOrderHandler.class);

	@Resource(name = "b2cCartFacade")
	private B2cCartFacade b2cCartFacade;

	@Pointcut("execution(* com.cnk.travelogix.b2c.services.order.service.*.addToCart(..))")
	public void addCartAfter(final JoinPoint joinPoint)
	{
		final HttpSession session = getSession();
		if (session == null)
		{
			return;
		}

		final String[] attribute = getAttribute(session);

		if (attribute == null)
		{
			return;
		}
		final Object[] args = joinPoint.getArgs();

		for (int i = 0; i < args.length; i++)
		{
			if (args[i] instanceof CommerceCartParameter)
			{
				String currentType = null;
				final OrderProductInfoModel orderProductInfo = ((CommerceCartParameter) args[i]).getOrderProductInfo();
				if (orderProductInfo instanceof OrderTicketInfoModel)
				{
					currentType = "FLIGHT_GROUP";
				}
				else if (orderProductInfo instanceof OrderRoomDetailInfoModel)
				{
					currentType = "HOTEL";
				}
				if (StringUtils.isNotEmpty(currentType) && !ArrayUtils.contains(attribute, currentType))
				{
					final String[] copyOf = Arrays.copyOf(attribute, attribute.length + 1);
					copyOf[copyOf.length - 1] = currentType;
					session.setAttribute("typeOrder", copyOf);
				}
			}

		}


	}

	public void removeHotelAfter(final JoinPoint joinPoint)
	{
		removeType("HOTEL");
	}

	public void removeFlightAfter(final JoinPoint joinPoint)
	{
		removeType("FLIGHT_GROUP");
	}

	public void removeAllAfter(final JoinPoint joinPoint)
	{
		removeType("");
	}


	private void removeType(final String type)
	{
		final HttpSession session = getSession();
		if (session == null)
		{
			return;
		}

		final String[] attribute = getAttribute(session);

		if (attribute == null)
		{
			return;
		}

		if (shouldRemoveTypes(type))
		{
			final ArrayList<String> asList = new ArrayList<String>(Arrays.asList(attribute));

			if (type.length() == 0)
			{
				session.setAttribute("typeOrder", null);
			}
			else
			{
				asList.remove(type);
				final int size = asList.size();
				if (size == 0)
				{
					session.setAttribute("typeOrder", null);
				}
				else
				{
					session.setAttribute("typeOrder", asList.toArray(new String[size]));
				}
			}
		}

	}

	private boolean shouldRemoveTypes(final String type)
	{
		final CartData sessionCartWithEntryOrdering = b2cCartFacade.getSessionCartWithEntryOrdering(false);
		boolean shouldRemove = true;
		if (sessionCartWithEntryOrdering != null)
		{
			final List<OrderEntryData> entries = sessionCartWithEntryOrdering.getEntries();
			if (entries != null)
			{
				for (final OrderEntryData oed : entries)
				{
					if (oed.getOrderEntryType().getCode().equalsIgnoreCase(type) || (type.length() == 0))
					{
						shouldRemove = false;
						break;
					}
				}
			}
		}

		return shouldRemove;
	}

	private HttpSession getSession()
	{
		final HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		final HttpSession session = request.getSession();

		if (session == null)
		{
			LOG.error("can not get HTTP session in order handler");

		}

		return session;
	}

	private String[] getAttribute(final HttpSession session)
	{

		final Object attribute = session.getAttribute("typeOrder");

		if (attribute != null)
		{
			return (String[]) attribute;
		}
		else
		{
			return null;
		}
	}

}
