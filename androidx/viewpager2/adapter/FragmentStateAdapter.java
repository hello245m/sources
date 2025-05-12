package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import j.k.d.m;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class FragmentStateAdapter extends RecyclerView.h<j.b0.b.a> implements j.b0.b.b {
    public final Lifecycle d;
    public final m e;
    public final j.d.d<Fragment> f;
    public final j.d.d<Fragment.m> g;
    public final j.d.d<Integer> h;

    /* renamed from: i, reason: collision with root package name */
    public FragmentMaxLifecycleEnforcer f315i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f316j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f317k;

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass2 implements LifecycleEventObserver {
        public final /* synthetic */ j.b0.b.a a;
        public final /* synthetic */ FragmentStateAdapter b;

        public AnonymousClass2(FragmentStateAdapter fragmentStateAdapter, j.b0.b.a aVar) {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$5, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass5 implements LifecycleEventObserver {
        public final /* synthetic */ Handler a;
        public final /* synthetic */ Runnable b;

        public AnonymousClass5(FragmentStateAdapter fragmentStateAdapter, Handler handler, Runnable runnable) {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class FragmentMaxLifecycleEnforcer {
        public ViewPager2.i a;
        public RecyclerView.j b;
        public LifecycleEventObserver c;
        public ViewPager2 d;
        public long e;
        public final /* synthetic */ FragmentStateAdapter f;

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass3 implements LifecycleEventObserver {
            public final /* synthetic */ FragmentMaxLifecycleEnforcer a;

            public AnonymousClass3(FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer) {
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a extends ViewPager2.i {
            public final /* synthetic */ FragmentMaxLifecycleEnforcer a;

            public a(FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer) {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void a(int i2) {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void c(int i2) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class b extends d {
            public final /* synthetic */ FragmentMaxLifecycleEnforcer a;

            public b(FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.j
            public void a() {
            }
        }

        public FragmentMaxLifecycleEnforcer(FragmentStateAdapter fragmentStateAdapter) {
        }

        public final ViewPager2 a(RecyclerView recyclerView) {
        }

        public void b(RecyclerView recyclerView) {
        }

        public void c(RecyclerView recyclerView) {
        }

        public void d(boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements View.OnLayoutChangeListener {
        public final /* synthetic */ FrameLayout a;
        public final /* synthetic */ j.b0.b.a b;
        public final /* synthetic */ FragmentStateAdapter c;

        public a(FragmentStateAdapter fragmentStateAdapter, FrameLayout frameLayout, j.b0.b.a aVar) {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends m.l {
        public final /* synthetic */ Fragment a;
        public final /* synthetic */ FrameLayout b;
        public final /* synthetic */ FragmentStateAdapter c;

        public b(FragmentStateAdapter fragmentStateAdapter, Fragment fragment, FrameLayout frameLayout) {
        }

        @Override // j.k.d.m.l
        public void m(m mVar, Fragment fragment, View view, Bundle bundle) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements Runnable {
        public final /* synthetic */ FragmentStateAdapter a;

        public c(FragmentStateAdapter fragmentStateAdapter) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class d extends RecyclerView.j {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i2, int i3, Object obj) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void e(int i2, int i3, int i4) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void f(int i2, int i3) {
        }

        public /* synthetic */ d(a aVar) {
        }
    }

    public FragmentStateAdapter(FragmentActivity fragmentActivity) {
    }

    public static String W(String str, long j2) {
    }

    public static boolean a0(String str, String str2) {
    }

    public static long h0(String str, String str2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void G(RecyclerView recyclerView) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public /* bridge */ /* synthetic */ void H(j.b0.b.a aVar, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public /* bridge */ /* synthetic */ j.b0.b.a J(ViewGroup viewGroup, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void K(RecyclerView recyclerView) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public /* bridge */ /* synthetic */ boolean L(j.b0.b.a aVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public /* bridge */ /* synthetic */ void M(j.b0.b.a aVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public /* bridge */ /* synthetic */ void O(j.b0.b.a aVar) {
    }

    public void T(View view, FrameLayout frameLayout) {
    }

    public boolean U(long j2) {
    }

    public abstract Fragment V(int i2);

    public final void X(int i2) {
    }

    public void Y() {
    }

    public final boolean Z(long j2) {
    }

    public final Long b0(int i2) {
    }

    @Override // j.b0.b.b
    public final void c(Parcelable parcelable) {
    }

    public final void c0(j.b0.b.a aVar, int i2) {
    }

    public final j.b0.b.a d0(ViewGroup viewGroup, int i2) {
    }

    public final boolean e0(j.b0.b.a aVar) {
    }

    public final void f0(j.b0.b.a aVar) {
    }

    public final void g0(j.b0.b.a aVar) {
    }

    public void i0(j.b0.b.a aVar) {
    }

    public final void j0(long j2) {
    }

    public final void k0() {
    }

    public final void l0(Fragment fragment, FrameLayout frameLayout) {
    }

    public boolean m0() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long r(int i2) {
    }

    @Override // j.b0.b.b
    public final Parcelable saveState() {
    }

    public FragmentStateAdapter(m mVar, Lifecycle lifecycle) {
    }
}
