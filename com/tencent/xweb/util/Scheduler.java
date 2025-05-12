package com.tencent.xweb.util;

import android.content.SharedPreferences;
import com.tencent.xweb.util.ConfigDef;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class Scheduler {
    public static final long DAY_MILLS = 86400000;
    public static final long DEFAULT_EXPIRE_TIME = 18000000;
    public static final long EXPIRE_TIME_AFTER_SCHEDULE = 3600000;
    public static final long FETCH_CONFIG_PERIOD = 86400000;
    public static final long HOUR_MILLS = 3600000;
    public static final long MAX_FAILED_COUNT = 3;
    public static final long MINUTE_MILLS = 60000;
    public static final long RE_SCHEDULER_APPEND_TIME = 7200000;
    public static final String STAG = "Scheduler";
    public static boolean sForceCheckUpdate = false;
    public String TAG;
    public boolean mParseScheduleConfigFailed;
    public SchedulerConfig schedulerConfig;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class TimeRangeBind {
        public TimeRange rangeFrom;
        public TimeRange rangeTo;

        public String dump(double d, double d2) {
        }

        public double getScheduleTimeScale(double d, double d2) {
        }

        public boolean isMatched(double d, double d2) {
        }

        public boolean isMatched(double d, double d2, double d3) {
        }
    }

    public static long getFetchConfigPeriod() {
    }

    public static String[] getHourSpeedPieces(String str) {
    }

    public static double getRandomTime(double d, double d2, double d3) {
    }

    private boolean getShouldUpdateFromConfig(double d, double d2, long j2) {
    }

    private String getTimeRangeBindConfig() {
    }

    public static TimeRangeBind getTimeRangePairItem(String str) {
    }

    public static long getUpdateTimeFromPeriod(ConfigDef.BaseVersion baseVersion, String str) {
    }

    public static long getUpdateTimeFromSchedules(ConfigDef.BaseVersion baseVersion, String str) {
    }

    public static long getUpdateTimeFromVersion(ConfigDef.BaseVersion baseVersion, String str) {
    }

    public static double getValidEndTime(double d, double d2) {
    }

    public static double getValidStartTime(double d) {
    }

    public static boolean isValidPeriodForFetchConfig(long j2) {
    }

    public static boolean isValidUpdateTimeZone(double d, double d2) {
    }

    private synchronized void resetNextUpdateTime(SharedPreferences.Editor editor, int i2) {
    }

    public static void setForceCheckUpdate(boolean z) {
    }

    public void abandonCurrentScheduler() {
    }

    public boolean checkNeedFetchConfig(long j2, long j3) {
    }

    public String dumpSchedule() {
    }

    public double getCurHourSpeed(String str) {
    }

    public final String getCurHourSpeedConfig(boolean z) {
    }

    public double getCurHourUpdateTimeGapForwardMillis() {
    }

    public double getCurHourUpdateTimeGapMillis() {
    }

    public synchronized SchedulerConfig getCurSchedulerConfig() {
    }

    public abstract String getCustomCurHourSpeedConfig(boolean z);

    public String getCustomTimeRangeBindConfig() {
    }

    public String getFreeFetchConfigZoneConfig() {
    }

    public int getIdkeyOffsetFromDefault() {
    }

    public abstract String getScheduleType();

    public List<TimeRangeBind> getTimeRangeBind() {
    }

    public synchronized boolean hasScheduler() {
    }

    public boolean isInFreeFetchConfigTimeZone() {
    }

    public boolean isInFreeUpdateTimeZone() {
    }

    public boolean isMatchTimeRangeBind(long j2, double d) {
    }

    public boolean isSameScheduler(SchedulerConfig schedulerConfig, SchedulerConfig schedulerConfig2) {
    }

    public boolean isSameString(String str, String str2) {
    }

    public synchronized boolean isTimeToUpdate(boolean z) {
    }

    public boolean needForceUpdate() {
    }

    public void onStartFetchConfig() {
    }

    public void onUpdateFailed(int i2) {
    }

    public SchedulerConfig onUpdateScheduleConfig(SchedulerConfig schedulerConfig) {
    }

    public void rescheduleToNextDay() {
    }

    public synchronized void resetLastFetchConfigTime() {
    }

    public synchronized void resetLastUpdateTime() {
    }

    public synchronized void saveSchedulerConfig(SchedulerConfig schedulerConfig) {
    }

    public double getCurHourSpeed(String str, double d) {
    }

    public synchronized boolean isTimeToUpdate(boolean z, int i2) {
    }

    public synchronized boolean checkNeedFetchConfig() {
    }

    public boolean isMatchTimeRangeBind(double d, double d2, double d3) {
    }
}
