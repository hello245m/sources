package com.tencent.wcdb;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class BulkCursorDescriptor implements Parcelable {
    public static final Parcelable.Creator<BulkCursorDescriptor> CREATOR = null;
    public String[] columnNames;
    public int count;
    public IBulkCursor cursor;
    public boolean wantsAllOnMoveCalls;
    public CursorWindow window;

    /* renamed from: com.tencent.wcdb.BulkCursorDescriptor$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<BulkCursorDescriptor> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ BulkCursorDescriptor createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ BulkCursorDescriptor[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BulkCursorDescriptor createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BulkCursorDescriptor[] newArray(int i2) {
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public void readFromParcel(Parcel parcel) {
    }

    public final String[] readStringArray(Parcel parcel) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }
}
