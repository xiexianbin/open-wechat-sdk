package com.qikemi.wechat.api.entity.message.response;

import java.util.List;

import com.qikemi.wechat.api.entity.message.RespBaseMsg;
import com.qikemi.wechat.api.entity.message.response.baseBean.ImageTextBean;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * response Image-Texts message
 * Create Date: 2014年10月18日 下午5:36:36
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class RespImageTextMsg extends RespBaseMsg {

	/**
	 * 图文消息个数，限制为10条以内
	 */
	@XStreamAlias("ArticleCount")
	private Integer ArticleCount;
	/**
	 * 多条图文消息信息，默认第一个item为大图,注意，如果图文数超过10，则将会无响应
	 */
	@XStreamAlias("Articles")
	private List<ImageTextBean> imgTextList;
	
	/**             constructor                  **/
	public RespImageTextMsg() {
	}
	
	public RespImageTextMsg(Integer articleCount, List<ImageTextBean> imgTextList) {
		ArticleCount = articleCount;
		this.imgTextList = imgTextList;
	}
	
	public RespImageTextMsg(String toUserName, String fromUserName,
			long createTime, String msgType, Integer articleCount, List<ImageTextBean> imgTextList) {
		super(toUserName, fromUserName, createTime, msgType);
		ArticleCount = articleCount;
		this.imgTextList = imgTextList;
	}
	
	/**           getters and setters            **/
	public Integer getArticleCount() {
		return ArticleCount;
	}
	public void setArticleCount(Integer articleCount) {
		ArticleCount = articleCount;
	}
	public List<ImageTextBean> getImgTextList() {
		return imgTextList;
	}
	public void setImgTextList(List<ImageTextBean> imgTextList) {
		this.imgTextList = imgTextList;
	}
	@Override
	public String toString() {
		return "RespImageTextMsg [ArticleCount=" + ArticleCount
				+ ", imgTextList=" + imgTextList + ", getArticleCount()="
				+ getArticleCount() + ", getImgTextList()=" + getImgTextList()
				+ ", getToUserName()=" + getToUserName()
				+ ", getFromUserName()=" + getFromUserName()
				+ ", getCreateTime()=" + getCreateTime() + ", getMsgType()="
				+ getMsgType() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
