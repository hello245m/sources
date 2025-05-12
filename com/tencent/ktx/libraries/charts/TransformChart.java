package com.tencent.ktx.libraries.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.text.DecimalFormat;
import java.util.List;
import n.d;
import n.i;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class TransformChart extends View {
    public static final int A = 0;
    public static final int B = 0;
    public static final int C = 0;
    public static final int D = 0;
    public static final int E = 0;
    public static final int w = 4;
    public static final int x = 12;
    public static final float y = 500.0f;
    public static final float z = -1.0f;
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public int f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f1096i;

    /* renamed from: j, reason: collision with root package name */
    public int f1097j;

    /* renamed from: k, reason: collision with root package name */
    public final d f1098k;

    /* renamed from: l, reason: collision with root package name */
    public List<a> f1099l;

    /* renamed from: m, reason: collision with root package name */
    public final List<i<PointF, PointF>> f1100m;

    /* renamed from: n, reason: collision with root package name */
    public final Path f1101n;

    /* renamed from: o, reason: collision with root package name */
    public final PointF f1102o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1103p;

    /* renamed from: q, reason: collision with root package name */
    public float f1104q;

    /* renamed from: r, reason: collision with root package name */
    public long f1105r;

    /* renamed from: s, reason: collision with root package name */
    public final d f1106s;

    /* renamed from: t, reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f1107t;
    public final Paint u;
    public final TextPaint v;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a {
        public final String a;
        public final int b;
        public float c;

        public a(String str, int i2) {
        }

        public final float a() {
        }

        public final String b() {
        }

        public final int c() {
        }

        public final void d(float f) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    public TransformChart(Context context, AttributeSet attributeSet) {
    }

    private final float getAnimationCoefficient() {
    }

    private final float getINSIDE_PADDING() {
    }

    private final DecimalFormat getPercentageFormat() {
    }

    public static /* synthetic */ void h(TransformChart transformChart, Canvas canvas, String str, float f, float f2, Integer num, int i2, Object obj) {
    }

    public static /* synthetic */ Rect k(TransformChart transformChart, String str, Float f, Integer num, int i2, Object obj) {
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void c(Canvas canvas) {
    }

    public final void d(Canvas canvas) {
    }

    public final void e(Canvas canvas) {
    }

    public final void f(Canvas canvas) {
    }

    public final void g(Canvas canvas, String str, float f, float f2, Integer num) {
    }

    public final int getAxisTextColor() {
    }

    public final float getAxisTextSize() {
    }

    public final float getAxisTextWidth() {
    }

    public final int getLineColor() {
    }

    public final float getLineWidth() {
    }

    public final int getPercentageTextColor() {
    }

    public final float getPercentageTextSize() {
    }

    public final int getShadeColor() {
    }

    public final int getValueTextColor() {
    }

    public final float getValueTextSize() {
    }

    public final void i(Canvas canvas) {
    }

    public final Rect j(String str, Float f, Integer num) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public final void setAxisTextColor(int i2) {
    }

    public final void setAxisTextSize(float f) {
    }

    public final void setAxisTextWidth(float f) {
    }

    public final void setData(List<a> list) {
    }

    public final void setLineColor(int i2) {
    }

    public final void setLineWidth(float f) {
    }

    public final void setPercentageTextColor(int i2) {
    }

    public final void setPercentageTextSize(float f) {
    }

    public final void setShadeColor(int i2) {
    }

    public final void setValueTextColor(int i2) {
    }

    public final void setValueTextSize(float f) {
    }

    public TransformChart(Context context, AttributeSet attributeSet, int i2) {
    }
}
