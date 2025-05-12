package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import j.b.p.j.g;
import j.g.t.p0;
import k.d.a.c.f0.m;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class BottomNavigationView extends FrameLayout {
    public static final int h = 0;
    public final g a;
    public final k.d.a.c.q.c b;
    public final k.d.a.c.q.d c;
    public ColorStateList d;
    public MenuInflater e;
    public d f;
    public c g;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements g.a {
        public final /* synthetic */ BottomNavigationView a;

        public a(BottomNavigationView bottomNavigationView) {
        }

        @Override // j.b.p.j.g.a
        public boolean a(g gVar, MenuItem menuItem) {
        }

        @Override // j.b.p.j.g.a
        public void b(g gVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements m.c {
        public b(BottomNavigationView bottomNavigationView) {
        }

        @Override // k.d.a.c.f0.m.c
        public p0 a(View view, p0 p0Var, m.d dVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface c {
        void a(MenuItem menuItem);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface d {
        boolean a(MenuItem menuItem);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class e extends j.i.a.a {
        public static final Parcelable.Creator<e> CREATOR = null;
        public Bundle c;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class a implements Parcelable.ClassLoaderCreator<e> {
            public e a(Parcel parcel) {
            }

            public e b(Parcel parcel, ClassLoader classLoader) {
            }

            public e[] c(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ e createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }
        }

        public e(Parcelable parcelable) {
        }

        public final void d(Parcel parcel, ClassLoader classLoader) {
        }

        @Override // j.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public e(Parcel parcel, ClassLoader classLoader) {
        }
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ c a(BottomNavigationView bottomNavigationView) {
    }

    public static /* synthetic */ d b(BottomNavigationView bottomNavigationView) {
    }

    private MenuInflater getMenuInflater() {
    }

    public final void c(Context context) {
    }

    public final void d() {
    }

    public final k.d.a.c.l0.g e(Context context) {
    }

    public void f(int i2) {
    }

    public final boolean g() {
    }

    public Drawable getItemBackground() {
    }

    @Deprecated
    public int getItemBackgroundResource() {
    }

    public int getItemIconSize() {
    }

    public ColorStateList getItemIconTintList() {
    }

    public ColorStateList getItemRippleColor() {
    }

    public int getItemTextAppearanceActive() {
    }

    public int getItemTextAppearanceInactive() {
    }

    public ColorStateList getItemTextColor() {
    }

    public int getLabelVisibilityMode() {
    }

    public int getMaxItemCount() {
    }

    public Menu getMenu() {
    }

    public int getSelectedItemId() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    public void setElevation(float f) {
    }

    public void setItemBackground(Drawable drawable) {
    }

    public void setItemBackgroundResource(int i2) {
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
    }

    public void setItemIconSize(int i2) {
    }

    public void setItemIconSizeRes(int i2) {
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
    }

    public void setItemTextAppearanceActive(int i2) {
    }

    public void setItemTextAppearanceInactive(int i2) {
    }

    public void setItemTextColor(ColorStateList colorStateList) {
    }

    public void setLabelVisibilityMode(int i2) {
    }

    public void setOnNavigationItemReselectedListener(c cVar) {
    }

    public void setOnNavigationItemSelectedListener(d dVar) {
    }

    public void setSelectedItemId(int i2) {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i2) {
    }
}
