package com.tencent.mp.feature.base.adapter.sticky;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.List;
import k.i.h.b.d.m0.r.a;

/* JADX WARN: Incorrect field signature: TT; */
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class StickyHeadersStaggeredGridLayoutManager<T extends RecyclerView.h<?> & k.i.h.b.d.m0.r.a> extends StaggeredGridLayoutManager {
    public RecyclerView.h Q;
    public float R;
    public float S;
    public final List<Integer> T;
    public final RecyclerView.j U;
    public View V;
    public int W;
    public int X;
    public int Y;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ ViewTreeObserver a;
        public final /* synthetic */ StickyHeadersStaggeredGridLayoutManager b;

        public a(StickyHeadersStaggeredGridLayoutManager stickyHeadersStaggeredGridLayoutManager, ViewTreeObserver viewTreeObserver) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class b extends RecyclerView.j {
        public final /* synthetic */ StickyHeadersStaggeredGridLayoutManager a;

        public b(StickyHeadersStaggeredGridLayoutManager stickyHeadersStaggeredGridLayoutManager) {
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

        public /* synthetic */ b(StickyHeadersStaggeredGridLayoutManager stickyHeadersStaggeredGridLayoutManager, a aVar) {
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

    public StickyHeadersStaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
    }

    public static /* synthetic */ int m3(StickyHeadersStaggeredGridLayoutManager stickyHeadersStaggeredGridLayoutManager) {
    }

    public static /* synthetic */ void n3(StickyHeadersStaggeredGridLayoutManager stickyHeadersStaggeredGridLayoutManager, RecyclerView.w wVar) {
    }

    public static /* synthetic */ int o3(StickyHeadersStaggeredGridLayoutManager stickyHeadersStaggeredGridLayoutManager, int i2) {
    }

    public static /* synthetic */ int p3(StickyHeadersStaggeredGridLayoutManager stickyHeadersStaggeredGridLayoutManager, int i2) {
    }

    public static /* synthetic */ int q3(StickyHeadersStaggeredGridLayoutManager stickyHeadersStaggeredGridLayoutManager) {
    }

    public static /* synthetic */ int r3(StickyHeadersStaggeredGridLayoutManager stickyHeadersStaggeredGridLayoutManager) {
    }

    public static /* synthetic */ void s3(StickyHeadersStaggeredGridLayoutManager stickyHeadersStaggeredGridLayoutManager, int i2, int i3) {
    }

    public static /* synthetic */ List t3(StickyHeadersStaggeredGridLayoutManager stickyHeadersStaggeredGridLayoutManager) {
    }

    public static /* synthetic */ RecyclerView.h u3(StickyHeadersStaggeredGridLayoutManager stickyHeadersStaggeredGridLayoutManager) {
    }

    public static /* synthetic */ View v3(StickyHeadersStaggeredGridLayoutManager stickyHeadersStaggeredGridLayoutManager) {
    }

    public final int A3(int i2) {
    }

    public final int B3(int i2) {
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.b0 b0Var) {
    }

    public final int C3(int i2) {
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.b0 b0Var) {
    }

    public final float D3(View view, View view2) {
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int E(RecyclerView.b0 b0Var) {
    }

    public final float E3(View view, View view2) {
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int F(RecyclerView.b0 b0Var) {
    }

    public final boolean F3(View view) {
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int G(RecyclerView.b0 b0Var) {
    }

    public final boolean G3(View view, RecyclerView.q qVar) {
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int H(RecyclerView.b0 b0Var) {
    }

    public final void H3(View view) {
    }

    public final void I3(RecyclerView.w wVar) {
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int J1(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    public final void J3(int i2, int i3, boolean z) {
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void K1(int i2) {
    }

    public final void K3(RecyclerView.h<?> hVar) {
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int L1(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    public final void L3(int i2, int i3) {
    }

    public final void M3(RecyclerView.w wVar, boolean z) {
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void Q0(RecyclerView.h hVar, RecyclerView.h hVar2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(RecyclerView recyclerView) {
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public View V0(View view, int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager
    public void Z2(int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF a(int i2) {
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void j1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void o1(Parcelable parcelable) {
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public Parcelable p1() {
    }

    public final void w3() {
    }

    public final void x3(RecyclerView.w wVar, int i2) {
    }

    public final void y3(RecyclerView.w wVar, int i2) {
    }

    public final void z3() {
    }
}
