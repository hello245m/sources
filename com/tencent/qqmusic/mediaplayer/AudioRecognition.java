package com.tencent.qqmusic.mediaplayer;

import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.codec.BaseDecoder;
import com.tencent.qqmusic.mediaplayer.codec.NativeDecoder;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class AudioRecognition {
    private static final int READ_FILE_HEADER_SIZE = 64;
    private static String TAG = "AudioRecognition";
    private static HashMap<String, AudioFormat.AudioType> mGuessFormatResultCache;
    private static HashMap<String, AudioFormat.AudioType> mRecognitionResultCache;

    public static int calcBitDept(long j2, long j3, int i2, long j4) {
    }

    public static int getAudioBitDept(BaseDecoder baseDecoder, AudioInformation audioInformation) {
    }

    public static NativeDecoder getDecoderFormFile(String str) {
    }

    public static AudioFormat.AudioType guessFormat(String str) {
    }

    public static AudioFormat.AudioType recognitionAudioFormatByExtensions(String str) {
    }

    public static AudioFormat.AudioType recognitionAudioFormatExactly(String str) throws IOException {
    }
}
