package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j.g.t.p0;
import j.g.t.r0.c;
import j.g.t.r0.f;
import j.i.b.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import k.d.a.c.f0.m;
import k.d.a.c.l0.k;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public static final int R = 0;
    public j.i.b.c A;
    public boolean B;
    public int C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public WeakReference<V> H;
    public WeakReference<View> I;
    public final ArrayList<f> J;
    public VelocityTracker K;
    public int L;
    public int M;
    public boolean N;
    public Map<View, Integer> O;
    public int P;
    public final c.AbstractC0153c Q;
    public int a;
    public boolean b;
    public boolean c;
    public float d;
    public int e;
    public boolean f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f430i;

    /* renamed from: j, reason: collision with root package name */
    public k.d.a.c.l0.g f431j;

    /* renamed from: k, reason: collision with root package name */
    public int f432k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f433l;

    /* renamed from: m, reason: collision with root package name */
    public k f434m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f435n;

    /* renamed from: o, reason: collision with root package name */
    public BottomSheetBehavior<V>.h f436o;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f437p;

    /* renamed from: q, reason: collision with root package name */
    public int f438q;

    /* renamed from: r, reason: collision with root package name */
    public int f439r;

    /* renamed from: s, reason: collision with root package name */
    public int f440s;

    /* renamed from: t, reason: collision with root package name */
    public float f441t;
    public int u;
    public float v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ int b;
        public final /* synthetic */ BottomSheetBehavior c;

        public a(BottomSheetBehavior bottomSheetBehavior, View view, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ BottomSheetBehavior a;

        public b(BottomSheetBehavior bottomSheetBehavior) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements m.c {
        public final /* synthetic */ BottomSheetBehavior a;

        public c(BottomSheetBehavior bottomSheetBehavior) {
        }

        @Override // k.d.a.c.f0.m.c
        public p0 a(View view, p0 p0Var, m.d dVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d extends c.AbstractC0153c {
        public final /* synthetic */ BottomSheetBehavior a;

        public d(BottomSheetBehavior bottomSheetBehavior) {
        }

        @Override // j.i.b.c.AbstractC0153c
        public int a(View view, int i2, int i3) {
        }

        @Override // j.i.b.c.AbstractC0153c
        public int b(View view, int i2, int i3) {
        }

        @Override // j.i.b.c.AbstractC0153c
        public int e(View view) {
        }

        @Override // j.i.b.c.AbstractC0153c
        public void j(int i2) {
        }

        @Override // j.i.b.c.AbstractC0153c
        public void k(View view, int i2, int i3, int i4, int i5) {
        }

        @Override // j.i.b.c.AbstractC0153c
        public void l(View view, float f, float f2) {
        }

        @Override // j.i.b.c.AbstractC0153c
        public boolean m(View view, int i2) {
        }

        public final boolean n(View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e implements j.g.t.r0.f {
        public final /* synthetic */ int a;
        public final /* synthetic */ BottomSheetBehavior b;

        public e(BottomSheetBehavior bottomSheetBehavior, int i2) {
        }

        @Override // j.g.t.r0.f
        public boolean a(View view, f.a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class f {
        public abstract void a(View view, float f);

        public abstract void b(View view, int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class h implements Runnable {
        public final View a;
        public boolean b;
        public int c;
        public final /* synthetic */ BottomSheetBehavior d;

        public h(BottomSheetBehavior bottomSheetBehavior, View view, int i2) {
        }

        public static /* synthetic */ boolean a(h hVar) {
        }

        public static /* synthetic */ boolean b(h hVar, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public BottomSheetBehavior() {
    }

    public static /* synthetic */ k.d.a.c.l0.g a(BottomSheetBehavior bottomSheetBehavior) {
    }

    public static /* synthetic */ int b(BottomSheetBehavior bottomSheetBehavior, int i2) {
    }

    public static /* synthetic */ void c(BottomSheetBehavior bottomSheetBehavior, boolean z) {
    }

    public static /* synthetic */ boolean d(BottomSheetBehavior bottomSheetBehavior) {
    }

    public static /* synthetic */ boolean e(BottomSheetBehavior bottomSheetBehavior) {
    }

    public static /* synthetic */ int f(BottomSheetBehavior bottomSheetBehavior) {
    }

    public static /* synthetic */ boolean g(BottomSheetBehavior bottomSheetBehavior) {
    }

    public static <V extends View> BottomSheetBehavior<V> s(V v) {
    }

    @Deprecated
    public void A(f fVar) {
    }

    public void B(boolean z) {
    }

    public void C(int i2) {
    }

    public void D(boolean z) {
    }

    public void E(boolean z) {
    }

    public void F(float f2) {
    }

    public void G(boolean z) {
    }

    public void H(int i2) {
    }

    public final void I(int i2, boolean z) {
    }

    public void J(int i2) {
    }

    public void K(boolean z) {
    }

    public void L(int i2) {
    }

    public void M(int i2) {
    }

    public final void N(View view) {
    }

    public void O(View view, int i2) {
    }

    public final void P(int i2) {
    }

    public boolean Q(View view, float f2) {
    }

    public void R(View view, int i2, int i3, boolean z) {
    }

    public final void S() {
    }

    public final void T(int i2) {
    }

    public final void U(boolean z) {
    }

    public final void V(boolean z) {
    }

    public final int h(V v, int i2, int i3) {
    }

    public void i(f fVar) {
    }

    public final void j() {
    }

    public final void k() {
    }

    public final int l() {
    }

    public final j.g.t.r0.f m(int i2) {
    }

    public final void n(Context context, AttributeSet attributeSet, boolean z) {
    }

    public final void o(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onDetachedFromLayoutParams() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr, int i4) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
    }

    public final void p() {
    }

    public void q(int i2) {
    }

    public View r(View view) {
    }

    public int t() {
    }

    public int u() {
    }

    public final float v() {
    }

    public boolean w() {
    }

    public final void x(V v, c.a aVar, int i2) {
    }

    public final void y() {
    }

    public final void z(g gVar) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class g extends j.i.a.a {
        public static final Parcelable.Creator<g> CREATOR = null;
        public final int c;
        public int d;
        public boolean e;
        public boolean f;
        public boolean g;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class a implements Parcelable.ClassLoaderCreator<g> {
            public g a(Parcel parcel) {
            }

            public g b(Parcel parcel, ClassLoader classLoader) {
            }

            public g[] c(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ g createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
        }

        @Override // j.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public g(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
    }
}
