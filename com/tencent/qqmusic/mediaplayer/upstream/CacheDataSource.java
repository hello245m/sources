package com.tencent.qqmusic.mediaplayer.upstream;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Looper;
import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.DataRangeTracker;
import com.tencent.qqmusic.mediaplayer.downstream.IDataSink;
import com.tencent.qqmusic.mediaplayer.perf.Collectable;
import com.tencent.qqmusic.mediaplayer.perf.ErrorUploadCollector;
import com.tencent.qqmusic.mediaplayer.perf.PlayerInfoCollector;
import com.tencent.qqmusic.mediaplayer.upstream.Loader;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class CacheDataSource implements IDataSource, Collectable {
    private static final int CHUNK_LOAD_BUFFER_SIZE = 8192;
    private static final int DISCONTINUITY_THRESHOLD = 8192;
    public static final long NO_RESET_PENDING = Long.MIN_VALUE;
    private static final int PROFILE_ending = 10;
    private static final int PROFILE_isCached = 8;
    private static final int PROFILE_lock = 5;
    private static final int PROFILE_onBufferEnd = 7;
    private static final int PROFILE_onBufferStarted = 4;
    private static final int PROFILE_onBytesTransferred = 9;
    private static final int PROFILE_onBytesTransferring = 3;
    private static final int PROFILE_onReadContinuity = 1;
    private static final int PROFILE_onReadDiscontinuity = 2;
    private static final int PROFILE_readAt = 6;
    private static final int PROFILE_total = 0;
    private static final int READ_WAIT_TIMEOUT = 30000;
    private static final String TAG = "CacheDataSource";
    private static final String[] profiles = null;
    private final IDataSource cacheSource;
    private final DataRangeTracker cachedDataTracker;
    private long[] costs;
    private long currentLoadStartPosition;
    private Chunk currentLoadingChunk;
    private volatile boolean isToReleaseLock;
    private volatile boolean isWaitingForFirstPiece;
    private Listener listener;
    private boolean loadFinished;
    private final Loader loader;
    private long nextContinuousPosition;
    private boolean opened;
    public long pendingRestartPositionByte;
    public long pendingStartPositionByte;
    private TimerTask pendingTask;
    private Timer restartHandler;

    /* renamed from: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements Loader.Factory {
        public final /* synthetic */ IDataSink val$cacheSink;
        public final /* synthetic */ Looper val$eventLooper;
        public final /* synthetic */ IDataSource val$upStream;

        /* renamed from: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class C00761 extends DefaultLoader {
            public final /* synthetic */ AnonymousClass1 this$1;

            public C00761(AnonymousClass1 anonymousClass1, Looper looper, UriLoader uriLoader, Loader.Listener listener) {
            }

            @Override // com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader
            public IDataSink createCacheSink(StreamingRequest streamingRequest) {
            }

            @Override // com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader
            public IDataSource createUpStream(StreamingRequest streamingRequest) {
            }
        }

        public AnonymousClass1(Looper looper, IDataSource iDataSource, IDataSink iDataSink) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader.Factory
        public Loader createLoader(Loader.Listener listener) {
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass2 implements DataRangeTracker.LockJudgerCallback {
        public final /* synthetic */ CacheDataSource this$0;

        public AnonymousClass2(CacheDataSource cacheDataSource) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.DataRangeTracker.LockJudgerCallback
        public boolean isToAbandonLock() {
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass3 extends TimerTask {
        public final /* synthetic */ CacheDataSource this$0;
        public final /* synthetic */ long val$restartPosition;

        public AnonymousClass3(CacheDataSource cacheDataSource, long j2) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface Listener extends TransferListener {
        void onBufferEnded();

        void onBufferStarted(long j2);

        long onStreamingError(IOException iOException);

        void onStreamingFinished();

        void onUpStreamTransfer(long j2, long j3);
    }

    public CacheDataSource(IDataSource iDataSource, IDataSource iDataSource2, IDataSink iDataSink, Looper looper) {
    }

    public static /* synthetic */ boolean access$100(CacheDataSource cacheDataSource) {
    }

    public static /* synthetic */ Loader access$1000(CacheDataSource cacheDataSource) {
    }

    public static /* synthetic */ void access$1100(CacheDataSource cacheDataSource, long j2, long j3) {
    }

    public static /* synthetic */ void access$200(CacheDataSource cacheDataSource, long j2) {
    }

    public static /* synthetic */ boolean access$300(CacheDataSource cacheDataSource) throws IllegalStateException {
    }

    public static /* synthetic */ DataRangeTracker access$400(CacheDataSource cacheDataSource) {
    }

    public static /* synthetic */ long access$502(CacheDataSource cacheDataSource, long j2) {
    }

    public static /* synthetic */ Chunk access$602(CacheDataSource cacheDataSource, Chunk chunk) {
    }

    public static /* synthetic */ boolean access$702(CacheDataSource cacheDataSource, boolean z) {
    }

    public static /* synthetic */ Listener access$800(CacheDataSource cacheDataSource) {
    }

    public static /* synthetic */ boolean access$900(CacheDataSource cacheDataSource) {
    }

    private void clearState() {
    }

    private boolean isCached(long j2, int i2) {
    }

    private void onReadContinuity(long j2) {
    }

    private void onReadDiscontinuity(long j2, boolean z) throws IOException {
    }

    private void reportProfiling() {
    }

    private synchronized void restartLoading(long j2) {
    }

    @SuppressLint({"DefaultLocale"})
    private synchronized void scheduleRestart(long j2, long j3) {
    }

    private synchronized boolean startLoadingIfNeeded() throws IllegalStateException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.perf.Collectable
    public void accept(ErrorUploadCollector errorUploadCollector) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.perf.Collectable
    public void accept(PlayerInfoCollector playerInfoCollector) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public synchronized boolean continueLoadIfNeeded() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public AudioFormat.AudioType getAudioType() throws IOException {
    }

    public long getBufferTimeout(long j2, int i2) {
    }

    public Loader getLoader() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public long getSize() throws IOException {
    }

    public boolean isCacheFileComplete() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public void open() throws IOException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public int readAt(long j2, byte[] bArr, int i2, int i3) throws IOException {
    }

    public void releaseLock() {
    }

    public void setListener(Listener listener) {
    }

    public boolean waitForFirstPiece(int i2, long j2) throws InterruptedException {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class LoaderListener implements Loader.Listener {
        private long loadedPosition;
        public final /* synthetic */ CacheDataSource this$0;

        private LoaderListener(CacheDataSource cacheDataSource) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader.Listener
        public synchronized void onLoadCancelled(boolean z) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader.Listener
        public void onLoadCompleted() {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader.Listener
        public void onLoadError(IOException iOException) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader.Listener
        public void onLoadProgress(long j2, long j3) {
        }

        public /* synthetic */ LoaderListener(CacheDataSource cacheDataSource, AnonymousClass1 anonymousClass1) {
        }
    }

    public CacheDataSource(IDataSource iDataSource, Loader.Factory factory) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class Factory {

        /* renamed from: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource$Factory$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static class AnonymousClass1 extends FileDataSource {
            public final /* synthetic */ File val$bufferFile;

            public AnonymousClass1(String str, File file) {
            }

            @Override // com.tencent.qqmusic.mediaplayer.upstream.FileDataSource, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
            }
        }

        /* renamed from: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource$Factory$2, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static class AnonymousClass2 implements Loader.Factory {
            public final /* synthetic */ File val$bufferFile;
            public final /* synthetic */ UriLoader val$uriLoader;

            /* renamed from: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource$Factory$2$1, reason: invalid class name */
            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
            public class AnonymousClass1 extends DefaultLoader {
                public final /* synthetic */ AnonymousClass2 this$0;

                public AnonymousClass1(AnonymousClass2 anonymousClass2, Looper looper, UriLoader uriLoader, Loader.Listener listener) {
                }

                @Override // com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader
                public IDataSink createCacheSink(StreamingRequest streamingRequest) {
                }

                @Override // com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader
                public IDataSource createUpStream(StreamingRequest streamingRequest) {
                }
            }

            public AnonymousClass2(UriLoader uriLoader, File file) {
            }

            @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader.Factory
            public Loader createLoader(Loader.Listener listener) {
            }
        }

        private static Loader.Factory createDefaultLoaderFactory(File file, UriLoader uriLoader) {
        }

        public static CacheDataSource createFromLoader(File file, Loader.Factory factory) {
        }

        public static CacheDataSource createFromUri(File file, Uri uri) {
        }

        public static CacheDataSource createFromUriLoader(UriLoader uriLoader, String str) throws DataSourceException {
        }

        private static void ensureFile(File file) throws IOException {
        }

        public static CacheDataSource createFromUriLoader(File file, UriLoader uriLoader) {
        }
    }
}
