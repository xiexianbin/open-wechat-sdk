package com.qikemi.wechat.base.utils;

import java.util.UUID;

public class UUIDUtils {

	/**
	 * create an UUID 
	 * @return
	 */
	public String getUUID(){
		return UUID.randomUUID().toString();
	}
}
