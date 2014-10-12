package com.qikemi.wechat.api;

public enum WechatReturnCode {
	
	/**
	 * -1	系统繁忙
	 */
	SYSTEM_BUSY(-1, "系统繁忙"),
	
	/**
	 * 0	请求成功
	 */
	SUCCESS(0, "请求成功"),
	
	/**
	 * 40001	获取access_token时AppSecret错误，或者access_token无效
	 */
	APPSECRET_ERROR(40001, "获取access_token时AppSecret错误，或者access_token无效"),
	
	/**
	 * 40002	不合法的凭证类型
	 */
	INVALID_TOKEN_TYPE(40002, "不合法的凭证类型"),
	
	/**
	 * 40003	不合法的OpenID
	 */
	INVALID_OPENID(40003, "不合法的OpenID"),
	
	/**
	 * 40004	不合法的媒体文件类型
	 */
	INVALID_MEDIA_FILE_TYPE(40004, "不合法的媒体文件类型"),
	
	/**
	 * 40005	不合法的文件类型
	 */
	INVALID_FILE_TYPE(40005, "不合法的文件类型"),
	
	/**
	 * 40006	不合法的文件大小
	 */
	INVALID_FILE_SIZW(40006, "不合法的文件大小"),
	
	/**
	 * 40007	不合法的媒体文件id
	 */
	INVALID_MEDIA_FILE_ID(40007, "不合法的媒体文件id"),
	
	/**
	 * 40008	不合法的消息类型
	 */
	INVALID_MESSAGE_TYPE(40008, "不合法的消息类型"),
	
	/**
	 * 40009	不合法的图片文件大小
	 */
	INVALID_IMAGE_FILE_SIZE(40009, "不合法的图片文件大小"),
	
	/**
	 * 40010	不合法的语音文件大小
	 */
	INVALID_VOICE_FILE_SIZE(40010, "不合法的语音文件大小"),
	
	/**
	 * 40011	不合法的视频文件大小
	 */
	INVALID_VIDEO_FILE_SIZE(40011, "不合法的视频文件大小"),
	
	/**
	 * 40012	不合法的缩略图文件大小
	 */
	INVALID_THUMBNAIL_FILE_SIZE(40012, "不合法的缩略图文件大小"),
	
	/**
	 * 40013	不合法的APPID
	 */
	INVALID_APPID(40013, "不合法的APPID"),
	
	/**
	 * 40014	不合法的access_token
	 */
	INVALID_ACCESS_TOKEN(40014, "不合法的access_token"),
	
	/**
	 * 40015	不合法的菜单类型
	 */
	INVALID_MENU_TYPE(40015, "不合法的菜单类型"),
	
	/**
	 * 40016	不合法的按钮个数
	 */
	INVALID_BUTTON_COUNT(40016, "不合法的按钮个数"),
	
	/**
	 * 40017	不合法的按钮个数
	 * @err 官方数据40016和40017是相同的 
	 */
	INVALID_SUB_BUTTON_COUNT(40017, "不合法的按钮个数"),
	
	/**
	 * 40018	不合法的按钮名字长度
	 */
	INVALID_BUTTON_NAME_LENGTH(40018, "不合法的按钮名字长度"),
	
	/**
	 * 40019	不合法的按钮KEY长度
	 */
	INVALID_BUTTON_KEY_LENGTH(40019, "不合法的按钮KEY长度"),
	
	/**
	 * 40020	不合法的按钮URL长度
	 */
	INVALID_BUTTON_URL_LENGTH(40020, "不合法的按钮URL长度"),
	
	/**
	 * 40021	不合法的菜单版本号
	 */
	INVALID_MENU_VERSION(40021, "不合法的菜单版本号"),
	
	/**
	 * 40022	不合法的子菜单级数
	 */
	INVALID_SUB_MENU_SERIES(40022, "不合法的子菜单级数"),
	
	/**
	 * 40023	不合法的子菜单按钮个数
	 */
	INVALID_SUB_MENU_COUNT(40023, "不合法的子菜单按钮个数"),
	
	/**
	 * 40024	不合法的子菜单按钮类型
	 */
	INVALID_SUB_MENU_TYPE(40024, "不合法的子菜单按钮类型"),
	
	/**
	 * 40025	不合法的子菜单按钮名字长度
	 */
	INVALID_SUB_MENU_BUTTON_NAME_LENGTH(40025, "不合法的子菜单按钮名字长度"),
	
	/**
	 * 40026	不合法的子菜单按钮KEY长度
	 */
	INVALID_SUB_MENU_BUTTON_KEY_LENGTH(40026, "不合法的子菜单按钮KEY长度"),
	
	/**
	 * 40027	不合法的子菜单按钮URL长度
	 */
	INVALID_SUB_MENU_BUTTON_URL_LENGTH(40027, "不合法的子菜单按钮URL长度"),
	
	/**
	 * 40028	不合法的自定义菜单使用用户
	 */
	INVALID_CUSTOM_MENU_USER(40028, "不合法的自定义菜单使用用户"),
	
	/**
	 * 40029	不合法的oauth_code
	 */
	INVALID_OAUTH_CODE(40029, "不合法的oauth_code"),
	
	/**
	 * 40030	不合法的refresh_token
	 */
	INVALID_REFRESH_TOKEN(40030, "不合法的refresh_token"),
	
	/**
	 * 40031	不合法的openid列表
	 */
	INVALID_OPEN_ID_LIST(40031, "不合法的openid列表"),
	
	/**
	 * 40032	不合法的openid列表长度
	 */
	INVALID_OPEN_ID_LIST_LENGTH(40032, "不合法的openid列表长度"),
	
	/**
	 * 40033	不合法的请求字符，不能包含\\uxxxx格式的字符
	 */
	INVALID_REQUEST_CHARACTER(40033, "不合法的请求字符，不能包含\\uxxxx格式的字符"),
	
	/**
	 * 40035	不合法的参数
	 */
	INVALID_PARAMETER(40035, "不合法的参数"),
	
	/**
	 * 40038	不合法的请求格式
	 */
	INVALID_REQUEST_FORMAT(40038, "不合法的请求格式"),
	
	/**
	 * 40039	不合法的URL长度
	 */
	INVALID_URL_LENGTH(40039, "不合法的URL长度"),
	
	/**
	 * 40050	不合法的分组id
	 */
	INVALID_USER_GROUP_ID(40050, "不合法的分组id"),
	
	/**
	 * 40051	分组名字不合法
	 */
	INVALID_USER_GROUP_NAME(40051, "分组名字不合法"),
	
	/**
	 * 41001	缺少access_token参数
	 */
	MISSING_ACCESS_TOKEN(41001, "缺少access_token参数"),
	
	/**
	 * 41002	缺少appid参数
	 */
	MISSING_APPID(41002, "缺少appid参数"),
	
	/**
	 * 41003	缺少refresh_token参数
	 */
	MISSING_REFRESH_TOKEN(41003, "缺少refresh_token参数"),
	
	/**
	 * 41004	缺少secret参数
	 */
	MISSING_SECRET(41004, "缺少secret参数"),
	
	/**
	 * 41005	缺少多媒体文件数据
	 */
	MISSING_MEDIA_DATA(41005, "缺少多媒体文件数据"),
	
	/**
	 * 41006	缺少media_id参数
	 */
	MISSING_MEDIA_ID(41006, "缺少media_id参数"),
	
	/**
	 * 41007	缺少子菜单数据
	 */
	MISSING_SUB_MENU_DATA(41007, "缺少子菜单数据"),
	
	/**
	 * 41008	缺少oauth code
	 */
	MISSING_OAUTH_CODE(41008, "缺少oauth code"),
	
	/**
	 * 41009	缺少openid
	 */
	MISSING_OPENID(41009, "缺少openid"),
	
	/**
	 * 42001	access_token超时
	 */
	TIMEOUT_ACCESS_TOKEN(42001, "access_token超时"),
	
	/**
	 * 42002	refresh_token超时
	 */
	TIMEOUT_REFRESH_TOKEN(42002, "refresh_token超时"),
	
	/**
	 * 42003	oauth_code超时
	 */
	TIMEOUT_OAUTH_CODE(42003, "oauth_code超时"),
	
	/**
	 * 43001	需要GET请求
	 */
	NEED_GET_REQUEST(43001, "需要GET请求"),
	
	/**
	 * 43002	需要POST请求
	 */
	NEED_POST_REQUEST(43002, "需要POST请求"),
	
	/**
	 * 43003	需要HTTPS请求
	 */
	NEED_HTTPS_REQUEST(43003, "需要HTTPS请求"),
	
	/**
	 * 43004	需要接收者关注
	 */
	NEED_TOUSER_SUBSCRIBE(43004, "需要接收者关注"),
	
	/**
	 * 43005	需要好友关系
	 */
	NEED_FRIEND_RELATIONSHIP(43005, "需要好友关系"),
	
	/**
	 * 44001	多媒体文件为空
	 */
	MULTIMEDIA_FILE_EMPTY(44001, "多媒体文件为空"),
	
	/**
	 * 44002	POST的数据包为空
	 */
	POST_DATA_PACKET_EMPTY(44002, "POST的数据包为空"),
	
	/**
	 * 44003	图文消息内容为空
	 */
	IMAGE_TEXT_MESSAGE_EMPTY(44003, "图文消息内容为空"),
	
	/**
	 * 44004	文本消息内容为空
	 */
	TEXT_MESSAGE_EMPTY(44004, "文本消息内容为空"),
	
	/**
	 * 45001	多媒体文件大小超过限制
	 */
	MULTIMEDIA_FILE_SIZE_LIMIT(45001, "多媒体文件大小超过限制"),
	
	/**
	 * 45002	消息内容超过限制
	 */
	MSG_SIZE_LIMIT(45002, "消息内容超过限制"),
	
	/**
	 * 45003	标题字段超过限制
	 */
	TITLE_SIZE_LIMIT(45003, "标题字段超过限制"),
	
	/**
	 * 45004	描述字段超过限制
	 */
	DESCRIPTION_LIMIT(45004, "描述字段超过限制"),
	
	/**
	 * 45005	链接字段超过限制
	 */
	LINK_FIELD_LIMIT(45005, "链接字段超过限制"),
	
	/**
	 * 45006	图片链接字段超过限制
	 */
	IMAGE_LINK_FIELD_LIMIT(45006, "图片链接字段超过限制"),
	
	/**
	 * 45007	语音播放时间超过限制
	 */
	VOICE_PLAY_TIME_LIMIT(45007, "语音播放时间超过限制"),
	
	/**
	 * 45008	图文消息超过限制
	 */
	IMAGE_TEXT_MESSAGE_LIMIT(45008, "图文消息超过限制"),
	
	/**
	 * 45009	接口调用超过限制
	 */
	INTERFACE_EXCEEDS_LIMIT(45009, "接口调用超过限制"),
	
	/**
	 * 45010	创建菜单个数超过限制
	 */
	CREATE_MENU_COUNT_LIMIT(45010, "创建菜单个数超过限制"),
	
	/**
	 * 45015	回复时间超过限制
	 */
	RESPONSE_TIME_LIMIT(45015, "回复时间超过限制"),
	
	/**
	 * 45016	系统分组，不允许修改
	 */
	NOT_ALLOWED_TO_MODIFY_SYSTEM_GROUP(45016, "系统分组，不允许修改"),
	
	/**
	 * 45017	分组名字过长
	 */
	GROUP_NAME_TOO_LONG(45017, "分组名字过长"),
	
	/**
	 * 45018	分组数量超过上限
	 */
	GROUP_COUNT_LIMIT(45018, "分组数量超过上限"),
	
	/**
	 * 46001	不存在媒体数据
	 */
	NOT_EXIST_MEDIA_DATA(46001, "不存在媒体数据"),
	
	/**
	 * 46002	不存在的菜单版本
	 */
	NOT_EXIST_MENU_VERSION(46002, "不存在的菜单版本"),
	
	/**
	 * 46003	不存在的菜单数据
	 */
	NOT_EXIST_MENU_DATA(46003, "不存在的菜单数据"),
	
	/**
	 * 46004	不存在的用户
	 */
	NOT_EXIST_USER(46004, "不存在的用户"),
	
	/**
	 * 47001	解析JSON/XML内容错误
	 */
	PASE_JSON_OR_XML_ERROR(47001, "解析JSON/XML内容错误"),
	
	/**
	 * 48001	api功能未授权
	 */
	API_FUNCTION_NOT_AUTHORIZED(48001, "api功能未授权"),
	
	/**
	 * 50001	用户未授权该api
	 */
	USERUNAUTHORIZEDAPI(50001, "用户未授权该api");
	
	// Wechat return code 
	private int code;
	private String message;
	
	// 构造方法
	private WechatReturnCode(int code, String message){
		this.code = code;
		this.message = message;
	}
	
	// gets methods
	public int getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}
	
	// 方法
	public static String getMessage(int code){
		for(WechatReturnCode statusCode : WechatReturnCode.values()){
			if(statusCode.getCode() == code){
				return statusCode.message;
			}
		}
		return null;
	}

}
