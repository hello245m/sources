package com.tencent.mp.feature.article.typo.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.Observer;
import com.tencent.xweb.JsPromptResult;
import com.tencent.xweb.JsResult;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import com.tencent.xweb.util.WXWebReporter;
import java.util.List;
import java.util.Map;
import n.d0.c.p;
import n.d0.c.q;
import n.d0.d.o;
import n.u;
import o.a.f2;
import o.a.t0;
import q.k9;
import q.r9;
import q.wa;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class ArticleFixTypoAct extends k.i.h.b.d.b1.b {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f1299i;

    /* renamed from: j, reason: collision with root package name */
    public String f1300j;

    /* renamed from: k, reason: collision with root package name */
    public int f1301k;

    /* renamed from: l, reason: collision with root package name */
    public String f1302l;

    /* renamed from: m, reason: collision with root package name */
    public String f1303m;

    /* renamed from: n, reason: collision with root package name */
    public int f1304n;

    /* renamed from: o, reason: collision with root package name */
    public String f1305o;

    /* renamed from: p, reason: collision with root package name */
    public String f1306p;

    /* renamed from: q, reason: collision with root package name */
    public String f1307q;

    /* renamed from: r, reason: collision with root package name */
    public final n.d f1308r;

    /* renamed from: s, reason: collision with root package name */
    public final n.d f1309s;

    /* renamed from: t, reason: collision with root package name */
    public int f1310t;
    public long u;
    public long v;
    public boolean w;
    public Map<Integer, View> x;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class a extends WebChromeClient {
        public a(ArticleFixTypoAct articleFixTypoAct) {
        }

        public static /* synthetic */ void a(JsPromptResult jsPromptResult, EditText editText, DialogInterface dialogInterface, int i2) {
        }

        public static /* synthetic */ void b(JsPromptResult jsPromptResult, DialogInterface dialogInterface, int i2) {
        }

        public static /* synthetic */ void c(JsResult jsResult, DialogInterface dialogInterface, int i2) {
        }

        public static /* synthetic */ void d(JsResult jsResult, DialogInterface dialogInterface, int i2) {
        }

        public static /* synthetic */ void e(DialogInterface dialogInterface, int i2) {
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
        public final /* synthetic */ ArticleFixTypoAct a;

        public b(ArticleFixTypoAct articleFixTypoAct) {
        }

        @Override // com.tencent.xweb.WebViewClient
        public void onPageFinished(WebView webView, String str) {
        }

        @Override // com.tencent.xweb.WebViewClient
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c<T> implements Observer {
        public final /* synthetic */ ArticleFixTypoAct a;
        public final /* synthetic */ n.a0.d<Integer> b;

        public c(ArticleFixTypoAct articleFixTypoAct, n.a0.d<? super Integer> dVar) {
        }

        public final void a(k.i.h.b.d.w0.c.i<wa> iVar) {
        }

        @Override // androidx.lifecycle.Observer
        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d<T> implements Observer {
        public final /* synthetic */ ArticleFixTypoAct a;
        public final /* synthetic */ n.a0.d<Integer> b;

        public d(ArticleFixTypoAct articleFixTypoAct, n.a0.d<? super Integer> dVar) {
        }

        public final void a(r9 r9Var) {
        }

        @Override // androidx.lifecycle.Observer
        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e extends o implements n.d0.c.a<k.i.h.b.b.e.e.a> {
        public static final e a = null;

        public final k.i.h.b.b.e.e.a b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.b.e.e.a invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends o implements n.d0.c.a<u> {
        public final /* synthetic */ ArticleFixTypoAct a;

        public f(ArticleFixTypoAct articleFixTypoAct) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.typo.ui.ArticleFixTypoAct$loadData$1", f = "ArticleFixTypoAct.kt", l = {WXWebReporter.WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED, WXWebReporter.WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED_TEST_SYS_SUC, WXWebReporter.WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS, WXWebReporter.KEY_SET_DATA_SUFFIX_LOCK_FILE_FAILED}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g extends n.a0.k.a.l implements p<t0, n.a0.d<? super u>, Object> {
        public int a;
        public final /* synthetic */ k.i.h.b.d.b1.d.k b;
        public final /* synthetic */ ArticleFixTypoAct c;

        public g(k.i.h.b.d.b1.d.k kVar, ArticleFixTypoAct articleFixTypoAct, n.a0.d<? super g> dVar) {
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
    public static final class h extends o implements n.d0.c.a<u> {
        public final /* synthetic */ ArticleFixTypoAct a;
        public final /* synthetic */ n.a0.d<Integer> b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends o implements n.d0.c.l<Boolean, u> {
            public final /* synthetic */ ArticleFixTypoAct a;

            public a(ArticleFixTypoAct articleFixTypoAct) {
            }

            public final void b(boolean z) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ u invoke(Boolean bool) {
            }
        }

        public h(ArticleFixTypoAct articleFixTypoAct, n.a0.d<? super Integer> dVar) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i extends o implements p<Boolean, List<? extends String>, u> {
        public final /* synthetic */ ArticleFixTypoAct a;

        public i(ArticleFixTypoAct articleFixTypoAct) {
        }

        public final void b(boolean z, List<String> list) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ u invoke(Boolean bool, List<? extends String> list) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j extends o implements n.d0.c.l<k.i.h.b.b.e.e.b, u> {
        public final /* synthetic */ ArticleFixTypoAct a;
        public final /* synthetic */ k.i.h.b.d.b1.d.k b;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.article.typo.ui.ArticleFixTypoAct$preview$1$1", f = "ArticleFixTypoAct.kt", l = {}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.l implements p<t0, n.a0.d<? super u>, Object> {
            public int a;
            public final /* synthetic */ k.i.h.b.b.e.e.b b;
            public final /* synthetic */ ArticleFixTypoAct c;
            public final /* synthetic */ k.i.h.b.d.b1.d.k d;

            /* renamed from: com.tencent.mp.feature.article.typo.ui.ArticleFixTypoAct$j$a$a, reason: collision with other inner class name */
            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
            public static final class C0044a extends o implements n.d0.c.l<String, u> {
                public final /* synthetic */ ArticleFixTypoAct a;
                public final /* synthetic */ k.i.h.b.b.e.e.b b;

                public C0044a(ArticleFixTypoAct articleFixTypoAct, k.i.h.b.b.e.e.b bVar) {
                }

                public final void b(String str) {
                }

                @Override // n.d0.c.l
                public /* bridge */ /* synthetic */ u invoke(String str) {
                }
            }

            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
            public static final class b extends o implements n.d0.c.l<String, u> {
                public final /* synthetic */ k.i.h.b.d.b1.d.k a;
                public final /* synthetic */ ArticleFixTypoAct b;

                /* renamed from: com.tencent.mp.feature.article.typo.ui.ArticleFixTypoAct$j$a$b$a, reason: collision with other inner class name */
                /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
                public static final class C0045a extends o implements n.d0.c.a<u> {
                    public final /* synthetic */ k.i.h.b.d.b1.d.k a;

                    public C0045a(k.i.h.b.d.b1.d.k kVar) {
                    }

                    @Override // n.d0.c.a
                    public /* bridge */ /* synthetic */ u invoke() {
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }
                }

                public b(k.i.h.b.d.b1.d.k kVar, ArticleFixTypoAct articleFixTypoAct) {
                }

                public final void b(String str) {
                }

                @Override // n.d0.c.l
                public /* bridge */ /* synthetic */ u invoke(String str) {
                }
            }

            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
            public static final class c extends o implements n.d0.c.a<u> {
                public final /* synthetic */ k.i.h.b.d.b1.d.k a;

                public c(k.i.h.b.d.b1.d.k kVar) {
                }

                @Override // n.d0.c.a
                public /* bridge */ /* synthetic */ u invoke() {
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            }

            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
            public static final class d extends o implements n.d0.c.a<u> {
                public final /* synthetic */ k.i.h.b.d.b1.d.k a;

                public d(k.i.h.b.d.b1.d.k kVar) {
                }

                @Override // n.d0.c.a
                public /* bridge */ /* synthetic */ u invoke() {
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            }

            public a(k.i.h.b.b.e.e.b bVar, ArticleFixTypoAct articleFixTypoAct, k.i.h.b.d.b1.d.k kVar, n.a0.d<? super a> dVar) {
            }

            public static final void g(k.i.h.b.d.b1.d.k kVar, ArticleFixTypoAct articleFixTypoAct, k.i.h.b.b.e.e.b bVar, k.i.h.b.d.w0.c.i iVar) {
            }

            public static /* synthetic */ void h(k.i.h.b.d.b1.d.k kVar, ArticleFixTypoAct articleFixTypoAct, k.i.h.b.b.e.e.b bVar, k.i.h.b.d.w0.c.i iVar) {
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

        public j(ArticleFixTypoAct articleFixTypoAct, k.i.h.b.d.b1.d.k kVar) {
        }

        public final void b(k.i.h.b.b.e.e.b bVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(k.i.h.b.b.e.e.b bVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class k extends o implements n.d0.c.l<k.i.h.b.b.e.e.b, u> {
        public final /* synthetic */ ArticleFixTypoAct a;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.article.typo.ui.ArticleFixTypoAct$submit$1$1", f = "ArticleFixTypoAct.kt", l = {}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.l implements p<t0, n.a0.d<? super u>, Object> {
            public int a;
            public final /* synthetic */ ArticleFixTypoAct b;
            public final /* synthetic */ k.i.h.b.b.e.e.b c;

            /* renamed from: com.tencent.mp.feature.article.typo.ui.ArticleFixTypoAct$k$a$a, reason: collision with other inner class name */
            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
            public static final class C0046a extends o implements n.d0.c.a<u> {
                public final /* synthetic */ k.i.h.b.d.b1.d.k a;
                public final /* synthetic */ ArticleFixTypoAct b;

                public C0046a(k.i.h.b.d.b1.d.k kVar, ArticleFixTypoAct articleFixTypoAct) {
                }

                @Override // n.d0.c.a
                public /* bridge */ /* synthetic */ u invoke() {
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            }

            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
            public static final class b extends o implements n.d0.c.a<u> {
                public final /* synthetic */ k.i.h.b.d.b1.d.k a;

                public b(k.i.h.b.d.b1.d.k kVar) {
                }

                @Override // n.d0.c.a
                public /* bridge */ /* synthetic */ u invoke() {
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            }

            public a(ArticleFixTypoAct articleFixTypoAct, k.i.h.b.b.e.e.b bVar, n.a0.d<? super a> dVar) {
            }

            public static final void g(ArticleFixTypoAct articleFixTypoAct, k.i.h.b.b.e.e.b bVar, DialogInterface dialogInterface, int i2) {
            }

            public static final void h(k.i.h.b.d.b1.d.k kVar, ArticleFixTypoAct articleFixTypoAct, k.i.h.b.d.w0.c.i iVar) {
            }

            public static /* synthetic */ void i(ArticleFixTypoAct articleFixTypoAct, k.i.h.b.b.e.e.b bVar, DialogInterface dialogInterface, int i2) {
            }

            public static /* synthetic */ void l(k.i.h.b.d.b1.d.k kVar, ArticleFixTypoAct articleFixTypoAct, k.i.h.b.d.w0.c.i iVar) {
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

        public k(ArticleFixTypoAct articleFixTypoAct) {
        }

        public final void b(k.i.h.b.b.e.e.b bVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(k.i.h.b.b.e.e.b bVar) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.typo.ui.ArticleFixTypoAct$updateVideoCardStatus$1", f = "ArticleFixTypoAct.kt", l = {669}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class l extends n.a0.k.a.l implements p<t0, n.a0.d<? super u>, Object> {
        public int a;
        public final /* synthetic */ List<String> b;
        public final /* synthetic */ ArticleFixTypoAct c;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.article.typo.ui.ArticleFixTypoAct$updateVideoCardStatus$1$1", f = "ArticleFixTypoAct.kt", l = {336}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.l implements q<o.a.s3.f<? super k.i.h.b.d.w0.d.b<k9>>, Throwable, n.a0.d<? super u>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public /* synthetic */ Object c;

            public a(n.a0.d<? super a> dVar) {
            }

            @Override // n.d0.c.q
            public /* bridge */ /* synthetic */ Object a(o.a.s3.f<? super k.i.h.b.d.w0.d.b<k9>> fVar, Throwable th, n.a0.d<? super u> dVar) {
            }

            public final Object g(o.a.s3.f<? super k.i.h.b.d.w0.d.b<k9>> fVar, Throwable th, n.a0.d<? super u> dVar) {
            }

            @Override // n.a0.k.a.a
            public final Object invokeSuspend(Object obj) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class b implements o.a.s3.f<k.i.h.b.d.w0.d.b<k9>> {
            public final /* synthetic */ ArticleFixTypoAct a;

            public b(ArticleFixTypoAct articleFixTypoAct) {
            }

            @Override // o.a.s3.f
            public Object emit(k.i.h.b.d.w0.d.b<k9> bVar, n.a0.d<? super u> dVar) {
            }
        }

        public l(List<String> list, ArticleFixTypoAct articleFixTypoAct, n.a0.d<? super l> dVar) {
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
    public static final class m extends o implements n.d0.c.a<k.i.h.b.p.e.g> {
        public static final m a = null;

        public final k.i.h.b.p.e.g b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.p.e.g invoke() {
        }
    }

    public static final void C2(k.i.h.b.d.b1.d.d dVar) {
    }

    public static final void D2(ArticleFixTypoAct articleFixTypoAct, String str, k.i.h.b.b.e.e.b bVar, MenuItem menuItem, int i2) {
    }

    public static final /* synthetic */ Object H1(ArticleFixTypoAct articleFixTypoAct, n.a0.d dVar) {
    }

    public static final /* synthetic */ Object I1(ArticleFixTypoAct articleFixTypoAct, n.a0.d dVar) {
    }

    public static final /* synthetic */ k.i.h.b.b.e.e.a J1(ArticleFixTypoAct articleFixTypoAct) {
    }

    public static final /* synthetic */ void K1(ArticleFixTypoAct articleFixTypoAct, int i2, int i3, n.d0.c.l lVar, n.d0.c.l lVar2) {
    }

    public static final /* synthetic */ k.i.h.b.p.e.g L1(ArticleFixTypoAct articleFixTypoAct) {
    }

    public static final /* synthetic */ Object M1(ArticleFixTypoAct articleFixTypoAct, n.a0.d dVar) {
    }

    public static final /* synthetic */ void N1(ArticleFixTypoAct articleFixTypoAct, k.i.h.b.b.e.e.b bVar, String str) {
    }

    public static final /* synthetic */ f2 O1(ArticleFixTypoAct articleFixTypoAct, List list) {
    }

    public static final void c2(n.d0.c.l lVar, n.d0.c.l lVar2, k.i.h.b.d.w0.c.i iVar) {
    }

    public static final void h2(ArticleFixTypoAct articleFixTypoAct, int i2) {
    }

    public static final void l2(ArticleFixTypoAct articleFixTypoAct, View view) {
    }

    public static final void m2(ArticleFixTypoAct articleFixTypoAct, View view) {
    }

    public static /* synthetic */ void n2(n.d0.c.l lVar, n.d0.c.l lVar2, k.i.h.b.d.w0.c.i iVar) {
    }

    public static /* synthetic */ void o2(ArticleFixTypoAct articleFixTypoAct, View view) {
    }

    public static /* synthetic */ void p2(k.i.h.b.d.b1.d.d dVar) {
    }

    public static /* synthetic */ void q2(ArticleFixTypoAct articleFixTypoAct, int i2) {
    }

    public static /* synthetic */ void r2(ArticleFixTypoAct articleFixTypoAct, String str, k.i.h.b.b.e.e.b bVar, MenuItem menuItem, int i2) {
    }

    public static /* synthetic */ void s2(ArticleFixTypoAct articleFixTypoAct, View view) {
    }

    public final void A2(boolean z) {
    }

    public final void B2(k.i.h.b.b.e.e.b bVar, String str) {
    }

    public final void E2() {
    }

    public final f2 F2(List<String> list) {
    }

    public View G1(int i2) {
    }

    public final Object P1(n.a0.d<? super Integer> dVar) {
    }

    public final Object Q1(n.a0.d<? super Integer> dVar) {
    }

    public final String R1() {
    }

    public final String S1() {
    }

    public final k.i.h.b.b.e.e.a T1() {
    }

    public final int U1() {
    }

    public final int V1() {
    }

    @Override // k.i.h.b.d.b1.a
    public int W0() {
    }

    public final int W1() {
    }

    public final int X1() {
    }

    public final String Y1() {
    }

    public final long Z1() {
    }

    public final long a2() {
    }

    public final void b2(int i2, int i3, n.d0.c.l<? super String, u> lVar, n.d0.c.l<? super String, u> lVar2) {
    }

    public final int d2() {
    }

    public final String e2() {
    }

    public final k.i.h.b.p.e.g f2() {
    }

    public final void g2() {
    }

    public final void i2(String str, int i2, int i3) {
    }

    public final void j2() {
    }

    public final void k2() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
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

    @Override // k.i.h.b.d.b1.b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    public final void t2() {
    }

    public final Object u2(n.a0.d<? super Integer> dVar) {
    }

    public final void v2() {
    }

    public final void w2(k.i.h.b.b.e.e.b bVar, String str) {
    }

    public final void x2(String str) {
    }

    public final void y2(String str) {
    }

    public final void z2(int i2) {
    }
}
