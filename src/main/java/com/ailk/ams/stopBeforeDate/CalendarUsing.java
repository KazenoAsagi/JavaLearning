package com.ailk.ams.stopBeforeDate;

import java.util.Calendar;

/**
 * @author KznAsg
 * @version 2022/11/7  下午 12:03
 * @description 数据-2022-10636
 * @page
 * @link
 */

public class CalendarUsing {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // date 和 day_of_month 是等价的，枚举值也相同
        System.out.println("calendar.get(Calendar.DATE) = " + calendar.get(Calendar.DATE));
        System.out.println("calendar.get(Calendar.DAY_OF_MONTH) = " + calendar.get(Calendar.DAY_OF_MONTH));
        // hour好像一直是0
        System.out.println("calendar.get(Calendar.HOUR) = " + calendar.get(Calendar.HOUR));
        // hour_of_day 才能得到当前小时
        System.out.println("calendar.get(Calendar.HOUR_OF_DAY) = " + calendar.get(Calendar.HOUR_OF_DAY));
        
    }
}
