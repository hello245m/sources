package com.tencent.xweb.debug;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.webkit.ValueCallback;
import com.tencent.xweb.FileReaderHelper;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import com.tencent.xweb.xwalk.plugin.XWalkPluginUpdateListener;
import com.tencent.xweb.xwalk.plugin.XWalkPluginUpdater;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebDebugPluginHelper {
    public static final String TAG = "XWebDebugPluginHelper";

    /* renamed from: com.tencent.xweb.debug.XWebDebugPluginHelper$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements XWalkPluginUpdateListener {
        public ProgressDialog mAlertDialog;
        public boolean mFinished;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ boolean val$dismissDialog;
        public final /* synthetic */ String val$pluginName;
        public final /* synthetic */ ValueCallback val$retCallback;
        public final /* synthetic */ boolean val$shouldAlert;
        public final /* synthetic */ XWalkPluginUpdater val$updater;

        /* renamed from: com.tencent.xweb.debug.XWebDebugPluginHelper$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class DialogInterfaceOnClickListenerC00951 implements DialogInterface.OnClickListener {
            public final /* synthetic */ AnonymousClass1 this$0;

            public DialogInterfaceOnClickListenerC00951(AnonymousClass1 anonymousClass1) {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
            }
        }

        /* renamed from: com.tencent.xweb.debug.XWebDebugPluginHelper$1$2, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class AnonymousClass2 implements DialogInterface.OnClickListener {
            public final /* synthetic */ AnonymousClass1 this$0;

            public AnonymousClass2(AnonymousClass1 anonymousClass1) {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
            }
        }

        public AnonymousClass1(String str, boolean z, Context context, XWalkPluginUpdater xWalkPluginUpdater, boolean z2, ValueCallback valueCallback) {
        }

        public static /* synthetic */ boolean access$000(AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ ProgressDialog access$100(AnonymousClass1 anonymousClass1) {
        }

        private void showMessage(String str) {
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

    /* renamed from: com.tencent.xweb.debug.XWebDebugPluginHelper$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass2 extends AsyncTask<Void, Void, Boolean> {
        public ProgressDialog loadingDialog;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ boolean val$hideDialog;
        public final /* synthetic */ ValueCallback val$installFinishedCallback;
        public final /* synthetic */ int val$installVersion;
        public final /* synthetic */ boolean val$isFromAsset;
        public final /* synthetic */ String val$localFileName;
        public final /* synthetic */ String val$localFilePath;
        public final /* synthetic */ XWalkPlugin val$plugin;

        /* renamed from: com.tencent.xweb.debug.XWebDebugPluginHelper$2$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class AnonymousClass1 implements DialogInterface.OnClickListener {
            public final /* synthetic */ AnonymousClass2 this$0;

            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
            }
        }

        public AnonymousClass2(Context context, XWalkPlugin xWalkPlugin, int i2, boolean z, String str, String str2, boolean z2, ValueCallback valueCallback) {
        }

        public static /* synthetic */ ProgressDialog access$200(AnonymousClass2 anonymousClass2) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }

        /* renamed from: doInBackground, reason: avoid collision after fix types in other method */
        public Boolean doInBackground2(Void... voidArr) {
        }

        /* renamed from: onPostExecute, reason: avoid collision after fix types in other method */
        public void onPostExecute2(Boolean bool) {
        }
    }

    public static void checkTargetPluginUpdate(Context context, String str, boolean z, boolean z2, ValueCallback<Integer> valueCallback) {
    }

    public static boolean clearAllPlugin() {
    }

    public static boolean clearPlugin(String str) {
    }

    public static boolean forceCheckUpdate(Context context, String str, String str2, boolean z) {
    }

    public static CommandResult forceUseOfficeReader(Context context, String str) {
    }

    public static String getAbstractInfo() {
    }

    public static String getFileReaderTypeInfo() {
    }

    public static String getPluginLocalFileName(String str, boolean z) {
    }

    public static boolean installPluginFromLocalFile(Context context, String str, boolean z, boolean z2, ValueCallback<Boolean> valueCallback) {
    }

    public static boolean installPluginFromLocalFile(Context context, String str, int i2, boolean z, boolean z2, boolean z3, ValueCallback<Boolean> valueCallback) {
    }

    public static boolean forceUseOfficeReader(String str, FileReaderHelper.UseOfficeReader useOfficeReader) {
    }
}
