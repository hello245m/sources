package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class CharsetDetector {
    private static final List<CSRecognizerInfo> ALL_CS_RECOGNIZERS = null;
    private static final int kBufSize = 8000;
    public short[] fByteStats;
    public boolean fC1Bytes;
    public String fDeclaredEncoding;
    private boolean[] fEnabledRecognizers;
    public byte[] fInputBytes;
    public int fInputLen;
    public InputStream fInputStream;
    public byte[] fRawInput;
    public int fRawLength;
    private boolean fStripTags;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class CSRecognizerInfo {
        public boolean isDefaultEnabled;
        public CharsetRecognizer recognizer;

        public CSRecognizerInfo(CharsetRecognizer charsetRecognizer, boolean z) {
        }
    }

    private void MungeInput() {
    }

    public static String[] getAllDetectableCharsets() {
    }

    public CharsetMatch detect() {
    }

    public CharsetMatch[] detectAll() {
    }

    public boolean enableInputFilter(boolean z) {
    }

    @Deprecated
    public String[] getDetectableCharsets() {
    }

    public Reader getReader(InputStream inputStream, String str) {
    }

    public String getString(byte[] bArr, String str) {
    }

    public boolean inputFilterEnabled() {
    }

    public CharsetDetector setDeclaredEncoding(String str) {
    }

    @Deprecated
    public CharsetDetector setDetectableCharset(String str, boolean z) {
    }

    public CharsetDetector setText(byte[] bArr) {
    }

    public CharsetDetector setText(InputStream inputStream) throws IOException {
    }
}
