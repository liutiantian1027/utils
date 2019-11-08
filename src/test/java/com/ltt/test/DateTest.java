package com.ltt.test;

import java.util.Date;

import org.junit.Test;

import com.ltt.utils.DateUtils;

public class DateTest {
	@Test
	public void getDate() {
		DateUtils.compare(null, new Date());
	}
}
