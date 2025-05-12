package com.tencent.bugly.common.reporter.upload;

import com.tencent.bugly.common.reporter.IReporter;
import com.tencent.bugly.common.reporter.data.ReportData;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import n.d0.d.h;
import n.d0.d.o;
import n.u;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class JsonUploadRunnable extends ReporterUpload {
    public static final Companion Companion = null;
    public static final String TAG = "RMonitor_report_Json";

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a extends o implements n.d0.c.a<u> {
        public static final a a = null;

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public JsonUploadRunnable(URL url, ReportData reportData, IReporter.ReportCallback reportCallback) {
    }

    private final void buildHeader(HashMap<String, String> hashMap) {
    }

    private final int upload(HttpURLConnection httpURLConnection) {
    }

    @Override // com.tencent.bugly.common.reporter.upload.BaseUpload
    public void request() {
    }
}
