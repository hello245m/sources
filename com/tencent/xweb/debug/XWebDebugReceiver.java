package com.tencent.xweb.debug;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebDebugReceiver {
    public static final String ACTION_XWEB_DEBUG = "com.tencent.xweb.debug";
    public static final String TAG = "XWebDebugReceiver";
    public static final BroadcastReceiver receiver = null;
    public static boolean sHasRegister = false;

    /* renamed from: com.tencent.xweb.debug.XWebDebugReceiver$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    public static void register(Context context) {
    }

    public static void unregister(Context context) {
    }
}
