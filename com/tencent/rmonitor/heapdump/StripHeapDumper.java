package com.tencent.rmonitor.heapdump;

import android.os.Handler;
import java.io.IOException;
import java.util.Map;
import k.i.k.j.b;
import k.i.k.j.e;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class StripHeapDumper implements e {
    public static boolean b;
    public static final Map<String, String[]> c = null;
    public Handler a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class a {
        public boolean a;
        public IOException b;

        public a(boolean z, IOException iOException) {
        }
    }

    private static native void nDisableHprofStrip();

    private static native void nEnableHprofStrip(String str);

    private static native void nSetHprofStripConfig(int i2);

    private static native void nSetIgnoreHookSo(String str);

    private static native void nSetRegisterHookSo(String str, String str2);

    public void c(String str, b bVar, a aVar) {
    }

    public final void d(String str, a aVar) {
    }

    public void e(String str) {
    }

    public Handler f() {
    }

    public final boolean g() {
    }

    public void h(b bVar, Exception exc) {
    }

    public final void i(int i2) {
    }

    public void j(String str, b bVar) {
    }

    public void k(b bVar) {
    }
}
