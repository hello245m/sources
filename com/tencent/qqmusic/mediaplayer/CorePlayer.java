package com.tencent.qqmusic.mediaplayer;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent;
import com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener;
import com.tencent.qqmusic.mediaplayer.codec.BaseDecoder;
import com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer;
import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class CorePlayer implements Runnable, BaseDecodeDataComponent.HandleDecodeDataCallback {
    private static final AtomicInteger PLAYER_ID_CREATOR = null;
    private static final String TAG = "CorePlayer";
    public final List<IAudioListener> mAudioEffectList;
    private final PlayerCallback mCallback;
    private IDataSource mDataSource;
    private final BaseDecoder mDecoder;
    private final Handler mEventHandler;
    private final QMThreadExecutor mExecutor;
    public AudioInformation mInformation;
    private boolean mIsAudioEffectParamPrepared;
    public volatile boolean mIsExit;
    private INativeDataSource mNativeDataSource;
    private BaseDecodeDataComponent mPcmCompnent;
    private String mPlayPath;
    private int mPlayerID;
    private int mPlayerMode;
    private Float mSpeedToSet;
    private final PlayerStateRunner mStateRunner;
    private int mTargetBitDepth;
    public final List<IAudioListener> mTerminalAudioEffectList;
    private String mThreadName;
    private PerformanceTracer performanceTracer;

    public CorePlayer(IDataSource iDataSource, INativeDataSource iNativeDataSource, PlayerCallback playerCallback, Looper looper, BaseDecoder baseDecoder, QMThreadExecutor qMThreadExecutor) {
    }

    public static /* synthetic */ int access$002(CorePlayer corePlayer, int i2) {
    }

    public static /* synthetic */ boolean access$102(CorePlayer corePlayer, boolean z) {
    }

    private String axiliary(String str) {
    }

    private void callExceptionCallback(int i2, int i3) {
    }

    private void decodeEndOrFailed(int i2, int i3) {
    }

    private void exitNotCallback() {
    }

    private boolean isPathExternalStorage(String str) {
    }

    public void addAudioListener(IAudioListener iAudioListener) {
    }

    public void changePlayThreadPriorityImmediately() {
    }

    public SeekTable createSeekTable() {
    }

    public void flush() {
    }

    public long getCurPosition() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.HandleDecodeDataCallback
    public long getCurPositionByDecoder() {
    }

    public AudioInformation getCurrentAudioInformation() {
    }

    public long getDuration() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.HandleDecodeDataCallback
    public long getMinPcmBufferSize() {
    }

    public int getPlayerMode() {
    }

    public int getPlayerState() {
    }

    public int getSessionId() {
    }

    public float getSpeed() {
    }

    public synchronized boolean hasDecodeData() {
    }

    public synchronized boolean hasDecodeDataSuccess() {
    }

    public boolean isInit() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.HandleDecodeDataCallback
    public void onAudioTrackChanged(AudioTrack audioTrack) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.HandleDecodeDataCallback
    public void onPullDecodeDataEndOrFailed(int i2, int i3) {
    }

    public void pause(boolean z) {
    }

    public void play() {
    }

    public void prepare() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.HandleDecodeDataCallback
    public int pullDecodeData(int i2, byte[] bArr) {
    }

    public void release() {
    }

    public void removeAudioListener(IAudioListener iAudioListener) {
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    public void seek(int i2) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.HandleDecodeDataCallback
    public int seekTo(int i2) {
    }

    public void setAudioStreamType(int i2) {
    }

    public void setLeastCommonMultiple(int i2) {
    }

    public void setPlayPath(String str) {
    }

    public void setPlayerMode(int i2) {
    }

    public void setSpeed(float f) {
    }

    public void setThreadName(String str) {
    }

    public void setVolume(float f, float f2) {
    }

    public void stop() {
    }

    private void callExceptionCallback(int i2, int i3, int i4) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AudioListenerDelegate implements IAudioListener {
        private final boolean mIsTerminal;
        public final /* synthetic */ CorePlayer this$0;

        public AudioListenerDelegate(CorePlayer corePlayer, boolean z) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
        public long getActualTime(long j2) {
        }

        public List<IAudioListener> getAudioListeners() {
        }

        @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
        public boolean isEnabled() {
        }

        @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
        public boolean isTerminal() {
        }

        @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
        public boolean onPcm(BufferInfo bufferInfo, BufferInfo bufferInfo2, long j2) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
        public long onPlayerReady(int i2, AudioInformation audioInformation, long j2) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
        public void onPlayerSeekComplete(long j2) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
        public void onPlayerStopped() {
        }

        @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
        public boolean onPcm(FloatBufferInfo floatBufferInfo, FloatBufferInfo floatBufferInfo2, long j2) {
        }
    }
}
