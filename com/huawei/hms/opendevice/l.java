package com.huawei.hms.opendevice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class l {
    private ServiceConnection a;
    private Messenger b;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements ServiceConnection {
        public final /* synthetic */ Bundle a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ l c;

        public a(l lVar, Bundle bundle, Context context) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static /* synthetic */ Messenger a(l lVar) {
    }

    public static /* synthetic */ ServiceConnection b(l lVar) {
    }

    public static /* synthetic */ Messenger a(l lVar, Messenger messenger) {
    }

    public boolean a(Context context, Bundle bundle, Intent intent) {
    }
}
