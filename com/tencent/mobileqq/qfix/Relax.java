package com.tencent.mobileqq.qfix;

import android.content.Context;
import androidx.annotation.Keep;
import com.tencent.mobileqq.commonutils.zip.QZipFile;
import java.io.File;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class Relax {
    public static final int APPLY_KITKAT_ERROR = 5;
    public static final int K_APPLY_DISABLED = 6;
    public static final int K_APPLY_FILE_ERROR = 8;
    public static final int K_APPLY_INIT_ERROR = 2;
    public static final int K_APPLY_INJECT_ERROR = 1;
    public static final int K_APPLY_NO_SUCH_METHOD = 7;
    public static final int K_APPLY_PRELOAD_CLEAN_ERROR = 3;
    public static final int K_APPLY_RELAX_DISABLE_STUB_ASSERT_ERROR = 10;
    public static final int K_APPLY_RELAX_DISABLE_STUB_ERROR = 9;
    public static final int K_APPLY_RELAX_ERROR = 4;
    public static final int K_APPLY_SUCCESS = 0;
    public static final String K_CONFIG_FILE = "config.txt";
    public static final String K_PATCH_DEX = "classes.dex";
    public static final String[] K_PATCH_SO = null;
    public static final String TAG = "PatchLogTag";
    private static boolean sEnableLogFile;
    private static String sLogPath;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public @interface ApplyResult {
    }

    @Keep
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class AssertDisableInstallStubsForClass {
        @Keep
        public static void a() {
        }
    }

    @Keep
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class C {
        public final /* synthetic */ Relax this$0;

        public C(Relax relax) {
        }

        @Keep
        private void a() {
        }

        @Keep
        private void b() {
        }
    }

    @Keep
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class D {
        public final /* synthetic */ Relax this$0;

        public D(Relax relax) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class RelaxHolder {
        public static final Relax a = null;

        private RelaxHolder() {
        }

        public static /* synthetic */ Relax a() {
        }
    }

    private Relax() {
    }

    public /* synthetic */ Relax(AnonymousClass1 anonymousClass1) {
    }

    public static int apply(Context context, File file, File file2, File file3, boolean z) {
    }

    public static int apply(Context context, File file, File file2, InputStream inputStream, boolean z) {
    }

    public static int apply(Context context, File file, File file2, InputStream inputStream, boolean z, boolean z2) {
    }

    public static int applyInternal(Context context, File file, File file2, InputStream inputStream, boolean z, boolean z2) {
    }

    public static void configLog(boolean z, String str) {
    }

    private static native void configLogNative(boolean z, String str);

    public static void copy(InputStream inputStream, File file) {
    }

    private static byte[] getBytes(InputStream inputStream) {
    }

    public static Relax getInstance() {
    }

    public static String prettyApplyResult(int i2) {
    }

    private static native int relax(Context context, Method method, Method method2, ClassLoader classLoader, File file, byte[] bArr, boolean z);

    public static void unzipRelaxConfig(String str, QZipFile qZipFile) {
    }

    public static void unzipRelaxConfig(String str, String str2) {
    }

    public int applyPatch(Context context, File file, File file2, InputStream inputStream, boolean z) {
    }
}
