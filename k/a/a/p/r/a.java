package k.a.a.p.r;

import android.annotation.SuppressLint;
import android.graphics.ImageDecoder;
import java.io.IOException;
import k.a.a.p.j;
import k.a.a.p.k;
import k.a.a.p.l;
import k.a.a.p.p.v;
import k.a.a.p.r.d.n;
import k.a.a.p.r.d.t;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class a<T> implements l<ImageDecoder.Source, T> {
    public final t a;

    /* renamed from: k.a.a.p.r.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class C0206a implements ImageDecoder.OnHeaderDecodedListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ k.a.a.p.b d;
        public final /* synthetic */ n e;
        public final /* synthetic */ k f;
        public final /* synthetic */ a g;

        /* renamed from: k.a.a.p.r.a$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class C0207a implements ImageDecoder.OnPartialImageListener {
            public C0207a(C0206a c0206a) {
            }

            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            }
        }

        public C0206a(a aVar, int i2, int i3, boolean z, k.a.a.p.b bVar, n nVar, k kVar) {
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        }
    }

    @Override // k.a.a.p.l
    public /* bridge */ /* synthetic */ boolean a(ImageDecoder.Source source, j jVar) throws IOException {
    }

    @Override // k.a.a.p.l
    public /* bridge */ /* synthetic */ v b(ImageDecoder.Source source, int i2, int i3, j jVar) throws IOException {
    }

    public abstract v<T> c(ImageDecoder.Source source, int i2, int i3, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    public final v<T> d(ImageDecoder.Source source, int i2, int i3, j jVar) throws IOException {
    }

    public final boolean e(ImageDecoder.Source source, j jVar) {
    }
}
