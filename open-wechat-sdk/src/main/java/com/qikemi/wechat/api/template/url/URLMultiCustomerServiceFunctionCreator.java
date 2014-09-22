package com.qikemi.wechat.api.template.url;

/**
 * 多客服 
 * Create Date: 2014年9月19日 下午11:52:11
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class URLMultiCustomerServiceFunctionCreator {

	/**
	 * 获取客服聊天记录接口URL
	 * @param ACCESS_TOKEN
	 * @return
	 */
	public static String getCustomerServiceRecordURL(String ACCESS_TOKEN){
		return "https://api.weixin.qq.com/cgi-bin/customservice/getrecord?access_token=" + ACCESS_TOKEN;
	}
	
}
