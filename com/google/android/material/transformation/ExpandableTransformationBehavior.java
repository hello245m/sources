package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    public AnimatorSet b;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ ExpandableTransformationBehavior a;

        public a(ExpandableTransformationBehavior expandableTransformationBehavior) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public static /* synthetic */ AnimatorSet e(ExpandableTransformationBehavior expandableTransformationBehavior, AnimatorSet animatorSet) {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public boolean d(View view, View view2, boolean z, boolean z2) {
    }

    public abstract AnimatorSet f(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
    }
}
