package com.tencent.mp.feature.data.biz.account.domain.article;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class CoverCropPercent implements Parcelable {
    public static final Parcelable.Creator<CoverCropPercent> CREATOR = null;
    private final String ratio;
    private final float x1;
    private final float x2;
    private final float y1;
    private final float y2;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a implements Parcelable.Creator<CoverCropPercent> {
        public final CoverCropPercent a(Parcel parcel) {
        }

        public final CoverCropPercent[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CoverCropPercent createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CoverCropPercent[] newArray(int i2) {
        }
    }

    public CoverCropPercent(String str, float f, float f2, float f3, float f4) {
    }

    public static /* synthetic */ CoverCropPercent copy$default(CoverCropPercent coverCropPercent, String str, float f, float f2, float f3, float f4, int i2, Object obj) {
    }

    public final String component1() {
    }

    public final float component2() {
    }

    public final float component3() {
    }

    public final float component4() {
    }

    public final float component5() {
    }

    public final CoverCropPercent copy(String str, float f, float f2, float f3, float f4) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final String getRatio() {
    }

    public final float getX1() {
    }

    public final float getX2() {
    }

    public final float getY1() {
    }

    public final float getY2() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }
}
