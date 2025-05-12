package j.w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j.w.a;
import j.w.x;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class u0 extends x {
    public static final String[] K = null;
    public int J;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends y {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;
        public final /* synthetic */ u0 d;

        public a(u0 u0Var, ViewGroup viewGroup, View view, View view2) {
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
    public static class b extends AnimatorListenerAdapter implements x.f, a.InterfaceC0182a {
        public final View a;
        public final int b;
        public final ViewGroup c;
        public final boolean d;
        public boolean e;
        public boolean f;

        public b(View view, int i2, boolean z) {
        }

        @Override // j.w.x.f
        public void a(x xVar) {
        }

        @Override // j.w.x.f
        public void b(x xVar) {
        }

        @Override // j.w.x.f
        public void c(x xVar) {
        }

        @Override // j.w.x.f
        public void d(x xVar) {
        }

        @Override // j.w.x.f
        public void e(x xVar) {
        }

        public final void f() {
        }

        public final void g(boolean z) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, j.w.a.InterfaceC0182a
        public void onAnimationPause(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, j.w.a.InterfaceC0182a
        public void onAnimationResume(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    @Override // j.w.x
    public String[] G() {
    }

    @Override // j.w.x
    public boolean I(d0 d0Var, d0 d0Var2) {
    }

    public final void g0(d0 d0Var) {
    }

    @Override // j.w.x
    public void h(d0 d0Var) {
    }

    public final c h0(d0 d0Var, d0 d0Var2) {
    }

    public abstract Animator i0(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2);

    public Animator j0(ViewGroup viewGroup, d0 d0Var, int i2, d0 d0Var2, int i3) {
    }

    @Override // j.w.x
    public void k(d0 d0Var) {
    }

    public abstract Animator k0(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2);

    public Animator l0(ViewGroup viewGroup, d0 d0Var, int i2, d0 d0Var2, int i3) {
    }

    public void m0(int i2) {
    }

    @Override // j.w.x
    public Animator p(ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
    }
}
