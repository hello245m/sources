package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = null;
    public final int a;
    public final long b;
    public final long c;
    public final float d;
    public final long e;
    public final int f;
    public final CharSequence g;
    public final long h;

    /* renamed from: i, reason: collision with root package name */
    public List<CustomAction> f64i;

    /* renamed from: j, reason: collision with root package name */
    public final long f65j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f66k;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Parcelable.Creator<PlaybackStateCompat> {
        public PlaybackStateCompat a(Parcel parcel) {
        }

        public PlaybackStateCompat[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PlaybackStateCompat createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PlaybackStateCompat[] newArray(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b {
        public static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
        }

        public static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
        }

        public static PlaybackState c(PlaybackState.Builder builder) {
        }

        public static PlaybackState.Builder d() {
        }

        public static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i2) {
        }

        public static String f(PlaybackState.CustomAction customAction) {
        }

        public static long g(PlaybackState playbackState) {
        }

        public static long h(PlaybackState playbackState) {
        }

        public static long i(PlaybackState playbackState) {
        }

        public static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
        }

        public static CharSequence k(PlaybackState playbackState) {
        }

        public static Bundle l(PlaybackState.CustomAction customAction) {
        }

        public static int m(PlaybackState.CustomAction customAction) {
        }

        public static long n(PlaybackState playbackState) {
        }

        public static CharSequence o(PlaybackState.CustomAction customAction) {
        }

        public static float p(PlaybackState playbackState) {
        }

        public static long q(PlaybackState playbackState) {
        }

        public static int r(PlaybackState playbackState) {
        }

        public static void s(PlaybackState.Builder builder, long j2) {
        }

        public static void t(PlaybackState.Builder builder, long j2) {
        }

        public static void u(PlaybackState.Builder builder, long j2) {
        }

        public static void v(PlaybackState.Builder builder, CharSequence charSequence) {
        }

        public static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
        }

        public static void x(PlaybackState.Builder builder, int i2, long j2, float f, long j3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c {
        public static Bundle a(PlaybackState playbackState) {
        }

        public static void b(PlaybackState.Builder builder, Bundle bundle) {
        }
    }

    public PlaybackStateCompat(int i2, long j2, long j3, float f, long j4, int i3, CharSequence charSequence, long j5, List<CustomAction> list, long j6, Bundle bundle) {
    }

    public static PlaybackStateCompat a(Object obj) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = null;
        public final String a;
        public final CharSequence b;
        public final int c;
        public final Bundle d;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Parcelable.Creator<CustomAction> {
            public CustomAction a(Parcel parcel) {
            }

            public CustomAction[] b(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ CustomAction createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ CustomAction[] newArray(int i2) {
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i2, Bundle bundle) {
        }

        public static CustomAction a(Object obj) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public String toString() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public CustomAction(Parcel parcel) {
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
    }
}
