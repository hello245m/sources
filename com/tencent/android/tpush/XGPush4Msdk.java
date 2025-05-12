package com.tencent.android.tpush;

import android.content.Context;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.util.Set;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class XGPush4Msdk {
    private static long a = 0;
    private static long b = 0;
    private static String c = "";

    /* renamed from: com.tencent.android.tpush.XGPush4Msdk$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 extends TTask {
        public final /* synthetic */ Context a;

        public AnonymousClass1(Context context) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPush4Msdk$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass2 implements XGIOperateCallback {
        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onFail(Object obj, int i2, String str) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onSuccess(Object obj, int i2) {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPush4Msdk$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass3 implements XGIOperateCallback {
        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onFail(Object obj, int i2, String str) {
        }

        @Override // com.tencent.android.tpush.XGIOperateCallback
        public void onSuccess(Object obj, int i2) {
        }
    }

    public static /* synthetic */ String a(Context context) {
    }

    private static boolean a(long j2, long j3, long j4) {
    }

    public static long addLocalNotification(Context context, XGLocalMessage xGLocalMessage) {
    }

    public static void addTags(Context context, String str, Set<String> set) {
    }

    private static String b(Context context) {
    }

    public static void cleanTags(Context context, String str) {
    }

    public static void deleteTag(Context context, String str) {
    }

    public static void deleteTags(Context context, String str, Set<String> set) {
    }

    public static String getDebugServerInfo(Context context) {
    }

    public static long getQQAccessId(Context context) {
    }

    public static String getQQAppKey(Context context) {
    }

    public static boolean isDebugServerInfoStrategyItem(Context context) {
    }

    public static void registerPush(Context context, XGIOperateCallback xGIOperateCallback) {
    }

    public static void setDebugServerInfo(Context context, String str, int i2) {
    }

    public static void setDefaultNotificationBuilder(Context context, XGPushNotificationBuilder xGPushNotificationBuilder) {
    }

    public static void setPushNotificationBuilder(Context context, int i2, XGPushNotificationBuilder xGPushNotificationBuilder) {
    }

    public static void setQQAppId(Context context, long j2) {
    }

    public static void setQQAppKey(Context context, String str) {
    }

    public static void setTag(Context context, String str) {
    }

    public static void setTags(Context context, String str, Set<String> set) {
    }

    public static void unregisterPush(Context context, XGIOperateCallback xGIOperateCallback) {
    }
}
