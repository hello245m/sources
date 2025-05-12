package com.tencent.mp.feature.personal.letter.ui.bean.info;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.tencent.mp.feature.data.biz.account.entity.message.MessageImage;
import n.d0.d.h;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class ImageInfo extends MessageImage implements Parcelable {
    public static final a CREATOR = null;
    private String localImageUri;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a implements Parcelable.Creator<ImageInfo> {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
        }

        public ImageInfo a(Parcel parcel) {
        }

        public ImageInfo[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ImageInfo createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ImageInfo[] newArray(int i2) {
        }
    }

    public /* synthetic */ ImageInfo(String str, int i2, h hVar) {
    }

    @Override // com.tencent.mp.feature.data.biz.account.entity.message.MessageImage, android.os.Parcelable
    public int describeContents() {
    }

    public final String getLocalImageUri() {
    }

    public final void setLocalImageUri(String str) {
    }

    @Override // com.tencent.mp.feature.data.biz.account.entity.message.MessageImage, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ImageInfo(String str) {
    }

    public ImageInfo(Parcel parcel) {
    }
}
