package com.tencent.tpns.mqttchannel.core.a;

import com.tencent.tpns.baseapi.base.util.TTask;
import com.tencent.tpns.mqttchannel.core.common.b.a;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class b extends a.AbstractBinderC0091a {

    /* renamed from: com.tencent.tpns.mqttchannel.core.a.b$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 extends TTask {
        public final /* synthetic */ int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ b c;

        public AnonymousClass1(b bVar, int i2, String str) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    public abstract void callback(int i2, String str);

    @Override // com.tencent.tpns.mqttchannel.core.common.b.a
    public final void handleCallback(int i2, String str) {
    }
}
