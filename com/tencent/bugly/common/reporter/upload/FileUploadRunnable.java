package com.tencent.bugly.common.reporter.upload;

import com.tencent.bugly.common.reporter.IReporter;
import com.tencent.bugly.common.reporter.data.ReportData;
import java.io.DataOutputStream;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import n.d0.d.h;
import n.d0.d.o;
import n.u;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class FileUploadRunnable extends ReporterUpload {
    private static final String ATTA_EVENT_CODE = "RMFileUploadEventCode";
    private static final String BOUNDARY = "27182818284590452353602874713526";
    public static final Companion Companion = null;
    private static final String ERROR_FILE_NOT_FOUND = "fileNotFound";
    private static final String TAG = "RMonitor_report_File";
    private final StringBuffer buffer;

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

    public FileUploadRunnable(URL url, ReportData reportData, IReporter.ReportCallback reportCallback) {
    }

    private final String generateBoundary(boolean z) {
    }

    private final String generateContentDispositionForFile(String str) {
    }

    private final String generateContentDispositionForJson() {
    }

    private final String generateEmptyLine() {
    }

    private final String generateJsonContent() {
    }

    private final void requestInternal(File file) {
    }

    private final int upload(HttpURLConnection httpURLConnection, File file) {
    }

    public final void buildHeader(HashMap<String, String> hashMap, File file) {
    }

    @Override // com.tencent.bugly.common.reporter.upload.BaseUpload
    public void request() {
    }

    public final void writeBody(DataOutputStream dataOutputStream, File file) {
    }
}
