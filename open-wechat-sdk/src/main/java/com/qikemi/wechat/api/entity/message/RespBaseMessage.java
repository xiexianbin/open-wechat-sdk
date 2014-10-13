package com.qikemi.wechat.api.entity.message;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 发送response请求消息基类
 * Create Date: 2014年9月27日 下午10:07:56
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class RespBaseMessage {
	
	/**
	 * 开发者微信号
	 */
	@XStreamAlias("ToUserName")
	private String ToUserName;
	
	/**
	 * 接收方帐号（收到的OpenID）
	 */
	@XStreamAlias("FromUserName")
	private String FromUserName;
	
	/**
	 * 消息创建时间 （整型）
	 */
	@XStreamAlias("CreateTime")
	private long CreateTime;
	
	/**
	 * 消息类型
	 */
	@XStreamAlias("MsgType")
	private String MsgType;

	public RespBaseMessage() {
		super();
	}

	public RespBaseMessage(String toUserName, String fromUserName,
			long createTime, String msgType) {
		super();
		ToUserName = toUserName;
		FromUserName = fromUserName;
		CreateTime = createTime;
		MsgType = msgType;
	}

	public String getToUserName() {
		return ToUserName;
	}

	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}

	public String getFromUserName() {
		return FromUserName;
	}

	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	public long getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}

	public String getMsgType() {
		return MsgType;
	}

	public void setMsgType(String msgType) {
		MsgType = msgType;
	}

	@Override
	public String toString() {
		return "ResponseBaseMessage [ToUserName=" + ToUserName
				+ ", FromUserName=" + FromUserName + ", CreateTime="
				+ CreateTime + ", MsgType=" + MsgType + "]";
	}
	
}