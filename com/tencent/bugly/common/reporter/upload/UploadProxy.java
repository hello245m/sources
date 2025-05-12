package com.tencent.bugly.common.reporter.upload;

import android.content.Context;
import com.tencent.bugly.common.reporter.IReporter;
import com.tencent.bugly.common.reporter.data.ReportData;
import n.d0.d.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class UploadProxy implements IReporter {
    public static final Companion Companion = null;
    private static final String TAG = "RMonitor_report_UploadProxy";
    private String mAppId;
    private Context mContext;
    private Boolean mIs64Bit;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
        }
    }

    public UploadProxy(Context context, Boolean bool, String str) {
    }

    private final void checkAttrBeforeReport(ReportData reportData) {
    }

    private final void reportForVersion1(ReportData reportData, IReporter.ReportCallback reportCallback) {
    }

    public final String getFileUploadUrl(int i2) {
    }

    public final String getJsonUploadUrl(int i2) {
    }

    public final String getMAppId() {
    }

    public final Context getMContext() {
    }

    public final String getMD5Params(ReportData reportData) {
    }

    public final Boolean getMIs64Bit() {
    }

    public final void reportFile(ReportData reportData, String str, IReporter.ReportCallback reportCallback) {
    }

    public final void reportJson(ReportData reportData, String str, IReporter.ReportCallback reportCallback) {
    }

    @Override // com.tencent.bugly.common.reporter.IReporter
    public boolean reportNow(ReportData reportData, IReporter.ReportCallback reportCallback) {
    }

    public final void setMAppId(String str) {
    }

    public final void setMContext(Context context) {
    }

    public final void setMIs64Bit(Boolean bool) {
    }
}
