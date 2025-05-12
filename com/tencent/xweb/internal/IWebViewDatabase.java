package com.tencent.xweb.internal;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IWebViewDatabase {
    @Deprecated
    void clearFormData();

    void clearHttpAuthUsernamePassword();

    @Deprecated
    void clearUsernamePassword();

    String[] getHttpAuthUsernamePassword(String str, String str2);

    @Deprecated
    boolean hasFormData();

    boolean hasHttpAuthUsernamePassword();

    @Deprecated
    boolean hasUsernamePassword();

    void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4);
}
