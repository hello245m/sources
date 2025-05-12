package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import j.r.e.p;
import j.r.e.v;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.a0.b {
    public boolean A;
    public BitSet B;
    public int C;
    public int D;
    public d E;
    public int F;
    public boolean G;
    public boolean H;
    public e I;
    public int J;
    public final Rect K;
    public final b L;
    public boolean M;
    public boolean N;
    public int[] O;
    public final Runnable P;

    /* renamed from: s, reason: collision with root package name */
    public int f299s;

    /* renamed from: t, reason: collision with root package name */
    public f[] f300t;
    public v u;
    public v v;
    public int w;
    public int x;
    public final p y;
    public boolean z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Runnable {
        public final /* synthetic */ StaggeredGridLayoutManager a;

        public a(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b {
        public int a;
        public int b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int[] f;
        public final /* synthetic */ StaggeredGridLayoutManager g;

        public b(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        }

        public void a() {
        }

        public void b(int i2) {
        }

        public void c() {
        }

        public void d(f[] fVarArr) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c extends RecyclerView.q {
        public f e;
        public boolean f;

        public c(Context context, AttributeSet attributeSet) {
        }

        public boolean i() {
        }

        public void j(boolean z) {
        }

        public c(int i2, int i3) {
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        public c(ViewGroup.LayoutParams layoutParams) {
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = null;
        public int a;
        public int b;
        public int c;
        public int[] d;
        public int e;
        public int[] f;
        public List<d.a> g;
        public boolean h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f301i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f302j;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Parcelable.Creator<e> {
            public e a(Parcel parcel) {
            }

            public e[] b(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ e createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ e[] newArray(int i2) {
            }
        }

        public e() {
        }

        public void a() {
        }

        public void d() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public e(Parcel parcel) {
        }

        public e(e eVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f {
        public ArrayList<View> a;
        public int b;
        public int c;
        public int d;
        public final int e;
        public final /* synthetic */ StaggeredGridLayoutManager f;

        public f(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        }

        public void a(View view) {
        }

        public void b(boolean z, int i2) {
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }

        public int f() {
        }

        public int g() {
        }

        public int h() {
        }

        public int i(int i2, int i3, boolean z, boolean z2, boolean z3) {
        }

        public int j(int i2, int i3, boolean z) {
        }

        public int k(int i2, int i3, boolean z) {
        }

        public int l() {
        }

        public int m() {
        }

        public int n(int i2) {
        }

        public View o(int i2, int i3) {
        }

        public c p(View view) {
        }

        public int q() {
        }

        public int r(int i2) {
        }

        public void s() {
        }

        public void t(int i2) {
        }

        public void u() {
        }

        public void v() {
        }

        public void w(View view) {
        }

        public void x(int i2) {
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void A(int i2, int i3, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
    }

    public int A2() {
    }

    public final int B2(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.b0 b0Var) {
    }

    public final int C2(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean D0() {
    }

    public final int D2(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E(RecyclerView.b0 b0Var) {
    }

    public final int E2(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int F(RecyclerView.b0 b0Var) {
    }

    public final f F2(p pVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int G(RecyclerView.b0 b0Var) {
    }

    public int G2() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int H(RecyclerView.b0 b0Var) {
    }

    public boolean H2() {
    }

    public int I2() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int J1(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    public final void J2(int i2, int i3, int i4) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void K1(int i2) {
    }

    public View K2() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int L1(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    public void L2() {
    }

    public boolean M2() {
    }

    public final void N2(View view, int i2, int i3, boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O0(int i2) {
    }

    public final void O2(View view, c cVar, boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void P0(int i2) {
    }

    public final void P2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q Q() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q0(RecyclerView.h hVar, RecyclerView.h hVar2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q1(Rect rect, int i2, int i3) {
    }

    public final boolean Q2(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q R(Context context, AttributeSet attributeSet) {
    }

    public void R2(int i2, RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q S(ViewGroup.LayoutParams layoutParams) {
    }

    public final void S2(View view) {
    }

    public final void T2(RecyclerView.w wVar, p pVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView recyclerView, RecyclerView.w wVar) {
    }

    public final void U2(RecyclerView.w wVar, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View V0(View view, int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    public final void V2(RecyclerView.w wVar, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(AccessibilityEvent accessibilityEvent) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i2) {
    }

    public final void W2() {
    }

    public final void X2() {
    }

    public int Y2(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    public void Z2(int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF a(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean a2() {
    }

    public final void a3(int i2) {
    }

    public final void b2(View view) {
    }

    public void b3(int i2) {
    }

    public final void c2(b bVar) {
    }

    public void c3(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView recyclerView, int i2, int i3) {
    }

    public boolean d2() {
    }

    public void d3(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e1(RecyclerView recyclerView) {
    }

    public boolean e2() {
    }

    public final void e3(int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(RecyclerView recyclerView, int i2, int i3, int i4) {
    }

    public final void f2(View view, c cVar, p pVar) {
    }

    public final boolean f3(RecyclerView.b0 b0Var, b bVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g1(RecyclerView recyclerView, int i2, int i3) {
    }

    public final int g2(int i2) {
    }

    public boolean g3(RecyclerView.b0 b0Var, b bVar) {
    }

    public boolean h2() {
    }

    public void h3(RecyclerView.b0 b0Var, b bVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void i1(RecyclerView recyclerView, int i2, int i3, Object obj) {
    }

    public final boolean i2(f fVar) {
    }

    public final void i3(int i2, RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void j1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    public final int j2(RecyclerView.b0 b0Var) {
    }

    public void j3(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void k1(RecyclerView.b0 b0Var) {
    }

    public final int k2(RecyclerView.b0 b0Var) {
    }

    public final void k3(f fVar, int i2, int i3) {
    }

    public final int l2(RecyclerView.b0 b0Var) {
    }

    public final int l3(int i2, int i3, int i4) {
    }

    public final int m2(int i2) {
    }

    public final d.a n2(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void o1(Parcelable parcelable) {
    }

    public final d.a o2(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable p1() {
    }

    public final void p2() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void q1(int i2) {
    }

    public final int q2(RecyclerView.w wVar, p pVar, RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void r(String str) {
    }

    public final int r2(int i2) {
    }

    public View s2(boolean z) {
    }

    public View t2(boolean z) {
    }

    public int u2() {
    }

    public int[] v2(int[] iArr) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w() {
    }

    public final int w2(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean x() {
    }

    public final void x2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean y(RecyclerView.q qVar) {
    }

    public final void y2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z) {
    }

    public int z2() {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d {
        public int[] a;
        public List<a> b;

        public void a(a aVar) {
        }

        public void b() {
        }

        public void c(int i2) {
        }

        public int d(int i2) {
        }

        public a e(int i2, int i3, int i4, boolean z) {
        }

        public a f(int i2) {
        }

        public int g(int i2) {
        }

        public int h(int i2) {
        }

        public final int i(int i2) {
        }

        public void j(int i2, int i3) {
        }

        public void k(int i2, int i3) {
        }

        public final void l(int i2, int i3) {
        }

        public final void m(int i2, int i3) {
        }

        public void n(int i2, f fVar) {
        }

        public int o(int i2) {
        }

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = null;
            public int a;
            public int b;
            public int[] c;
            public boolean d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
            public class C0006a implements Parcelable.Creator<a> {
                public a a(Parcel parcel) {
                }

                public a[] b(int i2) {
                }

                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ a createFromParcel(Parcel parcel) {
                }

                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ a[] newArray(int i2) {
                }
            }

            public a(Parcel parcel) {
            }

            public int a(int i2) {
            }

            @Override // android.os.Parcelable
            public int describeContents() {
            }

            public String toString() {
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
            }

            public a() {
            }
        }
    }
}
