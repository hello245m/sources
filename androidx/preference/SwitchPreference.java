package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import j.q.l;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class SwitchPreference extends TwoStatePreference {
    public final a a;
    public CharSequence b;
    public CharSequence c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ SwitchPreference a;

        public a(SwitchPreference switchPreference) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(l lVar) {
    }

    @Override // androidx.preference.Preference
    public void performClick(View view) {
    }

    public void setSwitchTextOff(CharSequence charSequence) {
    }

    public void setSwitchTextOn(CharSequence charSequence) {
    }

    public final void syncSwitchView(View view) {
    }

    public final void syncViewIfAccessibilityEnabled(View view) {
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i2) {
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
    }
}
