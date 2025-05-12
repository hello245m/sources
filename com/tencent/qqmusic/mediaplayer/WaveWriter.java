package com.tencent.qqmusic.mediaplayer;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class WaveWriter {
    private static final int OUTPUT_STREAM_BUFFER = 16384;
    private static final String TAG = "WaveWriter";
    private int mBytesWritten;
    private int mChannels;
    private File mOutFile;
    private BufferedOutputStream mOutStream;
    private int mSampleBits;
    private int mSampleRate;
    private ByteArrayOutputStream mTmpStream;

    public WaveWriter(String str, String str2, int i2, int i3, int i4) {
    }

    private short[] interpolate(int i2, int i3, short[] sArr) {
    }

    private byte[] reSample(byte[] bArr, int i2, int i3, int i4) {
    }

    private static void writeUnsignedShortLE(ByteArrayOutputStream byteArrayOutputStream, short s2) throws IOException {
    }

    private void writeWaveHeader() throws IOException {
    }

    public byte[] changeStereoToMono(byte[] bArr) {
    }

    public void closeWaveFile() throws IOException {
    }

    public boolean createWaveFile() throws IOException {
    }

    public int getChannels() {
    }

    public boolean reSampler() {
    }

    public boolean reSamplerTo8K() {
    }

    public void setSampleByte(int i2) {
    }

    public void write(short[] sArr, int i2, int i3) throws IOException {
    }

    public void writeDone() {
    }

    public void write(short[] sArr, short[] sArr2, int i2, int i3) throws IOException {
    }

    public WaveWriter(File file, int i2, int i3, int i4) {
    }
}
