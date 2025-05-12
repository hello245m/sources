package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import j.g.t.p0;
import j.g.t.v;
import j.g.t.w;
import j.g.t.y;
import j.g.t.z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class CoordinatorLayout extends ViewGroup implements v, w {
    public static final String u = null;
    public static final Class<?>[] v = null;
    public static final ThreadLocal<Map<String, Constructor<c>>> w = null;
    public static final Comparator<View> x = null;
    public static final j.g.s.e<Rect> y = null;
    public final List<View> a;
    public final j.f.d.a<View> b;
    public final List<View> c;
    public final List<View> d;
    public Paint e;
    public final int[] f;
    public final int[] g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f206i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f207j;

    /* renamed from: k, reason: collision with root package name */
    public View f208k;

    /* renamed from: l, reason: collision with root package name */
    public View f209l;

    /* renamed from: m, reason: collision with root package name */
    public g f210m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f211n;

    /* renamed from: o, reason: collision with root package name */
    public p0 f212o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f213p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f214q;

    /* renamed from: r, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f215r;

    /* renamed from: s, reason: collision with root package name */
    public z f216s;

    /* renamed from: t, reason: collision with root package name */
    public final y f217t;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements z {
        public final /* synthetic */ CoordinatorLayout a;

        public a(CoordinatorLayout coordinatorLayout) {
        }

        @Override // j.g.t.z
        public p0 a(View view, p0 p0Var) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b {
        c getBehavior();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class c<V extends View> {
        public c() {
        }

        public static Object getTag(View view) {
        }

        public static void setTag(View view, Object obj) {
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, V v) {
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, V v) {
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, V v) {
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public p0 onApplyWindowInsets(CoordinatorLayout coordinatorLayout, V v, p0 p0Var) {
        }

        public void onAttachedToLayoutParams(f fVar) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i2) {
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4, int i5) {
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        }

        @Deprecated
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr) {
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr, int i4) {
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5) {
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6) {
        }

        @Deprecated
        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2) {
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        }

        @Deprecated
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2) {
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
        }

        @Deprecated
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i2) {
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public @interface d {
        Class<? extends c> value();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {
        public final /* synthetic */ CoordinatorLayout a;

        public e(CoordinatorLayout coordinatorLayout) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ CoordinatorLayout a;

        public g(CoordinatorLayout coordinatorLayout) {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class i implements Comparator<View> {
        public int a(View view, View view2) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(View view, View view2) {
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
    }

    public static c K(Context context, AttributeSet attributeSet, String str) {
    }

    public static void O(Rect rect) {
    }

    public static int R(int i2) {
    }

    public static int S(int i2) {
    }

    public static int T(int i2) {
    }

    public static Rect a() {
    }

    public static int c(int i2, int i3, int i4) {
    }

    public final boolean A(View view) {
    }

    public boolean B(View view, int i2, int i3) {
    }

    public final void C(View view, int i2) {
    }

    public final void D(View view, View view2, int i2) {
    }

    public final void E(View view, int i2, int i3) {
    }

    public final void F(View view, Rect rect, int i2) {
    }

    public void G(View view, int i2) {
    }

    public final void H(int i2) {
    }

    public void I(View view, int i2) {
    }

    public void J(View view, int i2, int i3, int i4, int i5) {
    }

    public final boolean L(MotionEvent motionEvent, int i2) {
    }

    public final void M() {
    }

    public void N(View view, Rect rect) {
    }

    public void P() {
    }

    public final void Q(boolean z) {
    }

    public final void U(View view, int i2) {
    }

    public final void V(View view, int i2) {
    }

    public final p0 W(p0 p0Var) {
    }

    public final void X() {
    }

    public void b() {
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public final void d(f fVar, Rect rect, int i2, int i3) {
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
    }

    public final p0 e(p0 p0Var) {
    }

    public void f(View view) {
    }

    public void g() {
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    public final List<View> getDependencySortedChildren() {
    }

    public final p0 getLastWindowInsets() {
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
    }

    public Drawable getStatusBarBackground() {
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
    }

    public f h() {
    }

    public f i(AttributeSet attributeSet) {
    }

    public f j(ViewGroup.LayoutParams layoutParams) {
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

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, j.g.t.x
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, j.g.t.x
    public boolean onNestedPreFling(View view, float f2, float f3) {
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
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
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

    public void q(View view, boolean z, Rect rect) {
    }

    public List<View> r(View view) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    public List<View> s(View view) {
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
    }

    public void setStatusBarBackground(Drawable drawable) {
    }

    public void setStatusBarBackgroundColor(int i2) {
    }

    public void setStatusBarBackgroundResource(int i2) {
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }

    public void t(View view, Rect rect) {
    }

    public void u(View view, int i2, Rect rect, Rect rect2) {
    }

    public final void v(View view, int i2, Rect rect, Rect rect2, f fVar, int i3, int i4) {
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
    }

    public final int w(int i2) {
    }

    public void x(View view, Rect rect) {
    }

    public f y(View view) {
    }

    public final void z(List<View> list) {
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class h extends j.i.a.a {
        public static final Parcelable.Creator<h> CREATOR = null;
        public SparseArray<Parcelable> c;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class a implements Parcelable.ClassLoaderCreator<h> {
            public h a(Parcel parcel) {
            }

            public h b(Parcel parcel, ClassLoader classLoader) {
            }

            public h[] c(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ h createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
        }

        @Override // j.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public h(Parcelable parcelable) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class f extends ViewGroup.MarginLayoutParams {
        public c a;
        public boolean b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;

        /* renamed from: i, reason: collision with root package name */
        public int f218i;

        /* renamed from: j, reason: collision with root package name */
        public int f219j;

        /* renamed from: k, reason: collision with root package name */
        public View f220k;

        /* renamed from: l, reason: collision with root package name */
        public View f221l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f222m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f223n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f224o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f225p;

        /* renamed from: q, reason: collision with root package name */
        public final Rect f226q;

        /* renamed from: r, reason: collision with root package name */
        public Object f227r;

        public f(int i2, int i3) {
        }

        public boolean a() {
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public boolean c() {
        }

        public View d(CoordinatorLayout coordinatorLayout, View view) {
        }

        public int e() {
        }

        public c f() {
        }

        public boolean g() {
        }

        public Rect h() {
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view) {
        }

        public boolean j(int i2) {
        }

        public void k() {
        }

        public void l(int i2) {
        }

        public void m() {
        }

        public final void n(View view, CoordinatorLayout coordinatorLayout) {
        }

        public void o(c cVar) {
        }

        public void p(boolean z) {
        }

        public void q(Rect rect) {
        }

        public void r(int i2, boolean z) {
        }

        public final boolean s(View view, int i2) {
        }

        public final boolean t(View view, CoordinatorLayout coordinatorLayout) {
        }

        public f(Context context, AttributeSet attributeSet) {
        }

        public f(f fVar) {
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        public f(ViewGroup.LayoutParams layoutParams) {
        }
    }
}
