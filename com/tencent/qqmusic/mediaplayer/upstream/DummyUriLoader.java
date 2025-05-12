package com.tencent.qqmusic.mediaplayer.upstream;

import android.net.Uri;
import com.tencent.qqmusic.mediaplayer.upstream.UriLoader;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class DummyUriLoader implements UriLoader {
    private final Uri uri;

    public DummyUriLoader() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.UriLoader
    public void cancelLoading() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.UriLoader
    public boolean isLoading() {
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.UriLoader
    public void startLoading(int i2, TimeUnit timeUnit, UriLoader.Callback callback) {
    }

    public DummyUriLoader(Uri uri) {
    }
}
