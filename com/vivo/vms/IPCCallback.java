package com.vivo.vms;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IPCCallback extends IInterface {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class Default implements IPCCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // com.vivo.vms.IPCCallback
        public void call(Bundle bundle) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static abstract class Stub extends Binder implements IPCCallback {
        private static final String DESCRIPTOR = "com.vivo.vms.IPCCallback";
        public static final int TRANSACTION_call = 1;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static class Proxy implements IPCCallback {
            public static IPCCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // com.vivo.vms.IPCCallback
            public void call(Bundle bundle) {
            }

            public String getInterfaceDescriptor() {
            }
        }

        public static IPCCallback asInterface(IBinder iBinder) {
        }

        public static IPCCallback getDefaultImpl() {
        }

        public static boolean setDefaultImpl(IPCCallback iPCCallback) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        }
    }

    void call(Bundle bundle);
}
