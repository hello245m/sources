package com.tencent.bugly.common.meta;

import android.content.SharedPreferences;
import com.tencent.bugly.common.reporter.builder.UniqueIDHelper;
import n.d0.d.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class UserMeta {
    public String appId;
    public String appKey;
    public String appVersion;
    public String appVersionMode;
    public String buildNumber;
    public String model;
    public String sdkVersion;
    public SharedPreferences sharePreference;
    public String uin;
    private String uniqueID;
    private final UniqueIDHelper uniqueIDHelper;

    public UserMeta() {
    }

    public UserMeta(String str, String str2, String str3, String str4, String str5, SharedPreferences sharedPreferences, String str6, String str7, String str8) {
    }

    public static /* synthetic */ UserMeta copy$default(UserMeta userMeta, String str, String str2, String str3, String str4, String str5, SharedPreferences sharedPreferences, String str6, String str7, String str8, int i2, Object obj) {
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

    public final SharedPreferences component6() {
    }

    public final String component7() {
    }

    public final String component8() {
    }

    public final String component9() {
    }

    public final UserMeta copy(String str, String str2, String str3, String str4, String str5, SharedPreferences sharedPreferences, String str6, String str7, String str8) {
    }

    public boolean equals(Object obj) {
    }

    public final String getUniqueID() {
    }

    public int hashCode() {
    }

    public final void setUniqueID(String str) {
    }

    public final String toJSON() {
    }

    public String toString() {
    }

    public /* synthetic */ UserMeta(String str, String str2, String str3, String str4, String str5, SharedPreferences sharedPreferences, String str6, String str7, String str8, int i2, h hVar) {
    }
}
