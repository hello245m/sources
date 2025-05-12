package com.tencent.qqmusic.mediaplayer;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class AudioPlayerConfigure {
    private static final String LIB_PREFIX = "lib";
    private static final String LIB_SUFFIX = ".so";
    private static final String TAG = "AudioPlayerConfigure";
    public static ISoLibraryLoader mISoLibraryLoader = null;
    public static int minAudioTrackWaitTimeMs = 300;
    private static boolean sIsNlogEnabled = false;

    /* renamed from: com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class AnonymousClass1 implements ISoLibraryLoader {
        @Override // com.tencent.qqmusic.mediaplayer.ISoLibraryLoader
        public String findLibPath(String str) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.ISoLibraryLoader
        public boolean load(String str) {
        }
    }

    public static boolean enableNativeLog(String str) {
    }

    private static byte[] findLibPath(byte[] bArr) {
    }

    public static ISoLibraryLoader getSoLibraryLoader() {
    }

    public static void setAudioTrackMinWaitTimeMs(int i2) {
    }

    public static void setLog(ILog iLog) {
    }

    public static void setSoLibraryLoader(ISoLibraryLoader iSoLibraryLoader) {
    }

    public static boolean enableNativeLog(String str, String str2) {
    }
}
