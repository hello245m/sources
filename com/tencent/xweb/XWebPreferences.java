package com.tencent.xweb;

import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebPreferences {
    public static final String TAG = "XWebPreferences";
    public static IXWebPreferences a;
    public static final List<XWebPreferencesListener> b = null;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface XWebPreferencesListener {
        void onWebPreferencesReady();
    }

    public static boolean getBooleanValue(String str) {
    }

    public static int getIntegerValue(String str) {
    }

    public static String getStringValue(String str) {
    }

    public static boolean getValue(String str) {
    }

    public static boolean isReady() {
    }

    public static void registerWebPreferencesListener(XWebPreferencesListener xWebPreferencesListener) {
    }

    public static void setValue(String str, boolean z) {
    }

    public static void setWebPreferences(IXWebPreferences iXWebPreferences) {
    }

    public static void unregisterWebPreferencesListener(XWebPreferencesListener xWebPreferencesListener) {
    }

    public static void setValue(String str, int i2) {
    }

    public static void setValue(String str, String str2) {
    }
}
