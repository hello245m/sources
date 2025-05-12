package com.tencent.mp.feature.article.base.domain;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class SearchWeAppResponse {

    @SerializedName("base_resp")
    private final BaseResp<Object> baseResp;
    private final List<Item> items;

    public SearchWeAppResponse(BaseResp<Object> baseResp, List<Item> list) {
    }

    public static /* synthetic */ SearchWeAppResponse copy$default(SearchWeAppResponse searchWeAppResponse, BaseResp baseResp, List list, int i2, Object obj) {
    }

    public final BaseResp<Object> component1() {
    }

    public final List<Item> component2() {
    }

    public final SearchWeAppResponse copy(BaseResp<Object> baseResp, List<Item> list) {
    }

    public boolean equals(Object obj) {
    }

    public final BaseResp<Object> getBaseResp() {
    }

    public final List<Item> getItems() {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
