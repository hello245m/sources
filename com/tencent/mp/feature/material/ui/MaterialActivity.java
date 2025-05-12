package com.tencent.mp.feature.material.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import k.i.h.b.b.a.p.v;
import k.i.h.b.t.i.d0;
import k.i.h.b.t.i.e0;
import k.i.h.c.d.a.h.e.b;
import n.a0.k.a.l;
import n.d0.c.p;
import n.d0.d.o;
import n.u;
import o.a.t0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class MaterialActivity extends k.i.h.b.d.b1.b {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f1630i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f1631j;

    /* renamed from: k, reason: collision with root package name */
    public final k.i.h.c.d.a.h.e.b<e0, RecyclerView.e0> f1632k;

    /* renamed from: l, reason: collision with root package name */
    public k.i.h.b.d.b1.h.b f1633l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1634m;

    /* renamed from: n, reason: collision with root package name */
    public long f1635n;

    /* renamed from: o, reason: collision with root package name */
    public int f1636o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1637p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1638q;

    /* renamed from: r, reason: collision with root package name */
    public int f1639r;

    /* renamed from: s, reason: collision with root package name */
    public e0 f1640s;

    /* renamed from: t, reason: collision with root package name */
    public volatile boolean f1641t;
    public k.i.h.b.t.j.b u;
    public final e v;
    public Map<Integer, View> w;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends RecyclerView.e0 {
        public final ViewGroup a;
        public final TextView b;
        public final TextView c;

        public a(View view) {
        }

        public final TextView c() {
        }

        public final ViewGroup l() {
        }

        public final TextView n() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends RecyclerView.e0 {
        public b(View view) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.material.ui.MaterialActivity$doDeleteMaterialItem$1", f = "MaterialActivity.kt", l = {513}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends l implements p<t0, n.a0.d<? super u>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ MaterialActivity c;
        public final /* synthetic */ k.i.h.b.h.a.a.e.c.c d;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.material.ui.MaterialActivity$doDeleteMaterialItem$1$1", f = "MaterialActivity.kt", l = {520}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends l implements p<t0, n.a0.d<? super u>, Object> {
            public int a;
            public final /* synthetic */ MaterialActivity b;
            public final /* synthetic */ String c;
            public final /* synthetic */ int d;

            public a(MaterialActivity materialActivity, String str, int i2, n.a0.d<? super a> dVar) {
            }

            @Override // n.a0.k.a.a
            public final n.a0.d<u> create(Object obj, n.a0.d<?> dVar) {
            }

            @Override // n.d0.c.p
            public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super u> dVar) {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(t0 t0Var, n.a0.d<? super u> dVar) {
            }

            @Override // n.a0.k.a.a
            public final Object invokeSuspend(Object obj) {
            }
        }

        public c(MaterialActivity materialActivity, k.i.h.b.h.a.a.e.c.c cVar, n.a0.d<? super c> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.material.ui.MaterialActivity$initializeData$1", f = "MaterialActivity.kt", l = {317}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends l implements p<t0, n.a0.d<? super u>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ MaterialActivity c;

        public d(MaterialActivity materialActivity, n.a0.d<? super d> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e implements k.i.d.a.d.b<Boolean> {
        public final /* synthetic */ MaterialActivity a;

        public e(MaterialActivity materialActivity) {
        }

        @Override // k.i.d.a.d.b
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
        }

        public void b(Boolean bool) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends b.a<e0, RecyclerView.e0> {
        public final /* synthetic */ MaterialActivity a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends o implements n.d0.c.l<k.i.h.b.h.a.a.e.c.c, CharSequence> {
            public static final a a = null;

            public final CharSequence b(k.i.h.b.h.a.a.e.c.c cVar) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ CharSequence invoke(k.i.h.b.h.a.a.e.c.c cVar) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class b extends o implements n.d0.c.l<k.i.h.b.h.a.a.e.c.c, CharSequence> {
            public static final b a = null;

            public final CharSequence b(k.i.h.b.h.a.a.e.c.c cVar) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ CharSequence invoke(k.i.h.b.h.a.a.e.c.c cVar) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class c extends ClickableSpan {
            public final /* synthetic */ MaterialActivity a;

            public c(MaterialActivity materialActivity) {
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
            }
        }

        public f(MaterialActivity materialActivity) {
        }

        public static final void f(MaterialActivity materialActivity, e0 e0Var, View view) {
        }

        public static final boolean g(MaterialActivity materialActivity, View view, View view2, MotionEvent motionEvent) {
        }

        public static final boolean h(MaterialActivity materialActivity, e0 e0Var, View view) {
        }

        public static final void i(e0 e0Var, ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        }

        public static final void j(MaterialActivity materialActivity, e0 e0Var, MenuItem menuItem, int i2) {
        }

        public static /* synthetic */ void m(MaterialActivity materialActivity, e0 e0Var, MenuItem menuItem, int i2) {
        }

        public static /* synthetic */ void n(e0 e0Var, ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        }

        public static /* synthetic */ void o(MaterialActivity materialActivity, e0 e0Var, View view) {
        }

        public static /* synthetic */ boolean p(MaterialActivity materialActivity, View view, View view2, MotionEvent motionEvent) {
        }

        public static /* synthetic */ boolean q(MaterialActivity materialActivity, e0 e0Var, View view) {
        }

        @Override // k.i.h.c.d.a.h.e.b.a
        public /* bridge */ /* synthetic */ void a(RecyclerView.e0 e0Var, int i2, e0 e0Var2) {
        }

        @Override // k.i.h.c.d.a.h.e.b.a
        public /* bridge */ /* synthetic */ RecyclerView.e0 b(View view, int i2) {
        }

        @Override // k.i.h.c.d.a.h.e.b.a
        public int c(int i2) {
        }

        @Override // k.i.h.c.d.a.h.e.b.a
        public /* bridge */ /* synthetic */ int d(int i2, e0 e0Var) {
        }

        public void e(RecyclerView.e0 e0Var, int i2, e0 e0Var2) {
        }

        public RecyclerView.e0 k(View view, int i2) {
        }

        public int l(int i2, e0 e0Var) {
        }
    }

    public static final /* synthetic */ e0 H1(MaterialActivity materialActivity) {
    }

    public static final /* synthetic */ k.i.h.b.t.j.b I1(MaterialActivity materialActivity) {
    }

    public static final /* synthetic */ void J1(MaterialActivity materialActivity) {
    }

    public static final /* synthetic */ d0 K1(MaterialActivity materialActivity) {
    }

    public static final /* synthetic */ long L1(MaterialActivity materialActivity) {
    }

    public static final /* synthetic */ k.i.h.c.d.a.h.e.b M1(MaterialActivity materialActivity) {
    }

    public static final /* synthetic */ int N1(MaterialActivity materialActivity) {
    }

    public static final /* synthetic */ int O1(MaterialActivity materialActivity) {
    }

    public static final /* synthetic */ void P1(MaterialActivity materialActivity, e0 e0Var) {
    }

    public static final /* synthetic */ void Q1(MaterialActivity materialActivity, int i2) {
    }

    public static final /* synthetic */ void R1(MaterialActivity materialActivity, int i2) {
    }

    public static final /* synthetic */ void S1(MaterialActivity materialActivity, boolean z) {
    }

    public static /* synthetic */ void V1(MaterialActivity materialActivity, long j2, long j3, boolean z, int i2, int i3, Object obj) {
    }

    public static final void a2(MaterialActivity materialActivity, k.i.h.a.b.a aVar) {
    }

    public static final void d2(MaterialActivity materialActivity) {
    }

    public static final void e2(MaterialActivity materialActivity) {
    }

    public static final boolean f2(MaterialActivity materialActivity, View view, MotionEvent motionEvent) {
    }

    public static /* synthetic */ void g2(MaterialActivity materialActivity, Integer num) {
    }

    public static /* synthetic */ void h2(MaterialActivity materialActivity, e0 e0Var, DialogInterface dialogInterface, int i2) {
    }

    public static /* synthetic */ void i2(MaterialActivity materialActivity, v.a aVar) {
    }

    public static /* synthetic */ void j2(MaterialActivity materialActivity) {
    }

    public static /* synthetic */ void k2(MaterialActivity materialActivity) {
    }

    public static /* synthetic */ boolean l2(MaterialActivity materialActivity, View view, MotionEvent motionEvent) {
    }

    public static /* synthetic */ void m2(MaterialActivity materialActivity, k.i.h.a.b.a aVar) {
    }

    public static final void o2(MaterialActivity materialActivity, Integer num) {
    }

    public static final void p2(MaterialActivity materialActivity, v.a aVar) {
    }

    public static final void r2(MaterialActivity materialActivity, e0 e0Var, DialogInterface dialogInterface, int i2) {
    }

    public View G1(int i2) {
    }

    public final void T1(e0 e0Var) {
    }

    public final void U1(long j2, long j3, boolean z, int i2) {
    }

    @Override // k.i.h.b.d.b1.a
    public int W0() {
    }

    public final void W1() {
    }

    public final long X1() {
    }

    public final String Y1(int i2) {
    }

    public final void Z1() {
    }

    public final void b2() {
    }

    public final void c2() {
    }

    public final void n2() {
    }

    @Override // k.i.h.b.d.b1.b, k.i.h.b.d.b1.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, j.g.j.h, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // k.i.h.b.d.b1.b, j.b.k.d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // k.i.h.b.d.b1.b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    public final void q2(e0 e0Var) {
    }

    public final void s2(boolean z) {
    }

    public final void t2() {
    }
}
