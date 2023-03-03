package com.yikes.common.utils;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.util.ObjectUtil;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <pre>
 *
 * </pre>
 *
 * @author guanrong.yin
 * @date 2023/3/3 22:43
 * @description: TODO
 */
public class DateCoreUtils {

    public static final String FORMAT_YEAR_TO_DD = "yyyyMMdd";

    public static final String FORMAT_STAND = "yyyy-MM-dd HH:mm:ss";

    /**
     * 两个日期之间的所有日期
     * @param startDate
     * @param endDate
     * @return
     */
    public static List<LocalDate> getDatesBetweenUsing(LocalDate startDate, LocalDate endDate) {

        if (ObjectUtil.isEmpty(startDate) || ObjectUtil.isEmpty(endDate)) {
            return Collections.emptyList();
        }
        // 日期加1(包含结束)
        LocalDate localDate = endDate.plusDays(+1);

        long numOfDaysBetween = ChronoUnit.DAYS.between(startDate, localDate);
        return IntStream.iterate(0, i -> i + 1)
                .limit(numOfDaysBetween)
                .mapToObj(startDate::plusDays)
                .collect(Collectors.toList());
    }

    /**
     * 两个日期之间的所有日期（String）格式
     * @param startDate
     * @param endDate
     * @return
     */
    public static List<String> getDatesBetweenUsingString(LocalDate startDate, LocalDate endDate) {

        if (ObjectUtil.isEmpty(startDate) || ObjectUtil.isEmpty(endDate)) {
            return Collections.emptyList();
        }

        List<String> list = new ArrayList<>();
        // 日期加1(包含结束)
        LocalDate localDate = endDate.plusDays(+1);

        long numOfDaysBetween = ChronoUnit.DAYS.between(startDate, localDate);
        List<LocalDate> dateList = IntStream.iterate(0, i -> i + 1)
                .limit(numOfDaysBetween)
                .mapToObj(startDate::plusDays)
                .collect(Collectors.toList());

        for (LocalDate date : dateList) {
            DateTimeFormatter pattern = DateTimeFormatter.ofPattern(DatePattern.NORM_DATE_PATTERN);
            String time = pattern.format(date);

            list.add(time);
        }
        return list;
    }

    /**
     * 获取两个日期相差的天数
     * @param beginDateTime
     * @param endDateTime
     * @return
     */
    public static Integer getDaySub(LocalDateTime beginDateTime, LocalDateTime endDateTime){
        return endDateTime.getDayOfYear()-beginDateTime.getDayOfYear();
    }

    /**
     * 获取一天最早的时间
     * @param dateTime
     * @return
     */
    public static LocalDateTime getFirstDateTimeOfDay(LocalDateTime dateTime){
        return LocalDateTime.of(dateTime.toLocalDate(), LocalTime.MIN);
    }

    /**
     * 获取一天最晚的时间
     * @param dateTime
     * @return
     */
    public static LocalDateTime getLastDateTimeOfDay(LocalDateTime dateTime){
        return LocalDateTime.of(dateTime.toLocalDate(), LocalTime.MAX);
    }

    /**
     * 获取一个月内的最早一天
     * @param dateTime
     * @return
     */
    public static LocalDateTime getFirstDateTimeOfMonth(LocalDateTime dateTime){
        return LocalDateTime.of(LocalDate.from(dateTime.toLocalDate().with(TemporalAdjusters.firstDayOfMonth())), LocalTime.MIN);
    }

    /**
     * LocalDateTime 转换成 Date
     * @param localDateTime
     * @return
     */
    public static Date asDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 日期转换成字符串
     * @param date
     * @param format
     * @return
     */
    public static String getStringByDate(Date date,String format) {
        SimpleDateFormat sf = new SimpleDateFormat(format);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        return sf.format(calendar.getTime());

    }

}
