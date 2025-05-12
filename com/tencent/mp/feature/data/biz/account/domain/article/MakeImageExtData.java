package com.tencent.mp.feature.data.biz.account.domain.article;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import n.d0.d.h;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class MakeImageExtData implements Parcelable {
    public static final Parcelable.Creator<MakeImageExtData> CREATOR = null;
    private final String picConfig;
    private final String picText;
    private final int picType;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a implements Parcelable.Creator<MakeImageExtData> {
        public final MakeImageExtData a(Parcel parcel) {
        }

        public final MakeImageExtData[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MakeImageExtData createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MakeImageExtData[] newArray(int i2) {
        }
    }

    public MakeImageExtData() {
    }

    public MakeImageExtData(int i2, String str, String str2) {
    }

    public static /* synthetic */ MakeImageExtData copy$default(MakeImageExtData makeImageExtData, int i2, String str, String str2, int i3, Object obj) {
    }

    public final int component1() {
    }

    public final String component2() {
    }

    public final String component3() {
    }

    public final MakeImageExtData copy(int i2, String str, String str2) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final String getPicConfig() {
    }

    public final String getPicText() {
    }

    public final int getPicType() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public /* synthetic */ MakeImageExtData(int i2, String str, String str2, int i3, h hVar) {
    }
}
