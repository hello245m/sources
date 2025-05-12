package com.tencent.android.tpush;

import android.content.Intent;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class XGPushShowedResult implements XGIResult {
    public static final int NOTIFICATION_ACTION_ACTIVITY = 0;
    public static final int NOTIFICATION_ACTION_INTENT = 0;
    public static final int NOTIFICATION_ACTION_INTENT_WIHT_ACTION = 0;
    public static final int NOTIFICATION_ACTION_PACKAGE = 0;
    public static final int NOTIFICATION_ACTION_URL = 0;
    public long a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f747i;
    public String templateId;
    public String traceId;

    public String getActivity() {
    }

    public String getContent() {
    }

    public String getCustomContent() {
    }

    public long getMsgId() {
    }

    public int getNotifactionId() {
    }

    public int getNotificationActionType() {
    }

    public int getPushChannel() {
    }

    public String getTemplateId() {
    }

    public String getTitle() {
    }

    public String getTraceId() {
    }

    public boolean isCustomLayout() {
    }

    @Override // com.tencent.android.tpush.XGIResult
    public void parseIntent(Intent intent) {
    }

    public String toString() {
    }
}
