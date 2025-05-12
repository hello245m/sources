package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import j.b.p.j.i;
import j.b.p.j.n;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {
    public i a;
    public ImageView b;
    public RadioButton c;
    public TextView d;
    public CheckBox e;
    public TextView f;
    public ImageView g;
    public ImageView h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f101i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f102j;

    /* renamed from: k, reason: collision with root package name */
    public int f103k;

    /* renamed from: l, reason: collision with root package name */
    public Context f104l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f105m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f106n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f107o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f108p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f109q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
    }

    private LayoutInflater getInflater() {
    }

    private void setSubMenuArrowVisible(boolean z) {
    }

    public final void a(View view) {
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
    }

    public final void b(View view, int i2) {
    }

    public final void c() {
    }

    @Override // j.b.p.j.n.a
    public boolean d() {
    }

    @Override // j.b.p.j.n.a
    public void e(i iVar, int i2) {
    }

    public final void f() {
    }

    public final void g() {
    }

    @Override // j.b.p.j.n.a
    public i getItemData() {
    }

    public void h(boolean z, char c) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setForceShowIcon(boolean z) {
    }

    public void setGroupDividerEnabled(boolean z) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
    }
}
