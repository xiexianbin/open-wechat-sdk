package com.qikemi.wechat.api;

/**
 * version info
 * 
 * Create Date: 2014年8月20日 下午9:40:55
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public final class VERSION {

	public final static Integer MajorVersion = 0;
	public final static Integer MinorVersion = 0;
	public final static Integer RevisionVersion = 1;
	
	public static String getVersionNumber(){
		return VERSION.MajorVersion + "." + VERSION.MinorVersion + "." + VERSION.RevisionVersion;
	}
}