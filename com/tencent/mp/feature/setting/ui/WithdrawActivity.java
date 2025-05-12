package com.tencent.mp.feature.setting.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import com.tencent.mp.feature.jsbridge.jsapi.NavigationBarConfig;
import com.tencent.mp.feature.jsbridge.jsapi.NavigationBarConfigItem;
import com.tencent.mp.feature.webview.ui.WebViewActivity;
import com.tencent.xweb.JsPromptResult;
import com.tencent.xweb.JsResult;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import com.tencent.xweb.util.WXWebReporter;
import java.util.Map;
import k.i.h.b.d.b1.d.k;
import n.a0.k.a.l;
import n.d0.c.p;
import n.d0.d.o;
import n.u;
import o.a.f2;
import o.a.t0;
import q.a2;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class WithdrawActivity extends WebViewActivity {

    /* renamed from: n, reason: collision with root package name */
    public final n.d f1823n;

    /* renamed from: o, reason: collision with root package name */
    public k f1824o;

    /* renamed from: p, reason: collision with root package name */
    public Map<Integer, View> f1825p;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class a extends WebChromeClient {
        public a(WithdrawActivity withdrawActivity) {
        }

        public static /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
        }

        public static /* synthetic */ void b(JsResult jsResult, DialogInterface dialogInterface, int i2) {
        }

        public static /* synthetic */ void c(JsPromptResult jsPromptResult, DialogInterface dialogInterface, int i2) {
        }

        public static /* synthetic */ void d(JsPromptResult jsPromptResult, EditText editText, DialogInterface dialogInterface, int i2) {
        }

        public static /* synthetic */ void e(JsResult jsResult, DialogInterface dialogInterface, int i2) {
        }

        public static final void f(DialogInterface dialogInterface, int i2) {
        }

        public static final void g(JsResult jsResult, DialogInterface dialogInterface, int i2) {
        }

        public static final void h(JsResult jsResult, DialogInterface dialogInterface, int i2) {
        }

        public static final void i(JsPromptResult jsPromptResult, EditText editText, DialogInterface dialogInterface, int i2) {
        }

        public static final void j(JsPromptResult jsPromptResult, DialogInterface dialogInterface, int i2) {
        }

        @Override // com.tencent.xweb.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        }

        @Override // com.tencent.xweb.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        }

        @Override // com.tencent.xweb.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class b extends WebViewClient {
        public final /* synthetic */ WithdrawActivity a;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.setting.ui.WithdrawActivity$WithdrawWebViewClient$onReceivedError$1", f = "WithdrawActivity.kt", l = {WXWebReporter.WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED_TEST_SYS_SUC}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends l implements p<t0, n.a0.d<? super u>, Object> {
            public int a;
            public final /* synthetic */ WithdrawActivity b;

            public a(WithdrawActivity withdrawActivity, n.a0.d<? super a> dVar) {
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

        public b(WithdrawActivity withdrawActivity) {
        }

        @Override // com.tencent.xweb.WebViewClient
        public void onPageFinished(WebView webView, String str) {
        }

        @Override // com.tencent.xweb.WebViewClient
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends o implements n.d0.c.a<k.i.h.b.p.e.e> {
        public final /* synthetic */ WithdrawActivity a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public /* synthetic */ class a extends n.d0.d.l implements n.d0.c.l<NavigationBarConfig, u> {
            public a(Object obj) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ u invoke(NavigationBarConfig navigationBarConfig) {
            }

            public final void m(NavigationBarConfig navigationBarConfig) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public /* synthetic */ class b extends n.d0.d.l implements n.d0.c.a<u> {
            public b(Object obj) {
            }

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ u invoke() {
            }

            public final void m() {
            }
        }

        public c(WithdrawActivity withdrawActivity) {
        }

        public final k.i.h.b.p.e.e b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.p.e.e invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends o implements n.d0.c.a<u> {
        public final /* synthetic */ WithdrawActivity a;

        public d(WithdrawActivity withdrawActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.setting.ui.WithdrawActivity$loadUrl$1", f = "WithdrawActivity.kt", l = {95, 112}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e extends l implements p<t0, n.a0.d<? super u>, Object> {
        public int a;
        public final /* synthetic */ WithdrawActivity b;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.setting.ui.WithdrawActivity$loadUrl$1$data$1", f = "WithdrawActivity.kt", l = {318}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends l implements p<t0, n.a0.d<? super k.i.h.b.d.w0.c.i<a2>>, Object> {
            public int a;
            public /* synthetic */ Object b;

            public a(n.a0.d<? super a> dVar) {
            }

            @Override // n.a0.k.a.a
            public final n.a0.d<u> create(Object obj, n.a0.d<?> dVar) {
            }

            @Override // n.d0.c.p
            public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super k.i.h.b.d.w0.c.i<a2>> dVar) {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(t0 t0Var, n.a0.d<? super k.i.h.b.d.w0.c.i<a2>> dVar) {
            }

            @Override // n.a0.k.a.a
            public final Object invokeSuspend(Object obj) {
            }
        }

        public e(WithdrawActivity withdrawActivity, n.a0.d<? super e> dVar) {
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
    public static final class f extends o implements n.d0.c.a<u> {
        public final /* synthetic */ NavigationBarConfigItem a;
        public final /* synthetic */ WithdrawActivity b;

        public f(NavigationBarConfigItem navigationBarConfigItem, WithdrawActivity withdrawActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g extends o implements n.d0.c.a<u> {
        public final /* synthetic */ NavigationBarConfigItem a;
        public final /* synthetic */ WithdrawActivity b;

        public g(NavigationBarConfigItem navigationBarConfigItem, WithdrawActivity withdrawActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h extends o implements n.d0.c.a<u> {
        public final /* synthetic */ NavigationBarConfigItem a;
        public final /* synthetic */ WithdrawActivity b;

        public h(NavigationBarConfigItem navigationBarConfigItem, WithdrawActivity withdrawActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i extends o implements n.d0.c.a<u> {
        public final /* synthetic */ NavigationBarConfigItem a;
        public final /* synthetic */ WithdrawActivity b;

        public i(NavigationBarConfigItem navigationBarConfigItem, WithdrawActivity withdrawActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public static final /* synthetic */ k.i.h.b.p.e.e Y1(WithdrawActivity withdrawActivity) {
    }

    public static final /* synthetic */ k Z1(WithdrawActivity withdrawActivity) {
    }

    public static final /* synthetic */ void a2(WithdrawActivity withdrawActivity) {
    }

    public static final /* synthetic */ void b2(WithdrawActivity withdrawActivity, NavigationBarConfig navigationBarConfig) {
    }

    public static /* synthetic */ void e2(NavigationBarConfigItem navigationBarConfigItem, WithdrawActivity withdrawActivity, View view) {
    }

    public static /* synthetic */ void f2(WithdrawActivity withdrawActivity, DialogInterface dialogInterface) {
    }

    public static /* synthetic */ void g2(NavigationBarConfigItem navigationBarConfigItem, WithdrawActivity withdrawActivity, View view) {
    }

    public static final void i2(WithdrawActivity withdrawActivity, DialogInterface dialogInterface) {
    }

    public static final void l2(NavigationBarConfigItem navigationBarConfigItem, WithdrawActivity withdrawActivity, View view) {
    }

    public static final void m2(NavigationBarConfigItem navigationBarConfigItem, WithdrawActivity withdrawActivity, View view) {
    }

    @Override // com.tencent.mp.feature.webview.ui.WebViewActivity
    public View G1(int i2) {
    }

    @Override // com.tencent.mp.feature.webview.ui.WebViewActivity
    public void L1() {
    }

    @Override // com.tencent.mp.feature.webview.ui.WebViewActivity
    public void M1() {
    }

    @Override // com.tencent.mp.feature.webview.ui.WebViewActivity
    public void T1() {
    }

    public final k.i.h.b.p.e.e c2() {
    }

    public final Drawable d2(String str) {
    }

    public final f2 h2() {
    }

    public final void init() {
    }

    public final void j2() {
    }

    public final void k2(NavigationBarConfig navigationBarConfig) {
    }
}
