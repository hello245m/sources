package com.tencent.bugly.common.reporter;

import com.tencent.bugly.common.reporter.data.ReportData;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface IReporter {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ boolean reportNow$default(IReporter iReporter, ReportData reportData, ReportCallback reportCallback, int i2, Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface ReportCallback {

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static final class DefaultImpls {
            public static void onCached(ReportCallback reportCallback) {
            }
        }

        void onCached();

        void onFailure(int i2, String str, int i3, int i4);

        void onSuccess(int i2, int i3);
    }

    boolean reportNow(ReportData reportData, ReportCallback reportCallback);
}
