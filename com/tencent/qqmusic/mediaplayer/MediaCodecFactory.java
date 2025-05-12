package com.tencent.qqmusic.mediaplayer;

import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class MediaCodecFactory {
    private static final String TAG = "MediaCodecFactory";
    private static HashMap<AudioFormat.AudioType, Class<? extends IAudioRecognition>> mDecoderMap;
    private static ArrayList<AudioFormat.AudioType> mSupportAudioType;

    public static IAudioRecognition createDecoderByType(AudioFormat.AudioType audioType) {
    }

    public static ArrayList<AudioFormat.AudioType> getSupportAudioType() {
    }

    private static void registerDecoder(AudioFormat.AudioType audioType, Class<? extends IAudioRecognition> cls) {
    }

    public static void unRegisterDecoder(AudioFormat.AudioType audioType) {
    }
}
