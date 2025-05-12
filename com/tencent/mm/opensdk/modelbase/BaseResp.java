package com.tencent.mm.opensdk.modelbase;

import android.os.Bundle;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class BaseResp {
    public int errCode;
    public String errStr;
    public String openId;
    public String transaction;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface ErrCode {
        public static final int ERR_AUTH_DENIED = -4;
        public static final int ERR_BAN = -6;
        public static final int ERR_COMM = -1;
        public static final int ERR_OK = 0;
        public static final int ERR_SENT_FAILED = -3;
        public static final int ERR_UNSUPPORT = -5;
        public static final int ERR_USER_CANCEL = -2;
    }

    public abstract boolean checkArgs();

    public void fromBundle(Bundle bundle) {
    }

    public abstract int getType();

    public void toBundle(Bundle bundle) {
    }
}
