package androidx.viewpager.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
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
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import j.g.t.p0;
import j.g.t.z;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ViewPager extends ViewGroup {
    public static final int[] l0 = null;
    public static final Comparator<f> m0 = null;
    public static final Interpolator n0 = null;
    public static final n o0 = null;
    public int A;
    public int B;
    public float C;
    public float D;
    public float E;
    public float F;
    public int G;
    public VelocityTracker H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public EdgeEffect N;
    public EdgeEffect O;
    public boolean P;
    public boolean Q;
    public int R;
    public List<j> S;
    public j T;
    public j U;
    public List<i> V;
    public k W;
    public int a;
    public final ArrayList<f> b;
    public final f c;
    public final Rect d;
    public j.a0.a.a e;
    public int f;
    public int g;
    public int g0;
    public Parcelable h;
    public int h0;

    /* renamed from: i, reason: collision with root package name */
    public ClassLoader f303i;
    public ArrayList<View> i0;

    /* renamed from: j, reason: collision with root package name */
    public Scroller f304j;
    public final Runnable j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f305k;
    public int k0;

    /* renamed from: l, reason: collision with root package name */
    public l f306l;

    /* renamed from: m, reason: collision with root package name */
    public int f307m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f308n;

    /* renamed from: o, reason: collision with root package name */
    public int f309o;

    /* renamed from: p, reason: collision with root package name */
    public int f310p;

    /* renamed from: q, reason: collision with root package name */
    public float f311q;

    /* renamed from: r, reason: collision with root package name */
    public float f312r;

    /* renamed from: s, reason: collision with root package name */
    public int f313s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f314t;
    public boolean u;
    public boolean v;
    public int w;
    public boolean x;
    public boolean y;
    public int z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a implements Comparator<f> {
        public int a(f fVar, f fVar2) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(f fVar, f fVar2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements Runnable {
        public final /* synthetic */ ViewPager a;

        public c(ViewPager viewPager) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d implements z {
        public final Rect a;
        public final /* synthetic */ ViewPager b;

        public d(ViewPager viewPager) {
        }

        @Override // j.g.t.z
        public p0 a(View view, p0 p0Var) {
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public @interface e {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class f {
        public Object a;
        public int b;
        public boolean c;
        public float d;
        public float e;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class h extends j.g.t.g {
        public final /* synthetic */ ViewPager d;

        public h(ViewPager viewPager) {
        }

        @Override // j.g.t.g
        public void f(View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // j.g.t.g
        public void g(View view, j.g.t.r0.c cVar) {
        }

        @Override // j.g.t.g
        public boolean j(View view, int i2, Bundle bundle) {
        }

        public final boolean n() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface i {
        void a(ViewPager viewPager, j.a0.a.a aVar, j.a0.a.a aVar2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface j {
        void I(int i2, float f, int i3);

        void o0(int i2);

        void u0(int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface k {
        void a(View view, float f);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class l extends DataSetObserver {
        public final /* synthetic */ ViewPager a;

        public l(ViewPager viewPager) {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class m extends j.i.a.a {
        public static final Parcelable.Creator<m> CREATOR = null;
        public int c;
        public Parcelable d;
        public ClassLoader e;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class a implements Parcelable.ClassLoaderCreator<m> {
            public m a(Parcel parcel) {
            }

            public m b(Parcel parcel, ClassLoader classLoader) {
            }

            public m[] c(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ m createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }
        }

        public m(Parcelable parcelable) {
        }

        public String toString() {
        }

        @Override // j.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public m(Parcel parcel, ClassLoader classLoader) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class n implements Comparator<View> {
        public int a(View view, View view2) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(View view, View view2) {
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
    }

    private int getClientWidth() {
    }

    private void setScrollingCacheEnabled(boolean z) {
    }

    public static boolean w(View view) {
    }

    public boolean A() {
    }

    public boolean B() {
    }

    public final boolean C(int i2) {
    }

    public final boolean D(float f2) {
    }

    public void E() {
    }

    public void F(int i2) {
    }

    public final void G(int i2, int i3, int i4, int i5) {
    }

    public final void H() {
    }

    public void I(i iVar) {
    }

    public void J(j jVar) {
    }

    public final void K(boolean z) {
    }

    public final boolean L() {
    }

    public final void M(int i2, boolean z, int i3, boolean z2) {
    }

    public void N(int i2, boolean z) {
    }

    public void O(int i2, boolean z, boolean z2) {
    }

    public void P(int i2, boolean z, boolean z2, int i3) {
    }

    public void Q(int i2, int i3, int i4) {
    }

    public final void R() {
    }

    public f a(int i2, int i3) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
    }

    public void b(i iVar) {
    }

    public void c(j jVar) {
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.View
    public void computeScroll() {
    }

    public boolean d(int i2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
    }

    public final void e(f fVar, int i2, f fVar2) {
    }

    public boolean f(View view, boolean z, int i2, int i3, int i4) {
    }

    public final void g(boolean z) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public j.a0.a.a getAdapter() {
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
    }

    public int getCurrentItem() {
    }

    public int getOffscreenPageLimit() {
    }

    public int getPageMargin() {
    }

    public void h() {
    }

    public final int i(int i2, float f2, int i3, int i4) {
    }

    public final void j(int i2, float f2, int i3) {
    }

    public final void k(int i2) {
    }

    public final void l(int i2) {
    }

    public float m(float f2) {
    }

    public final void n(boolean z) {
    }

    public final void o() {
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
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public boolean p(KeyEvent keyEvent) {
    }

    public final Rect q(Rect rect, View view) {
    }

    public f r(View view) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
    }

    public f s(View view) {
    }

    public void setAdapter(j.a0.a.a aVar) {
    }

    public void setCurrentItem(int i2) {
    }

    public void setOffscreenPageLimit(int i2) {
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
    }

    public void setPageMargin(int i2) {
    }

    public void setPageMarginDrawable(Drawable drawable) {
    }

    public void setScrollState(int i2) {
    }

    public final f t() {
    }

    public f u(int i2) {
    }

    public void v() {
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
    }

    public final boolean x(float f2, float f3) {
    }

    public void y(int i2, float f2, int i3) {
    }

    public final void z(MotionEvent motionEvent) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class g extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        public float c;
        public boolean d;
        public int e;
        public int f;

        public g() {
        }

        public g(Context context, AttributeSet attributeSet) {
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    public void setPageMarginDrawable(int i2) {
    }
}
