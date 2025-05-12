package k.a.a.p.o;

import android.content.res.AssetManager;
import java.io.IOException;
import k.a.a.p.o.d;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class b<T> implements d<T> {
    public final String a;
    public final AssetManager b;
    public T c;

    public b(AssetManager assetManager, String str) {
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
    public void e(k.a.a.h hVar, d.a<? super T> aVar) {
    }

    public abstract T f(AssetManager assetManager, String str) throws IOException;
}
