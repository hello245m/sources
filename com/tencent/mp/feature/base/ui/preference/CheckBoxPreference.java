package com.tencent.mp.feature.base.ui.preference;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.mp.feature.base.ui.widget.MMSwitchBtn;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class CheckBoxPreference extends Preference {
    public boolean a;
    public MMSwitchBtn b;
    public TextView c;
    public TextView d;
    public int e;
    public String f;
    public int g;
    public TextView h;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a implements MMSwitchBtn.b {
        public final /* synthetic */ CheckBoxPreference a;

        public a(CheckBoxPreference checkBoxPreference) {
        }

        @Override // com.tencent.mp.feature.base.ui.widget.MMSwitchBtn.b
        public void a(boolean z) {
        }
    }

    public CheckBoxPreference(Context context) {
    }

    public static /* synthetic */ boolean a(CheckBoxPreference checkBoxPreference, Object obj) {
    }

    public void b(String str, int i2) {
    }

    public void c(int i2) {
    }

    @Override // android.preference.Preference
    public void onBindView(View view) {
    }

    @Override // android.preference.Preference
    public void setEnabled(boolean z) {
    }

    @Override // android.preference.Preference
    public void setSummary(int i2) {
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
    }

    @Override // android.preference.Preference
    public void setSummary(CharSequence charSequence) {
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i2) {
    }
}
