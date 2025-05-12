package com.huawei.hms.push.task;

import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import k.e.b.a.g;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class SendUpStreamTask extends TaskApiCall<PushClient, BaseVoidTask> {
    private String a;
    private String b;

    public SendUpStreamTask(String str, String str2, String str3, String str4, String str5) {
    }

    private void a(PushClient pushClient, ResponseErrorCode responseErrorCode) {
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public /* bridge */ /* synthetic */ void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, g<BaseVoidTask> gVar) {
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
    }

    /* renamed from: doExecute, reason: avoid collision after fix types in other method */
    public void doExecute2(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, g<BaseVoidTask> gVar) {
    }
}
