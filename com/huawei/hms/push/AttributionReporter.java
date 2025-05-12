package com.huawei.hms.push;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.support.api.entity.push.AttributionReportReq;
import com.huawei.hms.ui.SafeBundle;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class AttributionReporter {
    public static final String APP_VERSION = "appVersion";
    public static final String SYSTEM_PERMISSION = "permission";
    private HuaweiApi<Api.ApiOptions.NoOptions> a;
    private Context b;

    private AttributionReporter(Context context) {
    }

    private k.e.b.a.f<Void> a(AttributionEvent attributionEvent, Bundle bundle) {
    }

    public static AttributionReporter getInstance(Context context) {
    }

    public k.e.b.a.f<Void> report(AttributionEvent attributionEvent, Bundle bundle) {
    }

    private AttributionReportReq a(AttributionEvent attributionEvent, SafeBundle safeBundle) throws ApiException {
    }
}
