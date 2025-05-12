package com.tencent.mp.feature.data.biz.account.domain.article;

import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import n.d0.d.h;
import q.q3;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class CoverCoordinate implements Parcelable {
    public static final Parcelable.Creator<CoverCoordinate> CREATOR = null;
    public static final a Companion = null;
    private final PointF leftTop;
    private final PointF rightBottom;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
        }

        public final CoverCoordinate a(q3 q3Var) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b implements Parcelable.Creator<CoverCoordinate> {
        public final CoverCoordinate a(Parcel parcel) {
        }

        public final CoverCoordinate[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CoverCoordinate createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CoverCoordinate[] newArray(int i2) {
        }
    }

    public CoverCoordinate() {
    }

    public CoverCoordinate(PointF pointF, PointF pointF2) {
    }

    public static /* synthetic */ CoverCoordinate copy$default(CoverCoordinate coverCoordinate, PointF pointF, PointF pointF2, int i2, Object obj) {
    }

    public final PointF component1() {
    }

    public final PointF component2() {
    }

    public final CoverCoordinate copy(PointF pointF, PointF pointF2) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final PointF getLeftTop() {
    }

    public final PointF getRightBottom() {
    }

    public int hashCode() {
    }

    public final boolean isEmpty() {
    }

    public final RectF toRect() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public /* synthetic */ CoverCoordinate(PointF pointF, PointF pointF2, int i2, h hVar) {
    }
}
