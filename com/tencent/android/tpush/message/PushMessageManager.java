package com.tencent.android.tpush.message;

import android.content.Context;
import android.content.Intent;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class PushMessageManager {
    public static final int CUSTOM_LAYOUT_TYPE_1 = 1;
    public static final int CUSTOM_LAYOUT_TYPE_2 = 2;
    public static final int CUSTOM_LAYOUT_TYPE_3 = 3;
    public static final int MESSAGE_TYPE_CLOUD_CTRL = 1000;
    public static final int MESSAGE_TYPE_CTRL = 3;
    public static final int MESSAGE_TYPE_IN_MSG = 7;
    public static final int MESSAGE_TYPE_NOTIFICATION = 1;
    public static final int MESSAGE_TYPE_TEXT = 2;
    private long a;
    private long b;
    private long c;
    private String d;
    private long e;
    private String f;
    private String g;
    private long h;

    /* renamed from: i, reason: collision with root package name */
    private long f770i;

    /* renamed from: j, reason: collision with root package name */
    private String f771j;

    /* renamed from: k, reason: collision with root package name */
    private String f772k;

    /* renamed from: l, reason: collision with root package name */
    private String f773l;

    /* renamed from: m, reason: collision with root package name */
    private Context f774m;

    /* renamed from: n, reason: collision with root package name */
    private Intent f775n;

    /* renamed from: o, reason: collision with root package name */
    private a f776o;

    /* renamed from: p, reason: collision with root package name */
    private int f777p;
    public int pushChannel;
    public long pushTime;
    public long source;
    public long targetType;

    private PushMessageManager(Context context, Intent intent) {
    }

    public static PushMessageManager getInstance(Context context, Intent intent) {
    }

    public long getAccessId() {
    }

    public String getAppPkgName() {
    }

    public long getBusiMsgId() {
    }

    public long getChannelId() {
    }

    public String getContent() {
    }

    public Context getContext() {
    }

    public String getGroupId() {
    }

    public String getInMsg() {
    }

    public Intent getIntent() {
    }

    public a getMessageHolder() {
    }

    public long getMsgId() {
    }

    public int getRevokeId() {
    }

    public long getSource() {
    }

    public long getTargetType() {
    }

    public String getTemplateId() {
    }

    public long getTimestamps() {
    }

    public String getTraceId() {
    }

    public long getType() {
    }

    public void setAppPkgName(String str) {
    }

    public void setChannelId(long j2) {
    }

    public void setGroupId(String str) {
    }

    public void setSource(long j2) {
    }

    public void setTargetType(long j2) {
    }

    public void showNotifacition() {
    }

    public String toString() {
    }
}
