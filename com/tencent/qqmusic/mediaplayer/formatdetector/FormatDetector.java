package com.tencent.qqmusic.mediaplayer.formatdetector;

import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class FormatDetector {
    private static final String TAG = "FormatDetector";
    private static final FormatDetector mInstance = null;
    public static boolean sIsLoadSuccess;

    public static AudioFormat.AudioType getAudioFormat(String str) throws IllegalArgumentException {
    }

    public static AudioFormat.AudioType getAudioType(String str) {
    }

    public static AudioFormat.AudioType getAudioTypeFromExtension(String str) {
    }

    private native int getFormat(String str, boolean z);

    private native int getFormatFromDataSource(IDataSource iDataSource, boolean z);

    public static AudioFormat.AudioType getAudioFormat(String str, boolean z) throws IllegalArgumentException {
    }

    public static AudioFormat.AudioType getAudioFormat(IDataSource iDataSource, boolean z) throws IllegalArgumentException {
    }

    public static AudioFormat.AudioType getAudioType(IDataSource iDataSource) throws IllegalArgumentException {
    }
}
