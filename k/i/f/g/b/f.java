package k.i.f.g.b;

import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import k.i.f.g.b.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class f implements h.a {
    public static a f;
    public h a;
    public ConcurrentHashMap<Runnable, WeakReference<j>> b;
    public int c;
    public LinkedList<WeakReference<j>> d;
    public String e;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface a {
        void a(Message message, Runnable runnable, Thread thread, long j2, long j3, float f);
    }

    public f(Looper looper) {
    }

    @Override // k.i.f.g.b.h.a
    public void a(Message message, Runnable runnable, Thread thread, long j2, long j3, float f2) {
    }

    @Override // k.i.f.g.b.h.a
    public final void b(Runnable runnable, j jVar) {
    }

    @Override // k.i.f.g.b.h.a
    public final void c(Runnable runnable, j jVar) {
    }

    public final boolean d(Runnable runnable) {
    }

    public final boolean e(Runnable runnable, long j2) {
    }

    public final void f(Runnable runnable) {
    }

    public final void g(int i2) {
    }

    public final boolean h(int i2) {
    }

    @Override // k.i.f.g.b.h.a
    public void handleMessage(Message message) {
    }

    public final boolean i(int i2, long j2) {
    }

    public String toString() {
    }
}
