package com.tencent.tinker.loader;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import java.io.File;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class NewClassLoaderInjector {
    private NewClassLoaderInjector() {
    }

    @SuppressLint({"NewApi"})
    public static ClassLoader createNewClassLoader(ClassLoader classLoader, File file, boolean z, boolean z2, String... strArr) throws Throwable {
    }

    public static void doInject(Application application, ClassLoader classLoader) throws Throwable {
    }

    public static Field findField(Class<?> cls, String str) throws Throwable {
    }

    public static ClassLoader inject(Application application, ClassLoader classLoader, File file, boolean z, List<File> list) throws Throwable {
    }

    public static ClassLoader triggerDex2Oat(Context context, File file, boolean z, String... strArr) throws Throwable {
    }
}
