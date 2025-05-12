package com.tencent.bugly.common.network;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class NetworkWatcher {
    private static final String ACTION_CONN_CHANGE = "android.net.conn.CONNECTIVITY_CHANGE";
    public static final NetworkWatcher INSTANCE = null;
    private static final String TAG = "Bugly_NetWatcher";
    private static volatile Apn apn;
    private static WeakReference<Context> ctx;
    private static Handler handler;
    private static volatile boolean isInited;
    private static volatile boolean isNetAvailable;
    private static volatile boolean isWifiAvailable;
    private static final NetworkWatcher$netStatusReceive$1 netStatusReceive = null;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = null;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2 = null;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3 = null;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4 = null;
    }

    private NetworkWatcher() {
    }

    public static final /* synthetic */ void access$checkConnInfo(NetworkWatcher networkWatcher) {
    }

    public static final /* synthetic */ WeakReference access$getCtx$p(NetworkWatcher networkWatcher) {
    }

    public static final /* synthetic */ Handler access$getHandler$p(NetworkWatcher networkWatcher) {
    }

    public static final /* synthetic */ void access$setCtx$p(NetworkWatcher networkWatcher, WeakReference weakReference) {
    }

    public static final /* synthetic */ void access$setHandler$p(NetworkWatcher networkWatcher, Handler handler2) {
    }

    private final void checkConnInfo() {
    }

    private final Apn getApn() {
    }

    private final NetworkState getNetworkState() {
    }

    private final String getOperatorName() {
    }

    private final Apn processApn(String str, NetworkState networkState) {
    }

    private final void resetApn() {
    }

    public final void init(Context context) {
    }

    public final boolean isNetAvailable() {
    }

    public final boolean isWifiAvailable() {
    }

    public final void setNetAvailable(boolean z) {
    }

    public final void setWifiAvailable(boolean z) {
    }

    public final void unInit() {
    }

    private final Apn getApn(NetworkState networkState) {
    }
}
