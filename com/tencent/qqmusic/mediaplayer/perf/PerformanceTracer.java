package com.tencent.qqmusic.mediaplayer.perf;

import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class PerformanceTracer {
    private IDataSource dataSource;
    private long lastTimeStampNanoSecond;
    private long playStartTimestampNanoSec;
    private final Map<String, SpeedCheck> speedMap;
    private long totalPcmInByte;
    private long totalTimeCostInNanoSec;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class BufferSizeCheck {
        private int lastSize;
        private int maxMismatch;
        private final String name;
        private int sizeMismatchCount;

        public BufferSizeCheck(String str) {
        }

        public int getMaxMismatch() {
        }

        public String getName() {
        }

        public int getSizeMismatchCount() {
        }

        public void onEnd(int i2) {
        }

        public void onStart(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class OverallInfo {
        public final IDataSource dataSource;
        public final long timeCostInMs;
        public final long totalPcmToBePlayed;

        public OverallInfo(IDataSource iDataSource, long j2, long j3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class SpeedCheck {
        private static final double f = 1000000.0d;
        private double avg;
        private double max;
        private double min;
        private final String name;
        private long totalBufferLength;
        private long totalTimeNanoSecond;

        public /* synthetic */ SpeedCheck(String str, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ void access$000(SpeedCheck speedCheck, int i2, long j2) {
        }

        public static /* synthetic */ void access$100(SpeedCheck speedCheck) {
        }

        private void compute() {
        }

        private void update(int i2, long j2) {
        }

        public double getAvg() {
        }

        public double getMax() {
        }

        public double getMin() {
        }

        public String getName() {
        }

        public long getTotalBufferLength() {
        }

        public long getTotalTimeMs() {
        }

        public void reset() {
        }

        public String toString() {
        }

        private SpeedCheck(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface Visitor {
        void visitSpeedCheck(List<SpeedCheck> list, OverallInfo overallInfo);
    }

    private SpeedCheck getSpeedCheck(String str) {
    }

    public void accept(Visitor visitor) {
    }

    public void end(String str, int i2) {
    }

    public void init(IDataSource iDataSource) {
    }

    public void playEnd() {
    }

    public void playStart() {
    }

    public void roundEnd(int i2) {
    }

    public void roundStart() {
    }

    public void start(String str) {
    }
}
