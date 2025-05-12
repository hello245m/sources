package com.tencent.mp.feature.editor.widget.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.http.SslError;
import android.util.AttributeSet;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import n.a0.g;
import n.a0.k.a.f;
import n.a0.k.a.l;
import n.d0.c.p;
import n.d0.d.o;
import n.u;
import o.a.f0;
import o.a.t0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class ImageEditorWebView extends k.i.h.b.k.s.b0.a implements t0 {

    /* renamed from: n, reason: collision with root package name */
    public final f0 f1515n;

    /* renamed from: o, reason: collision with root package name */
    public final n.d f1516o;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends WebViewClient {
        public final /* synthetic */ Context a;
        public final /* synthetic */ ImageEditorWebView b;

        /* renamed from: com.tencent.mp.feature.editor.widget.webview.ImageEditorWebView$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class C0057a extends o implements n.d0.c.a<u> {
            public final /* synthetic */ ImageEditorWebView a;
            public final /* synthetic */ String b;

            public C0057a(ImageEditorWebView imageEditorWebView, String str) {
            }

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ u invoke() {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public a(Context context, ImageEditorWebView imageEditorWebView) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"NewApi"})
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }
    }

    @f(c = "com.tencent.mp.feature.editor.widget.webview.ImageEditorWebView", f = "ImageEditorWebView.kt", l = {125}, m = "isGlobalConfigEnable")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends n.a0.k.a.d {
        public /* synthetic */ Object a;
        public final /* synthetic */ ImageEditorWebView b;
        public int c;

        public b(ImageEditorWebView imageEditorWebView, n.a0.d<? super b> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @f(c = "com.tencent.mp.feature.editor.widget.webview.ImageEditorWebView$loadPage$1", f = "ImageEditorWebView.kt", l = {99, 102}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends l implements p<t0, n.a0.d<? super u>, Object> {
        public int a;
        public final /* synthetic */ ImageEditorWebView b;
        public final /* synthetic */ k.i.h.b.l0.j.d c;

        public c(ImageEditorWebView imageEditorWebView, k.i.h.b.l0.j.d dVar, n.a0.d<? super c> dVar2) {
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
    public static final class d extends o implements n.d0.c.a<k.i.h.b.l0.j.f> {
        public static final d a = null;

        public final k.i.h.b.l0.j.f b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.l0.j.f invoke() {
        }
    }

    public ImageEditorWebView(Context context, AttributeSet attributeSet) {
    }

    private final k.i.h.b.l0.j.f getManager() {
    }

    public static final /* synthetic */ k.i.h.b.l0.j.f q(ImageEditorWebView imageEditorWebView) {
    }

    public static final /* synthetic */ Object r(ImageEditorWebView imageEditorWebView, n.a0.d dVar) {
    }

    @Override // o.a.t0
    public g getCoroutineContext() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    public final Object s(n.a0.d<? super Boolean> dVar) {
    }

    public final void t(k.i.h.b.l0.j.d dVar) {
    }
}
