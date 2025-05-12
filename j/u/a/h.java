package j.u.a;

import android.content.Context;
import java.io.Closeable;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface h extends Closeable {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class a {
        public final int a;

        public a(int i2) {
        }

        public final void a(String str) {
        }

        public void b(g gVar) {
        }

        public void c(g gVar) {
        }

        public abstract void d(g gVar);

        public void e(g gVar, int i2, int i3) {
        }

        public void f(g gVar) {
        }

        public abstract void g(g gVar, int i2, int i3);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b {
        public final Context a;
        public final String b;
        public final a c;
        public final boolean d;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class a {
            public Context a;
            public String b;
            public a c;
            public boolean d;

            public a(Context context) {
            }

            public b a() {
            }

            public a b(a aVar) {
            }

            public a c(String str) {
            }
        }

        public b(Context context, String str, a aVar, boolean z) {
        }

        public static a a(Context context) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface c {
        h a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    g s();

    void setWriteAheadLoggingEnabled(boolean z);

    g v();
}
