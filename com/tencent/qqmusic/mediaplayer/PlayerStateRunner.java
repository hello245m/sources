package com.tencent.qqmusic.mediaplayer;

import android.media.AudioTrack;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReadWriteLock;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class PlayerStateRunner {
    private static final String TAG = "StateRunner";
    private WeakReference<AudioTrack> mAudioTrack;
    private final ReadWriteLock mLock;
    private Integer mState;

    public PlayerStateRunner(Integer num) {
    }

    public Integer get() {
    }

    public boolean isEqual(Integer... numArr) {
    }

    public void setAudioTrack(AudioTrack audioTrack) {
    }

    public Integer transfer(Integer num) {
    }

    public boolean transfer(Integer num, Integer... numArr) {
    }
}
