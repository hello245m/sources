package com.tencent.tinker.loader.shareutil;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ShareFileLockHelper implements Closeable {
    public final FileLock fileLock;
    public final FileOutputStream outputStream;

    public ShareFileLockHelper(File file) throws IOException {
    }

    public static ShareFileLockHelper getFileLock(File file) throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
