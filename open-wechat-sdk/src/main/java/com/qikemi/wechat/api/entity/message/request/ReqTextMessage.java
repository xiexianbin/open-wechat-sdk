package com.qikemi.wechat.api.entity.message.request;

import com.qikemi.wechat.api.entity.message.ReqBaseMessage;


/**
 * Text Message Bean 
 * Create Date: 2014年9月27日 下午10:33:15
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class ReqTextMessage extends ReqBaseMessage {
	
	/**
	 * 回复的消息内容
	 */
	private String Content;

	/**             constructor                  **/
	public ReqTextMessage() {
		super();
	}

	/**
	 * @param content
	 */
	public ReqTextMessage(String content) {
		super();
		Content = content;
	}

	/**
	 * @param toUserName
	 * @param fromUserName
	 * @param createTime
	 * @param msgType
	 * @param msgId
	 * @param content
	 */
	public ReqTextMessage(String toUserName, String fromUserName, long createTime,
			String msgType, long msgId, String content) {
		super(toUserName, fromUserName, createTime, msgType, msgId);
		Content = content;
	}

	/**           getters and setters            **/
	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	@Override
	public String toString() {
		return "TextMessage [Content=" + Content + ", getToUserName()="
				+ getToUserName() + ", getFromUserName()=" + getFromUserName()
				+ ", getCreateTime()=" + getCreateTime() + ", getMsgType()="
				+ getMsgType() + ", getMsgId()=" + getMsgId() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}