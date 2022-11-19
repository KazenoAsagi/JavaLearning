package com.ailk.ams.stopBeforeDate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author KznAsg
 * @version 2022/11/7  下午 4:31
 * @description
 * @page
 * @link
 */

public class StringFormat {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(StringFormat.class);
        log.info(String.format("[数据-2022-10636] 当前时间在%d号的%d小时之前, 不执行该进程", 1, 13));
        
    }
    
}
