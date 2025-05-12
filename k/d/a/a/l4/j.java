package k.d.a.a.l4;

import java.util.ArrayDeque;
import k.d.a.a.l4.f;
import k.d.a.a.l4.g;
import k.d.a.a.l4.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class j<I extends g, O extends h, E extends f> implements d<I, O, E> {
    public final Thread a;
    public final Object b;
    public final ArrayDeque<I> c;
    public final ArrayDeque<O> d;
    public final I[] e;
    public final O[] f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public I f4088i;

    /* renamed from: j, reason: collision with root package name */
    public E f4089j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4090k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4091l;

    /* renamed from: m, reason: collision with root package name */
    public int f4092m;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends Thread {
        public final /* synthetic */ j a;

        public a(j jVar, String str) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    public j(I[] iArr, O[] oArr) {
    }

    public static /* synthetic */ void e(j jVar) {
    }

    @Override // k.d.a.a.l4.d
    public /* bridge */ /* synthetic */ Object b() throws f {
    }

    @Override // k.d.a.a.l4.d
    public /* bridge */ /* synthetic */ Object c() throws f {
    }

    @Override // k.d.a.a.l4.d
    public /* bridge */ /* synthetic */ void d(Object obj) throws f {
    }

    public final boolean f() {
    }

    @Override // k.d.a.a.l4.d
    public final void flush() {
    }

    public abstract I g();

    public abstract O h();

    public abstract E i(Throwable th);

    public abstract E j(I i2, O o2, boolean z);

    public final boolean k() throws InterruptedException {
    }

    public final I l() throws f {
    }

    public final O m() throws f {
    }

    public final void n() {
    }

    public final void o() throws f {
    }

    public final void p(I i2) throws f {
    }

    public final void q(I i2) {
    }

    public void r(O o2) {
    }

    @Override // k.d.a.a.l4.d
    public void release() {
    }

    public final void s(O o2) {
    }

    public final void t() {
    }

    public final void u(int i2) {
    }
}
