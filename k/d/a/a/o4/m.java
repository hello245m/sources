package k.d.a.a.o4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class m extends MediaCodec.Callback {
    public final Object a;
    public final HandlerThread b;
    public Handler c;
    public final q d;
    public final q e;
    public final ArrayDeque<MediaCodec.BufferInfo> f;
    public final ArrayDeque<MediaFormat> g;
    public MediaFormat h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f4408i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f4409j;

    /* renamed from: k, reason: collision with root package name */
    public long f4410k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4411l;

    /* renamed from: m, reason: collision with root package name */
    public IllegalStateException f4412m;

    public m(HandlerThread handlerThread) {
    }

    public static /* synthetic */ void i(m mVar) {
    }

    public final void a(MediaFormat mediaFormat) {
    }

    public int b() {
    }

    public int c(MediaCodec.BufferInfo bufferInfo) {
    }

    public void d() {
    }

    public final void e() {
    }

    public MediaFormat f() {
    }

    public void g(MediaCodec mediaCodec) {
    }

    public final boolean h() {
    }

    public final void j() {
    }

    public final void k() {
    }

    public final void l() {
    }

    public final void m() {
    }

    public final void n(IllegalStateException illegalStateException) {
    }

    public void o() {
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }
}
