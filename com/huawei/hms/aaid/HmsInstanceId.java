package com.huawei.hms.aaid;

import android.content.Context;
import com.huawei.hms.aaid.entity.AAIDResult;
import com.huawei.hms.aaid.entity.DeleteTokenReq;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import k.e.b.a.f;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class HmsInstanceId {
    public static final String TAG = "HmsInstanceId";
    private Context a;
    private PushPreferences b;
    private HuaweiApi<Api.ApiOptions.NoOptions> c;

    private HmsInstanceId(Context context) {
    }

    private void a(String str) {
    }

    private void b() throws ApiException {
    }

    public static HmsInstanceId getInstance(Context context) {
    }

    public void deleteAAID() throws ApiException {
    }

    public void deleteToken(String str, String str2) throws ApiException {
    }

    public f<AAIDResult> getAAID() {
    }

    public long getCreationTime() {
    }

    public String getId() {
    }

    @Deprecated
    public String getToken() {
    }

    public String getToken(String str, String str2) throws ApiException {
    }

    public void deleteToken(String str) throws ApiException {
    }

    public String getToken(String str) throws ApiException {
    }

    private String a(TokenReq tokenReq, int i2) throws ApiException {
    }

    private void a(DeleteTokenReq deleteTokenReq, int i2) throws ApiException {
    }

    private void a() throws ApiException {
    }
}
