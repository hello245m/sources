package j.g.t;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class i {
    public final f a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a {
        public final c a;

        public a(ClipData clipData, int i2) {
        }

        public i a() {
        }

        public a b(Bundle bundle) {
        }

        public a c(int i2) {
        }

        public a d(Uri uri) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b implements c {
        public final ContentInfo.Builder a;

        public b(ClipData clipData, int i2) {
        }

        @Override // j.g.t.i.c
        public void a(Uri uri) {
        }

        @Override // j.g.t.i.c
        public void b(int i2) {
        }

        @Override // j.g.t.i.c
        public i build() {
        }

        @Override // j.g.t.i.c
        public void setExtras(Bundle bundle) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface c {
        void a(Uri uri);

        void b(int i2);

        i build();

        void setExtras(Bundle bundle);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class d implements c {
        public ClipData a;
        public int b;
        public int c;
        public Uri d;
        public Bundle e;

        public d(ClipData clipData, int i2) {
        }

        @Override // j.g.t.i.c
        public void a(Uri uri) {
        }

        @Override // j.g.t.i.c
        public void b(int i2) {
        }

        @Override // j.g.t.i.c
        public i build() {
        }

        @Override // j.g.t.i.c
        public void setExtras(Bundle bundle) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class e implements f {
        public final ContentInfo a;

        public e(ContentInfo contentInfo) {
        }

        @Override // j.g.t.i.f
        public ClipData a() {
        }

        @Override // j.g.t.i.f
        public int b() {
        }

        @Override // j.g.t.i.f
        public ContentInfo c() {
        }

        @Override // j.g.t.i.f
        public int d() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface f {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class g implements f {
        public final ClipData a;
        public final int b;
        public final int c;
        public final Uri d;
        public final Bundle e;

        public g(d dVar) {
        }

        @Override // j.g.t.i.f
        public ClipData a() {
        }

        @Override // j.g.t.i.f
        public int b() {
        }

        @Override // j.g.t.i.f
        public ContentInfo c() {
        }

        @Override // j.g.t.i.f
        public int d() {
        }

        public String toString() {
        }
    }

    public i(f fVar) {
    }

    public static String a(int i2) {
    }

    public static String e(int i2) {
    }

    public static i g(ContentInfo contentInfo) {
    }

    public ClipData b() {
    }

    public int c() {
    }

    public int d() {
    }

    public ContentInfo f() {
    }

    public String toString() {
    }
}
