package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import j.g.t.g;
import j.g.t.t;
import j.g.t.u;
import j.g.t.w;
import j.g.t.y;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class NestedScrollView extends FrameLayout implements w, t {
    public static final a A = null;
    public static final int[] B = null;
    public long a;
    public final Rect b;
    public OverScroller c;
    public EdgeEffect d;
    public EdgeEffect e;
    public int f;
    public boolean g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public View f231i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f232j;

    /* renamed from: k, reason: collision with root package name */
    public VelocityTracker f233k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f234l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f235m;

    /* renamed from: n, reason: collision with root package name */
    public int f236n;

    /* renamed from: o, reason: collision with root package name */
    public int f237o;

    /* renamed from: p, reason: collision with root package name */
    public int f238p;

    /* renamed from: q, reason: collision with root package name */
    public int f239q;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f240r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f241s;

    /* renamed from: t, reason: collision with root package name */
    public int f242t;
    public int u;
    public d v;
    public final y w;
    public final u x;
    public float y;
    public c z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a extends g {
        @Override // j.g.t.g
        public void f(View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // j.g.t.g
        public void g(View view, j.g.t.r0.c cVar) {
        }

        @Override // j.g.t.g
        public boolean j(View view, int i2, Bundle bundle) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b {
        public static boolean a(ViewGroup viewGroup) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface c {
        void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = null;
        public int a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Parcelable.Creator<d> {
            public d a(Parcel parcel) {
            }

            public d[] b(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ d createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ d[] newArray(int i2) {
            }
        }

        public d(Parcelable parcelable) {
        }

        public String toString() {
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public d(Parcel parcel) {
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
    }

    public static boolean B(View view, View view2) {
    }

    public static int e(int i2, int i3, int i4) {
    }

    private float getVerticalScrollFactorCompat() {
    }

    public final boolean A(View view) {
    }

    public final boolean C(View view, int i2, int i3) {
    }

    public final void D(int i2, int i3, int[] iArr) {
    }

    public final void E(MotionEvent motionEvent) {
    }

    public boolean F(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z) {
    }

    public boolean G(int i2) {
    }

    public final void H() {
    }

    public final int I(int i2, float f) {
    }

    public final void J(boolean z) {
    }

    public final boolean K(int i2, int i3, int i4) {
    }

    public final void L(View view) {
    }

    public final boolean M(Rect rect, boolean z) {
    }

    public final void N(int i2, int i3) {
    }

    public final void O(int i2, int i3, int i4, boolean z) {
    }

    public final void P(int i2, int i3) {
    }

    public void Q(int i2, int i3, int i4, boolean z) {
    }

    public void R(int i2, int i3, boolean z) {
    }

    public boolean S(int i2, int i3) {
    }

    public final boolean T(MotionEvent motionEvent) {
    }

    public void U(int i2) {
    }

    public final void a() {
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
    }

    public boolean b(int i2) {
    }

    public final boolean c() {
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
    }

    @Override // android.view.View
    public void computeScroll() {
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
    }

    public final boolean d() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int f(Rect rect) {
    }

    public boolean g(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
    }

    public int getMaxScrollAmount() {
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
    }

    public int getScrollRange() {
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
    }

    public void h(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
    }

    public final void i(int i2) {
    }

    @Override // android.view.View, j.g.t.t
    public boolean isNestedScrollingEnabled() {
    }

    public final boolean j(int i2) {
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

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i2, int i3) {
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
    }

    @Override // j.g.t.v
    public void n(View view, View view2, int i2, int i3) {
    }

    @Override // j.g.t.v
    public void o(View view, int i2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.FrameLayout, android.view.View
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

    @Override // android.view.View
    public void onOverScrolled(int i2, int i3, boolean z, boolean z2) {
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, j.g.t.x
    public boolean onStartNestedScroll(View view, View view2, int i2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, j.g.t.x
    public void onStopNestedScroll(View view) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // j.g.t.v
    public void p(View view, int i2, int i3, int[] iArr, int i4) {
    }

    public final void q() {
    }

    public boolean r(KeyEvent keyEvent) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    public final View s(boolean z, int i2, int i3) {
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
    }

    public void setFillViewport(boolean z) {
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
    }

    public void setOnScrollChangeListener(c cVar) {
    }

    public void setSmoothScrollingEnabled(boolean z) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
    }

    @Override // android.view.View, j.g.t.t
    public void stopNestedScroll() {
    }

    public void t(int i2) {
    }

    public boolean u(int i2) {
    }

    public boolean v(int i2) {
    }

    public final boolean w(int i2, int i3) {
    }

    public final void x() {
    }

    public final void y() {
    }

    public final void z() {
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
    }
}
