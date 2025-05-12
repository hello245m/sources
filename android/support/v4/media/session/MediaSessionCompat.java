package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import i.a.a.b.a.b;
import j.y.d;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class MediaSessionCompat {

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = null;
        public ResultReceiver a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Parcelable.Creator<ResultReceiverWrapper> {
            public ResultReceiverWrapper a(Parcel parcel) {
            }

            public ResultReceiverWrapper[] b(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ ResultReceiverWrapper createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ ResultReceiverWrapper[] newArray(int i2) {
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = null;
        public final Object a;
        public final Object b;
        public b c;
        public d d;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Parcelable.Creator<Token> {
            public Token a(Parcel parcel) {
            }

            public Token[] b(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Token createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Token[] newArray(int i2) {
            }
        }

        public Token(Object obj) {
        }

        public static Token a(Object obj) {
        }

        public static Token d(Object obj, b bVar) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public b e() {
        }

        public boolean equals(Object obj) {
        }

        public Object f() {
        }

        public void h(b bVar) {
        }

        public int hashCode() {
        }

        public void i(d dVar) {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public Token(Object obj, b bVar) {
        }

        public Token(Object obj, b bVar, d dVar) {
        }
    }

    public static void a(Bundle bundle) {
    }

    public static Bundle b(Bundle bundle) {
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = null;
        public final MediaDescriptionCompat a;
        public final long b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Parcelable.Creator<QueueItem> {
            public QueueItem a(Parcel parcel) {
            }

            public QueueItem[] b(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ QueueItem createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ QueueItem[] newArray(int i2) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class b {
            public static MediaSession.QueueItem a(MediaDescription mediaDescription, long j2) {
            }

            public static MediaDescription b(MediaSession.QueueItem queueItem) {
            }

            public static long c(MediaSession.QueueItem queueItem) {
            }
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j2) {
        }

        public static QueueItem a(Object obj) {
        }

        public static List<QueueItem> d(List<?> list) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public String toString() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public QueueItem(Parcel parcel) {
        }
    }
}
