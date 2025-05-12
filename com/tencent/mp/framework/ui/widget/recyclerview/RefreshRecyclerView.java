package com.tencent.mp.framework.ui.widget.recyclerview;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import j.r.e.q;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class RefreshRecyclerView extends RecyclerView {
    public ValueAnimator A1;
    public int B1;
    public Runnable C1;
    public boolean D1;
    public k.i.h.c.d.a.j.d.d E1;
    public k.i.h.c.d.a.j.d.c F1;
    public RecyclerView.u G1;
    public ValueAnimator.AnimatorUpdateListener H1;
    public ValueAnimator.AnimatorUpdateListener I1;
    public Animator.AnimatorListener J1;
    public Context R0;
    public RecyclerView.h S0;
    public k.i.h.c.d.a.j.c T0;
    public k.i.h.c.d.a.j.d.b U0;
    public View V0;
    public int W0;
    public int X0;
    public boolean Y0;
    public boolean Z0;
    public boolean a1;
    public boolean b1;
    public int c1;
    public int d1;
    public int e1;
    public k.i.h.c.d.a.j.b f1;
    public k.i.h.c.d.a.j.d.a g1;
    public View h1;
    public int i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public boolean r1;
    public int s1;
    public int t1;
    public float u1;
    public float v1;
    public float w1;
    public int x1;
    public int y1;
    public boolean z1;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a implements Animator.AnimatorListener {
        public final /* synthetic */ RefreshRecyclerView a;

        /* renamed from: com.tencent.mp.framework.ui.widget.recyclerview.RefreshRecyclerView$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class RunnableC0074a implements Runnable {
            public final /* synthetic */ a a;

            public RunnableC0074a(a aVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public a(RefreshRecyclerView refreshRecyclerView) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class b implements Runnable {
        public final /* synthetic */ RefreshRecyclerView a;

        public b(RefreshRecyclerView refreshRecyclerView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class c extends RecyclerView.u {
        public final /* synthetic */ RefreshRecyclerView a;

        public c(RefreshRecyclerView refreshRecyclerView) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class d extends RecyclerView.s {
        public d(RefreshRecyclerView refreshRecyclerView) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public boolean a(int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class e extends q {
        public e(RefreshRecyclerView refreshRecyclerView, Context context) {
        }

        @Override // j.r.e.q
        public int B() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a0
        public PointF a(int i2) {
        }

        @Override // j.r.e.q
        public float v(DisplayMetrics displayMetrics) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class f implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ RefreshRecyclerView a;

        public f(RefreshRecyclerView refreshRecyclerView) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class g implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ RefreshRecyclerView a;

        public g(RefreshRecyclerView refreshRecyclerView) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class h implements ValueAnimator.AnimatorUpdateListener {
        public int a;
        public int b;
        public final /* synthetic */ RefreshRecyclerView c;

        public h(RefreshRecyclerView refreshRecyclerView) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ RefreshRecyclerView a;

        public i(RefreshRecyclerView refreshRecyclerView) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    public RefreshRecyclerView(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ void E1(RefreshRecyclerView refreshRecyclerView, boolean z, boolean z2) {
    }

    public static /* synthetic */ int F1(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ boolean G1(RefreshRecyclerView refreshRecyclerView, boolean z) {
    }

    public static /* synthetic */ int H1(RefreshRecyclerView refreshRecyclerView, int i2) {
    }

    public static /* synthetic */ void I1(RefreshRecyclerView refreshRecyclerView, int i2) {
    }

    public static /* synthetic */ void J1(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ int K1(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ int L1(RefreshRecyclerView refreshRecyclerView, int i2) {
    }

    public static /* synthetic */ boolean M1(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ int N1(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ int O1(RefreshRecyclerView refreshRecyclerView, int i2) {
    }

    private void P0(MotionEvent motionEvent) {
    }

    public static /* synthetic */ View P1(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ boolean Q1(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ k.i.h.c.d.a.j.c R1(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ int S1(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ int T1(RefreshRecyclerView refreshRecyclerView, int i2) {
    }

    public static /* synthetic */ boolean U1(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ int V1(RefreshRecyclerView refreshRecyclerView, int i2) {
    }

    public static /* synthetic */ boolean W1(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ boolean X1(RefreshRecyclerView refreshRecyclerView, boolean z) {
    }

    public static /* synthetic */ Runnable Y1(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ void Z1(RefreshRecyclerView refreshRecyclerView, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
    }

    public static /* synthetic */ boolean a2(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ int b2(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ int c2(RefreshRecyclerView refreshRecyclerView, int i2) {
    }

    public static /* synthetic */ View d2(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ k.i.h.c.d.a.j.b e2(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ void f2(RefreshRecyclerView refreshRecyclerView, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
    }

    public static /* synthetic */ boolean g2(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ void h2(RefreshRecyclerView refreshRecyclerView, int i2) {
    }

    public static /* synthetic */ int i2(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ boolean j2(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ boolean k2(RefreshRecyclerView refreshRecyclerView, boolean z) {
    }

    public static /* synthetic */ k.i.h.c.d.a.j.d.b l2(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ void m2(RefreshRecyclerView refreshRecyclerView, int i2) {
    }

    public static /* synthetic */ void n2(RefreshRecyclerView refreshRecyclerView, boolean z) {
    }

    public static /* synthetic */ k.i.h.c.d.a.j.d.d o2(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ int p2(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ boolean q2(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ k.i.h.c.d.a.j.d.a r2(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ int s2(RefreshRecyclerView refreshRecyclerView) {
    }

    private void setRefreshFooterContainerHeight(int i2) {
    }

    private void setRefreshHeaderContainerHeight(int i2) {
    }

    private void setStatus(int i2) {
    }

    public static /* synthetic */ int t2(RefreshRecyclerView refreshRecyclerView, int i2) {
    }

    public static /* synthetic */ RecyclerView.h u2(RefreshRecyclerView refreshRecyclerView) {
    }

    public static /* synthetic */ k.i.h.c.d.a.j.d.c v2(RefreshRecyclerView refreshRecyclerView) {
    }

    public void A2(View view) {
    }

    public void B2(View view, boolean z) {
    }

    public boolean C2() {
    }

    public boolean D2() {
    }

    public final void E2() {
    }

    public final void F2() {
    }

    public final void G2(boolean z) {
    }

    public final void H2() {
    }

    public final void I2(Context context) {
    }

    public final boolean J2() {
    }

    public final boolean K2() {
    }

    public final boolean L2() {
    }

    public final void M2(int i2) {
    }

    public final void N2(int i2) {
    }

    public final void O2() {
    }

    public final void P2(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
    }

    public final void Q2() {
    }

    public final void R2(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
    }

    public final void S2() {
    }

    public final void T2(boolean z, boolean z2) {
    }

    public final void U2(boolean z) {
    }

    public final void V2(boolean z) {
    }

    public final void W2(boolean z) {
    }

    public final void X2(int i2, Interpolator interpolator, int i3, int i4) {
    }

    public final void Y2(int i2, Interpolator interpolator, int i3, int i4) {
    }

    public boolean getFooterEnable() {
    }

    public Boolean getHeaderEnable() {
    }

    public boolean getLoadComplete() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.h hVar) {
    }

    public void setAutoRefreshing(boolean z) {
    }

    public void setBottomOffsetToLoad(int i2) {
    }

    public void setEnablePullDownRefresh(boolean z) {
    }

    public void setFooterEnable(boolean z) {
    }

    public void setHeaderEnable(boolean z) {
    }

    public void setHeaderSwipingStatusOffset(int i2) {
    }

    public void setLoadComplete(boolean z) {
    }

    public void setLoading(boolean z) {
    }

    public void setOnLoadListener(k.i.h.c.d.a.j.d.c cVar) {
    }

    public void setOnRefreshListener(k.i.h.c.d.a.j.d.d dVar) {
    }

    public void setRefreshing(boolean z) {
    }

    public void setShowFooter(boolean z) {
    }

    public void setShowHeader(boolean z) {
    }

    public final void w2() {
    }

    public void x2(View view) {
    }

    public void y2(View view, boolean z) {
    }

    public final void z2() {
    }

    public RefreshRecyclerView(Context context, AttributeSet attributeSet, int i2) {
    }

    public void setAdapter(k.i.h.c.d.a.h.e.d dVar) {
    }
}
