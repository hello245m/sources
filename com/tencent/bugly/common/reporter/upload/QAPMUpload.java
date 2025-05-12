package com.tencent.bugly.common.reporter.upload;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import n.d0.d.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class QAPMUpload extends BaseUpload {
    public static final int CHUNK_SIZE = 1048576;
    public static final Companion Companion = null;
    public static final int ERROR_CLIENT = 400;
    public static final int ERROR_FILE_NOT_EXIT = 601;
    public static final int ERROR_MAX_LIMIT = 800;
    public static final int ERROR_NET_NOT_AVAILABLE = 602;
    public static final int ERROR_NOT_FATAL = 603;
    public static final int ERROR_OOM = 600;
    public static final int ERROR_OTHER = 700;
    public static final int ERROR_SERVICE = 500;
    public static final int HTTP_OK = 200;
    public static final int SOCKET_TIMEOUT_MILLI = 30000;
    private static final String TAG = "RMonitor_base_QAPMUpload";
    private int protocol;
    private URL url;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
        }
    }

    public QAPMUpload(URL url) {
    }

    public static /* synthetic */ HttpURLConnection connectionBuilder$default(QAPMUpload qAPMUpload, HashMap hashMap, int i2, int i3, int i4, Object obj) {
    }

    public final HttpURLConnection connectionBuilder(HashMap<String, String> hashMap, int i2, int i3) {
    }

    public final int getProtocol() {
    }

    public final URL getUrl() {
    }

    public final void setProtocol(int i2) {
    }

    public final void setUrl(URL url) {
    }
}
