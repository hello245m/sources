package com.tencent.ktx.libraries.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import java.util.List;
import k.i.d.b.b.e.a;
import n.d0.c.l;
import n.d0.c.q;
import n.d0.d.o;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class LineChart extends k.i.d.b.b.e.a {
    public final float g0;
    public final int h0;
    public float i0;
    public int j0;
    public c k0;
    public l<? super String, String> l0;
    public q<? super String, ? super d, ? super Integer, String> m0;
    public final List<e> n0;
    public final List<e> o0;
    public final List<e> p0;
    public int q0;
    public final Paint r0;
    public final Path s0;

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
        public final List<PointF> c;

        public e(int i2, List<f> list, List<? extends PointF> list2) {
        }

        public final int a() {
        }

        public final List<PointF> b() {
        }

        public final List<f> c() {
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

    public LineChart(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ List q(LineChart lineChart, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, int i2, float f2, int i3, Object obj) {
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

    public final List<PointF> p(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, int i2, float f2) {
    }

    public final float r(float f2, PointF pointF, PointF pointF2, float f3) {
    }

    public final List<PointF> s(List<f> list) {
    }

    public final void setData(c cVar) {
    }

    public final void setSelectedDescBuilder(q<? super String, ? super d, ? super Integer, String> qVar) {
    }

    public final void setSelectedTitleBuilder(l<? super String, String> lVar) {
    }

    public final boolean t(c cVar) {
    }

    public final void u(Canvas canvas) {
    }

    public final void v(Canvas canvas) {
    }

    public final void w(Canvas canvas) {
    }

    public final void x(Canvas canvas) {
    }

    public final PointF y(PointF pointF, PointF pointF2) {
    }

    public final PointF z(PointF pointF, float f2) {
    }

    public LineChart(Context context, AttributeSet attributeSet, int i2) {
    }
}
