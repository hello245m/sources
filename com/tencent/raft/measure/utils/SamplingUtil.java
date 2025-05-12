package com.tencent.raft.measure.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.raft.measure.config.RAFTComConfig;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class SamplingUtil {
    private static final int MAX_APP_REPORT_COUNT = 25;
    private static final int MAX_COM_REPORT_COUNT = 10;
    private static final int MAX_KEY_REPORT_COUNT = 5;
    private static final String SPLIT_SHARE = "&";
    private static final String SP_APP_REPORT = "SP_APP_REPORT";
    private static final String SP_DATE = "SP_DATE";
    private static final List<String> START_UP_LIST = null;
    public static final int START_UP_SAMPLING_RATE = 5;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class SamplingResult {
        private static final /* synthetic */ SamplingResult[] $VALUES = null;
        public static final SamplingResult APP_LIMIT = null;
        public static final SamplingResult COM_LIMIT = null;
        public static final SamplingResult COM_RATE_LIMIT = null;
        public static final SamplingResult KEY_LIMIT = null;
        public static final SamplingResult REPEAT_LIMIT = null;
        public static final SamplingResult REPORT = null;
        public static final SamplingResult SLI_LIMIT = null;
        public static final SamplingResult START_UP_RATE_LIMIT = null;

        private SamplingResult(String str, int i2) {
        }

        public static SamplingResult valueOf(String str) {
        }

        public static SamplingResult[] values() {
        }
    }

    private SamplingUtil() {
    }

    private static void addLimitToSP(Context context, RAFTComConfig rAFTComConfig, String str) {
    }

    private static SamplingResult checkLimitFormSP(Context context, RAFTComConfig rAFTComConfig, String str) {
    }

    private static void checkSPDate(SharedPreferences sharedPreferences) {
    }

    public static SamplingResult getSLISamplingResult(Context context, RAFTComConfig rAFTComConfig, String str, int i2) {
    }

    public static SamplingResult startUpSampling(RAFTComConfig rAFTComConfig) {
    }
}
