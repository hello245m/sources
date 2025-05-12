package com.tencent.qqmusic.mediaplayer.codec;

import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.SoNotFindException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IAudioRecognition {
    AudioFormat.AudioType getAudioType(String str, byte[] bArr) throws SoNotFindException;

    AudioFormat.AudioType guessAudioType(String str);
}
