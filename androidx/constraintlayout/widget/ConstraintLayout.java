package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import j.e.a.m.d;
import j.e.a.m.e;
import j.e.a.m.f;
import j.e.a.m.o.b;
import j.e.c.d;
import j.e.c.j;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: t, reason: collision with root package name */
    public static j f182t;
    public SparseArray<View> a;
    public ArrayList<j.e.c.b> b;
    public f c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public int f183i;

    /* renamed from: j, reason: collision with root package name */
    public d f184j;

    /* renamed from: k, reason: collision with root package name */
    public j.e.c.c f185k;

    /* renamed from: l, reason: collision with root package name */
    public int f186l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap<String, Integer> f187m;

    /* renamed from: n, reason: collision with root package name */
    public int f188n;

    /* renamed from: o, reason: collision with root package name */
    public int f189o;

    /* renamed from: p, reason: collision with root package name */
    public SparseArray<e> f190p;

    /* renamed from: q, reason: collision with root package name */
    public c f191q;

    /* renamed from: r, reason: collision with root package name */
    public int f192r;

    /* renamed from: s, reason: collision with root package name */
    public int f193s;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements b.InterfaceC0122b {
        public ConstraintLayout a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public final /* synthetic */ ConstraintLayout h;

        public c(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        }

        @Override // j.e.a.m.o.b.InterfaceC0122b
        public final void a() {
        }

        @Override // j.e.a.m.o.b.InterfaceC0122b
        @SuppressLint({"WrongCall"})
        public final void b(e eVar, b.a aVar) {
        }

        public void c(int i2, int i3, int i4, int i5, int i6, int i7) {
        }

        public final boolean d(int i2, int i3, int i4) {
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ int b(ConstraintLayout constraintLayout) {
    }

    public static /* synthetic */ ArrayList c(ConstraintLayout constraintLayout) {
    }

    private int getPaddingWidth() {
    }

    public static j getSharedValues() {
    }

    public final boolean A() {
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void d(boolean z, View view, e eVar, b bVar, SparseArray<e> sparseArray) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    public b e() {
    }

    public b f(AttributeSet attributeSet) {
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    public Object g(int i2, Object obj) {
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    public int getMaxHeight() {
    }

    public int getMaxWidth() {
    }

    public int getMinHeight() {
    }

    public int getMinWidth() {
    }

    public int getOptimizationLevel() {
    }

    public String getSceneString() {
    }

    public final e h(int i2) {
    }

    public View i(int i2) {
    }

    public final e j(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
    }

    public final void q(AttributeSet attributeSet, int i2, int i3) {
    }

    public boolean r() {
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    public final void s() {
    }

    public void setConstraintSet(d dVar) {
    }

    @Override // android.view.View
    public void setId(int i2) {
    }

    public void setMaxHeight(int i2) {
    }

    public void setMaxWidth(int i2) {
    }

    public void setMinHeight(int i2) {
    }

    public void setMinWidth(int i2) {
    }

    public void setOnConstraintsChanged(j.e.c.f fVar) {
    }

    public void setOptimizationLevel(int i2) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
    }

    public void t(int i2) {
    }

    public void u(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
    }

    public void v(f fVar, int i2, int i3, int i4) {
    }

    public final void w() {
    }

    public void x(int i2, Object obj, Object obj2) {
    }

    public void y(f fVar, int i2, int i3, int i4, int i5) {
    }

    public final void z(e eVar, b bVar, SparseArray<e> sparseArray, int i2, d.b bVar2) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public int I;
        public float J;
        public float K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public float T;
        public float U;
        public int V;
        public int W;
        public int X;
        public boolean Y;
        public boolean Z;
        public int a;
        public String a0;
        public int b;
        public int b0;
        public float c;
        public boolean c0;
        public boolean d;
        public boolean d0;
        public int e;
        public boolean e0;
        public int f;
        public boolean f0;
        public int g;
        public boolean g0;
        public int h;
        public boolean h0;

        /* renamed from: i, reason: collision with root package name */
        public int f194i;
        public boolean i0;

        /* renamed from: j, reason: collision with root package name */
        public int f195j;
        public int j0;

        /* renamed from: k, reason: collision with root package name */
        public int f196k;
        public int k0;

        /* renamed from: l, reason: collision with root package name */
        public int f197l;
        public int l0;

        /* renamed from: m, reason: collision with root package name */
        public int f198m;
        public int m0;

        /* renamed from: n, reason: collision with root package name */
        public int f199n;
        public int n0;

        /* renamed from: o, reason: collision with root package name */
        public int f200o;
        public int o0;

        /* renamed from: p, reason: collision with root package name */
        public int f201p;
        public float p0;

        /* renamed from: q, reason: collision with root package name */
        public int f202q;
        public int q0;

        /* renamed from: r, reason: collision with root package name */
        public float f203r;
        public int r0;

        /* renamed from: s, reason: collision with root package name */
        public int f204s;
        public float s0;

        /* renamed from: t, reason: collision with root package name */
        public int f205t;
        public e t0;
        public int u;
        public boolean u0;
        public int v;
        public int w;
        public int x;
        public int y;
        public int z;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class a {
            public static final SparseIntArray a = null;
        }

        public b(Context context, AttributeSet attributeSet) {
        }

        public String a() {
        }

        public void b() {
        }

        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        public void resolveLayoutDirection(int i2) {
        }

        public b(int i2, int i3) {
        }

        public b(ViewGroup.LayoutParams layoutParams) {
        }
    }
}
