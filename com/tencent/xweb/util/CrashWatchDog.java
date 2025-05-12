package com.tencent.xweb.util;

import android.content.SharedPreferences;
import com.tencent.xweb.WebView;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class CrashWatchDog {
    public static final String SCENE_CREATE_WEBVIEW = "CREATE_WEBVIEW";
    public static final String SCENE_LOAD_CORE = "LOAD_CORE";
    public SharedPreferences a;
    public String b;
    public String c;
    public String d;
    public long e;
    public long f;
    public long g;
    public String h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2036i;

    public CrashWatchDog(String str, WebView.WebViewKind webViewKind) {
    }

    public static String a(String str, WebView.WebViewKind webViewKind) {
    }

    public static synchronized CrashWatchDog b(String str, WebView.WebViewKind webViewKind) {
    }

    public static synchronized CrashWatchDog getInstanceForCurModule(String str, WebView.WebViewKind webViewKind) {
    }

    public static synchronized CrashWatchDog getInstanceForModule(String str, WebView.WebViewKind webViewKind, String str2) {
    }

    public static synchronized boolean hasRecentCrash(WebView.WebViewKind webViewKind, String str) {
    }

    public final synchronized boolean c() {
    }

    public long getRetryCount() {
    }

    public synchronized void logFinished() {
    }

    public synchronized void logStart() {
    }

    public final String a(long j2) {
    }

    public final synchronized boolean b(long j2) {
    }

    public final int a() {
    }

    public final int b() {
    }

    public static synchronized boolean hasRecentCrash(WebView.WebViewKind webViewKind) {
    }

    public static synchronized SharedPreferences c(String str, WebView.WebViewKind webViewKind) {
    }
}
