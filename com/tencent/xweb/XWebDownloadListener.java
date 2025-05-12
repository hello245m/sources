package com.tencent.xweb;

import com.tencent.xweb.XWebDownloader;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface XWebDownloadListener {
    void onDownloadCancelled();

    void onDownloadCompleted(XWebDownloader.DownloadInfo downloadInfo);

    void onDownloadFailed(XWebDownloader.DownloadInfo downloadInfo);

    void onDownloadStarted(int i2);

    void onDownloadUpdated(int i2);
}
