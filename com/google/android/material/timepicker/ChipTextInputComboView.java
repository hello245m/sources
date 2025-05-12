package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import k.d.a.c.f0.k;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {
    public final Chip a;
    public final TextInputLayout b;
    public final EditText c;
    public TextWatcher d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends k {
        public final /* synthetic */ ChipTextInputComboView a;

        public b(ChipTextInputComboView chipTextInputComboView) {
        }

        @Override // k.d.a.c.f0.k, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        public /* synthetic */ b(ChipTextInputComboView chipTextInputComboView, a aVar) {
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
    }

    public static /* synthetic */ Chip b(ChipTextInputComboView chipTextInputComboView) {
    }

    public final String c(CharSequence charSequence) {
    }

    public final void d() {
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
    }

    @Override // android.widget.Checkable
    public void toggle() {
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i2) {
    }
}
