package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public class t implements v {
    private static boolean a;
    private Context b;
    private ServiceConnection c;
    private volatile int d;
    private volatile String e;
    private volatile boolean f;
    private volatile String g;
    private final Object h;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class a implements ServiceConnection {
        public final /* synthetic */ t a;

        private a(t tVar) {
        }

        public /* synthetic */ a(t tVar, u uVar) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static class b {
        public static String a(IBinder iBinder) {
        }

        public static boolean b(IBinder iBinder) {
        }
    }

    public t(Context context) {
    }

    public static /* synthetic */ int a(t tVar, int i2) {
    }

    public static /* synthetic */ String a(t tVar, String str) {
    }

    public static /* synthetic */ void a(t tVar) {
    }

    private void a(String str) {
    }

    public static boolean a(Context context) {
    }

    public static /* synthetic */ boolean a(t tVar, boolean z) {
    }

    public static /* synthetic */ Object b(t tVar) {
    }

    private void c() {
    }

    private void d() {
    }

    @Override // com.xiaomi.push.v
    public boolean a() {
    }

    @Override // com.xiaomi.push.v
    public String b() {
    }
}
