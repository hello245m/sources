package com.tencent.mp.feature.article.base.domain;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class ArticleCheckResult {
    private final int idx;

    @SerializedName("remind_info_list")
    private final List<ArticleRemindInfo> remindInfoList;
    private final String title;

    public ArticleCheckResult(int i2, String str, List<ArticleRemindInfo> list) {
    }

    public static /* synthetic */ ArticleCheckResult copy$default(ArticleCheckResult articleCheckResult, int i2, String str, List list, int i3, Object obj) {
    }

    public final int component1() {
    }

    public final String component2() {
    }

    public final List<ArticleRemindInfo> component3() {
    }

    public final ArticleCheckResult copy(int i2, String str, List<ArticleRemindInfo> list) {
    }

    public boolean equals(Object obj) {
    }

    public final int getIdx() {
    }

    public final List<ArticleRemindInfo> getRemindInfoList() {
    }

    public final String getTitle() {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
