package j.k.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import j.k.d.y;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class m {
    public static boolean O = false;
    public static boolean P = true;
    public j.a.h.c<j.a.h.e> A;
    public j.a.h.c<String[]> B;
    public ArrayDeque<C0158m> C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList<j.k.d.a> I;
    public ArrayList<Boolean> J;
    public ArrayList<Fragment> K;
    public ArrayList<q> L;
    public j.k.d.p M;
    public Runnable N;
    public final ArrayList<o> a;
    public boolean b;
    public final w c;
    public ArrayList<j.k.d.a> d;
    public ArrayList<Fragment> e;
    public final j.k.d.k f;
    public OnBackPressedDispatcher g;
    public final j.a.e h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f3367i;

    /* renamed from: j, reason: collision with root package name */
    public final Map<String, Bundle> f3368j;

    /* renamed from: k, reason: collision with root package name */
    public final Map<String, Object> f3369k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList<n> f3370l;

    /* renamed from: m, reason: collision with root package name */
    public Map<Fragment, HashSet<j.g.p.b>> f3371m;

    /* renamed from: n, reason: collision with root package name */
    public final y.g f3372n;

    /* renamed from: o, reason: collision with root package name */
    public final j.k.d.l f3373o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList<j.k.d.q> f3374p;

    /* renamed from: q, reason: collision with root package name */
    public int f3375q;

    /* renamed from: r, reason: collision with root package name */
    public j.k.d.j<?> f3376r;

    /* renamed from: s, reason: collision with root package name */
    public j.k.d.f f3377s;

    /* renamed from: t, reason: collision with root package name */
    public Fragment f3378t;
    public Fragment u;
    public j.k.d.i v;
    public j.k.d.i w;
    public e0 x;
    public e0 y;
    public j.a.h.c<Intent> z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements j.a.h.b<j.a.h.a> {
        public final /* synthetic */ m a;

        public a(m mVar) {
        }

        @Override // j.a.h.b
        public /* bridge */ /* synthetic */ void a(j.a.h.a aVar) {
        }

        public void b(j.a.h.a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements j.a.h.b<Map<String, Boolean>> {
        public final /* synthetic */ m a;

        public b(m mVar) {
        }

        @Override // j.a.h.b
        @SuppressLint({"SyntheticAccessor"})
        public /* bridge */ /* synthetic */ void a(Map<String, Boolean> map) {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void b(Map<String, Boolean> map) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends j.a.e {
        public final /* synthetic */ m c;

        public c(m mVar, boolean z) {
        }

        @Override // j.a.e
        public void b() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d implements y.g {
        public final /* synthetic */ m a;

        public d(m mVar) {
        }

        @Override // j.k.d.y.g
        public void a(Fragment fragment, j.g.p.b bVar) {
        }

        @Override // j.k.d.y.g
        public void b(Fragment fragment, j.g.p.b bVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e extends j.k.d.i {
        public final /* synthetic */ m b;

        public e(m mVar) {
        }

        @Override // j.k.d.i
        public Fragment a(ClassLoader classLoader, String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f implements e0 {
        public f(m mVar) {
        }

        @Override // j.k.d.e0
        public d0 a(ViewGroup viewGroup) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class g implements Runnable {
        public final /* synthetic */ m a;

        public g(m mVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class h extends AnimatorListenerAdapter {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ Fragment c;

        public h(m mVar, ViewGroup viewGroup, View view, Fragment fragment) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class i implements j.k.d.q {
        public final /* synthetic */ Fragment a;

        public i(m mVar, Fragment fragment) {
        }

        @Override // j.k.d.q
        public void a(m mVar, Fragment fragment) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class j implements j.a.h.b<j.a.h.a> {
        public final /* synthetic */ m a;

        public j(m mVar) {
        }

        @Override // j.a.h.b
        public /* bridge */ /* synthetic */ void a(j.a.h.a aVar) {
        }

        public void b(j.a.h.a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class k extends j.a.h.f.a<j.a.h.e, j.a.h.a> {
        @Override // j.a.h.f.a
        public /* bridge */ /* synthetic */ Intent a(Context context, j.a.h.e eVar) {
        }

        @Override // j.a.h.f.a
        public /* bridge */ /* synthetic */ j.a.h.a c(int i2, Intent intent) {
        }

        public Intent d(Context context, j.a.h.e eVar) {
        }

        public j.a.h.a e(int i2, Intent intent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class l {
        @Deprecated
        public void a(m mVar, Fragment fragment, Bundle bundle) {
        }

        public void b(m mVar, Fragment fragment, Context context) {
        }

        public void c(m mVar, Fragment fragment, Bundle bundle) {
        }

        public void d(m mVar, Fragment fragment) {
        }

        public void e(m mVar, Fragment fragment) {
        }

        public void f(m mVar, Fragment fragment) {
        }

        public void g(m mVar, Fragment fragment, Context context) {
        }

        public void h(m mVar, Fragment fragment, Bundle bundle) {
        }

        public void i(m mVar, Fragment fragment) {
        }

        public void j(m mVar, Fragment fragment, Bundle bundle) {
        }

        public void k(m mVar, Fragment fragment) {
        }

        public void l(m mVar, Fragment fragment) {
        }

        public void m(m mVar, Fragment fragment, View view, Bundle bundle) {
        }

        public void n(m mVar, Fragment fragment) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface n {
        void a();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface o {
        boolean a(ArrayList<j.k.d.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class p implements o {
        public final String a;
        public final int b;
        public final int c;
        public final /* synthetic */ m d;

        public p(m mVar, String str, int i2, int i3) {
        }

        @Override // j.k.d.m.o
        public boolean a(ArrayList<j.k.d.a> arrayList, ArrayList<Boolean> arrayList2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class q implements Fragment.l {
        public final boolean a;
        public final j.k.d.a b;
        public int c;

        public q(j.k.d.a aVar, boolean z) {
        }

        @Override // androidx.fragment.app.Fragment.l
        public void a() {
        }

        @Override // androidx.fragment.app.Fragment.l
        public void b() {
        }

        public void c() {
        }

        public void d() {
        }

        public boolean e() {
        }
    }

    public static Fragment A0(View view) {
    }

    public static boolean G0(int i2) {
    }

    public static /* synthetic */ Map a(m mVar) {
    }

    public static /* synthetic */ Map b(m mVar) {
    }

    public static /* synthetic */ w c(m mVar) {
    }

    public static void d0(ArrayList<j.k.d.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
    }

    public static int k1(int i2) {
    }

    public void A() {
    }

    public void B(Configuration configuration) {
    }

    public ViewModelStore B0(Fragment fragment) {
    }

    public boolean C(MenuItem menuItem) {
    }

    public void C0() {
    }

    public void D() {
    }

    public void D0(Fragment fragment) {
    }

    public boolean E(Menu menu, MenuInflater menuInflater) {
    }

    public void E0(Fragment fragment) {
    }

    public void F() {
    }

    public boolean F0() {
    }

    public void G() {
    }

    public void H() {
    }

    public final boolean H0(Fragment fragment) {
    }

    public void I(boolean z) {
    }

    public boolean I0(Fragment fragment) {
    }

    public void J(Fragment fragment) {
    }

    public boolean J0(Fragment fragment) {
    }

    public boolean K(MenuItem menuItem) {
    }

    public boolean K0(int i2) {
    }

    public void L(Menu menu) {
    }

    public boolean L0() {
    }

    public final void M(Fragment fragment) {
    }

    public void M0(Fragment fragment, String[] strArr, int i2) {
    }

    public void N() {
    }

    public void N0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
    }

    public void O(boolean z) {
    }

    public void O0(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
    }

    public boolean P(Menu menu) {
    }

    public final void P0(j.d.b<Fragment> bVar) {
    }

    public void Q() {
    }

    public void Q0(Fragment fragment) {
    }

    public void R() {
    }

    public void R0(int i2, boolean z) {
    }

    public void S() {
    }

    public void S0(Fragment fragment) {
    }

    public final void T(int i2) {
    }

    public void T0(Fragment fragment, int i2) {
    }

    public void U() {
    }

    public void U0() {
    }

    public void V() {
    }

    public void V0(j.k.d.g gVar) {
    }

    public final void W() {
    }

    public void W0(u uVar) {
    }

    public void X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void X0(int i2, int i3) {
    }

    public final void Y() {
    }

    public boolean Y0() {
    }

    public void Z(o oVar, boolean z) {
    }

    public final boolean Z0(String str, int i2, int i3) {
    }

    public final void a0(boolean z) {
    }

    public boolean a1(ArrayList<j.k.d.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
    }

    public boolean b0(boolean z) {
    }

    public final int b1(ArrayList<j.k.d.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, j.d.b<Fragment> bVar) {
    }

    public void c0(o oVar, boolean z) {
    }

    public void c1(Bundle bundle, String str, Fragment fragment) {
    }

    public final void d(j.d.b<Fragment> bVar) {
    }

    public void d1(l lVar, boolean z) {
    }

    public void e(j.k.d.a aVar) {
    }

    public final void e0(ArrayList<j.k.d.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
    }

    public void e1(Fragment fragment, j.g.p.b bVar) {
    }

    public void f(Fragment fragment, j.g.p.b bVar) {
    }

    public final void f0(ArrayList<j.k.d.a> arrayList, ArrayList<Boolean> arrayList2) {
    }

    public void f1(Fragment fragment) {
    }

    public u g(Fragment fragment) {
    }

    public Fragment g0(String str) {
    }

    public final void g1(ArrayList<j.k.d.a> arrayList, ArrayList<Boolean> arrayList2) {
    }

    public void h(j.k.d.q qVar) {
    }

    public Fragment h0(int i2) {
    }

    public void h1(Fragment fragment) {
    }

    public void i(Fragment fragment) {
    }

    public Fragment i0(String str) {
    }

    public final void i1() {
    }

    public int j() {
    }

    public Fragment j0(String str) {
    }

    public void j1(Parcelable parcelable) {
    }

    @SuppressLint({"SyntheticAccessor"})
    public void k(j.k.d.j<?> jVar, j.k.d.f fVar, Fragment fragment) {
    }

    public final void k0() {
    }

    public void l(Fragment fragment) {
    }

    public final boolean l0(ArrayList<j.k.d.a> arrayList, ArrayList<Boolean> arrayList2) {
    }

    public Parcelable l1() {
    }

    public x m() {
    }

    public int m0() {
    }

    public Fragment.m m1(Fragment fragment) {
    }

    public final void n(Fragment fragment) {
    }

    public final j.k.d.p n0(Fragment fragment) {
    }

    public void n1() {
    }

    public boolean o() {
    }

    public j.k.d.f o0() {
    }

    public void o1(Fragment fragment, boolean z) {
    }

    public final void p() {
    }

    public Fragment p0(Bundle bundle, String str) {
    }

    public void p1(Fragment fragment, Lifecycle.State state) {
    }

    public final void q() {
    }

    public final ViewGroup q0(Fragment fragment) {
    }

    public void q1(Fragment fragment) {
    }

    public final void r(String str) {
    }

    public j.k.d.i r0() {
    }

    public final void r1(Fragment fragment) {
    }

    public final Set<d0> s() {
    }

    public w s0() {
    }

    public void s1(Fragment fragment) {
    }

    public final Set<d0> t(ArrayList<j.k.d.a> arrayList, int i2, int i3) {
    }

    public List<Fragment> t0() {
    }

    public final void t1() {
    }

    public String toString() {
    }

    public void u(j.k.d.a aVar, boolean z, boolean z2, boolean z3) {
    }

    public j.k.d.j<?> u0() {
    }

    public final void u1(RuntimeException runtimeException) {
    }

    public final void v(Fragment fragment) {
    }

    public LayoutInflater.Factory2 v0() {
    }

    public void v1(l lVar) {
    }

    public u w(Fragment fragment) {
    }

    public j.k.d.l w0() {
    }

    public final void w1() {
    }

    public final void x(Fragment fragment) {
    }

    public Fragment x0() {
    }

    public void y(Fragment fragment) {
    }

    public Fragment y0() {
    }

    public void z() {
    }

    public e0 z0() {
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: j.k.d.m$m, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class C0158m implements Parcelable {
        public static final Parcelable.Creator<C0158m> CREATOR = null;
        public String a;
        public int b;

        /* renamed from: j.k.d.m$m$a */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Parcelable.Creator<C0158m> {
            public C0158m a(Parcel parcel) {
            }

            public C0158m[] b(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ C0158m createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ C0158m[] newArray(int i2) {
            }
        }

        public C0158m(String str, int i2) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public C0158m(Parcel parcel) {
        }
    }
}
