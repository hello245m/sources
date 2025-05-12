package com.huawei.hms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class Feature extends AbstractSafeParcelable {
    public static final int ARGS_NAME = 1;
    public static final int ARGS_SVC_VER = 2;
    public static final int ARGS_VER = 3;
    public static final Parcelable.Creator<Feature> CREATOR = null;
    private static final int SVC_VER = -1;
    private final long apiVersion;
    private final String name;

    @Deprecated
    private final int serviceVersion;

    public Feature(String str, long j2) {
    }

    public boolean equals(Object obj) {
    }

    public String getName() {
    }

    public long getVersion() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public Feature(String str, int i2, long j2) {
    }
}
