package com.tencent.android.tpush.service.protocol;

import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class PushStatClientReport {
    public long a;
    public long b;
    public String c;
    public String d;
    public long e;
    public long f;
    public EnumPushAction g;
    public long h;

    /* renamed from: i, reason: collision with root package name */
    public String f812i;

    /* renamed from: j, reason: collision with root package name */
    public long f813j;

    /* renamed from: k, reason: collision with root package name */
    public String f814k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class EnumPushAction {
        private static final /* synthetic */ EnumPushAction[] $VALUES = null;
        public static final EnumPushAction PUSH_ACTION_MOBILE_APP_RECEIVED = null;
        public static final EnumPushAction PUSH_ACTION_MOBILE_CLEAN_UP = null;
        public static final EnumPushAction PUSH_ACTION_MOBILE_SERVICE_RECEIVED = null;
        public static final EnumPushAction PUSH_ACTION_MOBILE_USER_CLICK = null;
        private long type;

        private EnumPushAction(String str, int i2, long j2) {
        }

        public static EnumPushAction valueOf(String str) {
        }

        public static EnumPushAction[] values() {
        }

        public long getType() {
        }
    }

    public JSONObject a() {
    }

    public String toString() {
    }
}
