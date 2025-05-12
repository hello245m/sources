package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface TransferListener {
    void onBytesTransferError(long j2, long j3, long j4);

    void onBytesTransferred(long j2, long j3);

    void onBytesTransferring(long j2, long j3);

    void onTransferEnd();

    void onTransferStart();
}
