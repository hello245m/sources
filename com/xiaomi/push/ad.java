package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public class ad implements v {
    private static boolean a;
    private Context b;
    private ServiceConnection c;
    private volatile int d;
    private volatile a e;
    private final Object f;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class a {
        public String a;
        public String b;
        public String c;
        public String d;
        public final /* synthetic */ ad e;

        private a(ad adVar) {
        }

        public /* synthetic */ a(ad adVar, ae aeVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public class b implements ServiceConnection {
        public final /* synthetic */ ad a;

        private b(ad adVar) {
        }

        public /* synthetic */ b(ad adVar, ae aeVar) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static class c {
        public static String a(IBinder iBinder, String str, String str2, String str3) {
        }
    }

    public ad(Context context) {
    }

    public static /* synthetic */ int a(ad adVar, int i2) {
    }

    public static /* synthetic */ a a(ad adVar) {
    }

    public static /* synthetic */ a a(ad adVar, a aVar) {
    }

    private void a(String str) {
    }

    public static boolean a(Context context) {
    }

    public static /* synthetic */ Context b(ad adVar) {
    }

    public static /* synthetic */ String c(ad adVar) {
    }

    private void c() {
    }

    private void d() {
    }

    public static /* synthetic */ void d(ad adVar) {
    }

    public static /* synthetic */ Object e(ad adVar) {
    }

    private String e() {
    }

    @Override // com.xiaomi.push.v
    public boolean a() {
    }

    @Override // com.xiaomi.push.v
    public String b() {
    }
}
