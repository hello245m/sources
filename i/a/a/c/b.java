package i.a.a.c;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import i.a.a.c.a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = null;
    public final boolean a;
    public final Handler b;
    public i.a.a.c.a c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Parcelable.Creator<b> {
        public b a(Parcel parcel) {
        }

        public b[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ b createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ b[] newArray(int i2) {
        }
    }

    /* renamed from: i.a.a.c.b$b, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class BinderC0107b extends a.AbstractBinderC0105a {
        public final /* synthetic */ b a;

        public BinderC0107b(b bVar) {
        }

        @Override // i.a.a.c.a
        public void p(int i2, Bundle bundle) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements Runnable {
        public final int a;
        public final Bundle b;
        public final /* synthetic */ b c;

        public c(b bVar, int i2, Bundle bundle) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public b(Parcel parcel) {
    }

    public void a(int i2, Bundle bundle) {
    }

    public void d(int i2, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }
}
