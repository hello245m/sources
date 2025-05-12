package com.huawei.hms.push;

import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.support.api.entity.push.UpSendMsgReq;
import java.util.regex.Pattern;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class HmsMessaging {
    public static final String DEFAULT_TOKEN_SCOPE = "HCM";
    private static final Pattern c = null;
    private Context a;
    private HuaweiApi<Api.ApiOptions.NoOptions> b;

    private HmsMessaging(Context context) {
    }

    private k.e.b.a.f<Void> a(String str, String str2) {
    }

    public static synchronized HmsMessaging getInstance(Context context) {
    }

    public boolean isAutoInitEnabled() {
    }

    public void send(RemoteMessage remoteMessage) {
    }

    public void setAutoInitEnabled(boolean z) {
    }

    public k.e.b.a.f<Void> subscribe(String str) {
    }

    public k.e.b.a.f<Void> turnOffPush() {
    }

    public k.e.b.a.f<Void> turnOnPush() {
    }

    public k.e.b.a.f<Void> unsubscribe(String str) {
    }

    private void a(RemoteMessage remoteMessage) {
    }

    private k.e.b.a.f<Void> a(boolean z) {
    }

    private void a(UpSendMsgReq upSendMsgReq, String str) {
    }
}
