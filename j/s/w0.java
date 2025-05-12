package j.s;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import j.s.k0;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class w0<T> extends LiveData<T> {
    public final s0 a;
    public final boolean b;
    public final Callable<T> c;
    public final j0 d;
    public final k0.c e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;

    /* renamed from: i, reason: collision with root package name */
    public final Runnable f3542i;

    /* renamed from: j, reason: collision with root package name */
    public final Runnable f3543j;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Runnable {
        public final /* synthetic */ w0 a;

        public a(w0 w0Var) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Runnable {
        public final /* synthetic */ w0 a;

        public b(w0 w0Var) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends k0.c {
        public final /* synthetic */ w0 b;

        public c(w0 w0Var, String[] strArr) {
        }

        @Override // j.s.k0.c
        public void b(Set<String> set) {
        }
    }

    @SuppressLint({"RestrictedApi"})
    public w0(s0 s0Var, j0 j0Var, boolean z, Callable<T> callable, String[] strArr) {
    }

    public static /* synthetic */ void b(w0 w0Var, Object obj) {
    }

    public Executor c() {
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
    }
}
