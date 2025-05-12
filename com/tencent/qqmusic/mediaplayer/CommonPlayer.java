package com.tencent.qqmusic.mediaplayer;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener;
import com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService;
import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.DataSourceException;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSourceFactory;
import com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.ListPlayerListenerCallback;
import com.tencent.qqmusic.mediaplayer.upstream.UriLoader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.Thread;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class CommonPlayer extends BaseMediaPlayer {
    private static final int INIT_STATE_CHECK_TIME = 5000;
    private static final String TAG = "CommonPlayer";
    private int currentState;
    private Looper eventLooper;
    private CorePlayer mAudioPlayer;
    private int mBufferPercentage;
    private final ListPlayerListenerCallback mCallback;
    private long mDuration;
    private final QMThreadExecutor mExecutor;
    private String mLocalPlayPath;
    private boolean mPreferMediaCodecDecode;
    private Float mSpeedToSet;
    private OpenedResources openedResources;

    /* renamed from: com.tencent.qqmusic.mediaplayer.CommonPlayer$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements QMThreadExecutor {
        @Override // com.tencent.qqmusic.mediaplayer.QMThreadExecutor
        public void execute(Runnable runnable, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.CommonPlayer$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass2 implements QMThreadExecutor {
        @Override // com.tencent.qqmusic.mediaplayer.QMThreadExecutor
        public void execute(Runnable runnable, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.CommonPlayer$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass3 implements IDataSourceFactory {
        public final /* synthetic */ CommonPlayer this$0;
        public final /* synthetic */ UriLoader val$uriLoader;

        public AnonymousClass3(CommonPlayer commonPlayer, UriLoader uriLoader) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSourceFactory
        public IDataSource createDataSource() throws DataSourceException {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSourceFactory
        public INativeDataSource createNativeDataSource() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class BufferListener implements CacheDataSource.Listener {
        public final /* synthetic */ CommonPlayer this$0;

        private BufferListener(CommonPlayer commonPlayer) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Listener
        public void onBufferEnded() {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Listener
        public void onBufferStarted(long j2) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.TransferListener
        public void onBytesTransferError(long j2, long j3, long j4) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.TransferListener
        public void onBytesTransferred(long j2, long j3) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.TransferListener
        public void onBytesTransferring(long j2, long j3) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Listener
        public long onStreamingError(IOException iOException) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Listener
        public void onStreamingFinished() {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.TransferListener
        public void onTransferEnd() {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.TransferListener
        public void onTransferStart() {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Listener
        public void onUpStreamTransfer(long j2, long j3) {
        }

        public /* synthetic */ BufferListener(CommonPlayer commonPlayer, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class CorePlayerCallback implements PlayerCallback {
        private final IDataSource mDataSource;
        private final IDataSourceFactory mFactory;
        public final /* synthetic */ CommonPlayer this$0;

        public /* synthetic */ CorePlayerCallback(CommonPlayer commonPlayer, IDataSourceFactory iDataSourceFactory, IDataSource iDataSource, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.PlayerCallback
        public void playThreadStart(CorePlayer corePlayer) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.PlayerCallback
        public void playerEnded(CorePlayer corePlayer) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.PlayerCallback
        public void playerException(CorePlayer corePlayer, int i2, int i3, int i4) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.PlayerCallback
        public void playerPaused(CorePlayer corePlayer) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.PlayerCallback
        public void playerPrepared(CorePlayer corePlayer) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.PlayerCallback
        public void playerSeekCompletion(CorePlayer corePlayer, int i2) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.PlayerCallback
        public void playerStarted(CorePlayer corePlayer) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.PlayerCallback
        public void playerStopped(CorePlayer corePlayer) {
        }

        private CorePlayerCallback(CommonPlayer commonPlayer, IDataSourceFactory iDataSourceFactory, IDataSource iDataSource) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class OpenedResources {
        private File bufferFile;
        private CacheDataSource dataSource;

        private OpenedResources() {
        }

        public static /* synthetic */ File access$602(OpenedResources openedResources, File file) {
        }

        public static /* synthetic */ CacheDataSource access$702(OpenedResources openedResources, CacheDataSource cacheDataSource) {
        }

        public void release() {
        }

        public /* synthetic */ OpenedResources(AnonymousClass1 anonymousClass1) {
        }
    }

    public CommonPlayer() {
    }

    public static /* synthetic */ CorePlayer access$000(CommonPlayer commonPlayer) {
    }

    public static /* synthetic */ ListPlayerListenerCallback access$100(CommonPlayer commonPlayer) {
    }

    public static /* synthetic */ String access$1000(CommonPlayer commonPlayer, String str) {
    }

    public static /* synthetic */ int access$1100(CommonPlayer commonPlayer) {
    }

    public static /* synthetic */ int access$1102(CommonPlayer commonPlayer, int i2) {
    }

    public static /* synthetic */ boolean access$200(CommonPlayer commonPlayer) {
    }

    public static /* synthetic */ boolean access$202(CommonPlayer commonPlayer, boolean z) {
    }

    public static /* synthetic */ void access$300(CommonPlayer commonPlayer, int i2, int i3, int i4) {
    }

    public static /* synthetic */ void access$400(CommonPlayer commonPlayer, IDataSource iDataSource) {
    }

    private String auxiliary(String str) {
    }

    private Looper insureEventLooper() {
    }

    private void onError(int i2, int i3) {
    }

    private void resetInternal() {
    }

    private void setDataSourceInternal(IDataSource iDataSource) {
    }

    private void setSpeedToCorePlayerIfNeeded(CorePlayer corePlayer) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void TransferStateTo(int i2) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void addAudioListener(IAudioListener iAudioListener) {
    }

    public void addPlayerListenerCallback(PlayerListenerCallback playerListenerCallback) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public SeekTable createSeekTable() throws IllegalStateException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void flush() {
    }

    public int getBufferedPercentage() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public AudioInformation getCurrentAudioInformation() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public long getCurrentPosition() throws IllegalStateException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public long getCurrentPositionFromFile() throws IllegalStateException {
    }

    public long getDecodePosition() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public int getDecoderType() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public int getDuration() throws IllegalStateException {
    }

    public int getPlayerMode() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public int getPlayerState() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public int getSessionId() {
    }

    public float getSpeed() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public boolean isPlaying() throws IllegalStateException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void pause() throws IllegalStateException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void pauseRealTime() throws IllegalStateException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void prepare() throws IllegalStateException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void prepareAsync() throws UnSupportMethodException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void release() throws IllegalStateException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void removeAudioListener(IAudioListener iAudioListener) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void reset() throws IllegalStateException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void seekTo(int i2) throws IllegalStateException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setAudioStreamType(int i2) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setDataSource(String str) throws IllegalStateException, IllegalArgumentException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setLeastCommonMultiple(int i2) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setPlayLocalPath(String str) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setPlayerListenerCallback(PlayerListenerCallback playerListenerCallback) {
    }

    public void setPlayerMode(int i2) {
    }

    public void setSpeed(float f) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setVolume(float f, float f2) throws IllegalStateException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setWakeMode(Context context, int i2) throws UnSupportMethodException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void start() throws IllegalStateException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void stop() throws IllegalStateException {
    }

    public CommonPlayer(PlayerListenerCallback playerListenerCallback) {
    }

    private void onError(int i2, int i3, int i4) {
    }

    public CommonPlayer(PlayerListenerCallback playerListenerCallback, Looper looper, boolean z, QMThreadExecutor qMThreadExecutor) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setDataSource(FileDescriptor fileDescriptor) throws UnSupportMethodException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setDataSource(Context context, Uri uri) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setDataSource(IMediaHTTPService iMediaHTTPService, Uri uri) throws IllegalStateException, IllegalArgumentException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setDataSource(IDataSourceFactory iDataSourceFactory) throws IllegalArgumentException, DataSourceException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setDataSource(TrackInfo trackInfo) throws IllegalArgumentException, IllegalStateException, DataSourceException, IOException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setDataSource(Context context, UriLoader uriLoader) throws DataSourceException {
    }
}
