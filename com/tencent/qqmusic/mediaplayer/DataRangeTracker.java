package com.tencent.qqmusic.mediaplayer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class DataRangeTracker {
    private static final long LOCK_INTERVAL = 1000;
    private static final String TAG = "DataRangeTracker";
    private final ReentrantReadWriteLock lock;
    private Comparator<Range> mComparator;
    private final ArrayList<Range> mDownloadDataList;
    private long mFileTotalSize;
    private long waitingPosition;
    private int waitingSize;

    /* renamed from: com.tencent.qqmusic.mediaplayer.DataRangeTracker$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements Comparator<Range> {
        public final /* synthetic */ DataRangeTracker this$0;

        public AnonymousClass1(DataRangeTracker dataRangeTracker) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Range range, Range range2) {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(Range range, Range range2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface LockJudgerCallback {
        boolean isToAbandonLock();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class Range {
        private final long first;
        private final long second;

        public /* synthetic */ Range(long j2, long j3, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ long access$100(Range range) {
        }

        public static /* synthetic */ long access$200(Range range) {
        }

        public String toString() {
        }

        private Range(long j2, long j3) {
        }
    }

    private void lockRead() {
    }

    private synchronized void unlock() {
    }

    private void unlockRead() {
    }

    public void abandonLock() {
    }

    public void addRange(long j2, long j3, boolean z) {
    }

    public void block() {
    }

    public long findEnd(long j2) {
    }

    public long findStart(long j2) {
    }

    public long getContinuousEnd() {
    }

    public long getContinuousStart() {
    }

    public boolean isCached(long j2, int i2) {
    }

    public synchronized boolean lock(long j2, int i2, long j3, LockJudgerCallback lockJudgerCallback) throws InterruptedException {
    }

    public void setFileTotalSize(long j2) {
    }

    public void unblock() {
    }
}
