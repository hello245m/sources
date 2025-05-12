package androidx.preference.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;
import java.util.Set;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class AbstractMultiSelectListPreference extends DialogPreference {
    public AbstractMultiSelectListPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
    }

    public abstract Set<String> a();

    public abstract void b(Set<String> set);

    public abstract CharSequence[] getEntries();

    public abstract CharSequence[] getEntryValues();

    public AbstractMultiSelectListPreference(Context context, AttributeSet attributeSet) {
    }
}
