package com.huawei.hms.framework.common;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class CreateFileUtil {
    private static final String EXTERNAL_FILE_NAME = "com.huawei.libcore.io.ExternalStorageFile";
    private static final String EXTERNAL_INPUTSTREAM_NAME = "com.huawei.libcore.io.ExternalStorageFileInputStream";
    private static final String EXTERNAL_OUTPUTSTREAM_NAME = "com.huawei.libcore.io.ExternalStorageFileOutputStream";
    private static final String RANDOM_ACCESS_FILE_NAME = "com.huawei.libcore.io.ExternalStorageRandomAccessFile";
    private static final String TAG = "CreateFileUtil";

    public static void deleteSecure(File file) {
    }

    public static String getCacheDirPath(Context context) {
    }

    public static String getCanonicalPath(String str) {
    }

    @Deprecated
    public static boolean isPVersion() {
    }

    public static File newFile(String str) {
    }

    public static FileInputStream newFileInputStream(String str) throws FileNotFoundException {
    }

    public static FileOutputStream newFileOutputStream(File file) throws FileNotFoundException {
    }

    public static RandomAccessFile newRandomAccessFile(String str, String str2) throws FileNotFoundException {
    }

    public static void deleteSecure(String str) {
    }
}
