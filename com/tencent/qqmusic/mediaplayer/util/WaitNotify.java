package com.tencent.qqmusic.mediaplayer.util;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class WaitNotify {
    private static final String TAG = "WaitNotify";
    private volatile boolean isWaiting;
    private final MonitorObject myMonitorObject;
    private volatile boolean wasSignalled;

    /* renamed from: com.tencent.qqmusic.mediaplayer.util.WaitNotify$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements WaitListener {
        public final /* synthetic */ WaitNotify this$0;

        public AnonymousClass1(WaitNotify waitNotify) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.util.WaitNotify.WaitListener
        public boolean keepWaiting() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface WaitListener {
        boolean keepWaiting();
    }

    public void doNotify() {
    }

    public void doWait() {
    }

    public boolean isWaiting() {
    }

    public void doWait(long j2, int i2, WaitListener waitListener) {
    }
}
