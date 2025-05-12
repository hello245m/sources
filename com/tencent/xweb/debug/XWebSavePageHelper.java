package com.tencent.xweb.debug;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.xweb.WebView;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebSavePageHelper {
    public static final String DUMP_DIR = "xweb_dump";
    public static final String DUMP_FILE = "main.html";
    public static final String DUMP_RESOURCE_DIR = "resource";
    public static final String TAG = "XWebSavePageHelper";

    /* renamed from: com.tencent.xweb.debug.XWebSavePageHelper$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ String val$rootPath;

        public AnonymousClass1(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.xweb.debug.XWebSavePageHelper$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass2 implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    /* renamed from: com.tencent.xweb.debug.XWebSavePageHelper$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass3 implements DialogInterface.OnClickListener {
        public final /* synthetic */ String val$strApkName;
        public final /* synthetic */ String val$strApkPath;
        public final /* synthetic */ String val$strDumpPath;
        public final /* synthetic */ WebView val$webView;

        public AnonymousClass3(WebView webView, String str, String str2, String str3) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    public static /* synthetic */ void access$000(WebView webView, String str, String str2, String str3) {
    }

    public static boolean clearSavedPage(Context context, boolean z) {
    }

    public static boolean loadSavedPage(Context context, WebView webView, boolean z) {
    }

    @SuppressLint({"SimpleDateFormat"})
    public static boolean savePage(Context context, WebView webView) {
    }

    public static void loadSavedPage(WebView webView, String str, String str2, String str3) {
    }
}
