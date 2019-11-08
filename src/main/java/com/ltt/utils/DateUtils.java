package com.ltt.utils;

import java.util.Date;

public class DateUtils {
	public static int compare(Date date1,Date date2) {
		if(date1== null || date2== null)
			throw new RuntimeException("参数不能为空");
		
		return date1.compareTo(date2);
		
	}
}
