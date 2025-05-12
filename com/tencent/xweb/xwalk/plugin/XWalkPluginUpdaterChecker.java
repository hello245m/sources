package com.tencent.xweb.xwalk.plugin;

import android.os.AsyncTask;
import com.tencent.xweb.report.KVReportForPluginUpdate;
import com.tencent.xweb.updater.IXWebHttpTaskCallback;
import com.tencent.xweb.updater.XWebHttpTask;
import com.tencent.xweb.util.ConfigDef;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWalkPluginUpdaterChecker extends AsyncTask<String, Integer, Integer> {
    public static final int STATUS_DOWNLOAD = 3;
    public static final int STATUS_FETCH_CONFIG = 2;
    public static final int STATUS_FINISHED = 5;
    public static final int STATUS_NOT_STARTED = 0;
    public static final int STATUS_START_PREPARE = 1;
    public static final int STATUS_USER_CANCEL = 4;
    public static final String TAG = "XWalkPluginUpdaterChecker";
    public static final int TASK_TYPE_CDN = 2;
    public static final int TASK_TYPE_HTTP = 1;
    public boolean isAllFinished;
    public final String mConfigDownloadUrl;
    public final KVReportForPluginUpdate.ConfigReportData mConfigReportData;
    public final Object mLocker;
    public String mNotifyType;
    public String mSinglePluginToUpdate;
    public XWalkPluginUpdateListener mSingleUpdateListener;
    public final StatusInfo mStatusInfo;
    public int mTaskCancelledCount;
    public int mTaskCount;
    public int mTaskDownloadFailedCount;
    public int mTaskInstallFailedCount;
    public final Map<String, TaskInfo> mTaskMap;
    public int mTaskSuccessCount;

    /* renamed from: com.tencent.xweb.xwalk.plugin.XWalkPluginUpdaterChecker$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements IXWebHttpTaskCallback {
        public final /* synthetic */ XWalkPluginUpdaterChecker this$0;

        public AnonymousClass1(XWalkPluginUpdaterChecker xWalkPluginUpdaterChecker) {
        }

        private ConfigDef.Patch findAvailablePatch(ConfigDef.PluginInfo pluginInfo, int i2) {
        }

        private ConfigDef.PluginInfo findMatchedPluginInfo(ConfigDef.PluginConfig pluginConfig, String str, int i2, boolean z) {
        }

        @Override // com.tencent.xweb.updater.IXWebHttpTaskCallback
        public void onTaskFailed(XWebHttpTask.ResultOut resultOut) {
        }

        @Override // com.tencent.xweb.updater.IXWebHttpTaskCallback
        public void onTaskProgressChanged(XWebHttpTask.Progress progress) {
        }

        @Override // com.tencent.xweb.updater.IXWebHttpTaskCallback
        public void onTaskStarted() {
        }

        @Override // com.tencent.xweb.updater.IXWebHttpTaskCallback
        public void onTaskSucceed(XWebHttpTask.ResultOut resultOut) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class StatusInfo {
        public int curStatus;
        public int errCode;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class TaskInfo {
        public AsyncTask task;
        public boolean taskFinished;
        public int type;
    }

    public static /* synthetic */ KVReportForPluginUpdate.ConfigReportData access$000(XWalkPluginUpdaterChecker xWalkPluginUpdaterChecker) {
    }

    public static /* synthetic */ boolean access$100(XWalkPluginUpdaterChecker xWalkPluginUpdaterChecker, int i2, int i3) {
    }

    public static /* synthetic */ String access$200(XWalkPluginUpdaterChecker xWalkPluginUpdaterChecker) {
    }

    public static /* synthetic */ boolean access$300(XWalkPluginUpdaterChecker xWalkPluginUpdaterChecker) {
    }

    public static /* synthetic */ String access$400(XWalkPluginUpdaterChecker xWalkPluginUpdaterChecker) {
    }

    public static /* synthetic */ boolean access$500(XWalkPluginUpdaterChecker xWalkPluginUpdaterChecker, int i2, Map map) {
    }

    private void doFetchPluginUpdateConfig() {
    }

    private boolean isSetSinglePluginToUpdate() {
    }

    private void processAfterStatusUpdate(int i2, int i3, int i4) {
    }

    private void tryInstallEmbedPlugins() {
    }

    private boolean updateStatus(int i2) {
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Integer doInBackground(String[] strArr) {
    }

    public boolean isBusy() {
    }

    public void onNotifyProgress(String str, int i2) {
    }

    public void onNotifyResult(String str, int i2) {
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Integer num) {
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
    }

    public void setParams(HashMap<String, String> hashMap, String str, XWalkPluginUpdateListener xWalkPluginUpdateListener) {
    }

    public void tryCancelUpdate() {
    }

    private boolean updateStatus(int i2, int i3) {
    }

    /* renamed from: doInBackground, reason: avoid collision after fix types in other method */
    public Integer doInBackground2(String... strArr) {
    }

    /* renamed from: onPostExecute, reason: avoid collision after fix types in other method */
    public void onPostExecute2(Integer num) {
    }

    private boolean updateStatus(int i2, Map<String, TaskInfo> map) {
    }

    private boolean updateStatus(int i2, int i3, Map<String, TaskInfo> map) {
    }
}
