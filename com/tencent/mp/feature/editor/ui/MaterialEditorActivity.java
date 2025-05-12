package com.tencent.mp.feature.editor.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.tencent.mp.feature.article.base.data.EditorJsConfig;
import com.tencent.mp.feature.data.biz.account.domain.article.WxaData;
import com.tencent.mp.feature.editor.widget.EditorMoreToolbar;
import com.tencent.mp.feature.editor.widget.EditorWebView;
import j.e.c.d;
import java.util.List;
import java.util.Map;
import q.k9;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class MaterialEditorActivity extends k.i.h.b.d.b1.b {
    public String A;
    public long B;
    public final n.d C;
    public final k.i.h.b.k.s.z.f D;
    public final k.i.h.b.k.s.z.c E;
    public final k.i.h.b.k.s.z.g F;
    public k.i.h.b.k.s.y.b G;
    public boolean H;
    public boolean I;
    public final n.d J;
    public k.i.h.b.b.a.o.i K;
    public Long L;
    public Map<Integer, View> M;
    public View h;

    /* renamed from: i, reason: collision with root package name */
    public EditorMoreToolbar f1450i;

    /* renamed from: j, reason: collision with root package name */
    public EditorWebView f1451j;

    /* renamed from: k, reason: collision with root package name */
    public k.i.h.b.k.s.x f1452k;

    /* renamed from: l, reason: collision with root package name */
    public View f1453l;

    /* renamed from: m, reason: collision with root package name */
    public k.i.h.b.b.a.q.i.d f1454m;

    /* renamed from: n, reason: collision with root package name */
    public final k.i.h.b.k.l.f f1455n;

    /* renamed from: o, reason: collision with root package name */
    public final k.i.h.b.b.a.q.i.b f1456o;

    /* renamed from: p, reason: collision with root package name */
    public final k.i.h.b.b.a.q.i.c f1457p;

    /* renamed from: q, reason: collision with root package name */
    public final k.i.h.b.b.a.i.b f1458q;

    /* renamed from: r, reason: collision with root package name */
    public final k.i.h.b.b.a.i.a f1459r;

    /* renamed from: s, reason: collision with root package name */
    public final n.d f1460s;

    /* renamed from: t, reason: collision with root package name */
    public final n.d f1461t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final n.d x;
    public String y;
    public String z;

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$autoStash$1", f = "MaterialEditorActivity.kt", l = {433}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ MaterialEditorActivity b;

        public a(MaterialEditorActivity materialEditorActivity, n.a0.d<? super a> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a0 extends n.d0.d.o implements n.d0.c.l<Integer, n.u> {
        public final /* synthetic */ MaterialEditorActivity a;

        public a0(MaterialEditorActivity materialEditorActivity) {
        }

        public final void b(int i2) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(Integer num) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class a1 extends n.d0.d.l implements n.d0.c.p<Float, String, n.u> {
        public a1(Object obj) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ n.u invoke(Float f, String str) {
        }

        public final void m(float f, String str) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$saveMaterialAndFinish$1", f = "MaterialEditorActivity.kt", l = {1989}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a2 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ MaterialEditorActivity b;

        public a2(MaterialEditorActivity materialEditorActivity, n.a0.d<? super a2> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$checkBizCardStatus$1", f = "MaterialEditorActivity.kt", l = {2367}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ MaterialEditorActivity b;
        public final /* synthetic */ List<String> c;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a implements o.a.s3.f<k.i.h.b.d.w0.d.b<List<? extends k.i.h.b.b.a.m.a>>> {
            public final /* synthetic */ MaterialEditorActivity a;

            public a(MaterialEditorActivity materialEditorActivity) {
            }

            @Override // o.a.s3.f
            public Object emit(k.i.h.b.d.w0.d.b<List<? extends k.i.h.b.b.a.m.a>> bVar, n.a0.d<? super n.u> dVar) {
            }
        }

        public b(MaterialEditorActivity materialEditorActivity, List<String> list, n.a0.d<? super b> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b0 extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ ImageView a;

        public b0(ImageView imageView) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class b1 extends n.d0.d.l implements n.d0.c.q<String, String, String, n.u> {
        public b1(Object obj) {
        }

        @Override // n.d0.c.q
        public /* bridge */ /* synthetic */ n.u a(String str, String str2, String str3) {
        }

        public final void m(String str, String str2, String str3) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$showCloudSavedDone$1", f = "MaterialEditorActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b2 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ MaterialEditorActivity b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.d0.d.o implements n.d0.c.r<Integer, Integer, Integer, String, n.u> {
            public final /* synthetic */ MaterialEditorActivity a;

            public a(MaterialEditorActivity materialEditorActivity) {
            }

            public final void b(int i2, int i3, Integer num, String str) {
            }

            @Override // n.d0.c.r
            public /* bridge */ /* synthetic */ n.u j(Integer num, Integer num2, Integer num3, String str) {
            }
        }

        public b2(MaterialEditorActivity materialEditorActivity, n.a0.d<? super b2> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$checkNextEnable$1", f = "MaterialEditorActivity.kt", l = {2063}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ MaterialEditorActivity b;
        public final /* synthetic */ String c;

        public c(MaterialEditorActivity materialEditorActivity, String str, n.a0.d<? super c> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c0 extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ ImageView a;

        public c0(ImageView imageView) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class c1 extends n.d0.d.l implements n.d0.c.p<String, WxaData, n.u> {
        public c1(Object obj) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ n.u invoke(String str, WxaData wxaData) {
        }

        public final void m(String str, WxaData wxaData) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$showKeyboardDelay$1", f = "MaterialEditorActivity.kt", l = {2274}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c2 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ MaterialEditorActivity b;

        public c2(MaterialEditorActivity materialEditorActivity, n.a0.d<? super c2> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$checkVideoCardStatus$1", f = "MaterialEditorActivity.kt", l = {2367}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ MaterialEditorActivity b;
        public final /* synthetic */ List<String> c;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a implements o.a.s3.f<k.i.h.b.d.w0.d.b<k9>> {
            public final /* synthetic */ MaterialEditorActivity a;

            public a(MaterialEditorActivity materialEditorActivity) {
            }

            @Override // o.a.s3.f
            public Object emit(k.i.h.b.d.w0.d.b<k9> bVar, n.a0.d<? super n.u> dVar) {
            }
        }

        public d(MaterialEditorActivity materialEditorActivity, List<String> list, n.a0.d<? super d> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d0 implements TextWatcher {
        public final /* synthetic */ MaterialEditorActivity a;

        public d0(MaterialEditorActivity materialEditorActivity) {
        }

        public static final void a(MaterialEditorActivity materialEditorActivity) {
        }

        public static /* synthetic */ void b(MaterialEditorActivity materialEditorActivity) {
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
    public /* synthetic */ class d1 extends n.d0.d.l implements n.d0.c.l<EditorJsConfig, n.u> {
        public d1(Object obj) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(EditorJsConfig editorJsConfig) {
        }

        public final void m(EditorJsConfig editorJsConfig) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d2 extends n.d0.d.o implements n.d0.c.a<Integer> {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public d2(Activity activity, String str, Object obj) {
        }

        @Override // n.d0.c.a
        public final Integer invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$close$1", f = "MaterialEditorActivity.kt", l = {2112}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public int b;
        public int c;
        public long d;
        public int e;
        public final /* synthetic */ MaterialEditorActivity f;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$close$1$1", f = "MaterialEditorActivity.kt", l = {2367}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super Boolean>, Object> {
            public Object a;
            public int b;
            public final /* synthetic */ MaterialEditorActivity c;

            /* renamed from: com.tencent.mp.feature.editor.ui.MaterialEditorActivity$e$a$a, reason: collision with other inner class name */
            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
            public static final class C0055a extends n.d0.d.o implements n.d0.c.p<Integer, String, n.u> {
                public final /* synthetic */ o.a.s<Boolean> a;

                public C0055a(o.a.s<? super Boolean> sVar) {
                }

                public final void b(int i2, String str) {
                }

                @Override // n.d0.c.p
                public /* bridge */ /* synthetic */ n.u invoke(Integer num, String str) {
                }
            }

            public a(MaterialEditorActivity materialEditorActivity, n.a0.d<? super a> dVar) {
            }

            @Override // n.a0.k.a.a
            public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
            }

            @Override // n.d0.c.p
            public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super Boolean> dVar) {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super Boolean> dVar) {
            }

            @Override // n.a0.k.a.a
            public final Object invokeSuspend(Object obj) {
            }
        }

        public e(MaterialEditorActivity materialEditorActivity, n.a0.d<? super e> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e0 extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ MaterialEditorActivity a;

        public e0(MaterialEditorActivity materialEditorActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class e1 extends n.d0.d.l implements n.d0.c.a<n.u> {
        public e1(Object obj) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        public final void m() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e2 extends n.d0.d.o implements n.d0.c.a<ViewModelStore> {
        public final /* synthetic */ k.i.h.b.d.b1.b a;

        public e2(k.i.h.b.d.b1.b bVar) {
        }

        public final ViewModelStore b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ ViewModelStore invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$deleteStashAndFinish$1", f = "MaterialEditorActivity.kt", l = {388}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ MaterialEditorActivity b;

        public f(MaterialEditorActivity materialEditorActivity, n.a0.d<? super f> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f0 extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ MaterialEditorActivity a;

        public f0(MaterialEditorActivity materialEditorActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class f1 extends n.d0.d.l implements n.d0.c.a<n.u> {
        public f1(Object obj) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        public final void m() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f2 extends n.d0.d.o implements n.d0.c.a<k.i.h.b.d.d1.c> {
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

        public f2(n.d0.c.a aVar, k.i.h.b.d.b1.b bVar) {
        }

        public final k.i.h.b.d.d1.c b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.d.d1.c invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g extends n.d0.d.o implements n.d0.c.a<n.u> {
        public static final g a = null;

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g0 extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ MaterialEditorActivity a;

        public g0(MaterialEditorActivity materialEditorActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class g1 extends n.d0.d.l implements n.d0.c.u<Boolean, Boolean, Integer, Integer, Integer, String, String, n.u> {
        public g1(Object obj) {
        }

        public final void m(Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, String str, String str2) {
        }

        @Override // n.d0.c.u
        public /* bridge */ /* synthetic */ n.u x(Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, String str, String str2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g2 extends n.d0.d.o implements n.d0.c.l<k.i.h.b.k.r.c, n.u> {
        public final /* synthetic */ k.i.h.b.d.b1.b a;

        public g2(k.i.h.b.d.b1.b bVar) {
        }

        public final void b(k.i.h.b.k.r.c cVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.k.r.c cVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h extends n.d0.d.o implements n.d0.c.a<n.u> {
        public static final h a = null;

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h0 extends n.d0.d.o implements n.d0.c.l<j.e.c.d, n.u> {
        public final /* synthetic */ n.d0.c.l<d.a, n.u> a;

        public h0(n.d0.c.l<? super d.a, n.u> lVar) {
        }

        public final void b(j.e.c.d dVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(j.e.c.d dVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h1 extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ MaterialEditorActivity a;

        public h1(MaterialEditorActivity materialEditorActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$titleHighlight$1", f = "MaterialEditorActivity.kt", l = {699}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h2 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ EditText c;
        public final /* synthetic */ float d;
        public final /* synthetic */ String e;

        public h2(EditText editText, float f, String str, n.a0.d<? super h2> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i extends n.d0.d.o implements n.d0.c.a<n.u> {
        public static final i a = null;

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i0 extends n.d0.d.o implements n.d0.c.l<d.a, n.u> {
        public final /* synthetic */ int a;

        public i0(int i2) {
        }

        public final void b(d.a aVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(d.a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class i1 extends n.d0.d.l implements n.d0.c.r<Double, Double, Double, Double, n.u> {
        public i1(Object obj) {
        }

        @Override // n.d0.c.r
        public /* bridge */ /* synthetic */ n.u j(Double d, Double d2, Double d3, Double d4) {
        }

        public final void m(Double d, Double d2, Double d3, Double d4) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$updateMoreImageView$1", f = "MaterialEditorActivity.kt", l = {1293}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i2 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ MaterialEditorActivity b;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$updateMoreImageView$1$isAllHintShown$1", f = "MaterialEditorActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super Boolean>, Object> {
            public int a;

            public a(n.a0.d<? super a> dVar) {
            }

            @Override // n.a0.k.a.a
            public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
            }

            @Override // n.d0.c.p
            public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super Boolean> dVar) {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super Boolean> dVar) {
            }

            @Override // n.a0.k.a.a
            public final Object invokeSuspend(Object obj) {
            }
        }

        public i2(MaterialEditorActivity materialEditorActivity, n.a0.d<? super i2> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j extends n.d0.d.o implements n.d0.c.a<n.u> {
        public static final j a = null;

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j0 extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ MaterialEditorActivity a;

        public j0(MaterialEditorActivity materialEditorActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class j1 extends n.d0.d.l implements n.d0.c.v<Integer, String, String, String, String, String, Integer, Double, n.u> {
        public j1(Object obj) {
        }

        @Override // n.d0.c.v
        public /* bridge */ /* synthetic */ n.u k(Integer num, String str, String str2, String str3, String str4, String str5, Integer num2, Double d) {
        }

        public final void m(Integer num, String str, String str2, String str3, String str4, String str5, Integer num2, Double d) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j2 extends j.e.b.b.t {
        public final /* synthetic */ n.d0.c.a<n.u> a;

        public j2(n.d0.c.a<n.u> aVar) {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.j
        public void d(MotionLayout motionLayout, int i2) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$goNext$1", f = "MaterialEditorActivity.kt", l = {2071}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class k extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ MaterialEditorActivity b;
        public final /* synthetic */ k.i.h.b.b.a.o.g c;

        public k(MaterialEditorActivity materialEditorActivity, k.i.h.b.b.a.o.g gVar, n.a0.d<? super k> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class k0 extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ MaterialEditorActivity a;

        public k0(MaterialEditorActivity materialEditorActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class k1 extends n.d0.d.o implements n.d0.c.l<Integer, n.u> {
        public final /* synthetic */ MaterialEditorActivity a;

        public k1(MaterialEditorActivity materialEditorActivity) {
        }

        public final void b(int i2) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(Integer num) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$updateToolbarPanelDelay$1", f = "MaterialEditorActivity.kt", l = {879}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class k2 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ MaterialEditorActivity b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ n.d0.c.a<n.u> e;

        public k2(MaterialEditorActivity materialEditorActivity, boolean z, boolean z2, n.d0.c.a<n.u> aVar, n.a0.d<? super k2> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class l extends n.d0.d.o implements n.d0.c.l<String, n.u> {
        public final /* synthetic */ MaterialEditorActivity a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.d0.d.o implements n.d0.c.a<n.u> {
            public static final a a = null;

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ n.u invoke() {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public l(MaterialEditorActivity materialEditorActivity) {
        }

        public final void b(String str) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class l0 extends n.d0.d.l implements n.d0.c.p<Boolean, List<? extends String>, n.u> {
        public l0(Object obj) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ n.u invoke(Boolean bool, List<? extends String> list) {
        }

        public final void m(boolean z, List<String> list) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class l1 extends n.d0.d.l implements n.d0.c.p<Boolean, Boolean, n.u> {
        public l1(Object obj) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ n.u invoke(Boolean bool, Boolean bool2) {
        }

        public final void m(Boolean bool, Boolean bool2) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$updateUploadNotSuccessImages$2", f = "MaterialEditorActivity.kt", l = {2367}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class l2 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public boolean b;
        public int c;
        public final /* synthetic */ MaterialEditorActivity d;
        public final /* synthetic */ boolean e;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.d0.d.o implements n.d0.c.l<List<? extends k.i.h.b.b.a.q.i.i>, n.u> {
            public final /* synthetic */ o.a.s<n.u> a;
            public final /* synthetic */ boolean b;
            public final /* synthetic */ MaterialEditorActivity c;

            /* renamed from: com.tencent.mp.feature.editor.ui.MaterialEditorActivity$l2$a$a, reason: collision with other inner class name */
            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
            public static final class C0056a extends n.d0.d.o implements n.d0.c.l<k.i.h.b.b.a.q.i.i, n.u> {
                public final /* synthetic */ MaterialEditorActivity a;

                public C0056a(MaterialEditorActivity materialEditorActivity) {
                }

                public final void b(k.i.h.b.b.a.q.i.i iVar) {
                }

                @Override // n.d0.c.l
                public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.b.a.q.i.i iVar) {
                }
            }

            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
            public /* synthetic */ class b {
                public static final /* synthetic */ int[] a = null;
            }

            public a(o.a.s<? super n.u> sVar, boolean z, MaterialEditorActivity materialEditorActivity) {
            }

            public final void b(List<k.i.h.b.b.a.q.i.i> list) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ n.u invoke(List<? extends k.i.h.b.b.a.q.i.i> list) {
            }
        }

        public l2(MaterialEditorActivity materialEditorActivity, boolean z, n.a0.d<? super l2> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$initDraftSyncObserver$1$1", f = "MaterialEditorActivity.kt", l = {260}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class m extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ MaterialEditorActivity b;

        public m(MaterialEditorActivity materialEditorActivity, n.a0.d<? super m> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class m0 extends n.d0.d.l implements n.d0.c.q<String, String, String, n.u> {
        public m0(Object obj) {
        }

        @Override // n.d0.c.q
        public /* bridge */ /* synthetic */ n.u a(String str, String str2, String str3) {
        }

        public final void m(String str, String str2, String str3) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$loadMaterial$1", f = "MaterialEditorActivity.kt", l = {291, 339, 340, 341}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class m1 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ MaterialEditorActivity b;

        public m1(MaterialEditorActivity materialEditorActivity, n.a0.d<? super m1> dVar) {
        }

        public static final boolean g(View view, MotionEvent motionEvent) {
        }

        public static final boolean h(MaterialEditorActivity materialEditorActivity, View view, MotionEvent motionEvent) {
        }

        public static /* synthetic */ boolean i(MaterialEditorActivity materialEditorActivity, View view, MotionEvent motionEvent) {
        }

        public static /* synthetic */ boolean l(View view, MotionEvent motionEvent) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class m2 extends n.d0.d.o implements n.d0.c.a<k.i.h.b.p.e.g> {
        public static final m2 a = null;

        public final k.i.h.b.p.e.g b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.p.e.g invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class n extends n.d0.d.l implements n.d0.c.l<k.i.h.b.b.a.k.c, n.u> {
        public n(Object obj) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.b.a.k.c cVar) {
        }

        public final void m(k.i.h.b.b.a.k.c cVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class n0 extends n.d0.d.l implements n.d0.c.l<k.i.h.b.b.a.k.c[], n.u> {
        public n0(Object obj) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.b.a.k.c[] cVarArr) {
        }

        public final void m(k.i.h.b.b.a.k.c[] cVarArr) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class n1 extends n.d0.d.o implements n.d0.c.a<k.i.h.b.k.s.z.d> {
        public final /* synthetic */ MaterialEditorActivity a;

        public n1(MaterialEditorActivity materialEditorActivity) {
        }

        public final k.i.h.b.k.s.z.d b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.k.s.z.d invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class o extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ MaterialEditorActivity a;

        public o(MaterialEditorActivity materialEditorActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class o0 extends n.d0.d.l implements n.d0.c.t<Boolean, Double, Double, Double, Double, k.i.h.b.b.a.k.c[], n.u> {
        public o0(Object obj) {
        }

        public final void m(Boolean bool, Double d, Double d2, Double d3, Double d4, k.i.h.b.b.a.k.c[] cVarArr) {
        }

        @Override // n.d0.c.t
        public /* bridge */ /* synthetic */ n.u n(Boolean bool, Double d, Double d2, Double d3, Double d4, k.i.h.b.b.a.k.c[] cVarArr) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class o1 extends n.d0.d.o implements n.d0.c.a<k.i.h.b.b.a.q.f> {
        public static final o1 a = null;

        public final k.i.h.b.b.a.q.f b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.b.a.q.f invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class p extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ MaterialEditorActivity a;

        public p(MaterialEditorActivity materialEditorActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class p0 extends n.d0.d.l implements n.d0.c.l<String, n.u> {
        public p0(Object obj) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(String str) {
        }

        public final void m(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class p1 extends n.d0.d.o implements n.d0.c.a<n.u> {
        public static final p1 a = null;

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class q extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ MaterialEditorActivity a;

        public q(MaterialEditorActivity materialEditorActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class q0 extends n.d0.d.l implements n.d0.c.l<String, n.u> {
        public q0(Object obj) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(String str) {
        }

        public final void m(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class q1 extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ MaterialEditorActivity a;
        public final /* synthetic */ k.i.h.b.b.a.q.i.d b;

        public q1(MaterialEditorActivity materialEditorActivity, k.i.h.b.b.a.q.i.d dVar) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class r extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ MaterialEditorActivity a;

        public r(MaterialEditorActivity materialEditorActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class r0 extends n.d0.d.l implements n.d0.c.l<List<? extends List<? extends k.i.h.b.b.a.k.a>>, n.u> {
        public r0(Object obj) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(List<? extends List<? extends k.i.h.b.b.a.k.a>> list) {
        }

        public final void m(List<? extends List<k.i.h.b.b.a.k.a>> list) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class r1 extends n.d0.d.o implements n.d0.c.a<n.u> {
        public static final r1 a = null;

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class s extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ MaterialEditorActivity a;

        public s(MaterialEditorActivity materialEditorActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class s0 extends n.d0.d.l implements n.d0.c.a<n.u> {
        public s0(Object obj) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        public final void m() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class s1 extends n.d0.d.o implements n.d0.c.a<n.u> {
        public static final s1 a = null;

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class t extends n.d0.d.o implements n.d0.c.l<Integer, n.u> {
        public final /* synthetic */ MaterialEditorActivity a;
        public final /* synthetic */ ImageView b;

        public t(MaterialEditorActivity materialEditorActivity, ImageView imageView) {
        }

        public final void b(int i2) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(Integer num) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class t0 extends n.d0.d.l implements n.d0.c.a<n.u> {
        public t0(Object obj) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        public final void m() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$onClickTopTip$1", f = "MaterialEditorActivity.kt", l = {2326}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class t1 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ MaterialEditorActivity b;

        public t1(MaterialEditorActivity materialEditorActivity, n.a0.d<? super t1> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class u extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ ImageView a;

        public u(ImageView imageView) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class u0 extends n.d0.d.l implements n.d0.c.l<List<? extends String>, n.u> {
        public u0(Object obj) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(List<? extends String> list) {
        }

        public final void m(List<String> list) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$onSelectPhotoEnd$1", f = "MaterialEditorActivity.kt", l = {1936}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class u1 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ List<Uri> c;
        public final /* synthetic */ MaterialEditorActivity d;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.d0.d.o implements n.d0.c.l<k.i.h.b.b.a.q.i.i, n.u> {
            public final /* synthetic */ MaterialEditorActivity a;

            public a(MaterialEditorActivity materialEditorActivity) {
            }

            public final void b(k.i.h.b.b.a.q.i.i iVar) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.b.a.q.i.i iVar) {
            }
        }

        public u1(List<? extends Uri> list, MaterialEditorActivity materialEditorActivity, n.a0.d<? super u1> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class v extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ ImageView a;

        public v(ImageView imageView) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class v0 extends n.d0.d.l implements n.d0.c.q<Integer, Integer, String, n.u> {
        public v0(Object obj) {
        }

        @Override // n.d0.c.q
        public /* bridge */ /* synthetic */ n.u a(Integer num, Integer num2, String str) {
        }

        public final void m(int i2, int i3, String str) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$postJSInit$1", f = "MaterialEditorActivity.kt", l = {770}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class v1 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ MaterialEditorActivity b;

        public v1(MaterialEditorActivity materialEditorActivity, n.a0.d<? super v1> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class w extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ MaterialEditorActivity a;

        public w(MaterialEditorActivity materialEditorActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class w0 extends n.d0.d.l implements n.d0.c.a<n.u> {
        public w0(Object obj) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        public final void m() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class w1 extends n.d0.d.o implements n.d0.c.p<Integer, Integer, n.u> {
        public final /* synthetic */ MaterialEditorActivity a;

        public w1(MaterialEditorActivity materialEditorActivity) {
        }

        public final void b(int i2, int i3) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ n.u invoke(Integer num, Integer num2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class x extends n.d0.d.o implements n.d0.c.l<Integer, n.u> {
        public final /* synthetic */ MaterialEditorActivity a;

        public x(MaterialEditorActivity materialEditorActivity) {
        }

        public final void b(int i2) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(Integer num) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class x0 extends n.d0.d.l implements n.d0.c.l<Boolean, n.u> {
        public x0(Object obj) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(Boolean bool) {
        }

        public final void m(boolean z) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$postSetHtml$2", f = "MaterialEditorActivity.kt", l = {805, 806}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class x1 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ MaterialEditorActivity b;

        public x1(MaterialEditorActivity materialEditorActivity, n.a0.d<? super x1> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class y extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ ImageView a;

        public y(ImageView imageView) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class y0 extends n.d0.d.o implements n.d0.c.a<Long> {
        public final /* synthetic */ MaterialEditorActivity a;

        public y0(MaterialEditorActivity materialEditorActivity) {
        }

        public final Long b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Long invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class y1 extends n.d0.d.o implements n.d0.c.l<k.i.h.b.b.a.q.i.i, n.u> {
        public final /* synthetic */ MaterialEditorActivity a;

        public y1(MaterialEditorActivity materialEditorActivity) {
        }

        public final void b(k.i.h.b.b.a.q.i.i iVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.b.a.q.i.i iVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class z extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ ImageView a;

        public z(ImageView imageView) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class z0 extends n.d0.d.l implements n.d0.c.a<n.u> {
        public z0(Object obj) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        public final void m() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.MaterialEditorActivity$saveMaterial$1", f = "MaterialEditorActivity.kt", l = {1954}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class z1 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ MaterialEditorActivity b;

        public z1(MaterialEditorActivity materialEditorActivity, n.a0.d<? super z1> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(o.a.t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    public static final /* synthetic */ void A2(MaterialEditorActivity materialEditorActivity, boolean z2) {
    }

    public static final /* synthetic */ void B2(MaterialEditorActivity materialEditorActivity, boolean z2) {
    }

    public static /* synthetic */ void B4(MaterialEditorActivity materialEditorActivity, View view, boolean z2) {
    }

    public static final /* synthetic */ void C2(MaterialEditorActivity materialEditorActivity, List list) {
    }

    public static /* synthetic */ void C4(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static final /* synthetic */ void D2(MaterialEditorActivity materialEditorActivity) {
    }

    public static final void D3(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static /* synthetic */ void D4(MaterialEditorActivity materialEditorActivity, k.i.h.d.b[] bVarArr, int i3, View view) {
    }

    public static final void D5(MaterialEditorActivity materialEditorActivity, k.i.h.b.d.b1.d.d dVar) {
    }

    public static final /* synthetic */ o.a.f2 E2(MaterialEditorActivity materialEditorActivity) {
    }

    public static /* synthetic */ void E4(MaterialEditorActivity materialEditorActivity, ImageView imageView, View view) {
    }

    public static final void E5(MaterialEditorActivity materialEditorActivity, MenuItem menuItem, int i3) {
    }

    public static final /* synthetic */ void F2(MaterialEditorActivity materialEditorActivity, Boolean bool, Double d3, Double d4, Double d5, Double d6, k.i.h.b.b.a.k.c[] cVarArr) {
    }

    public static /* synthetic */ void F4(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static final /* synthetic */ void G2(MaterialEditorActivity materialEditorActivity) {
    }

    public static final void G3(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static /* synthetic */ void G4(MaterialEditorActivity materialEditorActivity, ImageView imageView, View view) {
    }

    public static final /* synthetic */ boolean H1(MaterialEditorActivity materialEditorActivity) {
    }

    public static final /* synthetic */ void H2(MaterialEditorActivity materialEditorActivity) {
    }

    public static /* synthetic */ void H4(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static final /* synthetic */ void I1(MaterialEditorActivity materialEditorActivity, List list) {
    }

    public static final /* synthetic */ void I2(MaterialEditorActivity materialEditorActivity, int i3, int i4, String str) {
    }

    public static final void I3(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static /* synthetic */ void I4(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static final /* synthetic */ void J1(MaterialEditorActivity materialEditorActivity, boolean z2, List list) {
    }

    public static final /* synthetic */ void J2(MaterialEditorActivity materialEditorActivity, String str) {
    }

    public static /* synthetic */ void J4(View view) {
    }

    public static final /* synthetic */ void K1(MaterialEditorActivity materialEditorActivity) {
    }

    public static final /* synthetic */ void K2(MaterialEditorActivity materialEditorActivity, EditorJsConfig editorJsConfig) {
    }

    public static final void K3(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static /* synthetic */ void K4(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static final /* synthetic */ o.a.f2 L1(MaterialEditorActivity materialEditorActivity) {
    }

    public static final /* synthetic */ void L2(MaterialEditorActivity materialEditorActivity, float f3, String str) {
    }

    public static /* synthetic */ void L4(MaterialEditorActivity materialEditorActivity, k.i.h.b.d.b1.d.d dVar) {
    }

    public static final /* synthetic */ void M1(MaterialEditorActivity materialEditorActivity) {
    }

    public static final /* synthetic */ void M2(MaterialEditorActivity materialEditorActivity) {
    }

    public static final void M3(MaterialEditorActivity materialEditorActivity, ImageView imageView, View view) {
    }

    public static /* synthetic */ void M4(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static final /* synthetic */ void N1(MaterialEditorActivity materialEditorActivity) {
    }

    public static final /* synthetic */ void N2(MaterialEditorActivity materialEditorActivity, Double d3, Double d4, Double d5, Double d6) {
    }

    public static /* synthetic */ void N4(MaterialEditorActivity materialEditorActivity, int i3, Intent intent) {
    }

    public static final /* synthetic */ void O1(MaterialEditorActivity materialEditorActivity) {
    }

    public static final /* synthetic */ o.a.f2 O2(MaterialEditorActivity materialEditorActivity) {
    }

    public static final void O3(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static /* synthetic */ void O4(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static final /* synthetic */ void P1(MaterialEditorActivity materialEditorActivity, String str, String str2, String str3) {
    }

    public static final /* synthetic */ void P2(MaterialEditorActivity materialEditorActivity, Integer num, String str, String str2, String str3, String str4, String str5, Integer num2, Double d3) {
    }

    public static /* synthetic */ void P4(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static final /* synthetic */ void Q1(MaterialEditorActivity materialEditorActivity, String str, WxaData wxaData) {
    }

    public static final /* synthetic */ void Q2(MaterialEditorActivity materialEditorActivity, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, String str, String str2) {
    }

    public static final void Q3(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static /* synthetic */ void Q4(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static final /* synthetic */ void R1(MaterialEditorActivity materialEditorActivity, String str, String str2, String str3) {
    }

    public static final /* synthetic */ void R2(MaterialEditorActivity materialEditorActivity, boolean z2, boolean z3, n.d0.c.a aVar) {
    }

    public static /* synthetic */ void R4(MaterialEditorActivity materialEditorActivity, int i3, int i4, int i5, int i6) {
    }

    public static final /* synthetic */ void S1(MaterialEditorActivity materialEditorActivity) {
    }

    public static final /* synthetic */ void S2(MaterialEditorActivity materialEditorActivity, Boolean bool, Boolean bool2) {
    }

    public static final void S3(MaterialEditorActivity materialEditorActivity, k.i.h.d.b[] bVarArr, int i3, View view) {
    }

    public static /* synthetic */ void S4(MaterialEditorActivity materialEditorActivity, int i3) {
    }

    public static final /* synthetic */ void T1(MaterialEditorActivity materialEditorActivity) {
    }

    public static final /* synthetic */ Object T2(MaterialEditorActivity materialEditorActivity, boolean z2, n.a0.d dVar) {
    }

    public static /* synthetic */ void T4(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static final /* synthetic */ void U1(MaterialEditorActivity materialEditorActivity) {
    }

    public static final /* synthetic */ void U2(MaterialEditorActivity materialEditorActivity, boolean z2) {
    }

    public static final void U3(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static /* synthetic */ void U4(MaterialEditorActivity materialEditorActivity, k.i.h.b.j.j.e eVar) {
    }

    public static final /* synthetic */ k.i.h.b.b.a.q.i.b V1(MaterialEditorActivity materialEditorActivity) {
    }

    public static /* synthetic */ void V4(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static /* synthetic */ void V5(MaterialEditorActivity materialEditorActivity, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, String str, String str2, int i3, Object obj) {
    }

    public static final /* synthetic */ k.i.h.b.b.a.q.i.d W1(MaterialEditorActivity materialEditorActivity) {
    }

    public static final void W3(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static /* synthetic */ void W4(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static final /* synthetic */ int X1(MaterialEditorActivity materialEditorActivity) {
    }

    public static /* synthetic */ void X4(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static /* synthetic */ void X5(MaterialEditorActivity materialEditorActivity, boolean z2, boolean z3, n.d0.c.a aVar, int i3, Object obj) {
    }

    public static final /* synthetic */ long Y1(MaterialEditorActivity materialEditorActivity) {
    }

    public static final void Y3(MaterialEditorActivity materialEditorActivity, ImageView imageView, View view) {
    }

    public static /* synthetic */ void Y4(MaterialEditorActivity materialEditorActivity, ImageView imageView, View view) {
    }

    public static final /* synthetic */ k.i.h.b.k.r.c Z1(MaterialEditorActivity materialEditorActivity) {
    }

    public static /* synthetic */ void Z4(MaterialEditorActivity materialEditorActivity, View view, boolean z2) {
    }

    public static /* synthetic */ void Z5(MaterialEditorActivity materialEditorActivity, boolean z2, boolean z3, n.d0.c.a aVar, int i3, Object obj) {
    }

    public static final /* synthetic */ k.i.h.b.b.a.o.i a2(MaterialEditorActivity materialEditorActivity) {
    }

    public static final void a4(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static /* synthetic */ void a5(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static final /* synthetic */ k.i.h.b.b.a.q.f b2(MaterialEditorActivity materialEditorActivity) {
    }

    public static /* synthetic */ void b5(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static final /* synthetic */ k.i.h.b.k.l.f c2(MaterialEditorActivity materialEditorActivity) {
    }

    public static final void c4(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static /* synthetic */ void c5(MaterialEditorActivity materialEditorActivity, MenuItem menuItem, int i3) {
    }

    public static final /* synthetic */ k.i.h.b.b.a.i.a d2(MaterialEditorActivity materialEditorActivity) {
    }

    public static /* synthetic */ void d5(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static final void d6(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static final /* synthetic */ View e2(MaterialEditorActivity materialEditorActivity) {
    }

    public static final void e4(MaterialEditorActivity materialEditorActivity, ImageView imageView, View view) {
    }

    public static /* synthetic */ void e5(MaterialEditorActivity materialEditorActivity) {
    }

    public static final /* synthetic */ k.i.h.b.k.s.x f2(MaterialEditorActivity materialEditorActivity) {
    }

    public static final /* synthetic */ k.i.h.b.p.e.g g2(MaterialEditorActivity materialEditorActivity) {
    }

    public static final void g4(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static final /* synthetic */ void h2(MaterialEditorActivity materialEditorActivity, k.i.h.b.b.a.o.f fVar) {
    }

    public static final void h3(MaterialEditorActivity materialEditorActivity, int i3, Intent intent) {
    }

    public static final /* synthetic */ void i2(MaterialEditorActivity materialEditorActivity, k.i.h.b.b.a.k.c[] cVarArr) {
    }

    public static final void i4(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static final /* synthetic */ boolean j2(MaterialEditorActivity materialEditorActivity) {
    }

    public static final /* synthetic */ void k2(MaterialEditorActivity materialEditorActivity, k.i.h.b.b.a.o.g gVar) {
    }

    public static final void k4(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static final /* synthetic */ void l2(MaterialEditorActivity materialEditorActivity) {
    }

    public static final /* synthetic */ void m2(MaterialEditorActivity materialEditorActivity) {
    }

    public static final void m4(View view) {
    }

    public static final /* synthetic */ void n2(MaterialEditorActivity materialEditorActivity, String str) {
    }

    public static final void n4(MaterialEditorActivity materialEditorActivity, View view, boolean z2) {
    }

    public static final /* synthetic */ void o2(MaterialEditorActivity materialEditorActivity, boolean z2) {
    }

    public static final /* synthetic */ void p2(MaterialEditorActivity materialEditorActivity, k.i.h.b.b.a.k.c cVar) {
    }

    public static final /* synthetic */ void q2(MaterialEditorActivity materialEditorActivity) {
    }

    public static final void q4(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static final /* synthetic */ void r2(MaterialEditorActivity materialEditorActivity, k.i.h.b.b.a.q.i.i iVar, boolean z2) {
    }

    public static final void r4(MaterialEditorActivity materialEditorActivity, View view) {
    }

    public static final /* synthetic */ void s2(MaterialEditorActivity materialEditorActivity) {
    }

    public static final /* synthetic */ void t2(MaterialEditorActivity materialEditorActivity) {
    }

    public static final void t4(MaterialEditorActivity materialEditorActivity, int i3) {
    }

    public static final /* synthetic */ void u2(MaterialEditorActivity materialEditorActivity, String str) {
    }

    public static /* synthetic */ void u5(MaterialEditorActivity materialEditorActivity, boolean z2, int i3, Object obj) {
    }

    public static final /* synthetic */ void v2(MaterialEditorActivity materialEditorActivity) {
    }

    public static /* synthetic */ void v3(MaterialEditorActivity materialEditorActivity, k.i.h.b.b.a.o.g gVar, int i3, Object obj) {
    }

    public static final void v4(MaterialEditorActivity materialEditorActivity, int i3, int i4, int i5, int i6) {
    }

    public static final /* synthetic */ void w2(MaterialEditorActivity materialEditorActivity) {
    }

    public static final void w4(MaterialEditorActivity materialEditorActivity) {
    }

    public static final /* synthetic */ void x2(MaterialEditorActivity materialEditorActivity) {
    }

    public static final void x4(MaterialEditorActivity materialEditorActivity, View view, boolean z2) {
    }

    public static final /* synthetic */ void y2(MaterialEditorActivity materialEditorActivity, long j3) {
    }

    public static final /* synthetic */ void z2(MaterialEditorActivity materialEditorActivity, k.i.h.b.b.a.o.i iVar) {
    }

    public static final void z3(MaterialEditorActivity materialEditorActivity, k.i.h.b.j.j.e eVar) {
    }

    public final void A3(k.i.h.b.b.a.k.c[] cVarArr) {
    }

    public final void A4(k.i.h.b.b.a.o.g gVar) {
    }

    public final void A5(Integer num, Integer num2) {
    }

    public final void B3() {
    }

    public final void B5(List<? extends List<k.i.h.b.b.a.k.a>> list) {
    }

    public final void C3(View view) {
    }

    public final void C5() {
    }

    public final void E3() {
    }

    public final void F3(View view) {
    }

    public final o.a.f2 F5() {
    }

    public View G1(int i3) {
    }

    public final void G5(boolean z2) {
    }

    public final void H3(View view) {
    }

    public final void H5(boolean z2) {
    }

    public final void I5(Boolean bool, Double d3, Double d4, Double d5, Double d6, k.i.h.b.b.a.k.c[] cVarArr) {
    }

    public final void J3() {
    }

    public final void J5() {
    }

    public final void K5() {
    }

    public final void L3(View view) {
    }

    public final void L5(int i3, int i4, String str) {
    }

    public final void M5(String str) {
    }

    public final void N3(View view) {
    }

    public final void N5(EditorJsConfig editorJsConfig) {
    }

    public final void O5(float f3, String str) {
    }

    public final void P3(View view) {
    }

    public final void P5() {
    }

    public final void Q5() {
    }

    public final void R3(View view) {
    }

    public final void R5(Double d3, Double d4, Double d5, Double d6) {
    }

    public final o.a.f2 S5() {
    }

    public final void T3(View view) {
    }

    public final void T5(Integer num, String str, String str2, String str3, String str4, String str5, Integer num2, Double d3) {
    }

    public final void U5(Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, String str, String str2) {
    }

    public final boolean V2() {
    }

    public final void V3(View view) {
    }

    @Override // k.i.h.b.d.b1.a
    public int W0() {
    }

    public final void W2(List<String> list) {
    }

    public final void W5(boolean z2, boolean z3, n.d0.c.a<n.u> aVar) {
    }

    public final boolean X2() {
    }

    public final void X3(View view) {
    }

    public final void Y2(boolean z2, List<String> list) {
    }

    public final void Y5(boolean z2, boolean z3, n.d0.c.a<n.u> aVar) {
    }

    public final void Z2() {
    }

    public final void Z3(View view) {
    }

    public final o.a.f2 a3() {
    }

    public final void a6(Boolean bool, Boolean bool2) {
    }

    public final void b3() {
    }

    public final void b4(View view) {
    }

    public final Object b6(boolean z2, n.a0.d<? super n.u> dVar) {
    }

    public final void c3() {
    }

    public final void c6(boolean z2) {
    }

    public final void d3() {
    }

    public final void d4(View view) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
    }

    public final void e3() {
    }

    public final void f3(String str, String str2, String str3) {
    }

    public final void f4(View view) {
    }

    public final o.a.f2 f5() {
    }

    public final void g3(String str, WxaData wxaData) {
    }

    public final void g5() {
    }

    public final void h4(View view) {
    }

    public final void h5() {
    }

    public final void i3(String str, String str2, String str3) {
    }

    public final void i5(String str) {
    }

    public final void j3(boolean z2) {
    }

    public final void j4(View view) {
    }

    public final void j5(boolean z2) {
    }

    public final void k3(boolean z2) {
    }

    public final o.a.f2 k5() {
    }

    public final void l3() {
    }

    public final void l4() {
    }

    public final void l5(k.i.h.b.b.a.k.c cVar) {
    }

    public final void m3() {
    }

    public final void m5(int i3) {
    }

    public final void n3() {
    }

    public final void n5() {
    }

    public final void o3() {
    }

    public final void o4() {
    }

    public final void o5() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i3, int i4, Intent intent) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // k.i.h.b.d.b1.b, k.i.h.b.d.b1.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, j.g.j.h, android.app.Activity
    @SuppressLint({"SetJavaScriptEnabled"})
    public void onCreate(Bundle bundle) {
    }

    @Override // k.i.h.b.d.b1.b, j.b.k.d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
    }

    @Override // k.i.h.b.d.b1.b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // k.i.h.b.d.b1.b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    public final int p3() {
    }

    public final void p4(View view) {
    }

    public final o.a.f2 p5(List<? extends Uri> list) {
    }

    public final k.i.h.b.k.s.z.d q3() {
    }

    public final void q5(k.i.h.b.b.a.q.i.i iVar, boolean z2) {
    }

    public final k.i.h.b.k.r.c r3() {
    }

    public final void r5() {
    }

    public final k.i.h.b.b.a.q.f s3() {
    }

    public final void s4() {
    }

    public final void s5() {
    }

    public final k.i.h.b.p.e.g t3() {
    }

    public final void t5(boolean z2) {
    }

    public final void u3(k.i.h.b.b.a.o.g gVar) {
    }

    public final void u4() {
    }

    public final void v5(String str) {
    }

    public final void w3(k.i.h.b.b.a.o.f fVar) {
    }

    public final void w5() {
    }

    public final void x3(View view) {
    }

    public final void x5() {
    }

    public final void y3() {
    }

    public final void y4() {
    }

    public final void y5() {
    }

    public final boolean z4() {
    }

    public final void z5() {
    }
}
