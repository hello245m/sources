package k.i.h.b.l0.f;

import android.content.DialogInterface;
import android.net.Uri;
import android.webkit.ValueCallback;
import com.tencent.xweb.JsPromptResult;
import com.tencent.xweb.JsResult;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;
import k.i.h.b.d.x0.b;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class q extends WebChromeClient {
    public final k.i.h.b.d.b1.b a;
    public final k.i.h.b.l0.l.k b;
    public volatile boolean c;
    public a d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface a {
        void a(WebView webView, int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends b.c {
        public final /* synthetic */ WebChromeClient.FileChooserParams a;
        public final /* synthetic */ q b;
        public final /* synthetic */ ValueCallback<Uri[]> c;

        public b(WebChromeClient.FileChooserParams fileChooserParams, q qVar, ValueCallback<Uri[]> valueCallback) {
        }

        public static /* synthetic */ void d(DialogInterface dialogInterface, int i2) {
        }

        public static /* synthetic */ void e(q qVar, DialogInterface dialogInterface, int i2) {
        }

        public static final void f(q qVar, DialogInterface dialogInterface, int i2) {
        }

        public static final void g(DialogInterface dialogInterface, int i2) {
        }

        @Override // k.i.h.b.d.x0.b.c
        public void a() {
        }

        @Override // k.i.h.b.d.x0.b.c
        public void b() {
        }

        @Override // k.i.h.b.d.x0.b.c
        public void c() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends b.c {
        public final /* synthetic */ String a;
        public final /* synthetic */ q b;
        public final /* synthetic */ ValueCallback<Uri> c;

        public c(String str, q qVar, ValueCallback<Uri> valueCallback) {
        }

        public static /* synthetic */ void d(DialogInterface dialogInterface, int i2) {
        }

        public static /* synthetic */ void e(q qVar, DialogInterface dialogInterface, int i2) {
        }

        public static final void f(q qVar, DialogInterface dialogInterface, int i2) {
        }

        public static final void g(DialogInterface dialogInterface, int i2) {
        }

        @Override // k.i.h.b.d.x0.b.c
        public void a() {
        }

        @Override // k.i.h.b.d.x0.b.c
        public void b() {
        }

        @Override // k.i.h.b.d.x0.b.c
        public void c() {
        }
    }

    public q(k.i.h.b.d.b1.b bVar, k.i.h.b.l0.l.k kVar) {
    }

    public static final /* synthetic */ k.i.h.b.d.b1.b a(q qVar) {
    }

    public static final /* synthetic */ k.i.h.b.l0.l.k b(q qVar) {
    }

    public static /* synthetic */ void c(JsResult jsResult, DialogInterface dialogInterface, int i2) {
    }

    public static /* synthetic */ void d(DialogInterface dialogInterface, int i2) {
    }

    public static /* synthetic */ void e(JsPromptResult jsPromptResult, DialogInterface dialogInterface, int i2) {
    }

    public static /* synthetic */ void f(JsPromptResult jsPromptResult, DialogInterface dialogInterface, int i2) {
    }

    public static /* synthetic */ void g(JsResult jsResult, DialogInterface dialogInterface, int i2) {
    }

    public static final void h(DialogInterface dialogInterface, int i2) {
    }

    public static final void i(JsResult jsResult, DialogInterface dialogInterface, int i2) {
    }

    public static final void j(JsResult jsResult, DialogInterface dialogInterface, int i2) {
    }

    public static final void k(JsPromptResult jsPromptResult, DialogInterface dialogInterface, int i2) {
    }

    public static final void l(JsPromptResult jsPromptResult, DialogInterface dialogInterface, int i2) {
    }

    public final void m(boolean z) {
    }

    public final void n(a aVar) {
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

    @Override // com.tencent.xweb.WebChromeClient
    public void onProgressChanged(WebView webView, int i2) {
    }

    @Override // com.tencent.xweb.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
    }

    @Override // com.tencent.xweb.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
    }

    @Override // com.tencent.xweb.WebChromeClient
    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
    }
}
