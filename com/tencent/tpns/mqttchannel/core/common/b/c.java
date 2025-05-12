package com.tencent.tpns.mqttchannel.core.common.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface c extends IInterface {
    void a(com.tencent.tpns.mqttchannel.core.common.a.a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2);

    void a(com.tencent.tpns.mqttchannel.core.common.b.a aVar);

    void b(com.tencent.tpns.mqttchannel.core.common.a.a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2);

    void b(com.tencent.tpns.mqttchannel.core.common.b.a aVar);

    void c(com.tencent.tpns.mqttchannel.core.common.a.a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2);

    void c(com.tencent.tpns.mqttchannel.core.common.b.a aVar);

    void d(com.tencent.tpns.mqttchannel.core.common.a.a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2);

    void d(com.tencent.tpns.mqttchannel.core.common.b.a aVar);

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static abstract class a extends Binder implements c {
        public static c a(IBinder iBinder) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        }

        public static c a() {
        }

        /* renamed from: com.tencent.tpns.mqttchannel.core.common.b.c$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static class C0094a implements c {
            public static c a;
            private IBinder b;

            public C0094a(IBinder iBinder) {
            }

            @Override // com.tencent.tpns.mqttchannel.core.common.b.c
            public void a(com.tencent.tpns.mqttchannel.core.common.b.a aVar) {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // com.tencent.tpns.mqttchannel.core.common.b.c
            public void b(com.tencent.tpns.mqttchannel.core.common.b.a aVar) {
            }

            @Override // com.tencent.tpns.mqttchannel.core.common.b.c
            public void c(com.tencent.tpns.mqttchannel.core.common.b.a aVar) {
            }

            @Override // com.tencent.tpns.mqttchannel.core.common.b.c
            public void d(com.tencent.tpns.mqttchannel.core.common.b.a aVar) {
            }

            @Override // com.tencent.tpns.mqttchannel.core.common.b.c
            public void a(com.tencent.tpns.mqttchannel.core.common.a.a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2) {
            }

            @Override // com.tencent.tpns.mqttchannel.core.common.b.c
            public void b(com.tencent.tpns.mqttchannel.core.common.a.a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2) {
            }

            @Override // com.tencent.tpns.mqttchannel.core.common.b.c
            public void c(com.tencent.tpns.mqttchannel.core.common.a.a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2) {
            }

            @Override // com.tencent.tpns.mqttchannel.core.common.b.c
            public void d(com.tencent.tpns.mqttchannel.core.common.a.a aVar, com.tencent.tpns.mqttchannel.core.common.b.a aVar2) {
            }
        }
    }
}
