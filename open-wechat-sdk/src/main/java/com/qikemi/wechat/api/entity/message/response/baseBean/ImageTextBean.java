package com.qikemi.wechat.api.entity.message.response.baseBean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Image-Text message
 * Create Date: 2014年10月18日 下午5:37:49
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
@XStreamAlias("item")
public class ImageTextBean {

	@XStreamAlias("Title")
	private String Title;
	@XStreamAlias("Description")
	private String Description;
	@XStreamAlias("PicUrl")
	private String PicUrl;
	@XStreamAlias("Url")
	private String Url;
	
	/**             constructor                  **/
	public ImageTextBean() {
	}
	
	public ImageTextBean(String title, String description, String picUrl,
			String url) {
		Title = title;
		Description = description;
		PicUrl = picUrl;
		Url = url;
	}
	
	/**           getters and setters            **/
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getPicUrl() {
		return PicUrl;
	}
	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	
	@Override
	public String toString() {
		return "ImageTextBean [Title=" + Title + ", Description=" + Description
				+ ", PicUrl=" + PicUrl + ", Url=" + Url + ", getTitle()="
				+ getTitle() + ", getDescription()=" + getDescription()
				+ ", getPicUrl()=" + getPicUrl() + ", getUrl()=" + getUrl()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
