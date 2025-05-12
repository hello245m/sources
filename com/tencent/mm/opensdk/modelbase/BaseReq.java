package com.tencent.mm.opensdk.modelbase;

import android.os.Bundle;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class BaseReq {
    public String openId;
    public String transaction;

    public abstract boolean checkArgs();

    public void fromBundle(Bundle bundle) {
    }

    public abstract int getType();

    public void toBundle(Bundle bundle) {
    }
}
