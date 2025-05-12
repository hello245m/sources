package com.tencent.xweb.xwalk.plugin;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWalkPluginManager {
    public static final String XWALK_PLUGIN_NAME_EXCEL = "XFilesExcelReader";
    public static final String XWALK_PLUGIN_NAME_FULL_SCREEN_VIDEO = "FullScreenVideo";
    public static final String XWALK_PLUGIN_NAME_OFFICE = "XFilesOfficeReader";
    public static final String XWALK_PLUGIN_NAME_PDF = "XFilesPDFReader";
    public static final String XWALK_PLUGIN_NAME_PPT = "XFilesPPTReader";
    public static final String XWALK_PLUGIN_NAME_TXT = "XFilesTXTReader";
    public static final String XWALK_PLUGIN_NAME_WORD = "XFilesWordReader";
    public static Map<String, XWalkPlugin> a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class PluginInfo {
        public String pluginName;
        public int pluginVersion;

        public PluginInfo(String str, int i2) {
        }
    }

    public static void a() {
    }

    public static void checkFiles() {
    }

    public static void checkKeyFiles(int i2) {
    }

    public static void clearOldVersions() {
    }

    public static String getAllPluginVersionInfo() {
    }

    public static List<XWalkPlugin> getAllPlugins() {
    }

    public static Map<String, Integer> getInstalledPluginVersions(Context context) {
    }

    public static XWalkPlugin getPlugin(String str) {
    }

    public static PluginInfo getPluginInfoFromDir(File file) {
    }

    public static boolean initPlugins() {
    }

    public static void a(String str, String[] strArr, String[] strArr2, String[] strArr3) {
    }
}
