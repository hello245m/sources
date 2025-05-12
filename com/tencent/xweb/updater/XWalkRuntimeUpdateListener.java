package com.tencent.xweb.updater;

import com.tencent.xweb.util.Scheduler;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface XWalkRuntimeUpdateListener {
    void onXWalkUpdateCancelled();

    void onXWalkUpdateCompleted(Scheduler scheduler);

    void onXWalkUpdateFailed(int i2, Scheduler scheduler);

    void onXWalkUpdateProgress(int i2);

    void onXWalkUpdateStarted(Scheduler scheduler);
}
