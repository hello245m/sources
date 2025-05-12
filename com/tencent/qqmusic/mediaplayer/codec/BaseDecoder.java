package com.tencent.qqmusic.mediaplayer.codec;

import android.media.AudioTrack;
import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.NativeLibs;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class BaseDecoder {
    private AudioFormat.AudioType mAudioType;
    private final boolean mHasLoadSoSuccess;
    public int mNativeApeDecoderRef;

    private void throwIfSoNotLoadSuccess() {
    }

    public int decodeData(int i2, byte[] bArr) {
    }

    public AudioInformation getAudioInformation() {
    }

    public AudioFormat.AudioType getAudioType() {
    }

    public abstract long getBytePositionOfTime(long j2);

    public long getCurrentTime() {
    }

    public long getDuration() {
    }

    public int getErrorCodeMask() {
    }

    public long getMinBufferSize() {
    }

    public abstract List<NativeLibs> getNativeLibs();

    public int init(String str, boolean z) {
    }

    public int release() {
    }

    public int seekTo(int i2) {
    }

    public void setAudioTrack(AudioTrack audioTrack) {
    }

    public void setAudioType(AudioFormat.AudioType audioType) {
    }

    public int init(IDataSource iDataSource) {
    }

    public int init(INativeDataSource iNativeDataSource) {
    }
}
