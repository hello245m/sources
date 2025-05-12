package com.tencent.rfix.loader.utils;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class FileLockHelper implements Closeable {
    private static final int LOCK_WAIT_EACH_TIME = 10;
    private static final int MAX_LOCK_ATTEMPTS = 2;
    private static final String TAG = "RFix.FileLockHelper";
    private final FileLock fileLock;
    private final FileOutputStream outputStream;

    private FileLockHelper(File file) throws IOException {
    }

    public static FileLockHelper getFileLock(File file) throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
