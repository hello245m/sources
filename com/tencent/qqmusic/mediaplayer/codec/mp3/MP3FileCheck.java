package com.tencent.qqmusic.mediaplayer.codec.mp3;

import java.io.RandomAccessFile;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class MP3FileCheck {
    private static final String TAG = "MP3FileCheck";
    private byte[] buf;
    private int endPos;
    private boolean eof;
    private int frameCount;
    private boolean hasCheck;
    private boolean hasID3V2;
    private MP3Header header;
    private int headerMask;
    private boolean isMP3;
    private String mFilePath;
    private int mID3V2Size;
    private RandomAccessFile mRandomAccessFile;
    private int pos;
    private int skipped;
    private boolean sync;

    public MP3FileCheck(String str) {
    }

    private boolean available(int i2, int i3) {
    }

    private int byte2int(byte[] bArr, int i2) {
    }

    private boolean checkAndSeekID3V2Tag() {
    }

    private void closeFileStream() {
    }

    private int fillBuffer(byte[] bArr, int i2, int i3) {
    }

    public static boolean isMp3File(String str) {
    }

    private void nextFrameHeader() {
    }

    private void seekTo(int i2) {
    }

    private boolean syncFrame() {
    }

    public void fileCheck() {
    }

    public int getFrameSize() {
    }

    private boolean isMp3File() {
    }
}
