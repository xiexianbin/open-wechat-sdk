package com.qikemi.wechat.api.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.qikemi.wechat.api.constant.WechatEventTypeConstant;
import com.qikemi.wechat.api.constant.WechatReqMsgTypeConstant;
import com.qikemi.wechat.api.constant.WechatRespMsgTypeConstant;
import com.qikemi.wechat.api.entity.message.MsgTypeBean;
import com.qikemi.wechat.api.entity.message.request.ReqImageMsg;
import com.qikemi.wechat.api.entity.message.request.ReqLinkMsg;
import com.qikemi.wechat.api.entity.message.request.ReqLocationMsg;
import com.qikemi.wechat.api.entity.message.request.ReqTextMsg;
import com.qikemi.wechat.api.entity.message.request.ReqVideoMsg;
import com.qikemi.wechat.api.entity.message.request.ReqVoiceMsg;
import com.qikemi.wechat.api.entity.message.response.RespImageTextMsg;
import com.qikemi.wechat.api.entity.message.response.baseBean.ImageBean;
import com.qikemi.wechat.api.entity.message.response.baseBean.ImageTextBean;
import com.qikemi.wechat.api.entity.message.response.baseBean.VideoBean;
import com.qikemi.wechat.api.entity.message.response.baseBean.VoiceBean;
import com.qikemi.wechat.api.service.RequestConvert2JavaBeanService;
import com.qikemi.wechat.api.service.ResponseConvert2XMLService;
import com.qikemi.wechat.api.service.SignService;

/**
 * 
 * Create Date: 2014年10月10日 下午9:42:26 Author XieXianbin<a.b@hotmail.com> Source
 * Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class WechatServlet extends HttpServlet {

	private static final long serialVersionUID = 1787849341385711015L;
	private static Logger logger = Logger.getLogger(WechatServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		resp.setContentType("text/html;charset=utf-8");
		try {
			req.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			logger.error("req编码错误：" + e1.getMessage());
		}
		resp.setCharacterEncoding("utf-8");

		// 随机字符串
		String echostr = req.getParameter("echostr");
		PrintWriter out = null;
		try {
			out = resp.getWriter();
			// 通过检验signature对请求进行校验，若校验成功则原样返回echostr，否则接入失败
			if (SignService.checkSignature(req)) {
				out.print(echostr);
				logger.info("doGet() 配置成功.");
			} else {
				out.print("Error Configure.");
			}
			out.close();
		} catch (IOException e) {
			logger.error("doGet() IOException -->" + e.getMessage());
		} catch (Exception e) {
			out.print("Missing Parameters.");
			logger.error("doGet() 参数缺失Exception -->" + e.getMessage());
		} finally {
			out.flush();
			out.close();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 处理编码 
		try {
			req.setCharacterEncoding("utf-8");
			resp.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			logger.error("req编码错误：" + e1.getMessage());
		}
		// inputStream and PrintWriter 
		InputStream in = req.getInputStream();
		PrintWriter out = resp.getWriter();
		// 初始化RequestConvertService/ResponseConvertService 
		RequestConvert2JavaBeanService requestConvert2JavaBeanService = new RequestConvert2JavaBeanService(in);
		ResponseConvert2XMLService responseConvert2XMLService = new ResponseConvert2XMLService();
		// 接受信息 
		MsgTypeBean msgTypeBean = (MsgTypeBean) requestConvert2JavaBeanService.convert(MsgTypeBean.class);
//		logger.debug(msgTypeBean.toString());
		// 获取消息类型 
		String msgType = msgTypeBean.getMsgType();
		// 相应服务器接受到消息 
		out.print("");
		out.flush();
		/**
		 * 1 文本消息
		 * 2 图片消息
		 * 3 语音消息
		 * 4 视频消息
		 * 5 地理位置消息
		 * 6 链接消息
		 * 7 事件 
		 */
		switch(msgType){
			case WechatReqMsgTypeConstant.TEXT:
				// 1 文本消息
				ReqTextMsg textMsg = (ReqTextMsg) requestConvert2JavaBeanService.convert(ReqTextMsg.class);
				logger.debug(textMsg.toString());
//				String content = "你好";
//				String resText = responseConvert2XMLService.getTextMsg(msgTypeBean, content);
				List<ImageTextBean> itbs = new ArrayList<ImageTextBean>();
				for(int i=0; i<1; i++){
					ImageTextBean itb = new ImageTextBean("title", "description", "http://www.baidu.com/img/bdlogo.png", "http://www.baidu.com/img/bdlogo.png");
					itbs.add(itb);
				}
				String imageText = responseConvert2XMLService.getImageTextMsg(msgTypeBean, itbs);
				
				logger.debug(imageText.toString());
				out.print(imageText);
				out.flush();
				break;
			case WechatReqMsgTypeConstant.IMAGE:
				// 2 图片消息
				ReqImageMsg imageMsg = (ReqImageMsg) requestConvert2JavaBeanService.convert(ReqImageMsg.class);
				logger.debug(imageMsg.toString());
				
				String resImage = responseConvert2XMLService.getImageMsg(msgTypeBean, new ImageBean(imageMsg.getMediaId()));
				logger.debug(resImage.toString());
				out.print(resImage);
				out.flush();
				break;
			case WechatReqMsgTypeConstant.VOICE:
				// 3 语音消息
				ReqVoiceMsg voiceMsg = (ReqVoiceMsg) requestConvert2JavaBeanService.convert(ReqVoiceMsg.class);
				logger.debug(voiceMsg.toString());
				
				String resVoice = responseConvert2XMLService.getVoiceMsg(msgTypeBean, new VoiceBean(voiceMsg.getMediaId()));
				logger.debug(resVoice.toString());
				out.print(resVoice);
				out.flush();
				break;
			case WechatReqMsgTypeConstant.VIDEO:
				// 4 视频消息
				ReqVideoMsg videoMsg = (ReqVideoMsg) requestConvert2JavaBeanService.convert(ReqVideoMsg.class); 
				logger.debug(videoMsg.toString());
				
				String resVideo = responseConvert2XMLService.getVideoMsg(msgTypeBean, new VideoBean(videoMsg.getMediaId(), "title", "description"));
				logger.debug(resVideo.toString());
				out.print(resVideo);
				out.flush();
				break;
			case WechatReqMsgTypeConstant.LOCATION:
				// 5 地理位置消息
				ReqLocationMsg locationMsg = (ReqLocationMsg) requestConvert2JavaBeanService.convert(ReqLocationMsg.class);
				logger.debug(locationMsg.toString());
				
				String resText = responseConvert2XMLService.getTextMsg(msgTypeBean, locationMsg.getLabel() + locationMsg.getLocation_X() + locationMsg.getLocation_Y() + locationMsg.getScale());
				logger.debug(resText.toString());
				out.print(resText);
				out.flush();
				break;
			case WechatReqMsgTypeConstant.LINK:
				// 6 链接消息
				ReqLinkMsg linkMsg = (ReqLinkMsg) requestConvert2JavaBeanService.convert(ReqLinkMsg.class);
				logger.debug(linkMsg.toString());
				
				
				
				break;
			case WechatReqMsgTypeConstant.EVENT:
				/**
				 * 事件消息
				 * 1 关注/取消关注事件
				 * 2 扫描带参数二维码事件
				 * 3 上报地理位置事件
				 * 4 自定义菜单事件
				 * 5 点击菜单拉取消息时的事件推送
				 * 6 点击菜单跳转链接时的事件推送
				 */
				String event = msgTypeBean.getEvent();
				switch (event) {
				case WechatEventTypeConstant.SUBSCRIBE:
					logger.info(event);
					break;
				case WechatEventTypeConstant.UNSUBSCRIBE:
					
					break;
				case WechatEventTypeConstant.SCAN:
					
					break;
				case WechatEventTypeConstant.LOCATION:
					
					break;
				case WechatEventTypeConstant.CLICK:
					
					break;
				case WechatEventTypeConstant.VIEW:
					
					break;
				default:
					logger.warn("Wechat Interface Accept UnKnow Event -> " + msgTypeBean.toString());
					break;
				}
				// 跳出外部switch 
				break;
			default:
				// 未知事件消息 
				logger.warn("Wechat Interface Accept UnKnow MsgType -> " + msgTypeBean.toString());
		}
		
		
		
	}
}
