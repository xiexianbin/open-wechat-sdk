package com.qikemi.wechat.api.entity.message.response;

import com.qikemi.wechat.api.entity.message.RespBaseMsg;
import com.qikemi.wechat.api.entity.message.response.baseBean.VideoBean;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Video Message Bean 
 * Create Date: 2014年10月18日 下午4:33:32
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class RespVideoMsg extends RespBaseMsg {

	@XStreamAlias("Video")
	private VideoBean videoBean;

	/**             constructor                  **/
	public RespVideoMsg() {
	}

	public RespVideoMsg(VideoBean videoBean) {
		this.videoBean = videoBean;
	}

	public RespVideoMsg(String toUserName, String fromUserName,
			long createTime, String msgType, VideoBean videoBean) {
		super(toUserName, fromUserName, createTime, msgType);
		this.videoBean = videoBean;
	}

	/**           getters and setters            **/
	public VideoBean getVideoBean() {
		return videoBean;
	}

	public void setVideoBean(VideoBean videoBean) {
		this.videoBean = videoBean;
	}

	@Override
	public String toString() {
		return "RespVideoMsg [videoBean=" + videoBean + ", getVideoBean()="
				+ getVideoBean() + ", getToUserName()=" + getToUserName()
				+ ", getFromUserName()=" + getFromUserName()
				+ ", getCreateTime()=" + getCreateTime() + ", getMsgType()="
				+ getMsgType() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
