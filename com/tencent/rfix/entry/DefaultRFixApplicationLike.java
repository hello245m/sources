package com.tencent.rfix.entry;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import com.tencent.rfix.loader.entity.RFixLoadResult;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class DefaultRFixApplicationLike extends RFixApplicationLike {
    private static final String TAG = "RFix.DefaultRFixApplicationLike";
    private static RFixLoadResult sRFixLoadResult;

    public DefaultRFixApplicationLike(Application application, RFixLoadResult rFixLoadResult) {
    }

    public static RFixApplicationLike createApplicationLike(Application application) {
    }

    @Override // com.tencent.rfix.entry.RFixApplicationLike, com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onBaseContextAttached(Context context) {
    }

    @Override // com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onCreate() {
    }

    @Override // com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onLowMemory() {
    }

    @Override // com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onTerminate() {
    }

    @Override // com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onTrimMemory(int i2) {
    }
}
