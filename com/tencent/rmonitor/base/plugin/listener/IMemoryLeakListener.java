package com.tencent.rmonitor.base.plugin.listener;

import com.tencent.rmonitor.base.meta.InspectUUID;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IMemoryLeakListener extends IMemoryDumpListener {
    void onCheckingLeaked(int i2, String str);

    boolean onFilter(Object obj);

    boolean onLeaked(InspectUUID inspectUUID);
}
