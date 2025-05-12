package com.tencent.qqmusic.mediaplayer.audioplaylist;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class TrackInfo extends AudioPlayListItemInfo {
    public static final Parcelable.Creator<TrackInfo> CREATOR = null;
    private String mAlbum;
    private long mEndPostion;
    private String mPerformer;
    private long mStartPosition;
    private String mTitle;

    /* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<TrackInfo> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TrackInfo createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TrackInfo[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TrackInfo createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TrackInfo[] newArray(int i2) {
        }
    }

    public TrackInfo(int i2) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getAlbum() {
    }

    public String getPerformer() {
    }

    public Pair<Long, Long> getRange() {
    }

    public String getTitle() {
    }

    public String getUri() {
    }

    public void setAlbum(String str) {
    }

    public void setEndPostion(long j2) {
    }

    public void setFilePath(String str) {
    }

    public void setPerformer(String str) {
    }

    public void setStartPosition(long j2) {
    }

    public void setTitle(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }
}
