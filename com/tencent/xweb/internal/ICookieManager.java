package com.tencent.xweb.internal;

import android.webkit.ValueCallback;
import com.tencent.xweb.WebView;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface ICookieManager {
    boolean acceptCookie();

    boolean acceptThirdPartyCookies(WebView webView);

    void flush();

    String getCookie(String str);

    boolean hasCookies();

    void removeAllCookie();

    void removeAllCookies(ValueCallback<Boolean> valueCallback);

    void removeExpiredCookie();

    void removeSessionCookie();

    void removeSessionCookies(ValueCallback<Boolean> valueCallback);

    void setAcceptCookie(boolean z);

    void setAcceptThirdPartyCookies(WebView webView, boolean z);

    void setCookie(String str, String str2);

    void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback);
}
