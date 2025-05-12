package com.tencent.rfix.loader;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.rfix.loader.entity.RFixLoadResult;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class RFixLoaderImmediate {
    private static final String ACTION_IMMEDIATE_LOAD = "ACTION_IMMEDIATE_LOAD";
    private static final String ACTION_IMMEDIATE_UNLOAD = "ACTION_IMMEDIATE_UNLOAD";
    private static final String TAG = "RFix.RFixLoaderImmediate";
    private static Application application;
    private static boolean initialized;
    private static RFixLoadResult lastLoadResult;
    private static ImmediateLoadListener listener;

    /* renamed from: com.tencent.rfix.loader.RFixLoaderImmediate$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.rfix.loader.RFixLoaderImmediate$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class AnonymousClass2 extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface ImmediateLoadListener {
        void onLoadResult(RFixLoadResult rFixLoadResult);
    }

    public static /* synthetic */ void access$000() {
    }

    public static /* synthetic */ Application access$100() {
    }

    public static RFixLoadResult getLastLoadResult() {
    }

    public static void initialize(Application application2) {
    }

    private static void notifyImmediateEffect(String str) {
    }

    private static void registerImmediateEffectReceiver() {
    }

    public static void setListener(ImmediateLoadListener immediateLoadListener) {
    }

    public static void tryLoad() {
    }

    private static void tryLoadInternal() {
    }

    public static void tryUnload() {
    }
}
