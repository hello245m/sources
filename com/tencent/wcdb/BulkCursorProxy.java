package com.tencent.wcdb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class BulkCursorProxy implements IBulkCursor {
    private Bundle mExtras;
    private IBinder mRemote;

    public BulkCursorProxy(IBinder iBinder) {
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public void close() throws RemoteException {
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public void deactivate() throws RemoteException {
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public Bundle getExtras() throws RemoteException {
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public CursorWindow getWindow(int i2) throws RemoteException {
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public void onMove(int i2) throws RemoteException {
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public int requery(IContentObserver iContentObserver) throws RemoteException {
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public Bundle respond(Bundle bundle) throws RemoteException {
    }
}
