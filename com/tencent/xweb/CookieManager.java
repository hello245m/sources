package com.tencent.xweb;

import android.webkit.ValueCallback;
import com.tencent.xweb.internal.ICookieManager;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class CookieManager implements ICookieManager {
    public static CookieManager b;
    public ICookieManager a;

    public static synchronized CookieManager getInstance() {
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
    @Deprecated
    public void removeAllCookie() {
    }

    @Override // com.tencent.xweb.internal.ICookieManager
    public void removeAllCookies(ValueCallback<Boolean> valueCallback) {
    }

    @Override // com.tencent.xweb.internal.ICookieManager
    @Deprecated
    public void removeExpiredCookie() {
    }

    @Override // com.tencent.xweb.internal.ICookieManager
    @Deprecated
    public void removeSessionCookie() {
    }

    @Override // com.tencent.xweb.internal.ICookieManager
    public void removeSessionCookies(ValueCallback<Boolean> valueCallback) {
    }

    @Override // com.tencent.xweb.internal.ICookieManager
    public synchronized void setAcceptCookie(boolean z) {
    }

    @Override // com.tencent.xweb.internal.ICookieManager
    public void setAcceptThirdPartyCookies(WebView webView, boolean z) {
    }

    @Override // com.tencent.xweb.internal.ICookieManager
    public void setCookie(String str, String str2) {
    }

    public void setCookieManagerWrapper(ICookieManager iCookieManager) {
    }

    @Override // com.tencent.xweb.internal.ICookieManager
    public void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback) {
    }
}
