package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import j.r.e.a;
import j.r.e.c0;
import j.r.e.d0;
import j.r.e.f;
import j.r.e.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class RecyclerView extends ViewGroup implements j.g.t.t {
    public static final int[] I0 = null;
    public static final boolean J0 = false;
    public static final boolean K0 = false;
    public static final boolean L0 = false;
    public static final boolean M0 = false;
    public static final boolean N0 = false;
    public static final boolean O0 = false;
    public static final Class<?>[] P0 = null;
    public static final Interpolator Q0 = null;
    public int A;
    public final int[] A0;
    public boolean B;
    public final int[] B0;
    public final AccessibilityManager C;
    public final List<e0> C0;
    public List<r> D;
    public Runnable D0;
    public boolean E;
    public boolean E0;
    public boolean F;
    public int F0;
    public int G;
    public int G0;
    public int H;
    public final d0.b H0;
    public l I;
    public EdgeEffect J;
    public EdgeEffect K;
    public EdgeEffect L;
    public EdgeEffect M;
    public m N;
    public int O;
    public int P;
    public VelocityTracker Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public s W;
    public final y a;
    public final w b;
    public z c;
    public j.r.e.a d;
    public j.r.e.f e;
    public final j.r.e.d0 f;
    public boolean g;
    public final int g0;
    public final Runnable h;
    public final int h0;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f267i;
    public float i0;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f268j;
    public float j0;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f269k;
    public boolean k0;

    /* renamed from: l, reason: collision with root package name */
    public h f270l;
    public final d0 l0;

    /* renamed from: m, reason: collision with root package name */
    public p f271m;
    public j.r.e.l m0;

    /* renamed from: n, reason: collision with root package name */
    public x f272n;
    public l.b n0;

    /* renamed from: o, reason: collision with root package name */
    public final List<x> f273o;
    public final b0 o0;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList<o> f274p;
    public u p0;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList<t> f275q;
    public List<u> q0;

    /* renamed from: r, reason: collision with root package name */
    public t f276r;
    public boolean r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f277s;
    public boolean s0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f278t;
    public m.b t0;
    public boolean u;
    public boolean u0;
    public boolean v;
    public j.r.e.x v0;
    public int w;
    public k w0;
    public boolean x;
    public final int[] x0;
    public boolean y;
    public j.g.t.u y0;
    public boolean z;
    public final int[] z0;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Runnable {
        public final /* synthetic */ RecyclerView a;

        public a(RecyclerView recyclerView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class a0 {
        public int a;
        public RecyclerView b;
        public p c;
        public boolean d;
        public boolean e;
        public View f;
        public final a g;
        public boolean h;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class a {
            public int a;
            public int b;
            public int c;
            public int d;
            public Interpolator e;
            public boolean f;
            public int g;

            public a(int i2, int i3) {
            }

            public boolean a() {
            }

            public void b(int i2) {
            }

            public void c(RecyclerView recyclerView) {
            }

            public void d(int i2, int i3, int i4, Interpolator interpolator) {
            }

            public final void e() {
            }

            public a(int i2, int i3, int i4, Interpolator interpolator) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public interface b {
            PointF a(int i2);
        }

        public PointF a(int i2) {
        }

        public View b(int i2) {
        }

        public int c() {
        }

        public int d(View view) {
        }

        public p e() {
        }

        public int f() {
        }

        public boolean g() {
        }

        public boolean h() {
        }

        public void i(PointF pointF) {
        }

        public void j(int i2, int i3) {
        }

        public void k(View view) {
        }

        public abstract void l(int i2, int i3, b0 b0Var, a aVar);

        public abstract void m();

        public abstract void n();

        public abstract void o(View view, b0 b0Var, a aVar);

        public void p(int i2) {
        }

        public void q(RecyclerView recyclerView, p pVar) {
        }

        public final void r() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Runnable {
        public final /* synthetic */ RecyclerView a;

        public b(RecyclerView recyclerView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b0 {
        public int a;
        public SparseArray<Object> b;
        public int c;
        public int d;
        public int e;
        public int f;
        public boolean g;
        public boolean h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f279i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f280j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f281k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f282l;

        /* renamed from: m, reason: collision with root package name */
        public int f283m;

        /* renamed from: n, reason: collision with root package name */
        public long f284n;

        /* renamed from: o, reason: collision with root package name */
        public int f285o;

        /* renamed from: p, reason: collision with root package name */
        public int f286p;

        /* renamed from: q, reason: collision with root package name */
        public int f287q;

        public void a(int i2) {
        }

        public int b() {
        }

        public int c() {
        }

        public boolean d() {
        }

        public boolean e() {
        }

        public void f(h hVar) {
        }

        public boolean g() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class c0 {
        public abstract View a(w wVar, int i2, int i3);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d implements d0.b {
        public final /* synthetic */ RecyclerView a;

        public d(RecyclerView recyclerView) {
        }

        @Override // j.r.e.d0.b
        public void a(e0 e0Var) {
        }

        @Override // j.r.e.d0.b
        public void b(e0 e0Var, m.c cVar, m.c cVar2) {
        }

        @Override // j.r.e.d0.b
        public void c(e0 e0Var, m.c cVar, m.c cVar2) {
        }

        @Override // j.r.e.d0.b
        public void d(e0 e0Var, m.c cVar, m.c cVar2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d0 implements Runnable {
        public int a;
        public int b;
        public OverScroller c;
        public Interpolator d;
        public boolean e;
        public boolean f;
        public final /* synthetic */ RecyclerView g;

        public d0(RecyclerView recyclerView) {
        }

        public final int a(int i2, int i3) {
        }

        public void b(int i2, int i3) {
        }

        public final void c() {
        }

        public void d() {
        }

        public void e(int i2, int i3, int i4, Interpolator interpolator) {
        }

        public void f() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e implements f.b {
        public final /* synthetic */ RecyclerView a;

        public e(RecyclerView recyclerView) {
        }

        @Override // j.r.e.f.b
        public View a(int i2) {
        }

        @Override // j.r.e.f.b
        public void b(View view) {
        }

        @Override // j.r.e.f.b
        public int c() {
        }

        @Override // j.r.e.f.b
        public void d() {
        }

        @Override // j.r.e.f.b
        public int e(View view) {
        }

        @Override // j.r.e.f.b
        public e0 f(View view) {
        }

        @Override // j.r.e.f.b
        public void g(int i2) {
        }

        @Override // j.r.e.f.b
        public void h(View view) {
        }

        @Override // j.r.e.f.b
        public void i(View view, int i2) {
        }

        @Override // j.r.e.f.b
        public void j(int i2) {
        }

        @Override // j.r.e.f.b
        public void k(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class e0 {
        public static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        public static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        public static final int FLAG_BOUND = 1;
        public static final int FLAG_IGNORE = 128;
        public static final int FLAG_INVALID = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_NOT_RECYCLABLE = 16;
        public static final int FLAG_REMOVED = 8;
        public static final int FLAG_RETURNED_FROM_SCRAP = 32;
        public static final int FLAG_TMP_DETACHED = 256;
        public static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = null;
        public static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        public h<? extends e0> mBindingAdapter;
        public int mFlags;
        public boolean mInChangeScrap;
        private int mIsRecyclableCount;
        public long mItemId;
        public int mItemViewType;
        public WeakReference<RecyclerView> mNestedRecyclerView;
        public int mOldPosition;
        public RecyclerView mOwnerRecyclerView;
        public List<Object> mPayloads;
        public int mPendingAccessibilityState;
        public int mPosition;
        public int mPreLayoutPosition;
        public w mScrapContainer;
        public e0 mShadowedHolder;
        public e0 mShadowingHolder;
        public List<Object> mUnmodifiedPayloads;
        private int mWasImportantForAccessibilityBeforeHidden;

        public e0(View view) {
        }

        private void createPayloadsIfNeeded() {
        }

        public void addChangePayload(Object obj) {
        }

        public void addFlags(int i2) {
        }

        public void clearOldPosition() {
        }

        public void clearPayload() {
        }

        public void clearReturnedFromScrapFlag() {
        }

        public void clearTmpDetachFlag() {
        }

        public boolean doesTransientStatePreventRecycling() {
        }

        public void flagRemovedAndOffsetPosition(int i2, int i3, boolean z) {
        }

        public final int getAbsoluteAdapterPosition() {
        }

        @Deprecated
        public final int getAdapterPosition() {
        }

        public final h<? extends e0> getBindingAdapter() {
        }

        public final int getBindingAdapterPosition() {
        }

        public final long getItemId() {
        }

        public final int getItemViewType() {
        }

        public final int getLayoutPosition() {
        }

        public final int getOldPosition() {
        }

        @Deprecated
        public final int getPosition() {
        }

        public List<Object> getUnmodifiedPayloads() {
        }

        public boolean hasAnyOfTheFlags(int i2) {
        }

        public boolean isAdapterPositionUnknown() {
        }

        public boolean isAttachedToTransitionOverlay() {
        }

        public boolean isBound() {
        }

        public boolean isInvalid() {
        }

        public final boolean isRecyclable() {
        }

        public boolean isRemoved() {
        }

        public boolean isScrap() {
        }

        public boolean isTmpDetached() {
        }

        public boolean isUpdated() {
        }

        public boolean needsUpdate() {
        }

        public void offsetPosition(int i2, boolean z) {
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
        }

        public void resetInternal() {
        }

        public void saveOldPosition() {
        }

        public void setFlags(int i2, int i3) {
        }

        public final void setIsRecyclable(boolean z) {
        }

        public void setScrapContainer(w wVar, boolean z) {
        }

        public boolean shouldBeKeptAsChild() {
        }

        public boolean shouldIgnore() {
        }

        public void stopIgnoring() {
        }

        public String toString() {
        }

        public void unScrap() {
        }

        public boolean wasReturnedFromScrap() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f implements a.InterfaceC0168a {
        public final /* synthetic */ RecyclerView a;

        public f(RecyclerView recyclerView) {
        }

        @Override // j.r.e.a.InterfaceC0168a
        public void a(int i2, int i3) {
        }

        @Override // j.r.e.a.InterfaceC0168a
        public void b(a.b bVar) {
        }

        @Override // j.r.e.a.InterfaceC0168a
        public void c(int i2, int i3, Object obj) {
        }

        @Override // j.r.e.a.InterfaceC0168a
        public void d(a.b bVar) {
        }

        @Override // j.r.e.a.InterfaceC0168a
        public e0 e(int i2) {
        }

        @Override // j.r.e.a.InterfaceC0168a
        public void f(int i2, int i3) {
        }

        @Override // j.r.e.a.InterfaceC0168a
        public void g(int i2, int i3) {
        }

        @Override // j.r.e.a.InterfaceC0168a
        public void h(int i2, int i3) {
        }

        public void i(a.b bVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static /* synthetic */ class g {
        public static final /* synthetic */ int[] a = null;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class h<VH extends e0> {
        public final i a;
        public boolean b;
        public a c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static final class a {
            public static final a a = null;
            public static final a b = null;
            public static final a c = null;
            public static final /* synthetic */ a[] d = null;

            public a(String str, int i2) {
            }

            public static a valueOf(String str) {
            }

            public static a[] values() {
            }
        }

        public final void A(int i2, int i3) {
        }

        public final void B(int i2, int i3) {
        }

        public final void C(int i2, int i3, Object obj) {
        }

        public final void D(int i2, int i3) {
        }

        public final void E(int i2, int i3) {
        }

        public final void F(int i2) {
        }

        public void G(RecyclerView recyclerView) {
        }

        public abstract void H(VH vh, int i2);

        public void I(VH vh, int i2, List<Object> list) {
        }

        public abstract VH J(ViewGroup viewGroup, int i2);

        public void K(RecyclerView recyclerView) {
        }

        public boolean L(VH vh) {
        }

        public void M(VH vh) {
        }

        public void N(VH vh) {
        }

        public void O(VH vh) {
        }

        public void P(j jVar) {
        }

        public void Q(boolean z) {
        }

        public void R(a aVar) {
        }

        public void S(j jVar) {
        }

        public final void m(VH vh, int i2) {
        }

        public boolean n() {
        }

        public final VH o(ViewGroup viewGroup, int i2) {
        }

        public int p(h<? extends e0> hVar, e0 e0Var, int i2) {
        }

        public abstract int q();

        public long r(int i2) {
        }

        public int s(int i2) {
        }

        public final a t() {
        }

        public final boolean u() {
        }

        public final boolean v() {
        }

        public final void w() {
        }

        public final void x(int i2) {
        }

        public final void y(int i2, Object obj) {
        }

        public final void z(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class i extends Observable<j> {
        public boolean a() {
        }

        public void b() {
        }

        public void c(int i2, int i3) {
        }

        public void d(int i2, int i3) {
        }

        public void e(int i2, int i3, Object obj) {
        }

        public void f(int i2, int i3) {
        }

        public void g(int i2, int i3) {
        }

        public void h() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class j {
        public void a() {
        }

        public void b(int i2, int i3) {
        }

        public void c(int i2, int i3, Object obj) {
        }

        public void d(int i2, int i3) {
        }

        public void e(int i2, int i3, int i4) {
        }

        public void f(int i2, int i3) {
        }

        public void g() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface k {
        int a(int i2, int i3);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class l {
        public EdgeEffect a(RecyclerView recyclerView, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class m {
        public b a;
        public ArrayList<a> b;
        public long c;
        public long d;
        public long e;
        public long f;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public interface a {
            void a();
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public interface b {
            void a(e0 e0Var);
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class c {
            public int a;
            public int b;

            public c a(e0 e0Var) {
            }

            public c b(e0 e0Var, int i2) {
            }
        }

        public static int e(e0 e0Var) {
        }

        public abstract boolean a(e0 e0Var, c cVar, c cVar2);

        public abstract boolean b(e0 e0Var, e0 e0Var2, c cVar, c cVar2);

        public abstract boolean c(e0 e0Var, c cVar, c cVar2);

        public abstract boolean d(e0 e0Var, c cVar, c cVar2);

        public abstract boolean f(e0 e0Var);

        public boolean g(e0 e0Var, List<Object> list) {
        }

        public final void h(e0 e0Var) {
        }

        public final void i() {
        }

        public abstract void j(e0 e0Var);

        public abstract void k();

        public long l() {
        }

        public long m() {
        }

        public long n() {
        }

        public long o() {
        }

        public abstract boolean p();

        public final boolean q(a aVar) {
        }

        public c r() {
        }

        public void s(e0 e0Var) {
        }

        public c t(b0 b0Var, e0 e0Var) {
        }

        public c u(b0 b0Var, e0 e0Var, int i2, List<Object> list) {
        }

        public abstract void v();

        public void w(b bVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class n implements m.b {
        public final /* synthetic */ RecyclerView a;

        public n(RecyclerView recyclerView) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.b
        public void a(e0 e0Var) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class o {
        @Deprecated
        public void f(Rect rect, int i2, RecyclerView recyclerView) {
        }

        public void g(Rect rect, View view, RecyclerView recyclerView, b0 b0Var) {
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
        }

        @Deprecated
        public void j(Canvas canvas, RecyclerView recyclerView) {
        }

        public void k(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class p {
        public j.r.e.f a;
        public RecyclerView b;
        public final c0.b c;
        public final c0.b d;
        public j.r.e.c0 e;
        public j.r.e.c0 f;
        public a0 g;
        public boolean h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f288i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f289j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f290k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f291l;

        /* renamed from: m, reason: collision with root package name */
        public int f292m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f293n;

        /* renamed from: o, reason: collision with root package name */
        public int f294o;

        /* renamed from: p, reason: collision with root package name */
        public int f295p;

        /* renamed from: q, reason: collision with root package name */
        public int f296q;

        /* renamed from: r, reason: collision with root package name */
        public int f297r;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements c0.b {
            public final /* synthetic */ p a;

            public a(p pVar) {
            }

            @Override // j.r.e.c0.b
            public View a(int i2) {
            }

            @Override // j.r.e.c0.b
            public int b(View view) {
            }

            @Override // j.r.e.c0.b
            public int c() {
            }

            @Override // j.r.e.c0.b
            public int d() {
            }

            @Override // j.r.e.c0.b
            public int e(View view) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class b implements c0.b {
            public final /* synthetic */ p a;

            public b(p pVar) {
            }

            @Override // j.r.e.c0.b
            public View a(int i2) {
            }

            @Override // j.r.e.c0.b
            public int b(View view) {
            }

            @Override // j.r.e.c0.b
            public int c() {
            }

            @Override // j.r.e.c0.b
            public int d() {
            }

            @Override // j.r.e.c0.b
            public int e(View view) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public interface c {
            void a(int i2, int i3);
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class d {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public static boolean I0(int i2, int i3, int i4) {
        }

        public static int X(int i2, int i3, int i4, int i5, boolean z) {
        }

        public static d s0(Context context, AttributeSet attributeSet, int i2, int i3) {
        }

        public static int z(int i2, int i3, int i4) {
        }

        public void A(int i2, int i3, b0 b0Var, c cVar) {
        }

        public boolean A0() {
        }

        public void A1(int i2, w wVar) {
        }

        public void B(int i2, c cVar) {
        }

        public void B0(View view) {
        }

        public boolean B1(Runnable runnable) {
        }

        public int C(b0 b0Var) {
        }

        public boolean C0() {
        }

        public void C1(View view) {
        }

        public int D(b0 b0Var) {
        }

        public boolean D0() {
        }

        public void D1(int i2) {
        }

        public int E(b0 b0Var) {
        }

        public final boolean E0(RecyclerView recyclerView, int i2, int i3) {
        }

        public boolean E1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        }

        public int F(b0 b0Var) {
        }

        public final boolean F0() {
        }

        public boolean F1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        }

        public int G(b0 b0Var) {
        }

        public boolean G0(w wVar, b0 b0Var) {
        }

        public void G1() {
        }

        public int H(b0 b0Var) {
        }

        public boolean H0() {
        }

        public void H1() {
        }

        public void I(w wVar) {
        }

        public final void I1(w wVar, int i2, View view) {
        }

        public void J(View view) {
        }

        public boolean J0() {
        }

        public int J1(int i2, w wVar, b0 b0Var) {
        }

        public void K(int i2) {
        }

        public boolean K0(View view, boolean z, boolean z2) {
        }

        public void K1(int i2) {
        }

        public final void L(int i2, View view) {
        }

        public void L0(View view, int i2, int i3, int i4, int i5) {
        }

        public int L1(int i2, w wVar, b0 b0Var) {
        }

        public void M(RecyclerView recyclerView) {
        }

        public void M0(View view, int i2, int i3) {
        }

        public void M1(RecyclerView recyclerView) {
        }

        public void N(RecyclerView recyclerView, w wVar) {
        }

        public void N0(int i2, int i3) {
        }

        public final void N1(boolean z) {
        }

        public View O(View view) {
        }

        public void O0(int i2) {
        }

        public void O1(int i2, int i3) {
        }

        public View P(int i2) {
        }

        public void P0(int i2) {
        }

        public void P1(int i2, int i3) {
        }

        public abstract q Q();

        public void Q0(h hVar, h hVar2) {
        }

        public void Q1(Rect rect, int i2, int i3) {
        }

        public q R(Context context, AttributeSet attributeSet) {
        }

        public boolean R0(RecyclerView recyclerView, ArrayList<View> arrayList, int i2, int i3) {
        }

        public void R1(int i2, int i3) {
        }

        public q S(ViewGroup.LayoutParams layoutParams) {
        }

        public void S0(RecyclerView recyclerView) {
        }

        public void S1(RecyclerView recyclerView) {
        }

        public int T() {
        }

        @Deprecated
        public void T0(RecyclerView recyclerView) {
        }

        public boolean T1(View view, int i2, int i3, q qVar) {
        }

        public int U(View view) {
        }

        public void U0(RecyclerView recyclerView, w wVar) {
        }

        public boolean U1() {
        }

        public View V(int i2) {
        }

        public View V0(View view, int i2, w wVar, b0 b0Var) {
        }

        public boolean V1(View view, int i2, int i3, q qVar) {
        }

        public int W() {
        }

        public void W0(AccessibilityEvent accessibilityEvent) {
        }

        public void W1(RecyclerView recyclerView, b0 b0Var, int i2) {
        }

        public void X0(w wVar, b0 b0Var, AccessibilityEvent accessibilityEvent) {
        }

        public void X1(a0 a0Var) {
        }

        public final int[] Y(View view, Rect rect) {
        }

        public void Y0(j.g.t.r0.c cVar) {
        }

        public void Y1(View view) {
        }

        public boolean Z() {
        }

        public void Z0(w wVar, b0 b0Var, j.g.t.r0.c cVar) {
        }

        public void Z1() {
        }

        public int a0(w wVar, b0 b0Var) {
        }

        public void a1(View view, j.g.t.r0.c cVar) {
        }

        public boolean a2() {
        }

        public int b0(View view) {
        }

        public void b1(w wVar, b0 b0Var, View view, j.g.t.r0.c cVar) {
        }

        public void c0(View view, Rect rect) {
        }

        public View c1(View view, int i2) {
        }

        public int d0(View view) {
        }

        public void d1(RecyclerView recyclerView, int i2, int i3) {
        }

        public int e0(View view) {
        }

        public void e1(RecyclerView recyclerView) {
        }

        public int f0(View view) {
        }

        public void f1(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public int g0(View view) {
        }

        public void g1(RecyclerView recyclerView, int i2, int i3) {
        }

        public int getPaddingBottom() {
        }

        public int getPaddingEnd() {
        }

        public int getPaddingLeft() {
        }

        public int getPaddingRight() {
        }

        public int getPaddingStart() {
        }

        public int getPaddingTop() {
        }

        public int h0(View view) {
        }

        public void h1(RecyclerView recyclerView, int i2, int i3) {
        }

        public View i0() {
        }

        public void i1(RecyclerView recyclerView, int i2, int i3, Object obj) {
        }

        public int j0() {
        }

        public void j1(w wVar, b0 b0Var) {
        }

        public int k0() {
        }

        public void k1(b0 b0Var) {
        }

        public int l0() {
        }

        public void l1(w wVar, b0 b0Var, int i2, int i3) {
        }

        public void m(View view) {
        }

        public int m0(View view) {
        }

        @Deprecated
        public boolean m1(RecyclerView recyclerView, View view, View view2) {
        }

        public void n(View view, int i2) {
        }

        public int n0() {
        }

        public boolean n1(RecyclerView recyclerView, b0 b0Var, View view, View view2) {
        }

        public void o(View view) {
        }

        public int o0(View view) {
        }

        public void o1(Parcelable parcelable) {
        }

        public void p(View view, int i2) {
        }

        public int p0() {
        }

        public Parcelable p1() {
        }

        public final void q(View view, int i2, boolean z) {
        }

        public int q0() {
        }

        public void q1(int i2) {
        }

        public void r(String str) {
        }

        public int r0(View view) {
        }

        public void r1(a0 a0Var) {
        }

        public void s(View view) {
        }

        public boolean s1(int i2, Bundle bundle) {
        }

        public void t(View view, int i2) {
        }

        public int t0(View view) {
        }

        public boolean t1(w wVar, b0 b0Var, int i2, Bundle bundle) {
        }

        public void u(View view, int i2, q qVar) {
        }

        public int u0(w wVar, b0 b0Var) {
        }

        public boolean u1(View view, int i2, Bundle bundle) {
        }

        public void v(View view, Rect rect) {
        }

        public int v0(w wVar, b0 b0Var) {
        }

        public boolean v1(w wVar, b0 b0Var, View view, int i2, Bundle bundle) {
        }

        public boolean w() {
        }

        public int w0(View view) {
        }

        public void w1() {
        }

        public boolean x() {
        }

        public void x0(View view, boolean z, Rect rect) {
        }

        public void x1(w wVar) {
        }

        public boolean y(q qVar) {
        }

        public int y0() {
        }

        public void y1(w wVar) {
        }

        public int z0() {
        }

        public void z1(View view, w wVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface r {
        void b(View view);

        void d(View view);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class s {
        public abstract boolean a(int i2, int i3);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface t {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean c(RecyclerView recyclerView, MotionEvent motionEvent);

        void e(boolean z);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class u {
        public void a(RecyclerView recyclerView, int i2) {
        }

        public void b(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class v {
        public SparseArray<a> a;
        public int b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class a {
            public final ArrayList<e0> a;
            public int b;
            public long c;
            public long d;
        }

        public void a() {
        }

        public void b() {
        }

        public void c() {
        }

        public void d(int i2, long j2) {
        }

        public void e(int i2, long j2) {
        }

        public e0 f(int i2) {
        }

        public final a g(int i2) {
        }

        public void h(h hVar, h hVar2, boolean z) {
        }

        public void i(e0 e0Var) {
        }

        public long j(long j2, long j3) {
        }

        public boolean k(int i2, long j2, long j3) {
        }

        public boolean l(int i2, long j2, long j3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class w {
        public final ArrayList<e0> a;
        public ArrayList<e0> b;
        public final ArrayList<e0> c;
        public final List<e0> d;
        public int e;
        public int f;
        public v g;
        public c0 h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f298i;

        public w(RecyclerView recyclerView) {
        }

        public void A() {
        }

        public void B(int i2) {
        }

        public void C(View view) {
        }

        public void D(e0 e0Var) {
        }

        public void E(View view) {
        }

        public void F(v vVar) {
        }

        public void G(c0 c0Var) {
        }

        public void H(int i2) {
        }

        public final boolean I(e0 e0Var, int i2, int i3, long j2) {
        }

        public e0 J(int i2, boolean z, long j2) {
        }

        public void K(e0 e0Var) {
        }

        public void L() {
        }

        public boolean M(e0 e0Var) {
        }

        public void N(int i2, int i3) {
        }

        public void a(e0 e0Var, boolean z) {
        }

        public final void b(e0 e0Var) {
        }

        public void c(View view, int i2) {
        }

        public void d() {
        }

        public void e() {
        }

        public void f() {
        }

        public int g(int i2) {
        }

        public void h(e0 e0Var) {
        }

        public e0 i(int i2) {
        }

        public v j() {
        }

        public int k() {
        }

        public List<e0> l() {
        }

        public e0 m(long j2, int i2, boolean z) {
        }

        public e0 n(int i2, boolean z) {
        }

        public View o(int i2) {
        }

        public View p(int i2) {
        }

        public View q(int i2, boolean z) {
        }

        public final void r(ViewGroup viewGroup, boolean z) {
        }

        public final void s(e0 e0Var) {
        }

        public void t() {
        }

        public void u() {
        }

        public void v(int i2, int i3) {
        }

        public void w(int i2, int i3) {
        }

        public void x(int i2, int i3, boolean z) {
        }

        public void y(h hVar, h hVar2, boolean z) {
        }

        public void z(View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface x {
        void a(e0 e0Var);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class y extends j {
        public final /* synthetic */ RecyclerView a;

        public y(RecyclerView recyclerView) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i2, int i3, Object obj) {
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

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void g() {
        }

        public void h() {
        }
    }

    public RecyclerView(Context context) {
    }

    public static RecyclerView Y(View view) {
    }

    public static /* synthetic */ void c(RecyclerView recyclerView, View view, int i2, ViewGroup.LayoutParams layoutParams) {
    }

    public static /* synthetic */ void d(RecyclerView recyclerView, int i2) {
    }

    public static /* synthetic */ boolean e(RecyclerView recyclerView) {
    }

    public static /* synthetic */ void f(RecyclerView recyclerView, int i2, int i3) {
    }

    private j.g.t.u getScrollingChildHelper() {
    }

    public static e0 k0(View view) {
    }

    public static void l0(View view, Rect rect) {
    }

    public static void s(e0 e0Var) {
    }

    public void A(View view) {
    }

    public final boolean A0(View view, View view2, int i2) {
    }

    public void A1(int i2) {
    }

    public final void B() {
    }

    public void B0(int i2) {
    }

    public void B1() {
    }

    public void C() {
    }

    public void C0() {
    }

    public final void C1() {
    }

    public final void D() {
    }

    public void D0() {
    }

    public void D1(int i2, int i3, Object obj) {
    }

    public final void E() {
    }

    public final void E0(int i2, int i3, MotionEvent motionEvent, int i4) {
    }

    public final void F() {
    }

    public void F0(int i2) {
    }

    public boolean G(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
    }

    public void G0(int i2) {
    }

    public final void H(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
    }

    public void H0(int i2, int i3) {
    }

    public boolean I(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
    }

    public void I0(int i2, int i3) {
    }

    public void J(int i2) {
    }

    public void J0(int i2, int i3, boolean z2) {
    }

    public void K(int i2, int i3) {
    }

    public void K0(View view) {
    }

    public void L() {
    }

    public void L0(View view) {
    }

    public final boolean M(MotionEvent motionEvent) {
    }

    public void M0() {
    }

    public void N() {
    }

    public void N0() {
    }

    public void O() {
    }

    public void O0(boolean z2) {
    }

    public void P() {
    }

    public final void P0(MotionEvent motionEvent) {
    }

    public void Q() {
    }

    public void Q0(int i2) {
    }

    public String R() {
    }

    public void R0(int i2, int i3) {
    }

    public final void S(b0 b0Var) {
    }

    public void S0() {
    }

    public View T(float f2, float f3) {
    }

    public final boolean T0() {
    }

    public View U(View view) {
    }

    public final void U0() {
    }

    public e0 V(View view) {
    }

    public void V0(boolean z2) {
    }

    public final boolean W(MotionEvent motionEvent) {
    }

    public final void W0(float f2, float f3, float f4, float f5) {
    }

    public final void X(int[] iArr) {
    }

    public void X0(e0 e0Var, m.c cVar) {
    }

    public final void Y0() {
    }

    public final View Z() {
    }

    public final void Z0() {
    }

    public void a(int i2, int i3) {
    }

    public e0 a0(int i2) {
    }

    public void a1() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
    }

    public e0 b0(long j2) {
    }

    public boolean b1(View view) {
    }

    public e0 c0(int i2) {
    }

    public void c1(o oVar) {
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
    }

    public e0 d0(int i2, boolean z2) {
    }

    public void d1(r rVar) {
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
    }

    public boolean e0(int i2, int i3) {
    }

    public void e1(t tVar) {
    }

    public int f0(e0 e0Var) {
    }

    public void f1(u uVar) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
    }

    public final void g(e0 e0Var) {
    }

    public long g0(e0 e0Var) {
    }

    public void g1() {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
    }

    public h getAdapter() {
    }

    @Override // android.view.View
    public int getBaseline() {
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
    }

    public j.r.e.x getCompatAccessibilityDelegate() {
    }

    public l getEdgeEffectFactory() {
    }

    public m getItemAnimator() {
    }

    public int getItemDecorationCount() {
    }

    public p getLayoutManager() {
    }

    public int getMaxFlingVelocity() {
    }

    public int getMinFlingVelocity() {
    }

    public long getNanoTime() {
    }

    public s getOnFlingListener() {
    }

    public boolean getPreserveFocusAfterLayout() {
    }

    public v getRecycledViewPool() {
    }

    public int getScrollState() {
    }

    public void h(o oVar) {
    }

    public int h0(View view) {
    }

    public final void h1(View view, View view2) {
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
    }

    public void i(o oVar, int i2) {
    }

    public int i0(View view) {
    }

    public final void i1() {
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
    }

    @Override // android.view.View, j.g.t.t
    public boolean isNestedScrollingEnabled() {
    }

    public void j(r rVar) {
    }

    public e0 j0(View view) {
    }

    public final void j1() {
    }

    public void k(t tVar) {
    }

    public final void k1() {
    }

    public void l(u uVar) {
    }

    public void l1() {
    }

    public void m(e0 e0Var, m.c cVar, m.c cVar2) {
    }

    public final int m0(View view) {
    }

    public boolean m1(int i2, int i3, MotionEvent motionEvent, int i4) {
    }

    public final void n(e0 e0Var, e0 e0Var2, m.c cVar, m.c cVar2, boolean z2, boolean z3) {
    }

    public final String n0(Context context, String str) {
    }

    public void n1(int i2, int i3, int[] iArr) {
    }

    public void o(e0 e0Var, m.c cVar, m.c cVar2) {
    }

    public Rect o0(View view) {
    }

    public void o1(int i2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void p(String str) {
    }

    public final void p0(long j2, e0 e0Var, e0 e0Var2) {
    }

    public final void p1(h hVar, boolean z2, boolean z3) {
    }

    public boolean q(e0 e0Var) {
    }

    public boolean q0() {
    }

    public boolean q1(e0 e0Var, int i2) {
    }

    public final void r() {
    }

    public final boolean r0() {
    }

    public boolean r1(AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    public void s0() {
    }

    public void s1(int i2, int i3) {
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
    }

    public void setAccessibilityDelegateCompat(j.r.e.x xVar) {
    }

    public void setAdapter(h hVar) {
    }

    public void setChildDrawingOrderCallback(k kVar) {
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
    }

    public void setEdgeEffectFactory(l lVar) {
    }

    public void setHasFixedSize(boolean z2) {
    }

    public void setItemAnimator(m mVar) {
    }

    public void setItemViewCacheSize(int i2) {
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
    }

    public void setLayoutManager(p pVar) {
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
    }

    public void setOnFlingListener(s sVar) {
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
    }

    public void setRecycledViewPool(v vVar) {
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
    }

    public void setScrollState(int i2) {
    }

    public void setScrollingTouchSlop(int i2) {
    }

    public void setViewCacheExtension(c0 c0Var) {
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
    }

    @Override // android.view.View, j.g.t.t
    public void stopNestedScroll() {
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
    }

    public void t() {
    }

    @SuppressLint({"InlinedApi"})
    public final void t0() {
    }

    public void t1(int i2, int i3, Interpolator interpolator) {
    }

    public void u(int i2, int i3) {
    }

    public final void u0() {
    }

    public void u1(int i2, int i3, Interpolator interpolator, int i4) {
    }

    public void v() {
    }

    public void v0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
    }

    public void v1(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
    }

    public final void w(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
    }

    public void w0() {
    }

    public void w1(int i2) {
    }

    public void x(int i2, int i3) {
    }

    public void x0() {
    }

    public void x1() {
    }

    public final boolean y(int i2, int i3) {
    }

    public boolean y0() {
    }

    public boolean y1(int i2, int i3) {
    }

    public void z(View view) {
    }

    public boolean z0() {
    }

    public void z1(boolean z2) {
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class z extends j.i.a.a {
        public static final Parcelable.Creator<z> CREATOR = null;
        public Parcelable c;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Parcelable.ClassLoaderCreator<z> {
            public z a(Parcel parcel) {
            }

            public z b(Parcel parcel, ClassLoader classLoader) {
            }

            public z[] c(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ z createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }
        }

        public z(Parcel parcel, ClassLoader classLoader) {
        }

        public void d(z zVar) {
        }

        @Override // j.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public z(Parcelable parcelable) {
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class q extends ViewGroup.MarginLayoutParams {
        public e0 a;
        public final Rect b;
        public boolean c;
        public boolean d;

        public q(Context context, AttributeSet attributeSet) {
        }

        public int a() {
        }

        public int d() {
        }

        public boolean e() {
        }

        public boolean f() {
        }

        public boolean h() {
        }

        public q(int i2, int i3) {
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        public q(ViewGroup.LayoutParams layoutParams) {
        }

        public q(q qVar) {
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }
}
