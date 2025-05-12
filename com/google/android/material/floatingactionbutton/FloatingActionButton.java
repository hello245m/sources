package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import j.g.t.e0;
import j.g.u.m;
import k.d.a.c.e0.b;
import k.d.a.c.f0.n;
import k.d.a.c.m.h;
import k.d.a.c.m.k;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class FloatingActionButton extends n implements e0, m, k.d.a.c.d0.a, k.d.a.c.l0.n, CoordinatorLayout.b {
    public ColorStateList b;
    public PorterDuff.Mode c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public ColorStateList f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f477i;

    /* renamed from: j, reason: collision with root package name */
    public int f478j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f479k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f480l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f481m;

    /* renamed from: n, reason: collision with root package name */
    public final j.b.q.n f482n;

    /* renamed from: o, reason: collision with root package name */
    public final k.d.a.c.d0.b f483o;

    /* renamed from: p, reason: collision with root package name */
    public k.d.a.c.e0.b f484p;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements b.j {
        public final /* synthetic */ b a;
        public final /* synthetic */ FloatingActionButton b;

        public a(FloatingActionButton floatingActionButton, b bVar) {
        }

        @Override // k.d.a.c.e0.b.j
        public void a() {
        }

        @Override // k.d.a.c.e0.b.j
        public void b() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements k.d.a.c.k0.b {
        public final /* synthetic */ FloatingActionButton a;

        public c(FloatingActionButton floatingActionButton) {
        }

        @Override // k.d.a.c.k0.b
        public void a(Drawable drawable) {
        }

        @Override // k.d.a.c.k0.b
        public void b(int i2, int i3, int i4, int i5) {
        }

        @Override // k.d.a.c.k0.b
        public boolean c() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d<T extends FloatingActionButton> implements b.i {
        public final k<T> a;
        public final /* synthetic */ FloatingActionButton b;

        public d(FloatingActionButton floatingActionButton, k<T> kVar) {
        }

        @Override // k.d.a.c.e0.b.i
        public void a() {
        }

        @Override // k.d.a.c.e0.b.i
        public void b() {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    public static /* synthetic */ int c(FloatingActionButton floatingActionButton) {
    }

    public static /* synthetic */ void d(FloatingActionButton floatingActionButton, Drawable drawable) {
    }

    private k.d.a.c.e0.b getImpl() {
    }

    public static int r(int i2, int i3) {
    }

    @Override // k.d.a.c.d0.a
    public boolean a() {
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
    }

    public void e(Animator.AnimatorListener animatorListener) {
    }

    public void f(Animator.AnimatorListener animatorListener) {
    }

    public void g(k<? extends FloatingActionButton> kVar) {
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
    }

    public float getCompatElevation() {
    }

    public float getCompatHoveredFocusedTranslationZ() {
    }

    public float getCompatPressedTranslationZ() {
    }

    public Drawable getContentBackground() {
    }

    public int getCustomSize() {
    }

    public int getExpandedComponentIdHint() {
    }

    public h getHideMotionSpec() {
    }

    @Deprecated
    public int getRippleColor() {
    }

    public ColorStateList getRippleColorStateList() {
    }

    public k.d.a.c.l0.k getShapeAppearanceModel() {
    }

    public h getShowMotionSpec() {
    }

    public int getSize() {
    }

    public int getSizeDimension() {
    }

    @Override // j.g.t.e0
    public ColorStateList getSupportBackgroundTintList() {
    }

    @Override // j.g.t.e0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
    }

    @Override // j.g.u.m
    public ColorStateList getSupportImageTintList() {
    }

    @Override // j.g.u.m
    public PorterDuff.Mode getSupportImageTintMode() {
    }

    public boolean getUseCompatPadding() {
    }

    public final k.d.a.c.e0.b h() {
    }

    @Deprecated
    public boolean i(Rect rect) {
    }

    public void j(Rect rect) {
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
    }

    public final int k(int i2) {
    }

    public void l(b bVar) {
    }

    public void m(b bVar, boolean z) {
    }

    public boolean n() {
    }

    public boolean o() {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public final void p(Rect rect) {
    }

    public final void q() {
    }

    public void s(b bVar) {
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCompatElevation(float f) {
    }

    public void setCompatElevationResource(int i2) {
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
    }

    public void setCompatHoveredFocusedTranslationZResource(int i2) {
    }

    public void setCompatPressedTranslationZ(float f) {
    }

    public void setCompatPressedTranslationZResource(int i2) {
    }

    public void setCustomSize(int i2) {
    }

    @Override // android.view.View
    public void setElevation(float f) {
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
    }

    public void setExpandedComponentIdHint(int i2) {
    }

    public void setHideMotionSpec(h hVar) {
    }

    public void setHideMotionSpecResource(int i2) {
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
    }

    public void setRippleColor(int i2) {
    }

    @Override // android.view.View
    public void setScaleX(float f) {
    }

    @Override // android.view.View
    public void setScaleY(float f) {
    }

    public void setShadowPaddingEnabled(boolean z) {
    }

    @Override // k.d.a.c.l0.n
    public void setShapeAppearanceModel(k.d.a.c.l0.k kVar) {
    }

    public void setShowMotionSpec(h hVar) {
    }

    public void setShowMotionSpecResource(int i2) {
    }

    public void setSize(int i2) {
    }

    @Override // j.g.t.e0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // j.g.t.e0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
    }

    @Override // j.g.u.m
    public void setSupportImageTintList(ColorStateList colorStateList) {
    }

    @Override // j.g.u.m
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
    }

    public void setUseCompatPadding(boolean z) {
    }

    @Override // k.d.a.c.f0.n, android.widget.ImageView, android.view.View
    public void setVisibility(int i2) {
    }

    public void t(b bVar, boolean z) {
    }

    public final b.j u(b bVar) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {
        public Rect a;
        public b b;
        public boolean c;

        public BaseBehavior() {
        }

        public static boolean b(View view) {
        }

        public boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
        }

        public final void c(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
        }

        public boolean d(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
        }

        public boolean e(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i2) {
        }

        public final boolean f(View view, FloatingActionButton floatingActionButton) {
        }

        public final boolean g(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        }

        public final boolean h(View view, FloatingActionButton floatingActionButton) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i2) {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
    }
}
