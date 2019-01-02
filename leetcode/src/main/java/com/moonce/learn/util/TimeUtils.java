package com.moonce.learn.util;

import java.util.Date;

public class TimeUtils {
    /**
     * 返回距 1970 年 1 月 1 日之间的毫秒数
     * @return
     */
    public static long getNewDateTime(){
      return  new Date().getTime();
    };
}
