package j.s;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import j.s.g0;
import j.s.k0;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class l0 {
    public final Context a;
    public final String b;
    public int c;
    public final k0 d;
    public final k0.c e;
    public h0 f;
    public final Executor g;
    public final g0 h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f3520i;

    /* renamed from: j, reason: collision with root package name */
    public final ServiceConnection f3521j;

    /* renamed from: k, reason: collision with root package name */
    public final Runnable f3522k;

    /* renamed from: l, reason: collision with root package name */
    public final Runnable f3523l;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends g0.a {
        public final /* synthetic */ l0 a;

        /* renamed from: j.s.l0$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class RunnableC0179a implements Runnable {
            public final /* synthetic */ String[] a;
            public final /* synthetic */ a b;

            public RunnableC0179a(a aVar, String[] strArr) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public a(l0 l0Var) {
        }

        @Override // j.s.g0
        public void c(String[] strArr) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements ServiceConnection {
        public final /* synthetic */ l0 a;

        public b(l0 l0Var) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements Runnable {
        public final /* synthetic */ l0 a;

        public c(l0 l0Var) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d implements Runnable {
        public final /* synthetic */ l0 a;

        public d(l0 l0Var) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e extends k0.c {
        public final /* synthetic */ l0 b;

        public e(l0 l0Var, String[] strArr) {
        }

        @Override // j.s.k0.c
        public boolean a() {
        }

        @Override // j.s.k0.c
        public void b(Set<String> set) {
        }
    }

    public l0(Context context, String str, Intent intent, k0 k0Var, Executor executor) {
    }
}
