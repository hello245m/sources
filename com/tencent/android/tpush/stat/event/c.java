package com.tencent.android.tpush.stat.event;

import android.content.Context;
import java.util.Properties;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class c extends Event {
    public a a;
    public long b;

    public c(Context context, int i2, String str, long j2, long j3) {
    }

    public a a() {
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public EventType getType() {
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public boolean onEncode(JSONObject jSONObject) {
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public String toJsonString() {
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public String toString() {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a {
        public String a;
        public JSONArray b;
        public JSONObject c;
        public boolean d;

        public a(String str, String[] strArr, Properties properties) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        public a() {
        }
    }
}
