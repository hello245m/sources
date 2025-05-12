package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import j.q.l;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class DropDownPreference extends ListPreference {
    public final Context a;
    public final ArrayAdapter b;
    public Spinner c;
    public final AdapterView.OnItemSelectedListener d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ DropDownPreference a;

        public a(DropDownPreference dropDownPreference) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
    }

    public ArrayAdapter a() {
    }

    public int b(String str) {
    }

    public final void c() {
    }

    @Override // androidx.preference.Preference
    public void notifyChanged() {
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(l lVar) {
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void onClick() {
    }

    @Override // androidx.preference.ListPreference
    public void setEntries(CharSequence[] charSequenceArr) {
    }

    @Override // androidx.preference.ListPreference
    public void setValueIndex(int i2) {
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i2) {
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
    }
}
