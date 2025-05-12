package com.tencent.xweb.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class LocalBroadcastManager {
    public static final Object f = null;
    public static LocalBroadcastManager g;
    public final Context a;
    public final HashMap<BroadcastReceiver, ArrayList<ReceiverRecord>> b;
    public final HashMap<String, ArrayList<ReceiverRecord>> c;
    public final ArrayList<BroadcastRecord> d;
    public final Handler e;

    /* renamed from: com.tencent.xweb.util.LocalBroadcastManager$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 extends Handler {
        public final /* synthetic */ LocalBroadcastManager a;

        public AnonymousClass1(LocalBroadcastManager localBroadcastManager, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class BroadcastRecord {
        public final Intent a;
        public final ArrayList<ReceiverRecord> b;

        public BroadcastRecord(Intent intent, ArrayList<ReceiverRecord> arrayList) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class ReceiverRecord {
        public final IntentFilter a;
        public final BroadcastReceiver b;
        public boolean c;
        public boolean d;

        public ReceiverRecord(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        }

        public String toString() {
        }
    }

    public LocalBroadcastManager(Context context) {
    }

    public static LocalBroadcastManager getInstance(Context context) {
    }

    public void a() {
    }

    public void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
    }

    public boolean sendBroadcast(Intent intent) {
    }

    public void sendBroadcastSync(Intent intent) {
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
    }
}
