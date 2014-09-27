package com.qikemi.wechat.api.entity.token;

/**
 * WeChat API access Token bean 
 * 
 * Create Date: 2014年9月27日 下午11:16:24
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class AccessToken {
	
	/**
	 *  获取到的凭证
	 */
	private String access_token;
	
	/**
	 *  凭证有效时间，单位：秒
	 */
	private int expires_in;

	/**             constructor                  **/
	public AccessToken() {
		super();
	}

	public AccessToken(String access_token, int expires_in) {
		super();
		this.access_token = access_token;
		this.expires_in = expires_in;
	}

	/**           getters and setters            **/
	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public int getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}

	@Override
	public String toString() {
		return "AccessToken [access_token=" + access_token + ", expires_in="
				+ expires_in + "]";
	}
	
}