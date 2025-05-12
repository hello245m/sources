package k.d.b.b;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class c0<K0, V0> {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends e<Object> {
        public final /* synthetic */ int a;

        public a(int i2) {
        }

        @Override // k.d.b.b.c0.e
        public <K, V> Map<K, Collection<V>> c() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends e<K0> {
        public final /* synthetic */ Comparator a;

        public b(Comparator comparator) {
        }

        @Override // k.d.b.b.c0.e
        public <K extends K0, V> Map<K, Collection<V>> c() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class c<V> implements k.d.b.a.p<List<V>>, Serializable {
        public final int a;

        public c(int i2) {
        }

        public List<V> a() {
        }

        @Override // k.d.b.a.p
        public /* bridge */ /* synthetic */ Object get() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class d<K0, V0> extends c0<K0, V0> {
        public abstract <K extends K0, V extends V0> x<K, V> e();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class e<K0> {

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a extends d<K0, Object> {
            public final /* synthetic */ int a;
            public final /* synthetic */ e b;

            public a(e eVar, int i2) {
            }

            @Override // k.d.b.b.c0.d
            public <K extends K0, V> x<K, V> e() {
            }
        }

        public d<K0, Object> a() {
        }

        public d<K0, Object> b(int i2) {
        }

        public abstract <K extends K0, V> Map<K, Collection<V>> c();
    }

    public /* synthetic */ c0(a aVar) {
    }

    public static e<Object> a() {
    }

    public static e<Object> b(int i2) {
    }

    public static e<Comparable> c() {
    }

    public static <K0> e<K0> d(Comparator<K0> comparator) {
    }

    public c0() {
    }
}
