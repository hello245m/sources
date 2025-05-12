package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j.g.t.p0;
import j.g.t.r0.c;
import j.g.t.r0.f;
import j.g.t.z;
import java.lang.ref.WeakReference;
import java.util.List;
import k.d.a.c.l0.g;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: r, reason: collision with root package name */
    public static final int f406r = 0;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public p0 g;
    public List<c> h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f407i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f408j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f409k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f410l;

    /* renamed from: m, reason: collision with root package name */
    public int f411m;

    /* renamed from: n, reason: collision with root package name */
    public WeakReference<View> f412n;

    /* renamed from: o, reason: collision with root package name */
    public ValueAnimator f413o;

    /* renamed from: p, reason: collision with root package name */
    public int[] f414p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f415q;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends k.d.a.c.n.a<T> {
        private static final int INVALID_POSITION = -1;
        private static final int MAX_OFFSET_ANIMATION_DURATION = 600;
        private WeakReference<View> lastNestedScrollingChildRef;
        private int lastStartedType;
        private ValueAnimator offsetAnimator;
        private int offsetDelta;
        private int offsetToChildIndexOnLayout;
        private boolean offsetToChildIndexOnLayoutIsMinHeight;
        private float offsetToChildIndexOnLayoutPerc;
        private d onDragCallback;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ CoordinatorLayout a;
            public final /* synthetic */ AppBarLayout b;
            public final /* synthetic */ BaseBehavior c;

            public a(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class b implements f {
            public final /* synthetic */ CoordinatorLayout a;
            public final /* synthetic */ AppBarLayout b;
            public final /* synthetic */ View c;
            public final /* synthetic */ int d;
            public final /* synthetic */ BaseBehavior e;

            public b(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2) {
            }

            @Override // j.g.t.r0.f
            public boolean a(View view, f.a aVar) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class c implements f {
            public final /* synthetic */ AppBarLayout a;
            public final /* synthetic */ boolean b;

            public c(BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
            }

            @Override // j.g.t.r0.f
            public boolean a(View view, f.a aVar) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static abstract class d<T extends AppBarLayout> {
            public abstract boolean a(T t2);
        }

        public BaseBehavior() {
        }

        public static /* synthetic */ int access$000(BaseBehavior baseBehavior) {
        }

        private void addAccessibilityScrollActions(CoordinatorLayout coordinatorLayout, T t2, View view) {
        }

        private void addActionToExpand(CoordinatorLayout coordinatorLayout, T t2, c.a aVar, boolean z) {
        }

        private void animateOffsetTo(CoordinatorLayout coordinatorLayout, T t2, int i2, float f) {
        }

        private void animateOffsetWithDuration(CoordinatorLayout coordinatorLayout, T t2, int i2, int i3) {
        }

        private boolean canScrollChildren(CoordinatorLayout coordinatorLayout, T t2, View view) {
        }

        private static boolean checkFlag(int i2, int i3) {
        }

        private View findFirstScrollingChild(CoordinatorLayout coordinatorLayout) {
        }

        private static View getAppBarChildOnOffset(AppBarLayout appBarLayout, int i2) {
        }

        private int getChildIndexOnOffset(T t2, int i2) {
        }

        private int interpolateOffset(T t2, int i2) {
        }

        private boolean shouldJumpElevationState(CoordinatorLayout coordinatorLayout, T t2) {
        }

        private void snapToChildIfNeeded(CoordinatorLayout coordinatorLayout, T t2) {
        }

        private void updateAccessibilityActions(CoordinatorLayout coordinatorLayout, T t2) {
        }

        private void updateAppBarLayoutDrawableState(CoordinatorLayout coordinatorLayout, T t2, int i2, int i3, boolean z) {
        }

        @Override // k.d.a.c.n.a
        public /* bridge */ /* synthetic */ boolean canDragView(View view) {
        }

        @Override // k.d.a.c.n.a
        public /* bridge */ /* synthetic */ int getMaxDragOffset(View view) {
        }

        @Override // k.d.a.c.n.a
        public /* bridge */ /* synthetic */ int getScrollRangeForDragFling(View view) {
        }

        @Override // k.d.a.c.n.a
        public int getTopBottomOffsetForScrollingSibling() {
        }

        public boolean isOffsetAnimatorRunning() {
        }

        @Override // k.d.a.c.n.a
        public /* bridge */ /* synthetic */ void onFlingFinished(CoordinatorLayout coordinatorLayout, View view) {
        }

        @Override // k.d.a.c.n.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i2) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i2) {
        }

        public void setDragCallback(d dVar) {
        }

        @Override // k.d.a.c.n.a
        public /* bridge */ /* synthetic */ int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        }

        public boolean canDragView(T t2) {
        }

        public int getMaxDragOffset(T t2) {
        }

        public int getScrollRangeForDragFling(T t2) {
        }

        public void onFlingFinished(CoordinatorLayout coordinatorLayout, T t2) {
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, T t2, int i2) {
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, T t2, int i2, int i3, int i4, int i5) {
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, T t2, View view, int i2, int i3, int[] iArr, int i4) {
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, T t2, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, T t2, Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, T t2) {
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, T t2, View view, View view2, int i2, int i3) {
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, T t2, View view, int i2) {
        }

        public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, T t2, int i2, int i3, int i4) {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class e extends j.i.a.a {
            public static final Parcelable.Creator<e> CREATOR = null;
            public int c;
            public float d;
            public boolean e;

            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
            public static class a implements Parcelable.ClassLoaderCreator<e> {
                public e a(Parcel parcel) {
                }

                public e b(Parcel parcel, ClassLoader classLoader) {
                }

                public e[] c(int i2) {
                }

                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                }

                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public /* bridge */ /* synthetic */ e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                }
            }

            public e(Parcel parcel, ClassLoader classLoader) {
            }

            @Override // j.i.a.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
            }

            public e(Parcelable parcelable) {
            }
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // k.d.a.c.n.c
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
        }

        @Override // k.d.a.c.n.c
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
        }

        @Override // k.d.a.c.n.c
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
        }

        @Override // k.d.a.c.n.c
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2, int i3, int i4, int i5) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int i3, int[] iArr, int i4) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i2, int i3) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void setDragCallback(BaseBehavior.d dVar) {
        }

        @Override // k.d.a.c.n.c
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
        }

        @Override // k.d.a.c.n.c
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i2) {
        }

        @Override // k.d.a.c.n.c
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i2) {
        }

        @Override // k.d.a.c.n.c
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class ScrollingViewBehavior extends k.d.a.c.n.b {
        public ScrollingViewBehavior() {
        }

        public static int k(AppBarLayout appBarLayout) {
        }

        @Override // k.d.a.c.n.b
        public /* bridge */ /* synthetic */ View a(List list) {
        }

        @Override // k.d.a.c.n.b
        public float c(View view) {
        }

        @Override // k.d.a.c.n.b
        public int e(View view) {
        }

        public AppBarLayout j(List<View> list) {
        }

        public final void l(View view, View view2) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public final void m(View view, View view2) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements z {
        public final /* synthetic */ AppBarLayout a;

        public a(AppBarLayout appBarLayout) {
        }

        @Override // j.g.t.z
        public p0 a(View view, p0 p0Var) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ g a;

        public b(AppBarLayout appBarLayout, g gVar) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface c<T extends AppBarLayout> {
        void a(T t2, int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface e extends c<AppBarLayout> {
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
    }

    public void a(c cVar) {
    }

    public void b(e eVar) {
    }

    public final void c() {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public final View d(View view) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
    }

    public d e() {
    }

    public d f(AttributeSet attributeSet) {
    }

    public d g(ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
    }

    public int getDownNestedPreScrollRange() {
    }

    public int getDownNestedScrollRange() {
    }

    public int getLiftOnScrollTargetViewId() {
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
    }

    public int getPendingAction() {
    }

    public Drawable getStatusBarForeground() {
    }

    @Deprecated
    public float getTargetElevation() {
    }

    public final int getTopInset() {
    }

    public final int getTotalScrollRange() {
    }

    public int getUpNestedPreScrollRange() {
    }

    public boolean h() {
    }

    public final boolean i() {
    }

    public boolean j() {
    }

    public final void k() {
    }

    public boolean l() {
    }

    public void m(int i2) {
    }

    public p0 n(p0 p0Var) {
    }

    public void o(c cVar) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public void p(e eVar) {
    }

    public void q() {
    }

    public void r(boolean z, boolean z2) {
    }

    public final void s(boolean z, boolean z2, boolean z3) {
    }

    @Override // android.view.View
    public void setElevation(float f) {
    }

    public void setExpanded(boolean z) {
    }

    public void setLiftOnScroll(boolean z) {
    }

    public void setLiftOnScrollTargetViewId(int i2) {
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i2) {
    }

    public void setStatusBarForeground(Drawable drawable) {
    }

    public void setStatusBarForegroundColor(int i2) {
    }

    public void setStatusBarForegroundResource(int i2) {
    }

    @Deprecated
    public void setTargetElevation(float f) {
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }

    public final boolean t(boolean z) {
    }

    public boolean u(boolean z) {
    }

    public final boolean v() {
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
    }

    public boolean w(View view) {
    }

    public final boolean x() {
    }

    public final void y(g gVar, boolean z) {
    }

    public final void z() {
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i2) {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d extends LinearLayout.LayoutParams {
        public int a;
        public Interpolator b;

        public d(Context context, AttributeSet attributeSet) {
        }

        public int a() {
        }

        public Interpolator b() {
        }

        public boolean c() {
        }

        public d(int i2, int i3) {
        }

        public d(ViewGroup.LayoutParams layoutParams) {
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        public d(LinearLayout.LayoutParams layoutParams) {
        }
    }
}
