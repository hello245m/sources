package k.d.a.c.q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import j.b.p.j.g;
import j.b.p.j.n;
import j.g.s.e;
import j.w.b0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class c extends ViewGroup implements n {
    public static final int[] A = null;
    public static final int[] B = null;
    public final b0 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final View.OnClickListener g;
    public final e<k.d.a.c.q.a> h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseArray<View.OnTouchListener> f5481i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5482j;

    /* renamed from: k, reason: collision with root package name */
    public int f5483k;

    /* renamed from: l, reason: collision with root package name */
    public k.d.a.c.q.a[] f5484l;

    /* renamed from: m, reason: collision with root package name */
    public int f5485m;

    /* renamed from: n, reason: collision with root package name */
    public int f5486n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f5487o;

    /* renamed from: p, reason: collision with root package name */
    public int f5488p;

    /* renamed from: q, reason: collision with root package name */
    public ColorStateList f5489q;

    /* renamed from: r, reason: collision with root package name */
    public final ColorStateList f5490r;

    /* renamed from: s, reason: collision with root package name */
    public int f5491s;

    /* renamed from: t, reason: collision with root package name */
    public int f5492t;
    public Drawable u;
    public int v;
    public int[] w;
    public SparseArray<k.d.a.c.o.a> x;
    public d y;
    public g z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ c a;

        public a(c cVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public c(Context context) {
    }

    public static /* synthetic */ d a(c cVar) {
    }

    public static /* synthetic */ g c(c cVar) {
    }

    private k.d.a.c.q.a getNewItem() {
    }

    private void setBadgeIfNeeded(k.d.a.c.q.a aVar) {
    }

    @Override // j.b.p.j.n
    public void b(g gVar) {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void d() {
    }

    public ColorStateList e(int i2) {
    }

    public boolean f() {
    }

    public final boolean g(int i2, int i3) {
    }

    public SparseArray<k.d.a.c.o.a> getBadgeDrawables() {
    }

    public ColorStateList getIconTintList() {
    }

    public Drawable getItemBackground() {
    }

    @Deprecated
    public int getItemBackgroundRes() {
    }

    public int getItemIconSize() {
    }

    public int getItemTextAppearanceActive() {
    }

    public int getItemTextAppearanceInactive() {
    }

    public ColorStateList getItemTextColor() {
    }

    public int getLabelVisibilityMode() {
    }

    public int getSelectedItemId() {
    }

    public int getWindowAnimations() {
    }

    public final boolean h(int i2) {
    }

    public final void i() {
    }

    public void j(int i2) {
    }

    public void k() {
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

    public void setBadgeDrawables(SparseArray<k.d.a.c.o.a> sparseArray) {
    }

    public void setIconTintList(ColorStateList colorStateList) {
    }

    public void setItemBackground(Drawable drawable) {
    }

    public void setItemBackgroundRes(int i2) {
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
    }

    public void setItemIconSize(int i2) {
    }

    public void setItemTextAppearanceActive(int i2) {
    }

    public void setItemTextAppearanceInactive(int i2) {
    }

    public void setItemTextColor(ColorStateList colorStateList) {
    }

    public void setLabelVisibilityMode(int i2) {
    }

    public void setPresenter(d dVar) {
    }

    public c(Context context, AttributeSet attributeSet) {
    }
}
