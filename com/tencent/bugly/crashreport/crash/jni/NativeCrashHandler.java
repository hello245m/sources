package com.tencent.bugly.crashreport.crash.jni;

import android.annotation.SuppressLint;
import android.content.Context;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.ab;
import com.tencent.bugly.proguard.ad;
import com.tencent.bugly.proguard.am;
import com.tencent.bugly.proguard.av;
import com.tencent.bugly.proguard.r;
import java.util.ArrayList;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class NativeCrashHandler implements r {
    private static NativeCrashHandler a = null;
    private static int b = 1;
    private static String g = null;
    private static boolean h = false;

    /* renamed from: o, reason: collision with root package name */
    private static boolean f956o = true;
    private final Context c;
    private final ab d;
    private final am e;
    private NativeExceptionHandler f;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f957i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f958j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f959k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f960l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f961m;

    /* renamed from: n, reason: collision with root package name */
    private av f962n;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Runnable {
        public final /* synthetic */ NativeCrashHandler a;

        public a(NativeCrashHandler nativeCrashHandler) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    @SuppressLint({"SdCardPath"})
    private NativeCrashHandler(Context context, ab abVar, av avVar, am amVar, boolean z, String str) {
    }

    public static /* synthetic */ Context a(NativeCrashHandler nativeCrashHandler) {
    }

    public static /* synthetic */ NativeExceptionHandler b(NativeCrashHandler nativeCrashHandler) {
    }

    public static /* synthetic */ av c(NativeCrashHandler nativeCrashHandler) {
    }

    private synchronized void d() {
    }

    public static synchronized String getDumpFilePath() {
    }

    public static synchronized NativeCrashHandler getInstance(Context context, ab abVar, av avVar, ad adVar, am amVar, boolean z, String str) {
    }

    private native String getProperties(String str);

    private native String getSoCpuAbi();

    public static boolean isShouldHandleInJava() {
    }

    public static synchronized void setDumpFilePath(String str) {
    }

    public static void setShouldHandleInJava(boolean z) {
    }

    @Override // com.tencent.bugly.proguard.r
    public boolean appendLogToNative(String str, String str2, String str3) {
    }

    public native boolean appendNativeLog(String str, String str2, String str3);

    public native boolean appendWholeNativeLog(String str);

    public void checkUploadRecordCrash() {
    }

    public void disableCatchAnrTrace() {
    }

    public void dumpAnrNativeStack() {
    }

    public void enableCatchAnrTrace() {
    }

    public boolean filterSigabrtSysLog() {
    }

    public native void getFd();

    @Override // com.tencent.bugly.proguard.r
    public String getLogFromNative() {
    }

    public NativeExceptionHandler getNativeExceptionHandler() {
    }

    public native String getNativeKeyValueList();

    public native String getNativeLog();

    public native void getProcessInfoAnr();

    public String getRunningCpuAbi() {
    }

    public String getSystemProperty(String str) {
    }

    public boolean isEnableCatchAnrTrace() {
    }

    public synchronized boolean isUserOpened() {
    }

    public native void modifyProcessingState(int i2, boolean z);

    public synchronized void onStrategyChanged(StrategyBean strategyBean) {
    }

    public boolean putKeyValueToNative(String str, String str2) {
    }

    public native boolean putNativeKeyValue(String str, String str2);

    public native void recordProcessingState(String str, int i2);

    public native String regist(String str, String str2, String str3, String str4, boolean z, int i2);

    public void removeEmptyNativeRecordFiles() {
    }

    public native String removeNativeKeyValue(String str);

    public void resendSigquit() {
    }

    public void saveAdditionalAttachmentPaths(String str) {
    }

    public native void saveAdditionalAttachmentPathsNative(String str);

    public boolean setAdditionalAttachmentPaths(ArrayList<String> arrayList) {
    }

    public native void setAdditionalAttachmentPathsNative(String[] strArr);

    public native void setCrashProcessingInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7);

    public boolean setNativeAppChannel(String str) {
    }

    public boolean setNativeAppPackage(String str) {
    }

    public boolean setNativeAppVersion(String str) {
    }

    public boolean setNativeEnableSubProcess(Boolean bool) {
    }

    public native void setNativeInfo(int i2, String str);

    @Override // com.tencent.bugly.proguard.r
    public boolean setNativeIsAppForeground(boolean z) {
    }

    public boolean setNativeLaunchTime(long j2) {
    }

    public boolean setNativeUserId(String str) {
    }

    public synchronized void setUserOpened(boolean z) {
    }

    public synchronized void startNativeMonitor() {
    }

    public native void testCrash();

    public void testNativeCrash() {
    }

    public boolean tryLoadSo(String str, boolean z) {
    }

    public void unBlockSigquit(boolean z) {
    }

    public native String unregist();

    public static /* synthetic */ boolean a(NativeCrashHandler nativeCrashHandler, String str) {
    }

    public static /* synthetic */ boolean b() {
    }

    public static /* synthetic */ String c() {
    }

    private synchronized void a(boolean z) {
    }

    private synchronized void b(boolean z) {
    }

    private synchronized void c(boolean z) {
    }

    public static synchronized NativeCrashHandler getInstance() {
    }

    public void testNativeCrash(boolean z, boolean z2, boolean z3) {
    }

    public static void a() {
    }

    private boolean a(int i2, String str) {
    }
}
