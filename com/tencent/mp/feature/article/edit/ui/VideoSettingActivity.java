package com.tencent.mp.feature.article.edit.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.tencent.xweb.util.WXWebReporter;
import k.i.h.b.b.b.s.p3.y0;
import o.a.f2;
import o.a.t0;
import q.eb;
import q.pc;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class VideoSettingActivity extends k.i.h.b.d.b1.b {
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final n.d f1247i;

    /* renamed from: j, reason: collision with root package name */
    public final k.i.h.b.b.a.o.i f1248j;

    /* renamed from: k, reason: collision with root package name */
    public final n.d f1249k;

    /* renamed from: l, reason: collision with root package name */
    public final n.d f1250l;

    /* renamed from: m, reason: collision with root package name */
    public k.i.h.b.b.a.q.i.h f1251m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1252n;

    /* renamed from: o, reason: collision with root package name */
    public k.i.h.b.b.b.k.a f1253o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1254p;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends n.d0.d.o implements n.d0.c.a<k.i.h.b.b.b.m.q> {
        public final /* synthetic */ VideoSettingActivity a;

        public a(VideoSettingActivity videoSettingActivity) {
        }

        public final k.i.h.b.b.b.m.q b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.b.b.m.q invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.VideoSettingActivity$publishVideo$1", f = "VideoSettingActivity.kt", l = {1064, 1090}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ VideoSettingActivity c;

        public a0(VideoSettingActivity videoSettingActivity, n.a0.d<? super a0> dVar) {
        }

        public static final void g(VideoSettingActivity videoSettingActivity, DialogInterface dialogInterface, int i2) {
        }

        public static /* synthetic */ void h(VideoSettingActivity videoSettingActivity, DialogInterface dialogInterface, int i2) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.VideoSettingActivity", f = "VideoSettingActivity.kt", l = {1038}, m = "checkPublish")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends n.a0.k.a.d {
        public Object a;
        public /* synthetic */ Object b;
        public final /* synthetic */ VideoSettingActivity c;
        public int d;

        public b(VideoSettingActivity videoSettingActivity, n.a0.d<? super b> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.VideoSettingActivity$publishVideoAfterCheck$1", f = "VideoSettingActivity.kt", l = {1114, 1118}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ VideoSettingActivity b;

        public b0(VideoSettingActivity videoSettingActivity, n.a0.d<? super b0> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.VideoSettingActivity$checkVideoValid$1", f = "VideoSettingActivity.kt", l = {321}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ VideoSettingActivity c;

        public c(VideoSettingActivity videoSettingActivity, n.a0.d<? super c> dVar) {
        }

        public static final void g(VideoSettingActivity videoSettingActivity, DialogInterface dialogInterface, int i2) {
        }

        public static /* synthetic */ void h(VideoSettingActivity videoSettingActivity, DialogInterface dialogInterface, int i2) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.VideoSettingActivity$showFailedDialog$1", f = "VideoSettingActivity.kt", l = {838}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ VideoSettingActivity b;
        public final /* synthetic */ String c;

        public c0(VideoSettingActivity videoSettingActivity, String str, n.a0.d<? super c0> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ VideoSettingActivity a;

        public d(VideoSettingActivity videoSettingActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.VideoSettingActivity", f = "VideoSettingActivity.kt", l = {989, 992}, m = "showToFinderDialog")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d0 extends n.a0.k.a.d {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ VideoSettingActivity d;
        public int e;

        public d0(VideoSettingActivity videoSettingActivity, n.a0.d<? super d0> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ VideoSettingActivity a;

        public e(VideoSettingActivity videoSettingActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e0 extends n.d0.d.o implements n.d0.c.l<Boolean, n.u> {
        public final /* synthetic */ VideoSettingActivity a;
        public final /* synthetic */ int b;
        public final /* synthetic */ n.a0.d<Boolean> c;

        public e0(VideoSettingActivity videoSettingActivity, int i2, n.a0.d<? super Boolean> dVar) {
        }

        public final void b(boolean z) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(Boolean bool) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ VideoSettingActivity a;

        public f(VideoSettingActivity videoSettingActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f0 extends n.d0.d.o implements n.d0.c.l<Boolean, n.u> {
        public final /* synthetic */ VideoSettingActivity a;
        public final /* synthetic */ int b;
        public final /* synthetic */ n.a0.d<Boolean> c;

        public f0(VideoSettingActivity videoSettingActivity, int i2, n.a0.d<? super Boolean> dVar) {
        }

        public final void b(boolean z) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(Boolean bool) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g extends n.d0.d.o implements n.d0.c.p<Integer, Integer, n.u> {
        public final /* synthetic */ k.i.h.b.b.a.q.i.h a;

        public g(k.i.h.b.b.a.q.i.h hVar) {
        }

        public final void b(int i2, int i3) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ n.u invoke(Integer num, Integer num2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g0 extends n.d0.d.o implements n.d0.c.l<String, n.u> {
        public final /* synthetic */ VideoSettingActivity a;

        public g0(VideoSettingActivity videoSettingActivity) {
        }

        public final void b(String str) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h extends n.d0.d.o implements n.d0.c.l<Boolean, n.u> {
        public final /* synthetic */ k.i.h.b.b.a.q.i.h a;

        public h(k.i.h.b.b.a.q.i.h hVar) {
        }

        public final void b(boolean z) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(Boolean bool) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h0 extends n.d0.d.o implements n.d0.c.a<ViewModelStore> {
        public final /* synthetic */ k.i.h.b.d.b1.b a;

        public h0(k.i.h.b.d.b1.b bVar) {
        }

        public final ViewModelStore b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ ViewModelStore invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i extends n.d0.d.o implements n.d0.c.l<Integer, n.u> {
        public final /* synthetic */ View a;
        public final /* synthetic */ k.i.h.b.b.a.q.i.h b;
        public final /* synthetic */ VideoSettingActivity c;

        public i(View view, k.i.h.b.b.a.q.i.h hVar, VideoSettingActivity videoSettingActivity) {
        }

        public final void b(int i2) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(Integer num) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i0 extends n.d0.d.o implements n.d0.c.a<k.i.h.b.d.d1.c> {
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
        public static final class b extends n.d0.d.o implements n.d0.c.l<ViewModel, n.u> {
            public final /* synthetic */ k.i.h.b.d.b1.b a;

            public b(k.i.h.b.d.b1.b bVar) {
            }

            public final void b(ViewModel viewModel) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ n.u invoke(ViewModel viewModel) {
            }
        }

        public i0(n.d0.c.a aVar, k.i.h.b.d.b1.b bVar) {
        }

        public final k.i.h.b.d.d1.c b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.d.d1.c invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.VideoSettingActivity$initData$1", f = "VideoSettingActivity.kt", l = {309}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ VideoSettingActivity b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ k.i.h.b.b.a.q.i.h d;

        public j(VideoSettingActivity videoSettingActivity, boolean z, k.i.h.b.b.a.q.i.h hVar, n.a0.d<? super j> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j0 extends n.d0.d.o implements n.d0.c.l<k.i.h.b.b.b.s.n3.j, n.u> {
        public final /* synthetic */ k.i.h.b.d.b1.b a;

        public j0(k.i.h.b.d.b1.b bVar) {
        }

        public final void b(k.i.h.b.b.b.s.n3.j jVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.b.b.s.n3.j jVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class k implements TextWatcher {
        public final /* synthetic */ VideoSettingActivity a;

        public k(VideoSettingActivity videoSettingActivity) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.VideoSettingActivity", f = "VideoSettingActivity.kt", l = {1128, 1141}, m = "startMassSend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class k0 extends n.a0.k.a.d {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public final /* synthetic */ VideoSettingActivity e;
        public int f;

        public k0(VideoSettingActivity videoSettingActivity, n.a0.d<? super k0> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class l implements View.OnFocusChangeListener {
        public boolean a;

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class l0 implements o.a.s3.f<eb> {
        public final /* synthetic */ VideoSettingActivity a;
        public final /* synthetic */ n.d0.d.b0 b;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.VideoSettingActivity$startMassSendByViewModel$$inlined$collect$1", f = "VideoSettingActivity.kt", l = {137}, m = "emit")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.d {
            public /* synthetic */ Object a;
            public int b;
            public final /* synthetic */ l0 c;
            public Object d;

            public a(l0 l0Var, n.a0.d dVar) {
            }

            @Override // n.a0.k.a.a
            public final Object invokeSuspend(Object obj) {
            }
        }

        public l0(VideoSettingActivity videoSettingActivity, n.d0.d.b0 b0Var) {
        }

        @Override // o.a.s3.f
        public Object emit(eb ebVar, n.a0.d<? super n.u> dVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class m extends n.d0.d.o implements n.d0.c.l<k.i.h.b.b.b.l.e, n.u> {
        public final /* synthetic */ k.i.h.b.b.a.q.i.h a;

        public m(k.i.h.b.b.a.q.i.h hVar) {
        }

        public final void b(k.i.h.b.b.b.l.e eVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.b.b.l.e eVar) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.VideoSettingActivity$startMassSendByViewModel$2", f = "VideoSettingActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class m0 extends n.a0.k.a.l implements n.d0.c.p<o.a.s3.f<? super eb>, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ n.d0.d.b0<k.i.h.b.d.b1.d.k> b;
        public final /* synthetic */ VideoSettingActivity c;

        public m0(n.d0.d.b0<k.i.h.b.d.b1.d.k> b0Var, VideoSettingActivity videoSettingActivity, n.a0.d<? super m0> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.s3.f<? super eb> fVar, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.s3.f<? super eb> fVar, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class n extends n.d0.d.o implements n.d0.c.l<k.i.h.b.b.b.l.i, n.u> {
        public final /* synthetic */ k.i.h.b.b.a.q.i.h a;

        public n(k.i.h.b.b.a.q.i.h hVar) {
        }

        public final void b(k.i.h.b.b.b.l.i iVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.b.b.l.i iVar) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.VideoSettingActivity$startMassSendByViewModel$3", f = "VideoSettingActivity.kt", l = {1162}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class n0 extends n.a0.k.a.l implements n.d0.c.q<o.a.s3.f<? super eb>, Throwable, n.a0.d<? super n.u>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ k.i.h.b.b.a.q.i.h c;
        public final /* synthetic */ VideoSettingActivity d;
        public final /* synthetic */ n.d0.d.b0<k.i.h.b.d.b1.d.k> e;

        public n0(k.i.h.b.b.a.q.i.h hVar, VideoSettingActivity videoSettingActivity, n.d0.d.b0<k.i.h.b.d.b1.d.k> b0Var, n.a0.d<? super n0> dVar) {
        }

        @Override // n.d0.c.q
        public /* bridge */ /* synthetic */ Object a(o.a.s3.f<? super eb> fVar, Throwable th, n.a0.d<? super n.u> dVar) {
        }

        public final Object g(o.a.s3.f<? super eb> fVar, Throwable th, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class o extends n.d0.d.l implements n.d0.c.l<n.a0.d<? super String>, Object> {
        public o(Object obj) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ Object invoke(n.a0.d<? super String> dVar) {
        }

        public final Object m(n.a0.d<? super String> dVar) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.VideoSettingActivity$startPreviewByViewModel$1", f = "VideoSettingActivity.kt", l = {1208}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class o0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ VideoSettingActivity b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.VideoSettingActivity$startPreviewByViewModel$1$1", f = "VideoSettingActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.l implements n.d0.c.p<o.a.s3.f<? super pc>, n.a0.d<? super n.u>, Object> {
            public int a;
            public final /* synthetic */ n.d0.d.b0<k.i.h.b.d.b1.d.k> b;
            public final /* synthetic */ VideoSettingActivity c;

            public a(n.d0.d.b0<k.i.h.b.d.b1.d.k> b0Var, VideoSettingActivity videoSettingActivity, n.a0.d<? super a> dVar) {
            }

            @Override // n.a0.k.a.a
            public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
            }

            @Override // n.d0.c.p
            public /* bridge */ /* synthetic */ Object invoke(o.a.s3.f<? super pc> fVar, n.a0.d<? super n.u> dVar) {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(o.a.s3.f<? super pc> fVar, n.a0.d<? super n.u> dVar) {
            }

            @Override // n.a0.k.a.a
            public final Object invokeSuspend(Object obj) {
            }
        }

        @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.VideoSettingActivity$startPreviewByViewModel$1$2", f = "VideoSettingActivity.kt", l = {1199}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class b extends n.a0.k.a.l implements n.d0.c.q<o.a.s3.f<? super pc>, Throwable, n.a0.d<? super n.u>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ VideoSettingActivity c;
            public final /* synthetic */ n.d0.d.b0<k.i.h.b.d.b1.d.k> d;

            public b(VideoSettingActivity videoSettingActivity, n.d0.d.b0<k.i.h.b.d.b1.d.k> b0Var, n.a0.d<? super b> dVar) {
            }

            @Override // n.d0.c.q
            public /* bridge */ /* synthetic */ Object a(o.a.s3.f<? super pc> fVar, Throwable th, n.a0.d<? super n.u> dVar) {
            }

            public final Object g(o.a.s3.f<? super pc> fVar, Throwable th, n.a0.d<? super n.u> dVar) {
            }

            @Override // n.a0.k.a.a
            public final Object invokeSuspend(Object obj) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class c implements o.a.s3.f<pc> {
            public final /* synthetic */ n.d0.d.b0 a;
            public final /* synthetic */ VideoSettingActivity b;

            @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.VideoSettingActivity$startPreviewByViewModel$1$invokeSuspend$$inlined$collect$1", f = "VideoSettingActivity.kt", l = {WXWebReporter.ID903KeyDef.HYBRID_INSTALL_ZIP_FAILED}, m = "emit")
            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
            public static final class a extends n.a0.k.a.d {
                public /* synthetic */ Object a;
                public int b;
                public final /* synthetic */ c c;
                public Object d;

                public a(c cVar, n.a0.d dVar) {
                }

                @Override // n.a0.k.a.a
                public final Object invokeSuspend(Object obj) {
                }
            }

            public c(n.d0.d.b0 b0Var, VideoSettingActivity videoSettingActivity) {
            }

            @Override // o.a.s3.f
            public Object emit(pc pcVar, n.a0.d<? super n.u> dVar) {
            }
        }

        public o0(VideoSettingActivity videoSettingActivity, String str, String str2, n.a0.d<? super o0> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class p implements TextWatcher {
        public final /* synthetic */ VideoSettingActivity a;

        public p(VideoSettingActivity videoSettingActivity) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.VideoSettingActivity", f = "VideoSettingActivity.kt", l = {225, WXWebReporter.KEY_SET_DATA_SUFFIX_INVOKE_METHOD_FAILED}, m = "updatePublishState")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class p0 extends n.a0.k.a.d {
        public Object a;
        public /* synthetic */ Object b;
        public final /* synthetic */ VideoSettingActivity c;
        public int d;

        public p0(VideoSettingActivity videoSettingActivity, n.a0.d<? super p0> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class q implements View.OnFocusChangeListener {
        public boolean a;

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class q0 extends n.d0.d.o implements n.d0.c.l<String, CharSequence> {
        public static final q0 a = null;

        public final CharSequence b(String str) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ CharSequence invoke(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class r extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ VideoSettingActivity a;

        public r(VideoSettingActivity videoSettingActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class s extends n.d0.d.o implements n.d0.c.a<k.i.h.b.b.b.p.w> {
        public final /* synthetic */ VideoSettingActivity a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.d0.d.o implements n.d0.c.a<n.u> {
            public final /* synthetic */ VideoSettingActivity a;

            public a(VideoSettingActivity videoSettingActivity) {
            }

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ n.u invoke() {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public s(VideoSettingActivity videoSettingActivity) {
        }

        public final k.i.h.b.b.b.p.w b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.b.b.p.w invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.VideoSettingActivity$observePublishState$1", f = "VideoSettingActivity.kt", l = {173}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class t extends n.a0.k.a.l implements n.d0.c.p<k.i.h.b.b.b.k.a, n.a0.d<? super n.u>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ VideoSettingActivity c;

        public t(VideoSettingActivity videoSettingActivity, n.a0.d<? super t> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        public final Object g(k.i.h.b.b.b.k.a aVar, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(k.i.h.b.b.b.k.a aVar, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.VideoSettingActivity$onClickPreview$1", f = "VideoSettingActivity.kt", l = {890, 908}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class u extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ VideoSettingActivity c;

        public u(VideoSettingActivity videoSettingActivity, n.a0.d<? super u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.VideoSettingActivity$onClickPublish$1", f = "VideoSettingActivity.kt", l = {961}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class v extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ VideoSettingActivity b;

        public v(VideoSettingActivity videoSettingActivity, n.a0.d<? super v> dVar) {
        }

        public static final void g(VideoSettingActivity videoSettingActivity, DialogInterface dialogInterface, int i2) {
        }

        public static /* synthetic */ void h(VideoSettingActivity videoSettingActivity, DialogInterface dialogInterface, int i2) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.VideoSettingActivity$onClickRegularPublish$1", f = "VideoSettingActivity.kt", l = {974, 976, 981, 984}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class w extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ VideoSettingActivity b;

        public w(VideoSettingActivity videoSettingActivity, n.a0.d<? super w> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.VideoSettingActivity", f = "VideoSettingActivity.kt", l = {575}, m = "onCopyrightOpenCheck")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class x extends n.a0.k.a.d {
        public Object a;
        public /* synthetic */ Object b;
        public final /* synthetic */ VideoSettingActivity c;
        public int d;

        public x(VideoSettingActivity videoSettingActivity, n.a0.d<? super x> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class y extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ n.a0.d<Boolean> a;

        public y(n.a0.d<? super Boolean> dVar) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class z extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ n.a0.d<Boolean> a;

        public z(n.a0.d<? super Boolean> dVar) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public static final boolean A2(VideoSettingActivity videoSettingActivity, View view, MotionEvent motionEvent) {
    }

    public static /* synthetic */ void D2(VideoSettingActivity videoSettingActivity, k.i.h.b.d.b1.d.d dVar) {
    }

    public static /* synthetic */ void E2(VideoSettingActivity videoSettingActivity, k.i.h.b.b.a.q.i.h hVar, View view) {
    }

    public static /* synthetic */ boolean F2(VideoSettingActivity videoSettingActivity, View view, MotionEvent motionEvent) {
    }

    public static final /* synthetic */ Object G1(VideoSettingActivity videoSettingActivity, n.a0.d dVar) {
    }

    public static /* synthetic */ void G2(n.d0.c.a aVar, DialogInterface dialogInterface, int i2) {
    }

    public static final /* synthetic */ void H1(VideoSettingActivity videoSettingActivity) {
    }

    public static /* synthetic */ void H2(y0 y0Var, VideoSettingActivity videoSettingActivity, n.d0.c.a aVar, k.i.h.b.d.w0.d.b bVar) {
    }

    public static final /* synthetic */ k.i.h.b.b.b.m.q I1(VideoSettingActivity videoSettingActivity) {
    }

    public static /* synthetic */ boolean I2(VideoSettingActivity videoSettingActivity, View view, MotionEvent motionEvent) {
    }

    public static final /* synthetic */ k.i.h.b.b.b.p.w J1(VideoSettingActivity videoSettingActivity) {
    }

    public static /* synthetic */ void J2(VideoSettingActivity videoSettingActivity, k.i.h.b.b.a.q.i.h hVar, boolean z2) {
    }

    public static final /* synthetic */ k.i.h.b.b.a.q.i.h K1(VideoSettingActivity videoSettingActivity) {
    }

    public static /* synthetic */ void K2(VideoSettingActivity videoSettingActivity, k.i.h.b.b.a.q.i.h hVar, View view) {
    }

    public static final /* synthetic */ k.i.h.b.b.b.s.n3.j L1(VideoSettingActivity videoSettingActivity) {
    }

    public static /* synthetic */ void L2(DialogInterface dialogInterface, int i2) {
    }

    public static final /* synthetic */ f2 M1(VideoSettingActivity videoSettingActivity) {
    }

    public static /* synthetic */ void M2(k.i.h.b.d.b1.d.d dVar) {
    }

    public static final /* synthetic */ f2 N1(VideoSettingActivity videoSettingActivity) {
    }

    public static /* synthetic */ void N2(VideoSettingActivity videoSettingActivity, MenuItem menuItem, int i2) {
    }

    public static final /* synthetic */ f2 O1(VideoSettingActivity videoSettingActivity) {
    }

    public static /* synthetic */ void O2(VideoSettingActivity videoSettingActivity, MenuItem menuItem, int i2) {
    }

    public static final /* synthetic */ Object P1(VideoSettingActivity videoSettingActivity, n.a0.d dVar) {
    }

    public static /* synthetic */ void P2(n.d0.c.a aVar, DialogInterface dialogInterface, int i2) {
    }

    public static final /* synthetic */ void Q1(VideoSettingActivity videoSettingActivity) {
    }

    public static final /* synthetic */ f2 R1(VideoSettingActivity videoSettingActivity) {
    }

    public static final /* synthetic */ f2 S1(VideoSettingActivity videoSettingActivity) {
    }

    public static final /* synthetic */ void T1(VideoSettingActivity videoSettingActivity, boolean z2) {
    }

    public static final /* synthetic */ f2 U1(VideoSettingActivity videoSettingActivity, String str) {
    }

    public static final /* synthetic */ void V1(VideoSettingActivity videoSettingActivity) {
    }

    public static final /* synthetic */ void W1(VideoSettingActivity videoSettingActivity) {
    }

    public static final /* synthetic */ Object X1(VideoSettingActivity videoSettingActivity, n.a0.d dVar) {
    }

    public static final /* synthetic */ Object Y1(VideoSettingActivity videoSettingActivity, n.a0.d dVar) {
    }

    public static final /* synthetic */ void Z1(VideoSettingActivity videoSettingActivity) {
    }

    public static final /* synthetic */ Object a2(VideoSettingActivity videoSettingActivity, k.i.h.b.b.b.k.a aVar, n.a0.d dVar) {
    }

    public static final /* synthetic */ void b2(VideoSettingActivity videoSettingActivity) {
    }

    public static final void c3(k.i.h.b.d.b1.d.d dVar) {
    }

    public static final void d2(DialogInterface dialogInterface, int i2) {
    }

    public static final void d3(VideoSettingActivity videoSettingActivity, MenuItem menuItem, int i2) {
    }

    public static final void h3(VideoSettingActivity videoSettingActivity, k.i.h.b.d.b1.d.d dVar) {
    }

    public static final void i3(VideoSettingActivity videoSettingActivity, MenuItem menuItem, int i2) {
    }

    public static final void l3(n.d0.c.a aVar, DialogInterface dialogInterface, int i2) {
    }

    public static final void m3(n.d0.c.a aVar, DialogInterface dialogInterface, int i2) {
    }

    public static final void n3(y0 y0Var, VideoSettingActivity videoSettingActivity, n.d0.c.a aVar, k.i.h.b.d.w0.d.b bVar) {
    }

    public static final void p2(VideoSettingActivity videoSettingActivity, k.i.h.b.b.a.q.i.h hVar, View view) {
    }

    public static final boolean w2(VideoSettingActivity videoSettingActivity, View view, MotionEvent motionEvent) {
    }

    public static final void x2(VideoSettingActivity videoSettingActivity, k.i.h.b.b.a.q.i.h hVar, boolean z2) {
    }

    public static final void y2(VideoSettingActivity videoSettingActivity, k.i.h.b.b.a.q.i.h hVar, View view) {
    }

    public final void A3() {
    }

    public final void B2() {
    }

    public final void B3() {
    }

    public final boolean C2() {
    }

    public final void C3() {
    }

    public final void Q2() {
    }

    public final f2 R2() {
    }

    public final f2 S2() {
    }

    public final f2 T2() {
    }

    public final Object U2(n.a0.d<? super String> dVar) {
    }

    public final void V2() {
    }

    public final f2 W2() {
    }

    @Override // k.i.h.b.d.b1.a
    public /* bridge */ /* synthetic */ j.z.a X0() {
    }

    public final f2 X2() {
    }

    public final void Y2(boolean z2) {
    }

    public final void Z2(int i2) {
    }

    public final void a3() {
    }

    public final void b3(Activity activity) {
    }

    public final Object c2(n.a0.d<? super Boolean> dVar) {
    }

    public final void e2() {
    }

    public final f2 e3(String str) {
    }

    public final k.i.h.b.b.b.m.q f2() {
    }

    public final void f3() {
    }

    public k.i.h.b.b.b.m.q g2() {
    }

    public final void g3() {
    }

    public final k.i.h.b.b.b.p.w h2() {
    }

    public final k.i.h.b.b.b.s.n3.j i2() {
    }

    public final void j2() {
    }

    public final Object j3(n.a0.d<? super Boolean> dVar) {
    }

    public final boolean k2() {
    }

    public final void k3(n.d0.c.a<n.u> aVar, n.d0.c.a<n.u> aVar2) {
    }

    public final void l2() {
    }

    public final void m2() {
    }

    public final void n2(k.i.h.b.b.a.q.i.h hVar) {
    }

    public final void o2(k.i.h.b.b.a.q.i.h hVar) {
    }

    public final Object o3(n.a0.d<? super n.u> dVar) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // k.i.h.b.d.b1.b, k.i.h.b.d.b1.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, j.g.j.h, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // k.i.h.b.d.b1.b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    public final Object p3(k.i.h.b.b.a.q.i.h hVar, n.a0.d<? super n.u> dVar) {
    }

    public final f2 q2(boolean z2, k.i.h.b.b.a.q.i.h hVar) {
    }

    public final void q3(String str, String str2) {
    }

    public final void r2(k.i.h.b.b.a.q.i.h hVar) {
    }

    public final f2 r3(String str, String str2) {
    }

    public final void s2() {
    }

    public final void s3() {
    }

    public final void t2(k.i.h.b.b.a.q.i.h hVar) {
    }

    public final void t3() {
    }

    public final void u2(k.i.h.b.b.a.q.i.h hVar) {
    }

    public final void u3() {
    }

    public final void v2(k.i.h.b.b.a.q.i.h hVar) {
    }

    public final void v3() {
    }

    public final void w3() {
    }

    public final void x3() {
    }

    public final void y3() {
    }

    public final void z2(k.i.h.b.b.a.q.i.h hVar) {
    }

    public final Object z3(k.i.h.b.b.b.k.a aVar, n.a0.d<? super n.u> dVar) {
    }
}
