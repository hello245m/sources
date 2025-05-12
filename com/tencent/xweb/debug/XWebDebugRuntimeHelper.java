package com.tencent.xweb.debug;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.WebView;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebDebugRuntimeHelper {
    public static final String TAG = "XWebDebugRuntimeHelper";

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class DebugUpdateListener implements IXWebBroadcastListener {
        public boolean bHasNotifyUpdateProcess;
        public boolean bNeedKill;
        public ProgressDialog mAlertDialog;
        public final Context mContext;
        public final boolean mShouldAlert;
        public final List<String> mUpdateMessages;

        /* renamed from: com.tencent.xweb.debug.XWebDebugRuntimeHelper$DebugUpdateListener$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class AnonymousClass1 implements DialogInterface.OnCancelListener {
            public final /* synthetic */ DebugUpdateListener this$0;

            public AnonymousClass1(DebugUpdateListener debugUpdateListener) {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
            }
        }

        public DebugUpdateListener(Context context, boolean z) {
        }

        public static /* synthetic */ boolean access$000(DebugUpdateListener debugUpdateListener) {
        }

        public static /* synthetic */ Context access$100(DebugUpdateListener debugUpdateListener) {
        }

        private boolean fixActivityContext(Context context, boolean z) {
        }

        private void showMessage(String str) {
        }

        @Override // com.tencent.xweb.IXWebBroadcastListener
        public void onMainCfgUpdated() {
        }

        @Override // com.tencent.xweb.IXWebBroadcastListener
        public void onPluginCfgUpdated() {
        }

        @Override // com.tencent.xweb.IXWebBroadcastListener
        public void onUpdateFinished(int i2) {
        }

        @Override // com.tencent.xweb.IXWebBroadcastListener
        public void onUpdateProgressed(int i2) {
        }

        @Override // com.tencent.xweb.IXWebBroadcastListener
        public void onUpdateStart(int i2) {
        }
    }

    public static String dumpPreferedWebviewType(String str) {
    }

    public static void forceCheckUpdate(Context context, boolean z) {
    }

    public static String getAbstractInfo(WebView webView) {
    }

    public static String getVersionInfo(WebView webView) {
    }
}
