package com.ltt.utils;
/**
 * 
 * @ClassName: StringUtils 
 * @Description: 字符串工具类
 * @author:，liutiantian
 * @date: 2019年11月8日 下午1:14:44
 */
public class StringUtils {
	/**
	 * 
	 * @Title: isBlank 
	 * @Description: 判断字符串是否为空
	 * @param str
	 * @return
	 * @return: boolean
	 */
	public static boolean isBlank(String str) {
		//trim是去掉两侧的空格
		return (str == null|| str.trim().equals(""));
		
	}
}
