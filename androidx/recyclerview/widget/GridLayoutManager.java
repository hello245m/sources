package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public c O;
    public final Rect P;
    public boolean Q;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class c {
        public final SparseIntArray a;
        public final SparseIntArray b;
        public boolean c;
        public boolean d;

        public static int a(SparseIntArray sparseIntArray, int i2) {
        }

        public int b(int i2, int i3) {
        }

        public int c(int i2, int i3) {
        }

        public int d(int i2, int i3) {
        }

        public int e(int i2, int i3) {
        }

        public abstract int f(int i2);

        public void g() {
        }

        public void h() {
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
    }

    public static int[] f3(int[] iArr, int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int E(RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int G(RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void G2(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int H(RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void I2(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i2) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int J1(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int L1(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q Q() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q1(Rect rect, int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q R(Context context, AttributeSet attributeSet) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q S(ViewGroup.LayoutParams layoutParams) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void T2(boolean z) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public View V0(View view, int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int a0(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean a2() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView.w wVar, RecyclerView.b0 b0Var, View view, j.g.t.r0.c cVar) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void c2(RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
    }

    public final void c3(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i2, boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView recyclerView, int i2, int i3) {
    }

    public final void d3() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e1(RecyclerView recyclerView) {
    }

    public final void e3(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(RecyclerView recyclerView, int i2, int i3, int i4) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g1(RecyclerView recyclerView, int i2, int i3) {
    }

    public final void g3() {
    }

    public final int h3(RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void i1(RecyclerView recyclerView, int i2, int i3, Object obj) {
    }

    public final int i3(RecyclerView.b0 b0Var) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void j1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    public final void j3(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i2) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void k1(RecyclerView.b0 b0Var) {
    }

    public final void k3() {
    }

    public int l3(int i2, int i3) {
    }

    public int m3() {
    }

    public final int n3(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i2) {
    }

    public final int o3(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i2) {
    }

    public final int p3(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i2) {
    }

    public c q3() {
    }

    public final void r3(float f, int i2) {
    }

    public final void s3(View view, int i2, boolean z) {
    }

    public final void t3(View view, int i2, int i3, boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int u0(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
    }

    public void u3(int i2) {
    }

    public void v3(c cVar) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View w2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z, boolean z2) {
    }

    public final void w3() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean y(RecyclerView.q qVar) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b extends RecyclerView.q {
        public int e;
        public int f;

        public b(Context context, AttributeSet attributeSet) {
        }

        public int i() {
        }

        public int j() {
        }

        public b(int i2, int i3) {
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        public b(ViewGroup.LayoutParams layoutParams) {
        }
    }

    public GridLayoutManager(Context context, int i2) {
    }

    public GridLayoutManager(Context context, int i2, int i3, boolean z) {
    }
}
