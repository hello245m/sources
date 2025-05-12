package com.tencent.mp.feature.data.biz.account.entity.message;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import n.d0.d.h;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class MessageImage implements Parcelable {
    public static final a CREATOR = null;
    private String aeskey;
    private int cryptVer;
    private int fileId;
    private String format;
    private int hdSize;
    private String httpUrl;
    private int id;
    private String localPath;
    private String mediaId;
    private long messageId;
    private int midSize;
    private int thumbHeight;
    private String thumbMediaId;
    private int thumbSize;
    private int thumbWidth;
    private String url;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a implements Parcelable.Creator<MessageImage> {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
        }

        public MessageImage a(Parcel parcel) {
        }

        public MessageImage[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MessageImage createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MessageImage[] newArray(int i2) {
        }
    }

    public MessageImage() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public final String getAeskey() {
    }

    public final int getCryptVer() {
    }

    public final int getFileId() {
    }

    public final String getFormat() {
    }

    public final int getHdSize() {
    }

    public final String getHttpUrl() {
    }

    public final int getId() {
    }

    public final String getLocalPath() {
    }

    public final String getMediaId() {
    }

    public final long getMessageId() {
    }

    public final int getMidSize() {
    }

    public final int getThumbHeight() {
    }

    public final String getThumbMediaId() {
    }

    public final int getThumbSize() {
    }

    public final int getThumbWidth() {
    }

    public final String getUrl() {
    }

    public final void setAeskey(String str) {
    }

    public final void setCryptVer(int i2) {
    }

    public final void setFileId(int i2) {
    }

    public final void setFormat(String str) {
    }

    public final void setHdSize(int i2) {
    }

    public final void setHttpUrl(String str) {
    }

    public final void setId(int i2) {
    }

    public final void setLocalPath(String str) {
    }

    public final void setMediaId(String str) {
    }

    public final void setMessageId(long j2) {
    }

    public final void setMidSize(int i2) {
    }

    public final void setThumbHeight(int i2) {
    }

    public final void setThumbMediaId(String str) {
    }

    public final void setThumbSize(int i2) {
    }

    public final void setThumbWidth(int i2) {
    }

    public final void setUrl(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public MessageImage(Parcel parcel) {
    }
}
