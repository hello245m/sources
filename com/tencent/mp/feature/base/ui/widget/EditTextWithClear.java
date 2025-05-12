package com.tencent.mp.feature.base.ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class EditTextWithClear extends MMEditText {
    public final Drawable e;
    public boolean f;
    public boolean g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f1360i;

    /* renamed from: j, reason: collision with root package name */
    public View.OnFocusChangeListener f1361j;

    /* renamed from: k, reason: collision with root package name */
    public View.OnTouchListener f1362k;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a implements View.OnTouchListener {
        public final /* synthetic */ EditTextWithClear a;

        public a(EditTextWithClear editTextWithClear) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class b implements TextWatcher {
        public final /* synthetic */ EditTextWithClear a;

        public b(EditTextWithClear editTextWithClear) {
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

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class c implements View.OnFocusChangeListener {
        public final /* synthetic */ EditTextWithClear a;

        public c(EditTextWithClear editTextWithClear) {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    public EditTextWithClear(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ int l(EditTextWithClear editTextWithClear) {
    }

    public static /* synthetic */ void m(EditTextWithClear editTextWithClear) {
    }

    public static /* synthetic */ void n(EditTextWithClear editTextWithClear) {
    }

    public static /* synthetic */ View.OnFocusChangeListener o(EditTextWithClear editTextWithClear) {
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public final void p() {
    }

    public final void q(Context context) {
    }

    public final void r() {
    }

    public final void s() {
    }

    public void setEnableClear(boolean z) {
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
    }
}
