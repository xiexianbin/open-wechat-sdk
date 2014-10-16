package com.qikemi.wechat.api.entity.message.request;

import com.qikemi.wechat.api.entity.message.ReqBaseMsg;

/**
 * Request Image message Bean 
 * Create Date: 2014年10月16日 下午11:01:56
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class ReqImageMsg extends ReqBaseMsg {

	/**
	 * 图片链接
	 */
	private String PicUrl;
	
	/**
	 * 图片消息媒体id，可以调用多媒体文件下载接口拉取数据。
	 */
	private String MediaId;

	/**             constructor                  **/
	public ReqImageMsg() {
		super();
	}

	public ReqImageMsg(String picUrl, String mediaId) {
		super();
		PicUrl = picUrl;
		MediaId = mediaId;
	}
	

	/**
	 * @param toUserName
	 * @param fromUserName
	 * @param createTime
	 * @param msgType
	 * @param msgId
	 */
	public ReqImageMsg(String toUserName, String fromUserName, long createTime,
			String msgType, long msgId, String picUrl, String mediaId) {
		super(toUserName, fromUserName, createTime, msgType, msgId);
		PicUrl = picUrl;
		MediaId = mediaId;
	}

	/**           getters and setters            **/
	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	@Override
	public String toString() {
		return "ReqImageMsg [PicUrl=" + PicUrl + ", MediaId=" + MediaId
				+ ", getToUserName()=" + getToUserName()
				+ ", getFromUserName()=" + getFromUserName()
				+ ", getCreateTime()=" + getCreateTime() + ", getMsgType()="
				+ getMsgType() + ", getMsgId()=" + getMsgId() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
