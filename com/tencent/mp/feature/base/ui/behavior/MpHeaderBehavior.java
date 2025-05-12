package com.tencent.mp.feature.base.ui.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class MpHeaderBehavior extends CoordinatorLayout.c<View> {
    private int consumedYSum;
    private final Context context;
    private boolean mCanScroll;
    private a mListener;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface a {
        void a(View view, int i2);
    }

    public MpHeaderBehavior(Context context, AttributeSet attributeSet) {
    }

    public final Context getContext() {
    }

    public final boolean getMCanScroll() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onNestedFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i2) {
    }

    public final void setMCanScroll(boolean z) {
    }

    public final void setOffsetChangeListener(a aVar) {
    }
}
