package com.tencent.mars.smc;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class IDKey implements Parcelable {
    public static final Parcelable.Creator<IDKey> CREATOR = null;
    private long id;
    private long key;
    private long value;

    /* renamed from: com.tencent.mars.smc.IDKey$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements Parcelable.Creator<IDKey> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ IDKey createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ IDKey[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IDKey createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IDKey[] newArray(int i2) {
        }
    }

    public IDKey(int i2, int i3, int i4) {
    }

    public long GetID() {
    }

    public long GetKey() {
    }

    public long GetValue() {
    }

    public void SetID(int i2) {
    }

    public void SetKey(int i2) {
    }

    public void SetValue(long j2) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public IDKey(long j2, long j3, long j4) {
    }

    public IDKey() {
    }

    public IDKey(Parcel parcel) {
    }
}
