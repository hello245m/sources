package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class ja {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a {
        private final String a;
        private final boolean b;

        public a(String str, boolean z) {
        }

        public String a() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class b implements ServiceConnection {
        public boolean a;
        private final LinkedBlockingQueue<IBinder> b;

        private b() {
        }

        public /* synthetic */ b(jb jbVar) {
        }

        public IBinder a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class c implements IInterface {
        private IBinder a;

        public c(IBinder iBinder) {
        }

        public String a() {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }
    }

    public static a a(Context context) {
    }
}
