package com.tencent.rfix.loader.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class PatchFileUtils {
    public static final int MAX_EXTRACT_ATTEMPTS = 2;
    private static final String TAG = "RFix.FileUtils";

    public static boolean checkMd5AndExtractZipEntry(ZipFile zipFile, ZipEntry zipEntry, File file) throws IOException {
    }

    @SuppressLint({"NewApi"})
    public static void closeQuietly(Object obj) {
    }

    private static void copyEntry(ZipFile zipFile, ZipEntry zipEntry, File file) throws IOException {
    }

    public static void copyFileUsingStream(File file, File file2) throws IOException {
    }

    public static boolean deleteFile(File file) {
    }

    public static boolean extractZip(File file, String str, File file2) {
    }

    public static boolean extractZipEntry(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
    }

    public static File getPatchDebugPropFile(Context context) {
    }

    public static File getPatchDirectory(Context context) {
    }

    public static File getPatchInfoFile(String str) {
    }

    public static File getPatchInfoLockFile(String str) {
    }

    public static File getPatchInstallRecordFile(String str) {
    }

    public static File getPatchLastCrashFile(Context context) {
    }

    public static File getPatchRemoteVerifyInfoFile(String str) {
    }

    public static File getPatchTempDirectory(Context context) {
    }

    public static File getPatchVersionDirectory(String str, String str2) {
    }

    public static File getPatchVersionFile(String str, String str2) {
    }

    public static boolean isLegalFile(File file) {
    }

    public static String loadZipEntry(JarFile jarFile, JarEntry jarEntry) throws Exception {
    }

    private static void makeParent(File file) {
    }
}
