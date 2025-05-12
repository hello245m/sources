package com.tencent.android.tpush.inappmessage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.util.HashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class InAppMessageActivity extends Activity {
    private Context a;
    private Handler b;
    private c c;
    private Intent d;

    /* renamed from: com.tencent.android.tpush.inappmessage.InAppMessageActivity$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 extends TTask {
        public final /* synthetic */ String a;
        public final /* synthetic */ InAppMessageActivity b;

        /* renamed from: com.tencent.android.tpush.inappmessage.InAppMessageActivity$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class RunnableC00131 implements Runnable {
            public final /* synthetic */ HashMap a;
            public final /* synthetic */ AnonymousClass1 b;

            public RunnableC00131(AnonymousClass1 anonymousClass1, HashMap hashMap) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass1(InAppMessageActivity inAppMessageActivity, String str) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    public static /* synthetic */ Context a(InAppMessageActivity inAppMessageActivity) {
    }

    public static /* synthetic */ Intent b(InAppMessageActivity inAppMessageActivity) {
    }

    public static /* synthetic */ c c(InAppMessageActivity inAppMessageActivity) {
    }

    public static /* synthetic */ Handler d(InAppMessageActivity inAppMessageActivity) {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Activity
    public void onDestroy() {
    }

    public static /* synthetic */ c a(InAppMessageActivity inAppMessageActivity, c cVar) {
    }

    private boolean a(Intent intent) {
    }

    private void a(String str) {
    }
}
