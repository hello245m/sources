package com.huawei.hms.adapter;

import android.app.PendingIntent;
import android.content.Intent;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class CoreBaseResponse implements IMessageEntity {

    @Packed
    public Intent intent;

    @Packed
    private String jsonBody;

    @Packed
    private String jsonHeader;

    @Packed
    public PendingIntent pendingIntent;

    public Intent getIntent() {
    }

    public String getJsonBody() {
    }

    public String getJsonHeader() {
    }

    public PendingIntent getPendingIntent() {
    }

    public void setIntent(Intent intent) {
    }

    public void setJsonBody(String str) {
    }

    public void setJsonHeader(String str) {
    }

    public void setPendingIntent(PendingIntent pendingIntent) {
    }
}
