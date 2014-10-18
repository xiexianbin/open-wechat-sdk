package com.qikemi.wechat.api.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.qikemi.packages.xmlJsonAndJavaBean.JavaBean2Xml;
import com.qikemi.wechat.api.constant.WechatReqMsgTypeConstant;
import com.qikemi.wechat.api.constant.WechatRespMsgTypeConstant;
import com.qikemi.wechat.api.entity.message.MsgTypeBean;
import com.qikemi.wechat.api.entity.message.response.RespImageMsg;
import com.qikemi.wechat.api.entity.message.response.RespImageTextMsg;
import com.qikemi.wechat.api.entity.message.response.RespTextMsg;
import com.qikemi.wechat.api.entity.message.response.RespVideoMsg;
import com.qikemi.wechat.api.entity.message.response.RespVoiceMsg;
import com.qikemi.wechat.api.entity.message.response.baseBean.ImageBean;
import com.qikemi.wechat.api.entity.message.response.baseBean.ImageTextBean;
import com.qikemi.wechat.api.entity.message.response.baseBean.VideoBean;
import com.qikemi.wechat.api.entity.message.response.baseBean.VoiceBean;

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
	public String getTextMsg(MsgTypeBean msgTypeBean, String content){
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
	public String getImageMsg(MsgTypeBean msgTypeBean, ImageBean imageBean){
		RespImageMsg respImageMsg = new RespImageMsg();
		respImageMsg.setFromUserName(msgTypeBean.getToUserName());
		respImageMsg.setToUserName(msgTypeBean.getFromUserName());
		
		respImageMsg.setImageBeans(imageBean);
		respImageMsg.setCreateTime(System.currentTimeMillis()/1000);
		respImageMsg.setMsgType(WechatReqMsgTypeConstant.IMAGE);
		return JavaBean2Xml.convert2Xml(respImageMsg, "xml");
	}

	/**
	 * get Voice Message xml 
	 * @param msgTypeBean
	 * @param imageBean
	 * @return
	 */
	public String getVoiceMsg(MsgTypeBean msgTypeBean, VoiceBean voiceBean) {
		RespVoiceMsg respVoiceMsg = new RespVoiceMsg();
		respVoiceMsg.setFromUserName(msgTypeBean.getToUserName());
		respVoiceMsg.setToUserName(msgTypeBean.getFromUserName());
		
		respVoiceMsg.setVoiceBean(voiceBean);
		respVoiceMsg.setCreateTime(System.currentTimeMillis()/1000);
		respVoiceMsg.setMsgType(WechatReqMsgTypeConstant.VOICE);
		return JavaBean2Xml.convert2Xml(respVoiceMsg, "xml");
	}

	/**
	 * get Video Message xml 
	 * @param msgTypeBean
	 * @param videoBean
	 * @return
	 */
	public String getVideoMsg(MsgTypeBean msgTypeBean, VideoBean videoBean) {
		RespVideoMsg respVideoMsg = new RespVideoMsg();
		respVideoMsg.setFromUserName(msgTypeBean.getToUserName());
		respVideoMsg.setToUserName(msgTypeBean.getFromUserName());
		
		respVideoMsg.setVideoBean(videoBean);
		respVideoMsg.setCreateTime(System.currentTimeMillis()/1000);
		respVideoMsg.setMsgType(WechatReqMsgTypeConstant.VIDEO);
		return JavaBean2Xml.convert2Xml(respVideoMsg, "xml");
	}
	
	public String getImageTextMsg(MsgTypeBean msgTypeBean, List<ImageTextBean> imageTextList){
		RespImageTextMsg imageTextMsg = new RespImageTextMsg();
		imageTextMsg.setToUserName(msgTypeBean.getFromUserName());
		imageTextMsg.setFromUserName(msgTypeBean.getToUserName());
		imageTextMsg.setArticleCount(1);
		imageTextMsg.setCreateTime(System.currentTimeMillis() / 1000);
		imageTextMsg.setMsgType(WechatRespMsgTypeConstant.NEWS);
		imageTextMsg.setImgTextList(imageTextList);
		return JavaBean2Xml.convert2Xml(imageTextMsg, "xml");
	}
}
