package com.tencent.wcdb;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObservable;
import android.database.ContentObserver;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class AbstractCursor implements CrossProcessCursor {
    private static final String TAG = "Cursor";
    public boolean mClosed;
    private final ContentObservable mContentObservable;
    public ContentResolver mContentResolver;

    @Deprecated
    public Long mCurrentRowID;
    private final DataSetObservable mDataSetObservable;
    private Bundle mExtras;
    private Uri mNotifyUri;
    public int mPos;

    @Deprecated
    public int mRowIdColumnIndex;
    private ContentObserver mSelfObserver;
    private final Object mSelfObserverLock;
    private boolean mSelfObserverRegistered;

    @Deprecated
    public HashMap<Long, Map<String, Object>> mUpdatedRows;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class SelfContentObserver extends ContentObserver {
        public WeakReference<AbstractCursor> mCursor;

        public SelfContentObserver(AbstractCursor abstractCursor) {
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
        }
    }

    public void checkPosition() {
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

    @Override // com.tencent.wcdb.CrossProcessCursor
    public void fillWindow(int i2, CursorWindow cursorWindow) {
    }

    public void finalize() {
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
    public int getColumnIndexOrThrow(String str) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public String getColumnName(int i2) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract String[] getColumnNames();

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract int getCount();

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract double getDouble(int i2);

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public Bundle getExtras() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract float getFloat(int i2);

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract int getInt(int i2);

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract long getLong(int i2);

    @Override // android.database.Cursor
    public Uri getNotificationUri() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final int getPosition() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract short getShort(int i2);

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract String getString(int i2);

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public int getType(int i2) {
    }

    @Deprecated
    public Object getUpdatedField(int i2) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
    }

    @Override // com.tencent.wcdb.CrossProcessCursor
    public CursorWindow getWindow() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean isAfterLast() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean isBeforeFirst() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean isClosed() {
    }

    @Deprecated
    public boolean isFieldUpdated(int i2) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean isFirst() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean isLast() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public abstract boolean isNull(int i2);

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean move(int i2) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean moveToFirst() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean moveToLast() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean moveToNext() {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public boolean moveToPosition(int i2) {
    }

    @Override // com.tencent.wcdb.Cursor, android.database.Cursor
    public final boolean moveToPrevious() {
    }

    public void onChange(boolean z) {
    }

    public void onDeactivateOrClose() {
    }

    @Override // com.tencent.wcdb.CrossProcessCursor
    public boolean onMove(int i2, int i3) {
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
