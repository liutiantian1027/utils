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
		//断言 真
		assertFalse(StringUtils.isBlank("aaa"));
	}
}	
