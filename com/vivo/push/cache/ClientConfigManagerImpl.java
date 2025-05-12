package com.vivo.push.cache;

import android.content.Context;
import java.util.Set;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ClientConfigManagerImpl implements d {
    private static final String TAG = "ClientConfigManager";
    private static volatile ClientConfigManagerImpl sClientConfigManagerImpl;
    private a mAppConfigSettings;
    private Context mContext;
    private e mPushConfigSettings;

    private ClientConfigManagerImpl(Context context) {
    }

    public static synchronized ClientConfigManagerImpl getInstance(Context context) {
    }

    private void prepareAppConfig() {
    }

    private e preparePushConfigSettings() {
    }

    public void clearPush() {
    }

    public Set<String> getBlackEventList() {
    }

    public String getSuitTag() {
    }

    public String getValueByKey(String str) {
    }

    public Set<Long> getWhiteLogList() {
    }

    public boolean isCancleBroadcastReceiver() {
    }

    public boolean isDebug() {
    }

    public boolean isEnablePush() {
    }

    @Override // com.vivo.push.cache.d
    public boolean isInBlackList(long j2) {
    }

    public boolean isDebug(int i2) {
    }
}
