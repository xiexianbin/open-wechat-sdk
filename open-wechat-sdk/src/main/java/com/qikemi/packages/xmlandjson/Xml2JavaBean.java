package com.qikemi.packages.xmlandjson;

import org.json.JSONObject;
import org.json.XML;

import com.alibaba.fastjson.JSON;

/**
 * 
 * Create Date: 2014年9月28日 下午8:12:40
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class Xml2JavaBean {

	/**
	 * 
	 * @param xml
	 * @param Object
	 * @return
	 */
	public static Object convert2JavaBean(String xml, Class<?> c){
		JSONObject xmlJSONObj = XML.toJSONObject(xml);
		JSONObject sub = (JSONObject) xmlJSONObj.get("xml");
		return JSON.parseObject(sub.toString(), c);
	}
}
