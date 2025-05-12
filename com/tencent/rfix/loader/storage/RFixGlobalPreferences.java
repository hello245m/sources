package com.tencent.rfix.loader.storage;

import android.content.Context;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class RFixGlobalPreferences {
    private static final String FILE_NAME = "RFixGlobalPreferences";
    private static final String KEY_NATIVE_LOG_DIR = "key_native_log_dir";
    private static final String KEY_SAFE_MODE_INTERCEPT_VERSION = "key_safe_mode_intercept_version";
    public String nativeLogDir;
    public String safeModeInterceptVersion;

    private RFixGlobalPreferences() {
    }

    public static RFixGlobalPreferences load(Context context) {
    }

    public static void store(RFixGlobalPreferences rFixGlobalPreferences, Context context) {
    }
}
