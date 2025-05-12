package com.tencent.xweb.internal;

import android.webkit.ValueCallback;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IWebStorage {
    void deleteAllData();

    void deleteOrigin(String str);

    void getOrigins(ValueCallback<Map> valueCallback);

    void getQuotaForOrigin(String str, ValueCallback<Long> valueCallback);

    void getUsageForOrigin(String str, ValueCallback<Long> valueCallback);

    void setQuotaForOrigin(String str, long j2);
}
