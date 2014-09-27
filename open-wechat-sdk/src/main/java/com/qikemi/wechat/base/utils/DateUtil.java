package com.qikemi.wechat.base.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * 
 * Create Date: 2014年8月20日 下午10:20:22
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class DateUtil {

	private static Logger logger = Logger.getLogger(DateUtil.class);
	
	/**
	 * 20140819
	 */
	public final static String YYYYMMDD = "yyyyMMdd";
	
	/**
	 * 2014-08-19
	 */
	public final static String YYYY_MM_DD = "yyyy-MM-dd";
	
	/**
	 * 2014/08/19
	 */
	public final static String YYYY1MM1DD = "yyyy/MM/dd";
	
	/**
	 * 20140819092301
	 */
	public final static String YYYYMMDDhhMMss = "yyyyMMddhhmmss";
	
	/**
	 * 20140819212301
	 */
	public final static String YYYYMMDDHHMMss = "yyyyMMddHHmmss";
	
	/**
	 * 20140819092301001
	 */
	public final static String YYYYMMDDhhMMssSSS = "yyyyMMddhhmmssSSS";
	
	/**
	 * 20140819212301001
	 */
	public final static String YYYYMMDDHHMMssSSS = "yyyyMMddHHmmssSSS";
	
	/**
	 * 2014-08-19 09:23:01
	 */
	public final static String YYYY_MM_DD__hhMMss = "yyyy-MM-dd hh:mm:ss";
	
	/**
	 * 2014-08-19 21:23:01
	 */
	public final static String YYYY_MM_DD__HHMMss = "yyyy-MM-dd HH:mm:ss";
	
	/**
	 * 2014/08/19 09:23:01
	 */
	public final static String YYYY1MM1DD1__hhMMss = "yyyy/MM/dd hh:mm:ss";
	
	/**
	 * 2014/08/19 21:23:01
	 */
	public final static String YYYY1MM1DD1__HHMMss = "yyyy/MM/dd HH:mm:ss";
	
	public static Calendar calendar = null;
	
	/**
	 * 默认构造器 
	 */
	public DateUtil(){}
	
	/**
	 * 创建指定格式的日期
	 * @param dateFormat
	 * @return
	 */
	public static String dateCreater(String dateFormat) {
		Date date = new Date();
		if (dateFormat == null || "".equals(dateFormat)) {
			dateFormat = DateUtil.YYYY_MM_DD__HHMMss;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		return sdf.format(date);
	}
	
	/**
	 * 创建指定格式的日期
	 * @param date
	 * @param dateFormat
	 * @return
	 */
	public static String dateCreater(Date date, String dateFormat) {
		if (date == null || dateFormat == null || "".equals(dateFormat)) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		return sdf.format(date);
	}
	
	/**
	 * 将字符串型日期强转为Date类型
	 * @param dateStr
	 * @param dateFromat
	 * @return
	 */
	public static Date format2Date(String dateStr, String dateFromat){
		if(dateStr == null || dateFromat == null){
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
		Date date = null;
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			logger.warn("--> when Format dateStr: " + dateStr + ", to dateFormat: " 
					+ dateFromat + ". Occur an Exception: " + e.toString());
			return null;
		}
		return date;
	}
	
	/**
	 * 功能描述：返回年份
	 * 
	 * @param date
	 *            Date 日期
	 * @return 返回年份
	 */
	public static int getYear(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.YEAR);
	}

	/**
	 * 功能描述：返回月份
	 * 
	 * @param date
	 *            Date 日期
	 * @return 返回月份
	 */
	public static int getMonth(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MONTH) + 1;
	}

	/**
	 * 功能描述：返回日份
	 * 
	 * @param date
	 *            Date 日期
	 * @return 返回日份
	 */
	public static int getDay(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 功能描述：返回小时
	 * 
	 * @param date
	 *            日期
	 * @return 返回小时
	 */
	public static int getHour(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.HOUR_OF_DAY);
	}

	/**
	 * 功能描述：返回分钟
	 * 
	 * @param date
	 *            日期
	 * @return 返回分钟
	 */
	public static int getMinute(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MINUTE);
	}

	/**
	 * 返回秒钟
	 * 
	 * @param date
	 *            Date 日期
	 * @return 返回秒钟
	 */
	public static int getSecond(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.SECOND);
	}

	/**
	 * 功能描述：返回毫秒
	 * 
	 * @param date
	 *            日期
	 * @return 返回毫秒
	 */
	public static long getMillis(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.getTimeInMillis();
	}
	
	/**
	 * 功能描述：日期相减
	 * 
	 * @param date
	 *            Date 日期
	 * @param date1
	 *            Date 日期
	 * @return 返回相减后的日期
	 */
	public static int diffDate(Date date, Date date1) {
		return (int) ((getMillis(date) - getMillis(date1)) / (24 * 3600 * 1000));
	}
	
	/**
	 * 功能描述：日期相加
	 * 
	 * @param date
	 *            Date 日期
	 * @param day
	 *            int 天数
	 * @return 返回相加后的日期
	 */
	public static Date addDate(Date date, int day) {
		calendar = Calendar.getInstance();
		long millis = getMillis(date) + ((long) day) * 24 * 3600 * 1000;
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}
	
	/**
	 * 获取当前的时间戳（毫秒）
	 * @return
	 */
	public static Long getTimeStamp(){
		return System.currentTimeMillis() / 1000;
	}
	
	/**
	 * 获取当前的时间戳（毫秒）
	 * @return
	 */
	public static Long getTimeStamps(){
		return System.currentTimeMillis();
	}
}
