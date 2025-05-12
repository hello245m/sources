package com.tencent.qqmusic.mediaplayer.upstream;

import com.tencent.qqmusic.mediaplayer.AudioFormat;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IDataSource extends Closeable {
    AudioFormat.AudioType getAudioType() throws IOException;

    long getSize() throws IOException;

    void open() throws IOException;

    int readAt(long j2, byte[] bArr, int i2, int i3) throws IOException;
}
