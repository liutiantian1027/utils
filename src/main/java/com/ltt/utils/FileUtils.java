package com.ltt.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
	public static List<String> readLine(String fileName) throws IOException{
		List<String> list = new ArrayList<String>();
		File file = new File(fileName);
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		String str = null;
		while((str=reader.readLine())!=null) {
			list.add(str);
		}
		return list;
		
	}
}
