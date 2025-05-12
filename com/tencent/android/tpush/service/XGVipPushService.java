package com.tencent.android.tpush.service;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.tencent.tpns.baseapi.base.util.TTask;
import com.tencent.tpns.mqttchannel.services.BaseMqttClientService;
import org.json.JSONArray;

@JgClassChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20150316", reviewer = 3, vComment = {EType.SERVICESCHECK})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class XGVipPushService extends BaseMqttClientService {
    private static volatile String b = null;
    private static long c = 0;
    private static JSONArray d = null;
    private static long e = 270000;
    private static Service f;
    public TTask a;
    private Handler g;
    private boolean h;

    /* renamed from: i, reason: collision with root package name */
    private com.tencent.android.tpush.service.channel.a f792i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f793j;

    /* renamed from: com.tencent.android.tpush.service.XGVipPushService$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 extends TTask {
        public final /* synthetic */ XGVipPushService a;

        public AnonymousClass1(XGVipPushService xGVipPushService) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.android.tpush.service.XGVipPushService$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass2 extends TTask {
        public final /* synthetic */ Context a;
        public final /* synthetic */ XGVipPushService b;

        public AnonymousClass2(XGVipPushService xGVipPushService, Context context) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.android.tpush.service.XGVipPushService$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass3 extends TTask {
        public final /* synthetic */ Context a;

        public AnonymousClass3(Context context) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.android.tpush.service.XGVipPushService$4, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass4 extends TTask {
        public final /* synthetic */ XGVipPushService a;

        /* renamed from: com.tencent.android.tpush.service.XGVipPushService$4$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1 extends TTask {
            public final /* synthetic */ AnonymousClass4 a;

            public AnonymousClass1(AnonymousClass4 anonymousClass4) {
            }

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        }

        public AnonymousClass4(XGVipPushService xGVipPushService) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    public static /* synthetic */ long a(long j2) {
    }

    public static /* synthetic */ long b() {
    }

    private void c() {
    }

    private void d() {
    }

    @Override // com.tencent.tpns.mqttchannel.services.BaseMqttClientService, android.app.Service
    public IBinder onBind(Intent intent) {
    }

    @Override // com.tencent.tpns.mqttchannel.services.BaseMqttClientService
    public void onConnectComplete(boolean z) {
    }

    @Override // com.tencent.tpns.mqttchannel.services.BaseMqttClientService
    public void onConnectionLost() {
    }

    @Override // com.tencent.tpns.mqttchannel.services.BaseMqttClientService, android.app.Service
    public void onCreate() {
    }

    @Override // com.tencent.tpns.mqttchannel.services.BaseMqttClientService, android.app.Service
    public void onDestroy() {
    }

    @Override // com.tencent.tpns.mqttchannel.services.BaseMqttClientService
    public void onHeartBeat() {
    }

    @Override // com.tencent.tpns.mqttchannel.services.BaseMqttClientService
    public void onMessageArrived(String str, String str2) {
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i2) {
    }

    @Override // android.app.Service
    @SuppressLint({"WrongConstant"})
    public int onStartCommand(Intent intent, int i2, int i3) {
    }

    public static /* synthetic */ Handler a(XGVipPushService xGVipPushService) {
    }

    private void b(Context context) {
    }

    public static void a(Context context) {
    }

    public static Service a() {
    }

    private synchronized void a(Intent intent, String str) {
    }
}
