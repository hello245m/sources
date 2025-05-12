package com.tencent.tinker.loader.shareutil;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipFile;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class SharePatchFileUtil {
    public static char[] hexDigits;

    public static boolean checkIfMd5Valid(String str) {
    }

    public static boolean checkResourceArscMd5(File file, String str) {
    }

    public static String checkTinkerLastUncaughtCrash(Context context) {
    }

    @SuppressLint({"NewApi"})
    public static void closeQuietly(Object obj) {
    }

    public static void closeZip(ZipFile zipFile) {
    }

    public static void copyFileUsingStream(File file, File file2) throws IOException {
    }

    public static final boolean deleteDir(String str) {
    }

    public static void ensureFileDirectory(File file) {
    }

    public static final String getMD5(InputStream inputStream) {
    }

    public static File getPatchDirectory(Context context) {
    }

    public static File getPatchInfoFile(String str) {
    }

    public static File getPatchInfoLockFile(String str) {
    }

    public static File getPatchLastCrashFile(Context context) {
    }

    public static File getPatchTempDirectory(Context context) {
    }

    public static String getPatchVersionDirectory(String str) {
    }

    public static String getPatchVersionFile(String str) {
    }

    public static final boolean isLegalFile(File file) {
    }

    public static boolean isRawDexFile(String str) {
    }

    public static String loadDigestes(JarFile jarFile, JarEntry jarEntry) throws Exception {
    }

    public static String optimizedPathFor(File file, File file2) {
    }

    public static final boolean safeDeleteFile(File file) {
    }

    public static final boolean shouldAcceptEvenIfIllegal(File file) {
    }

    public static boolean verifyDexFileMd5(File file, String str) {
    }

    public static boolean verifyFileMd5(File file, String str) {
    }

    public static final boolean deleteDir(File file) {
    }

    public static boolean verifyDexFileMd5(File file, String str, String str2) {
    }

    public static String getMD5(byte[] bArr) {
    }

    public static String getMD5(File file) {
    }
}
