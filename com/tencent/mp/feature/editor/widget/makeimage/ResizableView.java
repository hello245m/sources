package com.tencent.mp.feature.editor.widget.makeimage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import k.i.h.b.d.b1.g.g;
import n.d0.c.l;
import n.d0.d.h;
import n.u;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class ResizableView extends View {
    public static final a v = null;
    public static final float w = 0.0f;
    public int a;
    public int b;
    public final float c;
    public final float d;
    public final float e;
    public final RectF f;
    public final RectF g;
    public final RectF h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f1503i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f1504j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f1505k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f1506l;

    /* renamed from: m, reason: collision with root package name */
    public int f1507m;

    /* renamed from: n, reason: collision with root package name */
    public l<? super Integer, u> f1508n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1509o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1510p;

    /* renamed from: q, reason: collision with root package name */
    public g f1511q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1512r;

    /* renamed from: s, reason: collision with root package name */
    public float f1513s;

    /* renamed from: t, reason: collision with root package name */
    public float f1514t;
    public int u;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
        }

        public final float a() {
        }
    }

    public ResizableView(Context context, AttributeSet attributeSet) {
    }

    public static final /* synthetic */ float a() {
    }

    public final boolean b(MotionEvent motionEvent) {
    }

    public final int getCurrentHeight() {
    }

    public final l<Integer, u> getOnHeightChange() {
    }

    public final int getStyle() {
    }

    public final float getTouchDownX() {
    }

    public final float getTouchDownY() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public final void setCurrentHeight(int i2) {
    }

    public final void setOnHeightChange(l<? super Integer, u> lVar) {
    }

    public final void setStyle(int i2) {
    }

    public final void setTouchDownX(float f) {
    }

    public final void setTouchDownY(float f) {
    }
}
