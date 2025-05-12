package k.i.h.b.p;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.xweb.WebView;
import n.d0.d.o;
import n.u;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class a {

    /* renamed from: k.i.h.b.p.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class C0611a extends o implements n.d0.c.a<u> {
        public final /* synthetic */ WebView a;
        public final /* synthetic */ String b;

        public C0611a(WebView webView, String str) {
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
        public final /* synthetic */ String a;
        public final /* synthetic */ WebView b;
        public final /* synthetic */ ValueCallback<Boolean> c;

        /* renamed from: k.i.h.b.p.a$b$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class C0612a implements ValueCallback<String> {
            public final /* synthetic */ ValueCallback<Boolean> a;

            public C0612a(ValueCallback<Boolean> valueCallback) {
            }

            public void a(String str) {
            }

            @Override // android.webkit.ValueCallback
            public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
            }
        }

        public b(String str, WebView webView, ValueCallback<Boolean> valueCallback) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public static final String a(Context context, String str) throws Exception {
    }

    public static final void b(WebView webView) {
    }

    public static final void c(WebView webView, ValueCallback<Boolean> valueCallback) {
    }
}
