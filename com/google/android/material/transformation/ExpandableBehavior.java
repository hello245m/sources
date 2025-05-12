package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

@Deprecated
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    public int a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ int b;
        public final /* synthetic */ k.d.a.c.d0.a c;
        public final /* synthetic */ ExpandableBehavior d;

        public a(ExpandableBehavior expandableBehavior, View view, int i2, k.d.a.c.d0.a aVar) {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
        }
    }

    public ExpandableBehavior() {
    }

    public static /* synthetic */ int a(ExpandableBehavior expandableBehavior) {
    }

    public final boolean b(boolean z) {
    }

    public k.d.a.c.d0.a c(CoordinatorLayout coordinatorLayout, View view) {
    }

    public abstract boolean d(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i2) {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
