package com.tencent.xweb.pinus;

import android.webkit.ValueCallback;
import com.tencent.xweb.WebView;
import com.tencent.xweb.internal.ICookieManager;
import com.tencent.xweb.pinus.sdk.CookieManager;
import java.net.URISyntaxException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class PinusCookieManagerWrapper implements ICookieManager {
    public static final String TAG = "PinusCookieManagerWrapper";
    public final CookieManager mCookieManager;

    public static String fixupUrl(String str) throws URISyntaxException {
    }

    @Override // com.tencent.xweb.internal.ICookieManager
    public boolean acceptCookie() {
    }

    @Override // com.tencent.xweb.internal.ICookieManager
    public boolean acceptThirdPartyCookies(WebView webView) {
    }

    @Override // com.tencent.xweb.internal.ICookieManager
    public void flush() {
    }

    @Override // com.tencent.xweb.internal.ICookieManager
    public String getCookie(String str) {
    }

    @Override // com.tencent.xweb.internal.ICookieManager
    public boolean hasCookies() {
    }

    @Override // com.tencent.xweb.internal.ICookieManager
    public void removeAllCookie() {
    }

    @Override // com.tencent.xweb.internal.ICookieManager
    public void removeAllCookies(ValueCallback<Boolean> valueCallback) {
    }

    @Override // com.tencent.xweb.internal.ICookieManager
    public void removeExpiredCookie() {
    }

    @Override // com.tencent.xweb.internal.ICookieManager
    public void removeSessionCookie() {
    }

    @Override // com.tencent.xweb.internal.ICookieManager
    public void removeSessionCookies(ValueCallback<Boolean> valueCallback) {
    }

    @Override // com.tencent.xweb.internal.ICookieManager
    public void setAcceptCookie(boolean z) {
    }

    @Override // com.tencent.xweb.internal.ICookieManager
    public void setAcceptThirdPartyCookies(WebView webView, boolean z) {
    }

    @Override // com.tencent.xweb.internal.ICookieManager
    public void setCookie(String str, String str2) {
    }

    @Override // com.tencent.xweb.internal.ICookieManager
    public void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback) {
    }
}
