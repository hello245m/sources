package com.huawei.hms.core.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface IAIDLCallback extends IInterface {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class Stub extends Binder implements IAIDLCallback {
        public static final int TRANSACTION_call = 1;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class a implements IAIDLCallback {
            public static IAIDLCallback b;
            private IBinder a;

            public a(IBinder iBinder) {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }
        }

        public static IAIDLCallback asInterface(IBinder iBinder) {
        }

        public static IAIDLCallback getDefaultImpl() {
        }

        public static boolean setDefaultImpl(IAIDLCallback iAIDLCallback) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        }
    }

    void call(DataBuffer dataBuffer) throws RemoteException;
}
