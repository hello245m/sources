package com.tencent.xweb.downloader;

import com.tencent.xweb.DeprecatedOutsideXWebSdk;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class WXFileDownloaderBridge implements IFileDownloaderProxyCallback {
    public static IFileDownloaderProxy b;
    public IFileDownloaderProxyCallback a;

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setFileDownloaderProxy(IFileDownloaderProxy iFileDownloaderProxy) {
    }

    public boolean isValid() {
    }

    @Override // com.tencent.xweb.downloader.IFileDownloaderProxyCallback
    public void onTaskFailed(String str, int i2, boolean z) {
    }

    @Override // com.tencent.xweb.downloader.IFileDownloaderProxyCallback
    public void onTaskFinished(String str, String str2, boolean z) {
    }

    @Override // com.tencent.xweb.downloader.IFileDownloaderProxyCallback
    public void onTaskProgressChanged(String str, long j2, long j3) {
    }

    public void setCallback(IFileDownloaderProxyCallback iFileDownloaderProxyCallback) {
    }

    public int startDownload(String str, String str2, int i2) {
    }
}
