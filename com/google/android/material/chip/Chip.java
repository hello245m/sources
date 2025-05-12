package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import j.b.q.g;
import java.util.List;
import k.d.a.c.i0.d;
import k.d.a.c.i0.f;
import k.d.a.c.l0.k;
import k.d.a.c.l0.n;
import k.d.a.c.m.h;
import k.d.a.c.w.a;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class Chip extends g implements a.InterfaceC0264a, n {

    /* renamed from: t, reason: collision with root package name */
    public static final int f456t = 0;
    public static final Rect u = null;
    public static final int[] v = null;
    public static final int[] w = null;
    public k.d.a.c.w.a d;
    public InsetDrawable e;
    public RippleDrawable f;
    public View.OnClickListener g;
    public CompoundButton.OnCheckedChangeListener h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f457i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f458j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f459k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f460l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f461m;

    /* renamed from: n, reason: collision with root package name */
    public int f462n;

    /* renamed from: o, reason: collision with root package name */
    public int f463o;

    /* renamed from: p, reason: collision with root package name */
    public final c f464p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f465q;

    /* renamed from: r, reason: collision with root package name */
    public final RectF f466r;

    /* renamed from: s, reason: collision with root package name */
    public final f f467s;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends f {
        public final /* synthetic */ Chip a;

        public a(Chip chip) {
        }

        @Override // k.d.a.c.i0.f
        public void a(int i2) {
        }

        @Override // k.d.a.c.i0.f
        public void b(Typeface typeface, boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends ViewOutlineProvider {
        public final /* synthetic */ Chip a;

        public b(Chip chip) {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends j.i.b.a {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Chip f468q;

        public c(Chip chip, Chip chip2) {
        }

        @Override // j.i.b.a
        public int B(float f, float f2) {
        }

        @Override // j.i.b.a
        public void C(List<Integer> list) {
        }

        @Override // j.i.b.a
        public boolean J(int i2, int i3, Bundle bundle) {
        }

        @Override // j.i.b.a
        public void M(j.g.t.r0.c cVar) {
        }

        @Override // j.i.b.a
        public void N(int i2, j.g.t.r0.c cVar) {
        }

        @Override // j.i.b.a
        public void O(int i2, boolean z) {
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ k.d.a.c.w.a b(Chip chip) {
    }

    public static /* synthetic */ boolean c(Chip chip) {
    }

    public static /* synthetic */ RectF d(Chip chip) {
    }

    public static /* synthetic */ View.OnClickListener e(Chip chip) {
    }

    public static /* synthetic */ boolean f(Chip chip, boolean z) {
    }

    public static /* synthetic */ Rect g(Chip chip) {
    }

    private RectF getCloseIconTouchBounds() {
    }

    private Rect getCloseIconTouchBoundsInt() {
    }

    private d getTextAppearance() {
    }

    public static /* synthetic */ Rect h() {
    }

    private void setCloseIconHovered(boolean z) {
    }

    private void setCloseIconPressed(boolean z) {
    }

    public final void A() {
    }

    public final void B() {
    }

    public final void C(AttributeSet attributeSet) {
    }

    @Override // k.d.a.c.w.a.InterfaceC0264a
    public void a() {
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
    }

    @Override // j.b.q.g, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
    }

    public Drawable getBackgroundDrawable() {
    }

    public Drawable getCheckedIcon() {
    }

    public ColorStateList getCheckedIconTint() {
    }

    public ColorStateList getChipBackgroundColor() {
    }

    public float getChipCornerRadius() {
    }

    public Drawable getChipDrawable() {
    }

    public float getChipEndPadding() {
    }

    public Drawable getChipIcon() {
    }

    public float getChipIconSize() {
    }

    public ColorStateList getChipIconTint() {
    }

    public float getChipMinHeight() {
    }

    public float getChipStartPadding() {
    }

    public ColorStateList getChipStrokeColor() {
    }

    public float getChipStrokeWidth() {
    }

    @Deprecated
    public CharSequence getChipText() {
    }

    public Drawable getCloseIcon() {
    }

    public CharSequence getCloseIconContentDescription() {
    }

    public float getCloseIconEndPadding() {
    }

    public float getCloseIconSize() {
    }

    public float getCloseIconStartPadding() {
    }

    public ColorStateList getCloseIconTint() {
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
    }

    public h getHideMotionSpec() {
    }

    public float getIconEndPadding() {
    }

    public float getIconStartPadding() {
    }

    public ColorStateList getRippleColor() {
    }

    public k getShapeAppearanceModel() {
    }

    public h getShowMotionSpec() {
    }

    public float getTextEndPadding() {
    }

    public float getTextStartPadding() {
    }

    public final void i(k.d.a.c.w.a aVar) {
    }

    public final int[] j() {
    }

    public boolean k(int i2) {
    }

    public final void l() {
    }

    @SuppressLint({"PrivateApi"})
    public final boolean m(MotionEvent motionEvent) {
    }

    public final boolean n() {
    }

    public final void o(Context context, AttributeSet attributeSet, int i2) {
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i2) {
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public final void p() {
    }

    public final void q(int i2, int i3, int i4, int i5) {
    }

    public boolean r() {
    }

    public boolean s() {
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
    }

    @Override // j.b.q.g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // j.b.q.g, android.view.View
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

    public void setCheckableResource(int i2) {
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
    }

    public void setCheckedIcon(Drawable drawable) {
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
    }

    public void setCheckedIconResource(int i2) {
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
    }

    public void setCheckedIconTintResource(int i2) {
    }

    public void setCheckedIconVisible(int i2) {
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
    }

    public void setChipBackgroundColorResource(int i2) {
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
    }

    public void setChipDrawable(k.d.a.c.w.a aVar) {
    }

    public void setChipEndPadding(float f) {
    }

    public void setChipEndPaddingResource(int i2) {
    }

    public void setChipIcon(Drawable drawable) {
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
    }

    public void setChipIconResource(int i2) {
    }

    public void setChipIconSize(float f) {
    }

    public void setChipIconSizeResource(int i2) {
    }

    public void setChipIconTint(ColorStateList colorStateList) {
    }

    public void setChipIconTintResource(int i2) {
    }

    public void setChipIconVisible(int i2) {
    }

    public void setChipMinHeight(float f) {
    }

    public void setChipMinHeightResource(int i2) {
    }

    public void setChipStartPadding(float f) {
    }

    public void setChipStartPaddingResource(int i2) {
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
    }

    public void setChipStrokeColorResource(int i2) {
    }

    public void setChipStrokeWidth(float f) {
    }

    public void setChipStrokeWidthResource(int i2) {
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
    }

    @Deprecated
    public void setChipTextResource(int i2) {
    }

    public void setCloseIcon(Drawable drawable) {
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
    }

    public void setCloseIconEndPadding(float f) {
    }

    public void setCloseIconEndPaddingResource(int i2) {
    }

    public void setCloseIconResource(int i2) {
    }

    public void setCloseIconSize(float f) {
    }

    public void setCloseIconSizeResource(int i2) {
    }

    public void setCloseIconStartPadding(float f) {
    }

    public void setCloseIconStartPaddingResource(int i2) {
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
    }

    public void setCloseIconTintResource(int i2) {
    }

    public void setCloseIconVisible(int i2) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setElevation(float f) {
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
    }

    @Override // android.widget.TextView
    public void setGravity(int i2) {
    }

    public void setHideMotionSpec(h hVar) {
    }

    public void setHideMotionSpecResource(int i2) {
    }

    public void setIconEndPadding(float f) {
    }

    public void setIconEndPaddingResource(int i2) {
    }

    public void setIconStartPadding(float f) {
    }

    public void setIconStartPaddingResource(int i2) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
    }

    @Override // android.widget.TextView
    public void setLines(int i2) {
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i2) {
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i2) {
    }

    @Override // android.widget.TextView
    public void setMinLines(int i2) {
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
    }

    public void setRippleColor(ColorStateList colorStateList) {
    }

    public void setRippleColorResource(int i2) {
    }

    @Override // k.d.a.c.l0.n
    public void setShapeAppearanceModel(k kVar) {
    }

    public void setShowMotionSpec(h hVar) {
    }

    public void setShowMotionSpecResource(int i2) {
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
    }

    public void setTextAppearance(d dVar) {
    }

    public void setTextAppearanceResource(int i2) {
    }

    public void setTextEndPadding(float f) {
    }

    public void setTextEndPaddingResource(int i2) {
    }

    public void setTextStartPadding(float f) {
    }

    public void setTextStartPaddingResource(int i2) {
    }

    public boolean t() {
    }

    public final void u() {
    }

    public boolean v() {
    }

    public final void w(k.d.a.c.w.a aVar) {
    }

    public final void x() {
    }

    public final void y() {
    }

    public final void z() {
    }

    public Chip(Context context, AttributeSet attributeSet, int i2) {
    }

    public void setCloseIconVisible(boolean z) {
    }

    public void setCheckedIconVisible(boolean z) {
    }

    public void setChipIconVisible(boolean z) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i2) {
    }
}
