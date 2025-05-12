package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import j.g.t.p0;
import j.g.t.z;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public static final int x = 0;
    public boolean a;
    public int b;
    public ViewGroup c;
    public View d;
    public View e;
    public int f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f416i;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f417j;

    /* renamed from: k, reason: collision with root package name */
    public final k.d.a.c.f0.a f418k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f419l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f420m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f421n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f422o;

    /* renamed from: p, reason: collision with root package name */
    public int f423p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f424q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f425r;

    /* renamed from: s, reason: collision with root package name */
    public long f426s;

    /* renamed from: t, reason: collision with root package name */
    public int f427t;
    public AppBarLayout.e u;
    public int v;
    public p0 w;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements z {
        public final /* synthetic */ CollapsingToolbarLayout a;

        public a(CollapsingToolbarLayout collapsingToolbarLayout) {
        }

        @Override // j.g.t.z
        public p0 a(View view, p0 p0Var) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ CollapsingToolbarLayout a;

        public b(CollapsingToolbarLayout collapsingToolbarLayout) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d implements AppBarLayout.e {
        public final /* synthetic */ CollapsingToolbarLayout a;

        public d(CollapsingToolbarLayout collapsingToolbarLayout) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, int i2) {
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
    }

    public static int f(View view) {
    }

    public static CharSequence h(View view) {
    }

    public static k.d.a.c.n.d i(View view) {
    }

    public static boolean j(View view) {
    }

    public final void a(int i2) {
    }

    public final void b() {
    }

    public final View c(View view) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public c d() {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
    }

    public FrameLayout.LayoutParams e(ViewGroup.LayoutParams layoutParams) {
    }

    public final int g(View view) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    public int getCollapsedTitleGravity() {
    }

    public Typeface getCollapsedTitleTypeface() {
    }

    public Drawable getContentScrim() {
    }

    public int getExpandedTitleGravity() {
    }

    public int getExpandedTitleMarginBottom() {
    }

    public int getExpandedTitleMarginEnd() {
    }

    public int getExpandedTitleMarginStart() {
    }

    public int getExpandedTitleMarginTop() {
    }

    public Typeface getExpandedTitleTypeface() {
    }

    public int getMaxLines() {
    }

    public int getScrimAlpha() {
    }

    public long getScrimAnimationDuration() {
    }

    public int getScrimVisibleHeightTrigger() {
    }

    public Drawable getStatusBarScrim() {
    }

    public CharSequence getTitle() {
    }

    public final boolean k(View view) {
    }

    public p0 l(p0 p0Var) {
    }

    public void m(boolean z, boolean z2) {
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

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    public final void p() {
    }

    public final void q() {
    }

    public void setCollapsedTitleGravity(int i2) {
    }

    public void setCollapsedTitleTextAppearance(int i2) {
    }

    public void setCollapsedTitleTextColor(int i2) {
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
    }

    public void setContentScrim(Drawable drawable) {
    }

    public void setContentScrimColor(int i2) {
    }

    public void setContentScrimResource(int i2) {
    }

    public void setExpandedTitleColor(int i2) {
    }

    public void setExpandedTitleGravity(int i2) {
    }

    public void setExpandedTitleMarginBottom(int i2) {
    }

    public void setExpandedTitleMarginEnd(int i2) {
    }

    public void setExpandedTitleMarginStart(int i2) {
    }

    public void setExpandedTitleMarginTop(int i2) {
    }

    public void setExpandedTitleTextAppearance(int i2) {
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
    }

    public void setMaxLines(int i2) {
    }

    public void setScrimAlpha(int i2) {
    }

    public void setScrimAnimationDuration(long j2) {
    }

    public void setScrimVisibleHeightTrigger(int i2) {
    }

    public void setScrimsShown(boolean z) {
    }

    public void setStatusBarScrim(Drawable drawable) {
    }

    public void setStatusBarScrimColor(int i2) {
    }

    public void setStatusBarScrimResource(int i2) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public void setTitleEnabled(boolean z) {
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i2) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c extends FrameLayout.LayoutParams {
        public int a;
        public float b;

        public c(Context context, AttributeSet attributeSet) {
        }

        public void a(float f) {
        }

        public c(int i2, int i3) {
        }

        public c(ViewGroup.LayoutParams layoutParams) {
        }
    }
}
