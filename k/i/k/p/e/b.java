package k.i.k.p.e;

import android.os.Handler;
import android.os.MessageQueue;
import com.tencent.bugly.common.utils.RecyclablePool;
import com.tencent.rmonitor.base.meta.InspectUUID;
import com.tencent.rmonitor.base.plugin.listener.IMemoryLeakListener;
import java.lang.ref.ReferenceQueue;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class b {
    public static final RecyclablePool d = null;
    public static long e;
    public static ReferenceQueue<Object> f;
    public static List<d> g;
    public final Handler a;
    public final IMemoryLeakListener b;
    public final k.i.k.p.e.c c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a implements MessageQueue.IdleHandler {
        public final /* synthetic */ InspectUUID a;
        public final /* synthetic */ b b;

        public a(b bVar, InspectUUID inspectUUID) {
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
        }
    }

    /* renamed from: k.i.k.p.e.b$b, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class RunnableC0739b implements Runnable {
        public k.i.k.c.b.f.d a;

        public final boolean a() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class c implements Runnable {
        public int a;
        public final InspectUUID b;
        public final Handler c;
        public final IMemoryLeakListener d;
        public final k.i.k.p.e.c e;
        public long f;

        public c(InspectUUID inspectUUID, int i2, Handler handler, IMemoryLeakListener iMemoryLeakListener, k.i.k.p.e.c cVar) {
        }

        public final boolean a(k.i.k.c.b.f.d dVar, String str) {
        }

        public final boolean b(long j2) {
        }

        public final long c() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class d {
        public final InspectUUID a;
        public final IMemoryLeakListener b;
        public final k.i.k.p.e.c c;
        public final long d;

        public d(InspectUUID inspectUUID, IMemoryLeakListener iMemoryLeakListener, long j2, k.i.k.p.e.c cVar) {
        }
    }

    public b(Handler handler, IMemoryLeakListener iMemoryLeakListener) {
    }

    public static /* synthetic */ Handler a(b bVar) {
    }

    public static /* synthetic */ IMemoryLeakListener b(b bVar) {
    }

    public static /* synthetic */ k.i.k.p.e.c c(b bVar) {
    }

    public static /* synthetic */ List d() {
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ RecyclablePool f() {
    }

    public static void g() {
    }

    public static void h() {
    }

    public final InspectUUID i(Object obj, String str) {
    }

    public final void j(Object obj, String str) {
    }

    public void k(Object obj, String str) {
    }

    public void l() {
    }
}
