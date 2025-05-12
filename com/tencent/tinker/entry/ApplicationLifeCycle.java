package com.tencent.tinker.entry;

import android.content.Context;
import android.content.res.Configuration;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface ApplicationLifeCycle {
    void onBaseContextAttached(Context context);

    void onConfigurationChanged(Configuration configuration);

    void onCreate();

    void onLowMemory();

    void onTerminate();

    void onTrimMemory(int i2);
}
