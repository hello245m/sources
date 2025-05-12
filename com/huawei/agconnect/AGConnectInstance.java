package com.huawei.agconnect;

import android.content.Context;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class AGConnectInstance {
    public static AGConnectInstance buildInstance(AGConnectOptions aGConnectOptions) {
    }

    public static AGConnectInstance getInstance() {
    }

    public static AGConnectInstance getInstance(String str) {
    }

    public static synchronized void initialize(Context context) {
    }

    public static synchronized void initialize(Context context, AGConnectOptionsBuilder aGConnectOptionsBuilder) {
    }

    public abstract Context getContext();

    public abstract String getIdentifier();

    public abstract AGConnectOptions getOptions();

    public abstract <T> T getService(Class<? super T> cls);
}
