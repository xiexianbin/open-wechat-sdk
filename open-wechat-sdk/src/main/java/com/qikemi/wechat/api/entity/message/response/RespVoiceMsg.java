package com.qikemi.wechat.api.entity.message.response;

import com.qikemi.wechat.api.entity.message.RespBaseMsg;
import com.qikemi.wechat.api.entity.message.response.baseBean.VoiceBean;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Voice Message Bean 
 * Create Date: 2014年10月18日 下午3:52:07
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class RespVoiceMsg extends RespBaseMsg {

	@XStreamAlias("Voice")
	private VoiceBean voiceBean;

	/**             constructor                  **/
	public RespVoiceMsg() {
	}

	public RespVoiceMsg(VoiceBean voiceBean) {
		this.voiceBean = voiceBean;
	}

	/**           getters and setters            **/
	public VoiceBean getVoiceBean() {
		return voiceBean;
	}

	public void setVoiceBean(VoiceBean voiceBean) {
		this.voiceBean = voiceBean;
	}

	@Override
	public String toString() {
		return "RespVoiceMsg [voiceBean=" + voiceBean + ", getVoiceBean()="
				+ getVoiceBean() + ", getToUserName()=" + getToUserName()
				+ ", getFromUserName()=" + getFromUserName()
				+ ", getCreateTime()=" + getCreateTime() + ", getMsgType()="
				+ getMsgType() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
