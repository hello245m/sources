package j.g.t;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class k0 {
    public final WeakReference<View> a;
    public Runnable b;
    public Runnable c;
    public int d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ l0 a;
        public final /* synthetic */ View b;

        public a(k0 k0Var, l0 l0Var, View view) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b {
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c implements l0 {
        public k0 a;
        public boolean b;

        public c(k0 k0Var) {
        }

        @Override // j.g.t.l0
        public void a(View view) {
        }

        @Override // j.g.t.l0
        @SuppressLint({"WrongConstant"})
        public void b(View view) {
        }

        @Override // j.g.t.l0
        public void c(View view) {
        }
    }

    public k0(View view) {
    }

    public static /* synthetic */ void d(n0 n0Var, View view, ValueAnimator valueAnimator) {
    }

    public k0 a(float f) {
    }

    public void b() {
    }

    public long c() {
    }

    public k0 e(long j2) {
    }

    public k0 f(Interpolator interpolator) {
    }

    public k0 g(l0 l0Var) {
    }

    public final void h(View view, l0 l0Var) {
    }

    public k0 i(long j2) {
    }

    public k0 j(n0 n0Var) {
    }

    public void k() {
    }

    public k0 l(float f) {
    }
}
