package com.tencent.qqmusic.mediaplayer;

import java.lang.ref.WeakReference;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class PlayerConfigManager {
    private static final int ADD = 1;
    private static final int DTS_COST_THRESHOLD = 40;
    private static boolean ENABLE_CHANGE_THREAD_PRIORITY = false;
    private static final boolean ENABLE_REAL_CHECK = true;
    private static final int MAX_RATIO = 4;
    private static final int MAX_TIMES = 10;
    private static final int MIN_RATIO = 8;
    private static final int NONE = 0;
    private static final int SUB = -1;
    private static final String TAG = "PlayerConfigManager";
    private static PlayerConfigManager mInstance;
    private int[] THREAD_PRIORITY;
    private int count;
    private int mAddPriority;
    private int mBufRatio;
    private WeakReference<CorePlayer> mCommonPlayerRef;
    private int mCurrPriorityIndex;
    private long mLastDecodeSpeed;
    private long mPlaySpeed;
    private int mProcessorNumber;
    private long mStartTime;

    private PlayerConfigManager() {
    }

    private boolean add() {
    }

    public static synchronized PlayerConfigManager getInstance() {
    }

    private boolean sub() {
    }

    public void calDTSCostEnd() {
    }

    public void calDTSCostStart() {
    }

    public void changeDecodeThreadPriority() {
    }

    public void changeDecodeThreadPriorityIfNeed() {
    }

    public int getBufRatio() {
    }

    public boolean isSingleCpuOrScreenOff() {
    }

    public void setCommonPlayerRef(CorePlayer corePlayer) {
    }
}
