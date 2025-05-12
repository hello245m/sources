package com.tencent.xweb.xwalk.plugin;

import android.content.Context;
import com.tencent.xweb.WCWebUpdater;
import java.util.HashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWalkPluginUpdater implements WCWebUpdater.IWebviewPluginUpdater {
    public static final String TAG = "XWalkPluginUpdater";
    public static final int UPDATE_BIZ_TYPE_PLUGIN_PACKAGE = 1;
    public static final int UPDATE_BIZ_TYPE_PLUGIN_PATCH = 2;
    public XWalkPluginUpdaterChecker mPluginUpdaterChecker;
    public String mSinglePluginToUpdate;
    public XWalkPluginUpdateListener mSingleUpdateListener;

    public static long getLastCheckPluginUpdateTime() {
    }

    public static boolean hasScheduleNeedToUpdate() {
    }

    public static boolean isNeedCheckPluginUpdate() {
    }

    public static boolean isPluginUpdatingByOtherProcess() {
    }

    public static void markPluginUpdateFinishedInProcess() {
    }

    public static void markPluginUpdateStartedInProcess() {
    }

    public static void setLastCheckPluginUpdateTime(long j2) {
    }

    @Override // com.tencent.xweb.WCWebUpdater.IWebviewPluginUpdater
    public void cancelPluginUpdate() {
    }

    @Override // com.tencent.xweb.WCWebUpdater.IWebviewUpdater
    public boolean isBusy() {
    }

    @Override // com.tencent.xweb.WCWebUpdater.IWebviewUpdater
    public boolean needCheckUpdate() {
    }

    @Override // com.tencent.xweb.WCWebUpdater.IWebviewPluginUpdater
    public void setPluginOnlyOneToUpdate(String str, XWalkPluginUpdateListener xWalkPluginUpdateListener) {
    }

    @Override // com.tencent.xweb.WCWebUpdater.IWebviewUpdater
    public void startCheck(Context context, HashMap<String, String> hashMap) {
    }
}
