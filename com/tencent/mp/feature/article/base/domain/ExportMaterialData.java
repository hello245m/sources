package com.tencent.mp.feature.article.base.domain;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class ExportMaterialData {
    private final AdInfo adInfo;
    private final String func;
    private final boolean isSuccess;
    private final String json;

    @SerializedName("retcode_map")
    private final String retCodeMap;
    private final List<VideoFinderInfo> showImportToFinderTips;

    @Keep
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class AdInfo {
        private final boolean adValid;
        private final String errMsg;

        public AdInfo(boolean z, String str) {
        }

        public final boolean getAdValid() {
        }

        public final String getErrMsg() {
        }
    }

    public ExportMaterialData(boolean z, String str, String str2, String str3, AdInfo adInfo, List<VideoFinderInfo> list) {
    }

    public final AdInfo getAdInfo() {
    }

    public final String getFunc() {
    }

    public final String getJson() {
    }

    public final String getRetCodeMap() {
    }

    public final List<VideoFinderInfo> getShowImportToFinderTips() {
    }

    public final boolean isSuccess() {
    }
}
