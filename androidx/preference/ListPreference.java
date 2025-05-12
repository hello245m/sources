package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ListPreference extends DialogPreference {
    private CharSequence[] mEntries;
    private CharSequence[] mEntryValues;
    private String mSummary;
    private String mValue;
    private boolean mValueSet;

    public ListPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
    }

    private int getValueIndex() {
    }

    public int findIndexOfValue(String str) {
    }

    public CharSequence[] getEntries() {
    }

    public CharSequence getEntry() {
    }

    public CharSequence[] getEntryValues() {
    }

    @Override // androidx.preference.Preference
    public CharSequence getSummary() {
    }

    public String getValue() {
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

    public void setEntries(CharSequence[] charSequenceArr) {
    }

    public void setEntryValues(CharSequence[] charSequenceArr) {
    }

    @Override // androidx.preference.Preference
    public void setSummary(CharSequence charSequence) {
    }

    public void setValue(String str) {
    }

    public void setValueIndex(int i2) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = null;
        public String a;

        /* renamed from: androidx.preference.ListPreference$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class C0003a implements Parcelable.Creator<a> {
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

    public void setEntries(int i2) {
    }

    public void setEntryValues(int i2) {
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i2) {
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
    }

    public ListPreference(Context context) {
    }
}
