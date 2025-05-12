package com.tencent.tpns.mqttchannel.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.tpns.mqttchannel.core.common.b.b;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class BaseMqttClientService extends Service {
    private b.a a;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
    }

    public abstract void onConnectComplete(boolean z);

    public abstract void onConnectionLost();

    @Override // android.app.Service
    public void onCreate() {
    }

    @Override // android.app.Service
    public void onDestroy() {
    }

    public abstract void onHeartBeat();

    public abstract void onMessageArrived(String str, String str2);
}
