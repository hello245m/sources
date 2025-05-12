package com.tencent.rmonitor.natmem;

import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import java.util.concurrent.atomic.AtomicBoolean;
import k.i.k.c.b.f.e;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class NatMemMonitor extends QAPMMonitorPlugin {
    public static NatMemMonitor d = null;
    public static boolean e = false;
    public static boolean f;
    public NatMemHandler a;
    public e b;
    public AtomicBoolean c;

    public static NatMemMonitor getInstance() {
    }

    public void e(String str) {
    }

    public void f(String str) {
    }

    public e g() {
    }

    public int h() {
    }

    public void i() {
    }

    public native int nativeDumpNatMemLeakInfo(String str);

    public native int nativeDumpNatMemUsageInfo(String str);

    public native int nativeIgnoreLib(String str);

    public native int nativeInit();

    public native void nativeInitAppHookParameter(int i2);

    public native void nativeInitSysHookParameter(int i2, int i3, int i4);

    public native int nativeRegisterAppLib(String str);

    public native int nativeRegisterSysLib(String str);

    public native void nativeSetUnwindSwtich(boolean z);

    public native int nativeStartHook();

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void start() {
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
    }
}
