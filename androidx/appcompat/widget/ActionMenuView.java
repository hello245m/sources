package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import j.b.p.j.g;
import j.b.p.j.i;
import j.b.p.j.m;
import j.b.p.j.n;
import j.b.q.i0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ActionMenuView extends i0 implements g.b, n {
    public e A;

    /* renamed from: p, reason: collision with root package name */
    public g f136p;

    /* renamed from: q, reason: collision with root package name */
    public Context f137q;

    /* renamed from: r, reason: collision with root package name */
    public int f138r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f139s;

    /* renamed from: t, reason: collision with root package name */
    public j.b.q.c f140t;
    public m.a u;
    public g.a v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b implements m.a {
        @Override // j.b.p.j.m.a
        public void a(g gVar, boolean z) {
        }

        @Override // j.b.p.j.m.a
        public boolean b(g gVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c extends i0.a {

        @ViewDebug.ExportedProperty
        public boolean a;

        @ViewDebug.ExportedProperty
        public int b;

        @ViewDebug.ExportedProperty
        public int c;

        @ViewDebug.ExportedProperty
        public boolean d;

        @ViewDebug.ExportedProperty
        public boolean e;
        public boolean f;

        public c(Context context, AttributeSet attributeSet) {
        }

        public c(ViewGroup.LayoutParams layoutParams) {
        }

        public c(c cVar) {
        }

        public c(int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d implements g.a {
        public final /* synthetic */ ActionMenuView a;

        public d(ActionMenuView actionMenuView) {
        }

        @Override // j.b.p.j.g.a
        public boolean a(g gVar, MenuItem menuItem) {
        }

        @Override // j.b.p.j.g.a
        public void b(g gVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
    }

    public static int L(View view, int i2, int i3, int i4, int i5) {
    }

    public void B() {
    }

    public c C() {
    }

    public c D(AttributeSet attributeSet) {
    }

    public c E(ViewGroup.LayoutParams layoutParams) {
    }

    public c F() {
    }

    public boolean G(int i2) {
    }

    public boolean H() {
    }

    public boolean I() {
    }

    public boolean J() {
    }

    public boolean K() {
    }

    public final void M(int i2, int i3) {
    }

    public g N() {
    }

    public void O(m.a aVar, g.a aVar2) {
    }

    public boolean P() {
    }

    @Override // j.b.p.j.g.b
    public boolean a(i iVar) {
    }

    @Override // j.b.p.j.n
    public void b(g gVar) {
    }

    @Override // j.b.q.i0, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // j.b.q.i0, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // j.b.q.i0, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    public Menu getMenu() {
    }

    public Drawable getOverflowIcon() {
    }

    public int getPopupTheme() {
    }

    public int getWindowAnimations() {
    }

    @Override // j.b.q.i0
    public /* bridge */ /* synthetic */ i0.a m() {
    }

    @Override // j.b.q.i0
    public /* bridge */ /* synthetic */ i0.a n(AttributeSet attributeSet) {
    }

    @Override // j.b.q.i0
    public /* bridge */ /* synthetic */ i0.a o(ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // j.b.q.i0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // j.b.q.i0, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public void setExpandedActionViewsExclusive(boolean z) {
    }

    public void setOnMenuItemClickListener(e eVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
    }

    public void setOverflowReserved(boolean z) {
    }

    public void setPopupTheme(int i2) {
    }

    public void setPresenter(j.b.q.c cVar) {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
    }

    @Override // j.b.q.i0, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }
}
