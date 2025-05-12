package com.tencent.tpns.baseapi.base.device;

import android.content.Context;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class GUIDInfo {
    public int encrypt;
    public int errCode;
    public long expiredSeconds;
    public long guid;
    public long guidLastAccessid;
    public String mqttPortList;
    public String mqttServer;
    public String mqttServerIP;
    public long mqttServerRefreshTime;
    public String passWord;
    public long refreshTime;
    public int refuseRate;
    public String result;
    public String token;
    public String tokenList;
    public String userName;

    public static GUIDInfo getGuidInfoFromShar(Context context) {
    }

    public boolean isError() {
    }

    public void saveGuidToSha(Context context) {
    }
}
