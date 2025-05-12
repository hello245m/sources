package com.tencent.mp.feature.setting.ui;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.tpns.mqttchannel.core.common.config.MqttConfigImpl;
import com.tencent.xweb.util.WXWebReporter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k.i.d.b.d.a.d;
import k.i.h.b.h0.k.b.m;
import k.i.h.b.h0.l.g3;
import n.a0.k.a.l;
import n.d0.c.p;
import n.d0.d.b0;
import n.d0.d.o;
import n.u;
import o.a.b1;
import o.a.t0;
import q.c0;
import q.e0;
import q.h0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class SwitchAccountActivity extends g3 {

    /* renamed from: j, reason: collision with root package name */
    public m f1815j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap<Integer, Long> f1816k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList<ObjectAnimator> f1817l;

    /* renamed from: m, reason: collision with root package name */
    public b1<e0> f1818m;

    /* renamed from: n, reason: collision with root package name */
    public Map<Integer, View> f1819n;

    @n.a0.k.a.f(c = "com.tencent.mp.feature.setting.ui.SwitchAccountActivity$initializeDataAndView$1", f = "SwitchAccountActivity.kt", l = {WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends l implements p<t0, n.a0.d<? super u>, Object> {
        public int a;
        public final /* synthetic */ SwitchAccountActivity b;

        public a(SwitchAccountActivity switchAccountActivity, n.a0.d<? super a> dVar) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.setting.ui.SwitchAccountActivity$initializeView$3$1", f = "SwitchAccountActivity.kt", l = {WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends l implements p<t0, n.a0.d<? super u>, Object> {
        public int a;
        public final /* synthetic */ View b;
        public final /* synthetic */ SwitchAccountActivity c;
        public final /* synthetic */ AdapterView<?> d;
        public final /* synthetic */ int e;
        public final /* synthetic */ long f;

        public b(View view, SwitchAccountActivity switchAccountActivity, AdapterView<?> adapterView, int i2, long j2, n.a0.d<? super b> dVar) {
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
    public static final class c extends o implements p<Integer, Integer, u> {
        public final /* synthetic */ SwitchAccountActivity a;
        public final /* synthetic */ SpannableStringBuilder b;
        public final /* synthetic */ SpannableString c;

        public c(SwitchAccountActivity switchAccountActivity, SpannableStringBuilder spannableStringBuilder, SpannableString spannableString) {
        }

        public final void b(int i2, int i3) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ u invoke(Integer num, Integer num2) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.setting.ui.SwitchAccountActivity", f = "SwitchAccountActivity.kt", l = {WXWebReporter.KEY_SET_DATA_SUFFIX_INVOKE_METHOD_FAILED, WXWebReporter.WXXWEB_PRE_DOWN_ARM64_SUC, WXWebReporter.KEY_FREQ_NEW_WEB_FAILED}, m = "loadData")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends n.a0.k.a.d {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public final /* synthetic */ SwitchAccountActivity e;
        public int f;

        public d(SwitchAccountActivity switchAccountActivity, n.a0.d<? super d> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.setting.ui.SwitchAccountActivity$loadData$2$bizList$1", f = "SwitchAccountActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e extends l implements p<t0, n.a0.d<? super List<? extends h0>>, Object> {
        public int a;
        public final /* synthetic */ k.i.h.b.h0.k.a b;

        public e(k.i.h.b.h0.k.a aVar, n.a0.d<? super e> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super List<? extends h0>> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super List<h0>> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.setting.ui.SwitchAccountActivity$loadData$2$visitTime$1", f = "SwitchAccountActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends l implements p<t0, n.a0.d<? super Map<Integer, ? extends Long>>, Object> {
        public int a;
        public final /* synthetic */ k.i.h.b.h0.k.a b;

        public f(k.i.h.b.h0.k.a aVar, n.a0.d<? super f> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super Map<Integer, ? extends Long>> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super Map<Integer, Long>> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.setting.ui.SwitchAccountActivity", f = "SwitchAccountActivity.kt", l = {MqttConfigImpl.DEFAULT_KEEP_ALIVE_INTERVAL}, m = "loadSwitchAccountDataFromRemote")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g extends n.a0.k.a.d {
        public Object a;
        public /* synthetic */ Object b;
        public final /* synthetic */ SwitchAccountActivity c;
        public int d;

        public g(SwitchAccountActivity switchAccountActivity, n.a0.d<? super g> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.setting.ui.SwitchAccountActivity$loadSwitchAccountDataFromRemote$deferred$1", f = "SwitchAccountActivity.kt", l = {257}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h extends l implements p<t0, n.a0.d<? super e0>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ SwitchAccountActivity d;

        public h(boolean z, SwitchAccountActivity switchAccountActivity, n.a0.d<? super h> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super e0> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super e0> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.setting.ui.SwitchAccountActivity$onAuthFail$1", f = "SwitchAccountActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i extends l implements p<t0, n.a0.d<? super u>, Object> {
        public int a;
        public final /* synthetic */ SwitchAccountActivity b;
        public final /* synthetic */ String c;

        public i(SwitchAccountActivity switchAccountActivity, String str, n.a0.d<? super i> dVar) {
        }

        public static final void g(SwitchAccountActivity switchAccountActivity, DialogInterface dialogInterface, int i2) {
        }

        public static /* synthetic */ void h(SwitchAccountActivity switchAccountActivity, DialogInterface dialogInterface, int i2) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.setting.ui.SwitchAccountActivity", f = "SwitchAccountActivity.kt", l = {335, 338}, m = "onSwitchAccount")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j extends n.a0.k.a.d {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public long f;
        public /* synthetic */ Object g;
        public final /* synthetic */ SwitchAccountActivity h;

        /* renamed from: i, reason: collision with root package name */
        public int f1820i;

        public j(SwitchAccountActivity switchAccountActivity, n.a0.d<? super j> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class k extends o implements n.d0.c.a<u> {
        public final /* synthetic */ b0<c0> a;

        public k(b0<c0> b0Var) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public static final /* synthetic */ List c2(SwitchAccountActivity switchAccountActivity) {
    }

    public static final /* synthetic */ m d2(SwitchAccountActivity switchAccountActivity) {
    }

    public static final /* synthetic */ Object e2(SwitchAccountActivity switchAccountActivity, n.a0.d dVar) {
    }

    public static final /* synthetic */ Object f2(SwitchAccountActivity switchAccountActivity, boolean z, n.a0.d dVar) {
    }

    public static final /* synthetic */ Object g2(SwitchAccountActivity switchAccountActivity, AdapterView adapterView, View view, int i2, long j2, n.a0.d dVar) {
    }

    public static final /* synthetic */ void h2(SwitchAccountActivity switchAccountActivity, List list) {
    }

    public static final void m2(SwitchAccountActivity switchAccountActivity, m mVar) {
    }

    public static final void n2(SwitchAccountActivity switchAccountActivity, AdapterView adapterView, View view, int i2, long j2) {
    }

    public static /* synthetic */ void o2(SwitchAccountActivity switchAccountActivity, AdapterView adapterView, View view, int i2, long j2, b0 b0Var, k.i.h.b.d.w0.c.i iVar) {
    }

    public static /* synthetic */ void p2(SwitchAccountActivity switchAccountActivity, AdapterView adapterView, View view, int i2, long j2) {
    }

    public static /* synthetic */ void q2(SwitchAccountActivity switchAccountActivity, m mVar) {
    }

    public static final void w2(SwitchAccountActivity switchAccountActivity, AdapterView adapterView, View view, int i2, long j2, b0 b0Var, k.i.h.b.d.w0.c.i iVar) {
    }

    @Override // k.i.h.b.h0.l.g3
    public void I1(h0 h0Var, q.f fVar) {
    }

    @Override // k.i.h.b.h0.l.g3
    public void J1(h0 h0Var, q.f fVar) {
    }

    @Override // k.i.h.b.h0.l.g3
    public void K1(h0 h0Var, q.f fVar) {
    }

    @Override // k.i.h.b.h0.l.g3
    public void R1(d.b<Object> bVar, int i2, h0 h0Var) {
    }

    @Override // k.i.h.b.h0.l.g3
    public int S1(int i2, h0 h0Var) {
    }

    @Override // k.i.h.b.d.b1.a
    public int W0() {
    }

    public View b2(int i2) {
    }

    @Override // k.i.h.b.d.b1.a, android.app.Activity
    public void finish() {
    }

    public final List<h0> i2() {
    }

    public final void j2() {
    }

    public final void k2() {
    }

    public final void l2() {
    }

    @Override // k.i.h.b.d.b1.b, k.i.h.b.d.b1.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, j.g.j.h, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // k.i.h.b.d.b1.b, j.b.k.d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    public final Object r2(n.a0.d<? super u> dVar) {
    }

    public final Object s2(boolean z, n.a0.d<? super e0> dVar) {
    }

    public final void t2(String str) {
    }

    public final void u2() {
    }

    public final Object v2(AdapterView<?> adapterView, View view, int i2, long j2, n.a0.d<? super u> dVar) {
    }

    public final void x2(List<h0> list) {
    }
}
