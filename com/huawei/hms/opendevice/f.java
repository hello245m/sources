package com.huawei.hms.opendevice;

import android.content.Context;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class f extends TaskApiCall<PushClient, TokenResult> {
    private Context a;
    private TokenReq b;

    public f(String str, TokenReq tokenReq, Context context, String str2) {
    }

    public void a(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, k.e.b.a.g<TokenResult> gVar) {
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public /* bridge */ /* synthetic */ void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, k.e.b.a.g<TokenResult> gVar) {
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
    }

    private void a(ResponseErrorCode responseErrorCode, k.e.b.a.g<TokenResult> gVar) {
    }

    private void a(String str, String str2) {
    }
}
