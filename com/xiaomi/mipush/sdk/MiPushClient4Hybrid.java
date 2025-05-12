package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.mipush.sdk.b;
import com.xiaomi.push.hs;
import com.xiaomi.push.hy;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class MiPushClient4Hybrid {
    private static Map<String, b.a> dataMap;
    private static MiPushCallback sCallback;
    private static Map<String, Long> sRegisterTimeMap;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class MiPushCallback {
        public void onCommandResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }

        public void onReceiveRegisterResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }

        public void onReceiveUnregisterResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }
    }

    private static void addPullNotificationTime(Context context, String str) {
    }

    private static short getDeviceStatus(MiPushMessage miPushMessage, boolean z) {
    }

    public static boolean isRegistered(Context context, String str) {
    }

    public static void onReceiveRegisterResult(Context context, hs hsVar) {
    }

    public static void onReceiveUnregisterResult(Context context, hy hyVar) {
    }

    public static void registerPush(Context context, String str, String str2, String str3) {
    }

    public static void removeDuplicateCache(Context context, MiPushMessage miPushMessage) {
    }

    public static void reportMessageArrived(Context context, MiPushMessage miPushMessage, boolean z) {
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
    }

    public static void setCallback(MiPushCallback miPushCallback) {
    }

    private static boolean shouldPullNotification(Context context, String str) {
    }

    public static void unregisterPush(Context context, String str) {
    }

    public static void uploadClearMessageData(Context context, LinkedList<? extends Object> linkedList) {
    }
}
