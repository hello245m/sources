package com.tencent.qqmusic.mediaplayer.codec;

import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.NativeLibs;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class NativeDecoder extends BaseDecoder {
    private static final String TAG = "NativeDecoder";
    private long mNativePointer;
    private final ReadWriteLock mReadWriteLock;

    private native int nativeDecode(long j2, byte[] bArr, int i2, int i3);

    private native AudioInformation nativeGetAudioInformation(long j2);

    private native long nativeGetBytePositionOfTime(long j2, long j3);

    private native long nativeGetCurrentPosition(long j2);

    private native int nativeGetDetailErrorCode(long j2);

    private native String nativeGetDetailErrorDescription(long j2);

    private native long nativeGetDuration(long j2);

    private native long nativeGetMinBufferSize(long j2);

    private native long[] nativeInit(long j2);

    private native long[] nativeInit(IDataSource iDataSource);

    private native int nativeRelease(long j2);

    private native long nativeSeekTo(long j2, long j3);

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int decodeData(int i2, byte[] bArr) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public AudioInformation getAudioInformation() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public long getBytePositionOfTime(long j2) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public long getCurrentTime() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public long getDuration() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int getErrorCodeMask() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public long getMinBufferSize() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public List<NativeLibs> getNativeLibs() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int init(IDataSource iDataSource) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int release() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int seekTo(int i2) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int init(INativeDataSource iNativeDataSource) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int init(String str, boolean z) {
    }
}
