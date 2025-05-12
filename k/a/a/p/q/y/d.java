package k.a.a.p.q.y;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import k.a.a.h;
import k.a.a.p.j;
import k.a.a.p.o.d;
import k.a.a.p.q.n;
import k.a.a.p.q.o;
import k.a.a.p.q.r;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class d<DataT> implements n<Uri, DataT> {
    public final Context a;
    public final n<File, DataT> b;
    public final n<Uri, DataT> c;
    public final Class<DataT> d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class a<DataT> implements o<Uri, DataT> {
        public final Context a;
        public final Class<DataT> b;

        public a(Context context, Class<DataT> cls) {
        }

        @Override // k.a.a.p.q.o
        public final void a() {
        }

        @Override // k.a.a.p.q.o
        public final n<Uri, DataT> c(r rVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
        }
    }

    /* renamed from: k.a.a.p.q.y.d$d, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class C0205d<DataT> implements k.a.a.p.o.d<DataT> {

        /* renamed from: k, reason: collision with root package name */
        public static final String[] f3691k = null;
        public final Context a;
        public final n<File, DataT> b;
        public final n<Uri, DataT> c;
        public final Uri d;
        public final int e;
        public final int f;
        public final j g;
        public final Class<DataT> h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f3692i;

        /* renamed from: j, reason: collision with root package name */
        public volatile k.a.a.p.o.d<DataT> f3693j;

        public C0205d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i2, int i3, j jVar, Class<DataT> cls) {
        }

        @Override // k.a.a.p.o.d
        public Class<DataT> a() {
        }

        @Override // k.a.a.p.o.d
        public void b() {
        }

        public final n.a<DataT> c() throws FileNotFoundException {
        }

        @Override // k.a.a.p.o.d
        public void cancel() {
        }

        @Override // k.a.a.p.o.d
        public k.a.a.p.a d() {
        }

        @Override // k.a.a.p.o.d
        public void e(h hVar, d.a<? super DataT> aVar) {
        }

        public final k.a.a.p.o.d<DataT> f() throws FileNotFoundException {
        }

        public final boolean g() {
        }

        public final File h(Uri uri) throws FileNotFoundException {
        }
    }

    public d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
    }

    @Override // k.a.a.p.q.n
    public /* bridge */ /* synthetic */ boolean a(Uri uri) {
    }

    @Override // k.a.a.p.q.n
    public /* bridge */ /* synthetic */ n.a b(Uri uri, int i2, int i3, j jVar) {
    }

    public n.a<DataT> c(Uri uri, int i2, int i3, j jVar) {
    }

    public boolean d(Uri uri) {
    }
}
