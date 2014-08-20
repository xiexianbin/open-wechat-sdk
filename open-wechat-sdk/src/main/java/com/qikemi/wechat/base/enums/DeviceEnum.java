package com.qikemi.wechat.base.enums;

/**
 * 
 * Create Date: 2014年8月19日 下午10:19:58
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public enum DeviceEnum {

	/**
	 * 塞班系统
	 */
	SYMBIANOS("SymbianOS", "塞班系统"),
	/**
	 * Windows CE，Mozilla/4.0 (compatible; MSIE 6.0; Windows CE; IEMobile 7.11)
	 */
	WINDOWS_CE("Windows_CE", "Mozilla/4.0 (compatible; MSIE 6.0; Windows CE; IEMobile 7.11)"),
	/**
	 * iPhone是否也转wap？Mozilla/5.0 (iPhone; U; CPU iPhone OS 4_1 like Mac OS X; zh-cn) AppleWebKit/532.9 (KHTML like Gecko) Mobile/8B117
	 */
	IPHONE("iPhone", "Mozilla/5.0 (iPhone; U; CPU iPhone OS 4_1 like Mac OS X; zh-cn) AppleWebKit/532.9 (KHTML like Gecko) Mobile/8B117"),
	/**
	 * Mozilla/5.0 (iPad; U; CPU OS 3_2 like Mac OS X; zh-cn) AppleWebKit/531.21.10 (KHTML like Gecko) Version/4.0.4 Mobile/7B367 Safari/531.21.10
	 */
	IPAD("iPad", "(iPad; U; CPU OS 3_2 like Mac OS X; zh-cn) AppleWebKit/531.21.10 (KHTML like Gecko) Version/4.0.4 Mobile/7B367 Safari/531.21.10"),
	/**
	 * Android是否也转wap？Mozilla/5.0 (Linux; U; Android 2.1-update1; zh-cn; XT800 Build/TITA_M2_16.22.7) AppleWebKit/530.17 (KHTML like Gecko) Version/4.0 Mobile Safari/530.17
	 */
	ANDROID("Android", "Mozilla/5.0 (Linux; U; Android 2.1-update1; zh-cn; XT800 Build/TITA_M2_16.22.7) AppleWebKit/530.17 (KHTML like Gecko) Version/4.0 Mobile Safari/530.17"),
	/**
	 * BlackBerry8310/2.7.0.106-4.5.0.182
	 */
	BLACKBERRY("BlackBerry", "BlackBerry8310/2.7.0.106-4.5.0.182"),
	/**
	 * 其它设备类型 
	 */
	OTHERS("Others", "other device type");
	
	/**
	 * 设备类型
	 */
	private String deviceType;
	/**
	 * 类型描述实例 
	 */
	private String deviceIntroduce;
	
	/**
	 * 默认构造器 
	 */
	private DeviceEnum() {
	}

	/**
	 * 带参构造器 
	 * @param deviceType
	 * @param deviceIntroduce
	 */
	private DeviceEnum(String deviceType, String deviceIntroduce) {
		this.deviceType = deviceType;
		this.deviceIntroduce = deviceIntroduce;
	}

	/***            getters method           **/
	public String getDeviceType() {
		return deviceType;
	}

	public String getDeviceIntroduce() {
		return deviceIntroduce;
	}
	
	public static String getDeviceType(String deviceType) {
		for(DeviceEnum deviceEnum : DeviceEnum.values()){
			if(deviceEnum.getDeviceType() == deviceType){
				return deviceEnum.deviceType;
			}
		}
		return null;
	}
}
