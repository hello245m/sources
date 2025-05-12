package k.i.h.b.d.p0;

import android.net.Uri;
import androidx.lifecycle.LifecycleOwner;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import n.d0.c.l;
import n.d0.d.h;
import n.d0.d.o;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class b {
    public static final a b = null;
    public final LifecycleOwner a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
        }

        public static /* synthetic */ b b(a aVar, LifecycleOwner lifecycleOwner, int i2, Object obj) {
        }

        public final b a(LifecycleOwner lifecycleOwner) {
        }
    }

    /* renamed from: k.i.h.b.d.p0.b$b, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class C0468b extends o implements l<File, InputStream> {
        public static final C0468b a = null;

        public final InputStream b(File file) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ InputStream invoke(File file) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends o implements l<String, InputStream> {
        public static final c a = null;

        public final InputStream b(String str) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ InputStream invoke(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends o implements l<Uri, InputStream> {
        public static final d a = null;

        public final InputStream b(Uri uri) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ InputStream invoke(Uri uri) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e<T> implements k.i.h.b.d.p0.g.b<T> {
        public final /* synthetic */ T a;

        public e(T t2) {
        }

        @Override // k.i.h.b.d.p0.g.b
        public T a() {
        }

        @Override // k.i.h.b.d.p0.g.b
        public InputStream b() throws IOException {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f<T> implements k.i.h.b.d.p0.g.b<T> {
        public final /* synthetic */ l<T, InputStream> a;
        public final /* synthetic */ T b;

        public f(l<? super T, ? extends InputStream> lVar, T t2) {
        }

        @Override // k.i.h.b.d.p0.g.b
        public T a() {
        }

        @Override // k.i.h.b.d.p0.g.b
        public InputStream b() throws IOException {
        }
    }

    public b(LifecycleOwner lifecycleOwner) {
    }

    public /* synthetic */ b(LifecycleOwner lifecycleOwner, h hVar) {
    }

    public final k.i.h.b.d.p0.d.c.b<Uri, File> a(Uri uri) {
    }

    public final k.i.h.b.d.p0.d.c.b<File, File> b(File file) {
    }

    public final k.i.h.b.d.p0.d.c.b<String, File> c(String str) {
    }

    public final <T> k.i.h.b.d.p0.d.c.b<T, List<File>> d(List<? extends T> list) {
    }

    public final <T> k.i.h.b.d.p0.d.c.b<T, File> e(T t2, l<? super T, ? extends InputStream> lVar) {
    }
}
