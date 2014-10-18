package com.qikemi.wechat.api.entity.message.request;

import com.qikemi.wechat.api.entity.message.ReqBaseMsg;

/**
 * request video message 
 * Create Date: 2014年10月18日 下午4:23:57
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class ReqVideoMsg extends ReqBaseMsg {

	/**
	 * 视频消息媒体id，可以调用多媒体文件下载接口拉取数据。
	 */
	private String MediaId;
	/**
	 * 视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。
	 */
	private String ThumbMediaId;
	
	/**             constructor                  **/
	public ReqVideoMsg() {
	}
	
	public ReqVideoMsg(String mediaId, String thumbMediaId) {
		MediaId = mediaId;
		ThumbMediaId = thumbMediaId;
	}
	
	public ReqVideoMsg(String toUserName, String fromUserName, long createTime,
			String msgType, long msgId, String mediaId, String thumbMediaId) {
		super(toUserName, fromUserName, createTime, msgType, msgId);
		MediaId = mediaId;
		ThumbMediaId = thumbMediaId;
	}
	
	/**           getters and setters            **/
	public String getMediaId() {
		return MediaId;
	}
	
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	
	public String getThumbMediaId() {
		return ThumbMediaId;
	}
	
	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}
	
	@Override
	public String toString() {
		return "ReqVideoMsg [MediaId=" + MediaId + ", ThumbMediaId="
				+ ThumbMediaId + ", getMediaId()=" + getMediaId()
				+ ", getThumbMediaId()=" + getThumbMediaId()
				+ ", getToUserName()=" + getToUserName()
				+ ", getFromUserName()=" + getFromUserName()
				+ ", getCreateTime()=" + getCreateTime() + ", getMsgType()="
				+ getMsgType() + ", getMsgId()=" + getMsgId() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
