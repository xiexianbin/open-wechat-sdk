package com.qikemi.wechat.api.template.url;

/**
 * 
 * Create Date: 2014年9月19日 下午11:04:59
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class URLSendMsgCreator {

	/**
	 * 获取发送客服消息URL
	 * @param ACCESS_TOKEN
	 * @return
	 */
	public static String getCustomerServiceMsgURL(String ACCESS_TOKEN){
		String url = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=" + ACCESS_TOKEN;
		return url;
	}
	
	/**
	 * 获取高级群发接口URL
	 * @param ACCESS_TOKEN
	 * @return
	 */
	public static String getAdvancedMassInterfaceURL(String ACCESS_TOKEN){
		String url = "https://api.weixin.qq.com/cgi-bin/media/uploadnews?access_token=" + ACCESS_TOKEN;
		return url;
	}
	
	/**
	 * 获取模板消息接口URL
	 * @param ACCESS_TOKEN
	 * @return
	 */
	public static String getTemplateMsgInterfaceURL(String ACCESS_TOKEN){
		String url = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=" + ACCESS_TOKEN;
		return url;
	}
}
