/**
 *
 */
package com.cnk.travelogix.common.facades.product.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * @author i313890
 *
 */
public class DateUtil
{
	public static Integer getIntervalDays(final Date startDate, final Date endDate)
	{
		if (null != startDate && null != endDate)
		{
			final long time = Math.abs(startDate.getTime() - endDate.getTime());
			final long intervalDays = time / (24 * 60 * 60 * 1000);
			return Integer.valueOf(String.valueOf(intervalDays));
		}
		return Integer.valueOf(0);
	}

	//only used for homepage hotel checkin and check out date view
	public static String formateDateOffset(final Date baseDate, final int offestDays)
	{
		final Calendar c = Calendar.getInstance();
		c.setTime(baseDate);
		c.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH) + offestDays);
		return formatDate(c.getTime(), "yyyy-MM-dd");
	}

	public static Date getDateOffest(final Date baseDate, final int offestDays)
	{
		final Calendar c = Calendar.getInstance();
		c.setTime(baseDate);
		c.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH) + offestDays);
		return c.getTime();
	}


	public static String formatDate(final Date date, final String format)
	{
		final SimpleDateFormat myFmt = new SimpleDateFormat(format);
		return myFmt.format(date);
	}
}
