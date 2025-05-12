package k.a.a.p.q;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Set;
import k.a.a.p.q.n;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class w<Data> implements n<Uri, Data> {
    public static final Set<String> b = null;
    public final c<Data> a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        public final ContentResolver a;

        public a(ContentResolver contentResolver) {
        }

        @Override // k.a.a.p.q.o
        public void a() {
        }

        @Override // k.a.a.p.q.w.c
        public k.a.a.p.o.d<AssetFileDescriptor> b(Uri uri) {
        }

        @Override // k.a.a.p.q.o
        public n<Uri, AssetFileDescriptor> c(r rVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        public final ContentResolver a;

        public b(ContentResolver contentResolver) {
        }

        @Override // k.a.a.p.q.o
        public void a() {
        }

        @Override // k.a.a.p.q.w.c
        public k.a.a.p.o.d<ParcelFileDescriptor> b(Uri uri) {
        }

        @Override // k.a.a.p.q.o
        public n<Uri, ParcelFileDescriptor> c(r rVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface c<Data> {
        k.a.a.p.o.d<Data> b(Uri uri);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d implements o<Uri, InputStream>, c<InputStream> {
        public final ContentResolver a;

        public d(ContentResolver contentResolver) {
        }

        @Override // k.a.a.p.q.o
        public void a() {
        }

        @Override // k.a.a.p.q.w.c
        public k.a.a.p.o.d<InputStream> b(Uri uri) {
        }

        @Override // k.a.a.p.q.o
        public n<Uri, InputStream> c(r rVar) {
        }
    }

    public w(c<Data> cVar) {
    }

    @Override // k.a.a.p.q.n
    public /* bridge */ /* synthetic */ boolean a(Uri uri) {
    }

    @Override // k.a.a.p.q.n
    public /* bridge */ /* synthetic */ n.a b(Uri uri, int i2, int i3, k.a.a.p.j jVar) {
    }

    public n.a<Data> c(Uri uri, int i2, int i3, k.a.a.p.j jVar) {
    }

    public boolean d(Uri uri) {
    }
}
