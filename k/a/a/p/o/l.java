package k.a.a.p.o;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import k.a.a.p.o.d;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class l<T> implements d<T> {
    public final Uri a;
    public final ContentResolver b;
    public T c;

    public l(ContentResolver contentResolver, Uri uri) {
    }

    @Override // k.a.a.p.o.d
    public void b() {
    }

    public abstract void c(T t2) throws IOException;

    @Override // k.a.a.p.o.d
    public void cancel() {
    }

    @Override // k.a.a.p.o.d
    public k.a.a.p.a d() {
    }

    @Override // k.a.a.p.o.d
    public final void e(k.a.a.h hVar, d.a<? super T> aVar) {
    }

    public abstract T f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;
}
