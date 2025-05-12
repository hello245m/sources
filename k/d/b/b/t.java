package k.d.b.b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

@DoNotMock("Use ImmutableMap.of or another implementation")
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class t<K, V> implements Map<K, V>, Serializable {

    @RetainedWith
    @CheckForNull
    @LazyInit
    public transient u<Map.Entry<K, V>> a;

    @RetainedWith
    @CheckForNull
    @LazyInit
    public transient u<K> b;

    @RetainedWith
    @CheckForNull
    @LazyInit
    public transient q<V> c;

    @DoNotMock
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a<K, V> {

        @CheckForNull
        public Comparator<? super V> a;
        public Object[] b;
        public int c;
        public boolean d;

        public a() {
        }

        public t<K, V> a() {
        }

        public t<K, V> b() {
        }

        public final void c(int i2) {
        }

        @CanIgnoreReturnValue
        public a<K, V> d(K k2, V v) {
        }

        @CanIgnoreReturnValue
        public a<K, V> e(Map.Entry<? extends K, ? extends V> entry) {
        }

        @CanIgnoreReturnValue
        public a<K, V> f(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        }

        public void g() {
        }

        public a(int i2) {
        }
    }

    public static <K, V> a<K, V> a() {
    }

    public static <K, V> t<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
    }

    public static <K, V> t<K, V> c(Map<? extends K, ? extends V> map) {
    }

    public static <K, V> t<K, V> k() {
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
    }

    @Override // java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
    }

    @Override // java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
    }

    public abstract u<Map.Entry<K, V>> d();

    public abstract u<K> e();

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
    }

    @Override // java.util.Map
    public boolean equals(@CheckForNull Object obj) {
    }

    public abstract q<V> f();

    @Override // java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object obj, @CheckForNull V v) {
    }

    public u<Map.Entry<K, V>> h() {
    }

    @Override // java.util.Map
    public int hashCode() {
    }

    public abstract boolean i();

    @Override // java.util.Map
    public boolean isEmpty() {
    }

    public u<K> j() {
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
    }

    public q<V> l() {
    }

    @Override // java.util.Map
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final V put(K k2, V v) {
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object obj) {
    }

    public String toString() {
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Collection values() {
    }
}
