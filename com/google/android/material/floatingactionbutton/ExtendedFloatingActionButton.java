package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import k.d.a.c.m.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    public boolean A;
    public boolean B;

    /* renamed from: s, reason: collision with root package name */
    public int f475s;

    /* renamed from: t, reason: collision with root package name */
    public final k.d.a.c.e0.d f476t;
    public final k.d.a.c.e0.d u;
    public final k.d.a.c.e0.d v;
    public final k.d.a.c.e0.d w;
    public final int x;
    public final CoordinatorLayout.c<ExtendedFloatingActionButton> y;
    public boolean z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends AnimatorListenerAdapter {
        public boolean a;
        public final /* synthetic */ k.d.a.c.e0.d b;
        public final /* synthetic */ f c;

        public a(ExtendedFloatingActionButton extendedFloatingActionButton, k.d.a.c.e0.d dVar, f fVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b extends Property<View, Float> {
        public b(Class cls, String str) {
        }

        public Float a(View view) {
        }

        public void b(View view, Float f) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Float get(View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, Float f) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c extends Property<View, Float> {
        public c(Class cls, String str) {
        }

        public Float a(View view) {
        }

        public void b(View view, Float f) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Float get(View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, Float f) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d extends Property<View, Float> {
        public d(Class cls, String str) {
        }

        public Float a(View view) {
        }

        public void b(View view, Float f) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Float get(View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, Float f) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class e extends Property<View, Float> {
        public e(Class cls, String str) {
        }

        public Float a(View view) {
        }

        public void b(View view, Float f) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Float get(View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, Float f) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class f {
    }

    public static /* synthetic */ k.d.a.c.e0.d l(ExtendedFloatingActionButton extendedFloatingActionButton) {
    }

    public static /* synthetic */ k.d.a.c.e0.d m(ExtendedFloatingActionButton extendedFloatingActionButton) {
    }

    public static /* synthetic */ void n(ExtendedFloatingActionButton extendedFloatingActionButton, k.d.a.c.e0.d dVar, f fVar) {
    }

    public static /* synthetic */ k.d.a.c.e0.d o(ExtendedFloatingActionButton extendedFloatingActionButton) {
    }

    public static /* synthetic */ k.d.a.c.e0.d p(ExtendedFloatingActionButton extendedFloatingActionButton) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
    }

    public int getCollapsedPadding() {
    }

    public int getCollapsedSize() {
    }

    public h getExtendMotionSpec() {
    }

    public h getHideMotionSpec() {
    }

    public h getShowMotionSpec() {
    }

    public h getShrinkMotionSpec() {
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
    }

    public final boolean q() {
    }

    public final void r(k.d.a.c.e0.d dVar, f fVar) {
    }

    public final void s() {
    }

    public void setAnimateShowBeforeLayout(boolean z) {
    }

    public void setExtendMotionSpec(h hVar) {
    }

    public void setExtendMotionSpecResource(int i2) {
    }

    public void setExtended(boolean z) {
    }

    public void setHideMotionSpec(h hVar) {
    }

    public void setHideMotionSpecResource(int i2) {
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setShowMotionSpec(h hVar) {
    }

    public void setShowMotionSpecResource(int i2) {
    }

    public void setShrinkMotionSpec(h hVar) {
    }

    public void setShrinkMotionSpecResource(int i2) {
    }

    @Override // android.widget.TextView
    public void setTextColor(int i2) {
    }

    public final boolean t() {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {
        public Rect a;
        public f b;
        public f c;
        public boolean d;
        public boolean e;

        public ExtendedFloatingActionButtonBehavior() {
        }

        public static boolean c(View view) {
        }

        public void a(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public boolean b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
        }

        public boolean d(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
        }

        public boolean e(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i2) {
        }

        public final boolean f(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void g(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public final boolean i(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
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

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
    }
}
