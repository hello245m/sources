package com.tencent.mp.feature.article.edit.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import com.google.gson.reflect.TypeToken;
import com.tencent.mp.feature.article.base.domain.SearchWeAppResponse;
import com.tencent.mp.feature.data.biz.account.domain.article.WxaData;
import com.tencent.xweb.util.WXWebReporter;
import n.a0.k.a.l;
import n.d0.c.p;
import n.d0.d.o;
import n.u;
import o.a.f2;
import o.a.t0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class EditWxaActivity extends k.i.h.b.d.b1.b {
    public final n.d h;

    /* renamed from: i, reason: collision with root package name */
    public final n.d f1133i;

    /* renamed from: j, reason: collision with root package name */
    public final n.d f1134j;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends o implements n.d0.c.a<k.i.h.b.b.b.m.f> {
        public final /* synthetic */ EditWxaActivity a;

        public a(EditWxaActivity editWxaActivity) {
        }

        public final k.i.h.b.b.b.m.f b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.b.b.m.f invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.EditWxaActivity", f = "EditWxaActivity.kt", l = {WXWebReporter.ID903KeyDef.DANGERTIME_NOT_UPDATE, 154}, m = "checkPath")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends n.a0.k.a.d {
        public /* synthetic */ Object a;
        public final /* synthetic */ EditWxaActivity b;
        public int c;

        public b(EditWxaActivity editWxaActivity, n.a0.d<? super b> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.EditWxaActivity$finishWithResult$1", f = "EditWxaActivity.kt", l = {105}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends l implements p<t0, n.a0.d<? super u>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ EditWxaActivity c;

        public c(EditWxaActivity editWxaActivity, n.a0.d<? super c> dVar) {
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
    public static final class d extends o implements n.d0.c.a<u> {
        public final /* synthetic */ EditWxaActivity a;

        public d(EditWxaActivity editWxaActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e implements TextWatcher {
        public final /* synthetic */ EditWxaActivity a;

        public e(EditWxaActivity editWxaActivity) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.EditWxaActivity$requestWeAppInfo$1", f = "EditWxaActivity.kt", l = {WXWebReporter.KEY_SET_DATA_SUFFIX_LOCK_FILE_FAILED_2}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends l implements p<t0, n.a0.d<? super u>, Object> {
        public int a;
        public final /* synthetic */ EditWxaActivity b;
        public final /* synthetic */ String c;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends TypeToken<SearchWeAppResponse> {
        }

        public f(EditWxaActivity editWxaActivity, String str, n.a0.d<? super f> dVar) {
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
    public static final class g extends o implements n.d0.c.a<Integer> {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public g(Activity activity, String str, Object obj) {
        }

        @Override // n.d0.c.a
        public final Integer invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h extends o implements n.d0.c.a<WxaData> {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ String b;

        public h(Activity activity, String str) {
        }

        @Override // n.d0.c.a
        public final WxaData invoke() {
        }
    }

    public static final /* synthetic */ String G1(EditWxaActivity editWxaActivity, String str) {
    }

    public static final /* synthetic */ Object H1(EditWxaActivity editWxaActivity, WxaData wxaData, n.a0.d dVar) {
    }

    public static final /* synthetic */ k.i.h.b.b.b.m.f I1(EditWxaActivity editWxaActivity) {
    }

    public static final /* synthetic */ WxaData J1(EditWxaActivity editWxaActivity) {
    }

    public static final /* synthetic */ int K1(EditWxaActivity editWxaActivity) {
    }

    public static final /* synthetic */ String L1(EditWxaActivity editWxaActivity, String str) {
    }

    public static final /* synthetic */ void M1(EditWxaActivity editWxaActivity, String str) {
    }

    public static final void W1(EditWxaActivity editWxaActivity, View view) {
    }

    public static final boolean Y1(View view, MotionEvent motionEvent) {
    }

    public static final void Z1(EditWxaActivity editWxaActivity, View view) {
    }

    public static /* synthetic */ void a2(EditWxaActivity editWxaActivity, View view) {
    }

    public static /* synthetic */ void b2(EditWxaActivity editWxaActivity, View view) {
    }

    public static /* synthetic */ boolean c2(View view, MotionEvent motionEvent) {
    }

    public final String N1(String str) {
    }

    public final Object O1(WxaData wxaData, n.a0.d<? super Boolean> dVar) {
    }

    public final f2 P1() {
    }

    public final k.i.h.b.b.b.m.f Q1() {
    }

    public final WxaData R1() {
    }

    public final int S1() {
    }

    public final String T1(String str) {
    }

    public final void U1(WxaData wxaData) {
    }

    public final void V1() {
    }

    @Override // k.i.h.b.d.b1.a
    public j.z.a X0() {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void X1() {
    }

    public final void d2(String str) {
    }

    public final f2 e2(String str) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // k.i.h.b.d.b1.b, k.i.h.b.d.b1.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, j.g.j.h, android.app.Activity
    public void onCreate(Bundle bundle) {
    }
}
