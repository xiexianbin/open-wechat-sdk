package com.qikemi.wechat.api.entity.menu;

import java.util.Arrays;

/**
 * Wechat Menu Bean 
 * 
 * Create Date: 2014年9月27日 下午10:46:35
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class WechatMenu {
	
	/**
	 * 菜单按钮
	 */
	private WechatMenuButton[] wechat_menu_button;

	/**             constructor                  **/
	public WechatMenu() {
		super();
	}

	public WechatMenu(WechatMenuButton[] wechat_menu_button) {
		super();
		this.wechat_menu_button = wechat_menu_button;
	}

	/**           getters and setters            **/
	public WechatMenuButton[] getWechat_menu_button() {
		return wechat_menu_button;
	}

	public void setWechat_menu_button(WechatMenuButton[] wechat_menu_button) {
		this.wechat_menu_button = wechat_menu_button;
	}

	@Override
	public String toString() {
		return "WechatMenu [wechat_menu_button="
				+ Arrays.toString(wechat_menu_button) + "]";
	}
	
}
