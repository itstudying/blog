package com.ljq.blog.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日期工具类
 * 
 * @author
 *
 */
public class DateUtil {

	/**
	 * 获取当前日期 格式:yyyyMMdd
	 * 
	 * @return
	 */
	public static String GetNowDate() {
		String temp_str = "";
		Date dt = new Date();
		// 最后的aa表示“上午”或“下午” HH表示24小时制 如果换成hh表示12小时制
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss
		// aa");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		temp_str = sdf.format(dt);
		return temp_str;
	}

	public static String GetNowTimeByFormat(String format) throws Exception {
		String temp_str = "";
		Date dt = new Date();
		// 最后的aa表示“上午”或“下午” HH表示24小时制 如果换成hh表示12小时制
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss
		// aa");
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		temp_str = sdf.format(dt);
		return temp_str;
	}

	/**
	 * 将日期转换为另一种格式 如2016/6/6 ->2016-06-06
	 * 
	 * @param oldPattern
	 * @param newPattern
	 * @return
	 */
	public static String formatDateString(String oldPattern, String newPattern, String date) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(oldPattern);
		SimpleDateFormat nsdf = new SimpleDateFormat(newPattern);
		Date dt = sdf.parse(date);
		return nsdf.format(dt);

	}

	/**
	 * 获取当前时间 格式:yyyy-MM-dd HH:mm:ss
	 * 
	 * @return
	 */
	public static String GetNowDatetime() {
		String temp_str = "";
		Date dt = new Date();
		// HH表示24小时制 如果换成hh表示12小时制
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		temp_str = sdf.format(dt);
		return temp_str;
	}

	/**
	 * 获取当前时间包含毫秒 格式:yyyy-MM-dd HH:mm:ss.SSS
	 * 
	 * @return
	 */
	public static String GetNowDatetimeWithMills() {
		String temp_str = "";
		Date dt = new Date();
		// HH表示24小时制 如果换成hh表示12小时制
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		temp_str = sdf.format(dt);
		return temp_str;
	}

	/**
	 * 获取当前日期是星期几
	 * 
	 * @param dt
	 * @return 当前日期是星期几
	 */
	public static String getWeekOfDate(Date dt) {
		String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		Calendar cal = Calendar.getInstance();
		cal.setTime(dt);
		int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		if (w < 0)
			w = 0;
		return weekDays[w];
	}

	/**
	 * 获取当前日期是星期几
	 * 
	 * @param dt
	 * @return 当前日期是星期几
	 * @throws ParseException
	 */
	public static String getWeekOfDate(String dt, String pattern) throws ParseException {
		String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		if (dt == null || dt.trim() == "" || dt.length() < 10) {
			return "";
		}
		dt = dt.substring(0, 10);
		Date date = new SimpleDateFormat(pattern).parse(dt);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		if (w < 0)
			w = 0;
		return weekDays[w];
	}

	/**
	 * 获得当月第一天
	 * 
	 * @return
	 */
	public static String getCurMonthFirstDay() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		Date theDate = calendar.getTime();

		GregorianCalendar gcLast = (GregorianCalendar) Calendar.getInstance();
		gcLast.setTime(theDate);
		gcLast.set(Calendar.DAY_OF_MONTH, 1);
		String day_first = df.format(gcLast.getTime());
		return day_first;
	}

	/**
	 * 获得前上个月第一天的凌晨时刻 yyyy-MM-dd 00:00:00
	 * 
	 * @return
	 */
	public static String getPreMonthFirstDay() {
		Calendar calendar = Calendar.getInstance();
		// calendar.setTime(new Date());
		calendar.add(Calendar.MONTH, -1);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(calendar.getTime()) + " 00:00:00";
	}

	/**
	 * 获取上个月的最后一天的最后时刻 yyyy-MM-dd 23:59:59
	 * 
	 * @return
	 */
	public static String getPreMonthLastDay() {
		Calendar calendar = Calendar.getInstance();
		// calendar.setTime(new Date());
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.add(Calendar.DATE, -1);
		String dstr = new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
		return dstr + " 23:59:59";
	}

	/**
	 * 获得前n个月第一天的凌晨时刻 yyyy-MM-dd 00:00:00
	 * 
	 * @return
	 */
	public static String getPreMonthsFirstDay(int n) {
		Calendar calendar = Calendar.getInstance();
		// calendar.setTime(new Date());
		calendar.add(Calendar.MONTH, -1 * n);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(calendar.getTime()) + " 00:00:00";
	}

	/**
	 * 获得下个月的指定时刻 格式 若不指定 则取当前时刻 格式:yyyy-MM-dd HH:mm:ss
	 * 
	 * @return
	 */
	public static String getTodayOfNextMonth(String theDate) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if (null != theDate && !theDate.equals("")) {
			try {
				calendar.setTime(df.parse(theDate));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
			}
		}
		calendar.add(Calendar.MONTH, 1);
		return df.format(calendar.getTime());
	}

	/**
	 * 获得上个月表示 eg:2016-06
	 * 
	 * @return
	 */
	public static String getPreMonth() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, -1);
		return new SimpleDateFormat("yyyy-MM").format(calendar.getTime());
	}

	/**
	 * 取指定日期中的年、月、日
	 * 
	 * @param dataFormat
	 *            yyyy-MM-dd HH:mm:ss
	 * @param date
	 * @param flag
	 *            Y-取年 M-取月 D-取日
	 * @return
	 */
	public static int getYMD(String dateFormat, String date, String flag) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		Calendar cal = Calendar.getInstance();
		Date dt = sdf.parse(date);
		cal.setTime(dt);
		switch (flag) {
		case "Y":
			return cal.get(Calendar.YEAR);
		case "M":
			return cal.get(Calendar.MONTH) + 1;
		case "D":
			return cal.get(Calendar.DAY_OF_MONTH);
		default:
			break;
		}
		return 0;
	}

	/**
	 * 获取某年最后一天日期
	 * 
	 * @param year
	 *            年份
	 * @return Date
	 */
	public static String getLastDayOfYear(int year) throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(Calendar.YEAR, year);
		calendar.roll(Calendar.DAY_OF_YEAR, -1);
		// 格式化日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(calendar.getTime());
	}

	/**
	 * 获取某年某月的最后一天 @Title:getLastDayOfMonth @Description: @param:@param
	 * year @param:@param month @param:@return yyyy-MM-dd @return:String @throws
	 */
	public static String getLastDayOfMonth(int year, int month) throws Exception {
		Calendar cal = Calendar.getInstance();
		// 设置年份
		cal.set(Calendar.YEAR, year);
		// 设置月份
		cal.set(Calendar.MONTH, month - 1);
		// 获取某月最大天数
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		// 设置日历中月份的最大天数
		cal.set(Calendar.DAY_OF_MONTH, lastDay);
		// 格式化日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String lastDayOfMonth = sdf.format(cal.getTime());

		return lastDayOfMonth;
	}

	/**
	 * 得到几天前的时间
	 * 
	 * @param d
	 * @param day
	 * @return
	 */
	public static String getDateBefore(Date d, int day) {
		Calendar now = Calendar.getInstance();
		now.setTime(d);
		now.set(Calendar.DATE, now.get(Calendar.DATE) - day);
		// 格式化日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(now.getTime());

	}

	/**
	 * 得到几天后的时间
	 * 
	 * @param d
	 * @param day
	 * @return
	 */
	public static String getDateAfter(Date d, int day) {
		Calendar now = Calendar.getInstance();
		now.setTime(d);
		now.set(Calendar.DATE, now.get(Calendar.DATE) + day);
		// 格式化日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(now.getTime());
	}

	/**
	 * 比较日期大小 支持yyyy-MM-dd 或 yyyy-MM-dd HH:mm:ss 两种格式
	 * 
	 * @param date1
	 * @param date2
	 * @return
	 * @throws Exception
	 */
	public static int compareDate(String date1, String date2) throws Exception {

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dt1, dt2;
		try {
			dt1 = df.parse(date1);
			dt2 = df.parse(date2);
			return dt1.compareTo(dt2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			df = new SimpleDateFormat("yyyy-MM-dd");
			try {
				dt1 = df.parse(date1);
				dt2 = df.parse(date2);
				return dt1.compareTo(dt2);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				throw new Exception("日期格式不能识别");
			}
		}
	}

}
