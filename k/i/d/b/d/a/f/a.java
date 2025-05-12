package k.i.d.b.d.a.f;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import k.i.d.b.d.a.e;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class a<KEY, MODEL> implements e<MODEL> {
    public final Comparator<MODEL> a;
    public final HashMap<KEY, MODEL> b;
    public final List<MODEL> c;
    public boolean d;

    public a(Comparator<MODEL> comparator) {
    }

    public boolean a(MODEL model) {
    }

    public abstract KEY b(MODEL model);

    public boolean c(MODEL model) {
    }

    public boolean d(KEY key) {
    }

    @Override // k.i.d.b.d.a.e
    public MODEL get(int i2) {
    }

    @Override // k.i.d.b.d.a.e
    public int size() {
    }
}
