package com.tencent.mp.feature.jsbridge.bridge;

import android.webkit.JavascriptInterface;
import androidx.annotation.Keep;
import java.util.Map;
import k.i.h.b.p.c.b;
import n.d;
import n.d0.d.o;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class JsMessageBridge {
    public final Map<String, b> a;
    public final Map<String, b> b;
    public final d c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends o implements n.d0.c.a<Map<String, String>> {
        public static final a a = null;

        public final Map<String, String> b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Map<String, String> invoke() {
        }
    }

    public final String a(JSONObject jSONObject, String str) {
    }

    public final String b(String str) {
    }

    public final JSONObject c(String str, String str2, Object obj) {
    }

    public final JSONObject d(String str, String str2, JSONObject jSONObject) {
    }

    public final Map<String, b> e() {
    }

    public final Map<String, b> f() {
    }

    public abstract void g(String str, String str2, JSONObject jSONObject);

    public abstract void h(String str, b bVar);

    public abstract void i(String str, Object obj, b bVar);

    @JavascriptInterface
    @Keep
    public final void postMessage(String str) {
    }
}
