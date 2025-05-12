package com.tencent.wcdb;

import android.database.CharArrayBuffer;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class AbstractWindowedCursor extends AbstractCursor {
    public CursorWindow mWindow;

    @Override // com.tencent.wcdb.AbstractCursor
    public void checkPosition() {
    }

    public void clearOrCreateWindow(String str) {
    }

    public void closeWindow() {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public void copyStringToBuffer(int i2, CharArrayBuffer charArrayBuffer) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public byte[] getBlob(int i2) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public double getDouble(int i2) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public float getFloat(int i2) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getInt(int i2) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public long getLong(int i2) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public short getShort(int i2) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public String getString(int i2) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getType(int i2) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.CrossProcessCursor
    public CursorWindow getWindow() {
    }

    public boolean hasWindow() {
    }

    @Deprecated
    public boolean isBlob(int i2) {
    }

    @Deprecated
    public boolean isFloat(int i2) {
    }

    @Deprecated
    public boolean isLong(int i2) {
    }

    @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isNull(int i2) {
    }

    @Deprecated
    public boolean isString(int i2) {
    }

    @Override // com.tencent.wcdb.AbstractCursor
    public void onDeactivateOrClose() {
    }

    public void setWindow(CursorWindow cursorWindow) {
    }
}
