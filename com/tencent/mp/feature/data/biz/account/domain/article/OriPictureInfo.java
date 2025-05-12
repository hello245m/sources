package com.tencent.mp.feature.data.biz.account.domain.article;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import n.d0.d.h;
import q.u4;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class OriPictureInfo implements Parcelable {
    public static final Parcelable.Creator<OriPictureInfo> CREATOR = null;
    public static final a Companion = null;
    private final String cdnUrl;
    private final CoverCropList cropList;
    private final String cropRatio;
    private final int fileId;
    private final int height;
    private final int width;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
        }

        public final OriPictureInfo a(u4 u4Var) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b implements Parcelable.Creator<OriPictureInfo> {
        public final OriPictureInfo a(Parcel parcel) {
        }

        public final OriPictureInfo[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OriPictureInfo createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OriPictureInfo[] newArray(int i2) {
        }
    }

    public OriPictureInfo(int i2, String str, int i3, int i4, String str2, CoverCropList coverCropList) {
    }

    public static /* synthetic */ OriPictureInfo copy$default(OriPictureInfo oriPictureInfo, int i2, String str, int i3, int i4, String str2, CoverCropList coverCropList, int i5, Object obj) {
    }

    public final int component1() {
    }

    public final String component2() {
    }

    public final int component3() {
    }

    public final int component4() {
    }

    public final String component5() {
    }

    public final CoverCropList component6() {
    }

    public final OriPictureInfo copy(int i2, String str, int i3, int i4, String str2, CoverCropList coverCropList) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final String getCdnUrl() {
    }

    public final CoverCropList getCropList() {
    }

    public final String getCropRatio() {
    }

    public final int getFileId() {
    }

    public final int getHeight() {
    }

    public final int getWidth() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }
}
