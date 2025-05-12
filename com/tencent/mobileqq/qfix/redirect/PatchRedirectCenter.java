package com.tencent.mobileqq.qfix.redirect;

import android.content.Context;
import android.util.SparseArray;
import androidx.annotation.Keep;
import java.io.File;
import java.io.InputStream;
import java.util.List;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class PatchRedirectCenter {
    public static final int CODE_CONFIG_ERROR = 1;
    public static final int CODE_DEX_INJECT_ERROR = 3;
    public static final int CODE_INIT_PATCH_CLASS_ERROR = 2;
    public static final int CODE_SUCCESS = 0;
    private static final String CONFIG_FILE = "config.txt";
    private static final String TAG = "PatchRedirectCenter";
    private static boolean applied;
    private static final List<String> injectedDexPath = null;
    private static SparseArray<IPatchRedirector> redirectors;

    public static synchronized int apply(Context context, String str, String str2) {
    }

    public static void copy(InputStream inputStream, File file) {
    }

    public static IPatchRedirector fakeGetRedirector(int i2, short s2) {
    }

    public static IPatchRedirector getRedirector(int i2, short s2) {
    }

    private static SparseArray<IPatchRedirector> loadPatchClasses(String str) {
    }

    public static void unApply() {
    }

    public static void unzipConfig(String str, String str2) {
    }
}
