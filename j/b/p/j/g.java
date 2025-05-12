package j.b.p.j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class g implements j.g.m.a.a {
    public static final int[] A = null;
    public final Context a;
    public final Resources b;
    public boolean c;
    public boolean d;
    public a e;
    public ArrayList<i> f;
    public ArrayList<i> g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList<i> f2747i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList<i> f2748j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2749k;

    /* renamed from: l, reason: collision with root package name */
    public int f2750l;

    /* renamed from: m, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f2751m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f2752n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f2753o;

    /* renamed from: p, reason: collision with root package name */
    public View f2754p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2755q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2756r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2757s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2758t;
    public boolean u;
    public ArrayList<i> v;
    public CopyOnWriteArrayList<WeakReference<m>> w;
    public i x;
    public boolean y;
    public boolean z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface a {
        boolean a(g gVar, MenuItem menuItem);

        void b(g gVar);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b {
        boolean a(i iVar);
    }

    public g(Context context) {
    }

    public static int D(int i2) {
    }

    public static int p(ArrayList<i> arrayList, int i2) {
    }

    public View A() {
    }

    public ArrayList<i> B() {
    }

    public boolean C() {
    }

    public Resources E() {
    }

    public g F() {
    }

    public ArrayList<i> G() {
    }

    public boolean H() {
    }

    public boolean I() {
    }

    public boolean J() {
    }

    public void K(i iVar) {
    }

    public void L(i iVar) {
    }

    public void M(boolean z) {
    }

    public boolean N(MenuItem menuItem, int i2) {
    }

    public boolean O(MenuItem menuItem, m mVar, int i2) {
    }

    public final void P(int i2, boolean z) {
    }

    public void Q(m mVar) {
    }

    public void R(Bundle bundle) {
    }

    public void S(Bundle bundle) {
    }

    public void T(Bundle bundle) {
    }

    public void U(Bundle bundle) {
    }

    public void V(a aVar) {
    }

    public g W(int i2) {
    }

    public void X(MenuItem menuItem) {
    }

    public g Y(int i2) {
    }

    public g Z(Drawable drawable) {
    }

    public MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
    }

    public final void a0(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
    }

    public void b(m mVar) {
    }

    public g b0(int i2) {
    }

    public void c(m mVar, Context context) {
    }

    public g c0(CharSequence charSequence) {
    }

    @Override // android.view.Menu
    public void clear() {
    }

    public void clearHeader() {
    }

    @Override // android.view.Menu
    public void close() {
    }

    public void d() {
    }

    public g d0(View view) {
    }

    public final void e(boolean z) {
    }

    public void e0(boolean z) {
    }

    public boolean f(i iVar) {
    }

    public final void f0(boolean z) {
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
    }

    public final i g(int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
    }

    public void g0() {
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
    }

    public boolean h(g gVar, MenuItem menuItem) {
    }

    public void h0() {
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
    }

    public final void i(boolean z) {
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
    }

    public final void j(Bundle bundle) {
    }

    public final void k(Bundle bundle) {
    }

    public final boolean l(r rVar, m mVar) {
    }

    public boolean m(i iVar) {
    }

    public int n(int i2) {
    }

    public int o(int i2, int i3) {
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
    }

    public int q(int i2) {
    }

    public i r(int i2, KeyEvent keyEvent) {
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
    }

    public void s(List<i> list, int i2, KeyEvent keyEvent) {
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z, boolean z2) {
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z) {
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z) {
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
    }

    @Override // android.view.Menu
    public int size() {
    }

    public void t() {
    }

    public ArrayList<i> u() {
    }

    public String v() {
    }

    public Context w() {
    }

    public i x() {
    }

    public Drawable y() {
    }

    public CharSequence z() {
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
    }
}
