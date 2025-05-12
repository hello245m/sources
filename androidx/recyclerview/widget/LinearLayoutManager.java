package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import j.r.e.m;
import j.r.e.v;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class LinearLayoutManager extends RecyclerView.p implements m.i, RecyclerView.a0.b {
    public int A;
    public int B;
    public boolean C;
    public d D;
    public final a E;
    public final b F;
    public int G;
    public int[] H;

    /* renamed from: s, reason: collision with root package name */
    public int f260s;

    /* renamed from: t, reason: collision with root package name */
    public c f261t;
    public v u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a {
        public v a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public void a() {
        }

        public void b(View view, int i2) {
        }

        public void c(View view, int i2) {
        }

        public boolean d(View view, RecyclerView.b0 b0Var) {
        }

        public void e() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        public void a() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c {
        public boolean a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;

        /* renamed from: i, reason: collision with root package name */
        public int f262i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f263j;

        /* renamed from: k, reason: collision with root package name */
        public int f264k;

        /* renamed from: l, reason: collision with root package name */
        public List<RecyclerView.e0> f265l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f266m;

        public void a() {
        }

        public void b(View view) {
        }

        public boolean c(RecyclerView.b0 b0Var) {
        }

        public View d(RecyclerView.w wVar) {
        }

        public final View e() {
        }

        public View f(View view) {
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = null;
        public int a;
        public int b;
        public boolean c;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Parcelable.Creator<d> {
            public d a(Parcel parcel) {
            }

            public d[] b(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ d createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ d[] newArray(int i2) {
            }
        }

        public d() {
        }

        public boolean a() {
        }

        public void d() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public d(Parcel parcel) {
        }

        public d(d dVar) {
        }
    }

    public LinearLayoutManager(Context context) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void A(int i2, int i3, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
    }

    public final View A2() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void B(int i2, RecyclerView.p.c cVar) {
    }

    @Deprecated
    public int B2(RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.b0 b0Var) {
    }

    public int C2() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean D0() {
    }

    public boolean D2() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E(RecyclerView.b0 b0Var) {
    }

    public boolean E2() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int F(RecyclerView.b0 b0Var) {
    }

    public boolean F2() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int G(RecyclerView.b0 b0Var) {
    }

    public void G2(RecyclerView.w wVar, RecyclerView.b0 b0Var, c cVar, b bVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int H(RecyclerView.b0 b0Var) {
    }

    public final void H2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i2, int i3) {
    }

    public void I2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int J1(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    public final void J2(RecyclerView.w wVar, c cVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void K1(int i2) {
    }

    public final void K2(RecyclerView.w wVar, int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int L1(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    public final void L2(RecyclerView.w wVar, int i2, int i3) {
    }

    public final void M2(RecyclerView.w wVar, int i2, int i3) {
    }

    public boolean N2() {
    }

    public final void O2() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View P(int i2) {
    }

    public int P2(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q Q() {
    }

    public void Q2(int i2, int i3) {
    }

    public void R2(int i2) {
    }

    public void S2(boolean z) {
    }

    public void T2(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView recyclerView, RecyclerView.w wVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean U1() {
    }

    public final boolean U2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View V0(View view, int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    public final boolean V2(RecyclerView.b0 b0Var, a aVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(AccessibilityEvent accessibilityEvent) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i2) {
    }

    public final void W2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
    }

    public final void X2(int i2, int i3, boolean z, RecyclerView.b0 b0Var) {
    }

    public final void Y2(int i2, int i3) {
    }

    public final void Z2(a aVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF a(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean a2() {
    }

    public final void a3(int i2, int i3) {
    }

    public void b2(RecyclerView.b0 b0Var, int[] iArr) {
    }

    public final void b3(a aVar) {
    }

    public void c2(RecyclerView.b0 b0Var, c cVar, RecyclerView.p.c cVar2) {
    }

    public final int d2(RecyclerView.b0 b0Var) {
    }

    public final int e2(RecyclerView.b0 b0Var) {
    }

    public final int f2(RecyclerView.b0 b0Var) {
    }

    @Override // j.r.e.m.i
    public void g(View view, View view2, int i2, int i3) {
    }

    public int g2(int i2) {
    }

    public c h2() {
    }

    public void i2() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void j1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    public int j2(RecyclerView.w wVar, c cVar, RecyclerView.b0 b0Var, boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void k1(RecyclerView.b0 b0Var) {
    }

    public int k2() {
    }

    public final View l2() {
    }

    public View m2(boolean z, boolean z2) {
    }

    public View n2(boolean z, boolean z2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void o1(Parcelable parcelable) {
    }

    public int o2() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable p1() {
    }

    public int p2() {
    }

    public final View q2() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void r(String str) {
    }

    public int r2() {
    }

    public View s2(int i2, int i3) {
    }

    public View t2(int i2, int i3, boolean z, boolean z2) {
    }

    public final View u2() {
    }

    public final View v2() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w() {
    }

    public View w2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z, boolean z2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean x() {
    }

    public final int x2(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z) {
    }

    public final int y2(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z) {
    }

    public final View z2() {
    }

    public LinearLayoutManager(Context context, int i2, boolean z) {
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
    }
}
