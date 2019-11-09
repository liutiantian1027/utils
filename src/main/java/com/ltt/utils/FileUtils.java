package com.ltt.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: FileUtils 
 * @Description: 
 * @author:，liutiantian
 * @date: 2019年11月9日 上午8:52:10
 */
public class FileUtils {
	public static List<String> reaFile(String fileName) throws IOException{
		List<String> list = new ArrayList<String>();
	
		InputStream ips = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(ips,"GBK");
		BufferedReader reader = new BufferedReader(isr);
		String readLine = reader.readLine();
		while(readLine!=null) {
			list.add(readLine);
			readLine=reader.readLine();
		}
		return list;
		
	}
}
