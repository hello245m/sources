package com.tencent.xweb;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.tencent.xweb.internal.IWebViewContextWrapper;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class XWebContextWrapper extends ContextWrapper implements IWebViewContextWrapper {
    public static final String TAG = "XWebContextWrapper";
    public static String sLastPackageInfoPath;
    public static PackageInfo sPackageInfo;
    public static Resources sResources;
    public static HashMap<Long, Integer> sResourcesKeyIdMap;
    public ApplicationInfo mApplicationInfo;
    public ClassLoader mClassLoader;
    public Context mContext;
    public boolean mHasAddFilterResources;
    public LayoutInflater mLayoutInflater;
    public Resources mResources;
    public Resources.Theme mTheme;

    public XWebContextWrapper(Context context) {
    }

    private boolean checkResApkExist(String str) {
    }

    private ApplicationInfo getApplicationInfoFromApkPath(Context context, String str) {
    }

    private Intent getRealIntent(Intent intent) {
    }

    private Resources getResourcesWithReflect(Context context, String str) {
    }

    public boolean addFilterResources(Resources resources, Map<Long, Integer> map) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
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

    public LayoutInflater getLayoutInflater() {
    }

    public synchronized PackageInfo getPackageInfo(Context context, String str) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public String getPackageName() {
    }

    public Resources getResources(Context context, String str) {
    }

    public HashMap<Long, Integer> getResourcesKeyIdMap(Resources resources) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
    }

    @Override // com.tencent.xweb.internal.IWebViewContextWrapper
    public ClassLoader getWebViewCoreClassLoader() {
    }

    public void setClassLoader(ClassLoader classLoader) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ComponentName startService(Intent intent) {
    }

    @Override // com.tencent.xweb.internal.IWebViewContextWrapper
    public void updateResourceLocale(Locale locale) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
    }
}
