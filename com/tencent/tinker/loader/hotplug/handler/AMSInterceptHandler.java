package com.tencent.tinker.loader.hotplug.handler;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor;
import java.lang.reflect.Method;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class AMSInterceptHandler implements ServiceBinderInterceptor.BinderInvocationHandler {
    public static final int INTENT_SENDER_ACTIVITY = 0;
    public static final int[] TRANSLUCENT_ATTR_ID = null;
    public final Context mContext;

    public AMSInterceptHandler(Context context) {
    }

    public final Object handleGetIntentSender(Object obj, Method method, Object[] objArr) throws Throwable {
    }

    public final Object handleStartActivities(Object obj, Method method, Object[] objArr) throws Throwable {
    }

    public final Object handleStartActivity(Object obj, Method method, Object[] objArr) throws Throwable {
    }

    public final boolean hasTransparentTheme(ActivityInfo activityInfo) {
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.BinderInvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
    }

    public final void processActivityIntent(Intent intent) {
    }

    public final void storeAndReplaceOriginalComponentName(Intent intent, String str, String str2, String str3) {
    }
}
