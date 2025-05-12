package com.huawei.hms.support.api.entity.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.core.aidl.IMessageEntity;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class Scope implements IMessageEntity, Parcelable {
    public static final Parcelable.Creator<Scope> CREATOR = null;
    private String mScopeUri;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a implements Parcelable.Creator<Scope> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Scope createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Scope[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Scope createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Scope[] newArray(int i2) {
        }
    }

    public Scope() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    @Deprecated
    public boolean equeals(Object obj) {
    }

    public String getScopeUri() {
    }

    public final int hashCode() {
    }

    public final String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public Scope(String str) {
    }

    public Scope(Parcel parcel) {
    }
}
