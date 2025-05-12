package com.tencent.tinker.loader.hotplug.handler;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Message;
import com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class MHMessageHandler implements HandlerMessageInterceptor.MessageHandler {
    public static final int LAUNCH_ACTIVITY = 0;
    public final Context mContext;

    public MHMessageHandler(Context context) {
    }

    public final <T> void copyInstanceFields(T t2, T t3) {
    }

    public final void fixActivityScreenOrientation(Object obj, int i2) {
    }

    public final void fixStubActivityInfo(ActivityInfo activityInfo, ActivityInfo activityInfo2) {
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor.MessageHandler
    public boolean handleMessage(Message message) {
    }
}
