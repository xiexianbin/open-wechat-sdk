package com.qikemi.wechat.api.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * 微信公众号默认配置
 * @author XieXianbin
 * @version 1.0
 * 
 */
public class WechatProperties {
	
	private Logger logger = Logger.getLogger(WechatProperties.class);
	
	// WeChat Configure 
	public static String TOKEN = "TOKEN";
	public static String APPID = "APPID";
	public static String APPSECRET = "APPSECRET";
	
	public static Properties wechatProperties;
	
	public static Properties getWechatProperties() {
		if(null == wechatProperties){
			WechatProperties properties = new WechatProperties();
			wechatProperties = properties.getProperties();
		}
		return wechatProperties;
	}
	
	private Properties getProperties(){
		try {
	        InputStream in = this.getClass().getResourceAsStream("/wechat.properties");  
			// 加载属性文件
			Properties properties = new Properties();
			properties.load(in);
			in.close();
			return properties;
		} catch (FileNotFoundException e) {
			logger.warn("FileNotFoundException: ->" + e.getMessage());
		} catch (IOException e) {
			logger.warn("IOException: ->" + e.getMessage());
		}
		return null;
	}
}
