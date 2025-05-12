package com.huawei.agconnect.core.service.auth;

import k.e.b.a.f;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface AuthProvider {
    void addTokenListener(OnTokenListener onTokenListener);

    f<Token> getTokens();

    f<Token> getTokens(boolean z);

    String getUid();

    void removeTokenListener(OnTokenListener onTokenListener);
}
