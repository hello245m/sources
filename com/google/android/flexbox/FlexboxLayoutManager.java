package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j.r.e.v;
import java.util.List;
import k.d.a.b.d;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class FlexboxLayoutManager extends RecyclerView.p implements k.d.a.b.a, RecyclerView.a0.b {
    public static final Rect S = null;
    public final k.d.a.b.d A;
    public RecyclerView.w B;
    public RecyclerView.b0 C;
    public d D;
    public b E;
    public v F;
    public v G;
    public e H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public SparseArray<View> N;
    public final Context O;
    public View P;
    public int Q;
    public d.b R;

    /* renamed from: s, reason: collision with root package name */
    public int f397s;

    /* renamed from: t, reason: collision with root package name */
    public int f398t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public boolean y;
    public List<k.d.a.b.c> z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = null;
        public int a;
        public int b;

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

        public /* synthetic */ e(Parcel parcel, a aVar) {
        }

        public static /* synthetic */ int a(e eVar) {
        }

        public static /* synthetic */ int d(e eVar, int i2) {
        }

        public static /* synthetic */ int e(e eVar) {
        }

        public static /* synthetic */ int f(e eVar, int i2) {
        }

        public static /* synthetic */ void h(e eVar) {
        }

        public static /* synthetic */ boolean i(e eVar, int i2) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public final boolean j(int i2) {
        }

        public final void m() {
        }

        public String toString() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public /* synthetic */ e(e eVar, a aVar) {
        }

        public e() {
        }

        public e(Parcel parcel) {
        }

        public e(e eVar) {
        }
    }

    public FlexboxLayoutManager(Context context) {
    }

    public static boolean I0(int i2, int i3, int i4) {
    }

    private boolean T1(View view, int i2, int i3, RecyclerView.q qVar) {
    }

    public static /* synthetic */ int b2(FlexboxLayoutManager flexboxLayoutManager) {
    }

    public static /* synthetic */ int c2(FlexboxLayoutManager flexboxLayoutManager) {
    }

    public static /* synthetic */ boolean d2(FlexboxLayoutManager flexboxLayoutManager) {
    }

    public static /* synthetic */ v e2(FlexboxLayoutManager flexboxLayoutManager) {
    }

    public static /* synthetic */ v f2(FlexboxLayoutManager flexboxLayoutManager) {
    }

    public static /* synthetic */ k.d.a.b.d g2(FlexboxLayoutManager flexboxLayoutManager) {
    }

    public static /* synthetic */ List h2(FlexboxLayoutManager flexboxLayoutManager) {
    }

    public final int A2(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z) {
    }

    public final int B2(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.b0 b0Var) {
    }

    public final View C2() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean D0() {
    }

    public final int D2(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E(RecyclerView.b0 b0Var) {
    }

    public final int E2(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int F(RecyclerView.b0 b0Var) {
    }

    public final int F2(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int G(RecyclerView.b0 b0Var) {
    }

    public final int G2(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int H(RecyclerView.b0 b0Var) {
    }

    public final int H2(int i2) {
    }

    public final boolean I2(View view, boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int J1(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    public final int J2(k.d.a.b.c cVar, d dVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void K1(int i2) {
    }

    public final int K2(k.d.a.b.c cVar, d dVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int L1(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    public final int L2(k.d.a.b.c cVar, d dVar) {
    }

    public final void M2(RecyclerView.w wVar, d dVar) {
    }

    public final void N2(RecyclerView.w wVar, int i2, int i3) {
    }

    public final void O2(RecyclerView.w wVar, d dVar) {
    }

    public final void P2(RecyclerView.w wVar, d dVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q Q() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q0(RecyclerView.h hVar, RecyclerView.h hVar2) {
    }

    public final void Q2() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q R(Context context, AttributeSet attributeSet) {
    }

    public final void R2() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(RecyclerView recyclerView) {
    }

    public void S2(int i2) {
    }

    public void T2(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView recyclerView, RecyclerView.w wVar) {
    }

    public void U2(int i2) {
    }

    public void V2(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i2) {
    }

    public final boolean W2(RecyclerView.b0 b0Var, b bVar) {
    }

    public final boolean X2(RecyclerView.b0 b0Var, b bVar, e eVar) {
    }

    public final void Y2(RecyclerView.b0 b0Var, b bVar) {
    }

    public final void Z2(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF a(int i2) {
    }

    public final void a3(int i2) {
    }

    @Override // k.d.a.b.a
    public void b(View view, int i2, int i3, k.d.a.b.c cVar) {
    }

    public final void b3(int i2, int i3) {
    }

    @Override // k.d.a.b.a
    public void c(k.d.a.b.c cVar) {
    }

    public final void c3(b bVar, boolean z, boolean z2) {
    }

    @Override // k.d.a.b.a
    public View d(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView recyclerView, int i2, int i3) {
    }

    public final void d3(b bVar, boolean z, boolean z2) {
    }

    @Override // k.d.a.b.a
    public int e(int i2, int i3, int i4) {
    }

    @Override // k.d.a.b.a
    public void f(int i2, View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(RecyclerView recyclerView, int i2, int i3, int i4) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g1(RecyclerView recyclerView, int i2, int i3) {
    }

    @Override // k.d.a.b.a
    public int getAlignContent() {
    }

    @Override // k.d.a.b.a
    public int getAlignItems() {
    }

    @Override // k.d.a.b.a
    public int getFlexDirection() {
    }

    @Override // k.d.a.b.a
    public int getFlexItemCount() {
    }

    @Override // k.d.a.b.a
    public List<k.d.a.b.c> getFlexLinesInternal() {
    }

    @Override // k.d.a.b.a
    public int getFlexWrap() {
    }

    @Override // k.d.a.b.a
    public int getLargestMainSize() {
    }

    @Override // k.d.a.b.a
    public int getMaxLine() {
    }

    @Override // k.d.a.b.a
    public int getSumOfCrossSize() {
    }

    @Override // k.d.a.b.a
    public View h(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void h1(RecyclerView recyclerView, int i2, int i3) {
    }

    @Override // k.d.a.b.a
    public int i(View view, int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void i1(RecyclerView recyclerView, int i2, int i3, Object obj) {
    }

    public final boolean i2(View view, int i2) {
    }

    @Override // k.d.a.b.a
    public int j(int i2, int i3, int i4) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void j1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    public final boolean j2(View view, int i2) {
    }

    @Override // k.d.a.b.a
    public boolean k() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void k1(RecyclerView.b0 b0Var) {
    }

    public final void k2() {
    }

    @Override // k.d.a.b.a
    public int l(View view) {
    }

    public final int l2(RecyclerView.b0 b0Var) {
    }

    public final int m2(RecyclerView.b0 b0Var) {
    }

    public final int n2(RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void o1(Parcelable parcelable) {
    }

    public final void o2() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable p1() {
    }

    public final void p2() {
    }

    public final int q2(RecyclerView.w wVar, RecyclerView.b0 b0Var, d dVar) {
    }

    public final View r2(int i2) {
    }

    public final View s2(View view, k.d.a.b.c cVar) {
    }

    @Override // k.d.a.b.a
    public void setFlexLines(List<k.d.a.b.c> list) {
    }

    public int t2() {
    }

    public final View u2(int i2) {
    }

    public final View v2(View view, k.d.a.b.c cVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w() {
    }

    public int w2() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean x() {
    }

    public final View x2(int i2, int i3, boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean y(RecyclerView.q qVar) {
    }

    public final View y2(int i2, int i3, int i4) {
    }

    public final int z2(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b {
        public int a;
        public int b;
        public int c;
        public int d;
        public boolean e;
        public boolean f;
        public boolean g;
        public final /* synthetic */ FlexboxLayoutManager h;

        public b(FlexboxLayoutManager flexboxLayoutManager) {
        }

        public static /* synthetic */ int a(b bVar) {
        }

        public static /* synthetic */ int b(b bVar, int i2) {
        }

        public static /* synthetic */ int c(b bVar) {
        }

        public static /* synthetic */ int d(b bVar, int i2) {
        }

        public static /* synthetic */ void e(b bVar) {
        }

        public static /* synthetic */ int f(b bVar) {
        }

        public static /* synthetic */ int g(b bVar, int i2) {
        }

        public static /* synthetic */ boolean h(b bVar, boolean z) {
        }

        public static /* synthetic */ void i(b bVar, View view) {
        }

        public static /* synthetic */ int j(b bVar) {
        }

        public static /* synthetic */ int k(b bVar, int i2) {
        }

        public static /* synthetic */ int l(b bVar, int i2) {
        }

        public static /* synthetic */ boolean m(b bVar) {
        }

        public static /* synthetic */ boolean n(b bVar, boolean z) {
        }

        public static /* synthetic */ void o(b bVar) {
        }

        public static /* synthetic */ boolean p(b bVar) {
        }

        public static /* synthetic */ boolean q(b bVar, boolean z) {
        }

        public final void r() {
        }

        public final void s(View view) {
        }

        public final void t() {
        }

        public String toString() {
        }

        public /* synthetic */ b(FlexboxLayoutManager flexboxLayoutManager, a aVar) {
        }
    }

    public FlexboxLayoutManager(Context context, int i2, int i3) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d {
        public int a;
        public boolean b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;

        /* renamed from: i, reason: collision with root package name */
        public int f404i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f405j;

        public d() {
        }

        public static /* synthetic */ int A(d dVar, int i2) {
        }

        public static /* synthetic */ boolean B(d dVar) {
        }

        public static /* synthetic */ boolean C(d dVar, boolean z) {
        }

        public static /* synthetic */ int a(d dVar) {
        }

        public static /* synthetic */ int b(d dVar, int i2) {
        }

        public static /* synthetic */ int c(d dVar, int i2) {
        }

        public static /* synthetic */ int d(d dVar, int i2) {
        }

        public static /* synthetic */ boolean e(d dVar) {
        }

        public static /* synthetic */ boolean f(d dVar, boolean z) {
        }

        public static /* synthetic */ int g(d dVar) {
        }

        public static /* synthetic */ int h(d dVar, int i2) {
        }

        public static /* synthetic */ int i(d dVar, int i2) {
        }

        public static /* synthetic */ int j(d dVar) {
        }

        public static /* synthetic */ int k(d dVar, int i2) {
        }

        public static /* synthetic */ int l(d dVar) {
        }

        public static /* synthetic */ int m(d dVar) {
        }

        public static /* synthetic */ int n(d dVar, int i2) {
        }

        public static /* synthetic */ int o(d dVar) {
        }

        public static /* synthetic */ int p(d dVar, int i2) {
        }

        public static /* synthetic */ int q(d dVar, int i2) {
        }

        public static /* synthetic */ boolean r(d dVar, RecyclerView.b0 b0Var, List list) {
        }

        public static /* synthetic */ int s(d dVar) {
        }

        public static /* synthetic */ int t(d dVar, int i2) {
        }

        public static /* synthetic */ int u(d dVar, int i2) {
        }

        public static /* synthetic */ int v(d dVar, int i2) {
        }

        public static /* synthetic */ int w(d dVar) {
        }

        public static /* synthetic */ int x(d dVar, int i2) {
        }

        public static /* synthetic */ int y(d dVar) {
        }

        public static /* synthetic */ int z(d dVar, int i2) {
        }

        public final boolean D(RecyclerView.b0 b0Var, List<k.d.a.b.c> list) {
        }

        public String toString() {
        }

        public /* synthetic */ d(a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c extends RecyclerView.q implements k.d.a.b.b {
        public static final Parcelable.Creator<c> CREATOR = null;
        public float e;
        public float f;
        public int g;
        public float h;

        /* renamed from: i, reason: collision with root package name */
        public int f399i;

        /* renamed from: j, reason: collision with root package name */
        public int f400j;

        /* renamed from: k, reason: collision with root package name */
        public int f401k;

        /* renamed from: l, reason: collision with root package name */
        public int f402l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f403m;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Parcelable.Creator<c> {
            public c a(Parcel parcel) {
            }

            public c[] b(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ c createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ c[] newArray(int i2) {
            }
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        @Override // k.d.a.b.b
        public float A() {
        }

        @Override // k.d.a.b.b
        public float D() {
        }

        @Override // k.d.a.b.b
        public int N() {
        }

        @Override // k.d.a.b.b
        public int P() {
        }

        @Override // k.d.a.b.b
        public boolean Q() {
        }

        @Override // k.d.a.b.b
        public int R() {
        }

        @Override // k.d.a.b.b
        public int W() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        @Override // k.d.a.b.b
        public int getHeight() {
        }

        @Override // k.d.a.b.b
        public int getOrder() {
        }

        @Override // k.d.a.b.b
        public int getWidth() {
        }

        @Override // k.d.a.b.b
        public int k() {
        }

        @Override // k.d.a.b.b
        public float l() {
        }

        @Override // k.d.a.b.b
        public int o() {
        }

        @Override // k.d.a.b.b
        public void q(int i2) {
        }

        @Override // k.d.a.b.b
        public int r() {
        }

        @Override // k.d.a.b.b
        public int u() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        @Override // k.d.a.b.b
        public int y() {
        }

        @Override // k.d.a.b.b
        public void z(int i2) {
        }

        public c(int i2, int i3) {
        }

        public c(Parcel parcel) {
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
    }
}
