package com.yzp.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConvert {
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //字符串转Date日期
    public static Date s2d(String s){
        try {
            Date d = format.parse(s);
            return d;
        } catch (ParseException e) {
            e.printStackTrace();
        }
            return null;
    }

    //Date日期转字符串
    public static String d2s(Date d){
        String s = TimeConvert.format.format(d);
        return s;
    }
}
