package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import j.b.q.y;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class SwitchCompat extends CompoundButton {
    public static final Property<SwitchCompat, Float> N = null;
    public static final int[] O = null;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public final TextPaint F;
    public ColorStateList G;
    public Layout H;
    public Layout I;
    public TransformationMethod J;
    public ObjectAnimator K;
    public final y L;
    public final Rect M;
    public Drawable a;
    public ColorStateList b;
    public PorterDuff.Mode c;
    public boolean d;
    public boolean e;
    public Drawable f;
    public ColorStateList g;
    public PorterDuff.Mode h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f146i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f147j;

    /* renamed from: k, reason: collision with root package name */
    public int f148k;

    /* renamed from: l, reason: collision with root package name */
    public int f149l;

    /* renamed from: m, reason: collision with root package name */
    public int f150m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f151n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f152o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f153p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f154q;

    /* renamed from: r, reason: collision with root package name */
    public int f155r;

    /* renamed from: s, reason: collision with root package name */
    public int f156s;

    /* renamed from: t, reason: collision with root package name */
    public float f157t;
    public float u;
    public VelocityTracker v;
    public int w;
    public float x;
    public int y;
    public int z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends Property<SwitchCompat, Float> {
        public a(Class cls, String str) {
        }

        public Float a(SwitchCompat switchCompat) {
        }

        public void b(SwitchCompat switchCompat, Float f) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Float get(SwitchCompat switchCompat) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(SwitchCompat switchCompat, Float f) {
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
    }

    public static float f(float f, float f2, float f3) {
    }

    private boolean getTargetCheckedState() {
    }

    private int getThumbOffset() {
    }

    private int getThumbScrollRange() {
    }

    public final void a(boolean z) {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void d() {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
    }

    public final void e(MotionEvent motionEvent) {
    }

    public final boolean g(float f, float f2) {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
    }

    public boolean getShowText() {
    }

    public boolean getSplitTrack() {
    }

    public int getSwitchMinWidth() {
    }

    public int getSwitchPadding() {
    }

    public CharSequence getTextOff() {
    }

    public CharSequence getTextOn() {
    }

    public Drawable getThumbDrawable() {
    }

    public int getThumbTextPadding() {
    }

    public ColorStateList getThumbTintList() {
    }

    public PorterDuff.Mode getThumbTintMode() {
    }

    public Drawable getTrackDrawable() {
    }

    public ColorStateList getTrackTintList() {
    }

    public PorterDuff.Mode getTrackTintMode() {
    }

    public final Layout h(CharSequence charSequence) {
    }

    public final void i() {
    }

    public final void j() {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
    }

    public void k(Context context, int i2) {
    }

    public void l(Typeface typeface, int i2) {
    }

    public final void m(int i2, int i3) {
    }

    public final void n(MotionEvent motionEvent) {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
    }

    public void setShowText(boolean z) {
    }

    public void setSplitTrack(boolean z) {
    }

    public void setSwitchMinWidth(int i2) {
    }

    public void setSwitchPadding(int i2) {
    }

    public void setSwitchTypeface(Typeface typeface) {
    }

    public void setTextOff(CharSequence charSequence) {
    }

    public void setTextOn(CharSequence charSequence) {
    }

    public void setThumbDrawable(Drawable drawable) {
    }

    public void setThumbPosition(float f) {
    }

    public void setThumbResource(int i2) {
    }

    public void setThumbTextPadding(int i2) {
    }

    public void setThumbTintList(ColorStateList colorStateList) {
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
    }

    public void setTrackDrawable(Drawable drawable) {
    }

    public void setTrackResource(int i2) {
    }

    public void setTrackTintList(ColorStateList colorStateList) {
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i2) {
    }
}
