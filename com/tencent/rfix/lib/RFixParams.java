package com.tencent.rfix.lib;

import android.content.Context;
import androidx.annotation.Keep;
import java.util.Map;
import java.util.Set;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class RFixParams {
    private static final int MAX_CUSTOM_PROPERTIES = 5;
    private static final String TAG = "RFix.RFixParams";
    private final String appId;
    private final String appKey;
    private String appVersion;
    private final Map<String, String> customProperties;
    private String deviceId;
    private String deviceManufacturer;
    private String deviceModel;
    private String dummyAppVersion;
    private String dummyUserId;
    private final boolean enable;
    private String logDir;
    private String userId;

    public RFixParams(String str, String str2) {
    }

    public String getAppId() {
    }

    public String getAppKey() {
    }

    public String getAppVersion(Context context) {
    }

    public Set<String> getCustomProperties() {
    }

    public String getCustomProperty(String str) {
    }

    public String getDeviceId() {
    }

    public String getDeviceManufacturer() {
    }

    public String getDeviceModel() {
    }

    public String getLogDir() {
    }

    public String getRealAppVersion(Context context) {
    }

    public String getUserId() {
    }

    public boolean isEnable() {
    }

    public RFixParams setAppVersion(String str) {
    }

    public RFixParams setCustomProperty(String str, String str2) {
    }

    public RFixParams setDeviceId(String str) {
    }

    public RFixParams setDeviceManufacturer(String str) {
    }

    public RFixParams setDeviceModel(String str) {
    }

    public RFixParams setDummyAppVersion(String str) {
    }

    public RFixParams setDummyUserId(String str) {
    }

    public RFixParams setLogDir(String str) {
    }

    public RFixParams setUserId(String str) {
    }

    public String toString() {
    }

    public RFixParams(boolean z, String str, String str2) {
    }
}
