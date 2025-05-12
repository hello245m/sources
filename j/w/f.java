package j.w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class f extends x {
    public static final String[] M = null;
    public static final Property<e, float[]> N = null;
    public static final Property<e, PointF> O = null;
    public static final boolean P = false;
    public boolean J;
    public boolean K;
    public Matrix L;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a extends Property<e, float[]> {
        public a(Class cls, String str) {
        }

        public float[] a(e eVar) {
        }

        public void b(e eVar, float[] fArr) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ float[] get(e eVar) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(e eVar, float[] fArr) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b extends Property<e, PointF> {
        public b(Class cls, String str) {
        }

        public PointF a(e eVar) {
        }

        public void b(e eVar, PointF pointF) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(e eVar) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(e eVar, PointF pointF) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends AnimatorListenerAdapter {
        public boolean a;
        public Matrix b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Matrix d;
        public final /* synthetic */ View e;
        public final /* synthetic */ C0184f f;
        public final /* synthetic */ e g;
        public final /* synthetic */ f h;

        public c(f fVar, boolean z, Matrix matrix, View view, C0184f c0184f, e eVar) {
        }

        public final void a(Matrix matrix) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d extends y {
        public View a;
        public j b;

        public d(View view, j jVar) {
        }

        @Override // j.w.y, j.w.x.f
        public void b(x xVar) {
        }

        @Override // j.w.x.f
        public void c(x xVar) {
        }

        @Override // j.w.y, j.w.x.f
        public void e(x xVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class e {
        public final Matrix a;
        public final View b;
        public final float[] c;
        public float d;
        public float e;

        public e(View view, float[] fArr) {
        }

        public Matrix a() {
        }

        public final void b() {
        }

        public void c(PointF pointF) {
        }

        public void d(float[] fArr) {
        }
    }

    /* renamed from: j.w.f$f, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class C0184f {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        public C0184f(View view) {
        }

        public void a(View view) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    public static void k0(View view) {
    }

    public static void m0(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
    }

    @Override // j.w.x
    public String[] G() {
    }

    public final void g0(d0 d0Var) {
    }

    @Override // j.w.x
    public void h(d0 d0Var) {
    }

    public final void h0(ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
    }

    public final ObjectAnimator i0(d0 d0Var, d0 d0Var2, boolean z) {
    }

    public final boolean j0(ViewGroup viewGroup, ViewGroup viewGroup2) {
    }

    @Override // j.w.x
    public void k(d0 d0Var) {
    }

    public final void l0(d0 d0Var, d0 d0Var2) {
    }

    @Override // j.w.x
    public Animator p(ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
    }
}
