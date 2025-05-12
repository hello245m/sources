package com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser;

import com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class CueItemParser extends AudioPlayListItemParser {
    public static final String TAG = "CueItemParser";
    private LineNumberReader mReader;
    public List<TrackInfo> mTrackInfoList;

    public CueItemParser(String str) {
    }

    private long convertTimeStrToMs(String str) throws ParseException {
    }

    private String guessCharsetEncoding(String str) throws IOException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.AudioPlayListItemParser
    public boolean isParseSuccess() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.AudioPlayListItemParser
    public Iterator<TrackInfo> iterator() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.AudioPlayListItemParser
    public void parse() throws ParseException {
    }
}
