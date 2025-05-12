package com.tencent.bugly.common.reporter.upload;

import com.tencent.bugly.common.reporter.IReporter;
import com.tencent.bugly.common.reporter.data.ReportData;
import java.net.HttpURLConnection;
import java.net.URL;
import n.d0.c.a;
import n.d0.d.h;
import n.u;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class ReporterUpload extends QAPMUpload {
    public static final int BUFFER_SIZE = 8192;
    public static final Companion Companion = null;
    public static final int STATUS_0 = 0;
    public static final int STATUS_1000 = 1000;
    public static final int STATUS_1495 = 1495;
    public static final int STATUS_JSON_ERROR = -1;
    public static final int STATUS_NEED_AUTHORIZATION = 1408;
    public static final String TAG = "Bugly_RUpload";
    private final IReporter.ReportCallback callback;
    private final ReportData reportData;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
        }
    }

    public ReporterUpload(URL url, ReportData reportData, IReporter.ReportCallback reportCallback) {
    }

    private final int getRetCode(String str) {
    }

    public final u dealResp(String str, int i2, int i3, a<u> aVar) {
    }

    public final IReporter.ReportCallback getCallback() {
    }

    public final ReportData getReportData() {
    }

    public final boolean isSucceeded(String str) {
    }

    public final String readResp(String str, HttpURLConnection httpURLConnection) {
    }
}
