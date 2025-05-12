package com.tencent.qqmusic.mediaplayer.seektable.mp3;

import java.io.IOException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class Mp3FrameInfoParse {
    private static final int[][][] BitrateTable = null;
    private static final int DECODE_ERROR_IO_READ = -3;
    private static final int DECODE_ERROR_MEMORY_ALLOC = -2;
    private static final int DECODE_ERROR_SUCCESS = 0;
    private static final int DECODE_FAIL = -1;
    private static final int[][] SAMPLE_PER_FRAME = null;
    private static final int[][] SAMPLE_RATE_TABLE = null;
    private static final String TAG = "Mp3FrameInfoParse";
    public static final int VBR_TYPE_CBR = 0;
    public static final int VBR_TYPE_VBRI = 1;
    public static final int VBR_TYPE_XING = 2;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class Mp3Info {
        public int VBRType;
        public int bit_rate;
        public int channels;
        public long duration;
        public int entry_count;
        public int entry_size;
        public long fileLengthInBytes;
        public long firstFramePosition;
        public long firstFrameSize;
        public int flag_value;
        public int idv2Size;
        public int isVbr;
        public int layer;
        public long lengthInFrames;
        public int mpeg_version;
        public long sample_rate;
        public int scale_factor;
        public long[] toc_table;
    }

    private static boolean IsMp3Header(TrackPositionDataSource trackPositionDataSource, byte[] bArr, int i2, int i3, Mp3Info mp3Info) throws IOException {
    }

    public static int parseFrameInfo(TrackPositionDataSource trackPositionDataSource, Mp3Info mp3Info) throws IOException {
    }

    private static boolean parseVBRFrameInfo(TrackPositionDataSource trackPositionDataSource, Mp3Info mp3Info) throws IOException {
    }

    private static void parseVBRIInfo(Mp3Info mp3Info, byte[] bArr, long j2) {
    }

    private static void parseXingInfo(byte[] bArr, long j2, Mp3Info mp3Info) {
    }

    private static void skipId3v2(TrackPositionDataSource trackPositionDataSource, byte[] bArr, Mp3Info mp3Info) throws IOException {
    }
}
