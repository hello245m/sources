package com.tencent.xweb.xwalk.plugin;

import com.tencent.xweb.util.SchedulerConfig;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class XWalkPlugin {
    public static final String EXTRACTED_DIR_NAME = "extracted";
    public static final String FILELIST_CONFIG_NAME = "filelist.config";
    public static final int INSTALL_ERROR_CODE_CONFIG_ERROR = -1;
    public static final int INSTALL_ERROR_CODE_DO_PATCH_ERROR = -3;
    public static final int INSTALL_ERROR_CODE_EMBED_COPY_ERROR = -6;
    public static final int INSTALL_ERROR_CODE_EMBED_INFO_ERROR = -5;
    public static final int INSTALL_ERROR_CODE_EXCEPTION = -4;
    public static final int INSTALL_ERROR_CODE_NONE = 0;
    public static final int INSTALL_ERROR_CODE_UNZIP_AND_CHECK_ERROR = -2;
    public static final String PATCH_CONFIG_NAME = "patch.config";
    public static final String PATCH_DIR_NAME = "patch_temp";
    public static final String PRIVATE_CACHE_DIR_NAME = "cache";
    public int a;
    public String b;
    public String c;
    public int d;

    public final void a() {
    }

    public boolean canDownloadPatch(int i2) {
    }

    public int checkFileListConfig(int i2, boolean z) {
    }

    public abstract void checkFiles();

    public void checkKeyFiles(int i2) {
    }

    public boolean clearPatchDownloadInfo() {
    }

    public boolean doPatch(SchedulerConfig schedulerConfig) {
    }

    public int getAvailableVersion() {
    }

    public abstract String getDownloadFullPath(int i2, boolean z);

    public String getEmbedFileMD5() {
    }

    public String getEmbedFileName() {
    }

    public int getEmbedVersion() {
    }

    public String getExtractDir(int i2) {
    }

    public String getExtractFile(int i2, String str) {
    }

    public abstract List<String> getKeyFilesPath(int i2);

    public String getPatchDir(int i2) {
    }

    public String getPatchFile(int i2, String str) {
    }

    public abstract String getPluginName();

    public String getPrivateCacheDir(int i2) {
    }

    public String getVersionDir(int i2) {
    }

    public boolean hasEmbed() {
    }

    public abstract boolean isDownloadImmediately();

    public abstract boolean isIgnoreForbidDownloadCode();

    public abstract int performInstall(SchedulerConfig schedulerConfig);

    public boolean recordPatchDownloadInfo(int i2) {
    }

    public void reportUsingVersion(int i2, int i3, int i4, int i5) {
    }

    public boolean setAvailableVersion(int i2, boolean z) {
    }

    public void setEmbedInfo(int i2, String str, String str2) {
    }

    public boolean unZipAndCheck(SchedulerConfig schedulerConfig) {
    }

    public int checkFileListConfig(int i2, boolean z, String str) {
    }

    public int getAvailableVersion(boolean z) {
    }
}
