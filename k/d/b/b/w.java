package k.d.b.b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class w {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a<T> extends k.d.b.b.b<T> {
        public final /* synthetic */ Iterator c;
        public final /* synthetic */ k.d.b.a.l d;

        public a(Iterator it, k.d.b.a.l lVar) {
        }

        @Override // k.d.b.b.b
        @CheckForNull
        public T a() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b<T> extends t0<T> {
        public boolean a;
        public final /* synthetic */ Object b;

        public b(Object obj) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class c implements Iterator<Object> {
        public static final c a = null;
        public static final /* synthetic */ c[] b = null;

        public c(String str, int i2) {
        }

        public static /* synthetic */ c[] a() {
        }

        public static c valueOf(String str) {
        }

        public static c[] values() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public Object next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    @CanIgnoreReturnValue
    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
    }

    public static <T> boolean b(Iterator<T> it, k.d.b.a.l<? super T> lVar) {
    }

    public static void c(Iterator<?> it) {
    }

    public static boolean d(Iterator<?> it, @CheckForNull Object obj) {
    }

    public static boolean e(Iterator<?> it, Iterator<?> it2) {
    }

    public static <T> Iterator<T> f() {
    }

    public static <T> t0<T> g(Iterator<T> it, k.d.b.a.l<? super T> lVar) {
    }

    public static <T> T h(Iterator<T> it, k.d.b.a.l<? super T> lVar) {
    }

    public static <T> T i(Iterator<T> it) {
    }

    public static <T> T j(Iterator<? extends T> it, T t2) {
    }

    public static <T> T k(Iterator<? extends T> it, T t2) {
    }

    public static <T> int l(Iterator<T> it, k.d.b.a.l<? super T> lVar) {
    }

    @CheckForNull
    public static <T> T m(Iterator<T> it) {
    }

    @CanIgnoreReturnValue
    public static boolean n(Iterator<?> it, Collection<?> collection) {
    }

    @CanIgnoreReturnValue
    public static <T> boolean o(Iterator<T> it, k.d.b.a.l<? super T> lVar) {
    }

    public static <T> t0<T> p(T t2) {
    }
}
