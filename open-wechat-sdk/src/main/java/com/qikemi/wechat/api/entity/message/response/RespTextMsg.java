package com.qikemi.wechat.api.entity.message.response;

import com.qikemi.wechat.api.entity.message.RespBaseMessage;
import com.thoughtworks.xstream.annotations.XStreamAlias;


/**
 * Text Message Bean 
 * Create Date: 2014年9月27日 下午10:33:15
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class RespTextMsg extends RespBaseMessage {
	
	/**
	 * 回复的消息内容
	 */
	@XStreamAlias("Content")
	private String content;

	/**             constructor                  **/
	public RespTextMsg() {
		super();
	}

	/**
	 * @param content
	 */
	public RespTextMsg(String content) {
		super();
		this.content = content;
	}

	/**
	 * @param toUserName
	 * @param fromUserName
	 * @param createTime
	 * @param msgType
	 * @param msgId
	 * @param content
	 */
	public RespTextMsg(String toUserName, String fromUserName, long createTime,
			String msgType, String content) {
		super(toUserName, fromUserName, createTime, msgType);
		this.content = content;
	}

	/**           getters and setters            **/
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}