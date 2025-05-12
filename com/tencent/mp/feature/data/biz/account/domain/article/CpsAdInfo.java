package com.tencent.mp.feature.data.biz.account.domain.article;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;
import n.d0.d.h;
import q.x4;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class CpsAdInfo implements Parcelable {
    public static final Parcelable.Creator<CpsAdInfo> CREATOR = null;
    public static final a Companion = null;
    private final String data_buffer;
    private final String extinfo;
    private final String pid;
    private final String templateid;
    private final String traceid;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
        }

        public final List<CpsAdInfo> a(List<x4> list) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b implements Parcelable.Creator<CpsAdInfo> {
        public final CpsAdInfo a(Parcel parcel) {
        }

        public final CpsAdInfo[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CpsAdInfo createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CpsAdInfo[] newArray(int i2) {
        }
    }

    public CpsAdInfo(String str, String str2, String str3, String str4, String str5) {
    }

    public static /* synthetic */ CpsAdInfo copy$default(CpsAdInfo cpsAdInfo, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
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

    public final CpsAdInfo copy(String str, String str2, String str3, String str4, String str5) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final String getData_buffer() {
    }

    public final String getExtinfo() {
    }

    public final String getPid() {
    }

    public final String getTemplateid() {
    }

    public final String getTraceid() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }
}
