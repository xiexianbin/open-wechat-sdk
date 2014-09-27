package com.qikemi.wechat.api.entity.message.request;

import com.qikemi.wechat.api.entity.message.RequestBaseMessage;

/**
 * Location Message bean
 * Create Date: 2014年9月27日 下午10:23:51
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class LocationMessage extends RequestBaseMessage {
	
	/**
	 * 地理位置维度
	 */
	private String Location_X;
	
	/**
	 * 地理位置经度
	 */
	private String Location_Y;

	/**
	 * 地图缩放大小
	 */
	private String Scale;

	/**
	 * 地理位置信息
	 */
	private String Label;

	/**             constructor                  **/
	public LocationMessage() {
		super();
	}

	/**
	 * @param location_X
	 * @param location_Y
	 * @param scale
	 * @param label
	 */
	public LocationMessage(String location_X, String location_Y, String scale,
			String label) {
		super();
		Location_X = location_X;
		Location_Y = location_Y;
		Scale = scale;
		Label = label;
	}

	/**
	 * @param location_X
	 * @param location_Y
	 * @param scale
	 * @param label
	 */
	public LocationMessage(String toUserName, String fromUserName, long createTime, 
			String msgType, long msgId, String location_X, String location_Y, String scale,
			String label) {
		super(toUserName, fromUserName, createTime, msgType, msgId);
		Location_X = location_X;
		Location_Y = location_Y;
		Scale = scale;
		Label = label;
	}

	/**           getters and setters            **/
	public String getLocation_X() {
		return Location_X;
	}

	public void setLocation_X(String location_X) {
		Location_X = location_X;
	}

	public String getLocation_Y() {
		return Location_Y;
	}

	public void setLocation_Y(String location_Y) {
		Location_Y = location_Y;
	}

	public String getScale() {
		return Scale;
	}

	public void setScale(String scale) {
		Scale = scale;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

	@Override
	public String toString() {
		return "LocationMessage [Location_X=" + Location_X + ", Location_Y="
				+ Location_Y + ", Scale=" + Scale + ", Label=" + Label
				+ ", getToUserName()=" + getToUserName()
				+ ", getFromUserName()=" + getFromUserName()
				+ ", getCreateTime()=" + getCreateTime() + ", getMsgType()="
				+ getMsgType() + ", getMsgId()=" + getMsgId() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
