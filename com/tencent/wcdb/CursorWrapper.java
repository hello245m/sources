package com.tencent.wcdb;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class CursorWrapper implements Cursor {
    public final Cursor mCursor;

    public CursorWrapper(Cursor cursor) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void copyStringToBuffer(int i2, CharArrayBuffer charArrayBuffer) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void deactivate() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public byte[] getBlob(int i2) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getColumnCount() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getColumnIndex(String str) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public String getColumnName(int i2) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public String[] getColumnNames() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getCount() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public double getDouble(int i2) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public Bundle getExtras() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public float getFloat(int i2) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getInt(int i2) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public long getLong(int i2) {
    }

    @Override // android.database.Cursor
    public Uri getNotificationUri() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getPosition() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public short getShort(int i2) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public String getString(int i2) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getType(int i2) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
    }

    public Cursor getWrappedCursor() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isAfterLast() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isBeforeFirst() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isClosed() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isFirst() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isLast() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isNull(int i2) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean move(int i2) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean moveToFirst() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean moveToLast() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean moveToNext() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean moveToPosition(int i2) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean moveToPrevious() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void registerContentObserver(ContentObserver contentObserver) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean requery() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public Bundle respond(Bundle bundle) {
    }

    @Override // android.database.Cursor
    public void setExtras(Bundle bundle) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void unregisterContentObserver(ContentObserver contentObserver) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }
}
