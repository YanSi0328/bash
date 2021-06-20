package com.zhangci.commons.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: DataUtil
 * Author: ZhangCi
 *
 * @description: 工具类：时间格式化处理
 * @date: 2021/6/17 15:03
 * @version: 0.1
 * @since: 1.8
 */
public class DataUtil {

    /**
     * @return 格式化后的当前系统时间
     */
    public static String getCurrentSysTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(new Date());
    }
}
