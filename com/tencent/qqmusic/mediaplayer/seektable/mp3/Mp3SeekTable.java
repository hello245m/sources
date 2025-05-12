package com.tencent.qqmusic.mediaplayer.seektable.mp3;

import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import java.io.IOException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class Mp3SeekTable implements SeekTable {
    private final Mp3FrameInfoParse.Mp3Info mInfo;

    private static long timeToBytePositionInCbr(Mp3FrameInfoParse.Mp3Info mp3Info, long j2) {
    }

    private static long timeToBytePositionInVBRIVbr(Mp3FrameInfoParse.Mp3Info mp3Info, long j2) {
    }

    private static long timeToBytePositionInXingVbr(Mp3FrameInfoParse.Mp3Info mp3Info, long j2) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.SeekTable
    public void parse(IDataSource iDataSource) throws IOException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.SeekTable
    public long seek(long j2) {
    }
}
