package o.a.v3;

import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import o.a.t3.e0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class a implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8398i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8399j = null;

    /* renamed from: k, reason: collision with root package name */
    public static final e0 f8400k = null;
    private volatile /* synthetic */ int _isTerminated;
    public final int a;
    public final int b;
    public final long c;
    public volatile /* synthetic */ long controlState;
    public final String d;
    public final d e;
    public final d f;
    public final AtomicReferenceArray<b> g;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: o.a.v3.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public /* synthetic */ class C0783a {
        public static final /* synthetic */ int[] a = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class c {
        public static final c a = null;
        public static final c b = null;
        public static final c c = null;
        public static final c d = null;
        public static final c e = null;
        public static final /* synthetic */ c[] f = null;

        public c(String str, int i2) {
        }

        public static final /* synthetic */ c[] a() {
        }

        public static c valueOf(String str) {
        }

        public static c[] values() {
        }
    }

    public a(int i2, int i3, long j2, String str) {
    }

    public static /* synthetic */ void g(a aVar, Runnable runnable, j jVar, boolean z, int i2, Object obj) {
    }

    public static /* synthetic */ boolean t(a aVar, long j2, int i2, Object obj) {
    }

    public final boolean a(i iVar) {
    }

    public final int b() {
    }

    public final i c(Runnable runnable, j jVar) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final b d() {
    }

    public final void e(Runnable runnable, j jVar, boolean z) {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
    }

    public final int h(b bVar) {
    }

    public final b i() {
    }

    public final boolean isTerminated() {
    }

    public final boolean j(b bVar) {
    }

    public final void k(b bVar, int i2, int i3) {
    }

    public final void l(i iVar) {
    }

    public final void n(long j2) {
    }

    public final void o(boolean z) {
    }

    public final void p() {
    }

    public final i q(b bVar, i iVar, boolean z) {
    }

    public final boolean r(long j2) {
    }

    public String toString() {
    }

    public final boolean u() {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public final class b extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater h = null;
        public final m a;
        public c b;
        public long c;
        public long d;
        public int e;
        public boolean f;
        public final /* synthetic */ a g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        public volatile /* synthetic */ int workerCtl;

        public b(a aVar) {
        }

        public final void a(int i2) {
        }

        public final void b(int i2) {
        }

        public final void c(i iVar) {
        }

        public final i d(boolean z) {
        }

        public final i e(boolean z) {
        }

        public final int f() {
        }

        public final Object g() {
        }

        public final void h(int i2) {
        }

        public final boolean i() {
        }

        public final int j(int i2) {
        }

        public final void k() {
        }

        public final i l() {
        }

        public final void m() {
        }

        public final void n(int i2) {
        }

        public final void o(Object obj) {
        }

        public final boolean p() {
        }

        public final void q() {
        }

        public final boolean r(c cVar) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }

        public final i s(boolean z) {
        }

        public final void t() {
        }

        public b(a aVar, int i2) {
        }
    }
}
