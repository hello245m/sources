package com.huawei.agconnect.config;

import android.content.Context;
import com.huawei.agconnect.AGCRoutePolicy;
import com.huawei.agconnect.AGConnectOptions;
import java.io.InputStream;
import java.util.Map;

@Deprecated
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class AGConnectServicesConfig implements AGConnectOptions {
    private static final Map<String, AGConnectServicesConfig> INSTANCES = null;
    private static final Object INSTANCES_LOCK = null;

    public static AGConnectServicesConfig fromContext(Context context) {
    }

    public static AGConnectServicesConfig fromContext(Context context, String str) {
    }

    public abstract void overlayWith(LazyInputStream lazyInputStream);

    public abstract void overlayWith(InputStream inputStream);

    public abstract void setParam(String str, String str2);

    public abstract void setRoutePolicy(AGCRoutePolicy aGCRoutePolicy);
}
