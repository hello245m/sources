package com.huawei.hms.framework.common.hianalytics;

import android.annotation.SuppressLint;
import android.content.Context;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class HianalyticsHelper {
    private static final String DEAULT_HA_SERVICE_TAG = "_default_config_tag";
    private static final String HWID_HA_SERVICE_TAG = "hms_hwid";
    private static final String TAG = "HianalyticsHelper";
    private static final int TYPE_MAINTF = 1;
    private static final String USER_EXPERIENCE_INVOLVED = "user_experience_involved";
    private static final int USER_EXPERIENCE_ON = 1;

    @SuppressLint({"StaticFieldLeak"})
    private static volatile HianalyticsHelper instance;
    private HiAnalyticsInstance defaultInstance;
    private HiAnalyticsInstance hInstance;
    private String haTag;
    private boolean hasHMSBI;
    private boolean hasHianalytics;
    private boolean isEnablePrivacyPolicy;
    private ExecutorService reportExecutor;

    /* renamed from: com.huawei.hms.framework.common.hianalytics.HianalyticsHelper$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ HianalyticsHelper this$0;
        public final /* synthetic */ Throwable val$e;
        public final /* synthetic */ String val$eventId;
        public final /* synthetic */ String val$threadName;

        public AnonymousClass1(HianalyticsHelper hianalyticsHelper, String str, Throwable th, String str2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class HianalyticsRunnable implements Runnable {
        private final HianalyticsBaseData data;
        private final String event;

        public HianalyticsRunnable(HianalyticsBaseData hianalyticsBaseData, String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private HianalyticsHelper() {
    }

    public static HianalyticsHelper getInstance() {
    }

    private boolean isHianalyticsOk() {
    }

    private void onNewEvent(Context context, String str, Map map, int i2) {
    }

    private void tryHMSBIInit(Context context) {
    }

    public void enablePrivacyPolicy(boolean z) {
    }

    public void executeReportHa(HianalyticsBaseData hianalyticsBaseData, String str) {
    }

    public ExecutorService getReportExecutor() {
    }

    public boolean isEnableReport(Context context) {
    }

    public boolean isEnableReportNoSeed(Context context) {
    }

    public void onEvent(LinkedHashMap<String, String> linkedHashMap, String str) {
    }

    public void reportData(Context context, LinkedHashMap<String, String> linkedHashMap, String str, int i2) {
    }

    public void reportException(Throwable th, String str) {
    }

    public void setHaTag(String str) {
    }

    public void onEvent(LinkedHashMap<String, String> linkedHashMap, String str, int i2) {
    }

    public void onEvent(LinkedHashMap<String, String> linkedHashMap) {
    }
}
