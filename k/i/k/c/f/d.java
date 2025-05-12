package k.i.k.c.f;

import android.os.Handler;
import com.tencent.bugly.common.reporter.IReporter;
import com.tencent.bugly.common.reporter.data.ReportData;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class d implements IReporter {
    public static boolean a;
    public static Handler b;
    public static IReporter c;
    public static k.i.k.c.f.b d;
    public static k.i.k.c.f.c e;
    public static PriorityBlockingQueue<a> f;
    public static final Thread g = null;
    public static final d h = null;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a implements Comparable<a> {
        public static AtomicInteger f;
        public final int a;
        public Runnable b;
        public final int c;
        public final ReportData d;
        public final IReporter.ReportCallback e;

        public a(int i2, ReportData reportData, IReporter.ReportCallback reportCallback) {
        }

        public final int a(int i2) {
        }

        public int b(a aVar) {
        }

        public final IReporter.ReportCallback c() {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(a aVar) {
        }

        public final ReportData d() {
        }

        public final Runnable e() {
        }

        public final void f(Runnable runnable) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b implements Runnable {
        public final /* synthetic */ ReportData a;
        public final /* synthetic */ IReporter.ReportCallback b;

        public b(ReportData reportData, IReporter.ReportCallback reportCallback) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c implements Runnable {
        public final /* synthetic */ Runnable a;

        public c(Runnable runnable) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* renamed from: k.i.k.c.f.d$d, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class C0722d implements IReporter.ReportCallback {
        public final /* synthetic */ long a;
        public final /* synthetic */ ReportData b;
        public final /* synthetic */ IReporter.ReportCallback c;

        public C0722d(long j2, ReportData reportData, IReporter.ReportCallback reportCallback) {
        }

        @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
        public void onCached() {
        }

        @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
        public void onFailure(int i2, String str, int i3, int i4) {
        }

        @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
        public void onSuccess(int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e implements Runnable {
        public final /* synthetic */ ReportData a;

        public e(ReportData reportData) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f implements Runnable {
        public static final f a = null;

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    public static final /* synthetic */ a a(d dVar, int i2, Runnable runnable) {
    }

    public static final /* synthetic */ boolean b(d dVar, int i2, ReportData reportData, IReporter.ReportCallback reportCallback) {
    }

    public static final /* synthetic */ void c(d dVar, ReportData reportData, IReporter.ReportCallback reportCallback) {
    }

    public final boolean d(ReportData reportData) {
    }

    public final k.i.k.c.f.b e() {
    }

    public final PriorityBlockingQueue<a> f() {
    }

    public final a g(int i2, Runnable runnable) {
    }

    public final boolean h(int i2, ReportData reportData, IReporter.ReportCallback reportCallback) {
    }

    public final boolean i() {
    }

    public final void j(Runnable runnable) {
    }

    public final void k(Runnable runnable, long j2) {
    }

    public final void l(ReportData reportData, k.i.k.c.f.a aVar) {
    }

    public final void m(ReportData reportData, boolean z, int i2, int i3, long j2) {
    }

    public final void n(ReportData reportData, boolean z, boolean z2, int i2, int i3, long j2) {
    }

    public final void o(ReportData reportData, int i2, int i3, long j2) {
    }

    public final void p(ReportData reportData, IReporter.ReportCallback reportCallback) {
    }

    public final void q() {
    }

    @Override // com.tencent.bugly.common.reporter.IReporter
    public boolean reportNow(ReportData reportData, IReporter.ReportCallback reportCallback) {
    }
}
