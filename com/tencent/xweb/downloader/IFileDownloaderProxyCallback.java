package com.tencent.xweb.downloader;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IFileDownloaderProxyCallback {
    void onTaskFailed(String str, int i2, boolean z);

    void onTaskFinished(String str, String str2, boolean z);

    void onTaskProgressChanged(String str, long j2, long j3);
}
