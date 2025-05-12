package com.tencent.ktx.libraries.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import java.util.List;
import k.i.d.b.b.e.a;
import n.d0.c.l;
import n.d0.c.q;
import n.d0.d.o;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class BarChart extends k.i.d.b.b.e.a {
    public float g0;
    public c h0;
    public l<? super String, String> i0;
    public q<? super String, ? super d, ? super Integer, String> j0;
    public final List<e> k0;
    public final List<e> l0;
    public final List<e> m0;
    public Integer[] n0;
    public final Paint o0;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a extends o implements l<String, String> {
        public static final a a = null;

        public final String b(String str) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ String invoke(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b extends o implements q<String, d, Integer, String> {
        public static final b a = null;

        @Override // n.d0.c.q
        public /* bridge */ /* synthetic */ String a(String str, d dVar, Integer num) {
        }

        public final String b(String str, d dVar, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class c extends a.b<d> {
        public c(List<d> list, List<String> list2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class d extends a.c {
        public final String b;
        public final int c;

        public d(String str, int i2, List<Integer> list) {
        }

        public final int b() {
        }

        public final String c() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class e {
        public final int a;
        public final List<f> b;

        public e(int i2, List<f> list) {
        }

        public final int a() {
        }

        public final List<f> b() {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class f {
        public final float a;
        public final float b;
        public final String c;

        public f(float f, float f2, String str) {
        }

        public final String a() {
        }

        public final float b() {
        }

        public final float c() {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    public BarChart(Context context, AttributeSet attributeSet) {
    }

    @Override // k.i.d.b.b.e.a, k.i.d.b.b.e.c
    public void c(float f2) {
    }

    @Override // k.i.d.b.b.e.a, k.i.d.b.b.e.c
    public void d() {
    }

    @Override // k.i.d.b.b.e.c
    public boolean e() {
    }

    @Override // k.i.d.b.b.e.a, k.i.d.b.b.e.c
    public void f(Canvas canvas) {
    }

    @Override // k.i.d.b.b.e.c
    public boolean g(PointF pointF) {
    }

    public final float getBarWidth() {
    }

    public final boolean p(c cVar) {
    }

    public final void q(Canvas canvas) {
    }

    public final void r(Canvas canvas) {
    }

    public final void setBarWidth(float f2) {
    }

    public final void setData(c cVar) {
    }

    public final void setSelectedDescBuilder(q<? super String, ? super d, ? super Integer, String> qVar) {
    }

    public final void setSelectedTitleBuilder(l<? super String, String> lVar) {
    }

    public BarChart(Context context, AttributeSet attributeSet, int i2) {
    }
}
