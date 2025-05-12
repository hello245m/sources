package com.tencent.android.tpush.stat.event;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class Event {
    public static String channel = "xgsdk";
    public static String h;

    /* renamed from: i, reason: collision with root package name */
    public static long f883i;
    public String c;
    public long d;
    public long e;
    public int f;
    public String g;

    /* renamed from: j, reason: collision with root package name */
    public long f884j;

    /* renamed from: k, reason: collision with root package name */
    public Context f885k;

    public Event(Context context, int i2, long j2) {
    }

    private void a(Context context, int i2, long j2) {
    }

    public boolean decode(JSONObject jSONObject) {
    }

    public boolean encode(JSONObject jSONObject) {
    }

    public long getAccessid() {
    }

    public String getAppkey() {
    }

    public Context getContext() {
    }

    public long getMsgTimeSec() {
    }

    public long getTimestamp() {
    }

    public abstract EventType getType();

    public abstract boolean onEncode(JSONObject jSONObject);

    public void setAccessid(long j2) {
    }

    public void setAppkey(String str) {
    }

    public void setMsgTimeSec(long j2) {
    }

    public String toJsonString() {
    }

    public String toString() {
    }

    public Event(Context context, String str) {
    }

    public Event(Context context, String str, long j2) {
    }

    public Event(Context context) {
    }
}
