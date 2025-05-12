package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ClockHandView extends View {
    public ValueAnimator a;
    public boolean b;
    public float c;
    public float d;
    public boolean e;
    public int f;
    public final List<d> g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final float f515i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f516j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f517k;

    /* renamed from: l, reason: collision with root package name */
    public final int f518l;

    /* renamed from: m, reason: collision with root package name */
    public float f519m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f520n;

    /* renamed from: o, reason: collision with root package name */
    public c f521o;

    /* renamed from: p, reason: collision with root package name */
    public double f522p;

    /* renamed from: q, reason: collision with root package name */
    public int f523q;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ ClockHandView a;

        public a(ClockHandView clockHandView) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends AnimatorListenerAdapter {
        public b(ClockHandView clockHandView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface c {
        void a(float f, boolean z);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface d {
        void a(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, float f, boolean z) {
    }

    public void b(d dVar) {
    }

    public final void c(Canvas canvas) {
    }

    public RectF d() {
    }

    public final int e(float f, float f2) {
    }

    public float f() {
    }

    public int g() {
    }

    public final Pair<Float, Float> h(float f) {
    }

    public final boolean i(float f, float f2, boolean z, boolean z2, boolean z3) {
    }

    public void j(int i2) {
    }

    public void k(float f) {
    }

    public void l(float f, boolean z) {
    }

    public final void m(float f, boolean z) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i2) {
    }
}
