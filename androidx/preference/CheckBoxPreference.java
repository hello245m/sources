package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import j.q.l;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final a a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ CheckBoxPreference a;

        public a(CheckBoxPreference checkBoxPreference) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i2) {
    }

    public final void a(View view) {
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(l lVar) {
    }

    @Override // androidx.preference.Preference
    public void performClick(View view) {
    }

    public final void syncViewIfAccessibilityEnabled(View view) {
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
    }
}
