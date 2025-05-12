package com.tencent.xweb.xwalk.plugin;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import com.tencent.xweb.XWebDownloadListener;
import com.tencent.xweb.XWebDownloader;
import com.tencent.xweb.report.KVReportForPluginUpdate;
import com.tencent.xweb.util.SchedulerConfig;

@SuppressLint({"StaticFieldLeak"})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWalkPluginDownloadListener implements XWebDownloadListener {
    public static final int RETCODE_CANCELLED = -3;
    public static final int RETCODE_DOWNLOAD_FAILED = -1;
    public static final int RETCODE_INSTALL_FAILED = -2;
    public static final int RETCODE_SUCCESS = 0;
    public final SchedulerConfig mDownloadCfg;
    public final boolean mIsPatch;
    public final KVReportForPluginUpdate.PluginReportData mPluginReportData;
    public final XWalkPluginUpdaterChecker mUpdaterChecker;
    public final XWalkPlugin mXWalkPlugin;

    /* renamed from: com.tencent.xweb.xwalk.plugin.XWalkPluginDownloadListener$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 extends AsyncTask<Void, Void, Integer> {
        public final /* synthetic */ XWalkPluginDownloadListener this$0;

        public AnonymousClass1(XWalkPluginDownloadListener xWalkPluginDownloadListener) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Integer doInBackground(Void[] voidArr) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Integer num) {
        }

        /* renamed from: doInBackground, reason: avoid collision after fix types in other method */
        public Integer doInBackground2(Void... voidArr) {
        }

        /* renamed from: onPostExecute, reason: avoid collision after fix types in other method */
        public void onPostExecute2(Integer num) {
        }
    }

    public XWalkPluginDownloadListener(XWalkPluginUpdaterChecker xWalkPluginUpdaterChecker, XWalkPlugin xWalkPlugin, SchedulerConfig schedulerConfig, KVReportForPluginUpdate.ConfigReportData configReportData) {
    }

    public static /* synthetic */ KVReportForPluginUpdate.PluginReportData access$000(XWalkPluginDownloadListener xWalkPluginDownloadListener) {
    }

    public static /* synthetic */ XWalkPlugin access$100(XWalkPluginDownloadListener xWalkPluginDownloadListener) {
    }

    public static /* synthetic */ SchedulerConfig access$200(XWalkPluginDownloadListener xWalkPluginDownloadListener) {
    }

    public static /* synthetic */ XWalkPluginUpdaterChecker access$300(XWalkPluginDownloadListener xWalkPluginDownloadListener) {
    }

    @Override // com.tencent.xweb.XWebDownloadListener
    public void onDownloadCancelled() {
    }

    @Override // com.tencent.xweb.XWebDownloadListener
    public void onDownloadCompleted(XWebDownloader.DownloadInfo downloadInfo) {
    }

    @Override // com.tencent.xweb.XWebDownloadListener
    public void onDownloadFailed(XWebDownloader.DownloadInfo downloadInfo) {
    }

    @Override // com.tencent.xweb.XWebDownloadListener
    public void onDownloadStarted(int i2) {
    }

    @Override // com.tencent.xweb.XWebDownloadListener
    public void onDownloadUpdated(int i2) {
    }
}
