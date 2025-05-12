package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class ActivityResultRegistry {
    public Random a;
    public final Map<Integer, String> b;
    public final Map<String, Integer> c;
    public final Map<String, d> d;
    public ArrayList<String> e;
    public final transient Map<String, c<?>> f;
    public final Map<String, Object> g;
    public final Bundle h;

    /* renamed from: androidx.activity.result.ActivityResultRegistry$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements LifecycleEventObserver {
        public final /* synthetic */ String a;
        public final /* synthetic */ j.a.h.b b;
        public final /* synthetic */ j.a.h.f.a c;
        public final /* synthetic */ ActivityResultRegistry d;

        public AnonymousClass1(ActivityResultRegistry activityResultRegistry, String str, j.a.h.b bVar, j.a.h.f.a aVar) {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a<I> extends j.a.h.c<I> {
        public final /* synthetic */ String a;
        public final /* synthetic */ j.a.h.f.a b;
        public final /* synthetic */ ActivityResultRegistry c;

        public a(ActivityResultRegistry activityResultRegistry, String str, j.a.h.f.a aVar) {
        }

        @Override // j.a.h.c
        public void b(I i2, j.g.j.d dVar) {
        }

        @Override // j.a.h.c
        public void c() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b<I> extends j.a.h.c<I> {
        public final /* synthetic */ String a;
        public final /* synthetic */ j.a.h.f.a b;
        public final /* synthetic */ ActivityResultRegistry c;

        public b(ActivityResultRegistry activityResultRegistry, String str, j.a.h.f.a aVar) {
        }

        @Override // j.a.h.c
        public void b(I i2, j.g.j.d dVar) {
        }

        @Override // j.a.h.c
        public void c() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c<O> {
        public final j.a.h.b<O> a;
        public final j.a.h.f.a<?, O> b;

        public c(j.a.h.b<O> bVar, j.a.h.f.a<?, O> aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d {
        public final Lifecycle a;
        public final ArrayList<LifecycleEventObserver> b;

        public d(Lifecycle lifecycle) {
        }

        public void a(LifecycleEventObserver lifecycleEventObserver) {
        }

        public void b() {
        }
    }

    public final void a(int i2, String str) {
    }

    public final boolean b(int i2, int i3, Intent intent) {
    }

    public final <O> boolean c(int i2, @SuppressLint({"UnknownNullness"}) O o2) {
    }

    public final <O> void d(String str, int i2, Intent intent, c<O> cVar) {
    }

    public final int e() {
    }

    public abstract <I, O> void f(int i2, j.a.h.f.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i3, j.g.j.d dVar);

    public final void g(Bundle bundle) {
    }

    public final void h(Bundle bundle) {
    }

    public final <I, O> j.a.h.c<I> i(String str, j.a.h.f.a<I, O> aVar, j.a.h.b<O> bVar) {
    }

    public final <I, O> j.a.h.c<I> j(String str, LifecycleOwner lifecycleOwner, j.a.h.f.a<I, O> aVar, j.a.h.b<O> bVar) {
    }

    public final void k(String str) {
    }

    public final void l(String str) {
    }
}
