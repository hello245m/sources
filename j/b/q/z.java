package j.b.q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import j.g.r.d;
import java.util.concurrent.Future;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class z extends TextView implements j.g.t.e0, j.g.u.l, j.g.u.b {
    public final e a;
    public final y b;
    public final x c;
    public boolean d;
    public Future<j.g.r.d> e;

    public z(Context context) {
    }

    public final void c() {
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
    }

    @Override // j.g.t.e0
    public ColorStateList getSupportBackgroundTintList() {
    }

    @Override // j.g.t.e0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
    }

    public d.a getTextMetricsParamsCompat() {
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) throws IllegalArgumentException {
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
    }

    public void setPrecomputedText(j.g.r.d dVar) {
    }

    @Override // j.g.t.e0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // j.g.t.e0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
    }

    @Override // j.g.u.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
    }

    @Override // j.g.u.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
    }

    public void setTextFuture(Future<j.g.r.d> future) {
    }

    public void setTextMetricsParamsCompat(d.a aVar) {
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f) {
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i2) {
    }

    public z(Context context, AttributeSet attributeSet) {
    }

    public z(Context context, AttributeSet attributeSet, int i2) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
    }
}
