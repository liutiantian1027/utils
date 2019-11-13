package com.ltt.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ltt.utils.StringUtils;

public class TestString {
	@Test
	public void testIsBlank() {
		//断言 真
		assertTrue(StringUtils.isBlank("  "));
	}
	@Test
	public void testIsBlank2() {
		//断言 假
		//assertFalse(StringUtils.isBlank("  "));
	}
	@Test
	public void testHaveValue() {
		assertFalse(StringUtils.haveValue("  "));
	}
	@Test
	public void testRandom() {
		String str = StringUtils.getRandomStr(10);
		System.out.println(" s is:"+ str);
	}
	@Test
	public void testRam() {
		String str2 = StringUtils.getRandomStr2(25);
		System.out.println("str 是："+str2+" 长度是："+str2.length());
		
	}
	@Test
	public void isNumber() {
		//断言 真
		assertTrue(StringUtils.isNumber("12.8"));
	}
}	
