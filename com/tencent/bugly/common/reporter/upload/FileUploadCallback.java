package com.tencent.bugly.common.reporter.upload;

import com.tencent.bugly.common.reporter.IReporter;
import com.tencent.bugly.common.reporter.data.ReportData;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class FileUploadCallback implements IReporter.ReportCallback {
    private final IReporter.ReportCallback callback;
    private final ReportData reportData;

    public FileUploadCallback(ReportData reportData, IReporter.ReportCallback reportCallback) {
    }

    public final IReporter.ReportCallback getCallback() {
    }

    public final ReportData getReportData() {
    }

    @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
    public void onCached() {
    }

    @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
    public void onFailure(int i2, String str, int i3, int i4) {
    }

    @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
    public void onSuccess(int i2, int i3) {
    }
}
