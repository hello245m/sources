package com.tencent.mm.opensdk.modelpay;

import android.os.Bundle;
import com.tencent.mm.opensdk.modelbase.BaseReq;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class PayReq extends BaseReq {
    private static final int EXTDATA_MAX_LENGTH = 1024;
    private static final String TAG = "MicroMsg.PaySdk.PayReq";
    public String appId;
    public String extData;
    public String nonceStr;
    public Options options;
    public String packageValue;
    public String partnerId;
    public String prepayId;
    public String sign;
    public String signType;
    public String timeStamp;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class Options {
        public static final int INVALID_FLAGS = -1;
        public String callbackClassName;
        public int callbackFlags;

        public void fromBundle(Bundle bundle) {
        }

        public void toBundle(Bundle bundle) {
        }
    }

    @Override // com.tencent.mm.opensdk.modelbase.BaseReq
    public boolean checkArgs() {
    }

    @Override // com.tencent.mm.opensdk.modelbase.BaseReq
    public void fromBundle(Bundle bundle) {
    }

    @Override // com.tencent.mm.opensdk.modelbase.BaseReq
    public int getType() {
    }

    @Override // com.tencent.mm.opensdk.modelbase.BaseReq
    public void toBundle(Bundle bundle) {
    }
}
