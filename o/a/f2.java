package o.a;

import java.util.concurrent.CancellationException;
import n.a0.g;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public interface f2 extends g.b {
    public static final b e0 = null;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a {
        public static /* synthetic */ void a(f2 f2Var, CancellationException cancellationException, int i2, Object obj) {
        }

        public static <R> R b(f2 f2Var, R r2, n.d0.c.p<? super R, ? super g.b, ? extends R> pVar) {
        }

        public static <E extends g.b> E c(f2 f2Var, g.c<E> cVar) {
        }

        public static /* synthetic */ l1 d(f2 f2Var, boolean z, boolean z2, n.d0.c.l lVar, int i2, Object obj) {
        }

        public static n.a0.g e(f2 f2Var, g.c<?> cVar) {
        }

        public static n.a0.g f(f2 f2Var, n.a0.g gVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class b implements g.c<f2> {
        public static final /* synthetic */ b a = null;
    }

    y G(a0 a0Var);

    n.j0.d<f2> a();

    boolean b();

    void c(CancellationException cancellationException);

    Object g(n.a0.d<? super n.u> dVar);

    l1 i(boolean z, boolean z2, n.d0.c.l<? super Throwable, n.u> lVar);

    boolean isCancelled();

    CancellationException j();

    boolean start();

    l1 u(n.d0.c.l<? super Throwable, n.u> lVar);
}
