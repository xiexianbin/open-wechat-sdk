package com.qikemi.wechat.base.utils;

/**
 * 
 * Create Date: 2014年9月22日 下午8:00:55
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class StringUtil {

	public static boolean isEmpty(Object value) {
		return (null == value || "".equals(value));
	}

	public static boolean isNotEmpty(Object value) {
		return (!isEmpty(value));
	}
}
