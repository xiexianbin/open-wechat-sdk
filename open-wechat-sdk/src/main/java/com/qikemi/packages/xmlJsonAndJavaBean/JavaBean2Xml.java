package com.qikemi.packages.xmlJsonAndJavaBean;

import com.qikemi.packages.xmlJsonAndJavaBean.xstream.XstreamUtil;
import com.thoughtworks.xstream.XStream;

/**
 * 
 * Create Date: 2014年9月28日 下午8:24:06
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class JavaBean2Xml {

	public static String convert2Xml(Object object){
		XStream xstream = XstreamUtil.getXStream();
		return xstream.toXML(object);
	}
	
	public static String convert2Xml(Object object, String root){
		XStream xstream = XstreamUtil.getXStream();
		xstream.alias(root, object.getClass());
		return xstream.toXML(object);
	}
}
