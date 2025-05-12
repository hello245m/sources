package com.tencent.xweb.pinus;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ChildProcessServiceWrapper {
    public static final String EXTRA_APK_VERSION = "org.chromium.base.process_launcher.extra.apk_version";
    public static final String EXTRA_PROCESS_NAME = "org.chromium.base.process_launcher.extra.process_name";
    public static final int PRE_CONNECTION_CODE_CHILD_PROCESS_DEX_FD = 4;
    public static final int PRE_CONNECTION_CODE_CRASH_DUMP_FD = 2;
    public static final int PRE_CONNECTION_CODE_CUSTOM_FONT_FD = 3;
    public static final int PRE_CONNECTION_CODE_DEX_FD = 0;
    public static final int PRE_CONNECTION_CODE_SO_FD = 1;
    public static final String PROCESS_TYPE_GPU = "gpu";
    public static final String PROCESS_TYPE_RENDER = "render";
    public static final String TAG = "ChildProcessServiceWrapper";
    public final String mApkVersion;
    public final String mBrowserProcessName;
    public Object mChildProcessService;
    public Class<?> mChildProcessServiceClass;
    public ClassLoader mClassLoader;
    public boolean mIsIsolatedProcess;
    public final String mServiceName;
    public boolean mSupportChildProcessApk;

    public ChildProcessServiceWrapper(Intent intent, Service service, Context context) {
    }

    private void createChildProcessService(Service service, Context context) throws Exception {
    }

    private void createChildProcessServiceByChromium(Service service, Context context) throws Exception {
    }

    private boolean createChildProcessServiceByCustom(Service service, Context context) {
    }

    private int getApkVersion() {
    }

    private Class<?> getChildProcessServiceClass() {
    }

    private String getProcessType() {
    }

    public static boolean isIsolatedProcess() {
    }

    private void loadXWebLibraryInIsolatedProcess(Context context, IBinder iBinder, Parcel parcel, Parcel parcel2) throws Exception {
    }

    private void loadXWebLibraryInNonIsolatedProcess(String str) throws Exception {
    }

    public static ByteBuffer[] readDexFileFromApk(FileInputStream fileInputStream) throws IOException {
    }

    private void setCustomFont(IBinder iBinder, Parcel parcel, Parcel parcel2) throws Exception {
    }

    private void setMultiProcessDowngradeByException(String str) {
    }

    public IBinder onBind(Intent intent) {
    }

    public void onCreate() {
    }

    public void onDestroy() {
    }
}
