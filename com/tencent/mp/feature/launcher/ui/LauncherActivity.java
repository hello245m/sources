package com.tencent.mp.feature.launcher.ui;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import j.e.b.b.t;
import n.d0.c.p;
import n.d0.d.o;
import n.u;
import o.a.f2;
import o.a.t0;
import q.r;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class LauncherActivity extends k.i.h.b.d.b1.b implements k.i.d.a.d.g, View.OnClickListener {
    public k.i.h.b.d.b1.d.k h;

    /* renamed from: i, reason: collision with root package name */
    public k.i.d.a.d.b<k.i.h.b.d.w0.c.i<r>> f1602i;

    /* renamed from: j, reason: collision with root package name */
    public k.i.d.a.d.b<Integer> f1603j;

    /* renamed from: k, reason: collision with root package name */
    public final n.d f1604k;

    /* renamed from: l, reason: collision with root package name */
    public k.i.h.b.q.i.m f1605l;

    /* renamed from: m, reason: collision with root package name */
    public final n.d f1606m;

    /* renamed from: n, reason: collision with root package name */
    public final n.d f1607n;

    /* renamed from: o, reason: collision with root package name */
    public final n.d f1608o;

    /* renamed from: p, reason: collision with root package name */
    public f2 f1609p;

    /* renamed from: q, reason: collision with root package name */
    public final k.i.d.a.d.c f1610q;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends o implements n.d0.c.a<k.i.h.b.q.f.a> {
        public final /* synthetic */ LauncherActivity a;

        public a(LauncherActivity launcherActivity) {
        }

        public final k.i.h.b.q.f.a b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.q.f.a invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.launcher.ui.LauncherActivity$initData$1$1", f = "LauncherActivity.kt", l = {268}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends n.a0.k.a.l implements p<t0, n.a0.d<? super u>, Object> {
        public int a;
        public final /* synthetic */ LauncherActivity b;
        public final /* synthetic */ k.i.h.b.q.h.c.a c;

        public b(LauncherActivity launcherActivity, k.i.h.b.q.h.c.a aVar, n.a0.d<? super b> dVar) {
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
    public static final class c extends o implements n.d0.c.a<u> {
        public final /* synthetic */ LauncherActivity a;

        public c(LauncherActivity launcherActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d implements k.i.d.a.d.b<k.i.h.b.d.w0.c.i<r>> {
        public final /* synthetic */ LauncherActivity a;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.launcher.ui.LauncherActivity$initObserver$1$onReceive$2", f = "LauncherActivity.kt", l = {156}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.l implements p<t0, n.a0.d<? super u>, Object> {
            public Object a;
            public int b;
            public final /* synthetic */ r c;
            public final /* synthetic */ LauncherActivity d;

            public a(r rVar, LauncherActivity launcherActivity, n.a0.d<? super a> dVar) {
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

        public d(LauncherActivity launcherActivity) {
        }

        public static /* synthetic */ void b(LauncherActivity launcherActivity, DialogInterface dialogInterface, int i2) {
        }

        public static final void d(LauncherActivity launcherActivity, DialogInterface dialogInterface, int i2) {
        }

        @Override // k.i.d.a.d.b
        public /* bridge */ /* synthetic */ void a(k.i.h.b.d.w0.c.i<r> iVar) {
        }

        public void c(k.i.h.b.d.w0.c.i<r> iVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e implements k.i.d.a.d.b<Integer> {
        public final /* synthetic */ LauncherActivity a;

        public e(LauncherActivity launcherActivity) {
        }

        @Override // k.i.d.a.d.b
        public /* bridge */ /* synthetic */ void a(Integer num) {
        }

        public void b(Integer num) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends ClickableSpan {
        public final /* synthetic */ LauncherActivity a;

        public f(LauncherActivity launcherActivity) {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g extends ClickableSpan {
        public final /* synthetic */ LauncherActivity a;

        public g(LauncherActivity launcherActivity) {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h extends o implements n.d0.c.a<ValueAnimator.AnimatorUpdateListener> {
        public final /* synthetic */ LauncherActivity a;

        public h(LauncherActivity launcherActivity) {
        }

        public static final void c(LauncherActivity launcherActivity, ValueAnimator valueAnimator) {
        }

        public static /* synthetic */ void d(LauncherActivity launcherActivity, ValueAnimator valueAnimator) {
        }

        public final ValueAnimator.AnimatorUpdateListener b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ ValueAnimator.AnimatorUpdateListener invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i extends o implements n.d0.c.a<ValueAnimator> {
        public final /* synthetic */ LauncherActivity a;

        public i(LauncherActivity launcherActivity) {
        }

        public final ValueAnimator b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ ValueAnimator invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j extends ClickableSpan {
        public final /* synthetic */ LauncherActivity a;

        public j(LauncherActivity launcherActivity) {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class k extends ClickableSpan {
        public final /* synthetic */ LauncherActivity a;

        public k(LauncherActivity launcherActivity) {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.launcher.ui.LauncherActivity$showHint$1", f = "LauncherActivity.kt", l = {406}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class l extends n.a0.k.a.l implements p<t0, n.a0.d<? super u>, Object> {
        public int a;
        public final /* synthetic */ LauncherActivity b;

        public l(LauncherActivity launcherActivity, n.a0.d<? super l> dVar) {
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
    public static final class m extends t {
        public final /* synthetic */ LauncherActivity a;

        public m(LauncherActivity launcherActivity) {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.j
        public void d(MotionLayout motionLayout, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class n extends o implements n.d0.c.a<Vibrator> {
        public final /* synthetic */ LauncherActivity a;

        public n(LauncherActivity launcherActivity) {
        }

        public final Vibrator b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Vibrator invoke() {
        }
    }

    public static final /* synthetic */ void G1(LauncherActivity launcherActivity) {
    }

    public static final /* synthetic */ k.i.h.b.q.f.a H1(LauncherActivity launcherActivity) {
    }

    public static final /* synthetic */ k.i.h.b.d.b1.d.k I1(LauncherActivity launcherActivity) {
    }

    public static final /* synthetic */ ValueAnimator.AnimatorUpdateListener J1(LauncherActivity launcherActivity) {
    }

    public static final /* synthetic */ void K1(LauncherActivity launcherActivity, r rVar) {
    }

    public static final /* synthetic */ void L1(LauncherActivity launcherActivity, k.i.h.b.q.h.c.a aVar) {
    }

    public static final /* synthetic */ void M1(LauncherActivity launcherActivity) {
    }

    public static final /* synthetic */ void N1(LauncherActivity launcherActivity, String str, String str2) {
    }

    public static final /* synthetic */ void O1(LauncherActivity launcherActivity) {
    }

    public static final /* synthetic */ void P1(LauncherActivity launcherActivity) {
    }

    public static final /* synthetic */ void Q1(LauncherActivity launcherActivity) {
    }

    public static final void a2(DialogInterface dialogInterface) {
    }

    public static /* synthetic */ void e2(LauncherActivity launcherActivity, String str, String str2, int i2, Object obj) {
    }

    public static final void g2(LauncherActivity launcherActivity, k.i.h.b.q.h.c.a aVar) {
    }

    public static /* synthetic */ void j2(DialogInterface dialogInterface) {
    }

    public static /* synthetic */ void k2(LauncherActivity launcherActivity) {
    }

    public static /* synthetic */ void l2(n.d0.c.a aVar, DialogInterface dialogInterface, int i2) {
    }

    public static /* synthetic */ void m2(LauncherActivity launcherActivity, k.i.h.b.q.h.c.a aVar) {
    }

    public static /* synthetic */ void n2(LauncherActivity launcherActivity, Boolean bool) {
    }

    public static /* synthetic */ void o2(LauncherActivity launcherActivity, View view) {
    }

    public static /* synthetic */ void p2(LauncherActivity launcherActivity, DialogInterface dialogInterface, int i2) {
    }

    public static final void q2(LauncherActivity launcherActivity) {
    }

    public static final void r2(LauncherActivity launcherActivity, View view) {
    }

    public static final void v2(n.d0.c.a aVar, DialogInterface dialogInterface, int i2) {
    }

    public static final void w2(LauncherActivity launcherActivity, DialogInterface dialogInterface, int i2) {
    }

    public static final void y2(LauncherActivity launcherActivity, Boolean bool) {
    }

    public final void A2() {
    }

    public final void B2() {
    }

    public final void R1() {
    }

    public final k.i.h.b.q.f.a S1() {
    }

    public final ValueAnimator.AnimatorUpdateListener T1() {
    }

    public final ValueAnimator U1() {
    }

    public final Vibrator V1() {
    }

    public final void W1(r rVar) {
    }

    @Override // k.i.h.b.d.b1.a
    public j.z.a X0() {
    }

    public final void X1(int i2) {
    }

    public final void Y1() {
    }

    public final void Z1(IWXAPI iwxapi) {
    }

    @Override // k.i.h.b.d.b1.b, k.i.h.b.d.b1.a
    public void b1() {
    }

    public final void b2(k.i.h.b.q.h.c.a aVar) {
    }

    public final void c2() {
    }

    @Override // k.i.h.b.d.b1.b, k.i.d.a.d.g
    public k.i.d.a.d.e d0() {
    }

    public final void d2(String str, String str2) {
    }

    public final void f2() {
    }

    public final void h2() {
    }

    public final void i2() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // k.i.h.b.d.b1.b, k.i.h.b.d.b1.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, j.g.j.h, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // k.i.h.b.d.b1.b, j.b.k.d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
    }

    @Override // k.i.h.b.d.b1.b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    public final IWXAPI s2() {
    }

    public final void t2() {
    }

    public final void u2(n.d0.c.a<u> aVar) {
    }

    public final void x2() {
    }

    public final void z2() {
    }
}
