package t.a.a;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import pl.droidsonroids.gif.GifInfoHandle;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public class b implements Serializable, Parcelable {
    public static final Parcelable.Creator<b> CREATOR = null;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final long g;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
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

    public /* synthetic */ b(Parcel parcel, a aVar) {
    }

    public int a() {
    }

    public boolean d() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getHeight() {
    }

    public int getWidth() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public b(ByteBuffer byteBuffer) throws IOException {
    }

    public b(ContentResolver contentResolver, Uri uri) throws IOException {
    }

    public b(GifInfoHandle gifInfoHandle) {
    }

    public b(Parcel parcel) {
    }
}
