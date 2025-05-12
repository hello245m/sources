package com.huawei.hms.core.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class DataBuffer implements Parcelable {
    public static final Parcelable.Creator<DataBuffer> CREATOR = null;
    public String URI;
    private int a;
    private Bundle b;
    public Bundle header;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a implements Parcelable.Creator<DataBuffer> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DataBuffer createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DataBuffer[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DataBuffer createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DataBuffer[] newArray(int i2) {
        }
    }

    public /* synthetic */ DataBuffer(Parcel parcel, a aVar) {
    }

    private static ClassLoader a(Class cls) {
    }

    public DataBuffer addBody(Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public Bundle getBody() {
    }

    public int getBodySize() {
    }

    public int getProtocol() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    private DataBuffer(Parcel parcel) {
    }

    private void a(Parcel parcel) {
    }

    public DataBuffer() {
    }

    public DataBuffer(String str) {
    }

    public DataBuffer(String str, int i2) {
    }
}
