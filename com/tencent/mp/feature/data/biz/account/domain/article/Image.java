package com.tencent.mp.feature.data.biz.account.domain.article;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import n.d0.d.h;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class Image implements Parcelable {
    public static final Parcelable.Creator<Image> CREATOR = null;
    private ImageCropFrame imageCropFrame;
    private String localPath;
    private String mediaId;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a implements Parcelable.Creator<Image> {
        public final Image a(Parcel parcel) {
        }

        public final Image[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Image createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Image[] newArray(int i2) {
        }
    }

    public Image() {
    }

    public Image(String str, String str2, ImageCropFrame imageCropFrame) {
    }

    public static /* synthetic */ Image copy$default(Image image, String str, String str2, ImageCropFrame imageCropFrame, int i2, Object obj) {
    }

    public final String component1() {
    }

    public final String component2() {
    }

    public final ImageCropFrame component3() {
    }

    public final Image copy(String str, String str2, ImageCropFrame imageCropFrame) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final ImageCropFrame getImageCropFrame() {
    }

    public final String getLocalPath() {
    }

    public final String getMediaId() {
    }

    public int hashCode() {
    }

    public final void setImageCropFrame(ImageCropFrame imageCropFrame) {
    }

    public final void setLocalPath(String str) {
    }

    public final void setMediaId(String str) {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public /* synthetic */ Image(String str, String str2, ImageCropFrame imageCropFrame, int i2, h hVar) {
    }
}
