package com.tencent.mp.feature.article.base.domain;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.heytap.mcssdk.constant.b;
import n.d0.d.h;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class BaseResp<T> {
    private final T data;

    @SerializedName("err_msg")
    private final String errMsg;

    @SerializedName(alternate = {b.x}, value = "ret")
    private final int ret;

    public BaseResp(String str, int i2, T t2) {
    }

    public static /* synthetic */ BaseResp copy$default(BaseResp baseResp, String str, int i2, Object obj, int i3, Object obj2) {
    }

    public final String component1() {
    }

    public final int component2() {
    }

    public final T component3() {
    }

    public final BaseResp<T> copy(String str, int i2, T t2) {
    }

    public boolean equals(Object obj) {
    }

    public final T getData() {
    }

    public final String getErrMsg() {
    }

    public final int getRet() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    public /* synthetic */ BaseResp(String str, int i2, Object obj, int i3, h hVar) {
    }
}
