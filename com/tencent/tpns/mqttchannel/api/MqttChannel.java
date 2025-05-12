package com.tencent.tpns.mqttchannel.api;

import android.content.Context;
import com.tencent.tpns.mqttchannel.core.a.c;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class MqttChannel implements IMqttChannel {
    private static MqttChannel a;
    private c b;

    private MqttChannel(Context context) {
    }

    public static synchronized MqttChannel getInstance(Context context) {
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
}
