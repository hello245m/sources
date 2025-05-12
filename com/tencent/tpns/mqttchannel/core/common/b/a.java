package com.tencent.tpns.mqttchannel.core.common.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface a extends IInterface {

    /* renamed from: com.tencent.tpns.mqttchannel.core.common.b.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static abstract class AbstractBinderC0091a extends Binder implements a {

        /* renamed from: com.tencent.tpns.mqttchannel.core.common.b.a$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static class C0092a implements a {
            public static a a;
            private IBinder b;

            public C0092a(IBinder iBinder) {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // com.tencent.tpns.mqttchannel.core.common.b.a
            public void handleCallback(int i2, String str) {
            }
        }

        public static a asInterface(IBinder iBinder) {
        }

        public static a getDefaultImpl() {
        }

        public static boolean setDefaultImpl(a aVar) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        }
    }

    void handleCallback(int i2, String str);
}
