package com.tencent.xweb.updater;

import android.os.AsyncTask;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebHttpTask extends AsyncTask<ParaIn, Progress, ResultOut> {
    public static final int ERR_CLOSE_EXCEPTION = -10003;
    public static final int ERR_EXCEPTION = -10002;
    public static final int ERR_INVALID_PARA = -10001;
    public static final int ERR_INVALID_PARA_IN_BG = -10004;
    public static final int ERR_INVALID_RESPONSE = -10005;
    public static final int ERR_PARSE_CONFIG_FAIL = -10006;
    public static final int ERR_TASK_SUCCESS = 0;
    public static final int MAX_RETRY_TIMES = 2;
    public static final long RETRY_INTERVAL = 3000;
    public static final String TAG = "XWebHttpTask";
    public IXWebHttpTaskCallback mCallback;
    public ParaIn mPara;
    public int mRetrytimes;
    public long mStartTs;
    public Timer mTimer;

    /* renamed from: com.tencent.xweb.updater.XWebHttpTask$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 extends TimerTask {
        public final /* synthetic */ XWebHttpTask this$0;

        public AnonymousClass1(XWebHttpTask xWebHttpTask) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class ParaIn {
        public String mFilePath;
        public String mUrl;
        public boolean mUseHttps;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class Progress {
        public long mCurSize;
        public long mTotalSize;
        public String mUrl;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class ResultOut {
        public String mCosMetaMD5;
        public long mCostTime;
        public String mDNSServerIP;
        public String mDownloadTime;
        public String mErrMsg;
        public String mFilePath;
        public int mIsResume;
        public int mNetWorkType;
        public int mRetCode;
        public int mRetryTimes;
        public String mServerIP;
        public long mTotalSize;
        public String mUUID;
        public String mUrl;
    }

    public static /* synthetic */ int access$000(XWebHttpTask xWebHttpTask) {
    }

    public static /* synthetic */ ParaIn access$100(XWebHttpTask xWebHttpTask) {
    }

    public static /* synthetic */ IXWebHttpTaskCallback access$200(XWebHttpTask xWebHttpTask) {
    }

    public static /* synthetic */ void access$300(ParaIn paraIn, IXWebHttpTaskCallback iXWebHttpTaskCallback, int i2) {
    }

    public static /* synthetic */ void access$400(XWebHttpTask xWebHttpTask) {
    }

    public static void addNewTask(ParaIn paraIn, IXWebHttpTaskCallback iXWebHttpTaskCallback) {
    }

    private boolean canRetry(ResultOut resultOut) {
    }

    private String getHttpUserAgent() {
    }

    public static void redoTask(ParaIn paraIn, IXWebHttpTaskCallback iXWebHttpTaskCallback, int i2) {
    }

    private void retryTask() {
    }

    private void stopTimer() {
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ ResultOut doInBackground(ParaIn[] paraInArr) {
    }

    public String getPrintStringResponseHeaders(Map<String, List<String>> map) {
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(ResultOut resultOut) {
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onProgressUpdate(Progress[] progressArr) {
    }

    /* renamed from: doInBackground, reason: avoid collision after fix types in other method */
    public ResultOut doInBackground2(ParaIn... paraInArr) {
    }

    /* renamed from: onPostExecute, reason: avoid collision after fix types in other method */
    public void onPostExecute2(ResultOut resultOut) {
    }

    /* renamed from: onProgressUpdate, reason: avoid collision after fix types in other method */
    public void onProgressUpdate2(Progress... progressArr) {
    }
}
