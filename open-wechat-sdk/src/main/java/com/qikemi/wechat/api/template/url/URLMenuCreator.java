package com.qikemi.wechat.api.template.url;

/**
 * 
 * Create Date: 2014年9月20日 下午2:34:51
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class URLMenuCreator {

	/**
	 * 获取自定义菜单创建接口URL
	 * @param ACCESS_TOKEN
	 * @return
	 */
	public static String getCreatMenuURL(String ACCESS_TOKEN){
		return "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=" + ACCESS_TOKEN;
	}
	
	/**
	 * 获取自定义菜单查询接口URL
	 * @param ACCESS_TOKEN
	 * @return
	 */
	public static String getCurrentMenuURL(String ACCESS_TOKEN){
		return "https://api.weixin.qq.com/cgi-bin/menu/get?access_token=" + ACCESS_TOKEN;
	}
	
	/**
	 * 获取自定义菜单删除接口URL
	 * @param ACCESS_TOKEN
	 * @return
	 */
	public static String getDeleteMenuURL(String ACCESS_TOKEN){
		return "https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=" + ACCESS_TOKEN;
	}
}
