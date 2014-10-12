package com.qikemi.wechat.api.entity.message;

/**
 * 向公众账号发消息时，微信服务器将POST该消息到填写的response body的消息基类，并包含event
 * 
 * Create Date: 2014年10月12日 下午8:05:04
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class MsgTypeBean {
	
	/**
	 * 开发者微信号
	 */
	private String ToUserName;
	
	/**
	 * 发送方帐号（一个OpenID）
	 */
	private String FromUserName;
	
	/**
	 * 消息创建时间 （整型）
	 */
	private long CreateTime;

	/**
	 * 消息类型 text、image、location、link
	 */
	private String MsgType;
	
	/**
	 * 事件类型subscribe、unsubscribe、click 
	 */
	private String Event;

	/**
	 * 消息id，64位整型
	 */
	private long MsgId;
	
	/**             constructor                  **/
	public MsgTypeBean() {
		super();
	}

	public MsgTypeBean(String toUserName, String fromUserName,
			long createTime, String msgType, String Event, long msgId) {
		super();
		this.ToUserName = toUserName;
		this.FromUserName = fromUserName;
		this.CreateTime = createTime;
		this.MsgType = msgType;
		this.Event = Event;
		this.MsgId = msgId;
	}

	/**           getters and setters            **/
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

	public String getEvent() {
		return Event;
	}

	public void setEvent(String event) {
		Event = event;
	}

	public long getMsgId() {
		return MsgId;
	}

	public void setMsgId(long msgId) {
		MsgId = msgId;
	}

	@Override
	public String toString() {
		return "MsgTypeBean [ToUserName=" + ToUserName + ", FromUserName="
				+ FromUserName + ", CreateTime=" + CreateTime + ", MsgType="
				+ MsgType + ", Event=" + Event + ", MsgId=" + MsgId + "]";
	}

}
