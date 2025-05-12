package com.tencent.xweb.updater;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import com.tencent.xweb.util.PatchFileConfig;
import java.util.ArrayList;
import java.util.Map;

@SuppressLint({"ApplySharedPref"})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebRuntimeInstaller {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int ERROR_DOPATCH_FAILED = -3;
    public static final int ERROR_DOPATCH_MD5_FAILED = -4;
    public static final int ERROR_DOWNLOAD_FAILED = -1;
    public static final int ERROR_DOWNLOAD_MD5_FAILED = -2;
    public static final int ERROR_EMBED_INSTALL_FAIL_APK_COPY_FAIL = -203;
    public static final int ERROR_EMBED_INSTALL_FAIL_VERSION_LOW = -201;
    public static final int ERROR_EMBED_INSTALL_FAIL_VERSION_TRIED = -202;
    public static final int ERROR_EXTRACT_RESOURCE_FAILED = -5;
    public static final int ERROR_EXTRACT_RESOURCE_FAILED_FOR_RETRY = -12;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_SET_VERNUM = -101;
    public static final int ERROR_SHARED_MODE_EXCEED_MAX_COUNT = -7;
    public static final int ERROR_SHARED_MODE_FORCE_DOWNLOAD = -6;
    public static final int ERROR_SHARED_MODE_NO_CONTENT_RESOLVER = -8;
    public static final int ERROR_SHARED_MODE_NO_PROVIDER = -9;
    public static final int ERROR_SHARED_MODE_OTHER = -11;
    public static final int ERROR_SHARED_MODE_TRY_AGAIN = -10;
    public static final int RES_EXTRACTOR_MAXTIMES = 1;
    public static final String SP_KEY_INSTALLED_EMBED_VERSION = "INSTALLED_EMBED_VERSION";
    public static final String SP_KEY_INSTALLED_EMBED_VERSION_TIME = "INSTALLED_EMBED_VERSION_TIME";
    public static final String TAG = "XWebRuntimeInstaller";
    public static final int UPDATE_BIZ_TYPE_RUNTIME_PACKAGE = 1;
    public static final int UPDATE_BIZ_TYPE_RUNTIME_PATCH = 2;
    public static final int XWALK_GET_FROM_PROVIDER_MAX_COUNT = 2;
    public static int mCurrentTimeForRetryRes;
    public final XWalkRuntimeUpdateListener mRuntimeUpdateListener;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class ErrorInfo {
        public int copyFailedCount;
        public int errorCode;
        public int extractFailedCount;
        public int extractRetryFailedCount;
        public int md5FailedCount;
        public int noMatchedVersionCount;
        public int readFileListFailedCount;
        public int setVersionFailedCount;
        public int targetVer;
    }

    public XWebRuntimeInstaller() {
    }

    public static void clearLastTryEmbedInstallVersion() {
    }

    private void convertInstallRuntimeResultToErrorInfo(ErrorInfo errorInfo, int i2) {
    }

    public static boolean doPatch(String str, int i2, int i3, int i4) {
    }

    public static boolean doPatchAddFile(ArrayList<PatchFileConfig> arrayList, int i2) {
    }

    public static boolean doPatchModifyFile(ArrayList<PatchFileConfig> arrayList, int i2, int i3) {
    }

    public static boolean doPatchRemoveFile(ArrayList<PatchFileConfig> arrayList, int i2) {
    }

    public static int getLastTryEmbedInstallVersion(String str) {
    }

    private ArrayList<Integer> getTryVersionList(UpdateConfig updateConfig) {
    }

    private boolean isProviderExist(ContentResolver contentResolver, String str) {
    }

    private boolean tryCopyVersionFiles(ContentResolver contentResolver, String str, int i2, Map<String, String> map, ErrorInfo errorInfo) {
    }

    private Map<String, String> tryGetFileList(ContentResolver contentResolver, String str, int i2) {
    }

    private Integer tryInstallRuntimeInternal(int i2, String str, String str2) {
    }

    private void updateRuntimeFromEmbedInternal() {
    }

    public XWalkRuntimeUpdateListener getRuntimeUpdateListener() {
    }

    public Integer tryInstallRuntime(UpdateConfig updateConfig) {
    }

    public Integer tryInstallRuntimeWithReport(UpdateConfig updateConfig, int i2) {
    }

    public boolean tryLoadLocalAssetRuntime(Context context, boolean z) {
    }

    public boolean updateRuntime(UpdateConfig updateConfig) {
    }

    public void updateRuntimeFromEmbed() {
    }

    public void updateRuntimeFromLocal() {
    }

    public synchronized ErrorInfo updateRuntimeFromProvider(XWebCoreScheduler xWebCoreScheduler) {
    }

    public XWebRuntimeInstaller(XWalkRuntimeUpdateListener xWalkRuntimeUpdateListener) {
    }
}
