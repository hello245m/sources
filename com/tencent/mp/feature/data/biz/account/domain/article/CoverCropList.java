package com.tencent.mp.feature.data.biz.account.domain.article;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import n.d0.d.h;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class CoverCropList implements Parcelable {
    public static final Parcelable.Creator<CoverCropList> CREATOR = null;
    public static final a Companion = null;

    @SerializedName("crop_list_percent")
    private final List<CoverCropPercent> cropListPercent;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {

        /* renamed from: com.tencent.mp.feature.data.biz.account.domain.article.CoverCropList$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class C0050a extends TypeToken<CoverCropList> {
        }

        public a() {
        }

        public /* synthetic */ a(h hVar) {
        }

        public final CoverCropList a(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b implements Parcelable.Creator<CoverCropList> {
        public final CoverCropList a(Parcel parcel) {
        }

        public final CoverCropList[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CoverCropList createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CoverCropList[] newArray(int i2) {
        }
    }

    public CoverCropList(List<CoverCropPercent> list) {
    }

    public static /* synthetic */ CoverCropList copy$default(CoverCropList coverCropList, List list, int i2, Object obj) {
    }

    public final List<CoverCropPercent> component1() {
    }

    public final CoverCropList copy(List<CoverCropPercent> list) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final List<CoverCropPercent> getCropListPercent() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }
}
