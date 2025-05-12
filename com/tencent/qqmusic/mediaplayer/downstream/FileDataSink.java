package com.tencent.qqmusic.mediaplayer.downstream;

import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class FileDataSink implements IDataSink {
    private static final String TAG = "FileDataSink";
    private long currentPosition;
    private final String filePath;
    private boolean opened;
    private RandomAccessFile randomAccessFile;

    public FileDataSink(String str) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.downstream.IDataSink
    public void open() throws IOException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.downstream.IDataSink
    public int write(long j2, byte[] bArr, int i2, int i3) throws IOException {
    }
}
