package com.tencent.xweb.util;

import com.tencent.xweb.DeprecatedOutsideXWebSdk;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebUpdateConfigUtil {
    public static final String DOWNLOAD_CONFIG_URL = "https://dldir1v6.qq.com/weixin/android/wxweb/updateConfig.xml";
    public static final String DOWNLOAD_CONFIG_URL_THIRD_APP = "https://dldir1v6.qq.com/weixin/android/wxweb/updateConfig_public.xml";
    public static final String DOWNLOAD_EXP_CONFIG_URL = "https://dldir1v6.qq.com/weixin/android/wxweb/updateConfig_test.xml";
    public static final String DOWNLOAD_PLUGIN_UPDATE_CONFIG_URL = "https://dldir1v6.qq.com/weixin/android/wxweb/plugin/pluginUpdateConfig.xml";
    public static final String DOWNLOAD_PLUGIN_UPDATE_CONFIG_URL_THIRD_APP = "https://dldir1v6.qq.com/weixin/android/wxweb/plugin/pluginUpdateConfig_public.xml";
    public static final String DOWNLOAD_PLUGIN_UPDATE_EXP_CONFIG_URL = "https://dldir1v6.qq.com/weixin/android/wxweb/plugin/pluginUpdateConfig_exp.xml";
    public static final String DOWNLOAD_PLUGIN_UPDATE_TEST_CONFIG_URL = "https://dldir1v6.qq.com/weixin/android/wxweb/plugin/pluginUpdateConfig_test.xml";
    public static final String DOWNLOAD_URL_PREFIX_FOR_BASE_CONFIG = "https://dldir1v6.qq.com/weixin/android/wxweb/";
    public static final String DOWNLOAD_URL_PREFIX_FOR_PLUGIN_CONFIG = "https://dldir1v6.qq.com/weixin/android/wxweb/plugin/";
    public static final String TAG = "XWebUpdateConfigUtil";
    public static final int XWALK_PLUGIN_UPDATE_PERIOD_DEFAULT = 90000000;
    public static long a = 0;
    public static int b = -1;
    public static String c;
    public static String d;

    public static long getBaseConfigUpdatePeriod() {
    }

    public static String getBaseConfigUrl() {
    }

    public static int getPluginConfigUpdatePeriod() {
    }

    public static String getPluginConfigUrl() {
    }

    public static int getPluginUpdatePeriod() {
    }

    public static String getTempBaseConfigUrl() {
    }

    public static String getTempPluginConfigUrl() {
    }

    public static String getTestBaseConfigUrl() {
    }

    public static String getTestPluginConfigUrl() {
    }

    public static boolean isValidConfigHost(String str) {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setBaseConfigUpdatePeriod(long j2) {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setPluginConfigUpdatePeriod(int i2) {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setTempBaseConfigUrl(String str) {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setTempPluginConfigUrl(String str) {
    }

    public static boolean setTestBaseConfigUrl(String str) {
    }

    public static boolean setTestPluginConfigUrl(String str) {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean setTempBaseConfigUrl(String str, String str2) {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setTempPluginConfigUrl(String str, String str2) {
    }
}
