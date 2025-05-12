package com.tencent.xweb.updater;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class EmbededUpdateConfig extends UpdateConfig {
    public EmbededUpdateConfig(int i2) {
    }

    @Override // com.tencent.xweb.updater.UpdateConfig
    public boolean checkValid() {
    }

    public abstract boolean copyPackageToLocal(String str, String str2);

    @Override // com.tencent.xweb.updater.UpdateConfig
    public String getDownloadPath() {
    }
}
