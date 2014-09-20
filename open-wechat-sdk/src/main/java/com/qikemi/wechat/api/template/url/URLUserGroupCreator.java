package com.qikemi.wechat.api.template.url;

/**
 * 
 * Create Date: 2014年9月19日 下午11:32:05
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class URLUserGroupCreator {

	/**
	 * 获取创建分组URL
	 * @param ACCESS_TOKEN
	 * @return
	 */
	public static String getCreatGroupURL(String ACCESS_TOKEN){
		return "https://api.weixin.qq.com/cgi-bin/groups/create?access_token=" + ACCESS_TOKEN;
	}
	
	/**
	 * 获取查询所有分组URL
	 * @param ACCESS_TOKEN
	 * @return
	 */
	public static String getSearchAllGroupURL(String ACCESS_TOKEN){
		return "https://api.weixin.qq.com/cgi-bin/groups/get?access_token=" + ACCESS_TOKEN;
	}
	
	/**
	 * 获取查询用户所在分组URL
	 * @param ACCESS_TOKEN
	 * @return
	 */
	public static String getSearchUserGroupURL(String ACCESS_TOKEN){
		return "https://api.weixin.qq.com/cgi-bin/groups/getid?access_token=" + ACCESS_TOKEN;
	}
	
	/**
	 * 获取修改分组名URL
	 * @param ACCESS_TOKEN
	 * @return
	 */
	public static String getUpdateGroupNameURL(String ACCESS_TOKEN){
		return "https://api.weixin.qq.com/cgi-bin/groups/update?access_token=" + ACCESS_TOKEN;
	}
	
	/**
	 * 获取移动用户分组URL
	 * @param ACCESS_TOKEN
	 * @return
	 */
	public static String getMoveUserGroupURL(String ACCESS_TOKEN){
		return "https://api.weixin.qq.com/cgi-bin/groups/members/update?access_token=" + ACCESS_TOKEN;
	}
}
