package com.qikemi.wechat.api.junit.demo;

import org.apache.log4j.Logger;
import org.junit.Test;

public class Demo {

	private Logger logger = Logger.getLogger(Demo.class);
	
	@Test
	public void test1(){
		logger.debug("hello wechat");
	}
}
