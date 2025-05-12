package o.a.x3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n.d0.c.l;
import n.d0.d.o;
import n.u;
import o.a.s;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class g implements f {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = null;
    public static final /* synthetic */ AtomicLongFieldUpdater d = null;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = null;
    public static final /* synthetic */ AtomicLongFieldUpdater f = null;
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = null;
    public volatile /* synthetic */ int _availablePermits;
    public final int a;
    public final l<Throwable, u> b;
    private volatile /* synthetic */ long deqIdx;
    private volatile /* synthetic */ long enqIdx;
    private volatile /* synthetic */ Object head;
    private volatile /* synthetic */ Object tail;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a extends o implements l<Throwable, u> {
        public final /* synthetic */ g a;

        public a(g gVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(Throwable th) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }
    }

    public g(int i2, int i3) {
    }

    public static final /* synthetic */ boolean b(g gVar, s sVar) {
    }

    public static final /* synthetic */ l c(g gVar) {
    }

    @Override // o.a.x3.f
    public Object a(n.a0.d<? super u> dVar) {
    }

    public final Object d(n.a0.d<? super u> dVar) {
    }

    public final boolean e(s<? super u> sVar) {
    }

    public final boolean f(s<? super u> sVar) {
    }

    public final boolean g() {
    }

    @Override // o.a.x3.f
    public void release() {
    }
}
