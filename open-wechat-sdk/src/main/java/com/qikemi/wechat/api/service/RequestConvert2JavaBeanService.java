package com.qikemi.wechat.api.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.log4j.Logger;

import com.qikemi.packages.xmlJsonAndJavaBean.Xml2JavaBean;
import com.qikemi.wechat.api.entity.message.MsgTypeBean;
import com.qikemi.wechat.api.entity.message.request.ReqImageMsg;
import com.qikemi.wechat.api.entity.message.request.ReqTextMsg;

/**
 * get Accept message Convert 2 JavaBean 
 * Create Date: 2014年10月12日 下午5:58:32
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class RequestConvert2JavaBeanService {

	private static Logger logger = Logger.getLogger(RequestConvert2JavaBeanService.class);
	private String xml = "";
	
	/**
	 * 
	 * @param in
	 */
	public RequestConvert2JavaBeanService(InputStream in) {
		StringBuffer sb = new StringBuffer();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(in, "utf-8"));
			sb.append("Wechat Interface Accept XML -->\r\n");
			String line = null;
				while((line = reader.readLine())!=null){
					sb.append(line + "\r\n");
				}
			logger.debug(sb.toString());
		} catch (UnsupportedEncodingException e1) {
			logger.error("UnsupportedEncodingException --> " + e1.getMessage());
		} catch (IOException e) {
			logger.error("IOException -->" + e.getMessage());
		}
		this.xml = sb.toString();
	}

	/**
	 * get msgTypeBean 
	 * @return
	 */
	public MsgTypeBean getMsgTypeBean(){
		return (MsgTypeBean) Xml2JavaBean.convert2JavaBean(this.xml, MsgTypeBean.class);
	}
	
	/**
	 * get Text Message Bean 
	 * @return
	 */
	public ReqTextMsg getTextMessage(){
		return (ReqTextMsg) Xml2JavaBean.convert2JavaBean(this.xml, ReqTextMsg.class);
	}
	
	/**
	 * get Image Message Bean
	 * @return
	 */
	public ReqImageMsg getImageMessage() {
		return (ReqImageMsg) Xml2JavaBean.convert2JavaBean(this.xml, ReqImageMsg.class);
	}
}
