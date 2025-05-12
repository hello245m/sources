package com.tencent.mobileqq.commonutils.classloader;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class SystemClassLoaderInjector {
    public static final String SUCCESS = "Success";
    private static final String TAG = "SystemLoaderInjector";

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class SpeedyDexClassLoader extends BaseDexClassLoader {
        public SpeedyDexClassLoader(String str, File file, String str2, ClassLoader classLoader) {
        }
    }

    public static Object appendArray(Object obj, Object obj2, boolean z) {
    }

    public static Object combineArray(Object obj, Object obj2, boolean z) {
    }

    public static Object getDexElements(Object obj) throws IllegalArgumentException, NoSuchFieldException, IllegalAccessException {
    }

    private static Object getField(Object obj, Class<?> cls, String str) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
    }

    public static Object getPathList(Object obj) throws IllegalArgumentException, NoSuchFieldException, IllegalAccessException, ClassNotFoundException {
    }

    public static String inject(Context context, String str, String str2, boolean z) {
    }

    @SuppressLint({"NewApi"})
    private static String injectAboveEqualApiLevel14(Context context, String str, String str2, boolean z, boolean z2) {
    }

    @TargetApi(14)
    private static String injectBelowApiLevel14(Context context, String str, String str2, boolean z) {
    }

    private static String injectForR(Context context, String str, String str2, String str3, boolean z, boolean z2) {
    }

    private static String injectInAliyunOs(Context context, String str, String str2, boolean z) {
    }

    public static Object makeDexElements(Object obj, List<File> list, File file, ClassLoader classLoader) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    }

    public static Object removeElementFromArray(Object obj, int i2) {
    }

    public static void setField(Object obj, Class<?> cls, String str, Object obj2) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
    }

    @SuppressLint({"NewApi"})
    private static String unloadDexAboveEqualApiLevel14(Context context, int i2) {
    }

    @TargetApi(14)
    private static String unloadDexBelowApiLevel14(Context context, int i2) {
    }

    public static String unloadDexElement(Context context, int i2) {
    }

    private static String unloadDexInAliyunOs(Context context, int i2) {
    }

    public static String inject(Context context, String str, String str2, String str3, boolean z) {
    }

    @SuppressLint({"NewApi"})
    private static String injectAboveEqualApiLevel14(Context context, String str, String str2, String str3, boolean z, boolean z2) {
    }

    public static String inject(Context context, String str, String str2, boolean z, boolean z2) {
    }
}
