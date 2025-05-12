package com.tencent.android.tpush.stat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.jg.EType;
import com.jg.JgMethodChecked;
import com.tencent.tpns.baseapi.base.util.TTask;
import org.apache.http.HttpHost;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class b {
    private static volatile b a;
    private volatile int b;
    private volatile String c;
    private volatile HttpHost d;
    private Context e;
    private com.tencent.android.tpush.stat.b.c f;

    /* renamed from: com.tencent.android.tpush.stat.b$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 extends BroadcastReceiver {
        public final /* synthetic */ b a;

        /* renamed from: com.tencent.android.tpush.stat.b$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class C00231 extends TTask {
            public final /* synthetic */ AnonymousClass1 a;

            public C00231(AnonymousClass1 anonymousClass1) {
            }

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        }

        public AnonymousClass1(b bVar) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    private b(Context context) {
    }

    private void f() {
    }

    public String a() {
    }

    public boolean b() {
    }

    public boolean c() {
    }

    public void d() {
    }

    @JgMethodChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20150316", reviewer = 3, vComment = {EType.RECEIVERCHECK})
    public void e() {
    }

    public static b a(Context context) {
    }
}
