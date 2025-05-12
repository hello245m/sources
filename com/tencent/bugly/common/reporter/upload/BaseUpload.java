package com.tencent.bugly.common.reporter.upload;

import java.net.URL;
import n.d0.d.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class BaseUpload {
    public static final Companion Companion = null;
    public static final int PROTOCOL_HTTP = 0;
    public static final int PROTOCOL_HTTPS = 1;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
        }
    }

    public final int getProtocol(URL url) {
    }

    public abstract void request();
}
