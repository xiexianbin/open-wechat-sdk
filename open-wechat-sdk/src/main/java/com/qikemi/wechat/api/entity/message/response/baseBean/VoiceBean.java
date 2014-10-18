package com.qikemi.wechat.api.entity.message.response.baseBean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 
 * Create Date: 2014年10月18日 下午3:52:39
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class VoiceBean {
	
	/**
	 * 通过上传多媒体文件，得到的id。
	 */
	@XStreamAlias("MediaId")
	private String MediaId;

	/**             constructor                  **/
	public VoiceBean() {
	}

	/**
	 * @param mediaId
	 */
	public VoiceBean(String mediaId) {
		MediaId = mediaId;
	}

	/**           getters and setters            **/
	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	@Override
	public String toString() {
		return "Image [MediaId=" + MediaId + "]";
	}
}
