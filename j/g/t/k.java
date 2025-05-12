package j.g.t;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class k {
    public final a a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface a {
        boolean onTouchEvent(MotionEvent motionEvent);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b implements a {
        public static final int v = 0;
        public static final int w = 0;
        public int a;
        public int b;
        public int c;
        public int d;
        public final Handler e;
        public final GestureDetector.OnGestureListener f;
        public GestureDetector.OnDoubleTapListener g;
        public boolean h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f3276i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f3277j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f3278k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f3279l;

        /* renamed from: m, reason: collision with root package name */
        public MotionEvent f3280m;

        /* renamed from: n, reason: collision with root package name */
        public MotionEvent f3281n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f3282o;

        /* renamed from: p, reason: collision with root package name */
        public float f3283p;

        /* renamed from: q, reason: collision with root package name */
        public float f3284q;

        /* renamed from: r, reason: collision with root package name */
        public float f3285r;

        /* renamed from: s, reason: collision with root package name */
        public float f3286s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f3287t;
        public VelocityTracker u;

        public b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        }

        public final void a() {
        }

        public final void b() {
        }

        public void c() {
        }

        public final void d(Context context) {
        }

        public final boolean e(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
        }

        public void f(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        }

        @Override // j.g.t.k.a
        public boolean onTouchEvent(MotionEvent motionEvent) {
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a extends Handler {
            public final /* synthetic */ b a;

            public a(b bVar) {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
            }

            public a(b bVar, Handler handler) {
            }
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c implements a {
        public final GestureDetector a;

        public c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        }

        @Override // j.g.t.k.a
        public boolean onTouchEvent(MotionEvent motionEvent) {
        }
    }

    public k(Context context, GestureDetector.OnGestureListener onGestureListener) {
    }

    public boolean a(MotionEvent motionEvent) {
    }

    public k(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
    }
}
