package com.huawei.hms.framework.network.grs;

import android.content.Context;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class GrsBaseInfo implements Cloneable {
    private static final String TAG = null;
    private String androidVersion;
    private String appName;
    private String countrySource;
    private String deviceModel;
    private String issueCountry;
    private String regCountry;
    private String romVersion;
    private String serCountry;
    private String uid;
    private String versionName;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public @interface CountryCodeSource {
        public static final String APP = "APP";
        public static final String LOCALE_INFO = "LOCALE_INFO";
        public static final String NETWORK_COUNTRY = "NETWORK_COUNTRY";
        public static final String SIM_COUNTRY = "SIM_COUNTRY";
        public static final String UNKNOWN = "UNKNOWN";
        public static final String VENDOR_COUNTRY = "VENDOR_COUNTRY";
    }

    public GrsBaseInfo() {
    }

    public GrsBaseInfo(Context context) {
    }

    private StringBuffer getStringBuffer(StringBuffer stringBuffer, boolean z, Context context) {
    }

    private boolean isEqual(String str, String str2) {
    }

    public GrsBaseInfo clone() {
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m1clone() {
    }

    public boolean compare(Object obj) {
    }

    public GrsBaseInfo copy() {
    }

    public String getAndroidVersion() {
    }

    public String getAppName() {
    }

    public String getCountrySource() {
    }

    public String getDeviceModel() {
    }

    public String getGrsParasKey(boolean z, boolean z2, Context context) {
    }

    public String getGrsReqParamJoint(boolean z, boolean z2, String str, Context context) {
    }

    public String getIssueCountry() {
    }

    public String getRegCountry() {
    }

    public String getRomVersion() {
    }

    public String getSerCountry() {
    }

    public String getUid() {
    }

    public String getVersionName() {
    }

    public void setAndroidVersion(String str) {
    }

    public void setAppName(String str) {
    }

    public void setCountrySource(String str) {
    }

    public void setDeviceModel(String str) {
    }

    @Deprecated
    public void setIssueCountry(String str) {
    }

    public void setRegCountry(String str) {
    }

    public void setRomVersion(String str) {
    }

    public void setSerCountry(String str) {
    }

    @Deprecated
    public void setUid(String str) {
    }

    public void setVersionName(String str) {
    }

    public int uniqueCode() {
    }
}
