package com.qikemi.wechat.api.entity.message.request;

import com.qikemi.wechat.api.entity.message.RequestBaseMessage;

/**
 * 链接消息
 * @author XieXianbin
 * @version 1.0
 * 
 */
public class LinkMessage extends RequestBaseMessage {
	
	/**
	 * 标题
	 */
	private String Title;
	
	/**
	 * 描述
	 */
	private String Description;
	
	/**
	 * 链接
	 */
	private String Url;

	/**             constructor                  **/
	public LinkMessage() {
		super();
	}

	public LinkMessage(String title, String description, String url) {
		super();
		Title = title;
		Description = description;
		Url = url;
	}
	
	public LinkMessage(String toUserName, String fromUserName, long createTime, 
			String msgType, long msgId, String title, String description, String url) {
		super(toUserName, fromUserName, createTime, msgType, msgId);
		Title = title;
		Description = description;
		Url = url;
	}

	/**           getters and setters            **/
	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

}
