package com.google.android.material.textfield;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import j.b.q.k;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class TextInputEditText extends k {
    public final Rect e;
    public boolean f;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
    }

    private CharSequence getHintFromLayout() {
    }

    private TextInputLayout getTextInputLayout() {
    }

    public final String b(TextInputLayout textInputLayout) {
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // j.b.q.k, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i2) {
    }
}
