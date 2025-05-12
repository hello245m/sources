package com.tencent.mp.feature.base.adapter.sticky;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import java.util.List;
import k.i.h.b.d.m0.r.a;

/* JADX WARN: Incorrect field signature: TT; */
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class StickyHeadersGridLayoutManager<T extends RecyclerView.h<?> & k.i.h.b.d.m0.r.a> extends GridLayoutManager {
    public RecyclerView.h R;
    public float S;
    public float T;
    public final List<Integer> U;
    public final RecyclerView.j V;
    public View W;
    public int X;
    public int Y;
    public int Z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ ViewTreeObserver a;
        public final /* synthetic */ StickyHeadersGridLayoutManager b;

        public a(StickyHeadersGridLayoutManager stickyHeadersGridLayoutManager, ViewTreeObserver viewTreeObserver) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class b extends RecyclerView.j {
        public final /* synthetic */ StickyHeadersGridLayoutManager a;

        public b(StickyHeadersGridLayoutManager stickyHeadersGridLayoutManager) {
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

        public /* synthetic */ b(StickyHeadersGridLayoutManager stickyHeadersGridLayoutManager, a aVar) {
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

    public StickyHeadersGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
    }

    public static /* synthetic */ int A3(StickyHeadersGridLayoutManager stickyHeadersGridLayoutManager, int i2) {
    }

    public static /* synthetic */ int B3(StickyHeadersGridLayoutManager stickyHeadersGridLayoutManager) {
    }

    public static /* synthetic */ int C3(StickyHeadersGridLayoutManager stickyHeadersGridLayoutManager) {
    }

    public static /* synthetic */ void D3(StickyHeadersGridLayoutManager stickyHeadersGridLayoutManager, int i2, int i3) {
    }

    public static /* synthetic */ List E3(StickyHeadersGridLayoutManager stickyHeadersGridLayoutManager) {
    }

    public static /* synthetic */ RecyclerView.h F3(StickyHeadersGridLayoutManager stickyHeadersGridLayoutManager) {
    }

    public static /* synthetic */ View G3(StickyHeadersGridLayoutManager stickyHeadersGridLayoutManager) {
    }

    public static /* synthetic */ int x3(StickyHeadersGridLayoutManager stickyHeadersGridLayoutManager) {
    }

    public static /* synthetic */ void y3(StickyHeadersGridLayoutManager stickyHeadersGridLayoutManager, RecyclerView.w wVar) {
    }

    public static /* synthetic */ int z3(StickyHeadersGridLayoutManager stickyHeadersGridLayoutManager, int i2) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int E(RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int F(RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int G(RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int H(RecyclerView.b0 b0Var) {
    }

    public final void H3() {
    }

    public final void I3(RecyclerView.w wVar, int i2) {
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int J1(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    public final void J3(RecyclerView.w wVar, int i2) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void K1(int i2) {
    }

    public final void K3() {
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int L1(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    public final int L3(int i2) {
    }

    public final int M3(int i2) {
    }

    public final int N3(int i2) {
    }

    public final float O3(View view, View view2) {
    }

    public final float P3(View view, View view2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q0(RecyclerView.h hVar, RecyclerView.h hVar2) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void Q2(int i2, int i3) {
    }

    public final boolean Q3(View view) {
    }

    public final boolean R3(View view, RecyclerView.q qVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(RecyclerView recyclerView) {
    }

    public final void S3(View view) {
    }

    public final void T3(RecyclerView.w wVar) {
    }

    public final void U3(int i2, int i3, boolean z) {
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public View V0(View view, int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    public final void V3(RecyclerView.h<?> hVar) {
    }

    public final void W3(int i2, int i3) {
    }

    public final void X3(RecyclerView.w wVar, boolean z) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF a(int i2) {
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void j1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void o1(Parcelable parcelable) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public Parcelable p1() {
    }
}
