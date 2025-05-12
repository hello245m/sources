package com.huawei.agconnect;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class LocalBrdMnger {
    private static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final Object M_LOCK = null;
    private static LocalBrdMnger mInstance;
    private final HashMap<String, ArrayList<ReceiverRecord>> mActions;
    private final Context mAppContext;
    private final Handler mHandler;
    private final ArrayList<BroadcastRecord> mPendingBroadcasts;
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> mReceivers;

    /* renamed from: com.huawei.agconnect.LocalBrdMnger$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 extends Handler {
        public final /* synthetic */ LocalBrdMnger this$0;

        public AnonymousClass1(LocalBrdMnger localBrdMnger, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class BroadcastRecord {
        public final Intent intent;
        public final ArrayList<ReceiverRecord> receivers;

        public BroadcastRecord(Intent intent, ArrayList<ReceiverRecord> arrayList) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class ReceiverRecord {
        public boolean broadcasting;
        public final IntentFilter filter;
        public final BroadcastReceiver receiver;

        public ReceiverRecord(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        }

        public String toString() {
        }
    }

    private LocalBrdMnger(Context context) {
    }

    public static /* synthetic */ void access$000(LocalBrdMnger localBrdMnger) {
    }

    private void executePendingBroadcasts() {
    }

    public static LocalBrdMnger getInstance(Context context) {
    }

    public void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
    }

    public boolean sendBroadcast(Intent intent) {
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
    }
}
