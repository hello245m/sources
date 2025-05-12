package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import j.b.p.j.m;
import j.b.q.c0;
import j.b.q.d0;
import j.g.t.p0;
import j.g.t.v;
import j.g.t.w;
import j.g.t.x;
import j.g.t.y;

@SuppressLint({"UnknownNullness"})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ActionBarOverlayLayout extends ViewGroup implements c0, x, v, w {
    public static final int[] F = null;
    public ViewPropertyAnimator A;
    public final AnimatorListenerAdapter B;
    public final Runnable C;
    public final Runnable D;
    public final y E;
    public int a;
    public int b;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public d0 e;
    public Drawable f;
    public boolean g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f124i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f125j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f126k;

    /* renamed from: l, reason: collision with root package name */
    public int f127l;

    /* renamed from: m, reason: collision with root package name */
    public int f128m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f129n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f130o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f131p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f132q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f133r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f134s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f135t;
    public p0 u;
    public p0 v;
    public p0 w;
    public p0 x;
    public d y;
    public OverScroller z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ ActionBarOverlayLayout a;

        public a(ActionBarOverlayLayout actionBarOverlayLayout) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Runnable {
        public final /* synthetic */ ActionBarOverlayLayout a;

        public b(ActionBarOverlayLayout actionBarOverlayLayout) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements Runnable {
        public final /* synthetic */ ActionBarOverlayLayout a;

        public c(ActionBarOverlayLayout actionBarOverlayLayout) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface d {
        void a();

        void b();

        void c(boolean z);

        void d();

        void e();

        void f(int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
        }

        public e(int i2, int i3) {
        }

        public e(ViewGroup.LayoutParams layoutParams) {
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
    }

    public final void A() {
    }

    public final boolean B(float f) {
    }

    public final void a() {
    }

    @Override // j.b.q.c0
    public void b(Menu menu, m.a aVar) {
    }

    @Override // j.b.q.c0
    public boolean c() {
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    @Override // j.b.q.c0
    public void d() {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // j.b.q.c0
    public boolean e() {
    }

    @Override // j.b.q.c0
    public boolean f() {
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
    }

    @Override // j.b.q.c0
    public boolean g() {
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    public int getActionBarHideOffset() {
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
    }

    public CharSequence getTitle() {
    }

    @Override // j.b.q.c0
    public boolean h() {
    }

    @Override // j.b.q.c0
    public void i(int i2) {
    }

    @Override // j.b.q.c0
    public void j() {
    }

    @Override // j.g.t.w
    public void k(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    @Override // j.g.t.v
    public void l(View view, int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // j.g.t.v
    public boolean m(View view, View view2, int i2, int i3) {
    }

    @Override // j.g.t.v
    public void n(View view, View view2, int i2, int i3) {
    }

    @Override // j.g.t.v
    public void o(View view, int i2) {
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, j.g.t.x
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, j.g.t.x
    public boolean onNestedPreFling(View view, float f, float f2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, j.g.t.x
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, j.g.t.x
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, j.g.t.x
    public void onNestedScrollAccepted(View view, View view2, int i2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, j.g.t.x
    public boolean onStartNestedScroll(View view, View view2, int i2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, j.g.t.x
    public void onStopNestedScroll(View view) {
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i2) {
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i2) {
    }

    @Override // j.g.t.v
    public void p(View view, int i2, int i3, int[] iArr, int i4) {
    }

    public final boolean q(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    public e r() {
    }

    public e s(AttributeSet attributeSet) {
    }

    public void setActionBarHideOffset(int i2) {
    }

    public void setActionBarVisibilityCallback(d dVar) {
    }

    public void setHasNonEmbeddedTabs(boolean z) {
    }

    public void setHideOnContentScrollEnabled(boolean z) {
    }

    public void setIcon(int i2) {
    }

    public void setLogo(int i2) {
    }

    public void setOverlayMode(boolean z) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // j.b.q.c0
    public void setWindowCallback(Window.Callback callback) {
    }

    @Override // j.b.q.c0
    public void setWindowTitle(CharSequence charSequence) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
    }

    public final d0 t(View view) {
    }

    public void u() {
    }

    public final void v(Context context) {
    }

    public boolean w() {
    }

    public final void x() {
    }

    public final void y() {
    }

    public void z() {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void setIcon(Drawable drawable) {
    }
}
