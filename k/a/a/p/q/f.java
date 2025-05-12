package k.a.a.p.q;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import k.a.a.p.o.d;
import k.a.a.p.q.n;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class f<Data> implements n<File, Data> {
    public final d<Data> a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a<Data> implements o<File, Data> {
        public final d<Data> a;

        public a(d<Data> dVar) {
        }

        @Override // k.a.a.p.q.o
        public final void a() {
        }

        @Override // k.a.a.p.q.o
        public final n<File, Data> c(r rVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b extends a<ParcelFileDescriptor> {

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements d<ParcelFileDescriptor> {
            @Override // k.a.a.p.q.f.d
            public Class<ParcelFileDescriptor> a() {
            }

            @Override // k.a.a.p.q.f.d
            public /* bridge */ /* synthetic */ void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            }

            @Override // k.a.a.p.q.f.d
            public /* bridge */ /* synthetic */ ParcelFileDescriptor c(File file) throws FileNotFoundException {
            }

            public void d(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            }

            public ParcelFileDescriptor e(File file) throws FileNotFoundException {
            }
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class c<Data> implements k.a.a.p.o.d<Data> {
        public final File a;
        public final d<Data> b;
        public Data c;

        public c(File file, d<Data> dVar) {
        }

        @Override // k.a.a.p.o.d
        public Class<Data> a() {
        }

        @Override // k.a.a.p.o.d
        public void b() {
        }

        @Override // k.a.a.p.o.d
        public void cancel() {
        }

        @Override // k.a.a.p.o.d
        public k.a.a.p.a d() {
        }

        @Override // k.a.a.p.o.d
        public void e(k.a.a.h hVar, d.a<? super Data> aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface d<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(File file) throws FileNotFoundException;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class e extends a<InputStream> {

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements d<InputStream> {
            @Override // k.a.a.p.q.f.d
            public Class<InputStream> a() {
            }

            @Override // k.a.a.p.q.f.d
            public /* bridge */ /* synthetic */ void b(InputStream inputStream) throws IOException {
            }

            @Override // k.a.a.p.q.f.d
            public /* bridge */ /* synthetic */ InputStream c(File file) throws FileNotFoundException {
            }

            public void d(InputStream inputStream) throws IOException {
            }

            public InputStream e(File file) throws FileNotFoundException {
            }
        }
    }

    public f(d<Data> dVar) {
    }

    @Override // k.a.a.p.q.n
    public /* bridge */ /* synthetic */ boolean a(File file) {
    }

    @Override // k.a.a.p.q.n
    public /* bridge */ /* synthetic */ n.a b(File file, int i2, int i3, k.a.a.p.j jVar) {
    }

    public n.a<Data> c(File file, int i2, int i3, k.a.a.p.j jVar) {
    }

    public boolean d(File file) {
    }
}
