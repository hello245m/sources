package com.tencent.tinker.loader.hotplug.interceptor;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PersistableBundle;
import com.tencent.tinker.loader.TinkerRuntimeException;
import java.lang.reflect.Field;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class TinkerHackInstrumentation extends Instrumentation {
    public final Object mActivityThread;
    public final Field mInstrumentationField;
    public final Instrumentation mOriginal;

    public TinkerHackInstrumentation(Instrumentation instrumentation, Object obj, Field field) throws TinkerRuntimeException {
    }

    public static TinkerHackInstrumentation create(Context context) {
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Instrumentation
    public void callActivityOnNewIntent(Activity activity, Intent intent) {
    }

    public final void copyAllFields(Instrumentation instrumentation) throws IllegalAccessException {
    }

    public final void fixActivityParams(Activity activity, ActivityInfo activityInfo) {
    }

    public void install() throws IllegalAccessException {
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) throws InstantiationException, IllegalAccessException {
    }

    public final boolean processIntent(ClassLoader classLoader, Intent intent) {
    }

    public void uninstall() throws IllegalAccessException {
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
    }
}
