package com.tencent.mars.xlog;

import android.content.Context;
import android.os.Handler;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class Log {
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_ERROR = 4;
    public static final int LEVEL_FATAL = 5;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_NONE = 6;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARNING = 3;
    private static final String SYS_INFO = null;
    private static final String TAG = "mars.xlog.log";
    private static LogImp debugLog = null;
    private static int level = 6;
    private static LogImp logImp;
    private static Map<String, LogInstance> sLogInstanceMap;
    public static Context toastSupportContext;

    /* renamed from: com.tencent.mars.xlog.Log$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements LogImp {
        private Handler handler;

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void appenderClose() {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void appenderFlush(long j2, boolean z) {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void appenderOpen(int i2, int i3, String str, String str2, String str3, int i4) {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public int getLogLevel(long j2) {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public long getXlogInstance(String str) {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void logD(long j2, String str, String str2, String str3, int i2, int i3, long j3, long j4, String str4) {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void logE(long j2, String str, String str2, String str3, int i2, int i3, long j3, long j4, String str4) {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void logF(long j2, String str, String str2, String str3, int i2, int i3, long j3, long j4, String str4) {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void logI(long j2, String str, String str2, String str3, int i2, int i3, long j3, long j4, String str4) {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void logV(long j2, String str, String str2, String str3, int i2, int i3, long j3, long j4, String str4) {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void logW(long j2, String str, String str2, String str3, int i2, int i3, long j3, long j4, String str4) {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void moveLogsFromCacheDirToLogDir() {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public long openLogInstance(int i2, int i3, String str, String str2, String str3, int i4) {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void releaseXlogInstance(String str) {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void setAppenderMode(long j2, int i2) {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void setConsoleLogOpen(long j2, boolean z) {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void setMaxAliveTime(long j2, long j3) {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void setMaxFileSize(long j2, long j3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface LogImp {
        void appenderClose();

        void appenderFlush(long j2, boolean z);

        void appenderOpen(int i2, int i3, String str, String str2, String str3, int i4);

        int getLogLevel(long j2);

        long getXlogInstance(String str);

        void logD(long j2, String str, String str2, String str3, int i2, int i3, long j3, long j4, String str4);

        void logE(long j2, String str, String str2, String str3, int i2, int i3, long j3, long j4, String str4);

        void logF(long j2, String str, String str2, String str3, int i2, int i3, long j3, long j4, String str4);

        void logI(long j2, String str, String str2, String str3, int i2, int i3, long j3, long j4, String str4);

        void logV(long j2, String str, String str2, String str3, int i2, int i3, long j3, long j4, String str4);

        void logW(long j2, String str, String str2, String str3, int i2, int i3, long j3, long j4, String str4);

        void moveLogsFromCacheDirToLogDir();

        long openLogInstance(int i2, int i3, String str, String str2, String str3, int i4);

        void releaseXlogInstance(String str);

        void setAppenderMode(long j2, int i2);

        void setConsoleLogOpen(long j2, boolean z);

        void setMaxAliveTime(long j2, long j3);

        void setMaxFileSize(long j2, long j3);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class LogInstance {
        private long mLogInstancePtr;
        private String mPrefix;

        public /* synthetic */ LogInstance(int i2, int i3, String str, String str2, String str3, int i4, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ long access$202(LogInstance logInstance, long j2) {
        }

        public void appenderFlush() {
        }

        public void appenderFlushSync() {
        }

        public void d(String str, String str2, Object... objArr) {
        }

        public void e(String str, String str2, Object... objArr) {
        }

        public void f(String str, String str2, Object... objArr) {
        }

        public int getLogLevel() {
        }

        public void i(String str, String str2, Object... objArr) {
        }

        public void iNoFormat(String str, String str2) {
        }

        public void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
        }

        public void setConsoleLogOpen(boolean z) {
        }

        public void v(String str, String str2, Object... objArr) {
        }

        public void w(String str, String str2, Object... objArr) {
        }

        private LogInstance(int i2, int i3, String str, String str2, String str3, int i4) {
        }
    }

    public static /* synthetic */ int access$000() {
    }

    public static /* synthetic */ LogImp access$300() {
    }

    public static void appenderClose() {
    }

    public static void appenderFlush() {
    }

    public static void appenderFlushSync() {
    }

    public static void appenderOpen(int i2, int i3, String str, String str2, String str3, int i4) {
    }

    public static void closeLogInstance(String str) {
    }

    public static void d(String str, String str2) {
    }

    public static void e(String str, String str2) {
    }

    public static void f(String str, String str2) {
    }

    public static LogImp getImpl() {
    }

    public static LogInstance getLogInstance(String str) {
    }

    public static int getLogLevel() {
    }

    public static String getSysInfo() {
    }

    public static void i(String str, String str2) {
    }

    public static void moveLogsFromCacheDirToLogDir() {
    }

    public static LogInstance openLogInstance(int i2, int i3, String str, String str2, String str3, int i4) {
    }

    public static void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
    }

    public static void setConsoleLogOpen(boolean z) {
    }

    public static void setLevel(int i2, boolean z) {
    }

    public static void setLogImp(LogImp logImp2) {
    }

    public static void v(String str, String str2) {
    }

    public static void w(String str, String str2) {
    }

    public static void d(String str, String str2, Object... objArr) {
    }

    public static void e(String str, String str2, Object... objArr) {
    }

    public static void f(String str, String str2, Object... objArr) {
    }

    public static void i(String str, String str2, Object... objArr) {
    }

    public static void v(String str, String str2, Object... objArr) {
    }

    public static void w(String str, String str2, Object... objArr) {
    }
}
