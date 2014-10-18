package com.qikemi.wechat.api.entity.message.response;

import com.qikemi.wechat.api.entity.message.RespBaseMsg;
import com.qikemi.wechat.api.entity.message.response.baseBean.MusicBean;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 
 * Create Date: 2014年10月18日 下午5:20:47
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class RespMusicMsg extends RespBaseMsg {

	@XStreamAlias("Music")
	private MusicBean musicBean;

	/**             constructor                  **/
	public RespMusicMsg() {
	}

	public RespMusicMsg(MusicBean musicBean) {
		this.musicBean = musicBean;
	}

	public RespMusicMsg(String toUserName, String fromUserName,
			long createTime, String msgType, MusicBean musicBean) {
		super(toUserName, fromUserName, createTime, msgType);
		this.musicBean = musicBean;
	}

	/**           getters and setters            **/
	public MusicBean getMusicBean() {
		return musicBean;
	}

	public void setMusicBean(MusicBean musicBean) {
		this.musicBean = musicBean;
	}

	@Override
	public String toString() {
		return "RespMusicMsg [musicBean=" + musicBean + ", getMusicBean()="
				+ getMusicBean() + ", getToUserName()=" + getToUserName()
				+ ", getFromUserName()=" + getFromUserName()
				+ ", getCreateTime()=" + getCreateTime() + ", getMsgType()="
				+ getMsgType() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
