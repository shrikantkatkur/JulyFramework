package com.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropUtil {
	private String filePath;

	public PropUtil(String file) {
		filePath = file;
	}
	
	public String readPropertyFile(String filePath,String key) {
		FileInputStream fis = null;
		try {
			fis=new FileInputStream(filePath);
		}catch(Exception e){
			e.printStackTrace();
		}
		Properties prop=new Properties();
		try {
			prop.load(fis);
		}catch(Exception e) {
			e.printStackTrace();
		}
		String value=prop.getProperty(key);
		return value;
	}

}
