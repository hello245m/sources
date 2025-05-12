package k.d.a.a.m4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class v implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<v> CREATOR = null;
    public final b[] a;
    public int b;
    public final String c;
    public final int d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Parcelable.Creator<v> {
        public v a(Parcel parcel) {
        }

        public v[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ v createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ v[] newArray(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = null;
        public int a;
        public final UUID b;
        public final String c;
        public final String d;
        public final byte[] e;

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

        public b(UUID uuid, String str, byte[] bArr) {
        }

        public boolean a(b bVar) {
        }

        public b d(byte[] bArr) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public boolean e() {
        }

        public boolean equals(Object obj) {
        }

        public boolean f(UUID uuid) {
        }

        public int hashCode() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
        }

        public b(Parcel parcel) {
        }
    }

    public v(List<b> list) {
    }

    public static boolean d(ArrayList<b> arrayList, int i2, UUID uuid) {
    }

    public static v f(v vVar, v vVar2) {
    }

    public int a(b bVar, b bVar2) {
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(b bVar, b bVar2) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public v e(String str) {
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
    }

    public b h(int i2) {
    }

    public int hashCode() {
    }

    public v i(v vVar) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public v(String str, List<b> list) {
    }

    public v(b... bVarArr) {
    }

    public v(String str, b... bVarArr) {
    }

    public v(String str, boolean z, b... bVarArr) {
    }

    public v(Parcel parcel) {
    }
}
