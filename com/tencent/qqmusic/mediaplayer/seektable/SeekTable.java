package com.tencent.qqmusic.mediaplayer.seektable;

import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import java.io.IOException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface SeekTable {
    void parse(IDataSource iDataSource) throws IOException, InvalidBoxException;

    long seek(long j2);
}
