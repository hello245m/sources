package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = null;
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final Bitmap e;
    public final Uri f;
    public final Bundle g;
    public final Uri h;

    /* renamed from: i, reason: collision with root package name */
    public MediaDescription f63i;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Parcelable.Creator<MediaDescriptionCompat> {
        public MediaDescriptionCompat a(Parcel parcel) {
        }

        public MediaDescriptionCompat[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MediaDescriptionCompat createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MediaDescriptionCompat[] newArray(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b {
        public static MediaDescription a(MediaDescription.Builder builder) {
        }

        public static MediaDescription.Builder b() {
        }

        public static CharSequence c(MediaDescription mediaDescription) {
        }

        public static Bundle d(MediaDescription mediaDescription) {
        }

        public static Bitmap e(MediaDescription mediaDescription) {
        }

        public static Uri f(MediaDescription mediaDescription) {
        }

        public static String g(MediaDescription mediaDescription) {
        }

        public static CharSequence h(MediaDescription mediaDescription) {
        }

        public static CharSequence i(MediaDescription mediaDescription) {
        }

        public static void j(MediaDescription.Builder builder, CharSequence charSequence) {
        }

        public static void k(MediaDescription.Builder builder, Bundle bundle) {
        }

        public static void l(MediaDescription.Builder builder, Bitmap bitmap) {
        }

        public static void m(MediaDescription.Builder builder, Uri uri) {
        }

        public static void n(MediaDescription.Builder builder, String str) {
        }

        public static void o(MediaDescription.Builder builder, CharSequence charSequence) {
        }

        public static void p(MediaDescription.Builder builder, CharSequence charSequence) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c {
        public static Uri a(MediaDescription mediaDescription) {
        }

        public static void b(MediaDescription.Builder builder, Uri uri) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class d {
        public String a;
        public CharSequence b;
        public CharSequence c;
        public CharSequence d;
        public Bitmap e;
        public Uri f;
        public Bundle g;
        public Uri h;

        public MediaDescriptionCompat a() {
        }

        public d b(CharSequence charSequence) {
        }

        public d c(Bundle bundle) {
        }

        public d d(Bitmap bitmap) {
        }

        public d e(Uri uri) {
        }

        public d f(String str) {
        }

        public d g(Uri uri) {
        }

        public d h(CharSequence charSequence) {
        }

        public d i(CharSequence charSequence) {
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
    }

    public static MediaDescriptionCompat a(Object obj) {
    }

    public Object d() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String e() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public MediaDescriptionCompat(Parcel parcel) {
    }
}
