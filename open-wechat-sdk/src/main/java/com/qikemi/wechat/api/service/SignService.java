package com.qikemi.wechat.api.service;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import com.qikemi.packages.encrypt.md5.MD5OrSHA1Encrypt;
import com.qikemi.wechat.api.constant.DefaultWechatAccount;

/**
 * 验证签名
 * 
 * Create Date: 2014年9月28日 下午10:16:55 Author XieXianbin<a.b@hotmail.com> Source
 * Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class SignService {

	/**
	 * 认证微信签名
	 * 
	 * @param request
	 * @return 是否成功
	 */
	public static boolean checkSignature(HttpServletRequest request) {
		// 微信加密签名，signature结合了开发者填写的token参数和请求中的timestamp参数、nonce参数。
		String signature = request.getParameter("signature");
		// 时间戳
		String timestamp = request.getParameter("timestamp");
		// 随机数
		String nonce = request.getParameter("nonce");

		// 加密/校验流程如下：
		// 1. 将token、timestamp、nonce三个参数进行字典序排序
		String[] arr = new String[] { DefaultWechatAccount.TOKEN, timestamp,
				nonce };
		Arrays.sort(arr);
		// 2. 将三个参数字符串拼接成一个字符串进行sha1加密
		StringBuilder content = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			content.append(arr[i]);
		}
		// 将三个参数字符串拼接成一个字符串进行sha1加密
		MD5OrSHA1Encrypt md5OrSHA1Encrypt = new MD5OrSHA1Encrypt();
		@SuppressWarnings("static-access")
		String tmpStr = md5OrSHA1Encrypt.sha1(content.toString());
		// 3. 开发者获得加密后的字符串可与signature对比，标识该请求来源于微信
		return tmpStr != null ? tmpStr.equalsIgnoreCase(signature) : false;
	}

}
