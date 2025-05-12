package com.tencent.mp.feature.data.biz.account.domain.article;

import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import n.d0.d.h;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class ImageCropFrame implements Parcelable {
    public static final Parcelable.Creator<ImageCropFrame> CREATOR = null;
    public static final a Companion = null;
    private final float leftTopX;
    private final float leftTopY;
    private final float rightBottomX;
    private final float rightBottomY;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
        }

        public final ImageCropFrame a(RectF rectF) {
        }

        public final RectF b(ImageCropFrame imageCropFrame) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b implements Parcelable.Creator<ImageCropFrame> {
        public final ImageCropFrame a(Parcel parcel) {
        }

        public final ImageCropFrame[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ImageCropFrame createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ImageCropFrame[] newArray(int i2) {
        }
    }

    public ImageCropFrame() {
    }

    public ImageCropFrame(float f, float f2, float f3, float f4) {
    }

    public static /* synthetic */ ImageCropFrame copy$default(ImageCropFrame imageCropFrame, float f, float f2, float f3, float f4, int i2, Object obj) {
    }

    public final float component1() {
    }

    public final float component2() {
    }

    public final float component3() {
    }

    public final float component4() {
    }

    public final ImageCropFrame copy(float f, float f2, float f3, float f4) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final float getLeftTopX() {
    }

    public final float getLeftTopY() {
    }

    public final float getRightBottomX() {
    }

    public final float getRightBottomY() {
    }

    public int hashCode() {
    }

    public final boolean isEmpty() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public /* synthetic */ ImageCropFrame(float f, float f2, float f3, float f4, int i2, h hVar) {
    }
}
