package k.d.b.b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.InlineMe;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import k.d.b.b.q;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class s<E> extends q<E> implements List<E>, RandomAccess {
    public static final u0<Object> b = null;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a<E> extends q.a<E> {
        public a() {
        }

        @Override // k.d.b.b.q.b
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ q.b a(Object obj) {
        }

        @CanIgnoreReturnValue
        public a<E> f(E e) {
        }

        @CanIgnoreReturnValue
        public a<E> g(Iterable<? extends E> iterable) {
        }

        public s<E> h() {
        }

        public a(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b<E> extends k.d.b.b.a<E> {
        public final s<E> c;

        public b(s<E> sVar, int i2) {
        }

        @Override // k.d.b.b.a
        public E a(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends s<E> {
        public final transient int c;
        public final transient int d;
        public final /* synthetic */ s e;

        public c(s sVar, int i2, int i3) {
        }

        @Override // k.d.b.b.s
        public s<E> C(int i2, int i3) {
        }

        @Override // k.d.b.b.q
        @CheckForNull
        public Object[] f() {
        }

        @Override // k.d.b.b.q
        public int g() {
        }

        @Override // java.util.List
        public E get(int i2) {
        }

        @Override // k.d.b.b.s, k.d.b.b.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // k.d.b.b.q
        public int k() {
        }

        @Override // k.d.b.b.q
        public boolean l() {
        }

        @Override // k.d.b.b.s, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // k.d.b.b.s, java.util.List
        public /* bridge */ /* synthetic */ List subList(int i2, int i3) {
        }

        @Override // k.d.b.b.s, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
        }
    }

    public static <E> s<E> A(E e, E e2, E e3) {
    }

    public static <E> s<E> B(E e, E e2, E e3, E e4, E e5) {
    }

    public static <E> s<E> n(Object[] objArr) {
    }

    public static <E> s<E> o(Object[] objArr, int i2) {
    }

    public static <E> a<E> q() {
    }

    public static <E> s<E> r(Object... objArr) {
    }

    public static <E> s<E> s(Collection<? extends E> collection) {
    }

    public static <E> s<E> u(E[] eArr) {
    }

    public static <E> s<E> x() {
    }

    public static <E> s<E> y(E e) {
    }

    public static <E> s<E> z(E e, E e2) {
    }

    public s<E> C(int i2, int i3) {
    }

    public s<E> D(int i2, int i3) {
    }

    @Override // java.util.List
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int i2, E e) {
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(int i2, Collection<? extends E> collection) {
    }

    @Override // k.d.b.b.q
    @InlineMe(replacement = "this")
    @Deprecated
    public final s<E> b() {
    }

    @Override // k.d.b.b.q
    public int c(Object[] objArr, int i2) {
    }

    @Override // k.d.b.b.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@CheckForNull Object obj) {
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
    }

    @Override // java.util.List
    public int indexOf(@CheckForNull Object obj) {
    }

    @Override // k.d.b.b.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
    }

    @Override // java.util.List
    public int lastIndexOf(@CheckForNull Object obj) {
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator() {
    }

    @Override // k.d.b.b.q
    public t0<E> m() {
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final E remove(int i2) {
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final E set(int i2, E e) {
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ List subList(int i2, int i3) {
    }

    public u0<E> v() {
    }

    public u0<E> w(int i2) {
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
    }
}
