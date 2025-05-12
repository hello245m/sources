package com.tencent.mp.feature.article.base.domain;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class ArticleCheckResp {

    @SerializedName("article_result_info_list")
    private final List<ArticleCheckResult> articleResultInfoList;

    @SerializedName("remind_flag")
    private final int remindFlag;

    public ArticleCheckResp(List<ArticleCheckResult> list, int i2) {
    }

    public static /* synthetic */ ArticleCheckResp copy$default(ArticleCheckResp articleCheckResp, List list, int i2, int i3, Object obj) {
    }

    public final List<ArticleCheckResult> component1() {
    }

    public final int component2() {
    }

    public final ArticleCheckResp copy(List<ArticleCheckResult> list, int i2) {
    }

    public boolean equals(Object obj) {
    }

    public final List<ArticleCheckResult> getArticleResultInfoList() {
    }

    public final int getRemindFlag() {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
