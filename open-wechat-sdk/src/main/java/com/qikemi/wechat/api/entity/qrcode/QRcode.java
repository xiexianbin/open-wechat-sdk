package com.qikemi.wechat.api.entity.qrcode;

/**
 * QRcode Bean 
 * Create Date: 2014年9月27日 下午11:20:52
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class QRcode {
	
	/**
	 * 该二维码有效时间，以秒为单位。 最大不超过1800
	 */
	private String expireSeconds;
	
	/**
	 * 二维码类型，QR_SCENE为临时,QR_LIMIT_SCENE为永久
	 */
	private String actionName;
	
	/**
	 * 二维码详细信息
	 */
	private String actionInfo;
	
	/**
	 * 场景值ID，临时二维码时为32位非0整型，永久二维码时最大值为100000（目前参数只支持1--100000）
	 */
	private String sceneId;

	/**             constructor                  **/
	public QRcode() {
		super();
	}

	public QRcode(String expireSeconds, String actionName, String actionInfo,
			String sceneId) {
		super();
		this.expireSeconds = expireSeconds;
		this.actionName = actionName;
		this.actionInfo = actionInfo;
		this.sceneId = sceneId;
	}

	/**           getters and setters            **/
	public String getExpireSeconds() {
		return expireSeconds;
	}

	public void setExpireSeconds(String expireSeconds) {
		this.expireSeconds = expireSeconds;
	}

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public String getActionInfo() {
		return actionInfo;
	}

	public void setActionInfo(String actionInfo) {
		this.actionInfo = actionInfo;
	}

	public String getSceneId() {
		return sceneId;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	@Override
	public String toString() {
		return "QRcode [expireSeconds=" + expireSeconds + ", actionName="
				+ actionName + ", actionInfo=" + actionInfo + ", sceneId="
				+ sceneId + "]";
	}

}
