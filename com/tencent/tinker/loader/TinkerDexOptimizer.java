package com.tencent.tinker.loader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.IBinder;
import android.os.ResultReceiver;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Comparator;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class TinkerDexOptimizer {
    public static final ResultReceiver sEmptyResultReceiver = null;
    public static final Handler sHandler = null;
    public static final IBinder[] sPMSBinderProxy = null;
    public static final int[] sPerformDexOptSecondaryTransactionCode = null;
    public static final PackageManager[] sSynchronizedPMCache = null;

    /* renamed from: com.tencent.tinker.loader.TinkerDexOptimizer$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class AnonymousClass1 implements Comparator<File> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(File file, File file2) {
        }
    }

    /* renamed from: com.tencent.tinker.loader.TinkerDexOptimizer$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class AnonymousClass2 implements InvocationHandler {
        public final /* synthetic */ IBinder val$pmsBinderProxy;

        public AnonymousClass2(IBinder iBinder) {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class OptimizeWorker {
        public static ClassLoader patchClassLoaderStrongRef;
        public final ResultCallback callback;
        public final Context context;
        public final File dexFile;
        public final File optimizedDir;
        public final String targetISA;
        public final boolean useDLC;
        public final boolean useInterpretMode;

        public OptimizeWorker(Context context, File file, File file2, boolean z, boolean z2, String str, ResultCallback resultCallback) {
        }

        public boolean run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface ResultCallback {
        void onFailed(File file, File file2, Throwable th);

        void onStart(File file, File file2);

        void onSuccess(File file, File file2, File file3);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class StreamConsumer {
        public static final Executor STREAM_CONSUMER = null;

        /* renamed from: com.tencent.tinker.loader.TinkerDexOptimizer$StreamConsumer$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static class AnonymousClass1 implements Runnable {
            public final /* synthetic */ InputStream val$is;

            public AnonymousClass1(InputStream inputStream) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        private StreamConsumer() {
        }

        public static void consumeInputStream(InputStream inputStream) {
        }
    }

    public static void createFakeODexPathStructureOnDemand(String str) {
    }

    public static void executePMSShellCommand(Context context, String[] strArr) throws IllegalStateException {
    }

    public static IBinder getPMSBinderProxy(Context context) throws IllegalStateException {
    }

    public static final PackageManager getSynchronizedPackageManager(Context context) throws IllegalStateException {
    }

    public static void interpretDex2Oat(String str, String str2, String str3) throws Exception {
    }

    public static boolean optimizeAll(Context context, Collection<File> collection, File file, boolean z, ResultCallback resultCallback) {
    }

    public static void performBgDexOptJob(Context context) throws IllegalStateException {
    }

    public static void performDexOptSecondary(Context context) throws IllegalStateException {
    }

    public static void performDexOptSecondaryByTransactionCode(Context context) throws IllegalStateException {
    }

    public static void registerDexModule(Context context, String str) throws IllegalStateException {
    }

    public static void triggerPMDexOptOnDemand(Context context, String str, String str2) throws Exception {
    }

    public static boolean triggerSecondaryDexOpt(Context context, File file, File file2, boolean z) {
    }

    public static boolean waitUntilFileGeneratedOrTimeout(Context context, String str, Long... lArr) {
    }

    public static boolean optimizeAll(Context context, Collection<File> collection, File file, boolean z, boolean z2, String str, ResultCallback resultCallback) {
    }
}
