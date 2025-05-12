package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.LinkedHashSet;
import k.d.a.c.l0.k;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class TextInputLayout extends LinearLayout {
    public static final int P0 = 0;
    public boolean A;
    public int A0;
    public k.d.a.c.l0.g B;
    public int B0;
    public k.d.a.c.l0.g C;
    public ColorStateList C0;
    public k D;
    public int D0;
    public final int E;
    public int E0;
    public int F;
    public int F0;
    public int G;
    public int G0;
    public int H;
    public int H0;
    public int I;
    public boolean I0;
    public int J;
    public final k.d.a.c.f0.a J0;
    public int K;
    public boolean K0;
    public int L;
    public boolean L0;
    public final Rect M;
    public ValueAnimator M0;
    public final Rect N;
    public boolean N0;
    public final RectF O;
    public boolean O0;
    public Typeface P;
    public final CheckableImageButton Q;
    public ColorStateList R;
    public boolean S;
    public PorterDuff.Mode T;
    public boolean U;
    public Drawable V;
    public int W;
    public final FrameLayout a;
    public final LinearLayout b;
    public final LinearLayout c;
    public final FrameLayout d;
    public EditText e;
    public CharSequence f;
    public final k.d.a.c.p0.f g;
    public View.OnLongClickListener g0;
    public boolean h;
    public final LinkedHashSet<f> h0;

    /* renamed from: i, reason: collision with root package name */
    public int f503i;
    public int i0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f504j;
    public final SparseArray<k.d.a.c.p0.e> j0;

    /* renamed from: k, reason: collision with root package name */
    public TextView f505k;
    public final CheckableImageButton k0;

    /* renamed from: l, reason: collision with root package name */
    public int f506l;
    public final LinkedHashSet<g> l0;

    /* renamed from: m, reason: collision with root package name */
    public int f507m;
    public ColorStateList m0;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f508n;
    public boolean n0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f509o;
    public PorterDuff.Mode o0;

    /* renamed from: p, reason: collision with root package name */
    public TextView f510p;
    public boolean p0;

    /* renamed from: q, reason: collision with root package name */
    public ColorStateList f511q;
    public Drawable q0;

    /* renamed from: r, reason: collision with root package name */
    public int f512r;
    public int r0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f513s;
    public Drawable s0;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f514t;
    public View.OnLongClickListener t0;
    public CharSequence u;
    public View.OnLongClickListener u0;
    public final TextView v;
    public final CheckableImageButton v0;
    public CharSequence w;
    public ColorStateList w0;
    public final TextView x;
    public ColorStateList x0;
    public boolean y;
    public ColorStateList y0;
    public CharSequence z;
    public int z0;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements TextWatcher {
        public final /* synthetic */ TextInputLayout a;

        public a(TextInputLayout textInputLayout) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Runnable {
        public final /* synthetic */ TextInputLayout a;

        public b(TextInputLayout textInputLayout) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements Runnable {
        public final /* synthetic */ TextInputLayout a;

        public c(TextInputLayout textInputLayout) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ TextInputLayout a;

        public d(TextInputLayout textInputLayout) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class e extends j.g.t.g {
        public final TextInputLayout d;

        public e(TextInputLayout textInputLayout) {
        }

        @Override // j.g.t.g
        public void g(View view, j.g.t.r0.c cVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface g {
        void a(TextInputLayout textInputLayout, int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class h extends j.i.a.a {
        public static final Parcelable.Creator<h> CREATOR = null;
        public CharSequence c;
        public boolean d;
        public CharSequence e;
        public CharSequence f;
        public CharSequence g;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class a implements Parcelable.ClassLoaderCreator<h> {
            public h a(Parcel parcel) {
            }

            public h b(Parcel parcel, ClassLoader classLoader) {
            }

            public h[] c(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ h createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }
        }

        public h(Parcelable parcelable) {
        }

        public String toString() {
        }

        @Override // j.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public h(Parcel parcel, ClassLoader classLoader) {
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
    }

    public static void U(ViewGroup viewGroup, boolean z) {
    }

    public static /* synthetic */ boolean a(TextInputLayout textInputLayout) {
    }

    public static /* synthetic */ boolean b(TextInputLayout textInputLayout) {
    }

    public static void b0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
    }

    public static /* synthetic */ void c(TextInputLayout textInputLayout, int i2) {
    }

    public static void c0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
    }

    public static /* synthetic */ CheckableImageButton d(TextInputLayout textInputLayout) {
    }

    public static void d0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
    }

    private k.d.a.c.p0.e getEndIconDelegate() {
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
    }

    public static void o0(Context context, TextView textView, int i2, int i3, boolean z) {
    }

    private void setEditText(EditText editText) {
    }

    private void setErrorIconVisible(boolean z) {
    }

    private void setHintInternal(CharSequence charSequence) {
    }

    private void setPlaceholderTextEnabled(boolean z) {
    }

    public final boolean A() {
    }

    public final void A0() {
    }

    public final void B() {
    }

    public final void B0(boolean z, boolean z2) {
    }

    public final void C(int i2) {
    }

    public final void C0() {
    }

    public final void D(Canvas canvas) {
    }

    public final void D0() {
    }

    public final void E(Canvas canvas) {
    }

    public void E0() {
    }

    public final void F(boolean z) {
    }

    public final int G(int i2, boolean z) {
    }

    public final int H(int i2, boolean z) {
    }

    public final boolean I() {
    }

    public final void J() {
    }

    public boolean K() {
    }

    public final boolean L() {
    }

    public boolean M() {
    }

    public final boolean N() {
    }

    public boolean O() {
    }

    public final boolean P() {
    }

    public boolean Q() {
    }

    public final int[] R(CheckableImageButton checkableImageButton) {
    }

    public final void S() {
    }

    public final void T() {
    }

    public void V() {
    }

    public void W() {
    }

    public final void X(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
    }

    public void Y() {
    }

    public final void Z() {
    }

    public final void a0() {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
    }

    public void e(f fVar) {
    }

    public void e0(TextView textView, int i2) {
    }

    public void f(g gVar) {
    }

    public final boolean f0() {
    }

    public final void g() {
    }

    public final boolean g0() {
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
    }

    public k.d.a.c.l0.g getBoxBackground() {
    }

    public int getBoxBackgroundColor() {
    }

    public int getBoxBackgroundMode() {
    }

    public float getBoxCornerRadiusBottomEnd() {
    }

    public float getBoxCornerRadiusBottomStart() {
    }

    public float getBoxCornerRadiusTopEnd() {
    }

    public float getBoxCornerRadiusTopStart() {
    }

    public int getBoxStrokeColor() {
    }

    public ColorStateList getBoxStrokeErrorColor() {
    }

    public int getBoxStrokeWidth() {
    }

    public int getBoxStrokeWidthFocused() {
    }

    public int getCounterMaxLength() {
    }

    public CharSequence getCounterOverflowDescription() {
    }

    public ColorStateList getCounterOverflowTextColor() {
    }

    public ColorStateList getCounterTextColor() {
    }

    public ColorStateList getDefaultHintTextColor() {
    }

    public EditText getEditText() {
    }

    public CharSequence getEndIconContentDescription() {
    }

    public Drawable getEndIconDrawable() {
    }

    public int getEndIconMode() {
    }

    public CheckableImageButton getEndIconView() {
    }

    public CharSequence getError() {
    }

    public CharSequence getErrorContentDescription() {
    }

    public int getErrorCurrentTextColors() {
    }

    public Drawable getErrorIconDrawable() {
    }

    public final int getErrorTextCurrentColor() {
    }

    public CharSequence getHelperText() {
    }

    public int getHelperTextCurrentTextColor() {
    }

    public CharSequence getHint() {
    }

    public final float getHintCollapsedTextHeight() {
    }

    public final int getHintCurrentCollapsedTextColor() {
    }

    public ColorStateList getHintTextColor() {
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
    }

    public CharSequence getPlaceholderText() {
    }

    public int getPlaceholderTextAppearance() {
    }

    public ColorStateList getPlaceholderTextColor() {
    }

    public CharSequence getPrefixText() {
    }

    public ColorStateList getPrefixTextColor() {
    }

    public TextView getPrefixTextView() {
    }

    public CharSequence getStartIconContentDescription() {
    }

    public Drawable getStartIconDrawable() {
    }

    public CharSequence getSuffixText() {
    }

    public ColorStateList getSuffixTextColor() {
    }

    public TextView getSuffixTextView() {
    }

    public Typeface getTypeface() {
    }

    public final void h() {
    }

    public final boolean h0() {
    }

    public void i(float f2) {
    }

    public final void i0() {
    }

    public final void j() {
    }

    public final void j0(boolean z) {
    }

    public final void k() {
    }

    public final void k0() {
    }

    public final void l(RectF rectF) {
    }

    public final void l0(Rect rect) {
    }

    public final void m() {
    }

    public final void m0() {
    }

    public final void n(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
    }

    public void n0(int i2) {
    }

    public final void o() {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
    }

    public final void p() {
    }

    public final void p0() {
    }

    public final int q() {
    }

    public final boolean q0() {
    }

    public final Rect r(Rect rect) {
    }

    public void r0() {
    }

    public final int s(Rect rect, Rect rect2, float f2) {
    }

    public final boolean s0() {
    }

    public void setBoxBackgroundColor(int i2) {
    }

    public void setBoxBackgroundColorResource(int i2) {
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
    }

    public void setBoxBackgroundMode(int i2) {
    }

    public void setBoxStrokeColor(int i2) {
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
    }

    public void setBoxStrokeWidth(int i2) {
    }

    public void setBoxStrokeWidthFocused(int i2) {
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
    }

    public void setBoxStrokeWidthResource(int i2) {
    }

    public void setCounterEnabled(boolean z) {
    }

    public void setCounterMaxLength(int i2) {
    }

    public void setCounterOverflowTextAppearance(int i2) {
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
    }

    public void setCounterTextAppearance(int i2) {
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    public void setEndIconActivated(boolean z) {
    }

    public void setEndIconCheckable(boolean z) {
    }

    public void setEndIconContentDescription(int i2) {
    }

    public void setEndIconDrawable(int i2) {
    }

    public void setEndIconMode(int i2) {
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
    }

    public void setEndIconVisible(boolean z) {
    }

    public void setError(CharSequence charSequence) {
    }

    public void setErrorContentDescription(CharSequence charSequence) {
    }

    public void setErrorEnabled(boolean z) {
    }

    public void setErrorIconDrawable(int i2) {
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
    }

    public void setErrorTextAppearance(int i2) {
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
    }

    public void setExpandedHintEnabled(boolean z) {
    }

    public void setHelperText(CharSequence charSequence) {
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
    }

    public void setHelperTextEnabled(boolean z) {
    }

    public void setHelperTextTextAppearance(int i2) {
    }

    public void setHint(CharSequence charSequence) {
    }

    public void setHintAnimationEnabled(boolean z) {
    }

    public void setHintEnabled(boolean z) {
    }

    public void setHintTextAppearance(int i2) {
    }

    public void setHintTextColor(ColorStateList colorStateList) {
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
    }

    public void setPlaceholderText(CharSequence charSequence) {
    }

    public void setPlaceholderTextAppearance(int i2) {
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
    }

    public void setPrefixText(CharSequence charSequence) {
    }

    public void setPrefixTextAppearance(int i2) {
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
    }

    public void setStartIconCheckable(boolean z) {
    }

    public void setStartIconContentDescription(int i2) {
    }

    public void setStartIconDrawable(int i2) {
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
    }

    public void setStartIconVisible(boolean z) {
    }

    public void setSuffixText(CharSequence charSequence) {
    }

    public void setSuffixTextAppearance(int i2) {
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
    }

    public void setTypeface(Typeface typeface) {
    }

    public final int t(Rect rect, float f2) {
    }

    public final void t0() {
    }

    public final Rect u(Rect rect) {
    }

    public void u0(boolean z) {
    }

    public final int v() {
    }

    public final void v0(boolean z, boolean z2) {
    }

    public final boolean w() {
    }

    public final void w0() {
    }

    public final boolean x() {
    }

    public final void x0() {
    }

    public final void y() {
    }

    public final void y0(int i2) {
    }

    public final void z(boolean z) {
    }

    public final void z0() {
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i2) {
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
    }

    public void setEndIconDrawable(Drawable drawable) {
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
    }

    public void setStartIconDrawable(Drawable drawable) {
    }

    public void setErrorIconDrawable(Drawable drawable) {
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
    }

    public void setHint(int i2) {
    }
}
