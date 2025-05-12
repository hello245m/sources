package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import j.b.q.f;
import java.util.LinkedHashSet;
import k.d.a.c.l0.k;
import k.d.a.c.l0.n;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class MaterialButton extends f implements Checkable, n {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f442p = null;

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f443q = null;

    /* renamed from: r, reason: collision with root package name */
    public static final int f444r = 0;
    public final k.d.a.c.s.a c;
    public final LinkedHashSet<a> d;
    public b e;
    public PorterDuff.Mode f;
    public ColorStateList g;
    public Drawable h;

    /* renamed from: i, reason: collision with root package name */
    public int f445i;

    /* renamed from: j, reason: collision with root package name */
    public int f446j;

    /* renamed from: k, reason: collision with root package name */
    public int f447k;

    /* renamed from: l, reason: collision with root package name */
    public int f448l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f449m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f450n;

    /* renamed from: o, reason: collision with root package name */
    public int f451o;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b {
        void a(MaterialButton materialButton, boolean z);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c extends j.i.a.a {
        public static final Parcelable.Creator<c> CREATOR = null;
        public boolean c;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class a implements Parcelable.ClassLoaderCreator<c> {
            public c a(Parcel parcel) {
            }

            public c b(Parcel parcel, ClassLoader classLoader) {
            }

            public c[] c(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ c createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }
        }

        public c(Parcelable parcelable) {
        }

        public final void d(Parcel parcel) {
        }

        @Override // j.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public c(Parcel parcel, ClassLoader classLoader) {
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
    }

    private String getA11yClassName() {
    }

    private int getTextHeight() {
    }

    private int getTextWidth() {
    }

    public void a(a aVar) {
    }

    public boolean b() {
    }

    public final boolean c() {
    }

    public final boolean d() {
    }

    public final boolean e() {
    }

    public final boolean f() {
    }

    public final boolean g() {
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
    }

    public int getCornerRadius() {
    }

    public Drawable getIcon() {
    }

    public int getIconGravity() {
    }

    public int getIconPadding() {
    }

    public int getIconSize() {
    }

    public ColorStateList getIconTint() {
    }

    public PorterDuff.Mode getIconTintMode() {
    }

    public int getInsetBottom() {
    }

    public int getInsetTop() {
    }

    public ColorStateList getRippleColor() {
    }

    public k getShapeAppearanceModel() {
    }

    public ColorStateList getStrokeColor() {
    }

    public int getStrokeWidth() {
    }

    @Override // j.b.q.f, j.g.t.e0
    public ColorStateList getSupportBackgroundTintList() {
    }

    @Override // j.b.q.f, j.g.t.e0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
    }

    public void h(a aVar) {
    }

    public final void i() {
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
    }

    public final void j(boolean z) {
    }

    public final void k(int i2, int i3) {
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
    }

    @Override // j.b.q.f, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // j.b.q.f, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // j.b.q.f, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // j.b.q.f, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public boolean performClick() {
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
    }

    @Override // j.b.q.f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // j.b.q.f, android.view.View
    public void setBackgroundResource(int i2) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
    }

    public void setCornerRadius(int i2) {
    }

    public void setCornerRadiusResource(int i2) {
    }

    @Override // android.view.View
    public void setElevation(float f) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setIconGravity(int i2) {
    }

    public void setIconPadding(int i2) {
    }

    public void setIconResource(int i2) {
    }

    public void setIconSize(int i2) {
    }

    public void setIconTint(ColorStateList colorStateList) {
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
    }

    public void setIconTintResource(int i2) {
    }

    public void setInsetBottom(int i2) {
    }

    public void setInsetTop(int i2) {
    }

    public void setInternalBackground(Drawable drawable) {
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
    }

    public void setRippleColor(ColorStateList colorStateList) {
    }

    public void setRippleColorResource(int i2) {
    }

    @Override // k.d.a.c.l0.n
    public void setShapeAppearanceModel(k kVar) {
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
    }

    public void setStrokeColor(ColorStateList colorStateList) {
    }

    public void setStrokeColorResource(int i2) {
    }

    public void setStrokeWidth(int i2) {
    }

    public void setStrokeWidthResource(int i2) {
    }

    @Override // j.b.q.f, j.g.t.e0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // j.b.q.f, j.g.t.e0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
    }

    @Override // android.widget.Checkable
    public void toggle() {
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i2) {
    }
}
