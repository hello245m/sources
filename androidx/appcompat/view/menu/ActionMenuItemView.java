package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import j.b.p.j.g;
import j.b.p.j.i;
import j.b.p.j.n;
import j.b.p.j.p;
import j.b.q.h0;
import j.b.q.z;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ActionMenuItemView extends z implements n.a, View.OnClickListener, ActionMenuView.a {
    public i f;
    public CharSequence g;
    public Drawable h;

    /* renamed from: i, reason: collision with root package name */
    public g.b f92i;

    /* renamed from: j, reason: collision with root package name */
    public h0 f93j;

    /* renamed from: k, reason: collision with root package name */
    public b f94k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f95l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f96m;

    /* renamed from: n, reason: collision with root package name */
    public int f97n;

    /* renamed from: o, reason: collision with root package name */
    public int f98o;

    /* renamed from: p, reason: collision with root package name */
    public int f99p;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends h0 {

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ ActionMenuItemView f100j;

        public a(ActionMenuItemView actionMenuItemView) {
        }

        @Override // j.b.q.h0
        public p b() {
        }

        @Override // j.b.q.h0
        public boolean c() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class b {
        public abstract p a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
    }

    @Override // j.b.p.j.n.a
    public boolean d() {
    }

    @Override // j.b.p.j.n.a
    public void e(i iVar, int i2) {
    }

    public boolean f() {
    }

    public final boolean g() {
    }

    @Override // j.b.p.j.n.a
    public i getItemData() {
    }

    public final void h() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // j.b.q.z, android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setItemInvoker(g.b bVar) {
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    public void setPopupCallback(b bVar) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
    }
}
