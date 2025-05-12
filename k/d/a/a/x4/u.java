package k.d.a.a.x4;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;
import k.d.a.a.x4.q;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class u<T> {
    public final h a;
    public final t b;
    public final b<T> c;
    public final CopyOnWriteArraySet<c<T>> d;
    public final ArrayDeque<Runnable> e;
    public final ArrayDeque<Runnable> f;
    public final Object g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5165i;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface a<T> {
        void invoke(T t2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b<T> {
        void a(T t2, q qVar);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class c<T> {
        public final T a;
        public q.b b;
        public boolean c;
        public boolean d;

        public c(T t2) {
        }

        public void a(int i2, a<T> aVar) {
        }

        public void b(b<T> bVar) {
        }

        public void c(b<T> bVar) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    public u(Looper looper, h hVar, b<T> bVar) {
    }

    public static /* synthetic */ boolean f(u uVar, Message message) {
    }

    public static /* synthetic */ void g(CopyOnWriteArraySet copyOnWriteArraySet, int i2, a aVar) {
    }

    public void a(T t2) {
    }

    public u<T> b(Looper looper, h hVar, b<T> bVar) {
    }

    public u<T> c(Looper looper, b<T> bVar) {
    }

    public void d() {
    }

    public final boolean e(Message message) {
    }

    public void h(int i2, a<T> aVar) {
    }

    public void i() {
    }

    public void j(T t2) {
    }

    public void k(int i2, a<T> aVar) {
    }

    public final void l() {
    }

    public u(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, h hVar, b<T> bVar) {
    }
}
