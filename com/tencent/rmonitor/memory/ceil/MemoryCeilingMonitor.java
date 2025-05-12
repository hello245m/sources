package com.tencent.rmonitor.memory.ceil;

import android.os.Handler;
import android.os.Message;
import com.tencent.rmonitor.base.meta.DumpResult;
import com.tencent.rmonitor.base.plugin.listener.IMemoryDumpListener;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import k.i.k.p.d.a;
import k.i.k.p.d.b;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class MemoryCeilingMonitor extends QAPMMonitorPlugin implements Handler.Callback {
    public static boolean g = false;
    public static final a h = null;

    /* renamed from: i, reason: collision with root package name */
    public static volatile MemoryCeilingMonitor f1944i;
    public final k.i.k.c.a.a a;
    public final Handler b;
    public final StringBuilder c;
    public final b d;
    public long e;
    public int f;

    public static DumpResult dumpHprof(String str, IMemoryDumpListener iMemoryDumpListener) {
    }

    public static MemoryCeilingMonitor getInstance() {
    }

    public static void reportHprofFile(DumpResult dumpResult) {
    }

    public final void e() {
    }

    public final boolean f() {
    }

    public final boolean g() {
    }

    public final void h() {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void start() {
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
    }
}
