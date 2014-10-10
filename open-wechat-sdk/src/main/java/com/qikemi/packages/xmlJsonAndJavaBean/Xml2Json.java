package com.qikemi.packages.xmlJsonAndJavaBean;

import org.json.JSONObject;
import org.json.XML;

/**
 * 
 * Create Date: 2014年9月28日 下午8:04:12
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class Xml2Json {
	
	// JSON格式缩进空格数
	public static int PRETTY_PRINT_INDENT_FACTOR = 4;
	
	/**
	 * 
	 * @param xml
	 * @return
	 */
	public static JSONObject conert2JSONObject(String xml){
		JSONObject xmlJSONObj = XML.toJSONObject(xml);
		return xmlJSONObj;
	}
	
	/**
	 * 
	 * @param xml
	 * @return
	 */
	public static String conert2String(String xml){
		JSONObject xmlJSONObj = XML.toJSONObject(xml);
		String jsonString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
		return jsonString;
	}
}
