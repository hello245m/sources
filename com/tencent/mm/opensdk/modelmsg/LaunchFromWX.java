package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class LaunchFromWX {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class Req extends BaseReq {
        private static final int MESSAGE_ACTION_LENGTH_LIMIT = 2048;
        private static final int MESSAGE_EXT_LENGTH_LIMIT = 2048;
        private static final String TAG = "MicroMsg.SDK.LaunchFromWX.Req";
        public String country;
        public String lang;
        public String messageAction;
        public String messageExt;

        public Req() {
        }

        public Req(Bundle bundle) {
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

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class Resp extends BaseResp {
        public Resp() {
        }

        public Resp(Bundle bundle) {
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public boolean checkArgs() {
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public int getType() {
        }
    }

    private LaunchFromWX() {
    }
}
