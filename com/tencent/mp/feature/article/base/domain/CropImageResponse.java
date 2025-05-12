package com.tencent.mp.feature.article.base.domain;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class CropImageResponse {

    @SerializedName("base_resp")
    private final BaseResp<Object> baseResp;
    private final List<CropImageItem> result;

    public CropImageResponse(BaseResp<Object> baseResp, List<CropImageItem> list) {
    }

    public static /* synthetic */ CropImageResponse copy$default(CropImageResponse cropImageResponse, BaseResp baseResp, List list, int i2, Object obj) {
    }

    public final BaseResp<Object> component1() {
    }

    public final List<CropImageItem> component2() {
    }

    public final CropImageResponse copy(BaseResp<Object> baseResp, List<CropImageItem> list) {
    }

    public boolean equals(Object obj) {
    }

    public final BaseResp<Object> getBaseResp() {
    }

    public final List<CropImageItem> getResult() {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
