package k.d.a.a.y4;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class y {
    public final q a;
    public final b b;
    public final e c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public float f5223i;

    /* renamed from: j, reason: collision with root package name */
    public int f5224j;

    /* renamed from: k, reason: collision with root package name */
    public long f5225k;

    /* renamed from: l, reason: collision with root package name */
    public long f5226l;

    /* renamed from: m, reason: collision with root package name */
    public long f5227m;

    /* renamed from: n, reason: collision with root package name */
    public long f5228n;

    /* renamed from: o, reason: collision with root package name */
    public long f5229o;

    /* renamed from: p, reason: collision with root package name */
    public long f5230p;

    /* renamed from: q, reason: collision with root package name */
    public long f5231q;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a {
        public static void a(Surface surface, float f) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b {

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public interface a {
            void a(Display display);
        }

        void a(a aVar);

        void unregister();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class c implements b {
        public final WindowManager a;

        public c(WindowManager windowManager) {
        }

        public static b b(Context context) {
        }

        @Override // k.d.a.a.y4.y.b
        public void a(b.a aVar) {
        }

        @Override // k.d.a.a.y4.y.b
        public void unregister() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class d implements b, DisplayManager.DisplayListener {
        public final DisplayManager a;
        public b.a b;

        public d(DisplayManager displayManager) {
        }

        public static b c(Context context) {
        }

        @Override // k.d.a.a.y4.y.b
        public void a(b.a aVar) {
        }

        public final Display b() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i2) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i2) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i2) {
        }

        @Override // k.d.a.a.y4.y.b
        public void unregister() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class e implements Choreographer.FrameCallback, Handler.Callback {
        public static final e f = null;
        public volatile long a;
        public final Handler b;
        public final HandlerThread c;
        public Choreographer d;
        public int e;

        public static e d() {
        }

        public void a() {
        }

        public final void b() {
        }

        public final void c() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j2) {
        }

        public void e() {
        }

        public final void f() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    public y(Context context) {
    }

    public static boolean b(long j2, long j3) {
    }

    public static long d(long j2, long j3, long j4) {
    }

    public static /* synthetic */ void e(y yVar, Display display) {
    }

    public static b f(Context context) {
    }

    public long a(long j2) {
    }

    public final void c() {
    }

    public void g(float f) {
    }

    public void h(long j2) {
    }

    public void i(float f) {
    }

    public void j() {
    }

    public void k() {
    }

    public void l() {
    }

    public void m(Surface surface) {
    }

    public final void n() {
    }

    public void o(int i2) {
    }

    public final void p(Display display) {
    }

    public final void q() {
    }

    public final void r(boolean z) {
    }
}
