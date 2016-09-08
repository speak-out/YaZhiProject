package android.app.yazhi.com.yazhiproject.config;

import android.app.yazhi.com.yazhiproject.utils.MD5Utils;

/**
 * 常量类
 */
public class Constant {
    public static final String serverName ="hair.cloud.net";
    public static String serverIp ="http://test.cloudream.net/";
    public static final String ServerNameMd5= MD5Utils.getMD5(Constant.serverName);

}
