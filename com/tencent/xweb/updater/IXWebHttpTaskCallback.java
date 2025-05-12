package com.tencent.xweb.updater;

import com.tencent.xweb.updater.XWebHttpTask;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IXWebHttpTaskCallback {
    void onTaskFailed(XWebHttpTask.ResultOut resultOut);

    void onTaskProgressChanged(XWebHttpTask.Progress progress);

    void onTaskStarted();

    void onTaskSucceed(XWebHttpTask.ResultOut resultOut);
}
