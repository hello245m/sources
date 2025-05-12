package com.vivo.push.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class PushServiceReceiver extends BroadcastReceiver {
    private static HandlerThread a;
    private static Handler b;
    private static a c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class a implements Runnable {
        private Context a;
        private String b;

        public static /* synthetic */ void a(a aVar, Context context, String str) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
    }
}
