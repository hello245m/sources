package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class CharsetMatch implements Comparable<CharsetMatch> {
    private String fCharsetName;
    private int fConfidence;
    private InputStream fInputStream;
    private String fLang;
    private byte[] fRawInput;
    private int fRawLength;

    public CharsetMatch(CharsetDetector charsetDetector, CharsetRecognizer charsetRecognizer, int i2) {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(CharsetMatch charsetMatch) {
    }

    public int getConfidence() {
    }

    public String getLanguage() {
    }

    public String getName() {
    }

    public Reader getReader() {
    }

    public String getString() throws IOException {
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(CharsetMatch charsetMatch) {
    }

    public String getString(int i2) throws IOException {
    }

    public CharsetMatch(CharsetDetector charsetDetector, CharsetRecognizer charsetRecognizer, int i2, String str, String str2) {
    }
}
