package com.huawei.hms.support.api.entity.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class PermissionInfo implements IMessageEntity, Parcelable {
    public static final Parcelable.Creator<PermissionInfo> CREATOR = null;

    @Packed
    private String appID;

    @Packed
    private String packageName;

    @Packed
    private String permission;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a implements Parcelable.Creator<PermissionInfo> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PermissionInfo createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PermissionInfo[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PermissionInfo createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PermissionInfo[] newArray(int i2) {
        }
    }

    public PermissionInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getAppID() {
    }

    public String getPackageName() {
    }

    public String getPermission() {
    }

    public void setAppID(String str) {
    }

    public void setPackageName(String str) {
    }

    public void setPermission(String str) {
    }

    public PermissionInfo setPermissionUri(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PermissionInfo(String str, String str2, String str3) {
    }

    public PermissionInfo(Parcel parcel) {
    }
}
