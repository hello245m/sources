package k.i.f.g.a;

import android.os.Looper;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class a {
    public static a c;
    public final HashMap<Integer, LinkedList<k.i.f.g.a.c>> a;
    public final HashMap<Integer, d> b;

    /* renamed from: k.i.f.g.a.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class RunnableC0316a implements Runnable {
        public final /* synthetic */ k.i.f.g.a.b a;

        public RunnableC0316a(a aVar, k.i.f.g.a.b bVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Comparator<k.i.f.g.a.c> {
        public b(a aVar) {
        }

        public int a(k.i.f.g.a.c cVar, k.i.f.g.a.c cVar2) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(k.i.f.g.a.c cVar, k.i.f.g.a.c cVar2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c extends k.i.f.h.d.c {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d extends k.i.f.h.a.a<k.i.f.g.a.c> {

        /* renamed from: k.i.f.g.a.a$d$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class C0317a implements Comparator<k.i.f.h.a.b> {
            public C0317a(d dVar) {
            }

            public int a(k.i.f.h.a.b bVar, k.i.f.h.a.b bVar2) {
            }

            @Override // java.util.Comparator
            public /* bridge */ /* synthetic */ int compare(k.i.f.h.a.b bVar, k.i.f.h.a.b bVar2) {
            }
        }

        public void d(k.i.f.h.f.b bVar) {
        }

        public void e(k.i.f.g.a.c cVar) {
        }
    }

    @Deprecated
    public boolean a(k.i.f.g.a.c cVar) {
    }

    public void b(k.i.f.g.a.b bVar, Looper looper) {
    }

    public boolean c(k.i.f.g.a.b bVar) {
    }

    @Deprecated
    public boolean d(k.i.f.g.a.c cVar) {
    }

    public final void e(LinkedList<k.i.f.g.a.c> linkedList, k.i.f.g.a.b bVar) {
    }
}
