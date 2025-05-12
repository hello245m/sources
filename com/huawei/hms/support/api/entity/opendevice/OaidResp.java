package com.huawei.hms.support.api.entity.opendevice;

import android.app.PendingIntent;
import com.huawei.hms.core.aidl.AbstractMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class OaidResp extends AbstractMessageEntity {

    @Packed
    private String id;

    @Packed
    private boolean isTrackLimited;

    @Packed
    private PendingIntent settingIntent;

    public String getId() {
    }

    public PendingIntent getSettingIntent() {
    }

    public boolean isTrackLimited() {
    }

    public void setId(String str) {
    }

    public void setSettingIntent(PendingIntent pendingIntent) {
    }

    public void setTrackLimited(boolean z) {
    }
}
