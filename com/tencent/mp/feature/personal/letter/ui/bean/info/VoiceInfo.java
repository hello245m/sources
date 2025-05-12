package com.tencent.mp.feature.personal.letter.ui.bean.info;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.tencent.mp.feature.data.biz.account.entity.message.MessageVoice;
import n.d0.d.h;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class VoiceInfo extends MessageVoice implements Parcelable {
    public static final Parcelable.Creator<VoiceInfo> CREATOR = null;
    private int downloadProgress;
    private boolean isDownloadFail;
    private boolean isDownloading;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a implements Parcelable.Creator<VoiceInfo> {
        public final VoiceInfo a(Parcel parcel) {
        }

        public final VoiceInfo[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ VoiceInfo createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ VoiceInfo[] newArray(int i2) {
        }
    }

    public VoiceInfo() {
    }

    public /* synthetic */ VoiceInfo(boolean z, boolean z2, int i2, int i3, h hVar) {
    }

    public static /* synthetic */ VoiceInfo copy$default(VoiceInfo voiceInfo, boolean z, boolean z2, int i2, int i3, Object obj) {
    }

    public final boolean component1() {
    }

    public final boolean component2() {
    }

    public final int component3() {
    }

    public final VoiceInfo copy(boolean z, boolean z2, int i2) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final int getDownloadProgress() {
    }

    public int hashCode() {
    }

    public final boolean isDownloadFail() {
    }

    public final boolean isDownloading() {
    }

    public final void setDownloadFail(boolean z) {
    }

    public final void setDownloadProgress(int i2) {
    }

    public final void setDownloading(boolean z) {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public VoiceInfo(boolean z, boolean z2, int i2) {
    }
}
