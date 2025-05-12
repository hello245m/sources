package com.tencent.qqmusic.mediaplayer;

import android.os.Handler;
import android.os.HandlerThread;
import n.d0.c.q;
import n.u;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class PlayStuckMonitor {
    public static final PlayStuckMonitor INSTANCE = null;
    private static q<? super Long, ? super Long, ? super Boolean, u> mCallback;
    private static boolean mEnable;
    private static Handler mHandler;
    private static HandlerThread mHandlerThread;

    private PlayStuckMonitor() {
    }

    public static final /* synthetic */ q access$getMCallback$p(PlayStuckMonitor playStuckMonitor) {
    }

    public static final /* synthetic */ void access$setMCallback$p(PlayStuckMonitor playStuckMonitor, q qVar) {
    }

    public final void init() {
    }

    public final void onPlayStuck(long j2, long j3, boolean z) {
    }

    public final void setOnPlayStuckListener(q<? super Long, ? super Long, ? super Boolean, u> qVar) {
    }
}
