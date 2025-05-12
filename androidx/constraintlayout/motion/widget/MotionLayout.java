package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import j.e.b.b.n;
import j.e.b.b.o;
import j.e.b.b.p;
import j.e.b.b.r;
import j.g.t.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class MotionLayout extends ConstraintLayout implements w {
    public static boolean Y0;
    public int A;
    public int A0;
    public int B;
    public int B0;
    public int C;
    public int C0;
    public boolean D;
    public float D0;
    public HashMap<View, n> E;
    public j.e.a.k.a.d E0;
    public long F;
    public boolean F0;
    public float G;
    public i G0;
    public float H;
    public Runnable H0;
    public float I;
    public int[] I0;
    public long J;
    public int J0;
    public float K;
    public boolean K0;
    public boolean L;
    public int L0;
    public boolean M;
    public HashMap<View, j.e.b.a.e> M0;
    public j N;
    public int N0;
    public float O;
    public int O0;
    public float P;
    public Rect P0;
    public int Q;
    public boolean Q0;
    public e R;
    public k R0;
    public boolean S;
    public f S0;
    public j.e.b.a.b T;
    public boolean T0;
    public d U;
    public RectF U0;
    public j.e.b.b.c V;
    public View V0;
    public int W;
    public Matrix W0;
    public ArrayList<Integer> X0;
    public int g0;
    public boolean h0;
    public float i0;
    public float j0;
    public long k0;
    public float l0;
    public boolean m0;
    public ArrayList<o> n0;
    public ArrayList<o> o0;
    public ArrayList<o> p0;
    public CopyOnWriteArrayList<j> q0;
    public int r0;
    public long s0;
    public float t0;
    public r u;
    public int u0;
    public Interpolator v;
    public float v0;
    public Interpolator w;
    public boolean w0;
    public float x;
    public int x0;
    public int y;
    public int y0;
    public int z;
    public int z0;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Runnable {
        public final /* synthetic */ View a;

        public a(MotionLayout motionLayout, View view) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Runnable {
        public final /* synthetic */ MotionLayout a;

        public b(MotionLayout motionLayout) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a = null;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d extends p {
        public float a;
        public float b;
        public float c;
        public final /* synthetic */ MotionLayout d;

        public d(MotionLayout motionLayout) {
        }

        @Override // j.e.b.b.p
        public float a() {
        }

        public void b(float f, float f2, float f3) {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e {
        public float[] a;
        public int[] b;
        public float[] c;
        public Path d;
        public Paint e;
        public Paint f;
        public Paint g;
        public Paint h;

        /* renamed from: i, reason: collision with root package name */
        public Paint f171i;

        /* renamed from: j, reason: collision with root package name */
        public float[] f172j;

        /* renamed from: k, reason: collision with root package name */
        public DashPathEffect f173k;

        /* renamed from: l, reason: collision with root package name */
        public int f174l;

        /* renamed from: m, reason: collision with root package name */
        public Rect f175m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f176n;

        /* renamed from: o, reason: collision with root package name */
        public int f177o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ MotionLayout f178p;

        public e(MotionLayout motionLayout) {
        }

        public void a(Canvas canvas, HashMap<View, n> hashMap, int i2, int i3) {
        }

        public void b(Canvas canvas, int i2, int i3, n nVar) {
        }

        public final void c(Canvas canvas) {
        }

        public final void d(Canvas canvas) {
        }

        public final void e(Canvas canvas) {
        }

        public final void f(Canvas canvas, float f, float f2) {
        }

        public final void g(Canvas canvas) {
        }

        public final void h(Canvas canvas, float f, float f2) {
        }

        public final void i(Canvas canvas, float f, float f2, int i2, int i3) {
        }

        public final void j(Canvas canvas, n nVar) {
        }

        public final void k(Canvas canvas, int i2, int i3, n nVar) {
        }

        public void l(String str, Paint paint) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f {
        public j.e.a.m.f a;
        public j.e.a.m.f b;
        public j.e.c.d c;
        public j.e.c.d d;
        public int e;
        public int f;
        public final /* synthetic */ MotionLayout g;

        public f(MotionLayout motionLayout) {
        }

        public void a() {
        }

        public final void b(int i2, int i3) {
        }

        public void c(j.e.a.m.f fVar, j.e.a.m.f fVar2) {
        }

        public j.e.a.m.e d(j.e.a.m.f fVar, View view) {
        }

        public void e(j.e.a.m.f fVar, j.e.c.d dVar, j.e.c.d dVar2) {
        }

        public boolean f(int i2, int i3) {
        }

        public void g(int i2, int i3) {
        }

        public void h() {
        }

        public void i(int i2, int i3) {
        }

        public final void j(j.e.a.m.f fVar, j.e.c.d dVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface g {
        void a();

        void b(MotionEvent motionEvent);

        float c();

        float d();

        void e(int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class h implements g {
        public static h b;
        public VelocityTracker a;

        public static h f() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.g
        public void a() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.g
        public void b(MotionEvent motionEvent) {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.g
        public float c() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.g
        public float d() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.g
        public void e(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class i {
        public float a;
        public float b;
        public int c;
        public int d;
        public final /* synthetic */ MotionLayout e;

        public i(MotionLayout motionLayout) {
        }

        public void a() {
        }

        public Bundle b() {
        }

        public void c() {
        }

        public void d(int i2) {
        }

        public void e(float f) {
        }

        public void f(int i2) {
        }

        public void g(Bundle bundle) {
        }

        public void h(float f) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface j {
        void a(MotionLayout motionLayout, int i2, int i3, float f);

        void b(MotionLayout motionLayout, int i2, int i3);

        void c(MotionLayout motionLayout, int i2, boolean z, float f);

        void d(MotionLayout motionLayout, int i2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class k {
        public static final k a = null;
        public static final k b = null;
        public static final k c = null;
        public static final k d = null;
        public static final /* synthetic */ k[] e = null;

        public k(String str, int i2) {
        }

        public static /* synthetic */ k[] a() {
        }

        public static k valueOf(String str) {
        }

        public static k[] values() {
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ i B(MotionLayout motionLayout) {
    }

    public static /* synthetic */ int C(MotionLayout motionLayout) {
    }

    public static /* synthetic */ void D(MotionLayout motionLayout, j.e.a.m.f fVar, int i2, int i3, int i4) {
    }

    public static /* synthetic */ void E(MotionLayout motionLayout, boolean z, View view, j.e.a.m.e eVar, ConstraintLayout.b bVar, SparseArray sparseArray) {
    }

    public static /* synthetic */ int F(MotionLayout motionLayout) {
    }

    public static /* synthetic */ int G(MotionLayout motionLayout) {
    }

    public static /* synthetic */ void H(MotionLayout motionLayout) {
    }

    public static /* synthetic */ void I(MotionLayout motionLayout, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
    }

    public static /* synthetic */ void J(MotionLayout motionLayout, j.e.a.m.f fVar, int i2, int i3, int i4) {
    }

    public static /* synthetic */ void K(MotionLayout motionLayout, j.e.a.m.f fVar, int i2, int i3, int i4) {
    }

    public static boolean K0(float f2, float f3, float f4) {
    }

    public static /* synthetic */ void L(MotionLayout motionLayout, j.e.a.m.f fVar, int i2, int i3, int i4) {
    }

    public static /* synthetic */ void M(MotionLayout motionLayout, j.e.a.m.f fVar, int i2, int i3, int i4) {
    }

    public static /* synthetic */ int N(MotionLayout motionLayout) {
    }

    public static /* synthetic */ Rect O(MotionLayout motionLayout, j.e.a.m.e eVar) {
    }

    public static /* synthetic */ int P(MotionLayout motionLayout) {
    }

    public static /* synthetic */ int Q(MotionLayout motionLayout) {
    }

    public static /* synthetic */ boolean R(MotionLayout motionLayout) {
    }

    public static /* synthetic */ j.e.a.m.f S(MotionLayout motionLayout) {
    }

    public static /* synthetic */ j.e.a.m.f T(MotionLayout motionLayout) {
    }

    public static /* synthetic */ j.e.a.m.f U(MotionLayout motionLayout) {
    }

    public static /* synthetic */ j.e.a.m.f V(MotionLayout motionLayout) {
    }

    public static /* synthetic */ boolean W(MotionLayout motionLayout) {
    }

    public static /* synthetic */ boolean X(MotionLayout motionLayout) {
    }

    public void A0(int i2, float f2, float f3) {
    }

    public void B0() {
    }

    public void C0(Runnable runnable) {
    }

    public void D0() {
    }

    public void E0(int i2) {
    }

    public void F0(int i2, int i3, int i4) {
    }

    public void G0(int i2, int i3, int i4, int i5) {
    }

    public void H0() {
    }

    public void I0(int i2, j.e.c.d dVar) {
    }

    public void J0(int i2, View... viewArr) {
    }

    public void Y(float f2) {
    }

    public final boolean Z(View view, MotionEvent motionEvent, float f2, float f3) {
    }

    public final void a0() {
    }

    public final void b0(int i2, j.e.c.d dVar) {
    }

    public final void c0(r.b bVar) {
    }

    public final void d0() {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    public void e0(boolean z) {
    }

    public void f0(boolean z) {
    }

    public final void g0() {
    }

    public int[] getConstraintSetIds() {
    }

    public int getCurrentState() {
    }

    public ArrayList<r.b> getDefinedTransitions() {
    }

    public j.e.b.b.c getDesignTool() {
    }

    public int getEndState() {
    }

    public long getNanoTime() {
    }

    public float getProgress() {
    }

    public r getScene() {
    }

    public int getStartState() {
    }

    public float getTargetPosition() {
    }

    public Bundle getTransitionState() {
    }

    public long getTransitionTimeMs() {
    }

    public float getVelocity() {
    }

    public final void h0() {
    }

    public void i0() {
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
    }

    public void j0(int i2, boolean z, float f2) {
    }

    @Override // j.g.t.w
    public void k(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    public void k0(int i2, float f2, float f3, float f4, float[] fArr) {
    }

    @Override // j.g.t.v
    public void l(View view, int i2, int i3, int i4, int i5, int i6) {
    }

    public j.e.c.d l0(int i2) {
    }

    @Override // j.g.t.v
    public boolean m(View view, View view2, int i2, int i3) {
    }

    public n m0(int i2) {
    }

    @Override // j.g.t.v
    public void n(View view, View view2, int i2, int i3) {
    }

    public r.b n0(int i2) {
    }

    @Override // j.g.t.v
    public void o(View view, int i2) {
    }

    public final boolean o0(float f2, float f3, View view, MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, j.g.t.x
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, j.g.t.x
    public boolean onNestedPreFling(View view, float f2, float f3) {
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
    }

    @Override // j.g.t.v
    public void p(View view, int i2, int i3, int[] iArr, int i4) {
    }

    public final void p0(AttributeSet attributeSet) {
    }

    public boolean q0() {
    }

    public g r0() {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    public void s0() {
    }

    public void setDebugMode(int i2) {
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
    }

    public void setInteractionEnabled(boolean z) {
    }

    public void setInterpolatedProgress(float f2) {
    }

    public void setOnHide(float f2) {
    }

    public void setOnShow(float f2) {
    }

    public void setProgress(float f2) {
    }

    public void setScene(r rVar) {
    }

    public void setStartState(int i2) {
    }

    public void setState(k kVar) {
    }

    public void setTransition(int i2) {
    }

    public void setTransitionDuration(int i2) {
    }

    public void setTransitionListener(j jVar) {
    }

    public void setTransitionState(Bundle bundle) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void t(int i2) {
    }

    public final void t0() {
    }

    @Override // android.view.View
    public String toString() {
    }

    public void u0() {
    }

    public void v0(float f2, float f3) {
    }

    public void w0(int i2, int i3, int i4) {
    }

    public void x0(int i2, int i3) {
    }

    public final void y0() {
    }

    public final Rect z0(j.e.a.m.e eVar) {
    }

    public void setTransition(r.b bVar) {
    }
}
