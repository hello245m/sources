package k.i.h.b.b.a.r;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.ValueCallback;
import com.google.gson.reflect.TypeToken;
import com.tencent.mp.feature.article.base.domain.ArticleCheckResp;
import com.tencent.mp.feature.article.base.domain.ArticleComposeInfoList;
import com.tencent.mp.feature.article.base.domain.ArticleContentInfo;
import com.tencent.mp.feature.article.base.domain.BaseResp;
import com.tencent.mp.feature.article.base.domain.ExportMaterialData;
import com.tencent.xweb.WebResourceError;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import com.tencent.xweb.util.WXWebReporter;
import java.util.List;
import o.a.t0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class v extends k.i.h.b.b.a.r.l0.a {
    public final n.d b;

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.base.task.ArticleRiskDraftTask$destroyWebView$2", f = "ArticleRiskDraftTask.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ WebView b;

        public a(WebView webView, n.a0.d<? super a> dVar) {
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

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b extends TypeToken<BaseResp<ArticleComposeInfoList>> {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class c extends TypeToken<ExportMaterialData> {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class d extends TypeToken<ArticleCheckResp> {
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.base.task.ArticleRiskDraftTask", f = "ArticleRiskDraftTask.kt", l = {52, 64, 79, 108, 117, WXWebReporter.ID903KeyDef.LIB_INSTALL_FILE_MD5_NOT_MATCH}, m = "execute")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class e extends n.a0.k.a.d {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public int f;
        public /* synthetic */ Object g;
        public final /* synthetic */ v h;

        /* renamed from: i, reason: collision with root package name */
        public int f6038i;

        public e(v vVar, n.a0.d<? super e> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.base.task.ArticleRiskDraftTask$initWebView$2", f = "ArticleRiskDraftTask.kt", l = {145}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class f extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super WebView>, Object> {
        public long a;
        public int b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ v d;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.article.base.task.ArticleRiskDraftTask$initWebView$2$webView$1", f = "ArticleRiskDraftTask.kt", l = {WXWebReporter.KEY_NEW_FAILED_CANT_FIX}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static final class a extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super WebView>, Object> {
            public Object a;
            public Object b;
            public int c;
            public final /* synthetic */ Context d;
            public final /* synthetic */ v e;

            /* renamed from: k.i.h.b.b.a.r.v$f$a$a, reason: collision with other inner class name */
            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
            public static final class C0388a extends WebViewClient {
                public final /* synthetic */ WebView a;
                public final /* synthetic */ o.a.s<WebView> b;

                /* renamed from: k.i.h.b.b.a.r.v$f$a$a$a, reason: collision with other inner class name */
                /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
                public static final class C0389a<T> implements ValueCallback {
                    public final /* synthetic */ o.a.s<WebView> a;
                    public final /* synthetic */ WebView b;

                    public C0389a(o.a.s<? super WebView> sVar, WebView webView) {
                    }

                    public final void a(Boolean bool) {
                    }

                    @Override // android.webkit.ValueCallback
                    public /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
                    }
                }

                public C0388a(WebView webView, o.a.s<? super WebView> sVar) {
                }

                @Override // com.tencent.xweb.WebViewClient
                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                }

                @Override // com.tencent.xweb.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                }
            }

            public a(Context context, v vVar, n.a0.d<? super a> dVar) {
            }

            @Override // n.a0.k.a.a
            public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
            }

            @Override // n.d0.c.p
            public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super WebView> dVar) {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(t0 t0Var, n.a0.d<? super WebView> dVar) {
            }

            @Override // n.a0.k.a.a
            public final Object invokeSuspend(Object obj) {
            }
        }

        public f(Context context, v vVar, n.a0.d<? super f> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super WebView> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super WebView> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class g extends n.d0.d.o implements n.d0.c.a<k.i.h.b.b.a.v.b> {
        public static final g a = null;

        public final k.i.h.b.b.a.v.b b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.b.a.v.b invoke() {
        }
    }

    public static final /* synthetic */ k.i.h.b.b.a.v.b m(v vVar) {
    }

    @Override // k.i.h.b.d.a1.a
    public /* bridge */ /* synthetic */ Object b(k.i.h.b.b.a.r.l0.c cVar, n.a0.d<? super k.i.h.b.b.a.r.l0.d> dVar) {
    }

    public final Object n(WebView webView, n.a0.d<? super n.u> dVar) {
    }

    public Object o(k.i.h.b.b.a.r.l0.c cVar, n.a0.d<? super k.i.h.b.b.a.r.l0.d> dVar) {
    }

    public final List<ArticleContentInfo> p(List<k.i.h.b.h.a.a.e.c.c> list) {
    }

    public final k.i.h.b.b.a.v.b q() {
    }

    @SuppressLint({"JavascriptInterface"})
    public final Object r(Context context, n.a0.d<? super WebView> dVar) {
    }

    public final String s(String str, ArticleComposeInfoList articleComposeInfoList, List<ArticleContentInfo> list, Boolean bool) {
    }
}
