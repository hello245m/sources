package com.tencent.mp.feature.data.biz.account.domain.article;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;
import n.d0.d.h;
import q.c5;
import q.g5;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class PoiData implements Parcelable {
    public static final Parcelable.Creator<PoiData> CREATOR = null;
    public static final a Companion = null;
    private final String address;
    private final String city;
    private final String content;
    private final String districtid;
    private final String img;
    private final String latitude;
    private final String longitude;
    private final String name;
    private final String poiId;
    private final int poiType;
    private final String province;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
        }

        public final PoiData a(g5 g5Var, String str, String str2, String str3) {
        }

        public final List<PoiData> b(List<c5> list) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b implements Parcelable.Creator<PoiData> {
        public final PoiData a(Parcel parcel) {
        }

        public final PoiData[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PoiData createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PoiData[] newArray(int i2) {
        }
    }

    public PoiData(String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
    }

    public static /* synthetic */ PoiData copy$default(PoiData poiData, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i3, Object obj) {
    }

    public final String component1() {
    }

    public final String component10() {
    }

    public final String component11() {
    }

    public final int component2() {
    }

    public final String component3() {
    }

    public final String component4() {
    }

    public final String component5() {
    }

    public final String component6() {
    }

    public final String component7() {
    }

    public final String component8() {
    }

    public final String component9() {
    }

    public final PoiData copy(String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final String getAddress() {
    }

    public final String getCity() {
    }

    public final String getContent() {
    }

    public final String getDistrictid() {
    }

    public final String getImg() {
    }

    public final String getLatitude() {
    }

    public final String getLongitude() {
    }

    public final String getName() {
    }

    public final String getPoiId() {
    }

    public final int getPoiType() {
    }

    public final String getProvince() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public /* synthetic */ PoiData(String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i3, h hVar) {
    }
}
