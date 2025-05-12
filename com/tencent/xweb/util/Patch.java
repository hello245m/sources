package com.tencent.xweb.util;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class Patch {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class BSpatchHolder {
        public static final Patch a = null;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class DummyHolder {
        public static final Patch a = null;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class HpatchHolder {
        public static final Patch a = null;
    }

    public static Patch getInstance(int i2) {
    }

    public abstract int doPatch(String str, String str2, String str3);
}
