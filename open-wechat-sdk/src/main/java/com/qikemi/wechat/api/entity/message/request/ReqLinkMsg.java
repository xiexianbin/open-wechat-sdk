package com.qikemi.wechat.api.entity.message.request;

import com.qikemi.wechat.api.entity.message.ReqBaseMsg;

/**
 * Link Message Bean 
 * Create Date: 2014年9月27日 下午10:26:29
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class ReqLinkMsg extends ReqBaseMsg {
	
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
	public ReqLinkMsg() {
		super();
	}

	public ReqLinkMsg(String title, String description, String url) {
		super();
		Title = title;
		Description = description;
		Url = url;
	}
	
	public ReqLinkMsg(String toUserName, String fromUserName, long createTime, 
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

	@Override
	public String toString() {
		return "LinkMessage [Title=" + Title + ", Description=" + Description
				+ ", Url=" + Url + ", getToUserName()=" + getToUserName()
				+ ", getFromUserName()=" + getFromUserName()
				+ ", getCreateTime()=" + getCreateTime() + ", getMsgType()="
				+ getMsgType() + ", getMsgId()=" + getMsgId() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
