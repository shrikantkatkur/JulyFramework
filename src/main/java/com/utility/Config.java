package com.utility;

public class Config {
	
	public String readProperty(String key) {
		String baseDir=System.getProperty("user.dir");
		String filePath=baseDir+"/src/main/resources/config.properties";
		PropUtil prop= new PropUtil(filePath);
		String value=prop.readPropertyFile(filePath, key);
		return value;
	}
	
	public String getbrowserName() {
		return readProperty("browserName");
	}
	public String getUrl() {
		return readProperty("url");
	}
	public String getUserName() {
		return readProperty("userName");
	}
	public String getPassword() {
		return readProperty("password");
	}

}
