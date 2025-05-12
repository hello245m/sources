package com.tencent.qqmusic.mediaplayer.codec.wav;

import java.io.IOException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class WaveReader {
    private static final String TAG = "WaveReader";
    private static final int WAV_FORMAT = 1463899717;
    private static final int WAV_FORMAT_CHUNK_ID = 1718449184;
    private static final int WAV_HEADER_CHUNK_ID = 1380533830;
    private static final int WAV_HEADER_SIZE = 50;

    private static short byteToShortLE(byte b, byte b2) {
    }

    public static boolean isWavFormat(String str) {
    }

    private static int readUnsignedInt(byte[] bArr, int i2) throws IOException {
    }

    private static int readUnsignedIntLE(byte[] bArr, int i2) throws IOException {
    }

    private static short readUnsignedShortLE(byte[] bArr, int i2) throws IOException {
    }
}
