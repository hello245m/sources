package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException;
import com.tencent.qqmusic.mediaplayer.seektable.Parsable;
import java.io.IOException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class Stsc extends FullBox {
    public int entryCount;
    public int[] firstChunk;
    public int[] sampleDescIndex;
    public int[] samplesPerChunk;

    public int getEntryCount() {
    }

    public int[] getFirstChunk() {
    }

    public int[] getSampleDescIndex() {
    }

    public int[] getSamplesPerChunk() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.FullBox, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Box, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box
    public void parse(Parsable parsable, Box box) throws IOException, InvalidBoxException {
    }
}
