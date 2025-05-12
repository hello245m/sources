package com.tencent.qqmusic.mediaplayer.downstream;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IDataSink extends Closeable {
    void open() throws IOException;

    int write(long j2, byte[] bArr, int i2, int i3) throws IOException;
}
