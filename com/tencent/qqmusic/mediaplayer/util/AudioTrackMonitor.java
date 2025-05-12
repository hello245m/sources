package com.tencent.qqmusic.mediaplayer.util;

import android.media.AudioTrack;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class AudioTrackMonitor {
    private static final boolean ENABLE = false;
    private static final String TAG = "AudioTrackMonitor";
    private WeakReference<AudioTrack> mAudioTrackRef;
    private StringBuilder mBuilder;
    private long mLastPosition;
    private long mLastTime;
    private int mLooperTime;
    private Thread mMonitorThread;
    private boolean mStop;

    /* renamed from: com.tencent.qqmusic.mediaplayer.util.AudioTrackMonitor$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 extends Thread {
        public final /* synthetic */ AudioTrackMonitor this$0;

        public AnonymousClass1(AudioTrackMonitor audioTrackMonitor, String str) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    public AudioTrackMonitor(AudioTrack audioTrack) {
    }

    public static /* synthetic */ boolean access$000(AudioTrackMonitor audioTrackMonitor) {
    }

    public static /* synthetic */ int access$100(AudioTrackMonitor audioTrackMonitor) {
    }

    public static /* synthetic */ WeakReference access$200(AudioTrackMonitor audioTrackMonitor) {
    }

    public static /* synthetic */ long access$300(AudioTrackMonitor audioTrackMonitor) {
    }

    public static /* synthetic */ long access$302(AudioTrackMonitor audioTrackMonitor, long j2) {
    }

    public static /* synthetic */ long access$400(AudioTrackMonitor audioTrackMonitor) {
    }

    public static /* synthetic */ long access$402(AudioTrackMonitor audioTrackMonitor, long j2) {
    }

    public static /* synthetic */ StringBuilder access$500(AudioTrackMonitor audioTrackMonitor) {
    }

    public void start() {
    }

    public void stop() {
    }
}
