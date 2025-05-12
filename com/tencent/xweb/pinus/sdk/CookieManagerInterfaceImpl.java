package com.tencent.xweb.pinus.sdk;

import android.annotation.SuppressLint;
import android.webkit.ValueCallback;
import com.tencent.xweb.util.ReflectMethod;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class CookieManagerInterfaceImpl implements CookieManagerInterface {
    public static final String TAG = "CookieManagerInterfaceImpl";
    public ReflectMethod acceptCookieMethod;
    public ReflectMethod allowFileSchemeCookiesMethod;
    public ReflectMethod flushMethod;
    public ReflectMethod getCookieStringMethod;
    public ReflectMethod hasCookiesMethod;
    public final Object inner;
    public ReflectMethod removeAllCookieMethod;
    public ReflectMethod removeAllCookieValueCallbackBooleanMethod;
    public ReflectMethod removeExpiredCookieMethod;
    public ReflectMethod removeSessionCookieMethod;
    public ReflectMethod removeSessionCookieValueCallbackBooleanMethod;
    public ReflectMethod setAcceptCookiebooleanMethod;
    public ReflectMethod setAcceptFileSchemeCookiesbooleanMethod;
    public ReflectMethod setCookieStringStringMethod;
    public ReflectMethod setCookieStringStringValueCallbackBooleanMethod;

    public CookieManagerInterfaceImpl(Object obj) {
    }

    private synchronized ReflectMethod getAcceptCookieMethod() {
    }

    private synchronized ReflectMethod getAllowFileSchemeCookiesMethod() {
    }

    private synchronized ReflectMethod getFlushMethod() {
    }

    private synchronized ReflectMethod getGetCookieStringMethod() {
    }

    private synchronized ReflectMethod getHasCookiesMethod() {
    }

    private synchronized ReflectMethod getRemoveAllCookieMethod() {
    }

    private synchronized ReflectMethod getRemoveAllCookieValueCallbackBooleanMethod() {
    }

    private synchronized ReflectMethod getRemoveExpiredCookieMethod() {
    }

    private synchronized ReflectMethod getRemoveSessionCookieMethod() {
    }

    private synchronized ReflectMethod getRemoveSessionCookieValueCallbackBooleanMethod() {
    }

    private synchronized ReflectMethod getSetAcceptCookiebooleanMethod() {
    }

    private synchronized ReflectMethod getSetAcceptFileSchemeCookiesbooleanMethod() {
    }

    private synchronized ReflectMethod getSetCookieStringStringMethod() {
    }

    private synchronized ReflectMethod getSetCookieStringStringValueCallbackBooleanMethod() {
    }

    @SuppressLint({"LongLogTag"})
    public static void handleRuntimeError(Exception exc) {
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
