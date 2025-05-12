package com.huawei.hms.framework.common.hianalytics;

import java.util.LinkedHashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class HianalyticsBaseData {
    public static final String EVENT_ID = "url_request";
    public static final String SDK_NAME = "sdk_name";
    public static final String SDK_TYPE = "sdk_type";
    public static final String SDK_VERSION = "sdk_version";
    private static final String TAG = "HianalyticsBaseData";
    private LinkedHashMap<String, String> data;

    public LinkedHashMap<String, String> get() {
    }

    public HianalyticsBaseData put(String str, String str2) {
    }

    public HianalyticsBaseData putIfNotDefault(String str, long j2, long j3) {
    }

    public String toString() {
    }

    public HianalyticsBaseData put(String str, long j2) {
    }

    public HianalyticsBaseData put(LinkedHashMap<String, String> linkedHashMap) {
    }
}
