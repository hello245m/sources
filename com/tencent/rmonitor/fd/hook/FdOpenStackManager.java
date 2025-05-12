package com.tencent.rmonitor.fd.hook;

import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class FdOpenStackManager {
    public static boolean a;
    public static List<String> b;
    public static final String[] c = null;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class a extends ArrayList<String> {
    }

    public static void a() {
    }

    public static boolean b(String str) {
    }

    public static boolean c() {
    }

    private static native void nDisableFdOpenHook();

    private static native boolean nDumpFdOpenStacks(String str);

    private static native void nEnableFdOpenHook();

    private static native void nSetIgnoreHookSo(String str);

    private static native void nSetRegisterHookSo(String str);
}
