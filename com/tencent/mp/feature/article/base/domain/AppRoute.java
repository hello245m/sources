package com.tencent.mp.feature.article.base.domain;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class AppRoute<T> {

    @SerializedName("action")
    private final String action;

    @SerializedName("cgi_name")
    private final String cgiName;

    @SerializedName("form_data")
    private final T formData;

    @SerializedName("request_method")
    private final String requestMethod;

    public AppRoute(String str, T t2, String str2, String str3) {
    }

    public static /* synthetic */ AppRoute copy$default(AppRoute appRoute, String str, Object obj, String str2, String str3, int i2, Object obj2) {
    }

    public final String component1() {
    }

    public final T component2() {
    }

    public final String component3() {
    }

    public final String component4() {
    }

    public final AppRoute<T> copy(String str, T t2, String str2, String str3) {
    }

    public boolean equals(Object obj) {
    }

    public final String getAction() {
    }

    public final String getCgiName() {
    }

    public final T getFormData() {
    }

    public final String getRequestMethod() {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
