package com.qikemi.wechat.api.entity.user;

/**
 * Wechat User Group Bean 
 * Create Date: 2014年9月27日 下午10:57:56
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class WechatUserGroup {

	/**
	 * 分组id，由微信分配
	 */
	private String id;
	/**
	 * 分组名字，UTF8编码
	 */
	private String name;
	/**
	 * 分组内用户数量
	 */
	private int count;
	
	/**             constructor                  **/
	public WechatUserGroup() {
		super();
	}
	public WechatUserGroup(String id, String name, int count) {
		super();
		this.id = id;
		this.name = name;
		this.count = count;
	}
	
	/**           getters and setters            **/
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "WechatUserGroup [id=" + id + ", name=" + name + ", count="
				+ count + "]";
	}
	
}
