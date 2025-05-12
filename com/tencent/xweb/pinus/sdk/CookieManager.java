package com.tencent.xweb.pinus.sdk;

import android.webkit.ValueCallback;
import com.tencent.xweb.pinus.PSCoreWrapper;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class CookieManager implements CookieManagerInterface {
    public static final String TAG = "CookieManager";
    public static CookieManager sInstance;
    public static final Object sInstanceLock = null;
    public PSCoreWrapper coreWrapper;
    public Object inner;
    public CookieManagerInterface reflectInterface;

    public static CookieManager getInstance() {
    }

    private void init() {
    }

    @Override // com.tencent.xweb.pinus.sdk.CookieManagerInterface
    public boolean acceptCookie() {
    }

    @Override // com.tencent.xweb.pinus.sdk.CookieManagerInterface
    public boolean allowFileSchemeCookies() {
    }

    @Override // com.tencent.xweb.pinus.sdk.CookieManagerInterface
    public void flush() {
    }

    @Override // com.tencent.xweb.pinus.sdk.CookieManagerInterface
    public String getCookie(String str) {
    }

    @Override // com.tencent.xweb.pinus.sdk.CookieManagerInterface
    public boolean hasCookies() {
    }

    @Override // com.tencent.xweb.pinus.sdk.CookieManagerInterface
    public void removeAllCookie() {
    }

    @Override // com.tencent.xweb.pinus.sdk.CookieManagerInterface
    public void removeExpiredCookie() {
    }

    @Override // com.tencent.xweb.pinus.sdk.CookieManagerInterface
    public void removeSessionCookie() {
    }

    @Override // com.tencent.xweb.pinus.sdk.CookieManagerInterface
    public void setAcceptCookie(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.CookieManagerInterface
    public void setAcceptFileSchemeCookies(boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.CookieManagerInterface
    public void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback) {
    }

    @Override // com.tencent.xweb.pinus.sdk.CookieManagerInterface
    public void removeAllCookie(ValueCallback<Boolean> valueCallback) {
    }

    @Override // com.tencent.xweb.pinus.sdk.CookieManagerInterface
    public void removeSessionCookie(ValueCallback<Boolean> valueCallback) {
    }

    @Override // com.tencent.xweb.pinus.sdk.CookieManagerInterface
    public void setCookie(String str, String str2) {
    }
}
