package j.d;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class f<K, V> {
    public f<K, V>.b a;
    public f<K, V>.c b;
    public f<K, V>.e c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class a<T> implements Iterator<T> {
        public final int a;
        public int b;
        public int c;
        public boolean d;
        public final /* synthetic */ f e;

        public a(f fVar, int i2) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class b implements Set<Map.Entry<K, V>> {
        public final /* synthetic */ f a;

        public b(f fVar) {
        }

        @Override // java.util.Set, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        }

        public boolean b(Map.Entry<K, V> entry) {
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class c implements Set<K> {
        public final /* synthetic */ f a;

        public c(f fVar) {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k2) {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public int a;
        public int b;
        public boolean c;
        public final /* synthetic */ f d;

        public d(f fVar) {
        }

        public Map.Entry<K, V> a() {
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
        }

        @Override // java.util.Map.Entry
        public K getKey() {
        }

        @Override // java.util.Map.Entry
        public V getValue() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class e implements Collection<V> {
        public final /* synthetic */ f a;

        public e(f fVar) {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
        }

        @Override // java.util.Collection
        public void clear() {
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
        }

        @Override // java.util.Collection
        public int size() {
        }

        @Override // java.util.Collection
        public Object[] toArray() {
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
        }
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
    }

    public static <T> boolean k(Set<T> set, Object obj) {
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
    }

    public abstract void a();

    public abstract Object b(int i2, int i3);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k2, V v);

    public abstract void h(int i2);

    public abstract V i(int i2, V v);

    public Set<Map.Entry<K, V>> l() {
    }

    public Set<K> m() {
    }

    public Collection<V> n() {
    }

    public Object[] q(int i2) {
    }

    public <T> T[] r(T[] tArr, int i2) {
    }
}
