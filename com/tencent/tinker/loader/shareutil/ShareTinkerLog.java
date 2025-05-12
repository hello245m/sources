package com.tencent.tinker.loader.shareutil;

import android.os.Handler;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ShareTinkerLog {
    public static final TinkerLogImp debugLog = null;
    public static final TinkerLogImp[] tinkerLogImpRef = null;
    public static final Handler[] tinkerLogInlineFenceRef = null;

    /* renamed from: com.tencent.tinker.loader.shareutil.ShareTinkerLog$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class AnonymousClass1 implements TinkerLogImp {
        @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
        public void d(String str, String str2, Object... objArr) {
        }

        @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
        public void e(String str, String str2, Object... objArr) {
        }

        @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
        public void i(String str, String str2, Object... objArr) {
        }

        @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
        public void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
        }

        @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
        public void v(String str, String str2, Object... objArr) {
        }

        @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
        public void w(String str, String str2, Object... objArr) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface TinkerLogImp {
        void d(String str, String str2, Object... objArr);

        void e(String str, String str2, Object... objArr);

        void i(String str, String str2, Object... objArr);

        void printErrStackTrace(String str, Throwable th, String str2, Object... objArr);

        void v(String str, String str2, Object... objArr);

        void w(String str, String str2, Object... objArr);
    }

    public static void d(String str, String str2, Object... objArr) {
    }

    public static void e(String str, String str2, Object... objArr) {
    }

    public static TinkerLogImp getDefaultImpl() {
    }

    public static TinkerLogImp getImpl() {
    }

    public static Handler getInlineFence() {
    }

    public static void i(String str, String str2, Object... objArr) {
    }

    public static void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
    }

    public static void printLog(int i2, String str, String str2, Object... objArr) {
    }

    public static void printPendingLogs() {
    }

    public static void setTinkerLogImp(TinkerLogImp tinkerLogImp) {
    }

    public static void w(String str, String str2, Object... objArr) {
    }

    public static void printLog(String str, Throwable th, String str2, Object... objArr) {
    }
}
