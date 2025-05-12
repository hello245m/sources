package com.tencent.mp.feature.base.adapter.sticky;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import java.util.List;
import k.i.h.b.d.m0.r.a;

/* JADX WARN: Incorrect field signature: TT; */
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class StickyHeadersLinearLayoutManager<T extends RecyclerView.h<?> & k.i.h.b.d.m0.r.a> extends LinearLayoutManager {
    public RecyclerView.h I;
    public float J;
    public float K;
    public final List<Integer> L;
    public final RecyclerView.j M;
    public View N;
    public int O;
    public int P;
    public int Q;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ ViewTreeObserver a;
        public final /* synthetic */ StickyHeadersLinearLayoutManager b;

        public a(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager, ViewTreeObserver viewTreeObserver) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class b extends RecyclerView.j {
        public final /* synthetic */ StickyHeadersLinearLayoutManager a;

        public b(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i2, int i3, int i4) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i2, int i3) {
        }

        public final void h(int i2) {
        }

        public /* synthetic */ b(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = null;
        public Parcelable a;
        public int b;
        public int c;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
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

        public c() {
        }

        public static /* synthetic */ Parcelable a(c cVar) {
        }

        public static /* synthetic */ Parcelable d(c cVar, Parcelable parcelable) {
        }

        public static /* synthetic */ int e(c cVar) {
        }

        public static /* synthetic */ int f(c cVar, int i2) {
        }

        public static /* synthetic */ int h(c cVar) {
        }

        public static /* synthetic */ int i(c cVar, int i2) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public c(Parcel parcel) {
        }
    }

    public StickyHeadersLinearLayoutManager(Context context) {
    }

    public static /* synthetic */ int c3(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
    }

    public static /* synthetic */ void d3(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager, RecyclerView.w wVar) {
    }

    public static /* synthetic */ int e3(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager, int i2) {
    }

    public static /* synthetic */ int f3(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager, int i2) {
    }

    public static /* synthetic */ int g3(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
    }

    public static /* synthetic */ int h3(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
    }

    public static /* synthetic */ void i3(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager, int i2, int i3) {
    }

    public static /* synthetic */ List j3(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
    }

    public static /* synthetic */ RecyclerView.h k3(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
    }

    public static /* synthetic */ View l3(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
    }

    public final void A3(RecyclerView.h<?> hVar) {
    }

    public final void B3(int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.b0 b0Var) {
    }

    public final void C3(RecyclerView.w wVar, boolean z) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int E(RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int F(RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int G(RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int H(RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int J1(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void K1(int i2) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int L1(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q0(RecyclerView.h hVar, RecyclerView.h hVar2) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void Q2(int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(RecyclerView recyclerView) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public View V0(View view, int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF a(int i2) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void j1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    public final void m3() {
    }

    public final void n3(RecyclerView.w wVar, int i2) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void o1(Parcelable parcelable) {
    }

    public final void o3(RecyclerView.w wVar, int i2) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public Parcelable p1() {
    }

    public final void p3() {
    }

    public final int q3(int i2) {
    }

    public final int r3(int i2) {
    }

    public final int s3(int i2) {
    }

    public final float t3(View view, View view2) {
    }

    public final float u3(View view, View view2) {
    }

    public final boolean v3(View view) {
    }

    public final boolean w3(View view, RecyclerView.q qVar) {
    }

    public final void x3(View view) {
    }

    public final void y3(RecyclerView.w wVar) {
    }

    public final void z3(int i2, int i3, boolean z) {
    }
}
