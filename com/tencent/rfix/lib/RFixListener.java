package com.tencent.rfix.lib;

import androidx.annotation.Keep;
import com.tencent.rfix.lib.event.ConfigEvent;
import com.tencent.rfix.lib.event.DownloadEvent;
import com.tencent.rfix.lib.event.InstallEvent;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface RFixListener {
    void onConfig(boolean z, int i2, ConfigEvent configEvent);

    void onDownload(boolean z, int i2, DownloadEvent downloadEvent);

    void onInstall(boolean z, int i2, InstallEvent installEvent);
}
