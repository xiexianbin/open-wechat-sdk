package com.qikemi.wechat.api.url;

/**
 * 
 * Create Date: 2014年9月19日 下午10:25:38
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class URLBaseCreator {
	
	private static String GRANT_TYPE = "client_credential";
	
	/**
	 * 获取token
	 * @param grant_type
	 * 				是	 获取access_token填写client_credential
	 * @param APPID
	 * 				是	 第三方用户唯一凭证
	 * @param APPSECRET
	 * 				是	 第三方用户唯一凭证密钥，即appsecret
	 * @return
	 */
	public static String getAccessTokenURL(String grant_type, String APPID, String APPSECRET){
		String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=" + grant_type + "&appid=" + APPID + "&secret=" + APPSECRET;
		return url;
	}
	
	/**
	 * 获取token
	 * @param APPID
	 * 				是	 第三方用户唯一凭证
	 * @param APPSECRET
	 * 				是	 第三方用户唯一凭证密钥，即appsecret
	 * @return
	 */
	public static String getAccessTokenURL(String APPID, String APPSECRET){
		String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=" + URLBaseCreator.GRANT_TYPE + "&appid=" + APPID + "&secret=" + APPSECRET;
		return url;
	}
}
