package k.d.b.b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
import k.d.b.b.i;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class q0 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a<E> extends e<E> {
        public final /* synthetic */ Set a;
        public final /* synthetic */ Set b;

        /* renamed from: k.d.b.b.q0$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class C0276a extends k.d.b.b.b<E> {
            public final Iterator<E> c;
            public final /* synthetic */ a d;

            public C0276a(a aVar) {
            }

            @Override // k.d.b.b.b
            @CheckForNull
            public E a() {
            }
        }

        public a(Set set, Set set2) {
        }

        public t0<E> b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b<E> extends i.a<E> implements Set<E> {
        public b(Set<E> set, k.d.b.a.l<? super E> lVar) {
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object obj) {
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c<E> extends b<E> implements SortedSet<E> {
        public c(SortedSet<E> sortedSet, k.d.b.a.l<? super E> lVar) {
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public Comparator<? super E> comparator() {
        }

        @Override // java.util.SortedSet
        public E first() {
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e) {
        }

        @Override // java.util.SortedSet
        public E last() {
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e, E e2) {
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class d<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class e<E> extends AbstractSet<E> {
        public /* synthetic */ e(p0 p0Var) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean add(E e) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean remove(@CheckForNull Object obj) {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
        }

        public e() {
        }
    }

    public static boolean a(Set<?> set, @CheckForNull Object obj) {
    }

    public static <E> Set<E> b(Set<E> set, k.d.b.a.l<? super E> lVar) {
    }

    public static <E> SortedSet<E> c(SortedSet<E> sortedSet, k.d.b.a.l<? super E> lVar) {
    }

    public static int d(Set<?> set) {
    }

    public static <E> e<E> e(Set<E> set, Set<?> set2) {
    }

    public static <E> HashSet<E> f() {
    }

    public static <E> HashSet<E> g(int i2) {
    }

    public static <E> Set<E> h() {
    }

    public static boolean i(Set<?> set, Collection<?> collection) {
    }

    public static boolean j(Set<?> set, Iterator<?> it) {
    }
}
