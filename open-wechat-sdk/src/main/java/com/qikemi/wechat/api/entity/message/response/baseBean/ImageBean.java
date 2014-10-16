package com.qikemi.wechat.api.entity.message.response.baseBean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 
 * Create Date: 2014年10月16日 下午11:18:02
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class ImageBean {

	/**
	 * 通过上传多媒体文件，得到的id。
	 */
	@XStreamAlias("MediaId")
	private String MediaId;

	/**
	 * 
	 */
	public ImageBean() {
	}

	/**
	 * @param mediaId
	 */
	public ImageBean(String mediaId) {
		MediaId = mediaId;
	}

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
