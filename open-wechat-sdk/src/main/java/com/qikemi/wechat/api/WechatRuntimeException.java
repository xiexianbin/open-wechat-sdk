package com.qikemi.wechat.api;

/**
 * 
 * Create Date: 2014年8月20日 下午9:54:46
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class WechatRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
    public WechatRuntimeException(){
        super();
    }
    
    public WechatRuntimeException(String message, Throwable cause){
        super(message, cause);
    }
    
    public WechatRuntimeException(String message){
        super(message);
    }
    
    public WechatRuntimeException(Throwable cause){
        super(cause);
    }
}
