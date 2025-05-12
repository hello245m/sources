package com.tencent.tpns.baseapi.base.util;

import android.content.Context;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class CacheHelper {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class Key<T> {
        public String file;
        public boolean md5Key;
        public boolean multiProcess;
        public String name;
        public boolean useMemoryCache;
        public T value;

        public Key(String str, String str2, T t2) {
        }

        public Key<T> file(String str) {
        }

        public Key<T> name(String str) {
        }

        public Key<T> set(T t2) {
        }
    }

    public static <T> T get(Context context, Key<T> key) {
    }

    public static void set(Context context, Key<?>... keyArr) {
    }
}
