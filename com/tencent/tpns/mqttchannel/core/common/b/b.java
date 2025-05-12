package com.tencent.tpns.mqttchannel.core.common.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface b extends IInterface {
    void a();

    void a(com.tencent.tpns.mqttchannel.core.common.a.a aVar);

    void a(boolean z);

    void b();

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static abstract class a extends Binder implements b {
        public static b a(IBinder iBinder) {
        }

        public static b c() {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        }

        /* renamed from: com.tencent.tpns.mqttchannel.core.common.b.b$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static class C0093a implements b {
            public static b a;
            private IBinder b;

            public C0093a(IBinder iBinder) {
            }

            @Override // com.tencent.tpns.mqttchannel.core.common.b.b
            public void a(boolean z) {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // com.tencent.tpns.mqttchannel.core.common.b.b
            public void b() {
            }

            @Override // com.tencent.tpns.mqttchannel.core.common.b.b
            public void a() {
            }

            @Override // com.tencent.tpns.mqttchannel.core.common.b.b
            public void a(com.tencent.tpns.mqttchannel.core.common.a.a aVar) {
            }
        }
    }
}
