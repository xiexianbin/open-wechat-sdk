package com.qikemi.wechat.api.template.url;

/**
 * 推广支持
 * Create Date: 2014年9月22日 下午8:38:30
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class URLPromotionSupportCreator {

	/**
	 * 获取创建二维码ticketURL
	 * @param TOKEN
	 * @return
	 */
	public static String getCreatQRcodeTicketURL(String TOKEN){
		return "https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token=" + TOKEN;
	}
	
	/**
	 * 获取通过ticket换取二维码RUL
	 * @param TICKET
	 * @return
	 */
	public static String getShowQRcodeURL(String TICKET){
		return "https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket=" + TICKET;
	}
	
	/**
	 * 获取长链接转短链接接口URL
	 * @param TOKEN
	 * @return
	 */
	public static String getLong2ShortURL(String TOKEN){
		return "https://api.weixin.qq.com/cgi-bin/shorturl?access_token=" + TOKEN;
	}
}
