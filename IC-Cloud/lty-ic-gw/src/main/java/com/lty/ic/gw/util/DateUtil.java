package com.lty.ic.gw.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat(
			"yyyyMMdd");
	private static final SimpleDateFormat timeFormat = new SimpleDateFormat(
			"HHmmss");
	
	public static String getDateStr(Date date) {
		if (date != null) {
			return dateFormat.format(date);
		}
		return "00000000";
	}

	public static String getTimeStr(Date date) {
		if (date != null) {
			return timeFormat.format(date);
		}
		return "000000";
	}
}
