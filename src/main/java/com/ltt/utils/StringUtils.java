package com.ltt.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	/**
	 * 
	 * @Title: haveValue 
	 * @Description: 判断原字符串是否有值，空引号也算没值
	 * @param str
	 * @return
	 * @return: boolean
	 */
	public static boolean haveValue(String str) {
		return !(str == null || str.trim().equals(""));
	}
	/**
	 * 
	 * @Title: isMobile 
	 * @Description: 验证手机号码
	 * @return
	 * @return: boolean
	 */
	public static boolean isMobile(String str) {
		String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		return matcher.find();
	}
	/**
	 * 
	 * @Title: isEmial 
	 * @Description: 验证邮箱
	 * @param str
	 * @return
	 * @return: boolean
	 */
	public static boolean isEmial(String str) {
		String regex = "^\\w+([-+.]\\w+)*@\\w+([-.]\\\\w+)*\\.\\w+([-.]\\w+)*$";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(str);
		return matcher.find();
		
	}
}
