package com.tencent.tpns.baseapi.base.util;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class TTask implements Runnable {
    public String f;

    public TTask() {
    }

    public abstract void TRun();

    @Override // java.lang.Runnable
    public void run() {
    }

    public TTask(String str) {
    }
}
