package com.tencent.tpns.mqttchannel.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class MqttConnectState {
    public static final MqttConnectState CONNECTED = null;
    public static final MqttConnectState CONNECTFAIL = null;
    public static final MqttConnectState CONNECTING = null;
    public static final MqttConnectState DISCONNECTED = null;
    public static final MqttConnectState DISCONNECTING = null;
    public static final MqttConnectState SUBTOPICS = null;
    public static final MqttConnectState UNKOWN = null;
    private static final /* synthetic */ MqttConnectState[] b = null;
    private int a;

    private MqttConnectState(String str, int i2, int i3) {
    }

    public static MqttConnectState from(int i2) {
    }

    public static MqttConnectState valueOf(String str) {
    }

    public static MqttConnectState[] values() {
    }

    public int getType() {
    }
}
