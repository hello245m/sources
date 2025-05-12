package com.tencent.mp.feature.base.util;

import androidx.activity.ComponentActivity;
import com.tencent.mp.feature.base.arch.BaseLifecycleObserver;
import java.util.Timer;
import java.util.TimerTask;
import n.f0.c;
import n.i0.i;
import n.u;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class LifecycleTimer extends BaseLifecycleObserver {
    public static final /* synthetic */ i<Object>[] g = null;
    public final ComponentActivity a;
    public final long b;
    public final long c;
    public final n.d0.c.a<u> d;
    public final c e;
    public TimerTask f;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends TimerTask {
        public final /* synthetic */ LifecycleTimer a;

        public a(LifecycleTimer lifecycleTimer) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    public static final /* synthetic */ void a(LifecycleTimer lifecycleTimer) {
    }

    public final Timer b() {
    }

    public final void c() {
    }

    public final void d(Timer timer) {
    }

    @Override // com.tencent.mp.feature.base.arch.BaseLifecycleObserver
    public void onActivityCreate() {
    }

    @Override // com.tencent.mp.feature.base.arch.BaseLifecycleObserver
    public void onActivityDestroy() {
    }

    @Override // com.tencent.mp.feature.base.arch.BaseLifecycleObserver
    public void onActivityPause() {
    }

    @Override // com.tencent.mp.feature.base.arch.BaseLifecycleObserver
    public void onActivityStart() {
    }

    @Override // com.tencent.mp.feature.base.arch.BaseLifecycleObserver
    public void onActivityStop() {
    }
}
