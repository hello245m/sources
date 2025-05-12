package com.tencent.rfix.loader.res;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ResourceLoader {
    private static final String TAG = "ResourceLoader";
    private static final String TEST_ASSETS_VALUE = "only_use_to_test_rfix_resource.txt";
    private static Method addAssetPathAsSharedLibraryMethod;
    private static Method addAssetPathMethod;
    private static Field assetsFiled;
    private static Object currentActivityThread;
    private static Method ensureStringBlocksMethod;
    private static AssetManager newAssetManager;
    private static Field packagesFiled;
    private static Field publicSourceDirField;
    private static Collection<WeakReference<Resources>> references;
    private static Field resDir;
    private static Field resourcePackagesFiled;
    private static Field resourcesImplFiled;
    private static Field stringBlocksField;

    private static boolean checkResUpdate(Context context) {
    }

    private static void clearPreloadTypedArrayIssue(Resources resources) {
    }

    private static void getAssetField(Resources resources) throws NoSuchFieldException {
    }

    private static Class<?> getLoadedApkClass() throws ClassNotFoundException {
    }

    private static Field[] getPackageFields() {
    }

    private static void getResources(Class<?> cls) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
    }

    public static boolean isResourceCanPatch(Context context) {
    }

    private static void isResourceCanPatchInner(Context context) throws Throwable {
    }

    public static boolean monkeyPatch(Context context, String str) {
    }

    public static void monkeyPatchExistingResources(Context context, String str) throws Throwable {
    }

    private static void setLoadedApk(String str, ApplicationInfo applicationInfo, Field[] fieldArr) throws IllegalAccessException {
    }

    private static void setResource() throws IllegalAccessException, NoSuchFieldException {
    }

    private static void setWebViewN(Context context, String str) {
    }

    private static boolean shouldAddSharedLibraryAssets(ApplicationInfo applicationInfo) {
    }
}
