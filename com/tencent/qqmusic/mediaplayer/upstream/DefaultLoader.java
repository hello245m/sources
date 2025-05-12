package com.tencent.qqmusic.mediaplayer.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.qqmusic.mediaplayer.downstream.IDataSink;
import com.tencent.qqmusic.mediaplayer.upstream.Loader;
import com.tencent.qqmusic.mediaplayer.upstream.UriLoader;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class DefaultLoader extends Thread implements Loader {
    private static final int MSG_LOAD_CANCELLED = 5;
    private static final int MSG_LOAD_COMPLETED = 3;
    private static final int MSG_LOAD_ERROR = 4;
    private static final int MSG_LOAD_PROGRESS = 2;
    private static final int MSG_LOAD_STARTED = 1;
    private static final int SIZE_UNSET = -1;
    private static final String TAG = "DefaultLoader";
    private final Chunk END_OF_QUEUE;
    private IDataSink cacheSink;
    private volatile boolean cancelled;
    private final BlockingQueue<Chunk> chunks;
    private final Handler eventHandler;
    private volatile boolean isLoading;
    private volatile boolean shutdown;
    private IDataSource upstream;
    private long upstreamSize;
    private final UriLoader uriLoader;

    /* renamed from: com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements Handler.Callback {
        public final /* synthetic */ DefaultLoader this$0;
        public final /* synthetic */ Loader.Listener val$listener;

        public AnonymousClass1(DefaultLoader defaultLoader, Loader.Listener listener) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass2 implements UriLoader.Callback {
        public final /* synthetic */ DefaultLoader this$0;

        public AnonymousClass2(DefaultLoader defaultLoader) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.UriLoader.Callback
        public void onCancelled() {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.UriLoader.Callback
        public void onFailed(Throwable th) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.UriLoader.Callback
        public void onSucceed(StreamingRequest streamingRequest) {
        }
    }

    public DefaultLoader(Looper looper, UriLoader uriLoader, Loader.Listener listener) {
    }

    public static /* synthetic */ boolean access$002(DefaultLoader defaultLoader, boolean z) {
    }

    public static /* synthetic */ boolean access$100(DefaultLoader defaultLoader) {
    }

    public static /* synthetic */ long access$202(DefaultLoader defaultLoader, long j2) {
    }

    public static /* synthetic */ Handler access$300(DefaultLoader defaultLoader) {
    }

    public static /* synthetic */ IDataSink access$402(DefaultLoader defaultLoader, IDataSink iDataSink) {
    }

    public static /* synthetic */ IDataSource access$502(DefaultLoader defaultLoader, IDataSource iDataSource) {
    }

    private boolean loadChunk(Chunk chunk) throws IOException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader
    public void cancelLoading() {
    }

    public abstract IDataSink createCacheSink(StreamingRequest streamingRequest);

    public abstract IDataSource createUpStream(StreamingRequest streamingRequest);

    @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader
    public long getUpstreamSize() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader
    public boolean isLoading() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader
    public void prepare() throws IOException {
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader
    public void shutdown() throws InterruptedException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader
    public void startLoading(Chunk chunk) {
    }
}
