package com.qikemi.wechat.api.constant;

import com.qikemi.wechat.api.utils.WechatProperties;

/**
 * WECHAT Default Account Configure
 * Create Date: 2014年9月27日 下午9:32:58
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class DefaultWechatAccount {
	
	/**
	 * 与接口配置信息中的Token要一致
	 */
	public static String TOKEN = WechatProperties.getWechatProperties().getProperty(WechatProperties.TOKEN);
	
	/**
	 * 第三方用户唯一凭证
	 */
	public static String APPID = WechatProperties.getWechatProperties().getProperty(WechatProperties.APPID);
	
	/**
	 * 第三方用户唯一凭证密钥
	 */
	public static String APPSECRET = WechatProperties.getWechatProperties().getProperty(WechatProperties.APPSECRET);
	
}
