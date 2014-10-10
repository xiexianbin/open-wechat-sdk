package com.qikemi.packages.encrypt.base64encrypt;

/**
 * Base64Encrpt 加密与解密的工具类
 * 
 * @description 本程序用于来自谢先斌毕业论文，如有使用请联系作 者，注明出处。
 * @URL 代码地址：http://github.com/openRDF/rdf_fronts
 * @rdf com.openrdf.utils
 * @dateTime 2014-2-27
 * @author XieXianbin
 * @email a.b@hotmail.com
 *
 */

public class Base64Encrpt {
	// 加密字符串
	private final static String encryptKey = "!qa#2.D3sSd3E/234=";
	// 声明实例化
	private static Encrypt encrypt = null;

	public Base64Encrpt() {
		// 第一次调用时实例化encrypt
		if (encrypt == null) {
			encrypt = new Encrypt();
			encrypt.setKey(encryptKey);
		}
	}

	// 加密
	public String encrptString(String enString) {
		// 加密
		encrypt.setEncString(enString);
		// 返回
		return encrypt.getEncString();
	}

	// 解密
	public String decryptString(String deString) {
		// 解密
		encrypt.setDesString(deString);
		// 返回
		return encrypt.getDesString();
	}
}