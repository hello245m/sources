package j.i.b;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class c {
    public static final Interpolator w = null;
    public int a;
    public int b;
    public int c;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f3326i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3327j;

    /* renamed from: k, reason: collision with root package name */
    public int f3328k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f3329l;

    /* renamed from: m, reason: collision with root package name */
    public float f3330m;

    /* renamed from: n, reason: collision with root package name */
    public float f3331n;

    /* renamed from: o, reason: collision with root package name */
    public int f3332o;

    /* renamed from: p, reason: collision with root package name */
    public int f3333p;

    /* renamed from: q, reason: collision with root package name */
    public OverScroller f3334q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC0153c f3335r;

    /* renamed from: s, reason: collision with root package name */
    public View f3336s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3337t;
    public final ViewGroup u;
    public final Runnable v;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Runnable {
        public final /* synthetic */ c a;

        public b(c cVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: j.i.b.c$c, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class AbstractC0153c {
        public abstract int a(View view, int i2, int i3);

        public abstract int b(View view, int i2, int i3);

        public int c(int i2) {
        }

        public int d(View view) {
        }

        public int e(View view) {
        }

        public void f(int i2, int i3) {
        }

        public boolean g(int i2) {
        }

        public void h(int i2, int i3) {
        }

        public void i(View view, int i2) {
        }

        public abstract void j(int i2);

        public abstract void k(View view, int i2, int i3, int i4, int i5);

        public abstract void l(View view, float f, float f2);

        public abstract boolean m(View view, int i2);
    }

    public c(Context context, ViewGroup viewGroup, AbstractC0153c abstractC0153c) {
    }

    public static c l(ViewGroup viewGroup, float f, AbstractC0153c abstractC0153c) {
    }

    public static c m(ViewGroup viewGroup, AbstractC0153c abstractC0153c) {
    }

    public final void A() {
    }

    public final void B(float f, float f2, int i2) {
    }

    public final void C(float f, float f2, int i2) {
    }

    public final void D(MotionEvent motionEvent) {
    }

    public void E(int i2) {
    }

    public boolean F(int i2, int i3) {
    }

    public boolean G(MotionEvent motionEvent) {
    }

    public boolean H(View view, int i2, int i3) {
    }

    public boolean I(View view, int i2) {
    }

    public void a() {
    }

    public void b(View view, int i2) {
    }

    public final boolean c(float f, float f2, int i2, int i3) {
    }

    public final boolean d(View view, float f, float f2) {
    }

    public final float e(float f, float f2, float f3) {
    }

    public final int f(int i2, int i3, int i4) {
    }

    public final void g() {
    }

    public final void h(int i2) {
    }

    public final int i(int i2, int i3, int i4) {
    }

    public final int j(View view, int i2, int i3, int i4, int i5) {
    }

    public boolean k(boolean z) {
    }

    public final void n(float f, float f2) {
    }

    public final float o(float f) {
    }

    public final void p(int i2, int i3, int i4, int i5) {
    }

    public final void q(int i2) {
    }

    public View r(int i2, int i3) {
    }

    public final boolean s(int i2, int i3, int i4, int i5) {
    }

    public final int t(int i2, int i3) {
    }

    public int u() {
    }

    public boolean v(int i2, int i3) {
    }

    public boolean w(int i2) {
    }

    public final boolean x(int i2) {
    }

    public boolean y(View view, int i2, int i3) {
    }

    public void z(MotionEvent motionEvent) {
    }
}
