package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import j.q.l;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class SeekBarPreference extends Preference {
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public SeekBar f;
    public TextView g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f257i;

    /* renamed from: j, reason: collision with root package name */
    public SeekBar.OnSeekBarChangeListener f258j;

    /* renamed from: k, reason: collision with root package name */
    public View.OnKeyListener f259k;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ SeekBarPreference a;

        public a(SeekBarPreference seekBarPreference) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements View.OnKeyListener {
        public final /* synthetic */ SeekBarPreference a;

        public b(SeekBarPreference seekBarPreference) {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
    }

    public final void a(int i2) {
    }

    public final void b(int i2) {
    }

    public void c(int i2) {
    }

    public final void d(int i2, boolean z) {
    }

    public void e(SeekBar seekBar) {
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(l lVar) {
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

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c extends Preference.b {
        public static final Parcelable.Creator<c> CREATOR = null;
        public int a;
        public int b;
        public int c;

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

        public c(Parcelable parcelable) {
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i2) {
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
    }
}
