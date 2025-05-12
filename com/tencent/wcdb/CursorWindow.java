package com.tencent.wcdb;

import android.database.CharArrayBuffer;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.wcdb.database.SQLiteClosable;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class CursorWindow extends SQLiteClosable implements Parcelable {
    public static final Parcelable.Creator<CursorWindow> CREATOR = null;
    private static final String STATS_TAG = "WCDB.CursorWindowStats";
    private static int sCursorWindowSize;
    private final String mName;
    private int mStartPos;
    public long mWindowPtr;

    /* renamed from: com.tencent.wcdb.CursorWindow$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<CursorWindow> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CursorWindow createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CursorWindow[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CursorWindow createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CursorWindow[] newArray(int i2) {
        }
    }

    public /* synthetic */ CursorWindow(Parcel parcel, AnonymousClass1 anonymousClass1) {
    }

    private void dispose() {
    }

    private static native boolean nativeAllocRow(long j2);

    private static native void nativeClear(long j2);

    private static native void nativeCopyStringToBuffer(long j2, int i2, int i3, CharArrayBuffer charArrayBuffer);

    private static native long nativeCreate(String str, int i2);

    private static native void nativeDispose(long j2);

    private static native void nativeFreeLastRow(long j2);

    private static native byte[] nativeGetBlob(long j2, int i2, int i3);

    private static native double nativeGetDouble(long j2, int i2, int i3);

    private static native long nativeGetLong(long j2, int i2, int i3);

    private static native int nativeGetNumRows(long j2);

    private static native String nativeGetString(long j2, int i2, int i3);

    private static native int nativeGetType(long j2, int i2, int i3);

    private static native boolean nativePutBlob(long j2, byte[] bArr, int i2, int i3);

    private static native boolean nativePutDouble(long j2, double d, int i2, int i3);

    private static native boolean nativePutLong(long j2, long j3, int i2, int i3);

    private static native boolean nativePutNull(long j2, int i2, int i3);

    private static native boolean nativePutString(long j2, String str, int i2, int i3);

    private static native boolean nativeSetNumColumns(long j2, int i2);

    public static CursorWindow newFromParcel(Parcel parcel) {
    }

    public static int windowSize(int i2) {
    }

    public boolean allocRow() {
    }

    public void clear() {
    }

    public void copyStringToBuffer(int i2, int i3, CharArrayBuffer charArrayBuffer) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public void finalize() throws Throwable {
    }

    public void freeLastRow() {
    }

    public byte[] getBlob(int i2, int i3) {
    }

    public double getDouble(int i2, int i3) {
    }

    public float getFloat(int i2, int i3) {
    }

    public int getInt(int i2, int i3) {
    }

    public long getLong(int i2, int i3) {
    }

    public String getName() {
    }

    public int getNumRows() {
    }

    public short getShort(int i2, int i3) {
    }

    public int getStartPosition() {
    }

    public String getString(int i2, int i3) {
    }

    public int getType(int i2, int i3) {
    }

    @Deprecated
    public boolean isBlob(int i2, int i3) {
    }

    @Deprecated
    public boolean isFloat(int i2, int i3) {
    }

    @Deprecated
    public boolean isLong(int i2, int i3) {
    }

    @Deprecated
    public boolean isNull(int i2, int i3) {
    }

    @Deprecated
    public boolean isString(int i2, int i3) {
    }

    @Override // com.tencent.wcdb.database.SQLiteClosable
    public void onAllReferencesReleased() {
    }

    public boolean putBlob(byte[] bArr, int i2, int i3) {
    }

    public boolean putDouble(double d, int i2, int i3) {
    }

    public boolean putLong(long j2, int i2, int i3) {
    }

    public boolean putNull(int i2, int i3) {
    }

    public boolean putString(String str, int i2, int i3) {
    }

    public boolean setNumColumns(int i2) {
    }

    public void setStartPosition(int i2) {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public CursorWindow(String str) {
    }

    @Deprecated
    public CursorWindow(boolean z) {
    }

    private CursorWindow(Parcel parcel) {
    }
}
