package com.tencent.mp.feature.base.ui.widget;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class SearchViewBar extends LinearLayout {
    public final EditText a;
    public final TextView b;
    public b c;
    public boolean d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a implements TextWatcher {
        public final /* synthetic */ SearchViewBar a;

        public a(SearchViewBar searchViewBar) {
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
    public interface b {
        void a(String str);

        void b(String str);

        void onCancel();
    }

    public SearchViewBar(Context context, AttributeSet attributeSet) {
    }

    public static final boolean a(SearchViewBar searchViewBar, Context context, TextView textView, int i2, KeyEvent keyEvent) {
    }

    public static final void b(SearchViewBar searchViewBar, View view) {
    }

    public static final /* synthetic */ b c(SearchViewBar searchViewBar) {
    }

    public static /* synthetic */ void d(SearchViewBar searchViewBar, View view) {
    }

    public static /* synthetic */ void e(SearchViewBar searchViewBar) {
    }

    public static /* synthetic */ boolean f(SearchViewBar searchViewBar, Context context, TextView textView, int i2, KeyEvent keyEvent) {
    }

    public static final void g(SearchViewBar searchViewBar) {
    }

    public final boolean getAutoFocus() {
    }

    public final EditText getEditText() {
    }

    public final String getText() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    public final void setAutoFocus(boolean z) {
    }

    public final void setHint(String str) {
    }

    public void setOnSearchActionListener(b bVar) {
    }
}
