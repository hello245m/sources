package com.huawei.agconnect;

import android.content.Context;

@Deprecated
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class AGConnectApp {
    public static AGConnectApp getInstance() {
    }

    private static AGConnectApp getInstance(String str) {
    }

    public static AGConnectApp initialize(Context context) {
    }

    private static AGConnectApp initialize(Context context, String str) {
    }

    public abstract void setApiKey(String str);

    public abstract void setAppId(String str);

    public abstract void setClientId(String str);

    public abstract void setClientSecret(String str);

    public abstract void setCpId(String str);

    public abstract void setCustomAuthProvider(CustomAuthProvider customAuthProvider);

    public abstract void setCustomCredentialsProvider(CustomCredentialsProvider customCredentialsProvider);

    public abstract void setParam(String str, String str2);

    public abstract void setProductId(String str);
}
