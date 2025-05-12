package com.tencent.bugly.common.network.ssl;

import javax.net.ssl.SSLContext;
import n.d;
import n.d0.d.h;
import n.d0.d.o;
import n.i0.i;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class DefaultSslContextBuilder implements ISslContextBuilder {
    public static final /* synthetic */ i[] $$delegatedProperties = null;
    public static final Companion Companion = null;
    public static final String TAG = "Bugly_common_DefaultSslContextBuilder";
    private final d sslContext$delegate;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a extends o implements n.d0.c.a<SSLContext> {
        public final /* synthetic */ DefaultSslContextBuilder a;

        public a(DefaultSslContextBuilder defaultSslContextBuilder) {
        }

        public final SSLContext b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ SSLContext invoke() {
        }
    }

    @Override // com.tencent.bugly.common.network.ssl.ISslContextBuilder
    public SSLContext build() {
    }

    @Override // com.tencent.bugly.common.network.ssl.ISslContextBuilder
    public SSLContext getSslContext() {
    }

    @Override // com.tencent.bugly.common.network.ssl.ISslContextBuilder
    public void initSslContext(SSLContext sSLContext) {
    }
}
