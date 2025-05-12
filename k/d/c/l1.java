package k.d.c;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import k.d.c.v;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class l1<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public final int a;
    public List<l1<K, V>.e> b;
    public Map<K, V> c;
    public boolean d;
    public volatile l1<K, V>.g e;
    public Map<K, V> f;
    public volatile l1<K, V>.c g;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a<FieldDescriptorType> extends l1<FieldDescriptorType, Object> {
        public a(int i2) {
        }

        @Override // k.d.c.l1, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        }

        @Override // k.d.c.l1
        public void q() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends l1<K, V>.g {
        public final /* synthetic */ l1 b;

        public c(l1 l1Var) {
        }

        @Override // k.d.c.l1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
        }

        public /* synthetic */ c(l1 l1Var, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d {
        public static final Iterator<Object> a = null;
        public static final Iterable<Object> b = null;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class a implements Iterator<Object> {
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

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
            }
        }

        public static /* synthetic */ Iterator a() {
        }

        public static <T> Iterable<T> b() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e implements Map.Entry<K, V>, Comparable<l1<K, V>.e> {
        public final K a;
        public V b;
        public final /* synthetic */ l1 c;

        public e(l1 l1Var, Map.Entry<K, V> entry) {
        }

        public int a(l1<K, V>.e eVar) {
        }

        public final boolean b(Object obj, Object obj2) {
        }

        public K c() {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ Object getKey() {
        }

        @Override // java.util.Map.Entry
        public V getValue() {
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
        }

        public String toString() {
        }

        public e(l1 l1Var, K k2, V v) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class g extends AbstractSet<Map.Entry<K, V>> {
        public final /* synthetic */ l1 a;

        public g(l1 l1Var) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
        }

        public boolean b(Map.Entry<K, V> entry) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        public /* synthetic */ g(l1 l1Var, a aVar) {
        }
    }

    public /* synthetic */ l1(int i2, a aVar) {
    }

    public static /* synthetic */ void a(l1 l1Var) {
    }

    public static /* synthetic */ List b(l1 l1Var) {
    }

    public static /* synthetic */ Map c(l1 l1Var) {
    }

    public static /* synthetic */ Object d(l1 l1Var, int i2) {
    }

    public static /* synthetic */ Map e(l1 l1Var) {
    }

    public static <FieldDescriptorType extends v.b<FieldDescriptorType>> l1<FieldDescriptorType, Object> r(int i2) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
    }

    public final int f(K k2) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
    }

    public final void h() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
    }

    public Set<Map.Entry<K, V>> i() {
    }

    public final void j() {
    }

    public Map.Entry<K, V> k(int i2) {
    }

    public int l() {
    }

    public int m() {
    }

    public Iterable<Map.Entry<K, V>> n() {
    }

    public final SortedMap<K, V> o() {
    }

    public boolean p() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
    }

    public void q() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
    }

    public V s(K k2, V v) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
    }

    public final V t(int i2) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Iterator<Map.Entry<K, V>> {
        public int a;
        public Iterator<Map.Entry<K, V>> b;
        public final /* synthetic */ l1 c;

        public b(l1 l1Var) {
        }

        public final Iterator<Map.Entry<K, V>> a() {
        }

        public Map.Entry<K, V> b() {
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

        public /* synthetic */ b(l1 l1Var, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f implements Iterator<Map.Entry<K, V>> {
        public int a;
        public boolean b;
        public Iterator<Map.Entry<K, V>> c;
        public final /* synthetic */ l1 d;

        public f(l1 l1Var) {
        }

        public final Iterator<Map.Entry<K, V>> a() {
        }

        public Map.Entry<K, V> b() {
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

        public /* synthetic */ f(l1 l1Var, a aVar) {
        }
    }

    public l1(int i2) {
    }
}
