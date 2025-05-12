package j.a.h;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = null;
    public final IntentSender a;
    public final Intent b;
    public final int c;
    public final int d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Parcelable.Creator<e> {
        public e a(Parcel parcel) {
        }

        public e[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ e createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ e[] newArray(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b {
        public IntentSender a;
        public Intent b;
        public int c;
        public int d;

        public b(IntentSender intentSender) {
        }

        public e a() {
        }

        public b b(Intent intent) {
        }

        public b c(int i2, int i3) {
        }
    }

    public e(IntentSender intentSender, Intent intent, int i2, int i3) {
    }

    public Intent a() {
    }

    public int d() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int e() {
    }

    public IntentSender f() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public e(Parcel parcel) {
    }
}
