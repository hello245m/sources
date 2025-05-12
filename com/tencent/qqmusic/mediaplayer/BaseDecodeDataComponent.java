package com.tencent.qqmusic.mediaplayer;

import android.media.AudioTrack;
import android.os.Handler;
import com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener;
import com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer;
import com.tencent.qqmusic.mediaplayer.util.WaitNotify;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class BaseDecodeDataComponent {
    public static final int CALL_PREPARED_DELAY_TIME = 20;
    private static int MAX_PLAY_SAMPLE_RATE = 0;
    private static final String TAG = "BaseDecodeDataComponent";
    public boolean isUseFloatForHighDepth;
    public final IAudioListener mAudioEffectListener;
    public int mAudioStreamType;
    public AudioTrack mAudioTrack;
    public int mBuffSize;
    public final PlayerCallback mCallback;
    public final CorePlayer mCorePlayer;
    public boolean mCreateAudioTrackFail;
    public long mCurPosition;
    public final BufferInfo mDecodeBufferInfo;
    private final Handler mEventHandler;
    public final FloatBufferInfo mFloatBufferInfo;
    public final HandleDecodeDataCallback mHandleDecodeDataCallback;
    public boolean mHasDecode;
    public boolean mHasDecodeSuccess;
    public boolean mHasInit;
    public final AudioInformation mInformation;
    public int mLeastCommonMultiple;
    public volatile boolean mNeedChangePlayThreadPriority;
    private final int mPlayerID;
    public final WaitNotify mSignalControl;
    public Float mSpeedToSet;
    public final PlayerStateRunner mStateRunner;
    public int mTargetBitDepth;
    public long mTargetPlaySample;
    public final IAudioListener mTerminalAudioEffectListener;
    public PerformanceTracer performanceTracer;

    /* renamed from: com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements WaitNotify.WaitListener {
        public final /* synthetic */ BaseDecodeDataComponent this$0;

        public AnonymousClass1(BaseDecodeDataComponent baseDecodeDataComponent) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.util.WaitNotify.WaitListener
        public boolean keepWaiting() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface HandleDecodeDataCallback {
        long getCurPositionByDecoder();

        long getMinPcmBufferSize();

        void onAudioTrackChanged(AudioTrack audioTrack);

        void onPullDecodeDataEndOrFailed(int i2, int i3);

        int pullDecodeData(int i2, byte[] bArr);

        int seekTo(int i2);
    }

    public BaseDecodeDataComponent(CorePlayer corePlayer, PlayerStateRunner playerStateRunner, AudioInformation audioInformation, PlayerCallback playerCallback, HandleDecodeDataCallback handleDecodeDataCallback, Handler handler, int i2, IAudioListener iAudioListener, IAudioListener iAudioListener2) {
    }

    private void destroyAudioListeners() {
    }

    public static int getAudioTrackPosition(long j2, AudioTrack audioTrack) {
    }

    public static AudioTrack instantiateAudioTrackCompat(int i2, int i3, int i4, int i5, int i6, int i7) {
    }

    public String axiliary(String str) {
    }

    public long calculatePcmPlayTime(byte[] bArr, int i2, int i3, long j2) {
    }

    public void callExceptionCallback(int i2, int i3) {
    }

    public void changePlayThreadPriorityImmediately() {
    }

    public void convertBytePcmToFloatPcm(BufferInfo bufferInfo, FloatBufferInfo floatBufferInfo) {
    }

    public void doWaitForPaused() {
    }

    public void flush() {
    }

    public abstract int getAudioStreamType();

    public abstract long getCurPosition();

    public int getMaxSupportSampleRate() {
    }

    public int getMinBufferSize(long j2, int i2, int i3, int i4, int i5) {
    }

    public int getPlayerState() {
    }

    public int getSessionId() {
    }

    public float getSpeed() {
    }

    public abstract void handleDecodeData() throws Throwable;

    public void handleHighBitDepth(BufferInfo bufferInfo, BufferInfo bufferInfo2) {
    }

    public void handleHighSample(BufferInfo bufferInfo, BufferInfo bufferInfo2) {
    }

    public synchronized boolean hasDecodeData() {
    }

    public synchronized boolean hasDecodeDataSuccess() {
    }

    public void initAudioListeners(int i2, AudioInformation audioInformation, long j2) {
    }

    public synchronized boolean isCompleted() {
    }

    public synchronized boolean isError() {
    }

    public synchronized boolean isIdle() {
    }

    public boolean isInit() {
    }

    public synchronized boolean isPaused() {
    }

    public synchronized boolean isPlaying() {
    }

    public synchronized boolean isStopped() {
    }

    public boolean isSupportHighBitDepth() {
    }

    public void notifySeekCompleteForAudioListeners(long j2) {
    }

    public void pause(boolean z) {
    }

    public void play() {
    }

    public void postRunnable(Runnable runnable, int i2) {
    }

    public void refreshTimeAndNotify(int i2) {
    }

    public void release() {
    }

    public void releaseNotify() {
    }

    public void seek(int i2) {
    }

    public void setAudioStreamType(int i2) {
    }

    public void setAudioTrack(AudioTrack audioTrack) {
    }

    public void setLeastCommonMultiple(int i2) {
    }

    public void setPerformanceTracer(PerformanceTracer performanceTracer) {
    }

    public void setSpeed(float f) {
    }

    public void setVolume(float f, float f2) {
    }

    public void stop() {
    }

    private void callExceptionCallback(int i2, int i3, int i4) {
    }

    public long calculatePcmPlayTime(float[] fArr, int i2, long j2) {
    }
}
