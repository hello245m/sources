package j.s;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.LiveData;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class k0 {

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f3514n = null;
    public final HashMap<String, Integer> a;
    public final String[] b;
    public Map<String, Set<String>> c;
    public x d;
    public final s0 e;
    public AtomicBoolean f;
    public volatile boolean g;
    public volatile j.u.a.k h;

    /* renamed from: i, reason: collision with root package name */
    public final b f3515i;

    /* renamed from: j, reason: collision with root package name */
    public final j0 f3516j;

    /* renamed from: k, reason: collision with root package name */
    @SuppressLint({"RestrictedApi"})
    public final SafeIterableMap<c, d> f3517k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f3518l;

    /* renamed from: m, reason: collision with root package name */
    public Runnable f3519m;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Runnable {
        public final /* synthetic */ k0 a;

        public a(k0 k0Var) {
        }

        public final Set<Integer> a() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b {
        public final long[] a;
        public final boolean[] b;
        public final int[] c;
        public boolean d;

        public b(int i2) {
        }

        public int[] a() {
        }

        public boolean b(int... iArr) {
        }

        public boolean c(int... iArr) {
        }

        public void d() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class c {
        public final String[] a;

        public c(String[] strArr) {
        }

        public boolean a() {
        }

        public abstract void b(Set<String> set);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d {
        public final int[] a;
        public final String[] b;
        public final c c;
        public final Set<String> d;

        public d(c cVar, int[] iArr, String[] strArr) {
        }

        public void a(Set<Integer> set) {
        }

        public void b(String[] strArr) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class e extends c {
        public final k0 b;
        public final WeakReference<c> c;

        public e(k0 k0Var, c cVar) {
        }

        @Override // j.s.k0.c
        public void b(Set<String> set) {
        }
    }

    public k0(s0 s0Var, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
    }

    public static void c(StringBuilder sb, String str, String str2) {
    }

    public static void d(j.u.a.g gVar) {
    }

    @SuppressLint({"RestrictedApi"})
    public void a(c cVar) {
    }

    public void b(c cVar) {
    }

    public <T> LiveData<T> e(String[] strArr, boolean z, Callable<T> callable) {
    }

    public boolean f() {
    }

    public void g(j.u.a.g gVar) {
    }

    public void h(String... strArr) {
    }

    public void i() {
    }

    public void j() {
    }

    @SuppressLint({"RestrictedApi"})
    public void k(c cVar) {
    }

    public final String[] l(String[] strArr) {
    }

    public void m(x xVar) {
    }

    public void n(Context context, String str, Intent intent) {
    }

    public final void o(j.u.a.g gVar, int i2) {
    }

    public final void p(j.u.a.g gVar, int i2) {
    }

    public void q() {
    }

    public void r(j.u.a.g gVar) {
    }

    public final String[] s(String[] strArr) {
    }
}
