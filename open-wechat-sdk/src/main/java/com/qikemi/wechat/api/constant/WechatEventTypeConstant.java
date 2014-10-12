package com.qikemi.wechat.api.constant;

/**
 * WECHAT Event Type Constant 
 * Create Date: 2014年9月27日 下午9:39:22
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class WechatEventTypeConstant {

	/**
	 * 事件类型：subscribe(关注)
	 */
	public static final String SUBSCRIBE = "subscribe";
	
	/**
	 * 事件类型：unSubscribe(取消关注)
	 */
	public static final String UNSUBSCRIBE = "unsubscribe";
	
	/**
	 * 事件类型：SCAN(用户已关注时的事件推送)
	 */
	public static final String SCAN = "SCAN";
	
	/**
	 * 事件类型：LOCATION(上报地理位置事件)
	 */
	public static final String LOCATION = "LOCATION";
	
	/**
	 * 事件类型：CLICK(点击菜单拉取消息时的事件推送)
	 */
	public static final String CLICK = "CLICK";
	
	/**
	 * 事件类型：VIEW(点击菜单跳转链接时的事件推送)
	 */
	public static final String VIEW = "VIEW";
	
}
