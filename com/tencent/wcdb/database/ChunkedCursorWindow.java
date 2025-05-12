package com.tencent.wcdb.database;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ChunkedCursorWindow extends SQLiteClosable {
    public static final long CHUNK_NOT_FOUND = -1;
    private int mNumColumns;
    public long mWindowPtr;

    public ChunkedCursorWindow(int i2) {
    }

    private void dispose() {
    }

    private static native void nativeClear(long j2);

    private static native long nativeCreate(int i2);

    private static native void nativeDispose(long j2);

    private static native void nativeEndRow(long j2, long j3);

    private static native byte[] nativeGetBlob(long j2, int i2);

    private static native double nativeGetDouble(long j2, int i2);

    private static native long nativeGetLong(long j2, int i2);

    private static native int nativeGetNumChunks(long j2);

    private static native long nativeGetRow(long j2, int i2);

    private static native String nativeGetString(long j2, int i2);

    private static native int nativeGetType(long j2, int i2);

    private static native long nativeRemoveChunk(long j2, int i2);

    private static native boolean nativeSetNumColumns(long j2, int i2);

    public void clear() {
    }

    public void endRowUnsafe(long j2) {
    }

    public void finalize() throws Throwable {
    }

    public byte[] getBlob(int i2, int i3) {
    }

    public byte[] getBlobUnsafe(long j2, int i2) {
    }

    public double getDouble(int i2, int i3) {
    }

    public double getDoubleUnsafe(long j2, int i2) {
    }

    public long getLong(int i2, int i3) {
    }

    public long getLongUnsafe(long j2, int i2) {
    }

    public int getNumChunks() {
    }

    public int getNumColumns() {
    }

    public long getRowUnsafe(int i2) {
    }

    public String getString(int i2, int i3) {
    }

    public String getStringUnsafe(long j2, int i2) {
    }

    public int getType(int i2, int i3) {
    }

    public int getTypeUnsafe(long j2, int i2) {
    }

    @Override // com.tencent.wcdb.database.SQLiteClosable
    public void onAllReferencesReleased() {
    }

    public long removeChunk(int i2) {
    }

    public boolean setNumColumns(int i2) {
    }
}
