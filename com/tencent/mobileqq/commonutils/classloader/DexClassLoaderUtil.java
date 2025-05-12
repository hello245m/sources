package com.tencent.mobileqq.commonutils.classloader;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import dalvik.system.DexClassLoader;
import java.io.Closeable;
import java.io.File;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class DexClassLoaderUtil {
    private static final String INFO_FILE_SUFFIX = ".dat";
    private static Handler sHandler;
    public static Looper sLooper;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class CheckMD5Task implements Runnable {
        private File file;
        private String info;
        private File infoFile;
        private String oldMD5;
        private File tempInfoFile;

        public CheckMD5Task(File file, String str, String str2, File file2, File file3) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface IHandlerCreator {
        Handler createHandler();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class InfoReader {
        public Handler a;
        public File b;
        public File c;
        public String d;
        public String e;

        public InfoReader(Handler handler, File file, File file2) {
        }

        public String a() {
        }

        public String b() {
        }

        public InfoReader c() {
        }
    }

    public static /* synthetic */ void access$000(File file, File file2, String str, String str2) {
    }

    public static /* synthetic */ void access$100(Closeable closeable) {
    }

    public static /* synthetic */ String access$200(String str) {
    }

    private static void close(Closeable closeable) {
    }

    public static DexClassLoader createDexClassLoader(String str, String str2, String str3, ClassLoader classLoader) {
    }

    @SuppressLint({"NewApi"})
    private static String getBase64String(String str) {
    }

    public static void saveAndCheckInfo(Handler handler, String str, File file, File file2, String str2, String str3) {
    }

    private static void saveInfo(File file, File file2, String str, String str2) {
    }
}
