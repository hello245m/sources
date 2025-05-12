package com.tencent.qqmusic.mediaplayer.upstream;

import com.tencent.qqmusic.mediaplayer.AudioFormat;
import java.io.IOException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class NativeDataSourceFactory {
    private static final String TAG = "NativeDataSourceFactory";
    private static final boolean soLoaded = false;

    /* renamed from: com.tencent.qqmusic.mediaplayer.upstream.NativeDataSourceFactory$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class AnonymousClass1 implements INativeDataSource {
        public final /* synthetic */ String val$filePath;

        public AnonymousClass1(String str) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource
        public AudioFormat.AudioType getAudioType() throws IOException {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource
        public long getNativeInstance() {
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.upstream.NativeDataSourceFactory$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class AnonymousClass2 implements INativeDataSource {
        public final /* synthetic */ String val$filePath;
        public final /* synthetic */ int val$needWrite;

        public AnonymousClass2(String str, int i2) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource
        public AudioFormat.AudioType getAudioType() throws IOException {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource
        public long getNativeInstance() {
        }
    }

    public static /* synthetic */ boolean access$000() {
    }

    public static INativeDataSource fileDataSource(String str) throws UnsatisfiedLinkError {
    }

    public static native long localFile(String str, int i2);

    public static INativeDataSource fileDataSource(String str, int i2) throws UnsatisfiedLinkError {
    }
}
