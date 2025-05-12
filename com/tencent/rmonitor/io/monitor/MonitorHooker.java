package com.tencent.rmonitor.io.monitor;

import com.tencent.rmonitor.base.meta.IOMeta;
import k.i.k.l.a.a;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class MonitorHooker implements a {
    public static final String[] a = null;

    public static native void addWhiteList(String str);

    public static native boolean doIoHook();

    public static native boolean doIoUnHook();

    public static native IOMeta getIoDetail(int i2);

    public static native long[] getIoStatus();

    public static native void removeWhiteList(String str);

    @Override // k.i.k.l.a.a
    public boolean hook() {
    }

    @Override // k.i.k.l.a.a
    public void unHook() {
    }
}
