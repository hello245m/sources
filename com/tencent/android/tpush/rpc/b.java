package com.tencent.android.tpush.rpc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface b extends IInterface {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class a extends Binder implements b {

        /* renamed from: com.tencent.android.tpush.rpc.b$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class C0018a implements b {
            public static b a;
            private IBinder b;

            public C0018a(IBinder iBinder) {
            }

            @Override // com.tencent.android.tpush.rpc.b
            public void a() {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }
        }

        public static b a(IBinder iBinder) {
        }

        public static b b() {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        }
    }

    void a();
}
