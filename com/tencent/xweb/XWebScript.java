package com.tencent.xweb;

import android.webkit.ValueCallback;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebScript {
    public static final int CACHE_OPTION_CODE_CACHE_IN_MEN = 512;
    public static final int CACHE_OPTION_FLAG_CACHE_UTF16 = 256;
    public static final int CACHE_OPTION_JS_SRC_IN_MEM = 1024;
    public static final int CODE_CACHE_COMPILE_MODE_FULL = 3;
    public static final int CODE_CACHE_COMPILE_MODE_NONE = 0;
    public static final int CODE_CACHE_COMPILE_MODE_NORMAL = 2;
    public static final int CODE_CACHE_COMPILE_MODE_SIMPLE = 1;
    public static final String JS_CODE_CACHE_COMPILE_MODE_FULL = "fullcache";
    public static final String JS_CODE_CACHE_COMPILE_MODE_NONE = "nocache";
    public static final String JS_CODE_CACHE_COMPILE_MODE_NORMAL = "normalcache";
    public static final String JS_CODE_CACHE_COMPILE_MODE_SIMPLE = "simplecache";
    public int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public long f2018i;

    /* renamed from: j, reason: collision with root package name */
    public int f2019j;

    /* renamed from: k, reason: collision with root package name */
    public WebView f2020k;

    /* renamed from: com.tencent.xweb.XWebScript$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements ValueCallback<String> {
        public final /* synthetic */ ValueCallback a;
        public final /* synthetic */ ValueCallback b;

        public AnonymousClass1(XWebScript xWebScript, ValueCallback valueCallback, ValueCallback valueCallback2) {
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
        }

        /* renamed from: onReceiveValue, reason: avoid collision after fix types in other method */
        public void onReceiveValue2(String str) {
        }
    }

    public XWebScript(int i2, int i3, WebView webView) {
    }

    public void a(String str, String str2) {
    }

    public boolean checkValid() {
    }

    public void execute() {
    }

    public void setCacheKey(String str) {
    }

    public void setCacheMode(String str) {
    }

    public void setCacheOption(int i2) {
    }

    public void setFallBackLogic(String str) {
    }

    public void setJsParamAsBuffer(long j2, int i2) {
    }

    public void setJsParamAsFilePath(String str) {
    }

    public void setJsSrcAsPath(String str) {
    }

    public void setJsSrcAsRawString(String str) {
    }

    public String toString() {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class XWebScriptPerformance {
        public String a;
        public JSONObject b;

        public XWebScriptPerformance(String str) {
        }

        public long a(String str, long j2) {
        }

        public long getCompileCost() {
        }

        public long getRunCost() {
        }

        public String getScriptRet() {
        }

        public boolean getUseCodeCache() {
        }

        public long getV8StrCost() {
        }

        public String toString() {
        }

        public boolean a(String str, boolean z) {
        }
    }

    public void setJsSrcAsPath(String str, String str2) {
    }

    public void execute(ValueCallback<String> valueCallback) {
    }

    public void execute(ValueCallback<String> valueCallback, ValueCallback<XWebScriptPerformance> valueCallback2) {
    }

    public void setCacheMode(int i2) {
    }
}
