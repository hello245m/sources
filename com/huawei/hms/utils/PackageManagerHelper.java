package com.huawei.hms.utils;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class PackageManagerHelper {
    public final PackageManager a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class PackageStates {
        public static final PackageStates DISABLED = null;
        public static final PackageStates ENABLED = null;
        public static final PackageStates NOT_INSTALLED = null;
        public static final PackageStates SPOOF = null;
        public static final /* synthetic */ PackageStates[] a = null;

        public PackageStates(String str, int i2) {
        }

        public static PackageStates valueOf(String str) {
        }

        public static PackageStates[] values() {
        }
    }

    public PackageManagerHelper(Context context) {
    }

    public final byte[] a(String str) {
    }

    public String getApplicationName(String str) {
    }

    public long getPackageFirstInstallTime(String str) {
    }

    public String getPackageSignature(String str) {
    }

    public PackageStates getPackageStates(String str) {
    }

    public int getPackageVersionCode(String str) {
    }

    public String getPackageVersionName(String str) {
    }

    public boolean hasProvider(String str, String str2) {
    }

    public boolean isPackageFreshInstall(String str) {
    }

    public boolean verifyPackageArchive(String str, String str2, String str3) {
    }
}
