package j.s;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import j.u.a.h;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class s0 {

    @Deprecated
    public volatile j.u.a.g a;
    public Executor b;
    public Executor c;
    public j.u.a.h d;
    public final k0 e;
    public boolean f;

    @Deprecated
    public List<b> g;
    public Map<Class<? extends j.s.c1.a>, j.s.c1.a> h;

    /* renamed from: i, reason: collision with root package name */
    public final ReentrantReadWriteLock f3524i;

    /* renamed from: j, reason: collision with root package name */
    public x f3525j;

    /* renamed from: k, reason: collision with root package name */
    public final ThreadLocal<Integer> f3526k;

    /* renamed from: l, reason: collision with root package name */
    public final Map<String, Object> f3527l;

    /* renamed from: m, reason: collision with root package name */
    public final Map<Class<?>, Object> f3528m;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a<T extends s0> {
        public final Class<T> a;
        public final String b;
        public final Context c;
        public ArrayList<b> d;
        public e e;
        public f f;
        public Executor g;
        public List<Object> h;

        /* renamed from: i, reason: collision with root package name */
        public List<j.s.c1.a> f3529i;

        /* renamed from: j, reason: collision with root package name */
        public Executor f3530j;

        /* renamed from: k, reason: collision with root package name */
        public Executor f3531k;

        /* renamed from: l, reason: collision with root package name */
        public h.c f3532l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f3533m;

        /* renamed from: n, reason: collision with root package name */
        public c f3534n;

        /* renamed from: o, reason: collision with root package name */
        public Intent f3535o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f3536p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f3537q;

        /* renamed from: r, reason: collision with root package name */
        public long f3538r;

        /* renamed from: s, reason: collision with root package name */
        public TimeUnit f3539s;

        /* renamed from: t, reason: collision with root package name */
        public final d f3540t;
        public Set<Integer> u;
        public Set<Integer> v;
        public String w;
        public File x;
        public Callable<InputStream> y;

        public a(Context context, Class<T> cls, String str) {
        }

        public a<T> a(b bVar) {
        }

        public a<T> b(j.s.c1.b... bVarArr) {
        }

        @SuppressLint({"RestrictedApi"})
        public T c() {
        }

        public a<T> d() {
        }

        public a<T> e(h.c cVar) {
        }

        public a<T> f(long j2, TimeUnit timeUnit) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class b {
        public void a(j.u.a.g gVar) {
        }

        public void b(j.u.a.g gVar) {
        }

        public void c(j.u.a.g gVar) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class c {
        public static final c a = null;
        public static final c b = null;
        public static final c c = null;
        public static final /* synthetic */ c[] d = null;

        public c(String str, int i2) {
        }

        public static boolean a(ActivityManager activityManager) {
        }

        public static c valueOf(String str) {
        }

        public static c[] values() {
        }

        public c b(Context context) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d {
        public HashMap<Integer, TreeMap<Integer, j.s.c1.b>> a;

        public final void a(j.s.c1.b bVar) {
        }

        public void b(j.s.c1.b... bVarArr) {
        }

        public List<j.s.c1.b> c(int i2, int i3) {
        }

        public final List<j.s.c1.b> d(List<j.s.c1.b> list, boolean z, int i2, int i3) {
        }

        public Map<Integer, Map<Integer, j.s.c1.b>> e() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class e {
        public abstract void a(j.u.a.g gVar);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface f {
        void a(String str, List<Object> list);
    }

    public static boolean c0() {
    }

    private /* synthetic */ Object e0(j.u.a.g gVar) {
    }

    private /* synthetic */ Object g0(j.u.a.g gVar) {
    }

    public void H() {
    }

    public void I() {
    }

    @Deprecated
    public void J() {
    }

    public j.u.a.k K(String str) {
    }

    public abstract k0 L();

    public abstract j.u.a.h M(c0 c0Var);

    @Deprecated
    public void N() {
    }

    public List<j.s.c1.b> O(Map<Class<? extends j.s.c1.a>, j.s.c1.a> map) {
    }

    public Map<String, Object> P() {
    }

    public Lock Q() {
    }

    public k0 R() {
    }

    public j.u.a.h S() {
    }

    public Executor T() {
    }

    public Set<Class<? extends j.s.c1.a>> U() {
    }

    public Map<Class<?>, List<Class<?>>> V() {
    }

    public Executor W() {
    }

    public boolean X() {
    }

    public void Y(c0 c0Var) {
    }

    public final void Z() {
    }

    public final void a0() {
    }

    public void b0(j.u.a.g gVar) {
    }

    public boolean d0() {
    }

    public /* synthetic */ Object f0(j.u.a.g gVar) {
    }

    public /* synthetic */ Object h0(j.u.a.g gVar) {
    }

    public Cursor i0(j.u.a.j jVar) {
    }

    public Cursor j0(j.u.a.j jVar, CancellationSignal cancellationSignal) {
    }

    public Cursor k0(String str, Object[] objArr) {
    }

    public void l0(Runnable runnable) {
    }

    @Deprecated
    public void m0() {
    }

    public final <T> T n0(Class<T> cls, j.u.a.h hVar) {
    }
}
