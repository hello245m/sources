package com.tencent.mp.feature.editor.ui;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.tencent.mp.feature.data.biz.account.domain.article.MakeImageConfig;
import j.g.t.p0;
import java.io.File;
import java.util.List;
import n.u;
import o.a.f2;
import o.a.t0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class NewMakeImageActivity extends k.i.h.b.d.b1.b implements View.OnClickListener {
    public final n.d h;

    /* renamed from: i, reason: collision with root package name */
    public final k.i.h.b.k.l.c f1462i;

    /* renamed from: j, reason: collision with root package name */
    public final n.d f1463j;

    /* renamed from: k, reason: collision with root package name */
    public final n.d f1464k;

    /* renamed from: l, reason: collision with root package name */
    public final n.d f1465l;

    /* renamed from: m, reason: collision with root package name */
    public final n.d f1466m;

    /* renamed from: n, reason: collision with root package name */
    public final n.d f1467n;

    /* renamed from: o, reason: collision with root package name */
    public final n.d f1468o;

    /* renamed from: p, reason: collision with root package name */
    public final n.d f1469p;

    /* renamed from: q, reason: collision with root package name */
    public Dialog f1470q;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends n.d0.d.o implements n.d0.c.a<k.i.h.b.k.m.c> {
        public final /* synthetic */ NewMakeImageActivity a;

        public a(NewMakeImageActivity newMakeImageActivity) {
        }

        public final k.i.h.b.k.m.c b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.k.m.c invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.NewMakeImageActivity$checkNewCropHint$1", f = "NewMakeImageActivity.kt", l = {821}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super u>, Object> {
        public int a;
        public final /* synthetic */ NewMakeImageActivity b;

        public b(NewMakeImageActivity newMakeImageActivity, n.a0.d<? super b> dVar) {
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
    public static final class c extends n.d0.d.o implements n.d0.c.a<Integer> {
        public final /* synthetic */ NewMakeImageActivity a;

        public c(NewMakeImageActivity newMakeImageActivity) {
        }

        public final Integer b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Integer invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends n.d0.d.o implements n.d0.c.a<Integer> {
        public final /* synthetic */ NewMakeImageActivity a;

        public d(NewMakeImageActivity newMakeImageActivity) {
        }

        public final Integer b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Integer invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.NewMakeImageActivity$generateFailed$1", f = "NewMakeImageActivity.kt", l = {751}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super u>, Object> {
        public int a;
        public final /* synthetic */ NewMakeImageActivity b;

        public e(NewMakeImageActivity newMakeImageActivity, n.a0.d<? super e> dVar) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.NewMakeImageActivity$generateImg$1", f = "NewMakeImageActivity.kt", l = {628, 646, 649}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super u>, Object> {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ NewMakeImageActivity d;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.NewMakeImageActivity$generateImg$1$file$1$1", f = "NewMakeImageActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super File>, Object> {
            public int a;
            public final /* synthetic */ Bitmap b;

            public a(Bitmap bitmap, n.a0.d<? super a> dVar) {
            }

            @Override // n.a0.k.a.a
            public final n.a0.d<u> create(Object obj, n.a0.d<?> dVar) {
            }

            @Override // n.d0.c.p
            public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super File> dVar) {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(t0 t0Var, n.a0.d<? super File> dVar) {
            }

            @Override // n.a0.k.a.a
            public final Object invokeSuspend(Object obj) {
            }
        }

        public f(NewMakeImageActivity newMakeImageActivity, n.a0.d<? super f> dVar) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.NewMakeImageActivity$initData$1", f = "NewMakeImageActivity.kt", l = {317}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super u>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ NewMakeImageActivity c;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.d0.d.o implements n.d0.c.a<u> {
            public final /* synthetic */ NewMakeImageActivity a;

            public a(NewMakeImageActivity newMakeImageActivity) {
            }

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ u invoke() {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public g(NewMakeImageActivity newMakeImageActivity, n.a0.d<? super g> dVar) {
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
    public static final class h implements TextWatcher {
        public final /* synthetic */ NewMakeImageActivity a;

        public h(NewMakeImageActivity newMakeImageActivity) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i implements k.i.h.b.k.s.a0.d {
        public final /* synthetic */ NewMakeImageActivity a;

        public i(NewMakeImageActivity newMakeImageActivity) {
        }

        @Override // k.i.h.b.k.s.a0.d
        public void b() {
        }

        @Override // k.i.h.b.k.s.a0.d
        public void c() {
        }

        @Override // k.i.h.b.k.s.a0.d
        public void d(Exception exc) {
        }

        @Override // k.i.h.b.k.s.a0.d
        public void e(boolean z) {
        }

        @Override // k.i.h.b.k.s.a0.d
        public void f(MotionEvent motionEvent) {
        }

        @Override // k.i.h.b.k.s.a0.d
        public void onLongPress(MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j extends n.d0.d.o implements n.d0.c.a<k.i.h.b.k.o.j2.b> {
        public final /* synthetic */ NewMakeImageActivity a;

        public j(NewMakeImageActivity newMakeImageActivity) {
        }

        public final k.i.h.b.k.o.j2.b b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.k.o.j2.b invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class k extends n.d0.d.o implements n.d0.c.a<MakeImageConfig> {
        public final /* synthetic */ NewMakeImageActivity a;

        public k(NewMakeImageActivity newMakeImageActivity) {
        }

        public final MakeImageConfig b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ MakeImageConfig invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class l extends n.d0.d.o implements n.d0.c.a<k.i.h.b.k.o.j2.a> {
        public final /* synthetic */ NewMakeImageActivity a;

        public l(NewMakeImageActivity newMakeImageActivity) {
        }

        public final k.i.h.b.k.o.j2.a b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.k.o.j2.a invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class m extends n.d0.d.o implements n.d0.c.a<u> {
        public final /* synthetic */ NewMakeImageActivity a;

        public m(NewMakeImageActivity newMakeImageActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class n extends n.d0.d.o implements n.d0.c.a<ViewModelStore> {
        public final /* synthetic */ k.i.h.b.d.b1.b a;

        public n(k.i.h.b.d.b1.b bVar) {
        }

        public final ViewModelStore b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ ViewModelStore invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class o extends n.d0.d.o implements n.d0.c.a<k.i.h.b.d.d1.c> {
        public final /* synthetic */ n.d0.c.a a;
        public final /* synthetic */ k.i.h.b.d.b1.b b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.d0.d.o implements n.d0.c.a<ViewModelProvider.Factory> {
            public final /* synthetic */ k.i.h.b.d.b1.b a;

            public a(k.i.h.b.d.b1.b bVar) {
            }

            public final ViewModelProvider.Factory b() {
            }

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ ViewModelProvider.Factory invoke() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class b extends n.d0.d.o implements n.d0.c.l<ViewModel, u> {
            public final /* synthetic */ k.i.h.b.d.b1.b a;

            public b(k.i.h.b.d.b1.b bVar) {
            }

            public final void b(ViewModel viewModel) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ u invoke(ViewModel viewModel) {
            }
        }

        public o(n.d0.c.a aVar, k.i.h.b.d.b1.b bVar) {
        }

        public final k.i.h.b.d.d1.c b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.d.d1.c invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class p extends n.d0.d.o implements n.d0.c.l<k.i.h.b.k.r.b, u> {
        public final /* synthetic */ k.i.h.b.d.b1.b a;

        public p(k.i.h.b.d.b1.b bVar) {
        }

        public final void b(k.i.h.b.k.r.b bVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(k.i.h.b.k.r.b bVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class q extends n.d0.d.o implements n.d0.c.a<k.i.h.b.k.o.j2.c.c> {
        public final /* synthetic */ NewMakeImageActivity a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.d0.d.o implements n.d0.c.a<u> {
            public final /* synthetic */ NewMakeImageActivity a;

            public a(NewMakeImageActivity newMakeImageActivity) {
            }

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ u invoke() {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public q(NewMakeImageActivity newMakeImageActivity) {
        }

        public final k.i.h.b.k.o.j2.c.c b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.k.o.j2.c.c invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.NewMakeImageActivity$updateColorByImageRectUpdate$1", f = "NewMakeImageActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class r extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super u>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ NewMakeImageActivity c;

        public r(boolean z, NewMakeImageActivity newMakeImageActivity, n.a0.d<? super r> dVar) {
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

    public static final void A2(NewMakeImageActivity newMakeImageActivity) {
    }

    public static final void B2(NewMakeImageActivity newMakeImageActivity, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
    }

    public static final void C2(NewMakeImageActivity newMakeImageActivity, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
    }

    public static final p0 E2(NewMakeImageActivity newMakeImageActivity, View view, p0 p0Var) {
    }

    public static /* synthetic */ void F2(NewMakeImageActivity newMakeImageActivity) {
    }

    public static final /* synthetic */ void G1(NewMakeImageActivity newMakeImageActivity) {
    }

    public static /* synthetic */ void G2(NewMakeImageActivity newMakeImageActivity) {
    }

    public static final /* synthetic */ void H1(NewMakeImageActivity newMakeImageActivity) {
    }

    public static /* synthetic */ p0 H2(NewMakeImageActivity newMakeImageActivity, View view, p0 p0Var) {
    }

    public static final /* synthetic */ void I1(NewMakeImageActivity newMakeImageActivity) {
    }

    public static /* synthetic */ void I2(NewMakeImageActivity newMakeImageActivity, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
    }

    public static final /* synthetic */ void J1(NewMakeImageActivity newMakeImageActivity) {
    }

    public static /* synthetic */ void J2(NewMakeImageActivity newMakeImageActivity, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
    }

    public static final /* synthetic */ void K1(NewMakeImageActivity newMakeImageActivity, boolean z) {
    }

    public static final /* synthetic */ void L1(NewMakeImageActivity newMakeImageActivity, String str) {
    }

    public static final /* synthetic */ k.i.h.b.k.m.c M1(NewMakeImageActivity newMakeImageActivity) {
    }

    public static final /* synthetic */ int N1(NewMakeImageActivity newMakeImageActivity) {
    }

    public static final /* synthetic */ k.i.h.b.k.o.j2.b O1(NewMakeImageActivity newMakeImageActivity) {
    }

    public static /* synthetic */ void O2(NewMakeImageActivity newMakeImageActivity, long j2, int i2, Object obj) {
    }

    public static final /* synthetic */ MakeImageConfig P1(NewMakeImageActivity newMakeImageActivity) {
    }

    public static final void P2(NewMakeImageActivity newMakeImageActivity) {
    }

    public static final /* synthetic */ k.i.h.b.k.l.c Q1(NewMakeImageActivity newMakeImageActivity) {
    }

    public static final /* synthetic */ k.i.h.b.k.o.j2.c.c R1(NewMakeImageActivity newMakeImageActivity) {
    }

    public static /* synthetic */ void R2(NewMakeImageActivity newMakeImageActivity, int i2, int i3, boolean z, int i4, Object obj) {
    }

    public static final /* synthetic */ k.i.h.b.k.r.b S1(NewMakeImageActivity newMakeImageActivity) {
    }

    public static final /* synthetic */ void T1(NewMakeImageActivity newMakeImageActivity, Bundle bundle) {
    }

    public static final /* synthetic */ void U1(NewMakeImageActivity newMakeImageActivity, MotionEvent motionEvent) {
    }

    public static final /* synthetic */ void V1(NewMakeImageActivity newMakeImageActivity) {
    }

    public static final /* synthetic */ void W1(NewMakeImageActivity newMakeImageActivity, long j2) {
    }

    public static final /* synthetic */ f2 X1(NewMakeImageActivity newMakeImageActivity, boolean z) {
    }

    public static final /* synthetic */ void Y1(NewMakeImageActivity newMakeImageActivity, List list) {
    }

    public static /* synthetic */ void Y2(NewMakeImageActivity newMakeImageActivity, List list, List list2, boolean z, int i2, Object obj) {
    }

    public static final /* synthetic */ void Z1(NewMakeImageActivity newMakeImageActivity) {
    }

    public static final /* synthetic */ void a2(NewMakeImageActivity newMakeImageActivity, boolean z) {
    }

    public static final /* synthetic */ void b2(NewMakeImageActivity newMakeImageActivity, CharSequence charSequence) {
    }

    public static final /* synthetic */ void c2(NewMakeImageActivity newMakeImageActivity) {
    }

    public static /* synthetic */ MakeImageConfig l2(NewMakeImageActivity newMakeImageActivity, String str, k.i.h.b.k.l.a aVar, String str2, int i2, Object obj) {
    }

    public final void D2() {
    }

    public final void K2() {
    }

    public final void L2(MotionEvent motionEvent) {
    }

    public final void M2() {
    }

    public final void N2(long j2) {
    }

    public final void Q2(int i2, int i3, boolean z) {
    }

    public final f2 S2(boolean z) {
    }

    public final void T2(List<Integer> list) {
    }

    public final void U2(int i2) {
    }

    public final void V2() {
    }

    public final void W2(boolean z) {
    }

    @Override // k.i.h.b.d.b1.a
    public j.z.a X0() {
    }

    public final void X2(List<Integer> list, List<? extends Point> list2, boolean z) {
    }

    public final void Z2(CharSequence charSequence) {
    }

    public final void a3() {
    }

    public final void d2() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
    }

    public final void e2() {
    }

    public final f2 f2() {
    }

    public final void g2(Uri uri) {
    }

    public final void h2() {
    }

    public final void i2() {
    }

    public final void j2(boolean z) {
    }

    public final MakeImageConfig k2(String str, k.i.h.b.k.l.a aVar, String str2) {
    }

    public final void m2(String str) {
    }

    public final f2 n2() {
    }

    public final k.i.h.b.k.m.c o2() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // k.i.h.b.d.b1.b, k.i.h.b.d.b1.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, j.g.j.h, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    public final int p2() {
    }

    public final int q2() {
    }

    public final k.i.h.b.k.o.j2.b r2() {
    }

    public final MakeImageConfig s2() {
    }

    public final k.i.h.b.k.o.j2.a t2() {
    }

    public final k.i.h.b.k.o.j2.c.c u2() {
    }

    public final k.i.h.b.k.r.b v2() {
    }

    public final void w2() {
    }

    public final void x2(Bundle bundle) {
    }

    public final f2 y2() {
    }

    public final void z2() {
    }
}
