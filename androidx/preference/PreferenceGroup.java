package androidx.preference;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import j.d.g;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class PreferenceGroup extends Preference {
    public List<Preference> a;
    public boolean b;
    public int c;
    public boolean d;
    public int e;
    public a f;
    public final g<String, Long> g;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface a {
        void a();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b {
        int g(Preference preference);

        int j(String str);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i2, int i3) {
    }

    public void a(Preference preference) {
    }

    public boolean b(Preference preference) {
    }

    public Preference c(CharSequence charSequence) {
    }

    public int d() {
    }

    @Override // androidx.preference.Preference
    public void dispatchRestoreInstanceState(Bundle bundle) {
    }

    @Override // androidx.preference.Preference
    public void dispatchSaveInstanceState(Bundle bundle) {
    }

    public a e() {
    }

    public Preference f(int i2) {
    }

    public int g() {
    }

    public boolean h() {
    }

    public boolean i(Preference preference) {
    }

    public void j(int i2) {
    }

    public void k(boolean z) {
    }

    public void l() {
    }

    @Override // androidx.preference.Preference
    public void notifyDependencyChange(boolean z) {
    }

    @Override // androidx.preference.Preference
    public void onAttached() {
    }

    @Override // androidx.preference.Preference
    public void onDetached() {
    }

    @Override // androidx.preference.Preference
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.preference.Preference
    public Parcelable onSaveInstanceState() {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c extends Preference.b {
        public static final Parcelable.Creator<c> CREATOR = null;
        public int a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class a implements Parcelable.Creator<c> {
            public c a(Parcel parcel) {
            }

            public c[] b(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ c createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ c[] newArray(int i2) {
            }
        }

        public c(Parcel parcel) {
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public c(Parcelable parcelable, int i2) {
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i2) {
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
    }
}
