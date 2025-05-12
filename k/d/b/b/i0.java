package k.d.b.b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class i0<T> implements Comparator<T> {
    public static <T> i0<T> a(Comparator<T> comparator) {
    }

    public static <C extends Comparable> i0<C> b() {
    }

    public <F> i0<F> c(k.d.b.a.f<F, ? extends T> fVar) {
    }

    @Override // java.util.Comparator
    @CanIgnoreReturnValue
    public abstract int compare(T t2, T t3);

    public <S extends T> i0<S> d() {
    }
}
