package k.d.b.b;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class d0 {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a<K, V> extends c<K, V> {
        public transient k.d.b.a.p<? extends List<V>> g;

        public a(Map<K, Collection<V>> map, k.d.b.a.p<? extends List<V>> pVar) {
        }

        public List<V> C() {
        }

        @Override // k.d.b.b.f
        public Map<K, Collection<V>> e() {
        }

        @Override // k.d.b.b.f
        public Set<K> g() {
        }

        @Override // k.d.b.b.d
        public /* bridge */ /* synthetic */ Collection s() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        public abstract b0<K, V> b();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@CheckForNull Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
        }
    }

    public static boolean a(b0<?, ?> b0Var, @CheckForNull Object obj) {
    }

    public static <K, V> x<K, V> b(Map<K, Collection<V>> map, k.d.b.a.p<? extends List<V>> pVar) {
    }
}
