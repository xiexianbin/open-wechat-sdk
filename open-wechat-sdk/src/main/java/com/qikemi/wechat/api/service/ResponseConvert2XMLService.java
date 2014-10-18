package com.qikemi.wechat.api.service;

import org.apache.log4j.Logger;

import com.qikemi.packages.xmlJsonAndJavaBean.JavaBean2Xml;
import com.qikemi.wechat.api.constant.WechatReqMsgTypeConstant;
import com.qikemi.wechat.api.entity.message.MsgTypeBean;
import com.qikemi.wechat.api.entity.message.response.RespImageMsg;
import com.qikemi.wechat.api.entity.message.response.RespTextMsg;
import com.qikemi.wechat.api.entity.message.response.baseBean.ImageBean;

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

	/**
	 * get Text Message xml 
	 * @param reqTextMessage
	 * @param content
	 * @return
	 */
	public String getTextMessage(MsgTypeBean msgTypeBean, String content){
		RespTextMsg resTextMessage = new RespTextMsg();
		resTextMessage.setFromUserName(msgTypeBean.getToUserName());
		resTextMessage.setToUserName(msgTypeBean.getFromUserName());
		resTextMessage.setContent(content);
		resTextMessage.setCreateTime(System.currentTimeMillis()/1000);
		resTextMessage.setMsgType(WechatReqMsgTypeConstant.TEXT);
		return JavaBean2Xml.convert2Xml(resTextMessage, "xml");
	}
	
	/**
	 * get Image Message xml 
	 * @param msgTypeBean
	 * @param image
	 * @return
	 */
	public String getImageMessage(MsgTypeBean msgTypeBean, ImageBean imageBean){
		RespImageMsg respImageMsg = new RespImageMsg();
		respImageMsg.setFromUserName(msgTypeBean.getToUserName());
		respImageMsg.setToUserName(msgTypeBean.getFromUserName());
		
		respImageMsg.setImageBeans(imageBean);
		respImageMsg.setCreateTime(System.currentTimeMillis()/1000);
		respImageMsg.setMsgType(WechatReqMsgTypeConstant.IMAGE);
		return JavaBean2Xml.convert2Xml(respImageMsg, "xml");
	}
}
