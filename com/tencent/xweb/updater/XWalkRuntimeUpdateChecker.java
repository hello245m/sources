package com.tencent.xweb.updater;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import com.tencent.xweb.updater.XWebHttpTask;
import java.util.HashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWalkRuntimeUpdateChecker extends AsyncTask<Void, Integer, Integer> {
    public static final int CHECK_RET_FETCH_CONFIG = 1;
    public static final int CHECK_RET_NONE = 0;
    public static final String TAG = "XWalkRuntimeUpdateChecker";
    public String mNotifyType;

    /* renamed from: com.tencent.xweb.updater.XWalkRuntimeUpdateChecker$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements IXWebHttpTaskCallback {
        public final /* synthetic */ XWalkRuntimeUpdateChecker this$0;

        /* renamed from: com.tencent.xweb.updater.XWalkRuntimeUpdateChecker$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class RunnableC00961 implements Runnable {
            public final /* synthetic */ AnonymousClass1 this$1;
            public final /* synthetic */ XWebHttpTask.ResultOut val$result;

            public RunnableC00961(AnonymousClass1 anonymousClass1, XWebHttpTask.ResultOut resultOut) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass1(XWalkRuntimeUpdateChecker xWalkRuntimeUpdateChecker) {
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

    public XWalkRuntimeUpdateChecker(HashMap<String, String> hashMap) {
    }

    public static /* synthetic */ void access$000(XWalkRuntimeUpdateChecker xWalkRuntimeUpdateChecker) {
    }

    public static /* synthetic */ String access$100(XWalkRuntimeUpdateChecker xWalkRuntimeUpdateChecker) {
    }

    public static /* synthetic */ void access$200(XWalkRuntimeUpdateChecker xWalkRuntimeUpdateChecker) {
    }

    public static boolean checkNeedFetchConfig() {
    }

    private void checkNeedUpdateRuntime() {
    }

    private boolean doStartUpdateRuntime(XWebCoreScheduler xWebCoreScheduler) {
    }

    @SuppressLint({"StaticFieldLeak"})
    private void fetchConfig() {
    }

    private void notifyCheckFailed() {
    }

    private void notifyNeedDownload() {
    }

    private void notifyUpdateCancelled() {
    }

    private void notifyUpdateCompleted() {
    }

    private void notifyUpdateFailed(int i2) {
    }

    private void startUpdateRuntime(XWebCoreScheduler xWebCoreScheduler) {
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
