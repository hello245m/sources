package com.tencent.qqmusic.mediaplayer.network;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class DefaultMediaHTTPConnection implements IMediaHTTPConnection {
    private static final int CONNECT_TIMEOUT_MS = 30000;
    private static final int HTTP_TEMP_REDIRECT = 307;
    private static final int MAX_REDIRECTS = 20;
    private static final String TAG = "MediaHTTPConnection";
    private static final boolean VERBOSE = false;
    private boolean mAllowCrossDomainRedirect;
    private boolean mAllowCrossProtocolRedirect;
    private HttpURLConnection mConnection;
    private long mCurrentOffset;
    private Map<String, String> mHeaders;
    private InputStream mInputStream;
    private long mTotalSize;
    private URL mURL;

    private boolean filterOutInternalHeaders(String str, String str2) {
    }

    private static final boolean isLocalHost(URL url) {
    }

    private boolean parseBoolean(String str) {
    }

    private void seekTo(long j2) throws IOException {
    }

    private void teardownConnection() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection
    public boolean connect(URL url, Map<String, String> map) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection
    public void disconnect() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection
    public String getMIMEType() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection
    public long getSize() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection
    public String getUri() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection
    public int readAt(long j2, byte[] bArr, int i2, int i3) {
    }
}
