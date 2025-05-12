package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import j.q.l;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final a mListener;
    private CharSequence mSwitchOff;
    private CharSequence mSwitchOn;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ SwitchPreferenceCompat a;

        public a(SwitchPreferenceCompat switchPreferenceCompat) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i2, int i3) {
    }

    private void syncSwitchView(View view) {
    }

    private void syncViewIfAccessibilityEnabled(View view) {
    }

    public CharSequence getSwitchTextOff() {
    }

    public CharSequence getSwitchTextOn() {
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

    public void setSwitchTextOff(int i2) {
    }

    public void setSwitchTextOn(int i2) {
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i2) {
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
    }

    public SwitchPreferenceCompat(Context context) {
    }
}
