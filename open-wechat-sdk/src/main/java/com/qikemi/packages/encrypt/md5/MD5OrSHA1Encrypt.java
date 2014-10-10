package com.qikemi.packages.encrypt.md5;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.log4j.Logger;

/**
 * MD5 Encrypt 
 * Create Date: 2014年10月8日 下午10:24:42 
 * Author XieXianbin<a.b@hotmail.com> 
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class MD5OrSHA1Encrypt {
	
	private static Logger logger = Logger.getLogger(MD5OrSHA1Encrypt.class);

	/**
	 * 对str采用md5算法加密
	 * 
	 * @param str
	 * @return
	 */
	public static String md5(String str) {
		return encrypt(str, "md5");
	}

	/**
	 * 对str采用sha-1算法加密
	 * 
	 * @param str
	 * @return
	 */
	public static String sha1(String str) {
		return encrypt(str, "sha-1");
	}

	/**
	 * 二次加密，对str先采用sha1算法加密在采用md5算法加密
	 * 
	 * @param str
	 * @return
	 */
	public static String sha1AndMd5(String str) {
		return md5(sha1(str));
	}

	/**
	 * 二次加密，对str先采用md5算法加密在采用sha1算法加密
	 * 
	 * @param str
	 * @return
	 */
	public static String md5AndSha1(String str) {
		return sha1(md5(str));
	}

	/**
	 * md5算法或者sha-1算法加密，当algorithmName为空时，默认采用md5算法加密
	 * 
	 * @param str
	 *            要加密的内容
	 * @param algorithmName
	 *            加密算法名称：md5或者sha-1，不区分大小写
	 * @return
	 */
	private static String encrypt(String str, String algorithmName) {
		if (str == null || "".equals(str.trim())) {
			logger.warn("encrypt str is null or ''.");
			throw new IllegalArgumentException("encrypt str is null or ''.");
		}
		if (algorithmName == null || "".equals(algorithmName.trim())) {
			algorithmName = "md5";
		}
		String encryptText = null;
		try {
			MessageDigest m = MessageDigest.getInstance(algorithmName);
			m.update(str.getBytes("UTF8"));
			byte s[] = m.digest();
			return hex(s);
		} catch (NoSuchAlgorithmException e) {
			logger.warn("NoSuchAlgorithmException -> Algorithm Must be md5 Or sha1. e -> " + e.getMessage());
		} catch (UnsupportedEncodingException e) {
			logger.warn("UnsupportedEncodingException -> " + e.getMessage());
		}
		return encryptText;
	}

	/**
	 * 返回十六进制字符串
	 * 
	 * @param arr
	 * @return
	 */
	private static String hex(byte[] arr) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; ++i) {
			sb.append(Integer.toHexString((arr[i] & 0xFF) | 0x100).substring(1,
					3));
		}
		return sb.toString();
	}
}
