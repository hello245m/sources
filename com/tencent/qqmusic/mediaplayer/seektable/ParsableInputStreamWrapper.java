package com.tencent.qqmusic.mediaplayer.seektable;

import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ParsableInputStreamWrapper implements Closeable, Parsable {
    private final IDataSource dataSource;
    private final byte[] intBuffer;
    private final byte[] longBuffer;
    private long position;

    public ParsableInputStreamWrapper(IDataSource iDataSource) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.Parsable
    public long available() throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.Parsable
    public void readBytes(byte[] bArr, int i2, int i3) throws IOException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.Parsable
    public int readInt() throws IOException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.Parsable
    public int[] readIntArray(int i2) throws IOException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.Parsable
    public void readIntArrayInterleaved(int i2, int[]... iArr) throws IOException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.Parsable
    public long readLong() throws IOException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.Parsable
    public long[] readLongArray(int i2) throws IOException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.Parsable
    public void readLongArrayInterleaved(int i2, long[]... jArr) throws IOException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.Parsable
    public String readString(int i2) throws IOException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.Parsable
    public long skip(long j2) throws IOException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.Parsable
    public long tell() {
    }
}
