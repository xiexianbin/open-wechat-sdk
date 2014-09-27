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
	private String accessToken;
	
	/**
	 *  凭证有效时间，单位：秒
	 */
	private int expiresIn;

	/**             constructor                  **/
	public AccessToken() {
		super();
	}

	public AccessToken(String accessToken, int expiresIn) {
		super();
		this.accessToken = accessToken;
		this.expiresIn = expiresIn;
	}
	/**           getters and setters            **/

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public int getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}

	@Override
	public String toString() {
		return "AccessToken [accessToken=" + accessToken + ", expiresIn="
				+ expiresIn + "]";
	}
	
}