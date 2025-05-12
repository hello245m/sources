package com.tencent.android.tpush.rpc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface a extends IInterface {
    void a();

    void a(String str, b bVar);

    void b();

    /* renamed from: com.tencent.android.tpush.rpc.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class AbstractBinderC0016a extends Binder implements a {
        public static a a(IBinder iBinder) {
        }

        public static a c() {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        }

        /* renamed from: com.tencent.android.tpush.rpc.a$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class C0017a implements a {
            public static a a;
            private IBinder b;

            public C0017a(IBinder iBinder) {
            }

            @Override // com.tencent.android.tpush.rpc.a
            public void a() {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // com.tencent.android.tpush.rpc.a
            public void b() {
            }

            @Override // com.tencent.android.tpush.rpc.a
            public void a(String str, b bVar) {
            }
        }
    }
}
