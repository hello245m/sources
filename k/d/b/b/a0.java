package k.d.b.b;

import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
import k.d.b.b.q0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class a0 {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a<K, V> extends s0<Map.Entry<K, V>, V> {
        public a(Iterator it) {
        }

        @Override // k.d.b.b.s0
        public /* bridge */ /* synthetic */ Object a(Object obj) {
        }

        public V b(Map.Entry<K, V> entry) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class b implements k.d.b.a.f<Map.Entry<?, ?>, Object> {
        public static final b a = null;
        public static final b b = null;
        public static final /* synthetic */ b[] c = null;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public enum a extends b {
            public a(String str, int i2) {
            }

            @Override // k.d.b.a.f
            @CheckForNull
            public /* bridge */ /* synthetic */ Object apply(Map.Entry<?, ?> entry) {
            }

            @CheckForNull
            public Object b(Map.Entry<?, ?> entry) {
            }
        }

        /* renamed from: k.d.b.b.a0$b$b, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public enum C0272b extends b {
            public C0272b(String str, int i2) {
            }

            @Override // k.d.b.a.f
            @CheckForNull
            public /* bridge */ /* synthetic */ Object apply(Map.Entry<?, ?> entry) {
            }

            @CheckForNull
            public Object b(Map.Entry<?, ?> entry) {
            }
        }

        public b(String str, int i2) {
        }

        public static /* synthetic */ b[] a() {
        }

        public static b valueOf(String str) {
        }

        public static b[] values() {
        }

        public /* synthetic */ b(String str, int i2, z zVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class c<K, V> extends q0.d<Map.Entry<K, V>> {
        public abstract Map<K, V> b();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(@CheckForNull Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
        }

        @Override // k.d.b.b.q0.d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // k.d.b.b.q0.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d<K, V> extends q0.d<K> {

        @Weak
        public final Map<K, V> a;

        public d(Map<K, V> map) {
        }

        public Map<K, V> b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class e<K, V> extends AbstractCollection<V> {

        @Weak
        public final Map<K, V> a;

        public e(Map<K, V> map) {
        }

        public final Map<K, V> b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
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
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class f<K, V> extends AbstractMap<K, V> {

        @CheckForNull
        public transient Set<Map.Entry<K, V>> a;

        @CheckForNull
        public transient Collection<V> b;

        public abstract Set<Map.Entry<K, V>> a();

        public Collection<V> b() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
        }
    }

    public static int a(int i2) {
    }

    public static boolean b(Map<?, ?> map, @CheckForNull Object obj) {
    }

    public static boolean c(Map<?, ?> map, @CheckForNull Object obj) {
    }

    public static <K, V> Map.Entry<K, V> d(K k2, V v) {
    }

    public static <K, V> IdentityHashMap<K, V> e() {
    }

    public static boolean f(Map<?, ?> map, @CheckForNull Object obj) {
    }

    @CheckForNull
    public static <V> V g(Map<?, V> map, @CheckForNull Object obj) {
    }

    @CheckForNull
    public static <V> V h(Map<?, V> map, @CheckForNull Object obj) {
    }

    public static String i(Map<?, ?> map) {
    }

    public static <V> k.d.b.a.f<Map.Entry<?, V>, V> j() {
    }

    public static <K, V> Iterator<V> k(Iterator<Map.Entry<K, V>> it) {
    }
}
