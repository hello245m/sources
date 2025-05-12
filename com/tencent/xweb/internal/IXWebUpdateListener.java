package com.tencent.xweb.internal;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IXWebUpdateListener {
    public static final int CHECK_FAILED = 1;
    public static final int DOWNLOAD_FAILED = 3;
    public static final int INSTALL_FAILED = 4;
    public static final int NO_NETWORK = 2;

    boolean onNeedDownload();

    void onUpdateCancelled();

    void onUpdateCompleted();

    void onUpdateFailed(int i2);

    void onUpdateProgress(int i2);

    void onUpdateStart();
}
