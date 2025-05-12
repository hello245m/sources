package com.tencent.mp.feature.editor.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.google.android.material.appbar.AppBarLayout;
import com.google.gson.reflect.TypeToken;
import com.tencent.mp.feature.article.base.domain.CropImageItem;
import com.tencent.mp.feature.data.biz.account.domain.article.MakeImageConfig;
import com.tencent.mp.feature.data.biz.account.domain.article.PoiData;
import com.tencent.mp.feature.data.biz.account.domain.article.ShareImageInfo;
import com.tencent.mp.feature.data.biz.account.domain.article.WxaData;
import com.tencent.xweb.XWebFeature;
import com.tencent.xweb.util.WXWebReporter;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import k.i.h.b.d.b1.f.d;
import k.i.h.b.k.o.d2;
import o.a.f2;
import q.ob;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class ImageEditorActivity extends k.i.h.b.d.b1.b implements k.i.h.b.k.j.a {
    public String A;
    public String B;
    public long C;
    public final n.d D;
    public final j.a.h.c<Intent> E;
    public final n.d F;
    public final j.a.h.c<Intent> G;
    public final n.d h;

    /* renamed from: i, reason: collision with root package name */
    public final n.d f1437i;

    /* renamed from: j, reason: collision with root package name */
    public k.i.h.b.b.a.q.i.d f1438j;

    /* renamed from: k, reason: collision with root package name */
    public final k.i.h.b.b.a.k.d f1439k;

    /* renamed from: l, reason: collision with root package name */
    public final n.d f1440l;

    /* renamed from: m, reason: collision with root package name */
    public final n.d f1441m;

    /* renamed from: n, reason: collision with root package name */
    public final n.d f1442n;

    /* renamed from: o, reason: collision with root package name */
    public final n.d f1443o;

    /* renamed from: p, reason: collision with root package name */
    public final j.a.h.c<k.i.h.b.z.n.b.b> f1444p;

    /* renamed from: q, reason: collision with root package name */
    public k.i.h.b.k.s.y.b f1445q;

    /* renamed from: r, reason: collision with root package name */
    public final n.d f1446r;

    /* renamed from: s, reason: collision with root package name */
    public File f1447s;

    /* renamed from: t, reason: collision with root package name */
    public final n.d f1448t;
    public final n.d u;
    public k.i.h.b.k.o.i2.h v;
    public final n.d w;
    public boolean x;
    public boolean y;
    public int z;

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.ImageEditorActivity$addUploadImages$1", f = "ImageEditorActivity.kt", l = {1124}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ ImageEditorActivity c;
        public final /* synthetic */ List<k.i.h.b.b.a.k.b> d;

        public a(ImageEditorActivity imageEditorActivity, List<k.i.h.b.b.a.k.b> list, n.a0.d<? super a> dVar) {
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
    public static final class a0 extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ ImageEditorActivity a;

        public a0(ImageEditorActivity imageEditorActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.ImageEditorActivity$showKeyboardDelay$1", f = "ImageEditorActivity.kt", l = {945}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a1 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ ImageEditorActivity b;

        public a1(ImageEditorActivity imageEditorActivity, n.a0.d<? super a1> dVar) {
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
    public static final class b extends n.d0.d.o implements n.d0.c.a<k.i.h.b.k.m.a> {
        public final /* synthetic */ ImageEditorActivity a;

        public b(ImageEditorActivity imageEditorActivity) {
        }

        public final k.i.h.b.k.m.a b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.k.m.a invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b0 implements TextWatcher {
        public final /* synthetic */ ImageEditorActivity a;

        public b0(ImageEditorActivity imageEditorActivity) {
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
    public static final class b1 extends n.d0.d.o implements n.d0.c.a<Integer> {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public b1(Activity activity, String str, Object obj) {
        }

        @Override // n.d0.c.a
        public final Integer invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.ImageEditorActivity", f = "ImageEditorActivity.kt", l = {1631, 1639, 1646, 1656}, m = "check")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends n.a0.k.a.d {
        public /* synthetic */ Object a;
        public final /* synthetic */ ImageEditorActivity b;
        public int c;

        public c(ImageEditorActivity imageEditorActivity, n.a0.d<? super c> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c0 extends n.d0.d.o implements n.d0.c.a<n.u> {
        public static final c0 a = null;

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c1 extends n.d0.d.o implements n.d0.c.a<ViewModelStore> {
        public final /* synthetic */ k.i.h.b.d.b1.b a;

        public c1(k.i.h.b.d.b1.b bVar) {
        }

        public final ViewModelStore b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ ViewModelStore invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends n.d0.d.o implements n.d0.c.l<k.i.h.b.b.a.q.i.i, n.u> {
        public final /* synthetic */ ImageEditorActivity a;
        public final /* synthetic */ k.i.h.b.b.a.k.b b;

        public d(ImageEditorActivity imageEditorActivity, k.i.h.b.b.a.k.b bVar) {
        }

        public final void b(k.i.h.b.b.a.q.i.i iVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.b.a.q.i.i iVar) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.ImageEditorActivity$insertLocation$1", f = "ImageEditorActivity.kt", l = {670}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d0 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ ImageEditorActivity b;

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

        public d0(ImageEditorActivity imageEditorActivity, n.a0.d<? super d0> dVar) {
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
    public static final class d1 extends n.d0.d.o implements n.d0.c.a<k.i.h.b.d.d1.c> {
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

        public d1(n.d0.c.a aVar, k.i.h.b.d.b1.b bVar) {
        }

        public final k.i.h.b.d.d1.c b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.d.d1.c invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.ImageEditorActivity$deleteStashFinish$1", f = "ImageEditorActivity.kt", l = {1422}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ ImageEditorActivity b;

        public e(ImageEditorActivity imageEditorActivity, n.a0.d<? super e> dVar) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.ImageEditorActivity$insertMiniProgram$1", f = "ImageEditorActivity.kt", l = {724}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e0 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ ImageEditorActivity b;

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

        public e0(ImageEditorActivity imageEditorActivity, n.a0.d<? super e0> dVar) {
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
    public static final class e1 extends n.d0.d.o implements n.d0.c.l<k.i.h.b.k.r.a, n.u> {
        public final /* synthetic */ k.i.h.b.d.b1.b a;

        public e1(k.i.h.b.d.b1.b bVar) {
        }

        public final void b(k.i.h.b.k.r.a aVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.k.r.a aVar) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.ImageEditorActivity$editPoi$1", f = "ImageEditorActivity.kt", l = {682}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public Object b;
        public int c;
        public final /* synthetic */ ImageEditorActivity d;
        public final /* synthetic */ PoiData e;
        public final /* synthetic */ String f;

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

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class b extends n.d0.d.o implements n.d0.c.a<n.u> {
            public static final b a = null;

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ n.u invoke() {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class c extends n.d0.d.o implements n.d0.c.l<String, n.u> {
            public final /* synthetic */ n.a0.d<String> a;

            public c(n.a0.d<? super String> dVar) {
            }

            public final void b(String str) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ n.u invoke(String str) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class d extends n.d0.d.o implements n.d0.c.a<n.u> {
            public final /* synthetic */ n.a0.d<String> a;

            public d(n.a0.d<? super String> dVar) {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ n.u invoke() {
            }
        }

        public f(ImageEditorActivity imageEditorActivity, PoiData poiData, String str, n.a0.d<? super f> dVar) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.ImageEditorActivity$judgeNeedRecoverMakingImage$1", f = "ImageEditorActivity.kt", l = {1452, 1464, 1470, 1482, 1492}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f0 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public final /* synthetic */ String f;
        public final /* synthetic */ ImageEditorActivity g;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends TypeToken<k.i.h.b.b.a.m.d> {
        }

        public f0(String str, ImageEditorActivity imageEditorActivity, n.a0.d<? super f0> dVar) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.ImageEditorActivity$stashDraft$1", f = "ImageEditorActivity.kt", l = {612}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f1 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ ImageEditorActivity b;

        public f1(ImageEditorActivity imageEditorActivity, n.a0.d<? super f1> dVar) {
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
    public static final class g extends n.d0.d.o implements n.d0.c.a<k.i.h.b.b.a.i.a> {
        public final /* synthetic */ ImageEditorActivity a;

        public g(ImageEditorActivity imageEditorActivity) {
        }

        public final k.i.h.b.b.a.i.a b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.b.a.i.a invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.ImageEditorActivity", f = "ImageEditorActivity.kt", l = {617, 630, 633}, m = "loadDraftData")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g0 extends n.a0.k.a.d {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public final /* synthetic */ ImageEditorActivity d;
        public int e;

        public g0(ImageEditorActivity imageEditorActivity, n.a0.d<? super g0> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.ImageEditorActivity$toCropImage$1", f = "ImageEditorActivity.kt", l = {1249}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g1 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public final /* synthetic */ ImageEditorActivity f;
        public final /* synthetic */ int g;

        public g1(ImageEditorActivity imageEditorActivity, int i2, n.a0.d<? super g1> dVar) {
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
    public static final class h extends n.d0.d.o implements n.d0.c.a<k.i.h.b.b.a.i.b> {
        public static final h a = null;

        public final k.i.h.b.b.a.i.b b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.b.a.i.b invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h0 extends n.d0.d.o implements n.d0.c.a<GestureDetector> {
        public final /* synthetic */ ImageEditorActivity a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends GestureDetector.SimpleOnGestureListener {
            public final /* synthetic */ ImageEditorActivity a;

            public a(ImageEditorActivity imageEditorActivity) {
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            }
        }

        public h0(ImageEditorActivity imageEditorActivity) {
        }

        public final GestureDetector b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ GestureDetector invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h1 extends TypeToken<MakeImageConfig> {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i extends n.d0.d.o implements n.d0.c.a<d2> {
        public final /* synthetic */ ImageEditorActivity a;

        public i(ImageEditorActivity imageEditorActivity) {
        }

        public final d2 b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ d2 invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i0 extends n.d0.d.o implements n.d0.c.a<j.a.h.b<j.a.h.a>> {
        public final /* synthetic */ ImageEditorActivity a;

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

        public i0(ImageEditorActivity imageEditorActivity) {
        }

        public static final void c(ImageEditorActivity imageEditorActivity, j.a.h.a aVar) {
        }

        public static /* synthetic */ void d(ImageEditorActivity imageEditorActivity, j.a.h.a aVar) {
        }

        public final j.a.h.b<j.a.h.a> b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ j.a.h.b<j.a.h.a> invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i1 extends n.d0.d.o implements n.d0.c.a<k.i.h.b.b.a.q.f> {
        public static final i1 a = null;

        public final k.i.h.b.b.a.q.f b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.b.a.q.f invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.ImageEditorActivity$gotoMakeImageForModify$1", f = "ImageEditorActivity.kt", l = {1163}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ ImageEditorActivity c;
        public final /* synthetic */ String d;
        public final /* synthetic */ long e;
        public final /* synthetic */ MakeImageConfig f;

        public j(ImageEditorActivity imageEditorActivity, String str, long j2, MakeImageConfig makeImageConfig, n.a0.d<? super j> dVar) {
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
    public static final class j0 extends n.d0.d.o implements n.d0.c.a<j.a.h.b<j.a.h.a>> {
        public final /* synthetic */ ImageEditorActivity a;

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

        public j0(ImageEditorActivity imageEditorActivity) {
        }

        public static final void c(ImageEditorActivity imageEditorActivity, j.a.h.a aVar) {
        }

        public static /* synthetic */ void d(ImageEditorActivity imageEditorActivity, j.a.h.a aVar) {
        }

        public final j.a.h.b<j.a.h.a> b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ j.a.h.b<j.a.h.a> invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j1 extends n.d0.d.o implements n.d0.c.l<k.i.h.b.b.a.q.i.i, n.u> {
        public final /* synthetic */ ImageEditorActivity a;
        public final /* synthetic */ k.i.h.b.b.a.k.b b;

        public j1(ImageEditorActivity imageEditorActivity, k.i.h.b.b.a.k.b bVar) {
        }

        public final void b(k.i.h.b.b.a.q.i.i iVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.b.a.q.i.i iVar) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.ImageEditorActivity$initData$1", f = "ImageEditorActivity.kt", l = {517, 526, 535, 545, 546, 549}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class k extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ ImageEditorActivity c;

        public k(ImageEditorActivity imageEditorActivity, n.a0.d<? super k> dVar) {
        }

        public static final void g(ImageEditorActivity imageEditorActivity, DialogInterface dialogInterface) {
        }

        public static /* synthetic */ void h(ImageEditorActivity imageEditorActivity, DialogInterface dialogInterface) {
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
        public static final k0 a = null;

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class k1 extends n.d0.d.o implements n.d0.c.l<k.i.h.b.b.a.q.i.i, n.u> {
        public final /* synthetic */ ImageEditorActivity a;
        public final /* synthetic */ k.i.h.b.b.a.k.b b;

        public k1(ImageEditorActivity imageEditorActivity, k.i.h.b.b.a.k.b bVar) {
        }

        public final void b(k.i.h.b.b.a.q.i.i iVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.b.a.q.i.i iVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class l extends n.d0.d.l implements n.d0.c.p<String, WxaData, n.u> {
        public l(Object obj) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ n.u invoke(String str, WxaData wxaData) {
        }

        public final void m(String str, WxaData wxaData) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class l0 extends n.d0.d.o implements n.d0.c.a<n.u> {
        public static final l0 a = null;

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class m extends n.d0.d.l implements n.d0.c.p<String, PoiData, n.u> {
        public m(Object obj) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ n.u invoke(String str, PoiData poiData) {
        }

        public final void m(String str, PoiData poiData) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class m0 extends n.d0.d.o implements n.d0.c.l<String, n.u> {
        public final /* synthetic */ k.i.h.b.b.a.k.b a;
        public final /* synthetic */ PoiData b;
        public final /* synthetic */ ImageEditorActivity c;

        public m0(k.i.h.b.b.a.k.b bVar, PoiData poiData, ImageEditorActivity imageEditorActivity) {
        }

        public final void b(String str) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class n extends n.d0.d.o implements n.d0.c.l<Integer, n.u> {
        public final /* synthetic */ ImageEditorActivity a;

        public n(ImageEditorActivity imageEditorActivity) {
        }

        public final void b(int i2) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(Integer num) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class n0 extends n.d0.d.o implements n.d0.c.p<Integer, Intent, n.u> {
        public final /* synthetic */ ImageEditorActivity a;
        public final /* synthetic */ k.i.h.b.b.a.k.b b;

        public n0(ImageEditorActivity imageEditorActivity, k.i.h.b.b.a.k.b bVar) {
        }

        public final void b(int i2, Intent intent) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ n.u invoke(Integer num, Intent intent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class o extends n.d0.d.o implements n.d0.c.q<String, String, String, n.u> {
        public final /* synthetic */ ImageEditorActivity a;

        public o(ImageEditorActivity imageEditorActivity) {
        }

        @Override // n.d0.c.q
        public /* bridge */ /* synthetic */ n.u a(String str, String str2, String str3) {
        }

        public final void b(String str, String str2, String str3) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.ImageEditorActivity$onClickSwitchTheme$1", f = "ImageEditorActivity.kt", l = {1914}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class o0 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ ImageEditorActivity b;

        public o0(ImageEditorActivity imageEditorActivity, n.a0.d<? super o0> dVar) {
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
    public /* synthetic */ class p extends n.d0.d.l implements n.d0.c.l<k.i.h.b.b.a.k.c[], n.u> {
        public p(Object obj) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.b.a.k.c[] cVarArr) {
        }

        public final void m(k.i.h.b.b.a.k.c[] cVarArr) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.ImageEditorActivity$onNextMenu$1", f = "ImageEditorActivity.kt", l = {1306}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class p0 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ ImageEditorActivity b;

        public p0(ImageEditorActivity imageEditorActivity, n.a0.d<? super p0> dVar) {
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
    public /* synthetic */ class q extends n.d0.d.l implements n.d0.c.t<Boolean, Double, Double, Double, Double, k.i.h.b.b.a.k.c[], n.u> {
        public q(Object obj) {
        }

        public final void m(Boolean bool, Double d, Double d2, Double d3, Double d4, k.i.h.b.b.a.k.c[] cVarArr) {
        }

        @Override // n.d0.c.t
        public /* bridge */ /* synthetic */ n.u n(Boolean bool, Double d, Double d2, Double d3, Double d4, k.i.h.b.b.a.k.c[] cVarArr) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.ImageEditorActivity$onSaveMenu$1", f = "ImageEditorActivity.kt", l = {1275, 1278}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class q0 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ ImageEditorActivity b;

        public q0(ImageEditorActivity imageEditorActivity, n.a0.d<? super q0> dVar) {
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
    public /* synthetic */ class r extends n.d0.d.l implements n.d0.c.q<Integer, Integer, String, n.u> {
        public r(Object obj) {
        }

        @Override // n.d0.c.q
        public /* bridge */ /* synthetic */ n.u a(Integer num, Integer num2, String str) {
        }

        public final void m(int i2, int i3, String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class r0 extends n.d0.d.o implements n.d0.c.l<ShareImageInfo, n.u> {
        public final /* synthetic */ ob a;
        public final /* synthetic */ MakeImageConfig b;
        public final /* synthetic */ k.i.h.b.b.a.k.b c;

        public r0(ob obVar, MakeImageConfig makeImageConfig, k.i.h.b.b.a.k.b bVar) {
        }

        public final void b(ShareImageInfo shareImageInfo) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(ShareImageInfo shareImageInfo) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class s extends n.d0.d.o implements n.d0.c.l<Boolean, n.u> {
        public final /* synthetic */ ImageEditorActivity a;

        public s(ImageEditorActivity imageEditorActivity) {
        }

        public final void b(boolean z) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(Boolean bool) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.ImageEditorActivity$postCropImage$1", f = "ImageEditorActivity.kt", l = {XWebFeature.INTERFACE_EXTEND_PLUGIN_NATIVE_VIEW, 1024, 1063, WXWebReporter.WXWEB_IDKEY_FR_WORD_ID}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class s0 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ ImageEditorActivity f;
        public final /* synthetic */ k.i.h.b.z.n.b.a g;
        public final /* synthetic */ k.i.h.b.b.a.k.b h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f1449i;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.d0.d.o implements n.d0.c.l<ShareImageInfo, n.u> {
            public final /* synthetic */ CropImageItem a;
            public final /* synthetic */ k.i.h.b.z.n.b.a b;

            public a(CropImageItem cropImageItem, k.i.h.b.z.n.b.a aVar) {
            }

            public final void b(ShareImageInfo shareImageInfo) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ n.u invoke(ShareImageInfo shareImageInfo) {
            }
        }

        public s0(ImageEditorActivity imageEditorActivity, k.i.h.b.z.n.b.a aVar, k.i.h.b.b.a.k.b bVar, int i2, n.a0.d<? super s0> dVar) {
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
    public static final class t extends n.d0.d.o implements n.d0.c.u<Boolean, Boolean, Integer, Integer, Integer, String, String, n.u> {
        public final /* synthetic */ ImageEditorActivity a;

        public t(ImageEditorActivity imageEditorActivity) {
        }

        public final void b(Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, String str, String str2) {
        }

        @Override // n.d0.c.u
        public /* bridge */ /* synthetic */ n.u x(Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, String str, String str2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class t0 extends n.d0.d.o implements n.d0.c.a<k.i.h.b.b.a.o.i> {
        public final /* synthetic */ ImageEditorActivity a;

        public t0(ImageEditorActivity imageEditorActivity) {
        }

        public final k.i.h.b.b.a.o.i b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.b.a.o.i invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class u extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ ImageEditorActivity a;

        public u(ImageEditorActivity imageEditorActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.ImageEditorActivity$requestDataFromGallery$1", f = "ImageEditorActivity.kt", l = {1730}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class u0 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ ImageEditorActivity c;

        public u0(ImageEditorActivity imageEditorActivity, n.a0.d<? super u0> dVar) {
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
        public final /* synthetic */ ImageEditorActivity a;

        public v(ImageEditorActivity imageEditorActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.ImageEditorActivity$requestDataFromMakePic$1", f = "ImageEditorActivity.kt", l = {1758}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class v0 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ ImageEditorActivity c;
        public final /* synthetic */ long d;

        public v0(ImageEditorActivity imageEditorActivity, long j2, n.a0.d<? super v0> dVar) {
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
    public static final class w extends n.d0.d.o implements n.d0.c.l<k.i.h.b.b.a.k.c, n.u> {
        public final /* synthetic */ ImageEditorActivity a;

        public w(ImageEditorActivity imageEditorActivity) {
        }

        public final void b(k.i.h.b.b.a.k.c cVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.b.a.k.c cVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class w0 implements k.i.h.b.d.l0.a, n.d0.d.i {
        public final /* synthetic */ n.d0.c.p a;

        public w0(n.d0.c.p pVar) {
        }

        @Override // k.i.h.b.d.l0.a
        public final /* synthetic */ void a(int i2, Intent intent) {
        }

        @Override // n.d0.d.i
        public final n.b<?> b() {
        }

        public final boolean equals(Object obj) {
        }

        public final int hashCode() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class x extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ ImageEditorActivity a;

        public x(ImageEditorActivity imageEditorActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.ImageEditorActivity$saveMaterialAndFinish$1", f = "ImageEditorActivity.kt", l = {1375, 1378}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class x0 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ ImageEditorActivity b;

        public x0(ImageEditorActivity imageEditorActivity, n.a0.d<? super x0> dVar) {
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
        public final /* synthetic */ ImageEditorActivity a;

        public y(ImageEditorActivity imageEditorActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class y0 extends n.d0.d.o implements n.d0.c.a<k.i.h.b.k.s.x> {
        public final /* synthetic */ ImageEditorActivity a;

        public y0(ImageEditorActivity imageEditorActivity) {
        }

        public final k.i.h.b.k.s.x b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.k.s.x invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class z implements d.a {
        public final /* synthetic */ ImageEditorActivity a;

        public z(ImageEditorActivity imageEditorActivity) {
        }

        @Override // k.i.h.b.d.b1.f.d.a
        public void a(String str) {
        }

        @Override // k.i.h.b.d.b1.f.d.a
        public void b() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.ImageEditorActivity$showCloudSavedDone$1", f = "ImageEditorActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class z0 extends n.a0.k.a.l implements n.d0.c.p<o.a.t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ ImageEditorActivity b;

        public z0(ImageEditorActivity imageEditorActivity, n.a0.d<? super z0> dVar) {
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

    public static final void C2(ImageEditorActivity imageEditorActivity, ValueAnimator valueAnimator) {
    }

    public static /* synthetic */ void E3(ImageEditorActivity imageEditorActivity, AppBarLayout appBarLayout, int i2) {
    }

    public static /* synthetic */ Object F2(ImageEditorActivity imageEditorActivity, boolean z2, n.a0.d dVar, int i2, Object obj) {
    }

    public static /* synthetic */ void F3(ImageEditorActivity imageEditorActivity, View view) {
    }

    public static final /* synthetic */ boolean G1(ImageEditorActivity imageEditorActivity) {
    }

    public static /* synthetic */ void G3(ImageEditorActivity imageEditorActivity, MenuItem menuItem, int i2) {
    }

    public static final /* synthetic */ Object H1(ImageEditorActivity imageEditorActivity, boolean z2, n.a0.d dVar) {
    }

    public static /* synthetic */ void H3(ImageEditorActivity imageEditorActivity, View view, boolean z2) {
    }

    public static final /* synthetic */ void I1(ImageEditorActivity imageEditorActivity) {
    }

    public static /* synthetic */ void I3(k.i.h.b.d.b1.d.d dVar) {
    }

    public static final /* synthetic */ void J1(ImageEditorActivity imageEditorActivity) {
    }

    public static /* synthetic */ void J3(ImageEditorActivity imageEditorActivity, k.i.h.b.b.a.k.b bVar, int i2, Intent intent) {
    }

    public static final /* synthetic */ void K1(ImageEditorActivity imageEditorActivity) {
    }

    public static /* synthetic */ void K3(ImageEditorActivity imageEditorActivity, View view, boolean z2) {
    }

    public static final /* synthetic */ void L1(ImageEditorActivity imageEditorActivity, String str, String str2, String str3) {
    }

    public static /* synthetic */ void L3(ImageEditorActivity imageEditorActivity, ValueAnimator valueAnimator) {
    }

    public static final /* synthetic */ void M1(ImageEditorActivity imageEditorActivity, String str, WxaData wxaData) {
    }

    public static /* synthetic */ void M3(ImageEditorActivity imageEditorActivity, View view) {
    }

    public static final /* synthetic */ void N1(ImageEditorActivity imageEditorActivity, String str, PoiData poiData) {
    }

    public static /* synthetic */ void N3(ImageEditorActivity imageEditorActivity, View view) {
    }

    public static final /* synthetic */ k.i.h.b.k.m.a O1(ImageEditorActivity imageEditorActivity) {
    }

    public static /* synthetic */ void O3(ImageEditorActivity imageEditorActivity, View view) {
    }

    public static final /* synthetic */ k.i.h.b.b.a.k.d P1(ImageEditorActivity imageEditorActivity) {
    }

    public static /* synthetic */ void P3(ImageEditorActivity imageEditorActivity, View view) {
    }

    public static final /* synthetic */ k.i.h.b.b.a.i.a Q1(ImageEditorActivity imageEditorActivity) {
    }

    public static /* synthetic */ void Q3(ImageEditorActivity imageEditorActivity, int i2) {
    }

    public static final /* synthetic */ k.i.h.b.b.a.i.b R1(ImageEditorActivity imageEditorActivity) {
    }

    public static /* synthetic */ void R3(ImageEditorActivity imageEditorActivity, View view) {
    }

    public static final /* synthetic */ k.i.h.b.k.r.a S1(ImageEditorActivity imageEditorActivity) {
    }

    public static /* synthetic */ void S3(ImageEditorActivity imageEditorActivity, k.i.h.b.d.b1.d.d dVar) {
    }

    public static final /* synthetic */ d2 T1(ImageEditorActivity imageEditorActivity) {
    }

    public static /* synthetic */ void T3(ImageEditorActivity imageEditorActivity, k.i.h.b.z.n.b.a aVar) {
    }

    public static final /* synthetic */ k.i.h.b.b.a.q.i.d U1(ImageEditorActivity imageEditorActivity) {
    }

    public static /* synthetic */ void U3(ImageEditorActivity imageEditorActivity, MenuItem menuItem, int i2) {
    }

    public static final /* synthetic */ int V1(ImageEditorActivity imageEditorActivity) {
    }

    public static final /* synthetic */ j.a.h.c W1(ImageEditorActivity imageEditorActivity) {
    }

    public static final /* synthetic */ long X1(ImageEditorActivity imageEditorActivity) {
    }

    public static final /* synthetic */ String Y1(ImageEditorActivity imageEditorActivity) {
    }

    public static final void Y3(ImageEditorActivity imageEditorActivity, k.i.h.b.b.a.k.b bVar, int i2, Intent intent) {
    }

    public static final /* synthetic */ j.a.h.c Z1(ImageEditorActivity imageEditorActivity) {
    }

    public static final /* synthetic */ j.a.h.c a2(ImageEditorActivity imageEditorActivity) {
    }

    public static final /* synthetic */ k.i.h.b.k.o.i2.h b2(ImageEditorActivity imageEditorActivity) {
    }

    public static final /* synthetic */ k.i.h.b.b.a.o.i c2(ImageEditorActivity imageEditorActivity) {
    }

    public static final /* synthetic */ k.i.h.b.k.s.x d2(ImageEditorActivity imageEditorActivity) {
    }

    public static final /* synthetic */ k.i.h.b.b.a.k.b e2(ImageEditorActivity imageEditorActivity, Bundle bundle) {
    }

    public static final /* synthetic */ k.i.h.b.b.a.q.f f2(ImageEditorActivity imageEditorActivity) {
    }

    public static final /* synthetic */ void g2(ImageEditorActivity imageEditorActivity) {
    }

    public static final /* synthetic */ void h2(ImageEditorActivity imageEditorActivity, k.i.h.b.b.a.k.c[] cVarArr) {
    }

    public static final void h3(ImageEditorActivity imageEditorActivity, View view) {
    }

    public static final /* synthetic */ Object i2(ImageEditorActivity imageEditorActivity, long j2, n.a0.d dVar) {
    }

    public static final void i3(ImageEditorActivity imageEditorActivity, View view) {
    }

    public static final /* synthetic */ void j2(ImageEditorActivity imageEditorActivity) {
    }

    public static final void j3(ImageEditorActivity imageEditorActivity, View view) {
    }

    public static final /* synthetic */ f2 k2(ImageEditorActivity imageEditorActivity) {
    }

    public static final void k3(ImageEditorActivity imageEditorActivity, View view) {
    }

    public static final /* synthetic */ void l2(ImageEditorActivity imageEditorActivity, k.i.h.b.b.a.k.b bVar, k.i.h.b.b.a.q.i.i iVar) {
    }

    public static final void l3(ImageEditorActivity imageEditorActivity, View view) {
    }

    public static final void l4(ImageEditorActivity imageEditorActivity, k.i.h.b.d.b1.d.d dVar) {
    }

    public static final /* synthetic */ void m2(ImageEditorActivity imageEditorActivity, List list) {
    }

    public static final void m4(ImageEditorActivity imageEditorActivity, MenuItem menuItem, int i2) {
    }

    public static final /* synthetic */ void n2(ImageEditorActivity imageEditorActivity, boolean z2) {
    }

    public static final void n3(ImageEditorActivity imageEditorActivity, AppBarLayout appBarLayout, int i2) {
    }

    public static final /* synthetic */ void o2(ImageEditorActivity imageEditorActivity, long j2) {
    }

    public static final void o3(ImageEditorActivity imageEditorActivity, int i2) {
    }

    public static final /* synthetic */ void p2(ImageEditorActivity imageEditorActivity, String str) {
    }

    public static final /* synthetic */ void q2(ImageEditorActivity imageEditorActivity, boolean z2) {
    }

    public static final void q3(ImageEditorActivity imageEditorActivity, View view, boolean z2) {
    }

    public static final /* synthetic */ f2 r2(ImageEditorActivity imageEditorActivity) {
    }

    public static final void r4(k.i.h.b.d.b1.d.d dVar) {
    }

    public static final /* synthetic */ void s2(ImageEditorActivity imageEditorActivity, Boolean bool, Double d2, Double d3, Double d4, Double d5, k.i.h.b.b.a.k.c[] cVarArr) {
    }

    public static final void s4(ImageEditorActivity imageEditorActivity, MenuItem menuItem, int i2) {
    }

    public static final /* synthetic */ void t2(ImageEditorActivity imageEditorActivity) {
    }

    public static final void t3(ImageEditorActivity imageEditorActivity, View view) {
    }

    public static final /* synthetic */ void u2(ImageEditorActivity imageEditorActivity, int i2, int i3, String str) {
    }

    public static final /* synthetic */ f2 v2(ImageEditorActivity imageEditorActivity) {
    }

    public static final /* synthetic */ void w2(ImageEditorActivity imageEditorActivity) {
    }

    public static final /* synthetic */ void x2(ImageEditorActivity imageEditorActivity) {
    }

    public static final void x3(ImageEditorActivity imageEditorActivity, View view, boolean z2) {
    }

    public static final /* synthetic */ void y2(ImageEditorActivity imageEditorActivity, boolean z2) {
    }

    public static final /* synthetic */ void z2(ImageEditorActivity imageEditorActivity, boolean z2) {
    }

    @Override // k.i.h.b.k.j.a
    public void A0(k.i.h.b.b.a.k.b bVar) {
    }

    public final f2 A2(List<k.i.h.b.b.a.k.b> list) {
    }

    public final void A3() {
    }

    public final void A4(boolean z2) {
    }

    public final void B2(int i2, int i3) {
    }

    public final f2 B3() {
    }

    public final void B4() {
    }

    public final f2 C3() {
    }

    public final boolean D2() {
    }

    public final f2 D3(String str) {
    }

    public final Object E2(boolean z2, n.a0.d<? super Boolean> dVar) {
    }

    @Override // k.i.h.b.k.j.a
    public void G0(k.i.h.b.b.a.k.b bVar) {
    }

    public final void G2() {
    }

    @Override // k.i.h.b.k.j.a
    public void H(k.i.h.b.b.a.k.b bVar, boolean z2) {
    }

    public final void H2() {
    }

    public final void I2() {
    }

    public final void J2() {
    }

    public final void K2() {
    }

    @Override // k.i.h.b.k.j.a
    public void L0(int i2) {
    }

    public final void L2(String str, String str2, String str3) {
    }

    public final void M2(String str, WxaData wxaData) {
    }

    public final void N2(String str, PoiData poiData) {
    }

    public final AppBarLayout.Behavior O2() {
    }

    public final k.i.h.b.k.m.a P2() {
    }

    public final k.i.h.b.b.a.i.a Q2() {
    }

    public final k.i.h.b.b.a.i.b R2() {
    }

    @Override // k.i.h.b.k.j.a
    public void S() {
    }

    public final k.i.h.b.k.r.a S2() {
    }

    public final d2 T2() {
    }

    @Override // k.i.h.b.k.j.a
    public void U(int i2, int i3) {
    }

    public final int U2() {
    }

    public final GestureDetector V2() {
    }

    public final Object V3(long j2, n.a0.d<? super n.u> dVar) {
    }

    public final j.a.h.b<j.a.h.a> W2() {
    }

    public final void W3() {
    }

    public final j.a.h.b<j.a.h.a> X2() {
    }

    public final void X3(int i2) {
    }

    public final k.i.h.b.b.a.o.i Y2() {
    }

    public final k.i.h.b.k.s.x Z2() {
    }

    public final void Z3(k.i.h.b.z.n.b.a aVar) {
    }

    public final k.i.h.b.b.a.k.b a3(Bundle bundle) {
    }

    public final void a4(ArrayList<k.i.h.b.b.a.k.b> arrayList) {
    }

    public final k.i.h.b.b.a.q.f b3() {
    }

    public final f2 b4() {
    }

    public final void c3() {
    }

    public final f2 c4() {
    }

    public final f2 d3(String str, MakeImageConfig makeImageConfig, long j2) {
    }

    public final void d4(k.i.h.b.b.a.k.b bVar, k.i.h.b.b.a.q.i.i iVar) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
    }

    public final void e3(int i2) {
    }

    public final f2 e4(k.i.h.b.z.n.b.a aVar, k.i.h.b.b.a.k.b bVar, int i2) {
    }

    public final f2 f3() {
    }

    public final void f4(List<k.i.h.b.b.a.k.b> list) {
    }

    public final void g3() {
    }

    public final void g4() {
    }

    public final f2 h4() {
    }

    public final f2 i4(long j2) {
    }

    public final f2 j4() {
    }

    public final void k4() {
    }

    public final void m3() {
    }

    @Override // k.i.h.b.k.j.a
    public void n(k.i.h.b.b.a.k.b bVar, boolean z2) {
    }

    public final f2 n4() {
    }

    public final void o4(Boolean bool, Double d2, Double d3, Double d4, Double d5, k.i.h.b.b.a.k.c[] cVarArr) {
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

    @Override // k.i.h.b.d.b1.b, j.b.k.d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // k.i.h.b.d.b1.b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // k.i.h.b.k.j.a
    public void p(int i2) {
    }

    public final void p3() {
    }

    public final void p4() {
    }

    @Override // k.i.h.b.k.j.a
    public void q0(int i2, k.i.h.b.b.a.k.b bVar) {
    }

    public final void q4() {
    }

    @Override // k.i.h.b.k.j.a
    public void r0(int i2, k.i.h.b.b.a.k.b bVar) {
    }

    public final void r3(k.i.h.b.b.a.k.c[] cVarArr) {
    }

    public final void s3() {
    }

    public final void t4(int i2, int i3, String str) {
    }

    public final void u3() {
    }

    public final f2 u4() {
    }

    public final void v3() {
    }

    public final f2 v4(int i2) {
    }

    public final void w3() {
    }

    public final void w4(int i2) {
    }

    public final void x4() {
    }

    @Override // k.i.h.b.k.j.a
    public void y0(int i2, k.i.h.b.b.a.k.b bVar) {
    }

    public final void y3() {
    }

    public final void y4() {
    }

    public final void z3() {
    }

    public final void z4(boolean z2) {
    }
}
