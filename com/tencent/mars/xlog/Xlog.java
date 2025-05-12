package com.tencent.mars.xlog;

import com.tencent.mars.xlog.Log;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class Xlog implements Log.LogImp {
    public static final int AppednerModeAsync = 0;
    public static final int AppednerModeSync = 1;
    public static final int LEVEL_ALL = 0;
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_ERROR = 4;
    public static final int LEVEL_FATAL = 5;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_NONE = 6;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARNING = 3;
    public static final int ZLIB_MODE = 0;
    public static final int ZSTD_COMPRESS_LEVEL1 = 1;
    public static final int ZSTD_COMPRESS_LEVEL2 = 2;
    public static final int ZSTD_COMPRESS_LEVEL3 = 3;
    public static final int ZSTD_COMPRESS_LEVEL4 = 4;
    public static final int ZSTD_COMPRESS_LEVEL5 = 5;
    public static final int ZSTD_COMPRESS_LEVEL6 = 6;
    public static final int ZSTD_COMPRESS_LEVEL7 = 7;
    public static final int ZSTD_COMPRESS_LEVEL8 = 8;
    public static final int ZSTD_COMPRESS_LEVEL9 = 9;
    public static final int ZSTD_MODE = 1;
    private static String mCacheDir = null;
    private static String mLogDir = null;
    private static String xlog_pubkey = "f802515cf046b4acceb98c23a104caa5533ff067d8bbb5c3e8a2baaa37c11d558c58669ea6f25134cbb9fcb7cd2d5e48d22a8ad4f000f874055f2d2f694d58af";

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class XLogConfig {
        public int cachedays;
        public String cachedir;
        public int compresslevel;
        public int compressmode;
        public int level;
        public String logdir;
        public int mode;
        public String nameprefix;
        public String pubkey;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class XLoggerInfo {
        public String filename;
        public String funcname;
        public int level;
        public int line;
        public long maintid;
        public long pid;
        public String tag;
        public long tid;
    }

    private static native void appenderOpen(XLogConfig xLogConfig);

    private static String decryptTag(String str) {
    }

    public static native void logWrite(XLoggerInfo xLoggerInfo, String str);

    public static void logWrite2(int i2, String str, String str2, String str3, int i3, int i4, long j2, long j3, String str4) {
    }

    public static native void logWrite2(long j2, int i2, String str, String str2, String str3, int i3, int i4, long j3, long j4, String str4);

    public static void open(boolean z, int i2, int i3, String str, String str2, String str3, int i4) {
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void appenderClose();

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void appenderFlush(long j2, boolean z);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void appenderOpen(int i2, int i3, String str, String str2, String str3, int i4) {
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native int getLogLevel(long j2);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native long getXlogInstance(String str);

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

    public native long newXlogInstance(XLogConfig xLogConfig);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public long openLogInstance(int i2, int i3, String str, String str2, String str3, int i4) {
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void releaseXlogInstance(String str);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void setAppenderMode(long j2, int i2);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void setConsoleLogOpen(long j2, boolean z);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void setMaxAliveTime(long j2, long j3);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void setMaxFileSize(long j2, long j3);
}
