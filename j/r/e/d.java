package j.r.e;

import android.os.Handler;
import j.r.e.j;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class d<T> {
    public static final Executor h = null;
    public final s a;
    public final j.r.e.c<T> b;
    public Executor c;
    public final List<b<T>> d;
    public List<T> e;
    public List<T> f;
    public int g;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Runnable {
        public final /* synthetic */ List a;
        public final /* synthetic */ List b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Runnable d;
        public final /* synthetic */ d e;

        /* renamed from: j.r.e.d$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class C0170a extends j.b {
            public final /* synthetic */ a a;

            public C0170a(a aVar) {
            }

            @Override // j.r.e.j.b
            public boolean a(int i2, int i3) {
            }

            @Override // j.r.e.j.b
            public boolean b(int i2, int i3) {
            }

            @Override // j.r.e.j.b
            public Object c(int i2, int i3) {
            }

            @Override // j.r.e.j.b
            public int d() {
            }

            @Override // j.r.e.j.b
            public int e() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class b implements Runnable {
            public final /* synthetic */ j.e a;
            public final /* synthetic */ a b;

            public b(a aVar, j.e eVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public a(d dVar, List list, List list2, int i2, Runnable runnable) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b<T> {
        void a(List<T> list, List<T> list2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c implements Executor {
        public final Handler a;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
        }
    }

    public d(s sVar, j.r.e.c<T> cVar) {
    }

    public void a(b<T> bVar) {
    }

    public List<T> b() {
    }

    public void c(List<T> list, j.e eVar, Runnable runnable) {
    }

    public final void d(List<T> list, Runnable runnable) {
    }

    public void e(List<T> list) {
    }

    public void f(List<T> list, Runnable runnable) {
    }
}
