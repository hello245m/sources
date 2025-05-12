package k.i.h.b.k.o.f2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.mp.feature.base.adapter.BaseViewHolder;
import com.tencent.mp.feature.webview.offline.OfflinePackageWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import eightbitlab.com.blurview.BlurView;
import k.i.h.b.d.m0.i;
import n.d0.c.p;
import n.d0.d.o;
import n.u;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class c extends i<k.i.h.b.k.i.a, BaseViewHolder> {
    public final Context y;
    public final ConstraintLayout z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends BaseViewHolder {
        public final BlurView a;
        public final TextView b;

        public a(View view, ViewGroup viewGroup) {
        }

        public final void c(Context context, k.i.h.b.k.i.a aVar) {
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends BaseViewHolder {
        public boolean a;
        public boolean b;
        public String c;
        public final OfflinePackageWebView d;
        public final k.i.h.b.p.e.c e;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends WebViewClient {
            public final /* synthetic */ b a;

            public a(b bVar) {
            }

            @Override // com.tencent.xweb.WebViewClient
            public void onPageFinished(WebView webView, String str) {
            }
        }

        /* renamed from: k.i.h.b.k.o.f2.c$b$b, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class C0567b extends o implements p<Integer, Integer, u> {
            public final /* synthetic */ b a;

            public C0567b(b bVar) {
            }

            public final void b(int i2, int i3) {
            }

            @Override // n.d0.c.p
            public /* bridge */ /* synthetic */ u invoke(Integer num, Integer num2) {
            }
        }

        public b(View view) {
        }

        public final void H(boolean z) {
        }

        public final void I(boolean z) {
        }

        public final void J(k.i.h.b.k.i.a aVar) {
        }

        public final k.i.h.b.p.e.c c() {
        }

        public final String l() {
        }

        public final boolean n() {
        }

        public final OfflinePackageWebView p() {
        }
    }

    public c(Context context, ConstraintLayout constraintLayout) {
    }

    @Override // k.i.h.b.d.m0.i, k.i.h.b.d.m0.k
    public BaseViewHolder U0(ViewGroup viewGroup, int i2) {
    }

    @Override // k.i.h.b.d.m0.k
    public /* bridge */ /* synthetic */ void i0(BaseViewHolder baseViewHolder, Object obj) {
    }

    public void w1(BaseViewHolder baseViewHolder, k.i.h.b.k.i.a aVar) {
    }
}
