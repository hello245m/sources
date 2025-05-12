package com.tencent.qqmusic.mediaplayer.seektable;

import java.io.IOException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface Parsable {
    long available() throws IOException;

    void readBytes(byte[] bArr, int i2, int i3) throws IOException;

    int readInt() throws IOException;

    int[] readIntArray(int i2) throws IOException;

    void readIntArrayInterleaved(int i2, int[]... iArr) throws IOException;

    long readLong() throws IOException;

    long[] readLongArray(int i2) throws IOException;

    void readLongArrayInterleaved(int i2, long[]... jArr) throws IOException;

    String readString(int i2) throws IOException;

    long skip(long j2) throws IOException;

    long tell();
}
