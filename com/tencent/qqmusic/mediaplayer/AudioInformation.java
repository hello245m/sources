package com.tencent.qqmusic.mediaplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.qqmusic.mediaplayer.AudioFormat;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class AudioInformation implements Parcelable {
    public static final int CBR = 1;
    public static final int CORRECT = 1;
    public static final Parcelable.Creator<AudioInformation> CREATOR = null;
    public static final int INCORRECT = 2;
    public static final int VBR_VBRI = 3;
    public static final int VBR_XING = 2;
    private int bitDept;
    private int bitrate;
    private int channels;
    private long duration;
    private int durationIsCorrect;
    private int isCbr;
    private int mAudioTypeValue;
    private long mPlaySample;
    private long sampleRate;

    /* renamed from: com.tencent.qqmusic.mediaplayer.AudioInformation$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<AudioInformation> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AudioInformation createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AudioInformation[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AudioInformation createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AudioInformation[] newArray(int i2) {
        }
    }

    public AudioInformation() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean durationIsCorrect() {
    }

    public AudioFormat.AudioType getAudioType() {
    }

    public int getBitDepth() {
    }

    public int getBitrate() {
    }

    public int getChannels() {
    }

    public long getDuration() {
    }

    public long getPlaySample() {
    }

    public long getSampleRate() {
    }

    public int getVbrType() {
    }

    public boolean isCbr() {
    }

    public boolean isVbr() {
    }

    public void readFromParcel(Parcel parcel) {
    }

    public void setAudioType(AudioFormat.AudioType audioType) {
    }

    public void setBitDept(int i2) {
    }

    public void setBitrate(int i2) {
    }

    public void setCbr(int i2) {
    }

    public void setChannels(int i2) {
    }

    public void setDuration(long j2) {
    }

    public void setPlaySample(long j2) {
    }

    public void setSampleRate(long j2) {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public AudioInformation(Parcel parcel) {
    }
}
