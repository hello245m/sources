package com.tencent.tpns.mqttchannel.api;

import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IMqttChannel {
    void bindAccount(String str, OnMqttCallback onMqttCallback);

    void getConnectState(OnMqttCallback onMqttCallback);

    void ping(OnMqttCallback onMqttCallback);

    void sendPublishData(String str, String str2, OnMqttCallback onMqttCallback);

    void sendRequest(String str, JSONObject jSONObject, OnMqttCallback onMqttCallback);

    void startConnect(OnMqttCallback onMqttCallback);

    void stopConnect(OnMqttCallback onMqttCallback);

    void subscrbie(String str, OnMqttCallback onMqttCallback);

    void unBindAccount(OnMqttCallback onMqttCallback);

    void unSubscrbie(String str, OnMqttCallback onMqttCallback);
}
