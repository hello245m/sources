package com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser;

import com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo;
import com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector;
import java.io.InputStream;
import java.util.Iterator;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class AudioPlayListItemParser {
    public static final String TAG = "AudioListItemParser";
    public CharsetDetector charsetDetector;
    public String mUri;

    public static String delSeprator(String str) {
    }

    public String guessCharsetEncoding(InputStream inputStream) {
    }

    public abstract boolean isParseSuccess();

    public abstract Iterator<TrackInfo> iterator();

    public abstract void parse() throws Exception;
}
