package n.a0;

import n.d0.c.p;
import n.d0.d.o;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public interface g {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a {

        /* renamed from: n.a0.g$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class C0758a extends o implements p<g, b, g> {
            public static final C0758a a = null;

            public final g b(g gVar, b bVar) {
            }

            @Override // n.d0.c.p
            public /* bridge */ /* synthetic */ g invoke(g gVar, b bVar) {
            }
        }

        public static g a(g gVar, g gVar2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public interface b extends g {

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a {
            public static <R> R a(b bVar, R r2, p<? super R, ? super b, ? extends R> pVar) {
            }

            public static <E extends b> E b(b bVar, c<E> cVar) {
            }

            public static g c(b bVar, c<?> cVar) {
            }

            public static g d(b bVar, g gVar) {
            }
        }

        @Override // n.a0.g
        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public interface c<E extends b> {
    }

    <R> R fold(R r2, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    g minusKey(c<?> cVar);

    g plus(g gVar);
}
