package com.qikemi.wechat.api.entity.message.response.baseBean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 
 * Create Date: 2014年10月18日 下午4:34:39
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class VideoBean {

	/**
	 * 通过上传多媒体文件，得到的id
	 */
	@XStreamAlias("MediaId")
	private String MediaId;
	/**
	 * 视频消息的标题
	 */
	@XStreamAlias("Title")
	private String Title;
	/**
	 * 视频消息的描述
	 */
	@XStreamAlias("Description")
	private String Description;
	
	/**             constructor                  **/
	public VideoBean() {
	}
	
	public VideoBean(String mediaId, String title, String description) {
		MediaId = mediaId;
		Title = title;
		Description = description;
	}
	
	/**           getters and setters            **/
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
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
	@Override
	public String toString() {
		return "VideoBean [MediaId=" + MediaId + ", Title=" + Title
				+ ", Description=" + Description + ", getMediaId()="
				+ getMediaId() + ", getTitle()=" + getTitle()
				+ ", getDescription()=" + getDescription() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
