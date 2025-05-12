package com.tencent.tpns.baseapi.base.logger;

import android.content.Context;
import com.tencent.tpns.baseapi.base.util.TTask;
import com.tencent.tpns.baseapi.core.net.HttpRequestCallback;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class TBaseLogger {
    public static volatile ExecutorService a;
    private static boolean b;
    private static boolean c;
    private static String d;
    private static int e;
    private static List<String> f;
    private static boolean g;
    private static boolean h;

    /* renamed from: i, reason: collision with root package name */
    private static String f1953i;

    /* renamed from: j, reason: collision with root package name */
    private static String f1954j;

    /* renamed from: k, reason: collision with root package name */
    private static Context f1955k;

    /* renamed from: l, reason: collision with root package name */
    private static DeviceInfo f1956l;

    /* renamed from: m, reason: collision with root package name */
    private static boolean f1957m;

    /* renamed from: n, reason: collision with root package name */
    private static LoggerInterface f1958n;

    /* renamed from: com.tencent.tpns.baseapi.base.logger.TBaseLogger$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements WriteFileCallback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ HttpRequestCallback c;

        public AnonymousClass1(Context context, String str, HttpRequestCallback httpRequestCallback) {
        }

        @Override // com.tencent.tpns.baseapi.base.logger.TBaseLogger.WriteFileCallback
        public void onFinished() {
        }
    }

    /* renamed from: com.tencent.tpns.baseapi.base.logger.TBaseLogger$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass2 extends TTask {
        public final /* synthetic */ WriteFileCallback a;
        public final /* synthetic */ List b;

        public AnonymousClass2(WriteFileCallback writeFileCallback, List list) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class MinPriorityThreadFactory implements ThreadFactory {
        private MinPriorityThreadFactory() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }

        public /* synthetic */ MinPriorityThreadFactory(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface WriteFileCallback {
        void onFinished();
    }

    public static /* synthetic */ DeviceInfo a(DeviceInfo deviceInfo) {
    }

    public static void addThirdLog(int i2, String str, String str2, Throwable th) {
    }

    public static /* synthetic */ String b() {
    }

    public static /* synthetic */ DeviceInfo c() {
    }

    public static /* synthetic */ Context d() {
    }

    public static void dd(String str, String str2) {
    }

    public static void e(String str, String str2) {
    }

    public static void ee(String str, String str2) {
    }

    public static void enableDebug(Context context, boolean z) {
    }

    private static String f() {
    }

    public static void flush() {
    }

    public static Context getAppContent() {
    }

    public static String getStackTraceString(Throwable th) {
    }

    public static void i(String str, String str2) {
    }

    public static void ii(String str, String str2) {
    }

    public static void init(Context context) {
    }

    public static boolean isFileEnabled() {
    }

    public static void removeOldDebugLogFiles(int i2) {
    }

    public static void setDebugLevel(int i2) {
    }

    public static void setLogger(LoggerInterface loggerInterface) {
    }

    public static synchronized void uploadLogFile(Context context, HttpRequestCallback httpRequestCallback) {
    }

    public static void v(String str, String str2) {
    }

    public static void vv(String str, String str2) {
    }

    public static void w(String str, String str2) {
    }

    public static void ww(String str, String str2) {
    }

    public static /* synthetic */ String a() {
    }

    private static void b(String str) {
    }

    public static void d(String str, String str2) {
    }

    public static void flush(WriteFileCallback writeFileCallback) {
    }

    public static /* synthetic */ String a(String str) {
    }

    private static boolean a(int i2) {
    }

    public static void dd(String str, String str2, Throwable th) {
    }

    public static void e(String str, String str2, Throwable th) {
    }

    public static void ee(String str, String str2, Throwable th) {
    }

    public static void ii(String str, String str2, Throwable th) {
    }

    public static void vv(String str, String str2, Throwable th) {
    }

    public static void w(String str, String str2, Throwable th) {
    }

    public static void ww(String str, String str2, Throwable th) {
    }

    private static void a(String str, String str2, String str3, Throwable th) {
    }

    public static void i(String str, String str2, Throwable th) {
    }

    public static void v(String str, String str2, Throwable th) {
    }

    public static void d(String str, String str2, Throwable th) {
    }

    private static String e() {
    }

    private static void a(List<String> list, WriteFileCallback writeFileCallback) {
    }
}
