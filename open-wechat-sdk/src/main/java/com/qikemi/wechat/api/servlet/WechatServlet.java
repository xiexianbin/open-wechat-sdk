package com.qikemi.wechat.api.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

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

		super.doPost(req, resp);
	}

}
