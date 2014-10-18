package com.qikemi.wechat.api.entity.message.request;

import com.qikemi.wechat.api.entity.message.ReqBaseMsg;

/**
 * request voice message 
 * Create Date: 2014年10月18日 下午3:33:28
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class ReqVoiceMsg extends ReqBaseMsg {

	/**
	 * 语音消息媒体id，可以调用多媒体文件下载接口拉取数据。
	 */
	private String MediaId;
	/**
	 * 语音格式，如amr，speex等
	 */
	private String Format;
	
	/**             constructor                  **/
	public ReqVoiceMsg() {
	}

	public ReqVoiceMsg(String mediaId, String format) {
		MediaId = mediaId;
		Format = format;
	}

	public ReqVoiceMsg(String toUserName, String fromUserName, long createTime,
			String msgType, long msgId, String mediaId, String format) {
		super(toUserName, fromUserName, createTime, msgType, msgId);
		MediaId = mediaId;
		Format = format;
	}

	/**           getters and setters            **/
	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	public String getFormat() {
		return Format;
	}

	public void setFormat(String format) {
		Format = format;
	}

	@Override
	public String toString() {
		return "ReqVoiceMsg [MediaId=" + MediaId + ", Format=" + Format
				+ ", getMediaId()=" + getMediaId() + ", getFormat()="
				+ getFormat() + ", getToUserName()=" + getToUserName()
				+ ", getFromUserName()=" + getFromUserName()
				+ ", getCreateTime()=" + getCreateTime() + ", getMsgType()="
				+ getMsgType() + ", getMsgId()=" + getMsgId() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}
