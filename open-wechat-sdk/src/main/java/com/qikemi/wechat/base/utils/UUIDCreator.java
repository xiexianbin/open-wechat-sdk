package com.qikemi.wechat.base.utils;

import java.util.UUID;

/**
 * 
 * Create Date: 2014年8月20日 下午10:28:16
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class UUIDCreator {

	/**
	 * create an UUID 
	 * @return
	 */
	public String getUUID(){
		return UUID.randomUUID().toString();
	}
}
