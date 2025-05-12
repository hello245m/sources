package com.tencent.android.tpush.stat.event;

import android.content.Context;
import com.tencent.android.tpush.message.PushMessageManager;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class MQTTEvent extends Event {
    public long accessid;
    public String appVersion;
    public String appkey;
    public String eventId;
    public long msgBusiId;
    public long msgId;
    public long msgType;
    public String nGroupId;
    public JSONObject prop;
    public int pushAction;
    public int pushChannel;
    public long pushtime;
    public String sdkVersion;
    public long source;
    public long targetType;
    public String templateId;
    public long timestamp;
    public String token;
    public String traceId;

    public MQTTEvent(Context context, String str, long j2) {
    }

    private void a(PushMessageManager pushMessageManager) {
    }

    public boolean equals(Object obj) {
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public long getAccessid() {
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public String getAppkey() {
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public EventType getType() {
    }

    public int hashCode() {
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public boolean onEncode(JSONObject jSONObject) {
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public void setAccessid(long j2) {
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public void setAppkey(String str) {
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public String toJsonString() {
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public String toString() {
    }

    public MQTTEvent(Context context, long j2) {
    }

    public MQTTEvent(Context context) {
    }

    public MQTTEvent(Context context, long j2, PushMessageManager pushMessageManager) {
    }
}
