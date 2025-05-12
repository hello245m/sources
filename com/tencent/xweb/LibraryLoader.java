package com.tencent.xweb;

import android.content.Context;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class LibraryLoader {
    public static ILibraryLoader a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface ILibraryLoader {
        String findLibrary(Context context, String str);

        void loadLibrary(String str);
    }

    public static String findLibrary(Context context, String str) {
    }

    public static void loadLibrary(String str) {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setLibraryLoader(ILibraryLoader iLibraryLoader) {
    }
}
