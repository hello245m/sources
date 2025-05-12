package com.vivo.push.util;

import android.content.Context;
import java.lang.reflect.Method;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ContextDelegate {
    private static final String TAG = "ContextDelegate";
    private static Context mContext = null;
    private static Method mCreateCredentialProtectedStorageContext = null;
    private static Method mCreateDeviceProtectedStorageContext = null;
    private static boolean mDelegateEnable = false;
    private static Boolean mIsFbeProject;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class a {
        private static ContextDelegate a;

        public static /* synthetic */ ContextDelegate a() {
        }
    }

    private static Context createCredentialProtectedStorageContext(Context context) {
    }

    private static Context createDeviceProtectedStorageContext(Context context) {
    }

    public static Context getContext(Context context) {
    }

    public static ContextDelegate getInstance() {
    }

    public static boolean isFBEProject() {
    }

    private static void setAppContext() {
    }

    private static void setContext(Context context) {
    }

    public static void setEnable(boolean z) {
    }
}
