package k.i.h.b.d.p0.f;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class b implements ThreadFactory {
    public static final AtomicInteger d = null;
    public final AtomicInteger a;
    public final String b;
    public final ThreadGroup c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends Thread {
        public a(Runnable runnable, ThreadGroup threadGroup, String str) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
    }
}
