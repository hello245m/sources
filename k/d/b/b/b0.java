package k.d.b.b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;
import javax.annotation.CheckForNull;

@DoNotMock("Use ImmutableMultimap, HashMultimap, or another implementation")
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface b0<K, V> {
    Collection<Map.Entry<K, V>> a();

    Map<K, Collection<V>> b();

    boolean c(@CheckForNull @CompatibleWith("K") Object obj, @CheckForNull @CompatibleWith("V") Object obj2);

    void clear();

    Collection<V> get(K k2);

    @CanIgnoreReturnValue
    boolean put(K k2, V v);

    @CanIgnoreReturnValue
    boolean remove(@CheckForNull @CompatibleWith("K") Object obj, @CheckForNull @CompatibleWith("V") Object obj2);

    int size();

    Collection<V> values();
}
