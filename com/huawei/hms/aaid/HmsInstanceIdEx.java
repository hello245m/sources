package com.huawei.hms.aaid;

import android.content.Context;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import k.e.b.a.f;

@Deprecated
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class HmsInstanceIdEx {
    public static final String TAG = "HmsInstanceIdEx";
    private Context a;
    private PushPreferences b;
    private HuaweiApi<Api.ApiOptions.NoOptions> c;

    private HmsInstanceIdEx(Context context) {
    }

    private String a(String str) {
    }

    public static HmsInstanceIdEx getInstance(Context context) {
    }

    public void deleteAAID(String str) throws ApiException {
    }

    public String getAAId(String str) throws ApiException {
    }

    public long getCreationTime(String str) throws ApiException {
    }

    public f<TokenResult> getToken() {
    }

    private f<TokenResult> a(Exception exc) {
    }
}
