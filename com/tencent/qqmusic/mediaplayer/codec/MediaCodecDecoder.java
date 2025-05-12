package com.tencent.qqmusic.mediaplayer.codec;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.NativeLibs;
import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;

@TargetApi(23)
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class MediaCodecDecoder extends BaseDecoder {
    private static final int CONTINUOUS_TIMEOUT_COUNT = 500;
    private static final String KEY_BIT_RATE = "bit-rate";
    private static final String KEY_PCM_ENCODING = null;
    private static final String TAG = "MediaCodecDecoder";
    private static final long TIMEOUT_AUTO_SEEK_INTERVAL_MS = 5000;
    private static final int TIMEOUT_US = 1000;
    private WeakReference<AudioTrack> mAudioTrackRef;
    private long mCurrentDecodeTime;
    private boolean mDecoderFinished;
    private long mFileSize;
    private AudioInformation mInfo;
    private MediaCodec mMediaCodec;
    private final MediaExtractor mMediaExtractor;
    private volatile byte[] mRemainBuffer;
    private SeekTable mSeekTable;

    /* renamed from: com.tencent.qqmusic.mediaplayer.codec.MediaCodecDecoder$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 extends MediaDataSource {
        public final /* synthetic */ MediaCodecDecoder this$0;
        public final /* synthetic */ IDataSource val$dataSource;

        public AnonymousClass1(MediaCodecDecoder mediaCodecDecoder, IDataSource iDataSource) {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j2, byte[] bArr, int i2, int i3) throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class BufferTimeoutException extends Exception {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class NullInputBufferException extends Exception {
    }

    private int decodeDataInternal(int i2, byte[] bArr) throws BufferTimeoutException {
    }

    public static AudioFormat.AudioType getAudioType(String str) throws IOException {
    }

    private static MediaFormat getMediaFormatByExtractor(MediaExtractor mediaExtractor) {
    }

    private boolean initAudioInformation(String str, int i2, MediaFormat mediaFormat, IDataSource iDataSource, AudioFormat.AudioType audioType) throws Exception {
    }

    private boolean initMediaCodecAndFormat(IDataSource iDataSource) throws Exception {
    }

    private int processInputOutputBuffer(MediaCodec.BufferInfo bufferInfo) throws NullInputBufferException {
    }

    private static void setAudioInformationByMediaFormat(AudioInformation audioInformation, MediaFormat mediaFormat, long j2) {
    }

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
    public int init(INativeDataSource iNativeDataSource) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int init(String str, boolean z) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int release() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int seekTo(int i2) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public void setAudioTrack(AudioTrack audioTrack) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    @TargetApi(23)
    public int init(IDataSource iDataSource) {
    }

    @TargetApi(16)
    private static AudioFormat.AudioType getAudioType(MediaExtractor mediaExtractor, IDataSource iDataSource) {
    }
}
