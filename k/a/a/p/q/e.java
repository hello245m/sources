package k.a.a.p.q;

import java.io.IOException;
import java.io.InputStream;
import k.a.a.p.o.d;
import k.a.a.p.q.n;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class e<Model, Data> implements n<Model, Data> {
    public final a<Data> a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface a<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(String str) throws IllegalArgumentException;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b<Data> implements k.a.a.p.o.d<Data> {
        public final String a;
        public final a<Data> b;
        public Data c;

        public b(String str, a<Data> aVar) {
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
    public static final class c<Model> implements o<Model, InputStream> {
        public final a<InputStream> a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements a<InputStream> {
            public a(c cVar) {
            }

            @Override // k.a.a.p.q.e.a
            public Class<InputStream> a() {
            }

            @Override // k.a.a.p.q.e.a
            public /* bridge */ /* synthetic */ void b(InputStream inputStream) throws IOException {
            }

            @Override // k.a.a.p.q.e.a
            public /* bridge */ /* synthetic */ InputStream c(String str) throws IllegalArgumentException {
            }

            public void d(InputStream inputStream) throws IOException {
            }

            public InputStream e(String str) {
            }
        }

        @Override // k.a.a.p.q.o
        public void a() {
        }

        @Override // k.a.a.p.q.o
        public n<Model, InputStream> c(r rVar) {
        }
    }

    public e(a<Data> aVar) {
    }

    @Override // k.a.a.p.q.n
    public boolean a(Model model) {
    }

    @Override // k.a.a.p.q.n
    public n.a<Data> b(Model model, int i2, int i3, k.a.a.p.j jVar) {
    }
}
