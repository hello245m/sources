package com.tencent.tpns.mqttchannel.core.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.tpns.baseapi.base.util.TTask;
import com.tencent.tpns.mqttchannel.api.IMqttChannel;
import com.tencent.tpns.mqttchannel.api.OnMqttCallback;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class c implements IMqttChannel {
    private Context a;
    private Intent b;
    private Boolean c;
    private volatile long d;
    private ServiceConnection e;

    /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 extends TTask {
        public com.tencent.tpns.mqttchannel.core.common.b.c a;
        public final /* synthetic */ a b;
        public final /* synthetic */ String c;
        public final /* synthetic */ OnMqttCallback d;
        public final /* synthetic */ c e;
        private ServiceConnection f;

        /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class ServiceConnectionC00881 implements ServiceConnection {
            public final /* synthetic */ AnonymousClass1 a;

            /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
            public class C00891 extends TTask {
                public final /* synthetic */ ServiceConnectionC00881 a;

                public C00891(ServiceConnectionC00881 serviceConnectionC00881) {
                }

                @Override // com.tencent.tpns.baseapi.base.util.TTask
                public void TRun() {
                }
            }

            public ServiceConnectionC00881(AnonymousClass1 anonymousClass1) {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
            }
        }

        public AnonymousClass1(c cVar, a aVar, String str, OnMqttCallback onMqttCallback) {
        }

        public static /* synthetic */ ServiceConnection a(AnonymousClass1 anonymousClass1, ServiceConnection serviceConnection) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$10, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass10 implements a {
        public final /* synthetic */ com.tencent.tpns.mqttchannel.core.common.a.a a;
        public final /* synthetic */ OnMqttCallback b;
        public final /* synthetic */ c c;

        public AnonymousClass10(c cVar, com.tencent.tpns.mqttchannel.core.common.a.a aVar, OnMqttCallback onMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.a.c.a
        public void a(com.tencent.tpns.mqttchannel.core.common.b.c cVar) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$11, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass11 implements a {
        public final /* synthetic */ com.tencent.tpns.mqttchannel.core.common.a.a a;
        public final /* synthetic */ OnMqttCallback b;
        public final /* synthetic */ c c;

        public AnonymousClass11(c cVar, com.tencent.tpns.mqttchannel.core.common.a.a aVar, OnMqttCallback onMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.a.c.a
        public void a(com.tencent.tpns.mqttchannel.core.common.b.c cVar) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass2 implements a {
        public final /* synthetic */ com.tencent.tpns.mqttchannel.core.common.a.a a;
        public final /* synthetic */ OnMqttCallback b;
        public final /* synthetic */ c c;

        public AnonymousClass2(c cVar, com.tencent.tpns.mqttchannel.core.common.a.a aVar, OnMqttCallback onMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.a.c.a
        public void a(com.tencent.tpns.mqttchannel.core.common.b.c cVar) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass3 implements a {
        public final /* synthetic */ com.tencent.tpns.mqttchannel.core.common.a.a a;
        public final /* synthetic */ OnMqttCallback b;
        public final /* synthetic */ c c;

        public AnonymousClass3(c cVar, com.tencent.tpns.mqttchannel.core.common.a.a aVar, OnMqttCallback onMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.a.c.a
        public void a(com.tencent.tpns.mqttchannel.core.common.b.c cVar) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$4, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass4 implements ServiceConnection {
        public final /* synthetic */ c a;

        public AnonymousClass4(c cVar) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$5, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass5 implements a {
        public final /* synthetic */ OnMqttCallback a;
        public final /* synthetic */ c b;

        public AnonymousClass5(c cVar, OnMqttCallback onMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.a.c.a
        public void a(com.tencent.tpns.mqttchannel.core.common.b.c cVar) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$6, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass6 implements ServiceConnection {
        public final /* synthetic */ c a;

        public AnonymousClass6(c cVar) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$7, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass7 implements a {
        public final /* synthetic */ OnMqttCallback a;
        public final /* synthetic */ c b;

        public AnonymousClass7(c cVar, OnMqttCallback onMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.a.c.a
        public void a(com.tencent.tpns.mqttchannel.core.common.b.c cVar) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$8, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass8 implements a {
        public final /* synthetic */ OnMqttCallback a;
        public final /* synthetic */ c b;

        public AnonymousClass8(c cVar, OnMqttCallback onMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.a.c.a
        public void a(com.tencent.tpns.mqttchannel.core.common.b.c cVar) {
        }
    }

    /* renamed from: com.tencent.tpns.mqttchannel.core.a.c$9, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass9 implements a {
        public final /* synthetic */ OnMqttCallback a;
        public final /* synthetic */ c b;

        public AnonymousClass9(c cVar, OnMqttCallback onMqttCallback) {
        }

        @Override // com.tencent.tpns.mqttchannel.core.a.c.a
        public void a(com.tencent.tpns.mqttchannel.core.common.b.c cVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface a {
        void a(com.tencent.tpns.mqttchannel.core.common.b.c cVar);
    }

    public c(Context context) {
    }

    public static /* synthetic */ Context a(c cVar) {
    }

    public static /* synthetic */ Intent b(c cVar) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void bindAccount(String str, OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void getConnectState(OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void ping(OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void sendPublishData(String str, String str2, OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void sendRequest(String str, JSONObject jSONObject, OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void startConnect(OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void stopConnect(OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void subscrbie(String str, OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void unBindAccount(OnMqttCallback onMqttCallback) {
    }

    @Override // com.tencent.tpns.mqttchannel.api.IMqttChannel
    public void unSubscrbie(String str, OnMqttCallback onMqttCallback) {
    }

    private long a() {
    }

    private void a(a aVar, String str, OnMqttCallback onMqttCallback) {
    }
}
