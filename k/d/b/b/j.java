package k.d.b.b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class j<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f5526j = null;

    @CheckForNull
    public transient Object a;

    @CheckForNull
    public transient int[] b;

    @CheckForNull
    public transient Object[] c;

    @CheckForNull
    public transient Object[] d;
    public transient int e;
    public transient int f;

    @CheckForNull
    public transient Set<K> g;

    @CheckForNull
    public transient Set<Map.Entry<K, V>> h;

    /* renamed from: i, reason: collision with root package name */
    @CheckForNull
    public transient Collection<V> f5527i;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends j<K, V>.e<K> {
        public final /* synthetic */ j e;

        public a(j jVar) {
        }

        @Override // k.d.b.b.j.e
        public K b(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends j<K, V>.e<Map.Entry<K, V>> {
        public final /* synthetic */ j e;

        public b(j jVar) {
        }

        @Override // k.d.b.b.j.e
        public /* bridge */ /* synthetic */ Object b(int i2) {
        }

        public Map.Entry<K, V> e(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends j<K, V>.e<V> {
        public final /* synthetic */ j e;

        public c(j jVar) {
        }

        @Override // k.d.b.b.j.e
        public V b(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        public final /* synthetic */ j a;

        public d(j jVar) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f extends AbstractSet<K> {
        public final /* synthetic */ j a;

        public f(j jVar) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class g extends k.d.b.b.e<K, V> {
        public final K a;
        public int b;
        public final /* synthetic */ j c;

        public g(j jVar, int i2) {
        }

        public final void a() {
        }

        @Override // k.d.b.b.e, java.util.Map.Entry
        public K getKey() {
        }

        @Override // k.d.b.b.e, java.util.Map.Entry
        public V getValue() {
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class h extends AbstractCollection<V> {
        public final /* synthetic */ j a;

        public h(j jVar) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
        }
    }

    public j(int i2) {
    }

    public static /* synthetic */ int a(j jVar) {
    }

    public static /* synthetic */ Object b(j jVar, int i2) {
    }

    public static /* synthetic */ Object[] c(j jVar) {
    }

    public static /* synthetic */ Object[] d(j jVar) {
    }

    public static /* synthetic */ int e(j jVar) {
    }

    public static /* synthetic */ void f(j jVar, int i2, Object obj) {
    }

    public static /* synthetic */ Object h(j jVar, Object obj) {
    }

    public static /* synthetic */ Object i() {
    }

    public static /* synthetic */ int j(j jVar, Object obj) {
    }

    public static /* synthetic */ Object k(j jVar, int i2) {
    }

    public static /* synthetic */ int l(j jVar) {
    }

    public static /* synthetic */ Object m(j jVar) {
    }

    public static /* synthetic */ int[] n(j jVar) {
    }

    public static <K, V> j<K, V> w(int i2) {
    }

    public int A() {
    }

    public int B(int i2) {
    }

    public final int C() {
    }

    public void D() {
    }

    public final int E(@CheckForNull Object obj) {
    }

    public void F(int i2) {
    }

    public void G(int i2, K k2, V v, int i3, int i4) {
    }

    public final K H(int i2) {
    }

    public Iterator<K> I() {
    }

    public void J(int i2, int i3) {
    }

    public boolean K() {
    }

    public final Object L(@CheckForNull Object obj) {
    }

    public final int[] M() {
    }

    public final Object[] N() {
    }

    public final Object O() {
    }

    public final Object[] P() {
    }

    public void Q(int i2) {
    }

    public final void R(int i2) {
    }

    @CanIgnoreReturnValue
    public final int S(int i2, int i3, int i4, int i5) {
    }

    public final void T(int i2, int i3) {
    }

    public final void U(int i2) {
    }

    public final void V(int i2, K k2) {
    }

    public final void W(int i2, V v) {
    }

    public final V X(int i2) {
    }

    public Iterator<V> Y() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
    }

    public void o(int i2) {
    }

    public int p(int i2, int i3) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public V put(K k2, V v) {
    }

    @CanIgnoreReturnValue
    public int q() {
    }

    @CanIgnoreReturnValue
    public Map<K, V> r() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
    }

    public Set<Map.Entry<K, V>> s() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
    }

    public Map<K, V> t(int i2) {
    }

    public Set<K> u() {
    }

    public Collection<V> v() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
    }

    @CheckForNull
    public Map<K, V> x() {
    }

    public final int y(int i2) {
    }

    public Iterator<Map.Entry<K, V>> z() {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public abstract class e<T> implements Iterator<T> {
        public int a;
        public int b;
        public int c;
        public final /* synthetic */ j d;

        public e(j jVar) {
        }

        public final void a() {
        }

        public abstract T b(int i2);

        public void d() {
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

        public /* synthetic */ e(j jVar, a aVar) {
        }
    }
}
