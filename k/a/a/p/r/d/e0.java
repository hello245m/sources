package k.a.a.p.r.d;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import k.a.a.p.i;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class e0<T> implements k.a.a.p.l<T, Bitmap> {
    public static final k.a.a.p.i<Long> d = null;
    public static final k.a.a.p.i<Integer> e = null;
    public static final e f = null;
    public final f<T> a;
    public final k.a.a.p.p.a0.e b;
    public final e c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements i.b<Long> {
        public final ByteBuffer a;

        @Override // k.a.a.p.i.b
        public /* bridge */ /* synthetic */ void a(byte[] bArr, Long l2, MessageDigest messageDigest) {
        }

        public void b(byte[] bArr, Long l2, MessageDigest messageDigest) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements i.b<Integer> {
        public final ByteBuffer a;

        @Override // k.a.a.p.i.b
        public /* bridge */ /* synthetic */ void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
        }

        public void b(byte[] bArr, Integer num, MessageDigest messageDigest) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class c implements f<AssetFileDescriptor> {
        public c() {
        }

        @Override // k.a.a.p.r.d.e0.f
        public /* bridge */ /* synthetic */ void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
        }

        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
        }

        public /* synthetic */ c(a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class d implements f<ByteBuffer> {

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a extends MediaDataSource {
            public final /* synthetic */ ByteBuffer a;

            public a(d dVar, ByteBuffer byteBuffer) {
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j2, byte[] bArr, int i2, int i3) {
            }
        }

        @Override // k.a.a.p.r.d.e0.f
        public /* bridge */ /* synthetic */ void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
        }

        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class e {
        public MediaMetadataRetriever a() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class g implements f<ParcelFileDescriptor> {
        @Override // k.a.a.p.r.d.e0.f
        public /* bridge */ /* synthetic */ void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
        }

        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class h extends RuntimeException {
    }

    public e0(k.a.a.p.p.a0.e eVar, f<T> fVar) {
    }

    public static k.a.a.p.l<AssetFileDescriptor, Bitmap> c(k.a.a.p.p.a0.e eVar) {
    }

    public static k.a.a.p.l<ByteBuffer, Bitmap> d(k.a.a.p.p.a0.e eVar) {
    }

    public static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, long j2, int i2, int i3, int i4, n nVar) {
    }

    public static Bitmap f(MediaMetadataRetriever mediaMetadataRetriever, long j2, int i2) {
    }

    @TargetApi(27)
    public static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j2, int i2, int i3, int i4, n nVar) {
    }

    public static k.a.a.p.l<ParcelFileDescriptor, Bitmap> h(k.a.a.p.p.a0.e eVar) {
    }

    @Override // k.a.a.p.l
    public boolean a(T t2, k.a.a.p.j jVar) {
    }

    @Override // k.a.a.p.l
    public k.a.a.p.p.v<Bitmap> b(T t2, int i2, int i3, k.a.a.p.j jVar) throws IOException {
    }

    public e0(k.a.a.p.p.a0.e eVar, f<T> fVar, e eVar2) {
    }
}
