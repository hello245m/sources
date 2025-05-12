package com.tencent.tinker.loader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class TinkerResourcePatcher {
    public static Method addAssetPathAsSharedLibraryMethod;
    public static Method addAssetPathMethod;
    public static Field assetsFiled;
    public static Object currentActivityThread;
    public static Method ensureStringBlocksMethod;
    public static AssetManager newAssetManager;
    public static Field packagesFiled;
    public static Field publicSourceDirField;
    public static Collection<WeakReference<Resources>> references;
    public static Field resDir;
    public static Field resourcePackagesFiled;
    public static Field resourcesImplFiled;
    public static Field stringBlocksField;

    public static boolean checkResUpdate(Context context) {
    }

    public static void clearPreloadTypedArrayIssue(Resources resources) {
    }

    public static void isResourceCanPatch(Context context) throws Throwable {
    }

    public static void monkeyPatchExistingResources(Context context, String str) throws Throwable {
    }

    public static boolean shouldAddSharedLibraryAssets(ApplicationInfo applicationInfo) {
    }
}
