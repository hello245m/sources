package com.huawei.hms.utils;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.huawei.hms.utils.PackageManagerHelper;
import java.util.ArrayList;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class HMSPackageManager {

    /* renamed from: m, reason: collision with root package name */
    public static HMSPackageManager f703m;

    /* renamed from: n, reason: collision with root package name */
    public static final Object f704n = null;

    /* renamed from: o, reason: collision with root package name */
    public static final Object f705o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f706p = null;
    public final Context a;
    public final PackageManagerHelper b;
    public String c;
    public String d;
    public int e;
    public String f;
    public String g;
    public String h;

    /* renamed from: i, reason: collision with root package name */
    public int f707i;

    /* renamed from: j, reason: collision with root package name */
    public int f708j;

    /* renamed from: k, reason: collision with root package name */
    public long f709k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f710l;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Runnable {
        public final /* synthetic */ HMSPackageManager a;

        public a(HMSPackageManager hMSPackageManager) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b implements Comparable<b> {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public Long f;

        public b(String str, String str2, String str3, String str4, String str5, long j2) {
        }

        public static /* synthetic */ String b(b bVar) {
        }

        public static /* synthetic */ String c(b bVar) {
        }

        public static /* synthetic */ String d(b bVar) {
        }

        public static /* synthetic */ String e(b bVar) {
        }

        public static /* synthetic */ Long f(b bVar) {
        }

        public int a(b bVar) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(b bVar) {
        }
    }

    public HMSPackageManager(Context context) {
    }

    public static /* synthetic */ Context a(HMSPackageManager hMSPackageManager) {
    }

    public static /* synthetic */ int b(HMSPackageManager hMSPackageManager) {
    }

    public static HMSPackageManager getInstance(Context context) {
    }

    public final int c() {
    }

    public final void d() {
    }

    public final void e() {
    }

    public final Pair<String, String> f() {
    }

    public final Pair<String, String> g() {
    }

    public String getHMSFingerprint() {
    }

    public String getHMSPackageName() {
    }

    public String getHMSPackageNameForMultiService() {
    }

    public PackageManagerHelper.PackageStates getHMSPackageStates() {
    }

    public PackageManagerHelper.PackageStates getHMSPackageStatesForMultiService() {
    }

    public int getHmsMultiServiceVersion() {
    }

    public int getHmsVersionCode() {
    }

    public String getInnerServiceAction() {
    }

    public String getServiceAction() {
    }

    public final ArrayList<b> h() {
    }

    public boolean hmsVerHigherThan(int i2) {
    }

    public final void i() {
    }

    public boolean isApkNeedUpdate(int i2) {
    }

    public boolean isApkUpdateNecessary(int i2) {
    }

    public boolean isUseOldCertificate() {
    }

    public final void j() {
    }

    public final boolean k() {
    }

    public void refresh() {
    }

    public void refreshForMultiService() {
    }

    public void resetMultiServiceState() {
    }

    public void setUseOldCertificate(boolean z) {
    }

    public final String a(Bundle bundle, String str) {
    }

    public final void b(String str) {
    }

    public final String a(String str) {
    }

    public final boolean b() {
    }

    public final boolean a(String str, String str2, String str3) {
    }

    public final void a() {
    }

    public static String a(int i2) {
    }
}
