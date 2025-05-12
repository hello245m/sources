package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.push.hd;
import com.xiaomi.push.hu;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class PushMessageHelper {
    public static final String ERROR_MESSAGE = "error_message";
    public static final String ERROR_TYPE = "error_type";
    public static final String ERROR_TYPE_NEED_PERMISSION = "error_lack_of_permission";
    public static final String KEY_COMMAND = "key_command";
    public static final String KEY_MESSAGE = "key_message";
    public static final int MESSAGE_COMMAND = 3;
    public static final int MESSAGE_ERROR = 5;
    public static final int MESSAGE_QUIT = 4;
    public static final int MESSAGE_RAW = 1;
    public static final int MESSAGE_SENDMESSAGE = 2;
    public static final String MESSAGE_TYPE = "message_type";
    public static final int PUSH_MODE_BROADCAST = 2;
    public static final int PUSH_MODE_CALLBACK = 1;
    private static int pushMode;

    public static MiPushCommandMessage generateCommandMessage(String str, List<String> list, long j2, String str2, String str3, List<String> list2) {
    }

    public static MiPushMessage generateMessage(hu huVar, hd hdVar, boolean z) {
    }

    public static hd generateMessage(MiPushMessage miPushMessage) {
    }

    public static int getPushMode(Context context) {
    }

    private static boolean isIntentAvailable(Context context, Intent intent) {
    }

    public static boolean isUseCallbackPushMode(Context context) {
    }

    public static void sendCommandMessageBroadcast(Context context, MiPushCommandMessage miPushCommandMessage) {
    }

    public static void sendQuitMessageBroadcast(Context context) {
    }

    private static void setPushMode(int i2) {
    }
}
