package com.tencent.tinker.loader.hotplug;

import android.content.Context;
import android.os.Handler;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor;
import com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor;
import com.tencent.tinker.loader.hotplug.interceptor.TinkerHackInstrumentation;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class ComponentHotplug {
    public static ServiceBinderInterceptor sAMSInterceptor = null;
    public static volatile boolean sInstalled = false;
    public static HandlerMessageInterceptor sMHMessageInterceptor;
    public static ServiceBinderInterceptor sPMSInterceptor;
    public static TinkerHackInstrumentation sTinkerHackInstrumentation;

    private ComponentHotplug() {
    }

    public static Handler fetchMHInstance(Context context) {
    }

    public static synchronized void install(TinkerApplication tinkerApplication, ShareSecurityCheck shareSecurityCheck) throws UnsupportedEnvironmentException {
    }

    public static synchronized void uninstall() {
    }
}
