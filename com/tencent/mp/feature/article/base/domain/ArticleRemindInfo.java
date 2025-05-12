package com.tencent.mp.feature.article.base.domain;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class ArticleRemindInfo {

    @SerializedName("block_idx")
    private final List<Integer> blockIdx;

    @SerializedName("handle_type")
    private final int handleType;

    @SerializedName("hit_type")
    private final int hitType;

    @SerializedName("risky_word")
    private final List<String> riskyWord;
    private final int scene;
    private final String wording;

    public ArticleRemindInfo(int i2, String str, int i3, int i4, List<Integer> list, List<String> list2) {
    }

    public static /* synthetic */ ArticleRemindInfo copy$default(ArticleRemindInfo articleRemindInfo, int i2, String str, int i3, int i4, List list, List list2, int i5, Object obj) {
    }

    public final int component1() {
    }

    public final String component2() {
    }

    public final int component3() {
    }

    public final int component4() {
    }

    public final List<Integer> component5() {
    }

    public final List<String> component6() {
    }

    public final ArticleRemindInfo copy(int i2, String str, int i3, int i4, List<Integer> list, List<String> list2) {
    }

    public boolean equals(Object obj) {
    }

    public final List<Integer> getBlockIdx() {
    }

    public final int getHandleType() {
    }

    public final int getHitType() {
    }

    public final List<String> getRiskyWord() {
    }

    public final int getScene() {
    }

    public final String getWording() {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
