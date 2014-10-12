package com.qikemi.wechat.api.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.qikemi.wechat.api.constant.WechatEventTypeConstant;
import com.qikemi.wechat.api.constant.WechatReqMsgTypeConstant;
import com.qikemi.wechat.api.entity.message.MsgTypeBean;
import com.qikemi.wechat.api.service.MsgTypeService;
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
			logger.error("doGet() 参数缺失Exception -->" + e.getMessage());
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
		// 接受信息 
		MsgTypeBean msgTypeBean = MsgTypeService.get(req);
		// 获取消息类型 
		String msgType = msgTypeBean.getMsgType();
		
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
				break;
			case WechatReqMsgTypeConstant.IMAGE:
				// 2 图片消息
				break;
			case WechatReqMsgTypeConstant.VOICE:
				// 3 语音消息
				break;
			case WechatReqMsgTypeConstant.VIDEO:
				// 4 视频消息
				break;
			case WechatReqMsgTypeConstant.LOCATION:
				// 5 地理位置消息
				break;
			case WechatReqMsgTypeConstant.LINK:
				// 6 链接消息
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
		
		logger.debug(msgTypeBean.toString());
		
		
		super.doPost(req, resp);
	}
}
