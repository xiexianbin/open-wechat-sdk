package com.qikemi.wechat.api.entity.message.response;

import java.util.List;

import com.qikemi.wechat.api.entity.message.RespBaseMsg;
import com.qikemi.wechat.api.entity.message.response.baseBean.ImageBean;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 
 * Create Date: 2014年10月16日 下午11:15:02
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class RespImageMsg extends RespBaseMsg {

	/**
	 * Image Bean 
	 */
	@XStreamAlias("Image")
	private List<ImageBean> imageBeans;

	public RespImageMsg() {
		super();
	}

	public RespImageMsg(List<ImageBean> imageBeans) {
		this.imageBeans = imageBeans;
	}

	public RespImageMsg(String toUserName, String fromUserName,
			long createTime, String msgType, List<ImageBean> imageBeans) {
		super(toUserName, fromUserName, createTime, msgType);
		this.imageBeans = imageBeans;
	}

	public List<ImageBean> getImageBeans() {
		return imageBeans;
	}

	public void setImageBeans(List<ImageBean> imageBeans) {
		this.imageBeans = imageBeans;
	}

	@Override
	public String toString() {
		return "RespImageMsg [imageBeans=" + imageBeans + ", getImageBeans()="
				+ getImageBeans() + ", getToUserName()=" + getToUserName()
				+ ", getFromUserName()=" + getFromUserName()
				+ ", getCreateTime()=" + getCreateTime() + ", getMsgType()="
				+ getMsgType() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
