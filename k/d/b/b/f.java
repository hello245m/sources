package k.d.b.b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
import k.d.b.b.d0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class f<K, V> implements b0<K, V> {

    @CheckForNull
    @LazyInit
    public transient Collection<Map.Entry<K, V>> a;

    @CheckForNull
    @LazyInit
    public transient Set<K> b;

    @CheckForNull
    @LazyInit
    public transient Collection<V> c;

    @CheckForNull
    @LazyInit
    public transient Map<K, Collection<V>> d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends d0.b<K, V> {
        public final /* synthetic */ f a;

        public a(f fVar) {
        }

        @Override // k.d.b.b.d0.b
        public b0<K, V> b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends AbstractCollection<V> {
        public final /* synthetic */ f a;

        public b(f fVar) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
        }
    }

    @Override // k.d.b.b.b0
    public Collection<Map.Entry<K, V>> a() {
    }

    @Override // k.d.b.b.b0
    public Map<K, Collection<V>> b() {
    }

    @Override // k.d.b.b.b0
    public boolean c(@CheckForNull Object obj, @CheckForNull Object obj2) {
    }

    public boolean d(@CheckForNull Object obj) {
    }

    public abstract Map<K, Collection<V>> e();

    public boolean equals(@CheckForNull Object obj) {
    }

    public abstract Collection<Map.Entry<K, V>> f();

    public abstract Set<K> g();

    public abstract Collection<V> h();

    public int hashCode() {
    }

    public abstract Iterator<Map.Entry<K, V>> i();

    public Set<K> j() {
    }

    public abstract Iterator<V> k();

    @Override // k.d.b.b.b0
    @CanIgnoreReturnValue
    public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
    }

    public String toString() {
    }

    @Override // k.d.b.b.b0
    public Collection<V> values() {
    }
}
