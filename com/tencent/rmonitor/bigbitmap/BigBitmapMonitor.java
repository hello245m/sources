package com.tencent.rmonitor.bigbitmap;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k.i.k.d.b;
import k.i.k.e.b.e;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class BigBitmapMonitor extends QAPMMonitorPlugin {
    public static volatile BigBitmapMonitor e;
    public final a a;
    public final b b;
    public final Set<String> c;
    public final AtomicBoolean d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a extends e {
        public final SparseArray<k.i.k.d.e> a;
        public final Handler b;
        public final /* synthetic */ BigBitmapMonitor c;

        /* renamed from: com.tencent.rmonitor.bigbitmap.BigBitmapMonitor$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class HandlerC0078a extends Handler {
            public final /* synthetic */ a a;

            public HandlerC0078a(a aVar, Looper looper) {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
            }
        }

        public a(BigBitmapMonitor bigBitmapMonitor) {
        }

        public static /* synthetic */ void a(a aVar, Activity activity) {
        }

        public final void b(Activity activity) {
        }

        @Override // k.i.k.e.b.e, k.i.k.e.b.b
        public void onCreate(Activity activity) {
        }

        @Override // k.i.k.e.b.e, k.i.k.e.b.b
        public void onDestroy(Activity activity) {
        }
    }

    public static /* synthetic */ boolean e(BigBitmapMonitor bigBitmapMonitor, String str) {
    }

    public static /* synthetic */ b f(BigBitmapMonitor bigBitmapMonitor) {
    }

    public static BigBitmapMonitor getInstance() {
    }

    public final void g() {
    }

    public final boolean h(String str) {
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void start() {
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
    }
}
