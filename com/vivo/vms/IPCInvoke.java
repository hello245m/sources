package com.vivo.vms;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IPCInvoke extends IInterface {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class Default implements IPCInvoke {
        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // com.vivo.vms.IPCInvoke
        public Bundle asyncCall(Bundle bundle, IPCCallback iPCCallback) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static abstract class Stub extends Binder implements IPCInvoke {
        private static final String DESCRIPTOR = "com.vivo.vms.IPCInvoke";
        public static final int TRANSACTION_asyncCall = 1;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static class Proxy implements IPCInvoke {
            public static IPCInvoke sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // com.vivo.vms.IPCInvoke
            public Bundle asyncCall(Bundle bundle, IPCCallback iPCCallback) {
            }

            public String getInterfaceDescriptor() {
            }
        }

        public static IPCInvoke asInterface(IBinder iBinder) {
        }

        public static IPCInvoke getDefaultImpl() {
        }

        public static boolean setDefaultImpl(IPCInvoke iPCInvoke) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        }
    }

    Bundle asyncCall(Bundle bundle, IPCCallback iPCCallback);
}
