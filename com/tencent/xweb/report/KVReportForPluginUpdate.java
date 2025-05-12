package com.tencent.xweb.report;

import com.tencent.xweb.XWebDownloader;
import com.tencent.xweb.updater.XWebHttpTask;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class KVReportForPluginUpdate {
    public static final int PLUGIN_ERRCODE_CONFIG_UPDATE_FAILED = -1;
    public static final int PLUGIN_ERRCODE_EMBED_PREPARE_FAILED = -4;
    public static final int PLUGIN_ERRCODE_NONE = 0;
    public static final int PLUGIN_ERRCODE_PLUGIN_DOWNLOAD_FAILED = -2;
    public static final int PLUGIN_ERRCODE_PLUGIN_INSTALL_FAILED = -3;
    public static final String TAG = "KVReportForPluginUpdate";

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class ConfigReportData {
        public String checkType;
        public XWebHttpTask.ResultOut configDownloadResult;
        public int configErrCode;
        public String configUrl;
        public String configVersion;
        public StringBuilder pluginList;
        public String singlePlugin;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class PluginReportData {
        public ConfigReportData configReportData;
        public int pluginBizType;
        public XWebDownloader.DownloadInfo pluginDownloadResult;
        public long pluginDownloadTime;
        public int pluginErrCode;
        public int pluginInstallRet;
        public long pluginInstallTimeEnd;
        public long pluginInstallTimeStart;
        public String pluginName;
        public String pluginUrl;
        public int pluginVersion;
        public int targetPluginVersion;
    }

    public static void reportPluginConfigUpdate(ConfigReportData configReportData) {
    }

    public static void reportPluginUpdate(PluginReportData pluginReportData) {
    }
}
