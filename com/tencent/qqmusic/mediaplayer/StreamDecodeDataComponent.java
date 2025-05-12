package com.tencent.qqmusic.mediaplayer;

import android.os.Handler;
import com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent;
import com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener;
import com.tencent.qqmusic.mediaplayer.util.WaitNotify;
import java.util.Stack;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class StreamDecodeDataComponent extends BaseDecodeDataComponent {
    private static final int MAX_AUDIO_TRACK_BUFFER_TIME = 1;
    private static final int MIN_AUDIO_TRACK_BUFFER_TIMES = 1;
    private static final String TAG = "StreamDecodeDataComponent";
    private static final int USE_AUDIO_TRACK_TIME_THRESHOLD = 5000;
    private long mCurrentFrameCount;
    private boolean mNeedFlush;
    private final Stack<Integer> mSeekRecord;
    private int mTrackBufferSizeInByte;

    /* renamed from: com.tencent.qqmusic.mediaplayer.StreamDecodeDataComponent$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ StreamDecodeDataComponent this$0;

        public AnonymousClass1(StreamDecodeDataComponent streamDecodeDataComponent) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.StreamDecodeDataComponent$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass2 implements WaitNotify.WaitListener {
        public final /* synthetic */ StreamDecodeDataComponent this$0;

        public AnonymousClass2(StreamDecodeDataComponent streamDecodeDataComponent) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.util.WaitNotify.WaitListener
        public boolean keepWaiting() {
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.StreamDecodeDataComponent$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ StreamDecodeDataComponent this$0;

        public AnonymousClass3(StreamDecodeDataComponent streamDecodeDataComponent) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public StreamDecodeDataComponent(CorePlayer corePlayer, PlayerStateRunner playerStateRunner, AudioInformation audioInformation, PlayerCallback playerCallback, BaseDecodeDataComponent.HandleDecodeDataCallback handleDecodeDataCallback, Handler handler, int i2, IAudioListener iAudioListener, IAudioListener iAudioListener2) {
    }

    private void addSeekRecord(int i2) {
    }

    private boolean createAudioTrack() {
    }

    private long getCalcBitMinSize(AudioInformation audioInformation) {
    }

    private int getGcd(int i2, int i3) {
    }

    private int getLcm(int i2, int i3) {
    }

    private BufferInfo initTempBufferInfoIfNeeded(BufferInfo bufferInfo, int i2) {
    }

    private FloatBufferInfo initTempFloatBufferInfoIfNeeded(FloatBufferInfo floatBufferInfo, int i2) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent
    public void flush() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent
    public int getAudioStreamType() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent
    public long getCurPosition() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent
    public void handleDecodeData() throws Throwable {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent
    public void pause(boolean z) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent
    public void release() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent
    public void seek(int i2) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent
    public void setAudioStreamType(int i2) {
    }
}
