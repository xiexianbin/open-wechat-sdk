package com.qikemi.packages.xmlandjson;

import com.alibaba.fastjson.JSONObject;

/**
 * 
 * Create Date: 2014年9月28日 下午8:21:49
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class JavaBean2Json {

	public static String convert2Json(Object object){
		return JSONObject.toJSONString(object);
	}
}
