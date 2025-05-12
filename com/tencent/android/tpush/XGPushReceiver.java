package com.tencent.android.tpush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.tencent.tpns.baseapi.base.util.TTask;

@JgClassChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20150316", reviewer = 3, vComment = {EType.RECEIVERCHECK})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class XGPushReceiver extends BroadcastReceiver {
    private Context a;

    /* renamed from: com.tencent.android.tpush.XGPushReceiver$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 extends TTask {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Intent c;
        public final /* synthetic */ XGPushReceiver d;

        public AnonymousClass1(XGPushReceiver xGPushReceiver, Context context, String str, Intent intent) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    public void a(Context context, Intent intent) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
    }
}
