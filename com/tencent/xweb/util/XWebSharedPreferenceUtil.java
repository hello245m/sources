package com.tencent.xweb.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.xweb.ISharedPreferenceProvider;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebSharedPreferenceUtil {
    public static final String SP_KEY_FILE_READER_DOWNLOAD_LIMITER_POSTFIX_COUNT = "_download_count";
    public static final String SP_KEY_FILE_READER_DOWNLOAD_LIMITER_POSTFIX_DATE = "_download_date";
    public static final String SP_KEY_FILE_READER_POSTFIX_COUNT = "_count";
    public static final String SP_KEY_FILE_READER_POSTFIX_REPORT_UV_DATE = "_report_uv_date";
    public static final String SP_KEY_FILE_READER_POSTFIX_TIME = "_time";
    public static final String SP_KEY_PLUGIN_AVAILABLE_VERSION = "availableVersion";
    public static final String SP_KEY_PLUGIN_LAST_ENV_INFO = "lastEnvInfo";
    public static final String SP_KEY_PLUGIN_LAST_REPORT_DATE = "lastReportDate";
    public static final String SP_KEY_PLUGIN_LAST_REPORT_VERSION = "lastReportVersion";
    public static final String SP_KEY_PLUGIN_PATCH_DOWNLOAD_COUNT_PREFIX = "patchDownloadCount_";
    public static final String SP_KEY_PLUGIN_SUPPORT_FORMATS = "supportFormats";
    public static final String SP_KEY_PLUGIN_UPDATE_CONFIG_LAST_FETCH_TIME = "nLastFetchPluginConfigTime";
    public static final String SP_KEY_PLUGIN_UPDATE_PROCESS_ID = "nUpdatingProcessId";
    public static final String SP_NAME_FILE_READER_RECORD = "xwalk_reader_record";
    public static final String SP_NAME_VERSION_INFO = "XWALKINFOS";
    public static final String TAG = "XWebSharedPreferenceUtil";
    public static ISharedPreferenceProvider a;
    public static Context b;

    public static SharedPreferences a(String str) {
    }

    public static Context getApplicationContext() {
    }

    public static SharedPreferences getMMKVSharedPreferences(String str) {
    }

    public static SharedPreferences getMMKVSharedPreferencesForCommandCfg() {
    }

    public static SharedPreferences getMMKVSharedPreferencesForCommandCfgLatest() {
    }

    public static SharedPreferences getMMKVSharedPreferencesForCommandCfgPlugin() {
    }

    public static SharedPreferences getMMKVSharedPreferencesForCommandCfgPluginLatest() {
    }

    public static SharedPreferences getMMKVSharedPreferencesForEmbedInstall(String str) {
    }

    public static SharedPreferences getMMKVSharedPreferencesForFrequentLimiter() {
    }

    public static SharedPreferences getMMKVSharedPreferencesForLog() {
    }

    public static SharedPreferences getMMKVSharedPreferencesForReportDaily() {
    }

    public static SharedPreferences getMMKVSharedPreferencesForScheduler(String str) {
    }

    public static SharedPreferences getMMKVSharedPreferencesForUpdatingTag() {
    }

    public static SharedPreferences getMMKVSharedPreferencesForXWebUserInfo() {
    }

    public static SharedPreferences getMMKVSharedPreferencesForXWebValueChanged() {
    }

    public static SharedPreferences getMMKVSharedPreferencesTransportOld(String str) {
    }

    public static SharedPreferences getSharedPreferencesForFileReaderRecord() {
    }

    public static SharedPreferences getSharedPreferencesForMultiProcess() {
    }

    public static SharedPreferences getSharedPreferencesForPluginUpdateInfo() {
    }

    public static SharedPreferences getSharedPreferencesForPluginVersionInfo(String str) {
    }

    public static SharedPreferences getSharedPreferencesForUpdateConfig() {
    }

    public static SharedPreferences getSharedPreferencesForUsingCoreVersion() {
    }

    public static SharedPreferences getSharedPreferencesForVersionInfo() {
    }

    public static SharedPreferences getSharedPreferencesForWebDebug() {
    }

    public static SharedPreferences getSharedPreferencesForXWalkCore() {
    }

    public static void setApplicationContext(Context context) {
    }

    public static synchronized void setSharedPreferenceProvider(ISharedPreferenceProvider iSharedPreferenceProvider) {
    }

    public static SharedPreferences a(String str, boolean z) {
    }
}
