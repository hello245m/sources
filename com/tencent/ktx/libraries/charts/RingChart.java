package com.tencent.ktx.libraries.charts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.util.List;
import k.i.d.b.b.e.c;
import n.d0.d.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class RingChart extends c {
    public RectF A;
    public RectF B;
    public List<a> C;
    public List<a> D;
    public List<a> E;
    public int F;
    public final Paint G;

    /* renamed from: q, reason: collision with root package name */
    public final float f1092q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1093r;

    /* renamed from: s, reason: collision with root package name */
    public final float f1094s;

    /* renamed from: t, reason: collision with root package name */
    public List<b> f1095t;
    public float u;
    public int v;
    public PointF w;
    public int x;
    public float y;
    public float z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a {
        public final int a;
        public final float b;
        public final float c;
        public final PointF d;

        public a(int i2, float f, float f2, PointF pointF) {
        }

        public final int a() {
        }

        public final float b() {
        }

        public final float c() {
        }

        public final PointF d() {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    public RingChart(Context context, AttributeSet attributeSet) {
    }

    @Override // k.i.d.b.b.e.c
    public void c(float f) {
    }

    @Override // k.i.d.b.b.e.c
    @SuppressLint({"RtlHardcoded"})
    public void d() {
    }

    @Override // k.i.d.b.b.e.c, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
    }

    @Override // k.i.d.b.b.e.c
    public boolean e() {
    }

    @Override // k.i.d.b.b.e.c
    public void f(Canvas canvas) {
    }

    @Override // k.i.d.b.b.e.c
    public boolean g(PointF pointF) {
    }

    public final void setData(List<b> list) {
    }

    public RingChart(Context context, AttributeSet attributeSet, int i2) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b {
        public final String a;
        public final int b;
        public final int c;
        public String d;
        public String e;
        public float f;

        public b(String str, int i2, int i3, String str2, String str3) {
        }

        public final int a() {
        }

        public final String b() {
        }

        public final String c() {
        }

        public final String d() {
        }

        public final int e() {
        }

        public final float f() {
        }

        public final void g(float f) {
        }

        public /* synthetic */ b(String str, int i2, int i3, String str2, String str3, int i4, h hVar) {
        }
    }
}
