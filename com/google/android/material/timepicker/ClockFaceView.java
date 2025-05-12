package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import j.g.t.g;
import j.g.t.r0.c;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ClockFaceView extends k.d.a.c.r0.a implements ClockHandView.d {
    public final SparseArray<TextView> A;
    public final g B;
    public final int[] C;
    public final float[] D;
    public final int E;
    public String[] F;
    public float G;
    public final ColorStateList H;
    public final ClockHandView x;
    public final Rect y;
    public final RectF z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ ClockFaceView a;

        public a(ClockFaceView clockFaceView) {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends g {
        public final /* synthetic */ ClockFaceView d;

        public b(ClockFaceView clockFaceView) {
        }

        @Override // j.g.t.g
        public void g(View view, c cVar) {
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ ClockHandView H(ClockFaceView clockFaceView) {
    }

    public static /* synthetic */ int I(ClockFaceView clockFaceView) {
    }

    public static /* synthetic */ SparseArray J(ClockFaceView clockFaceView) {
    }

    @Override // k.d.a.c.r0.a
    public void D(int i2) {
    }

    public final void K() {
    }

    public final RadialGradient L(RectF rectF, RectF rectF2) {
    }

    public void M(String[] strArr, int i2) {
    }

    public final void N(int i2) {
    }

    @Override // com.google.android.material.timepicker.ClockHandView.d
    public void a(float f, boolean z) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i2) {
    }
}
