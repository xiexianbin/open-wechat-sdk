package com.qikemi.wechat.api.cache;

public class AccessTokenEntity {

	private String appId;
	// ΢�Ż�ȡ����ƾ֤ 
	private String accessToken;
	// ƾ֤��Чʱ������ֵ 
	private long timeOut;
	
	public AccessTokenEntity() {
		super();
	}
	
	public AccessTokenEntity(String appId, String accessToken) {
		super();
		this.appId = appId;
		this.accessToken = accessToken;
	}
	
	public AccessTokenEntity(String appId, String accessToken, long timeOut) {
		super();
		this.appId = appId;
		this.accessToken = accessToken;
		this.timeOut = timeOut;
	}
	
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public long getTimeOut() {
		return timeOut;
	}
	public void setTimeOut(long timeOut) {
		this.timeOut = timeOut;
	}
	
}
