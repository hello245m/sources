package com.tencent.mp.feature.base.ui.widget.shadow_layout;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ShadowLayout extends FrameLayout {
    public float A;
    public float B;
    public float C;
    public float D;
    public Paint E;
    public float F;
    public int G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public TextView O;
    public int P;
    public int Q;
    public String R;
    public String S;
    public View.OnClickListener T;
    public Drawable a;
    public int b;
    public Drawable c;
    public Drawable d;
    public View e;
    public int f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public float f1397i;

    /* renamed from: j, reason: collision with root package name */
    public float f1398j;

    /* renamed from: k, reason: collision with root package name */
    public float f1399k;

    /* renamed from: l, reason: collision with root package name */
    public float f1400l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1401m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1402n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1403o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1404p;

    /* renamed from: q, reason: collision with root package name */
    public Paint f1405q;

    /* renamed from: r, reason: collision with root package name */
    public Paint f1406r;

    /* renamed from: s, reason: collision with root package name */
    public int f1407s;

    /* renamed from: t, reason: collision with root package name */
    public int f1408t;
    public int u;
    public int v;
    public RectF w;
    public int x;
    public boolean y;
    public boolean z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a implements View.OnLayoutChangeListener {
        public final /* synthetic */ ShadowLayout a;

        public a(ShadowLayout shadowLayout) {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        }
    }

    public ShadowLayout(Context context, AttributeSet attributeSet) {
    }

    public static int b(String str) throws IllegalArgumentException {
    }

    public void a() {
    }

    public final Bitmap c(int i2, int i3, float f, float f2, float f3, float f4, int i4, int i5) {
    }

    public int d(float f) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    public float[] e(int i2) {
    }

    public float[] f(int i2, int i3) {
    }

    public void g(Paint paint) {
    }

    public float getCornerRadius() {
    }

    public float getShadowLimit() {
    }

    public final void h(AttributeSet attributeSet) {
    }

    public final void i(Context context, AttributeSet attributeSet) {
    }

    public void j(int i2) {
    }

    public final void k(float[] fArr) {
    }

    public final void l(int i2, int i3) {
    }

    public void m() {
    }

    public final void n(Canvas canvas, int i2) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
    }

    public void setCornerRadius(int i2) {
    }

    public void setLayoutBackground(int i2) {
    }

    public void setLayoutBackgroundTrue(int i2) {
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
    }

    public void setShadowColor(int i2) {
    }

    public void setShadowHidden(boolean z) {
    }

    public void setShadowHiddenBottom(boolean z) {
    }

    public void setShadowHiddenLeft(boolean z) {
    }

    public void setShadowHiddenRight(boolean z) {
    }

    public void setShadowHiddenTop(boolean z) {
    }

    public void setShadowLimit(int i2) {
    }

    public void setShadowOffsetX(float f) {
    }

    public void setShadowOffsetY(float f) {
    }

    public void setStrokeColor(int i2) {
    }

    public void setStrokeColorTrue(int i2) {
    }

    public void setStrokeWidth(int i2) {
    }

    public void setmBackGround(Drawable drawable) {
    }

    public ShadowLayout(Context context, AttributeSet attributeSet, int i2) {
    }
}
