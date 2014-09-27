package com.qikemi.wechat.api.entity.menu;

import java.util.Arrays;

/**
 * Wechat Menu Button Bean 
 * Create Date: 2014年9月27日 下午10:41:47
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class WechatMenuButton {

	/**
	 * 按钮名称
	 */
	private String name;

	/**
	 * 按钮类型
	 */
	private String type;

	/**
	 * 按钮key值
	 */
	private String key;

	/**
	 * 按钮url
	 */
	private String url;

	/**
	 * 子按钮列表
	 */
	private WechatMenuButton[] sub_wechat_menu_button;

	/**             constructor                  **/
	public WechatMenuButton() {
		super();
	}

	public WechatMenuButton(String name, String type, String key, String url,
			WechatMenuButton[] sub_wechat_menu_button) {
		super();
		this.name = name;
		this.type = type;
		this.key = key;
		this.url = url;
		this.sub_wechat_menu_button = sub_wechat_menu_button;
	}

	/**           getters and setters            **/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public WechatMenuButton[] getSub_wechat_menu_button() {
		return sub_wechat_menu_button;
	}

	public void setSub_wechat_menu_button(WechatMenuButton[] sub_wechat_menu_button) {
		this.sub_wechat_menu_button = sub_wechat_menu_button;
	}

	@Override
	public String toString() {
		return "WechatMenuButton [name=" + name + ", type=" + type + ", key="
				+ key + ", url=" + url + ", sub_wechat_menu_button="
				+ Arrays.toString(sub_wechat_menu_button) + "]";
	}
	
}
