package com.tencent.mp.feature.data.biz.account.domain.article;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;
import n.d0.d.h;
import q.e5;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class WxaData implements Parcelable {
    public static final Parcelable.Creator<WxaData> CREATOR = null;
    public static final a Companion = null;
    private final String appId;
    private final String content;
    private final String headImgUrl;
    private final String mainPage;
    private final String miniProgramType;
    private final String nickName;
    private final String path;
    private final int serviceType;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
        }

        public final List<WxaData> a(List<e5> list) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b implements Parcelable.Creator<WxaData> {
        public final WxaData a(Parcel parcel) {
        }

        public final WxaData[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ WxaData createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ WxaData[] newArray(int i2) {
        }
    }

    public WxaData(String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7) {
    }

    public static /* synthetic */ WxaData copy$default(WxaData wxaData, String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7, int i3, Object obj) {
    }

    public final String component1() {
    }

    public final String component2() {
    }

    public final String component3() {
    }

    public final String component4() {
    }

    public final String component5() {
    }

    public final int component6() {
    }

    public final String component7() {
    }

    public final String component8() {
    }

    public final WxaData copy(String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final String getAppId() {
    }

    public final String getContent() {
    }

    public final String getHeadImgUrl() {
    }

    public final String getMainPage() {
    }

    public final String getMiniProgramType() {
    }

    public final String getNickName() {
    }

    public final String getPath() {
    }

    public final int getServiceType() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public /* synthetic */ WxaData(String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7, int i3, h hVar) {
    }
}
