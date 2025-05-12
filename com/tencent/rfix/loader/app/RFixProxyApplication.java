package com.tencent.rfix.loader.app;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class RFixProxyApplication extends RFixApplication {
    private static final String CLASS_ACTIVITY_THREAD = "android.app.ActivityThread";
    private static final String TAG = "RFix.RFixProxyApplication";
    private Application delegateApplication;
    private final String delegateClassName;
    private boolean interceptPackageName;

    public RFixProxyApplication(String str) {
    }

    private Object getField(Object obj, String str) throws Exception {
    }

    private void invokeMethod(Object obj, String str, Class<?>[] clsArr, Object[] objArr) throws Exception {
    }

    private void setField(Object obj, String str, Object obj2) throws Exception {
    }

    @Override // com.tencent.tinker.loader.app.TinkerApplication, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public String getPackageName() {
    }

    public void initDelegateApplication(Context context) {
    }

    public boolean interceptPackageName(Throwable th) {
    }

    @Override // com.tencent.tinker.loader.app.TinkerApplication, android.app.Application
    public void onCreate() {
    }

    @Override // android.app.Application
    public void registerActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
    }

    @Override // android.app.Application, android.content.ContextWrapper, android.content.Context
    public void registerComponentCallbacks(ComponentCallbacks componentCallbacks) {
    }

    @Override // android.app.Application
    public void registerOnProvideAssistDataListener(Application.OnProvideAssistDataListener onProvideAssistDataListener) {
    }

    public void replaceApplication(Application application) {
    }

    @Override // android.app.Application
    public void unregisterActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
    }

    @Override // android.app.Application, android.content.ContextWrapper, android.content.Context
    public void unregisterComponentCallbacks(ComponentCallbacks componentCallbacks) {
    }

    @Override // android.app.Application
    public void unregisterOnProvideAssistDataListener(Application.OnProvideAssistDataListener onProvideAssistDataListener) {
    }

    public RFixProxyApplication(String str, String str2) {
    }
}
