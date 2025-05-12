package com.tencent.qqmusic.mediaplayer.codec.mp3;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class MP3Header {
    public static final int MPEG1 = 3;
    public static final int MPEG2 = 2;
    public static final int MPEG25 = 0;
    private int[][][] bitrate;
    private int bitrate_index;
    private int framesize;
    private int layer;
    private int lsf;
    private int mode;
    private int mode_extension;
    private int padding;
    private int protection_bit;
    private int[][] samplingRate;
    private int sampling_frequency;
    private int sideinfosize;
    private int verID;

    public void decode(int i2) {
    }

    public int getFrameSize() {
    }

    public void initialize() {
    }

    public boolean isProtected() {
    }
}
