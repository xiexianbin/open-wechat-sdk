package com.qikemi.wechat.api.entity.message.response.baseBean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 
 * Create Date: 2014年10月18日 下午5:21:17
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class MusicBean {

	/**
	 * 音乐标题
	 */
	@XStreamAlias("Title")
	private String Title;
	/**
	 * 音乐描述
	 */
	@XStreamAlias("Description")
	private String Description;
	/**
	 * 音乐链接
	 */
	@XStreamAlias("MusicUrl")
	private String MusicUrl;
	/**
	 * 高质量音乐链接，WIFI环境优先使用该链接播放音乐
	 */
	@XStreamAlias("HQMusicUrl")
	private String HQMusicUrl;
	/**
	 * 缩略图的媒体id，通过上传多媒体文件，得到的id
	 */
	@XStreamAlias("ThumbMediaId")
	private String ThumbMediaId;
	
	/**             constructor                  **/
	public MusicBean() {
	}
	
	public MusicBean(String title, String description, String musicUrl,
			String hQMusicUrl, String thumbMediaId) {
		Title = title;
		Description = description;
		MusicUrl = musicUrl;
		HQMusicUrl = hQMusicUrl;
		ThumbMediaId = thumbMediaId;
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
	public String getMusicUrl() {
		return MusicUrl;
	}
	public void setMusicUrl(String musicUrl) {
		MusicUrl = musicUrl;
	}
	public String getHQMusicUrl() {
		return HQMusicUrl;
	}
	public void setHQMusicUrl(String hQMusicUrl) {
		HQMusicUrl = hQMusicUrl;
	}
	public String getThumbMediaId() {
		return ThumbMediaId;
	}
	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}
	
	@Override
	public String toString() {
		return "MusicBean [Title=" + Title + ", Description=" + Description
				+ ", MusicUrl=" + MusicUrl + ", HQMusicUrl=" + HQMusicUrl
				+ ", ThumbMediaId=" + ThumbMediaId + ", getTitle()="
				+ getTitle() + ", getDescription()=" + getDescription()
				+ ", getMusicUrl()=" + getMusicUrl() + ", getHQMusicUrl()="
				+ getHQMusicUrl() + ", getThumbMediaId()=" + getThumbMediaId()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
