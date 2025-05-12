package com.tencent.bugly.common.network.ssl;

import javax.net.ssl.SSLContext;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface ISslContextBuilder {
    SSLContext build();

    SSLContext getSslContext();

    void initSslContext(SSLContext sSLContext);
}
