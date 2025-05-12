package com.tencent.android.tpush.service.c;

import android.content.Context;
import com.tencent.android.tpush.service.protocol.d;
import com.tencent.tpns.mqttchannel.api.OnMqttCallback;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class b {
    private static volatile boolean a = true;
    private static volatile boolean b = true;
    private long c;

    /* renamed from: com.tencent.android.tpush.service.c.b$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass3 extends OnMqttCallback {
        public final /* synthetic */ InterfaceC0021b a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ b c;

        /* renamed from: com.tencent.android.tpush.service.c.b$3$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1 extends OnMqttCallback {
            public final /* synthetic */ AnonymousClass3 a;

            public AnonymousClass1(AnonymousClass3 anonymousClass3) {
            }

            @Override // com.tencent.tpns.mqttchannel.core.a.b
            public void callback(int i2, String str) {
            }
        }

        public AnonymousClass3(b bVar, InterfaceC0021b interfaceC0021b, Context context) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.a.b
        public void callback(int i2, String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a extends OnMqttCallback {
        private com.tencent.android.tpush.service.c.a a;
        private d b;
        private Context c;

        public a(Context context, com.tencent.android.tpush.service.c.a aVar, d dVar) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.a.b
        public void callback(int i2, String str) {
        }
    }

    /* renamed from: com.tencent.android.tpush.service.c.b$b, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface InterfaceC0021b {
        void a();

        void a(int i2, String str);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c {
        public static b a;
    }

    public /* synthetic */ b(AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ long a(b bVar) {
    }

    private long b() {
    }

    private b() {
    }

    public static /* synthetic */ void a(Context context, int i2, String str, long j2, d dVar) {
    }

    public static b a() {
    }

    public void b(Context context, d dVar, com.tencent.android.tpush.service.c.a aVar) {
    }

    private static void b(Context context, int i2, String str, long j2, d dVar) {
    }

    public void a(Context context, d dVar, com.tencent.android.tpush.service.c.a aVar) {
    }

    private void a(Context context, InterfaceC0021b interfaceC0021b) {
    }

    /* renamed from: com.tencent.android.tpush.service.c.b$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements InterfaceC0021b {
        public final /* synthetic */ d a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ com.tencent.android.tpush.service.c.a c;
        public final /* synthetic */ b d;

        public AnonymousClass1(b bVar, d dVar, Context context, com.tencent.android.tpush.service.c.a aVar) {
        }

        @Override // com.tencent.android.tpush.service.c.b.InterfaceC0021b
        public void a() {
        }

        @Override // com.tencent.android.tpush.service.c.b.InterfaceC0021b
        public void a(int i2, String str) {
        }
    }

    /* renamed from: com.tencent.android.tpush.service.c.b$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass2 implements InterfaceC0021b {
        public final /* synthetic */ d a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ com.tencent.android.tpush.service.c.a c;
        public final /* synthetic */ b d;

        public AnonymousClass2(b bVar, d dVar, Context context, com.tencent.android.tpush.service.c.a aVar) {
        }

        @Override // com.tencent.android.tpush.service.c.b.InterfaceC0021b
        public void a() {
        }

        @Override // com.tencent.android.tpush.service.c.b.InterfaceC0021b
        public void a(int i2, String str) {
        }
    }
}
