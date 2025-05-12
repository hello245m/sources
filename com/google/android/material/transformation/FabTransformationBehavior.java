package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import k.d.a.c.m.h;
import k.d.a.c.m.i;
import k.d.a.c.m.j;

@Deprecated
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c;
    public final RectF d;
    public final RectF e;
    public final int[] f;
    public float g;
    public float h;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;

        public a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ View a;

        public b(FabTransformationBehavior fabTransformationBehavior, View view) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ k.d.a.c.x.d a;
        public final /* synthetic */ Drawable b;

        public c(FabTransformationBehavior fabTransformationBehavior, k.d.a.c.x.d dVar, Drawable drawable) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d extends AnimatorListenerAdapter {
        public final /* synthetic */ k.d.a.c.x.d a;

        public d(FabTransformationBehavior fabTransformationBehavior, k.d.a.c.x.d dVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class e {
        public h a;
        public j b;
    }

    public FabTransformationBehavior() {
    }

    public abstract e A(Context context, boolean z);

    public final ViewGroup B(View view) {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet f(View view, View view2, boolean z, boolean z2) {
    }

    public final ViewGroup g(View view) {
    }

    public final void h(View view, e eVar, i iVar, i iVar2, float f, float f2, float f3, float f4, RectF rectF) {
    }

    public final void i(View view, RectF rectF) {
    }

    public final Pair<i, i> j(float f, float f2, boolean z, e eVar) {
    }

    public final float k(View view, View view2, j jVar) {
    }

    public final float l(View view, View view2, j jVar) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    public final float m(View view, View view2, j jVar) {
    }

    public final float n(View view, View view2, j jVar) {
    }

    public final float o(e eVar, i iVar, float f, float f2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
    }

    public final void p(View view, RectF rectF) {
    }

    public final void q(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
    }

    public final void r(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
    }

    public final void s(View view, View view2, boolean z, e eVar, List<Animator> list) {
    }

    @TargetApi(21)
    public final void t(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
    }

    public final void u(View view, View view2, boolean z, boolean z2, e eVar, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
    }

    public final void v(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
    }

    public final void w(View view, long j2, long j3, long j4, int i2, int i3, float f, List<Animator> list) {
    }

    public final void x(View view, long j2, int i2, int i3, float f, List<Animator> list) {
    }

    public final void y(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
    }

    public final int z(View view) {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
    }
}
