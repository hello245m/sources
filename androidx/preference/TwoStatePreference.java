package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import j.q.l;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean mChecked;
    private boolean mCheckedSet;
    private boolean mDisableDependentsState;
    private CharSequence mSummaryOff;
    private CharSequence mSummaryOn;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i2, int i3) {
    }

    public boolean getDisableDependentsState() {
    }

    public CharSequence getSummaryOff() {
    }

    public CharSequence getSummaryOn() {
    }

    public boolean isChecked() {
    }

    @Override // androidx.preference.Preference
    public void onClick() {
    }

    @Override // androidx.preference.Preference
    public Object onGetDefaultValue(TypedArray typedArray, int i2) {
    }

    @Override // androidx.preference.Preference
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.preference.Preference
    public Parcelable onSaveInstanceState() {
    }

    @Override // androidx.preference.Preference
    public void onSetInitialValue(Object obj) {
    }

    public void setChecked(boolean z) {
    }

    public void setDisableDependentsState(boolean z) {
    }

    public void setSummaryOff(CharSequence charSequence) {
    }

    public void setSummaryOn(CharSequence charSequence) {
    }

    @Override // androidx.preference.Preference
    public boolean shouldDisableDependents() {
    }

    public void syncSummaryView(l lVar) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = null;
        public boolean a;

        /* renamed from: androidx.preference.TwoStatePreference$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class C0005a implements Parcelable.Creator<a> {
            public a a(Parcel parcel) {
            }

            public a[] b(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ a createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ a[] newArray(int i2) {
            }
        }

        public a(Parcel parcel) {
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public a(Parcelable parcelable) {
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i2) {
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
    }

    public void syncSummaryView(View view) {
    }

    public TwoStatePreference(Context context) {
    }

    public void setSummaryOff(int i2) {
    }

    public void setSummaryOn(int i2) {
    }
}
