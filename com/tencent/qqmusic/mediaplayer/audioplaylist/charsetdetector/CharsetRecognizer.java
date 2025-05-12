package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class CharsetRecognizer {
    public String getLanguage() {
    }

    public abstract String getName();

    public abstract CharsetMatch match(CharsetDetector charsetDetector);
}
