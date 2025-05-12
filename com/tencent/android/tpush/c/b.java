package com.tencent.android.tpush.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.tencent.tpns.baseapi.base.util.TTask;

@JgClassChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20160810", reviewer = 3, vComment = {EType.RECEIVERCHECK, EType.INTENTCHECK})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class b {

    /* renamed from: com.tencent.android.tpush.c.b$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 extends TTask {
        public final /* synthetic */ Context a;

        public AnonymousClass1(Context context) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.android.tpush.c.b$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass2 extends BroadcastReceiver {
        public final /* synthetic */ long a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* renamed from: com.tencent.android.tpush.c.b$2$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1 extends TTask {
            public final /* synthetic */ Context a;
            public final /* synthetic */ AnonymousClass2 b;

            public AnonymousClass1(AnonymousClass2 anonymousClass2, Context context) {
            }

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        }

        public AnonymousClass2(long j2, String str, String str2) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    public static void a(Context context) {
    }

    public static /* synthetic */ void b(Context context) {
    }

    private static void c(Context context) {
    }
}
