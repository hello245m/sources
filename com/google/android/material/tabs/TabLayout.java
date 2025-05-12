package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@ViewPager.e
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class TabLayout extends HorizontalScrollView {
    public static final int Q = 0;
    public static final j.g.s.e<g> R = null;
    public boolean A;
    public boolean B;
    public int C;
    public boolean D;
    public k.d.a.c.o0.b E;
    public c F;
    public final ArrayList<c> G;
    public c H;
    public ValueAnimator I;
    public ViewPager J;
    public j.a0.a.a K;
    public DataSetObserver L;
    public h M;
    public b N;
    public boolean O;
    public final j.g.s.e<i> P;
    public final ArrayList<g> a;
    public g b;
    public final f c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f486i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f487j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f488k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f489l;

    /* renamed from: m, reason: collision with root package name */
    public int f490m;

    /* renamed from: n, reason: collision with root package name */
    public PorterDuff.Mode f491n;

    /* renamed from: o, reason: collision with root package name */
    public float f492o;

    /* renamed from: p, reason: collision with root package name */
    public float f493p;

    /* renamed from: q, reason: collision with root package name */
    public final int f494q;

    /* renamed from: r, reason: collision with root package name */
    public int f495r;

    /* renamed from: s, reason: collision with root package name */
    public final int f496s;

    /* renamed from: t, reason: collision with root package name */
    public final int f497t;
    public final int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ TabLayout a;

        public a(TabLayout tabLayout) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements ViewPager.i {
        public boolean a;
        public final /* synthetic */ TabLayout b;

        public b(TabLayout tabLayout) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(ViewPager viewPager, j.a0.a.a aVar, j.a0.a.a aVar2) {
        }

        public void b(boolean z) {
        }
    }

    @Deprecated
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface c<T extends g> {
        void a(T t2);

        void b(T t2);

        void c(T t2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface d extends c<g> {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e extends DataSetObserver {
        public final /* synthetic */ TabLayout a;

        public e(TabLayout tabLayout) {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f extends LinearLayout {
        public ValueAnimator a;
        public int b;
        public float c;
        public int d;
        public final /* synthetic */ TabLayout e;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ View a;
            public final /* synthetic */ View b;
            public final /* synthetic */ f c;

            public a(f fVar, View view, View view2) {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class b extends AnimatorListenerAdapter {
            public final /* synthetic */ int a;
            public final /* synthetic */ f b;

            public b(f fVar, int i2) {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        }

        public f(TabLayout tabLayout, Context context) {
        }

        public static /* synthetic */ void a(f fVar, View view, View view2, float f) {
        }

        public void b(int i2, int i3) {
        }

        public boolean c() {
        }

        public final void d() {
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
        }

        public void e(int i2, float f) {
        }

        public void f(int i2) {
        }

        public final void g(View view, View view2, float f) {
        }

        public final void h(boolean z, int i2, int i3) {
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i2, int i3) {
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class g {
        public Object a;
        public Drawable b;
        public CharSequence c;
        public CharSequence d;
        public int e;
        public View f;
        public int g;
        public TabLayout h;

        /* renamed from: i, reason: collision with root package name */
        public i f498i;

        /* renamed from: j, reason: collision with root package name */
        public int f499j;

        public static /* synthetic */ int a(g gVar) {
        }

        public static /* synthetic */ int b(g gVar) {
        }

        public static /* synthetic */ CharSequence c(g gVar) {
        }

        public static /* synthetic */ CharSequence d(g gVar) {
        }

        public View e() {
        }

        public Drawable f() {
        }

        public int g() {
        }

        public int h() {
        }

        public Object i() {
        }

        public CharSequence j() {
        }

        public boolean k() {
        }

        public void l() {
        }

        public void m() {
        }

        public g n(CharSequence charSequence) {
        }

        public g o(int i2) {
        }

        public g p(View view) {
        }

        public g q(Drawable drawable) {
        }

        public void r(int i2) {
        }

        public g s(Object obj) {
        }

        public g t(CharSequence charSequence) {
        }

        public void u() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class h implements ViewPager.j {
        public final WeakReference<TabLayout> a;
        public int b;
        public int c;

        public h(TabLayout tabLayout) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void I(int i2, float f, int i3) {
        }

        public void a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void o0(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void u0(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class i extends LinearLayout {
        public g a;
        public TextView b;
        public ImageView c;
        public View d;
        public k.d.a.c.o.a e;
        public View f;
        public TextView g;
        public ImageView h;

        /* renamed from: i, reason: collision with root package name */
        public Drawable f500i;

        /* renamed from: j, reason: collision with root package name */
        public int f501j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ TabLayout f502k;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements View.OnLayoutChangeListener {
            public final /* synthetic */ View a;
            public final /* synthetic */ i b;

            public a(i iVar, View view) {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            }
        }

        public i(TabLayout tabLayout, Context context) {
        }

        public static /* synthetic */ void a(i iVar, Context context) {
        }

        public static /* synthetic */ void b(i iVar, View view) {
        }

        public static /* synthetic */ void c(i iVar, Canvas canvas) {
        }

        public static /* synthetic */ boolean d(i iVar) {
        }

        public static /* synthetic */ k.d.a.c.o.a e(i iVar) {
        }

        private k.d.a.c.o.a getBadge() {
        }

        private k.d.a.c.o.a getOrCreateBadge() {
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
        }

        public final void f(View view) {
        }

        public final float g(Layout layout, int i2, float f) {
        }

        public int getContentHeight() {
        }

        public int getContentWidth() {
        }

        public g getTab() {
        }

        public final void h(boolean z) {
        }

        public final FrameLayout i() {
        }

        public final void j(Canvas canvas) {
        }

        public final FrameLayout k(View view) {
        }

        public final boolean l() {
        }

        public final void m() {
        }

        public final void n() {
        }

        public void o() {
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i2, int i3) {
        }

        public final void p(View view) {
        }

        @Override // android.view.View
        public boolean performClick() {
        }

        public final void q() {
        }

        public final void r() {
        }

        public final void s(View view) {
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
        }

        public void setTab(g gVar) {
        }

        public final void t() {
        }

        public final void u(Context context) {
        }

        public final void v() {
        }

        public final void w(TextView textView, ImageView imageView) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class j implements d {
        public final ViewPager a;

        public j(ViewPager viewPager) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(g gVar) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ k.d.a.c.o0.b a(TabLayout tabLayout) {
    }

    public static /* synthetic */ int b(TabLayout tabLayout) {
    }

    private int getDefaultHeight() {
    }

    private int getTabMinWidth() {
    }

    private int getTabScrollRange() {
    }

    public static ColorStateList p(int i2, int i3) {
    }

    private void setSelectedTabView(int i2) {
    }

    public void A() {
    }

    public boolean B(g gVar) {
    }

    public void C() {
    }

    @Deprecated
    public void D(c cVar) {
    }

    public final void E(int i2) {
    }

    public void F(g gVar) {
    }

    public void G(g gVar, boolean z) {
    }

    public void H(j.a0.a.a aVar, boolean z) {
    }

    public void I(int i2, float f2, boolean z) {
    }

    public void J(int i2, float f2, boolean z, boolean z2) {
    }

    public void K(int i2, int i3) {
    }

    public void L(ViewPager viewPager, boolean z) {
    }

    public final void M(ViewPager viewPager, boolean z, boolean z2) {
    }

    public final void N() {
    }

    public final void O(LinearLayout.LayoutParams layoutParams) {
    }

    public void P(boolean z) {
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
    }

    @Deprecated
    public void c(c cVar) {
    }

    public void d(d dVar) {
    }

    public void e(g gVar) {
    }

    public void f(g gVar, int i2, boolean z) {
    }

    public void g(g gVar, boolean z) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    public int getSelectedTabPosition() {
    }

    public int getTabCount() {
    }

    public int getTabGravity() {
    }

    public ColorStateList getTabIconTint() {
    }

    public int getTabIndicatorAnimationMode() {
    }

    public int getTabIndicatorGravity() {
    }

    public int getTabMaxWidth() {
    }

    public int getTabMode() {
    }

    public ColorStateList getTabRippleColor() {
    }

    public Drawable getTabSelectedIndicator() {
    }

    public ColorStateList getTabTextColors() {
    }

    public final void h(k.d.a.c.o0.c cVar) {
    }

    public final void i(g gVar) {
    }

    public final void j(View view) {
    }

    public final void k(int i2) {
    }

    public final void l(int i2) {
    }

    public final void m() {
    }

    public final int n(int i2, float f2) {
    }

    public final void o(g gVar, int i2) {
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

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public final LinearLayout.LayoutParams q() {
    }

    public g r() {
    }

    public final i s(g gVar) {
    }

    @Override // android.view.View
    public void setElevation(float f2) {
    }

    public void setInlineLabel(boolean z) {
    }

    public void setInlineLabelResource(int i2) {
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
    }

    public void setSelectedTabIndicator(Drawable drawable) {
    }

    public void setSelectedTabIndicatorColor(int i2) {
    }

    public void setSelectedTabIndicatorGravity(int i2) {
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
    }

    public void setTabGravity(int i2) {
    }

    public void setTabIconTint(ColorStateList colorStateList) {
    }

    public void setTabIconTintResource(int i2) {
    }

    public void setTabIndicatorAnimationMode(int i2) {
    }

    public void setTabIndicatorFullWidth(boolean z) {
    }

    public void setTabMode(int i2) {
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
    }

    public void setTabRippleColorResource(int i2) {
    }

    public void setTabTextColors(ColorStateList colorStateList) {
    }

    @Deprecated
    public void setTabsFromPagerAdapter(j.a0.a.a aVar) {
    }

    public void setUnboundedRipple(boolean z) {
    }

    public void setUnboundedRippleResource(int i2) {
    }

    public void setupWithViewPager(ViewPager viewPager) {
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
    }

    public final void t(g gVar) {
    }

    public final void u(g gVar) {
    }

    public final void v(g gVar) {
    }

    public final void w() {
    }

    public g x(int i2) {
    }

    public boolean y() {
    }

    public g z() {
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i2) {
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
    }

    public void setSelectedTabIndicator(int i2) {
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
    }
}
