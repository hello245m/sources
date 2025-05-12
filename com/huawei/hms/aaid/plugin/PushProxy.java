package com.huawei.hms.aaid.plugin;

import android.content.Context;
import com.huawei.hms.common.ApiException;
import k.e.b.a.f;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface PushProxy {
    void deleteAllToken(Context context) throws ApiException;

    void deleteToken(Context context, String str, String str2) throws ApiException;

    JSONObject getPlatform();

    String getProxyType();

    void getToken(Context context, String str, String str2) throws ApiException;

    f<Void> subscribe(Context context, String str, String str2);

    f<Void> turnOff(Context context, String str);

    f<Void> turnOn(Context context, String str);

    f<Void> unsubscribe(Context context, String str, String str2);
}
