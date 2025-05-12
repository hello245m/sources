package com.tencent.mp.feature.register.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.tencent.xweb.util.WXWebReporter;
import o.a.f2;
import o.a.t0;
import q.b0;
import q.x;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class RegisterBindPhoneActivity extends k.i.h.b.d.b1.b implements View.OnClickListener {
    public final n.d h;

    /* renamed from: i, reason: collision with root package name */
    public final n.d f1724i;

    /* renamed from: j, reason: collision with root package name */
    public final n.d f1725j;

    /* renamed from: k, reason: collision with root package name */
    public final n.d f1726k;

    /* renamed from: l, reason: collision with root package name */
    public final n.d f1727l;

    /* renamed from: m, reason: collision with root package name */
    public final n.d f1728m;

    /* renamed from: n, reason: collision with root package name */
    public Dialog f1729n;

    @n.a0.k.a.f(c = "com.tencent.mp.feature.register.ui.RegisterBindPhoneActivity$auth$1", f = "RegisterBindPhoneActivity.kt", l = {390}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ RegisterBindPhoneActivity c;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.register.ui.RegisterBindPhoneActivity$auth$1$1", f = "RegisterBindPhoneActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.tencent.mp.feature.register.ui.RegisterBindPhoneActivity$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class C0061a extends n.a0.k.a.l implements n.d0.c.q<o.a.s3.f<? super k.i.h.b.d.w0.c.i<q.f>>, Throwable, n.a0.d<? super n.u>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ RegisterBindPhoneActivity c;

            public C0061a(RegisterBindPhoneActivity registerBindPhoneActivity, n.a0.d<? super C0061a> dVar) {
            }

            @Override // n.d0.c.q
            public /* bridge */ /* synthetic */ Object a(o.a.s3.f<? super k.i.h.b.d.w0.c.i<q.f>> fVar, Throwable th, n.a0.d<? super n.u> dVar) {
            }

            public final Object g(o.a.s3.f<? super k.i.h.b.d.w0.c.i<q.f>> fVar, Throwable th, n.a0.d<? super n.u> dVar) {
            }

            @Override // n.a0.k.a.a
            public final Object invokeSuspend(Object obj) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class b implements o.a.s3.f<k.i.h.b.d.w0.c.i<q.f>> {
            public final /* synthetic */ RegisterBindPhoneActivity a;
            public final /* synthetic */ int b;

            public b(RegisterBindPhoneActivity registerBindPhoneActivity, int i2) {
            }

            @Override // o.a.s3.f
            public Object emit(k.i.h.b.d.w0.c.i<q.f> iVar, n.a0.d<? super n.u> dVar) {
            }
        }

        public a(int i2, RegisterBindPhoneActivity registerBindPhoneActivity, n.a0.d<? super a> dVar) {
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
    public static final class b extends n.d0.d.o implements n.d0.c.a<k.i.h.b.b0.h.b> {
        public final /* synthetic */ RegisterBindPhoneActivity a;

        public b(RegisterBindPhoneActivity registerBindPhoneActivity) {
        }

        public final k.i.h.b.b0.h.b b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.b0.h.b invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends n.d0.d.o implements n.d0.c.l<Dialog, n.u> {
        public final /* synthetic */ RegisterBindPhoneActivity a;

        public c(RegisterBindPhoneActivity registerBindPhoneActivity) {
        }

        public final void b(Dialog dialog) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(Dialog dialog) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.register.ui.RegisterBindPhoneActivity$doRegister$1", f = "RegisterBindPhoneActivity.kt", l = {390}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ RegisterBindPhoneActivity b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.register.ui.RegisterBindPhoneActivity$doRegister$1$1", f = "RegisterBindPhoneActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.l implements n.d0.c.q<o.a.s3.f<? super x>, Throwable, n.a0.d<? super n.u>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ RegisterBindPhoneActivity c;

            public a(RegisterBindPhoneActivity registerBindPhoneActivity, n.a0.d<? super a> dVar) {
            }

            @Override // n.d0.c.q
            public /* bridge */ /* synthetic */ Object a(o.a.s3.f<? super x> fVar, Throwable th, n.a0.d<? super n.u> dVar) {
            }

            public final Object g(o.a.s3.f<? super x> fVar, Throwable th, n.a0.d<? super n.u> dVar) {
            }

            @Override // n.a0.k.a.a
            public final Object invokeSuspend(Object obj) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class b implements o.a.s3.f<x> {
            public final /* synthetic */ RegisterBindPhoneActivity a;

            public b(RegisterBindPhoneActivity registerBindPhoneActivity) {
            }

            @Override // o.a.s3.f
            public Object emit(x xVar, n.a0.d<? super n.u> dVar) {
            }
        }

        public d(RegisterBindPhoneActivity registerBindPhoneActivity, String str, String str2, n.a0.d<? super d> dVar) {
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
    public static final class e extends n.d0.d.o implements n.d0.c.a<String> {
        public final /* synthetic */ RegisterBindPhoneActivity a;

        public e(RegisterBindPhoneActivity registerBindPhoneActivity) {
        }

        public final String b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ String invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f implements TextWatcher {
        public final /* synthetic */ RegisterBindPhoneActivity a;

        public f(RegisterBindPhoneActivity registerBindPhoneActivity) {
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
    public static final class g implements TextWatcher {
        public final /* synthetic */ RegisterBindPhoneActivity a;

        public g(RegisterBindPhoneActivity registerBindPhoneActivity) {
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
    public static final class h extends n.d0.d.o implements n.d0.c.a<String> {
        public final /* synthetic */ RegisterBindPhoneActivity a;

        public h(RegisterBindPhoneActivity registerBindPhoneActivity) {
        }

        public final String b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ String invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.register.ui.RegisterBindPhoneActivity$onClick$1", f = "RegisterBindPhoneActivity.kt", l = {WXWebReporter.ID903KeyDef.DANGERTIME_NOT_UPDATE}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ RegisterBindPhoneActivity b;

        public i(RegisterBindPhoneActivity registerBindPhoneActivity, n.a0.d<? super i> dVar) {
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
    public static final class j extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ RegisterBindPhoneActivity a;

        public j(RegisterBindPhoneActivity registerBindPhoneActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.register.ui.RegisterBindPhoneActivity$requestPhoneCode$1", f = "RegisterBindPhoneActivity.kt", l = {390}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class k extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ RegisterBindPhoneActivity b;
        public final /* synthetic */ String c;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.register.ui.RegisterBindPhoneActivity$requestPhoneCode$1$1", f = "RegisterBindPhoneActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.l implements n.d0.c.q<o.a.s3.f<? super b0>, Throwable, n.a0.d<? super n.u>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ RegisterBindPhoneActivity c;

            public a(RegisterBindPhoneActivity registerBindPhoneActivity, n.a0.d<? super a> dVar) {
            }

            @Override // n.d0.c.q
            public /* bridge */ /* synthetic */ Object a(o.a.s3.f<? super b0> fVar, Throwable th, n.a0.d<? super n.u> dVar) {
            }

            public final Object g(o.a.s3.f<? super b0> fVar, Throwable th, n.a0.d<? super n.u> dVar) {
            }

            @Override // n.a0.k.a.a
            public final Object invokeSuspend(Object obj) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class b implements o.a.s3.f<b0> {
            public final /* synthetic */ RegisterBindPhoneActivity a;

            public b(RegisterBindPhoneActivity registerBindPhoneActivity) {
            }

            @Override // o.a.s3.f
            public Object emit(b0 b0Var, n.a0.d<? super n.u> dVar) {
            }
        }

        public k(RegisterBindPhoneActivity registerBindPhoneActivity, String str, n.a0.d<? super k> dVar) {
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
    public static final class l extends n.d0.d.o implements n.d0.c.a<Integer> {
        public final /* synthetic */ RegisterBindPhoneActivity a;

        public l(RegisterBindPhoneActivity registerBindPhoneActivity) {
        }

        public final Integer b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Integer invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class m extends n.d0.d.o implements n.d0.c.l<Dialog, n.u> {
        public final /* synthetic */ RegisterBindPhoneActivity a;

        public m(RegisterBindPhoneActivity registerBindPhoneActivity) {
        }

        public final void b(Dialog dialog) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(Dialog dialog) {
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

        public o(n.d0.c.a aVar, k.i.h.b.d.b1.b bVar) {
        }

        public final k.i.h.b.d.d1.c b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.d.d1.c invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class p extends n.d0.d.o implements n.d0.c.l<k.i.h.b.b0.m.a, n.u> {
        public final /* synthetic */ k.i.h.b.d.b1.b a;

        public p(k.i.h.b.d.b1.b bVar) {
        }

        public final void b(k.i.h.b.b0.m.a aVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.b0.m.a aVar) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.register.ui.RegisterBindPhoneActivity$startCountDown$1", f = "RegisterBindPhoneActivity.kt", l = {351, 352}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class q extends n.a0.k.a.l implements n.d0.c.p<o.a.s3.f<? super Integer>, n.a0.d<? super n.u>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;

        public q(n.a0.d<? super q> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.s3.f<? super Integer> fVar, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.s3.f<? super Integer> fVar, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.register.ui.RegisterBindPhoneActivity$startCountDown$2", f = "RegisterBindPhoneActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class r extends n.a0.k.a.l implements n.d0.c.p<o.a.s3.f<? super Integer>, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ RegisterBindPhoneActivity b;

        public r(RegisterBindPhoneActivity registerBindPhoneActivity, n.a0.d<? super r> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.s3.f<? super Integer> fVar, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.s3.f<? super Integer> fVar, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.register.ui.RegisterBindPhoneActivity$startCountDown$3", f = "RegisterBindPhoneActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class s extends n.a0.k.a.l implements n.d0.c.p<Integer, n.a0.d<? super n.u>, Object> {
        public int a;
        public /* synthetic */ int b;
        public final /* synthetic */ RegisterBindPhoneActivity c;

        public s(RegisterBindPhoneActivity registerBindPhoneActivity, n.a0.d<? super s> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        public final Object g(int i2, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.register.ui.RegisterBindPhoneActivity$startCountDown$4", f = "RegisterBindPhoneActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class t extends n.a0.k.a.l implements n.d0.c.q<o.a.s3.f<? super Integer>, Throwable, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ RegisterBindPhoneActivity b;

        public t(RegisterBindPhoneActivity registerBindPhoneActivity, n.a0.d<? super t> dVar) {
        }

        @Override // n.d0.c.q
        public /* bridge */ /* synthetic */ Object a(o.a.s3.f<? super Integer> fVar, Throwable th, n.a0.d<? super n.u> dVar) {
        }

        public final Object g(o.a.s3.f<? super Integer> fVar, Throwable th, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class u extends n.d0.d.o implements n.d0.c.a<String> {
        public final /* synthetic */ RegisterBindPhoneActivity a;

        public u(RegisterBindPhoneActivity registerBindPhoneActivity) {
        }

        public final String b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ String invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.register.ui.RegisterBindPhoneActivity$verifyPhoneCode$1", f = "RegisterBindPhoneActivity.kt", l = {390}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class v extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ RegisterBindPhoneActivity b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.register.ui.RegisterBindPhoneActivity$verifyPhoneCode$1$1", f = "RegisterBindPhoneActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.l implements n.d0.c.q<o.a.s3.f<? super q.l>, Throwable, n.a0.d<? super n.u>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ RegisterBindPhoneActivity c;

            public a(RegisterBindPhoneActivity registerBindPhoneActivity, n.a0.d<? super a> dVar) {
            }

            @Override // n.d0.c.q
            public /* bridge */ /* synthetic */ Object a(o.a.s3.f<? super q.l> fVar, Throwable th, n.a0.d<? super n.u> dVar) {
            }

            public final Object g(o.a.s3.f<? super q.l> fVar, Throwable th, n.a0.d<? super n.u> dVar) {
            }

            @Override // n.a0.k.a.a
            public final Object invokeSuspend(Object obj) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class b implements o.a.s3.f<q.l> {
            public final /* synthetic */ RegisterBindPhoneActivity a;
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;

            public b(RegisterBindPhoneActivity registerBindPhoneActivity, String str, String str2) {
            }

            @Override // o.a.s3.f
            public Object emit(q.l lVar, n.a0.d<? super n.u> dVar) {
            }
        }

        public v(RegisterBindPhoneActivity registerBindPhoneActivity, String str, String str2, n.a0.d<? super v> dVar) {
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

    public static final /* synthetic */ f2 G1(RegisterBindPhoneActivity registerBindPhoneActivity, int i2) {
    }

    public static final /* synthetic */ void H1(RegisterBindPhoneActivity registerBindPhoneActivity) {
    }

    public static final /* synthetic */ void I1(RegisterBindPhoneActivity registerBindPhoneActivity) {
    }

    public static final /* synthetic */ f2 J1(RegisterBindPhoneActivity registerBindPhoneActivity, String str, String str2) {
    }

    public static final /* synthetic */ k.i.h.b.b0.h.b K1(RegisterBindPhoneActivity registerBindPhoneActivity) {
    }

    public static final /* synthetic */ String L1(RegisterBindPhoneActivity registerBindPhoneActivity) {
    }

    public static final /* synthetic */ String M1(RegisterBindPhoneActivity registerBindPhoneActivity) {
    }

    public static final /* synthetic */ String N1(RegisterBindPhoneActivity registerBindPhoneActivity) {
    }

    public static final /* synthetic */ k.i.h.b.b0.m.a O1(RegisterBindPhoneActivity registerBindPhoneActivity) {
    }

    public static final /* synthetic */ void P1(RegisterBindPhoneActivity registerBindPhoneActivity) {
    }

    public static final /* synthetic */ void Q1(RegisterBindPhoneActivity registerBindPhoneActivity, int i2) {
    }

    public static final /* synthetic */ f2 R1(RegisterBindPhoneActivity registerBindPhoneActivity, String str) {
    }

    public static final /* synthetic */ void S1(RegisterBindPhoneActivity registerBindPhoneActivity, int i2, String str) {
    }

    public static final /* synthetic */ void T1(RegisterBindPhoneActivity registerBindPhoneActivity, EditText editText) {
    }

    public static final /* synthetic */ void U1(RegisterBindPhoneActivity registerBindPhoneActivity) {
    }

    public static final /* synthetic */ void V1(RegisterBindPhoneActivity registerBindPhoneActivity) {
    }

    public static final /* synthetic */ void W1(RegisterBindPhoneActivity registerBindPhoneActivity) {
    }

    public static /* synthetic */ String f2(RegisterBindPhoneActivity registerBindPhoneActivity, boolean z, int i2, Object obj) {
    }

    public static /* synthetic */ void m2(EditText editText, RegisterBindPhoneActivity registerBindPhoneActivity) {
    }

    public static /* synthetic */ void n2(RegisterBindPhoneActivity registerBindPhoneActivity, int i2) {
    }

    public static final void o2(RegisterBindPhoneActivity registerBindPhoneActivity, int i2) {
    }

    public static final void t2(EditText editText, RegisterBindPhoneActivity registerBindPhoneActivity) {
    }

    public final f2 X1(int i2) {
    }

    public final void Y1() {
    }

    public final void Z1() {
    }

    public final f2 a2(String str, String str2) {
    }

    public final k.i.h.b.b0.h.b b2() {
    }

    public final String c2() {
    }

    public final String d2() {
    }

    public final String e2(boolean z) {
    }

    public final int g2() {
    }

    public final String h2() {
    }

    public final k.i.h.b.b0.m.a i2() {
    }

    public final void j2() {
    }

    public final void k2(int i2) {
    }

    public final void l2() {
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

    public final f2 p2(String str) {
    }

    public final void q2() {
    }

    public final void r2(int i2, String str) {
    }

    public final void s2(EditText editText) {
    }

    public final void u2() {
    }

    public final void v2() {
    }

    public final void w2() {
    }

    public final f2 x2(String str, String str2) {
    }
}
