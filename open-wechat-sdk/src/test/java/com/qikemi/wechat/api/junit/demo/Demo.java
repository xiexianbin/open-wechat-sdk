package com.qikemi.wechat.api.junit.demo;

import java.util.UUID;

import org.apache.log4j.Logger;
import org.junit.Test;

public class Demo {

	private Logger logger = Logger.getLogger(Demo.class);
	
	@Test
	public void test1(){
		logger.debug("hello wechat");
	}
	
	@Test
	public void test2(){
		String s = UUID.randomUUID().toString() + UUID.randomUUID().toString();
		logger.debug(s.replace("-", ""));
	}
}
