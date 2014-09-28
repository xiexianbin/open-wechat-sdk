package com.qikemi.packages.xmlandjson;

import org.json.JSONObject;
import org.json.XML;

/**
 * 
 * Create Date: 2014年9月28日 下午8:24:06
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class JavaBean2Xml {

	public static String convert2Xml(Object object){
		JSONObject o = new JSONObject(object);
		return XML.toString(o);
	}
}
