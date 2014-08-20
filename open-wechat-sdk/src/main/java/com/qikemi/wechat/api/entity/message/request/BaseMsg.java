package com.qikemi.wechat.api.entity.message.request;

/**
 * 当普通微信用户向公众账号发消息时，微信服务器将POST该消息到填写的URL上的消息基类
 * 
 * Create Date: 2014年8月20日 下午10:56:16
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class BaseMsg {
	
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
	 * 消息id，64位整型
	 */
	private long MsgId;

	/**             constructor                  **/
	public BaseMessage() {
		super();
	}

	public BaseMessage(String toUserName, String fromUserName, long createTime,
			String msgType, long msgId) {
		super();
		ToUserName = toUserName;
		FromUserName = fromUserName;
		CreateTime = createTime;
		MsgType = msgType;
		MsgId = msgId;
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

	public long getMsgId() {
		return MsgId;
	}

	public void setMsgId(long msgId) {
		MsgId = msgId;
	}

	@Override
	public String toString() {
		return "BaseMessage [ToUserName=" + ToUserName + ", FromUserName="
				+ FromUserName + ", CreateTime=" + CreateTime + ", MsgType="
				+ MsgType + ", MsgId=" + MsgId + "]";
	}
}
