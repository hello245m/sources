package com.huawei.hms.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class p {
    private ServiceConnection a;
    private Messenger b;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements ServiceConnection {
        public final /* synthetic */ Bundle a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ p c;

        public a(p pVar, Bundle bundle, Context context) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static /* synthetic */ Messenger a(p pVar) {
    }

    public static /* synthetic */ ServiceConnection b(p pVar) {
    }

    public static /* synthetic */ Messenger a(p pVar, Messenger messenger) {
    }

    public boolean a(Context context, Bundle bundle, Intent intent) {
    }
}
