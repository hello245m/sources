package com.tencent.wcdb;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IContentObserver extends IInterface {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static abstract class Stub extends Binder implements IContentObserver {
        private static final String DESCRIPTOR = "com.tencent.wcdb.IContentObserver";
        public static final int TRANSACTION_onChange = 1;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static class Proxy implements IContentObserver {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            public String getInterfaceDescriptor() {
            }

            @Override // com.tencent.wcdb.IContentObserver
            public void onChange(boolean z, Uri uri) throws RemoteException {
            }
        }

        public static IContentObserver asInterface(IBinder iBinder) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        }
    }

    void onChange(boolean z, Uri uri) throws RemoteException;
}
