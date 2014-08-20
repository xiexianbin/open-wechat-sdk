package com.qikemi.wechat.base.utils;

import javax.servlet.http.HttpServletRequest;

import com.qikemi.wechat.base.enums.DeviceEnum;

/**
 * 
 * Create Date: 2014年8月20日 下午10:20:33
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class HttpRequestDeviceUtils {

	/**
	 * 通过检测request请求中HEADER的"user-Agent"，判断是否来自手机终端
	 * @param request
	 * @return 
	 */
	public DeviceEnum isMobileDevice(HttpServletRequest request){
		String userAgent = request.getHeader("user-agent");
		if(userAgent != null && !userAgent.trim().equals("")){
			for(DeviceEnum device : DeviceEnum.values()){
				if(userAgent.contains(device.getDeviceType())){
					return device;
				}
			}
		}
		return DeviceEnum.OTHERS;
	}
	
	/**
	 * if true, is MicreMessenger
	 * if false, is not MicreMessenger
	 * @param request
	 * @return
	 */
	public boolean isMicroMessenger(HttpServletRequest request){
		return request.getHeader("User-Agent").contains(DeviceEnum.WINDOWS_CE.getDeviceType());
	}
}
