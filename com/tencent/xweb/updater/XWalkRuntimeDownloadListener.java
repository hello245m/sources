package com.tencent.xweb.updater;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import com.tencent.xweb.XWebDownloadListener;
import com.tencent.xweb.XWebDownloader;

@SuppressLint({"StaticFieldLeak"})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWalkRuntimeDownloadListener implements XWebDownloadListener {
    public static final String TAG = "XWalkRuntimeDownloadListener";
    public final UpdateConfig mConfig;
    public final XWebRuntimeInstaller mXWebRuntimeInstaller;

    /* renamed from: com.tencent.xweb.updater.XWalkRuntimeDownloadListener$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 extends AsyncTask<Void, Void, Integer> {
        public final /* synthetic */ XWalkRuntimeDownloadListener this$0;

        public AnonymousClass1(XWalkRuntimeDownloadListener xWalkRuntimeDownloadListener) {
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

    public XWalkRuntimeDownloadListener(UpdateConfig updateConfig, XWebRuntimeInstaller xWebRuntimeInstaller) {
    }

    public static /* synthetic */ XWebRuntimeInstaller access$000(XWalkRuntimeDownloadListener xWalkRuntimeDownloadListener) {
    }

    public static /* synthetic */ UpdateConfig access$100(XWalkRuntimeDownloadListener xWalkRuntimeDownloadListener) {
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
