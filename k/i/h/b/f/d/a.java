package k.i.h.b.f.d;

import android.app.Activity;
import android.os.Bundle;
import java.lang.Thread;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import k.i.d.a.d.d;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class a implements Thread.UncaughtExceptionHandler {
    public static a d;
    public List<Thread.UncaughtExceptionHandler> a;
    public List<b> b;
    public c c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface b {
        void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th);
    }

    public static synchronized void a(b bVar) {
    }

    public static synchronized a b() {
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class c extends d.b {
        public ConcurrentLinkedQueue<Activity> a;

        public c() {
        }

        public void a() {
        }

        @Override // k.i.d.a.d.d.b, k.i.d.a.d.d.a
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // k.i.d.a.d.d.b, k.i.d.a.d.d.a
        public void onActivityDestroyed(Activity activity) {
        }

        public /* synthetic */ c(C0490a c0490a) {
        }
    }
}
