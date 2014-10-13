package com.qikemi.wechat.api.service;

import org.apache.log4j.Logger;

import com.qikemi.packages.xmlJsonAndJavaBean.JavaBean2Xml;
import com.qikemi.wechat.api.constant.WechatReqMsgTypeConstant;
import com.qikemi.wechat.api.entity.message.request.TextMessage;
import com.qikemi.wechat.api.entity.message.response.ResTextMessage;

/**
 * Response Convert 2 XML 
 * Create Date: 2014年10月12日 下午9:00:55
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class ResponseConvert2XMLService {
	
	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(ResponseConvert2XMLService.class);

	public ResponseConvert2XMLService() {
		super();
	}

	public String getTextMessage(TextMessage reqTextMessage, String content){
		ResTextMessage resTextMessage = new ResTextMessage();
		resTextMessage.setFromUserName(reqTextMessage.getToUserName());
		resTextMessage.setToUserName(reqTextMessage.getFromUserName());
		resTextMessage.setContent(content);
		resTextMessage.setCreateTime(System.currentTimeMillis()/1000);
		resTextMessage.setMsgType(WechatReqMsgTypeConstant.TEXT);
		return JavaBean2Xml.convert2Xml(resTextMessage, "xml");
	}
	
	
}
