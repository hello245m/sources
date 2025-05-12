package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j.g.t.r0.f;
import j.r.e.w;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class ViewPager2 extends ViewGroup {
    public static boolean u = true;
    public final Rect a;
    public final Rect b;
    public j.b0.c.b c;
    public int d;
    public boolean e;
    public RecyclerView.j f;
    public LinearLayoutManager g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public Parcelable f318i;

    /* renamed from: j, reason: collision with root package name */
    public RecyclerView f319j;

    /* renamed from: k, reason: collision with root package name */
    public w f320k;

    /* renamed from: l, reason: collision with root package name */
    public j.b0.c.e f321l;

    /* renamed from: m, reason: collision with root package name */
    public j.b0.c.b f322m;

    /* renamed from: n, reason: collision with root package name */
    public j.b0.c.c f323n;

    /* renamed from: o, reason: collision with root package name */
    public j.b0.c.d f324o;

    /* renamed from: p, reason: collision with root package name */
    public RecyclerView.m f325p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f326q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f327r;

    /* renamed from: s, reason: collision with root package name */
    public int f328s;

    /* renamed from: t, reason: collision with root package name */
    public e f329t;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends g {
        public final /* synthetic */ ViewPager2 a;

        public a(ViewPager2 viewPager2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends i {
        public final /* synthetic */ ViewPager2 a;

        public b(ViewPager2 viewPager2) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void a(int i2) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends i {
        public final /* synthetic */ ViewPager2 a;

        public c(ViewPager2 viewPager2) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d implements RecyclerView.r {
        public d(ViewPager2 viewPager2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void b(View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void d(View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public abstract class e {
        public e(ViewPager2 viewPager2) {
        }

        public boolean a() {
        }

        public boolean b(int i2) {
        }

        public boolean c(int i2, Bundle bundle) {
        }

        public boolean d() {
        }

        public void e(RecyclerView.h<?> hVar) {
        }

        public void f(RecyclerView.h<?> hVar) {
        }

        public String g() {
        }

        public void h(j.b0.c.b bVar, RecyclerView recyclerView) {
        }

        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        public void j(j.g.t.r0.c cVar) {
        }

        public boolean k(int i2) {
        }

        public boolean l(int i2, Bundle bundle) {
        }

        public void m() {
        }

        public CharSequence n() {
        }

        public void o(AccessibilityEvent accessibilityEvent) {
        }

        public void p() {
        }

        public void q() {
        }

        public void r() {
        }

        public void s() {
        }

        public /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f extends e {
        public final /* synthetic */ ViewPager2 a;

        public f(ViewPager2 viewPager2) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean b(int i2) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean d() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void j(j.g.t.r0.c cVar) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean k(int i2) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public CharSequence n() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class g extends RecyclerView.j {
        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i2, int i3, Object obj) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void e(int i2, int i3, int i4) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void f(int i2, int i3) {
        }

        public /* synthetic */ g(a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class h extends LinearLayoutManager {
        public final /* synthetic */ ViewPager2 I;

        public h(ViewPager2 viewPager2, Context context) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean F1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void Z0(RecyclerView.w wVar, RecyclerView.b0 b0Var, j.g.t.r0.c cVar) {
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void b2(RecyclerView.b0 b0Var, int[] iArr) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean t1(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i2, Bundle bundle) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class i {
        public void a(int i2) {
        }

        public void b(int i2, float f, int i3) {
        }

        public void c(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class j extends e {
        public final j.g.t.r0.f a;
        public final j.g.t.r0.f b;
        public RecyclerView.j c;
        public final /* synthetic */ ViewPager2 d;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements j.g.t.r0.f {
            public final /* synthetic */ j a;

            public a(j jVar) {
            }

            @Override // j.g.t.r0.f
            public boolean a(View view, f.a aVar) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class b implements j.g.t.r0.f {
            public final /* synthetic */ j a;

            public b(j jVar) {
            }

            @Override // j.g.t.r0.f
            public boolean a(View view, f.a aVar) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class c extends g {
            public final /* synthetic */ j a;

            public c(j jVar) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.j
            public void a() {
            }
        }

        public j(ViewPager2 viewPager2) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean c(int i2, Bundle bundle) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void e(RecyclerView.h<?> hVar) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void f(RecyclerView.h<?> hVar) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public String g() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void h(j.b0.c.b bVar, RecyclerView recyclerView) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean l(int i2, Bundle bundle) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void m() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void o(AccessibilityEvent accessibilityEvent) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void p() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void q() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void r() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void s() {
        }

        public final void t(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        public final void u(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        public void v(int i2) {
        }

        public void w() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface k {
        void a(View view, float f);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class l extends w {
        public final /* synthetic */ ViewPager2 e;

        public l(ViewPager2 viewPager2) {
        }

        @Override // j.r.e.w, j.r.e.a0
        public View f(RecyclerView.p pVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class m extends RecyclerView {
        public final /* synthetic */ ViewPager2 R0;

        public m(ViewPager2 viewPager2, Context context) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class o implements Runnable {
        public final int a;
        public final RecyclerView b;

        public o(int i2, RecyclerView recyclerView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
    }

    public final RecyclerView.r a() {
    }

    public final void b(Context context, AttributeSet attributeSet) {
    }

    public boolean c() {
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i2) {
    }

    public boolean d() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
    }

    public boolean e() {
    }

    public final void f(RecyclerView.h<?> hVar) {
    }

    public void g(i iVar) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
    }

    public RecyclerView.h getAdapter() {
    }

    public int getCurrentItem() {
    }

    public int getItemDecorationCount() {
    }

    public int getOffscreenPageLimit() {
    }

    public int getOrientation() {
    }

    public int getPageSize() {
    }

    public int getScrollState() {
    }

    public void h() {
    }

    public final void i() {
    }

    public void j(int i2, boolean z) {
    }

    public void k(int i2, boolean z) {
    }

    public final void l(Context context, AttributeSet attributeSet) {
    }

    public final void m(RecyclerView.h<?> hVar) {
    }

    public void n(i iVar) {
    }

    public void o() {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i2, Bundle bundle) {
    }

    public void setAdapter(RecyclerView.h hVar) {
    }

    public void setCurrentItem(int i2) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
    }

    public void setOffscreenPageLimit(int i2) {
    }

    public void setOrientation(int i2) {
    }

    public void setPageTransformer(k kVar) {
    }

    public void setUserInputEnabled(boolean z) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class n extends View.BaseSavedState {
        public static final Parcelable.Creator<n> CREATOR = null;
        public int a;
        public int b;
        public Parcelable c;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class a implements Parcelable.ClassLoaderCreator<n> {
            public n a(Parcel parcel) {
            }

            public n b(Parcel parcel, ClassLoader classLoader) {
            }

            public n[] c(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ n createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }
        }

        public n(Parcel parcel, ClassLoader classLoader) {
        }

        public final void a(Parcel parcel, ClassLoader classLoader) {
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public n(Parcel parcel) {
        }

        public n(Parcelable parcelable) {
        }
    }
}
