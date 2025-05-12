package k.a.a.p.q;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import k.a.a.p.q.n;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class a<Data> implements n<Uri, Data> {
    public static final int c = 22;
    public final AssetManager a;
    public final InterfaceC0200a<Data> b;

    /* renamed from: k.a.a.p.q.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface InterfaceC0200a<Data> {
        k.a.a.p.o.d<Data> b(AssetManager assetManager, String str);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b implements o<Uri, ParcelFileDescriptor>, InterfaceC0200a<ParcelFileDescriptor> {
        public final AssetManager a;

        public b(AssetManager assetManager) {
        }

        @Override // k.a.a.p.q.o
        public void a() {
        }

        @Override // k.a.a.p.q.a.InterfaceC0200a
        public k.a.a.p.o.d<ParcelFileDescriptor> b(AssetManager assetManager, String str) {
        }

        @Override // k.a.a.p.q.o
        public n<Uri, ParcelFileDescriptor> c(r rVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c implements o<Uri, InputStream>, InterfaceC0200a<InputStream> {
        public final AssetManager a;

        public c(AssetManager assetManager) {
        }

        @Override // k.a.a.p.q.o
        public void a() {
        }

        @Override // k.a.a.p.q.a.InterfaceC0200a
        public k.a.a.p.o.d<InputStream> b(AssetManager assetManager, String str) {
        }

        @Override // k.a.a.p.q.o
        public n<Uri, InputStream> c(r rVar) {
        }
    }

    public a(AssetManager assetManager, InterfaceC0200a<Data> interfaceC0200a) {
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
