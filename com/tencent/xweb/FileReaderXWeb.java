package com.tencent.xweb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import com.tencent.xweb.FileReaderHelper;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.XFileSdk;
import com.tencent.xweb.xwalk.plugin.XWalkPluginUpdateListener;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class FileReaderXWeb {
    public static Map<String, String> a;
    public static WCWebUpdater.IWebviewPluginUpdater b;

    /* renamed from: com.tencent.xweb.FileReaderXWeb$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements XWalkPluginUpdateListener {
        public final /* synthetic */ WeakReference a;
        public final /* synthetic */ WeakReference b;
        public final /* synthetic */ String c;
        public final /* synthetic */ WeakReference d;
        public final /* synthetic */ XWalkReaderBasePlugin e;
        public final /* synthetic */ int f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ boolean f1997i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ FileReaderHelper.OpenFileReportData f1998j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ HashMap f1999k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ XFileSdk.ViewType f2000l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ XFileSdk.ActionCallback f2001m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ValueCallback f2002n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Activity f2003o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f2004p;

        public AnonymousClass1(WeakReference weakReference, WeakReference weakReference2, String str, WeakReference weakReference3, XWalkReaderBasePlugin xWalkReaderBasePlugin, int i2, String str2, String str3, boolean z, FileReaderHelper.OpenFileReportData openFileReportData, HashMap hashMap, XFileSdk.ViewType viewType, XFileSdk.ActionCallback actionCallback, ValueCallback valueCallback, Activity activity, boolean z2) {
        }

        @Override // com.tencent.xweb.xwalk.plugin.XWalkPluginUpdateListener
        public void onXWalkPluginUpdateCompleted(int i2) {
        }

        @Override // com.tencent.xweb.xwalk.plugin.XWalkPluginUpdateListener
        public void onXWalkPluginUpdateProgress(int i2) {
        }

        @Override // com.tencent.xweb.xwalk.plugin.XWalkPluginUpdateListener
        public void onXWalkPluginUpdateStarted() {
        }
    }

    /* renamed from: com.tencent.xweb.FileReaderXWeb$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass2 implements ValueCallback<Pair<String, Object>> {
        public final /* synthetic */ XFileSdk.ActionCallback a;

        public AnonymousClass2(XFileSdk.ActionCallback actionCallback) {
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(Pair<String, Object> pair) {
        }

        /* renamed from: onReceiveValue, reason: avoid collision after fix types in other method */
        public void onReceiveValue2(Pair<String, Object> pair) {
        }
    }

    /* renamed from: com.tencent.xweb.FileReaderXWeb$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass3 implements ValueCallback<Integer> {
        public final /* synthetic */ int a;
        public final /* synthetic */ XWalkReaderBasePlugin b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ FileReaderHelper.OpenFileReportData g;
        public final /* synthetic */ HashMap h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ XFileSdk.ViewType f2005i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Activity f2006j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2007k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ XFileSdk.ActionCallback f2008l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ValueCallback f2009m;

        public AnonymousClass3(int i2, XWalkReaderBasePlugin xWalkReaderBasePlugin, String str, String str2, String str3, boolean z, FileReaderHelper.OpenFileReportData openFileReportData, HashMap hashMap, XFileSdk.ViewType viewType, Activity activity, ViewGroup viewGroup, XFileSdk.ActionCallback actionCallback, ValueCallback valueCallback) {
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(Integer num) {
        }

        /* renamed from: onReceiveValue, reason: avoid collision after fix types in other method */
        public void onReceiveValue2(Integer num) {
        }
    }

    /* renamed from: com.tencent.xweb.FileReaderXWeb$4, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass4 implements ValueCallback<Integer> {
        public final /* synthetic */ int a;
        public final /* synthetic */ XWalkReaderBasePlugin b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ FileReaderHelper.OpenFileReportData g;
        public final /* synthetic */ HashMap h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ XFileSdk.ViewType f2010i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Activity f2011j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2012k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ XFileSdk.ActionCallback f2013l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ValueCallback f2014m;

        public AnonymousClass4(int i2, XWalkReaderBasePlugin xWalkReaderBasePlugin, String str, String str2, String str3, boolean z, FileReaderHelper.OpenFileReportData openFileReportData, HashMap hashMap, XFileSdk.ViewType viewType, Activity activity, ViewGroup viewGroup, XFileSdk.ActionCallback actionCallback, ValueCallback valueCallback) {
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(Integer num) {
        }

        /* renamed from: onReceiveValue, reason: avoid collision after fix types in other method */
        public void onReceiveValue2(Integer num) {
        }
    }

    public static /* synthetic */ WCWebUpdater.IWebviewPluginUpdater a(WCWebUpdater.IWebviewPluginUpdater iWebviewPluginUpdater) {
    }

    public static /* synthetic */ Float b(HashMap hashMap, String str) {
    }

    public static /* synthetic */ Bitmap c(HashMap hashMap, String str) {
    }

    public static /* synthetic */ MotionEvent d(HashMap hashMap, String str) {
    }

    public static /* synthetic */ String e(HashMap hashMap, String str) {
    }

    public static Bitmap f(HashMap<String, Object> hashMap, String str) {
    }

    public static void finishReadFile(String str, String str2) {
    }

    public static Float g(HashMap<String, Object> hashMap, String str) {
    }

    public static XFileSdk.ViewStatus getViewStatus(String str, String str2) {
    }

    public static Integer h(HashMap<String, Object> hashMap, String str) {
    }

    public static MotionEvent i(HashMap<String, Object> hashMap, String str) {
    }

    public static boolean isPluginAvailable(String str, boolean z, boolean z2, int i2) {
    }

    public static String j(HashMap<String, Object> hashMap, String str) {
    }

    public static void readFile(String str, String str2, String str3, boolean z, HashMap<String, String> hashMap, XFileSdk.ViewType viewType, Activity activity, ViewGroup viewGroup, XFileSdk.ActionCallback actionCallback, ValueCallback<Integer> valueCallback) {
    }

    public static boolean requestThumbnail(String str, String str2, int i2) {
    }

    public static boolean setDisableDoubleTap(String str, String str2, boolean z) {
    }

    public static boolean setDisableScroll(String str, String str2, boolean z) {
    }

    public static boolean setTouchEvent(String str, String str2, MotionEvent motionEvent) {
    }

    public static boolean setViewToStatus(String str, String str2, int i2, float f, int i3, int i4) {
    }

    public static /* synthetic */ void a(XWalkReaderBasePlugin xWalkReaderBasePlugin, String str, String str2, String str3, boolean z, FileReaderHelper.OpenFileReportData openFileReportData, HashMap hashMap, XFileSdk.ViewType viewType, Activity activity, ViewGroup viewGroup, XFileSdk.ActionCallback actionCallback, ValueCallback valueCallback) {
    }

    public static void b(XWalkReaderBasePlugin xWalkReaderBasePlugin, String str, String str2, String str3, boolean z, FileReaderHelper.OpenFileReportData openFileReportData, HashMap<String, String> hashMap, XFileSdk.ViewType viewType, Activity activity, ViewGroup viewGroup, XFileSdk.ActionCallback actionCallback, ValueCallback<Integer> valueCallback) {
    }

    public static void c(XWalkReaderBasePlugin xWalkReaderBasePlugin, String str, String str2, String str3, boolean z, FileReaderHelper.OpenFileReportData openFileReportData, HashMap<String, String> hashMap, XFileSdk.ViewType viewType, Activity activity, ViewGroup viewGroup, XFileSdk.ActionCallback actionCallback, ValueCallback<Integer> valueCallback) {
    }

    public static /* synthetic */ void a(String str, int i2, ValueCallback valueCallback, int i3, Context context, FileReaderHelper.OpenFileReportData openFileReportData) {
    }

    public static /* synthetic */ Integer a(HashMap hashMap, String str) {
    }

    public static /* synthetic */ void a(int i2, int i3, XWalkReaderBasePlugin xWalkReaderBasePlugin, String str, String str2, String str3, boolean z, FileReaderHelper.OpenFileReportData openFileReportData, HashMap hashMap, XFileSdk.ViewType viewType, Activity activity, ViewGroup viewGroup, XFileSdk.ActionCallback actionCallback, ValueCallback valueCallback) {
    }

    public static boolean a(XWalkReaderBasePlugin xWalkReaderBasePlugin, String str, String str2, String str3, boolean z, int i2, int i3, FileReaderHelper.OpenFileReportData openFileReportData, HashMap<String, String> hashMap, XFileSdk.ViewType viewType, Activity activity, ViewGroup viewGroup, XFileSdk.ActionCallback actionCallback, ValueCallback<Integer> valueCallback) {
    }

    public static Integer a(String str) {
    }

    public static void b(int i2, int i3, XWalkReaderBasePlugin xWalkReaderBasePlugin, String str, String str2, String str3, boolean z, FileReaderHelper.OpenFileReportData openFileReportData, HashMap<String, String> hashMap, XFileSdk.ViewType viewType, Activity activity, ViewGroup viewGroup, XFileSdk.ActionCallback actionCallback, ValueCallback<Integer> valueCallback) {
    }

    public static void b(String str, int i2, ValueCallback<Integer> valueCallback, int i3, Context context, FileReaderHelper.OpenFileReportData openFileReportData) {
    }
}
