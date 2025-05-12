package com.tencent.wcdb;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class CursorToBulkCursorAdaptor extends BulkCursorNative implements IBinder.DeathRecipient {
    private static final String TAG = "Cursor";
    private CrossProcessCursor mCursor;
    private CursorWindow mFilledWindow;
    private final Object mLock;
    private ContentObserverProxy mObserver;
    private final String mProviderName;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class ContentObserverProxy extends ContentObserver {
        public IContentObserver mRemote;

        public ContentObserverProxy(IContentObserver iContentObserver, IBinder.DeathRecipient deathRecipient) {
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
        }

        public boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient) {
        }
    }

    public CursorToBulkCursorAdaptor(Cursor cursor, IContentObserver iContentObserver, String str) {
    }

    private void closeFilledWindowLocked() {
    }

    private void createAndRegisterObserverProxyLocked(IContentObserver iContentObserver) {
    }

    private void disposeLocked() {
    }

    private void throwIfCursorIsClosed() {
    }

    private void unregisterObserverProxyLocked() {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public void close() {
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public void deactivate() {
    }

    public BulkCursorDescriptor getBulkCursorDescriptor() {
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public Bundle getExtras() {
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public CursorWindow getWindow(int i2) {
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public void onMove(int i2) {
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public int requery(IContentObserver iContentObserver) {
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public Bundle respond(Bundle bundle) {
    }
}
