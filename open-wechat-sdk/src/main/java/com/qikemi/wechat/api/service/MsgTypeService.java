package com.qikemi.wechat.api.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.qikemi.packages.xmlJsonAndJavaBean.Xml2JavaBean;
import com.qikemi.wechat.api.entity.message.MsgTypeBean;

/**
 * get message from request 
 * Create Date: 2014年10月12日 下午5:58:32
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class MsgTypeService {

	private static Object lock = new Object();
	private static Logger logger = Logger.getLogger(MsgTypeService.class);
	
	/**
	 * get msgTypeBean 
	 * @param req
	 * @return
	 * @throws IOException
	 */
	public static MsgTypeBean get(HttpServletRequest req) throws IOException{
		synchronized (lock) {
			InputStream in = req.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in, "utf-8"));
			StringBuffer sb = new StringBuffer();
			sb.append("Wechat Interface Accept XML -->\r\n");
			String line = null;
			while((line = reader.readLine())!=null){
				sb.append(line + "\r\n");
			}
			logger.debug(sb.toString());
			MsgTypeBean msgTypeBean = (MsgTypeBean) Xml2JavaBean.convert2JavaBean(sb.toString(), MsgTypeBean.class);
			return msgTypeBean;
		}
	}
}
