package com.tencent.rmonitor.base.plugin.listener;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IMemoryCeilingListener extends IMemoryDumpListener {
    boolean onCanDump(long j2);

    void onLowMemory(long j2);
}
