package com.tencent.qqmusic.mediaplayer.network;

import java.net.URL;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IMediaHTTPConnection {
    boolean connect(URL url, Map<String, String> map);

    void disconnect();

    String getMIMEType();

    long getSize();

    String getUri();

    int readAt(long j2, byte[] bArr, int i2, int i3);
}
