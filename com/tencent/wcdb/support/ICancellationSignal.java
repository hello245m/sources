package com.tencent.wcdb.support;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface ICancellationSignal extends IInterface {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static abstract class Stub extends Binder implements ICancellationSignal {
        private static final String DESCRIPTOR = "com.tencent.wcdb.support.ICancellationSignal";
        public static final int TRANSACTION_cancel = 1;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static class Proxy implements ICancellationSignal {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // com.tencent.wcdb.support.ICancellationSignal
            public void cancel() throws RemoteException {
            }

            public String getInterfaceDescriptor() {
            }
        }

        public static ICancellationSignal asInterface(IBinder iBinder) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        }
    }

    void cancel() throws RemoteException;
}
