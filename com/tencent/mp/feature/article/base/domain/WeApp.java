package com.tencent.mp.feature.article.base.domain;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.tencent.mp.feature.data.biz.account.domain.article.WxaData;
import n.d0.d.h;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class WeApp {
    public static final a Companion = null;
    private final String appid;

    @SerializedName("has_guarantee_flag")
    private final long has_guarantee_flag;

    @SerializedName("headimg_url")
    private final String headImgUrl;

    @SerializedName("main_page")
    private final String mainPage;
    private final String nickname;
    private final int released;

    @SerializedName("service_type")
    private final int serviceType;
    private final String username;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
        }

        public final WxaData a(WeApp weApp) {
        }
    }

    public WeApp() {
    }

    public WeApp(String str, long j2, String str2, String str3, int i2, int i3, String str4, String str5) {
    }

    public static /* synthetic */ WeApp copy$default(WeApp weApp, String str, long j2, String str2, String str3, int i2, int i3, String str4, String str5, int i4, Object obj) {
    }

    public final String component1() {
    }

    public final long component2() {
    }

    public final String component3() {
    }

    public final String component4() {
    }

    public final int component5() {
    }

    public final int component6() {
    }

    public final String component7() {
    }

    public final String component8() {
    }

    public final WeApp copy(String str, long j2, String str2, String str3, int i2, int i3, String str4, String str5) {
    }

    public boolean equals(Object obj) {
    }

    public final String getAppid() {
    }

    public final long getHas_guarantee_flag() {
    }

    public final String getHeadImgUrl() {
    }

    public final String getMainPage() {
    }

    public final String getNickname() {
    }

    public final int getReleased() {
    }

    public final int getServiceType() {
    }

    public final String getUsername() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    public /* synthetic */ WeApp(String str, long j2, String str2, String str3, int i2, int i3, String str4, String str5, int i4, h hVar) {
    }
}
