package com.tencent.mp.feature.data.biz.account.domain.article;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;
import n.d0.d.h;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class MakeImageConfig implements Parcelable {
    public static final Parcelable.Creator<MakeImageConfig> CREATOR = null;
    public static final a Companion = null;
    public static final int CurrentMinVersion = 2;
    public static final int CurrentVersion = 2;
    private int colorIndex;
    private int colorType;
    private final List<String> colors;
    private final int composing;
    private String coverURL;
    private String coverURL11;
    private String coverURL34;
    private final List<Image> images;
    private int layout;
    private final List<Point> maskPoints;
    private final int minVersion;
    private int textAlignment;
    private String textColor;
    private int textStyle;
    private final int version;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b implements Parcelable.Creator<MakeImageConfig> {
        public final MakeImageConfig a(Parcel parcel) {
        }

        public final MakeImageConfig[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MakeImageConfig createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MakeImageConfig[] newArray(int i2) {
        }
    }

    public MakeImageConfig() {
    }

    public MakeImageConfig(int i2, List<Image> list, List<? extends Point> list2, List<String> list3, int i3, int i4, String str, String str2, String str3, String str4, int i5, int i6, int i7, int i8, int i9) {
    }

    public static /* synthetic */ MakeImageConfig copy$default(MakeImageConfig makeImageConfig, int i2, List list, List list2, List list3, int i3, int i4, String str, String str2, String str3, String str4, int i5, int i6, int i7, int i8, int i9, int i10, Object obj) {
    }

    public final int component1() {
    }

    public final String component10() {
    }

    public final int component11() {
    }

    public final int component12() {
    }

    public final int component13() {
    }

    public final int component14() {
    }

    public final int component15() {
    }

    public final List<Image> component2() {
    }

    public final List<Point> component3() {
    }

    public final List<String> component4() {
    }

    public final int component5() {
    }

    public final int component6() {
    }

    public final String component7() {
    }

    public final String component8() {
    }

    public final String component9() {
    }

    public final MakeImageConfig copy(int i2, List<Image> list, List<? extends Point> list2, List<String> list3, int i3, int i4, String str, String str2, String str3, String str4, int i5, int i6, int i7, int i8, int i9) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final int getColorIndex() {
    }

    public final int getColorType() {
    }

    public final List<String> getColors() {
    }

    public final int getComposing() {
    }

    public final String getCoverURL() {
    }

    public final String getCoverURL11() {
    }

    public final String getCoverURL34() {
    }

    public final List<Image> getImages() {
    }

    public final int getLayout() {
    }

    public final List<Point> getMaskPoints() {
    }

    public final int getMinVersion() {
    }

    public final int getTextAlignment() {
    }

    public final String getTextColor() {
    }

    public final int getTextStyle() {
    }

    public final int getVersion() {
    }

    public int hashCode() {
    }

    public final void setColorIndex(int i2) {
    }

    public final void setColorType(int i2) {
    }

    public final void setCoverURL(String str) {
    }

    public final void setCoverURL11(String str) {
    }

    public final void setCoverURL34(String str) {
    }

    public final void setLayout(int i2) {
    }

    public final void setTextAlignment(int i2) {
    }

    public final void setTextColor(String str) {
    }

    public final void setTextStyle(int i2) {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public /* synthetic */ MakeImageConfig(int i2, List list, List list2, List list3, int i3, int i4, String str, String str2, String str3, String str4, int i5, int i6, int i7, int i8, int i9, int i10, h hVar) {
    }
}
