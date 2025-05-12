package k.d.b.b;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
import k.d.b.b.a0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class d<K, V> extends k.d.b.b.f<K, V> implements Serializable {
    public transient Map<K, Collection<V>> e;
    public transient int f;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends d<K, V>.AbstractC0274d<V> {
        public a(d dVar) {
        }

        @Override // k.d.b.b.d.AbstractC0274d
        public V a(K k2, V v) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends d<K, V>.AbstractC0274d<Map.Entry<K, V>> {
        public b(d dVar) {
        }

        @Override // k.d.b.b.d.AbstractC0274d
        public /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        }

        public Map.Entry<K, V> b(K k2, V v) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends a0.f<K, Collection<V>> {
        public final transient Map<K, Collection<V>> c;
        public final /* synthetic */ d d;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a extends a0.c<K, Collection<V>> {
            public final /* synthetic */ c a;

            public a(c cVar) {
            }

            @Override // k.d.b.b.a0.c
            public Map<K, Collection<V>> b() {
            }

            @Override // k.d.b.b.a0.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object obj) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class b implements Iterator<Map.Entry<K, Collection<V>>> {
            public final Iterator<Map.Entry<K, Collection<V>>> a;

            @CheckForNull
            public Collection<V> b;
            public final /* synthetic */ c c;

            public b(c cVar) {
            }

            public Map.Entry<K, Collection<V>> a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ Object next() {
            }

            @Override // java.util.Iterator
            public void remove() {
            }
        }

        public c(d dVar, Map<K, Collection<V>> map) {
        }

        @Override // k.d.b.b.a0.f
        public Set<Map.Entry<K, Collection<V>>> a() {
        }

        @CheckForNull
        public Collection<V> c(@CheckForNull Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
        }

        @CheckForNull
        public Collection<V> d(@CheckForNull Object obj) {
        }

        public Map.Entry<K, Collection<V>> e(Map.Entry<K, Collection<V>> entry) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(@CheckForNull Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public /* bridge */ /* synthetic */ Object get(@CheckForNull Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public /* bridge */ /* synthetic */ Object remove(@CheckForNull Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
        }

        @Override // java.util.AbstractMap
        public String toString() {
        }
    }

    /* renamed from: k.d.b.b.d$d, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public abstract class AbstractC0274d<T> implements Iterator<T> {
        public final Iterator<Map.Entry<K, Collection<V>>> a;

        @CheckForNull
        public K b;

        @CheckForNull
        public Collection<V> c;
        public Iterator<V> d;
        public final /* synthetic */ d e;

        public AbstractC0274d(d dVar) {
        }

        public abstract T a(K k2, V v);

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
    public class e extends a0.d<K, Collection<V>> {
        public final /* synthetic */ d b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Iterator<K> {

            @CheckForNull
            public Map.Entry<K, Collection<V>> a;
            public final /* synthetic */ Iterator b;
            public final /* synthetic */ e c;

            public a(e eVar, Iterator it) {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public K next() {
            }

            @Override // java.util.Iterator
            public void remove() {
            }
        }

        public e(d dVar, Map<K, Collection<V>> map) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object obj) {
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f extends d<K, V>.i implements NavigableMap<K, Collection<V>> {
        public final /* synthetic */ d g;

        public f(d dVar, NavigableMap<K, Collection<V>> navigableMap) {
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> ceilingEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K ceilingKey(K k2) {
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
        }

        @Override // k.d.b.b.d.i
        public /* bridge */ /* synthetic */ SortedSet f() {
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> firstEntry() {
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> floorEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K floorKey(K k2) {
        }

        @Override // k.d.b.b.d.i
        public /* bridge */ /* synthetic */ SortedSet h() {
        }

        @Override // k.d.b.b.d.i, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> higherEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K higherKey(K k2) {
        }

        @Override // k.d.b.b.d.i
        public /* bridge */ /* synthetic */ SortedMap i() {
        }

        public NavigableSet<K> j() {
        }

        public NavigableMap<K, Collection<V>> k(K k2) {
        }

        @Override // k.d.b.b.d.i, k.d.b.b.d.c, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
        }

        public NavigableSet<K> l() {
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> lastEntry() {
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> lowerEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K lowerKey(K k2) {
        }

        @CheckForNull
        public Map.Entry<K, Collection<V>> m(Iterator<Map.Entry<K, Collection<V>>> it) {
        }

        public NavigableMap<K, Collection<V>> n() {
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
        }

        public NavigableMap<K, Collection<V>> o(K k2, K k3) {
        }

        public NavigableMap<K, Collection<V>> p(K k2) {
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, Collection<V>> pollLastEntry() {
        }

        @Override // k.d.b.b.d.i, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        }

        @Override // k.d.b.b.d.i, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k2, boolean z) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k2, boolean z, K k3, boolean z2) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k2, boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class g extends d<K, V>.j implements NavigableSet<K> {
        public final /* synthetic */ d d;

        public g(d dVar, NavigableMap<K, Collection<V>> navigableMap) {
        }

        @Override // k.d.b.b.d.j
        public /* bridge */ /* synthetic */ SortedMap c() {
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K ceiling(K k2) {
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
        }

        public NavigableSet<K> f(K k2) {
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K floor(K k2) {
        }

        public NavigableMap<K, Collection<V>> g() {
        }

        @Override // k.d.b.b.d.j, java.util.SortedSet, java.util.NavigableSet
        public /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K higher(K k2) {
        }

        public NavigableSet<K> k(K k2, K k3) {
        }

        public NavigableSet<K> l(K k2) {
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K lower(K k2) {
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K pollFirst() {
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K pollLast() {
        }

        @Override // k.d.b.b.d.j, java.util.SortedSet, java.util.NavigableSet
        public /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        }

        @Override // k.d.b.b.d.j, java.util.SortedSet, java.util.NavigableSet
        public /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k2, boolean z) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k2, boolean z, K k3, boolean z2) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k2, boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class h extends d<K, V>.l implements RandomAccess {
        public h(d dVar, K k2, @CheckForNull List<V> list, d<K, V>.k kVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class i extends d<K, V>.c implements SortedMap<K, Collection<V>> {

        @CheckForNull
        public SortedSet<K> e;
        public final /* synthetic */ d f;

        public i(d dVar, SortedMap<K, Collection<V>> sortedMap) {
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public Comparator<? super K> comparator() {
        }

        public SortedSet<K> f() {
        }

        @Override // java.util.SortedMap
        public K firstKey() {
        }

        public SortedSet<K> h() {
        }

        public SortedMap<K, Collection<V>> headMap(K k2) {
        }

        public SortedMap<K, Collection<V>> i() {
        }

        @Override // k.d.b.b.d.c, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
        }

        @Override // java.util.SortedMap
        public K lastKey() {
        }

        public SortedMap<K, Collection<V>> subMap(K k2, K k3) {
        }

        public SortedMap<K, Collection<V>> tailMap(K k2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class j extends d<K, V>.e implements SortedSet<K> {
        public final /* synthetic */ d c;

        public j(d dVar, SortedMap<K, Collection<V>> sortedMap) {
        }

        public SortedMap<K, Collection<V>> c() {
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public Comparator<? super K> comparator() {
        }

        @Override // java.util.SortedSet
        public K first() {
        }

        public SortedSet<K> headSet(K k2) {
        }

        @Override // java.util.SortedSet
        public K last() {
        }

        public SortedSet<K> subSet(K k2, K k3) {
        }

        public SortedSet<K> tailSet(K k2) {
        }
    }

    public d(Map<K, Collection<V>> map) {
    }

    public static /* synthetic */ Map l(d dVar) {
    }

    public static /* synthetic */ Iterator m(Collection collection) {
    }

    public static /* synthetic */ int n(d dVar) {
    }

    public static /* synthetic */ int o(d dVar) {
    }

    public static /* synthetic */ int p(d dVar, int i2) {
    }

    public static /* synthetic */ int q(d dVar, int i2) {
    }

    public static /* synthetic */ void r(d dVar, Object obj) {
    }

    public static <E> Iterator<E> w(Collection<E> collection) {
    }

    public final List<V> A(K k2, List<V> list, @CheckForNull d<K, V>.k kVar) {
    }

    @Override // k.d.b.b.f, k.d.b.b.b0
    public Collection<Map.Entry<K, V>> a() {
    }

    @Override // k.d.b.b.b0
    public void clear() {
    }

    @Override // k.d.b.b.f
    public Collection<Map.Entry<K, V>> f() {
    }

    @Override // k.d.b.b.b0
    public Collection<V> get(K k2) {
    }

    @Override // k.d.b.b.f
    public Collection<V> h() {
    }

    @Override // k.d.b.b.f
    public Iterator<Map.Entry<K, V>> i() {
    }

    @Override // k.d.b.b.f
    public Iterator<V> k() {
    }

    @Override // k.d.b.b.b0
    public boolean put(K k2, V v) {
    }

    public abstract Collection<V> s();

    @Override // k.d.b.b.b0
    public int size() {
    }

    public Collection<V> t(K k2) {
    }

    public final Map<K, Collection<V>> u() {
    }

    public final Set<K> v() {
    }

    @Override // k.d.b.b.f, k.d.b.b.b0
    public Collection<V> values() {
    }

    public final void x(@CheckForNull Object obj) {
    }

    public abstract <E> Collection<E> y(Collection<E> collection);

    public abstract Collection<V> z(K k2, Collection<V> collection);

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class k extends AbstractCollection<V> {
        public final K a;
        public Collection<V> b;

        @CheckForNull
        public final d<K, V>.k c;

        @CheckForNull
        public final Collection<V> d;
        public final /* synthetic */ d e;

        public k(d dVar, K k2, @CheckForNull Collection<V> collection, d<K, V>.k kVar) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
        }

        public void b() {
        }

        @CheckForNull
        public d<K, V>.k c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
        }

        @Override // java.util.Collection
        public boolean equals(@CheckForNull Object obj) {
        }

        public Collection<V> f() {
        }

        public K g() {
        }

        @Override // java.util.Collection
        public int hashCode() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
        }

        public void k() {
        }

        public void l() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@CheckForNull Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Iterator<V> {
            public final Iterator<V> a;
            public final Collection<V> b;
            public final /* synthetic */ k c;

            public a(k kVar) {
            }

            public Iterator<V> a() {
            }

            public void b() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public V next() {
            }

            @Override // java.util.Iterator
            public void remove() {
            }

            public a(k kVar, Iterator<V> it) {
            }
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class l extends d<K, V>.k implements List<V> {
        public final /* synthetic */ d f;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a extends d<K, V>.k.a implements ListIterator<V> {
            public final /* synthetic */ l d;

            public a(l lVar) {
            }

            @Override // java.util.ListIterator
            public void add(V v) {
            }

            public final ListIterator<V> d() {
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
            }

            @Override // java.util.ListIterator
            public V previous() {
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
            }

            @Override // java.util.ListIterator
            public void set(V v) {
            }

            public a(l lVar, int i2) {
            }
        }

        public l(d dVar, K k2, @CheckForNull List<V> list, d<K, V>.k kVar) {
        }

        @Override // java.util.List
        public void add(int i2, V v) {
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection<? extends V> collection) {
        }

        @Override // java.util.List
        public V get(int i2) {
        }

        @Override // java.util.List
        public int indexOf(@CheckForNull Object obj) {
        }

        @Override // java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
        }

        public List<V> m() {
        }

        @Override // java.util.List
        public V remove(int i2) {
        }

        @Override // java.util.List
        public V set(int i2, V v) {
        }

        @Override // java.util.List
        public List<V> subList(int i2, int i3) {
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i2) {
        }
    }
}
