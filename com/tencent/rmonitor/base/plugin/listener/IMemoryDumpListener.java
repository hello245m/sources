package com.tencent.rmonitor.base.plugin.listener;

import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IMemoryDumpListener extends IBaseListener {
    void onFinishDump(boolean z, String str, String str2);

    void onHprofDumped(String str);

    List<String> onPrepareDump(String str);
}
