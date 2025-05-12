package k.i.f.g.c;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.PriorityBlockingQueue;
import k.i.f.g.c.e;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class d implements e.a {

    /* renamed from: l, reason: collision with root package name */
    public static d f5818l;

    /* renamed from: m, reason: collision with root package name */
    public static long f5819m;

    /* renamed from: n, reason: collision with root package name */
    public static long f5820n;

    /* renamed from: o, reason: collision with root package name */
    public static k.i.f.g.c.a f5821o;

    /* renamed from: p, reason: collision with root package name */
    public static a f5822p;
    public e a;
    public int b;
    public boolean c;
    public PriorityBlockingQueue<Runnable> d;
    public LinkedList<f> e;
    public ArrayList<f> f;
    public HashMap<f, Thread> g;
    public ArrayList<k.i.f.g.c.b> h;

    /* renamed from: i, reason: collision with root package name */
    public b f5823i;

    /* renamed from: j, reason: collision with root package name */
    public Object f5824j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f5825k;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface a {
        boolean a(Runnable runnable, String str, int i2, boolean z, long j2, long j3);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends k.i.f.g.b.f {
        public final /* synthetic */ d g;

        public b(d dVar, Looper looper) {
        }

        @Override // k.i.f.g.b.f, k.i.f.g.b.h.a
        public void handleMessage(Message message) {
        }
    }

    public static /* synthetic */ long c() {
    }

    public static /* synthetic */ long d() {
    }

    public static /* synthetic */ void e(d dVar) {
    }

    public static k.i.f.g.c.a j() {
    }

    public static d k() {
    }

    public static HandlerThread n(String str) {
    }

    public static void o(Runnable runnable, String str) {
    }

    @Override // k.i.f.g.c.e.a
    public void a(Thread thread, Runnable runnable) {
    }

    @Override // k.i.f.g.c.e.a
    public void b(Runnable runnable, Throwable th) {
    }

    public final void f(Runnable runnable, String str, int i2) {
    }

    public void g(boolean z) {
    }

    public final void h() {
    }

    public final void i() {
    }

    public final int l() {
    }

    public boolean m() {
    }

    public void p() {
    }
}
