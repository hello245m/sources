package k.d.a.a.o4;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import k.d.a.a.y2;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface r {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a {
        public final t a;
        public final MediaFormat b;
        public final y2 c;
        public final Surface d;
        public final MediaCrypto e;
        public final int f;

        public a(t tVar, MediaFormat mediaFormat, y2 y2Var, Surface surface, MediaCrypto mediaCrypto, int i2) {
        }

        public static a a(t tVar, MediaFormat mediaFormat, y2 y2Var, MediaCrypto mediaCrypto) {
        }

        public static a b(t tVar, MediaFormat mediaFormat, y2 y2Var, Surface surface, MediaCrypto mediaCrypto) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b {
        r a(a aVar) throws IOException;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface c {
        void a(r rVar, long j2, long j3);
    }

    boolean a();

    void b(int i2, int i3, k.d.a.a.l4.c cVar, long j2, int i4);

    MediaFormat c();

    void d(Bundle bundle);

    void e(int i2, long j2);

    int f();

    void flush();

    int g(MediaCodec.BufferInfo bufferInfo);

    void h(c cVar, Handler handler);

    void i(int i2, boolean z);

    void j(int i2);

    ByteBuffer k(int i2);

    void l(Surface surface);

    void m(int i2, int i3, int i4, long j2, int i5);

    ByteBuffer n(int i2);

    void release();
}
