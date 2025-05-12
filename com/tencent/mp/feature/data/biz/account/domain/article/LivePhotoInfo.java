package com.tencent.mp.feature.data.biz.account.domain.article;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import n.d0.d.h;
import q.b5;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class LivePhotoInfo implements Parcelable {
    public static final Parcelable.Creator<LivePhotoInfo> CREATOR = null;
    public static final a Companion = null;
    public static final int TYPE_IOS_LIVE = 1;
    public static final int TYPE_VIDEO = 2;
    private final boolean isLivePhoto;
    private final int type;
    private final String vid;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
        }

        public final LivePhotoInfo a(b5 b5Var) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b implements Parcelable.Creator<LivePhotoInfo> {
        public final LivePhotoInfo a(Parcel parcel) {
        }

        public final LivePhotoInfo[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LivePhotoInfo createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LivePhotoInfo[] newArray(int i2) {
        }
    }

    public LivePhotoInfo(boolean z, String str, int i2) {
    }

    public static /* synthetic */ LivePhotoInfo copy$default(LivePhotoInfo livePhotoInfo, boolean z, String str, int i2, int i3, Object obj) {
    }

    public final boolean component1() {
    }

    public final String component2() {
    }

    public final int component3() {
    }

    public final LivePhotoInfo copy(boolean z, String str, int i2) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final int getType() {
    }

    public final String getVid() {
    }

    public int hashCode() {
    }

    public final boolean isLivePhoto() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }
}
