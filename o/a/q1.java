package o.a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public abstract class q1 extends r1 implements d1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = null;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = null;
    private volatile /* synthetic */ Object _delayed;
    private volatile /* synthetic */ int _isCompleted;
    private volatile /* synthetic */ Object _queue;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public final class a extends c {
        public final s<n.u> d;
        public final /* synthetic */ q1 e;

        public a(q1 q1Var, long j2, s<? super n.u> sVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        @Override // o.a.q1.c
        public String toString() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class b extends c {
        public final Runnable d;

        public b(long j2, Runnable runnable) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        @Override // o.a.q1.c
        public String toString() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static abstract class c implements Runnable, Comparable<c>, l1, o.a.t3.k0 {
        public long a;
        public Object b;
        public int c;

        public c(long j2) {
        }

        @Override // o.a.t3.k0
        public void a(o.a.t3.j0<?> j0Var) {
        }

        @Override // o.a.t3.k0
        public o.a.t3.j0<?> b() {
        }

        @Override // o.a.t3.k0
        public void c(int i2) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(c cVar) {
        }

        @Override // o.a.t3.k0
        public int d() {
        }

        @Override // o.a.l1
        public final synchronized void dispose() {
        }

        public int e(c cVar) {
        }

        public final synchronized int f(long j2, d dVar, q1 q1Var) {
        }

        public final boolean g(long j2) {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class d extends o.a.t3.j0<c> {
        public long b;

        public d(long j2) {
        }
    }

    public static final /* synthetic */ boolean O(q1 q1Var) {
    }

    @Override // o.a.p1
    public long A() {
    }

    @Override // o.a.p1
    public long I() {
    }

    public final void P() {
    }

    public final Runnable Q() {
    }

    public final void R(Runnable runnable) {
    }

    public final boolean S(Runnable runnable) {
    }

    public final boolean T() {
    }

    public boolean U() {
    }

    public final void V() {
    }

    public final void W() {
    }

    public final void X(long j2, c cVar) {
    }

    public final int Y(long j2, c cVar) {
    }

    public final l1 Z(long j2, Runnable runnable) {
    }

    public final void a0(boolean z) {
    }

    public final boolean b0(c cVar) {
    }

    @Override // o.a.d1
    public void d(long j2, s<? super n.u> sVar) {
    }

    @Override // o.a.o0
    public final void dispatch(n.a0.g gVar, Runnable runnable) {
    }

    @Override // o.a.d1
    public l1 o(long j2, Runnable runnable, n.a0.g gVar) {
    }

    @Override // o.a.p1
    public void shutdown() {
    }
}
