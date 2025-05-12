package j.n.b;

import android.content.Context;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class a<D> extends c<D> {

    /* renamed from: j, reason: collision with root package name */
    public final Executor f3396j;

    /* renamed from: k, reason: collision with root package name */
    public volatile a<D>.RunnableC0161a f3397k;

    /* renamed from: l, reason: collision with root package name */
    public volatile a<D>.RunnableC0161a f3398l;

    /* renamed from: m, reason: collision with root package name */
    public long f3399m;

    /* renamed from: n, reason: collision with root package name */
    public long f3400n;

    /* renamed from: o, reason: collision with root package name */
    public Handler f3401o;

    /* renamed from: j.n.b.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class RunnableC0161a extends d<Void, Void, D> implements Runnable {

        /* renamed from: j, reason: collision with root package name */
        public final CountDownLatch f3402j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f3403k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a f3404l;

        public RunnableC0161a(a aVar) {
        }

        @Override // j.n.b.d
        public /* bridge */ /* synthetic */ Object b(Void[] voidArr) {
        }

        @Override // j.n.b.d
        public void h(D d) {
        }

        @Override // j.n.b.d
        public void i(D d) {
        }

        public D n(Void... voidArr) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public a(Context context) {
    }

    public void A() {
    }

    public void B(a<D>.RunnableC0161a runnableC0161a, D d) {
    }

    public void C(a<D>.RunnableC0161a runnableC0161a, D d) {
    }

    public void D() {
    }

    public boolean E() {
    }

    public abstract D F();

    public abstract void G(D d);

    public D H() {
    }

    @Override // j.n.b.c
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // j.n.b.c
    public boolean n() {
    }

    @Override // j.n.b.c
    public void p() {
    }

    public a(Context context, Executor executor) {
    }
}
