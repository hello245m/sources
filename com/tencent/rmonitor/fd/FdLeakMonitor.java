package com.tencent.rmonitor.fd;

import android.os.Handler;
import android.os.Message;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import k.i.k.i.c;
import k.i.k.i.d;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class FdLeakMonitor extends QAPMMonitorPlugin implements Handler.Callback {
    public final k.i.k.c.a.a a;
    public final Handler b;
    public final k.i.k.i.i.b c;
    public final c d;
    public long e;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class b {
        public static final FdLeakMonitor a = null;

        public static /* synthetic */ FdLeakMonitor a() {
        }
    }

    public /* synthetic */ FdLeakMonitor(a aVar) {
    }

    public static FdLeakMonitor getInstance() {
    }

    public final boolean e(d dVar) {
    }

    public final boolean f() {
    }

    public final boolean g() {
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

    public FdLeakMonitor() {
    }
}
