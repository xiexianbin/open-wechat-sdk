package com.qikemi.wechat.api.junit.demo;


import org.apache.log4j.Logger;
import org.junit.Test;

import com.qikemi.wechat.base.utils.DateTimeUtil;

public class DateTimeUtilTest {

	private Logger logger = Logger.getLogger(Demo.class);
	
	@Test
	private void test1(){
		logger.info(DateTimeUtil.getTimeStamp());
	}
}
