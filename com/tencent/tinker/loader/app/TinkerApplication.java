package com.tencent.tinker.loader.app;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import com.tencent.tinker.anno.Keep;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class TinkerApplication extends Application {
    private static final String INTENT_PATCH_EXCEPTION = "intent_patch_exception";
    private static final TinkerApplication[] SELF_HOLDER = null;
    private static final String TINKER_LOADER_METHOD = "tryLoad";
    private final String delegateClassName;
    private final String loaderClassName;
    public ClassLoader mCurrentClassLoader;
    private Handler mInlineFence;
    private final int tinkerFlags;
    private final boolean tinkerLoadVerifyFlag;
    public Intent tinkerResultIntent;
    private final boolean useDelegateLastClassLoader;
    private boolean useSafeMode;

    public TinkerApplication(int i2) {
    }

    private Handler createInlineFence(Application application, int i2, String str, boolean z, long j2, long j3, Intent intent) {
    }

    public static TinkerApplication getInstance() {
    }

    private void loadTinker() {
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
    }

    @Override // android.content.ContextWrapper
    public Context getBaseContext() {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ClassLoader getClassLoader() {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
    }

    public int getTinkerFlags() {
    }

    public boolean isTinkerLoadVerifyFlag() {
    }

    public boolean isUseDelegateLastClassLoader() {
    }

    @Keep
    public int mzNightModeUseOf() {
    }

    public void onBaseContextAttached(Context context, long j2, long j3) {
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application
    public void onCreate() {
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.app.Application
    public void onTerminate() {
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    @TargetApi(14)
    public void onTrimMemory(int i2) {
    }

    public void setUseSafeMode(boolean z) {
    }

    public TinkerApplication(int i2, String str) {
    }

    public TinkerApplication(int i2, String str, String str2, boolean z) {
    }

    public TinkerApplication(int i2, String str, String str2, boolean z, boolean z2) {
    }
}
