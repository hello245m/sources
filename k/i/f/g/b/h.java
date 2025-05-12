package k.i.f.g.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import k.i.f.g.b.j;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class h extends Handler implements j.a {
    public Looper a;
    public Handler.Callback b;
    public a c;
    public String d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface a {
        void a(Message message, Runnable runnable, Thread thread, long j2, long j3, float f);

        void b(Runnable runnable, j jVar);

        void c(Runnable runnable, j jVar);

        void handleMessage(Message message);
    }

    public h(Looper looper, a aVar) {
    }

    @Override // k.i.f.g.b.j.a
    public void a(Message message, Runnable runnable, Thread thread, long j2, long j3, float f) {
    }

    @Override // k.i.f.g.b.j.a
    public void b(Runnable runnable, j jVar) {
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j2) {
    }

    @Override // android.os.Handler
    public String toString() {
    }
}
