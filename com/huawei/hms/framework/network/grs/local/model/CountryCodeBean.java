package com.huawei.hms.framework.network.grs.local.model;

import android.content.Context;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class CountryCodeBean {
    private static final String ANDRIOD_SYSTEMPROP = "android.os.SystemProperties";
    private static final int ANDROID_9_API_LEVEL = 28;
    private static final int COUNTRYCODE_SIZE = 2;
    private static final String KEY_VERSION_EMUI = "ro.build.version.emui";
    private static final String LOCALE_COUNTRYSYSTEMPROP = "ro.product.locale";
    private static final String LOCALE_REGION_COUNTRYSYSTEMPROP = "ro.product.locale.region";
    private static final String SPECIAL_COUNTRYCODE_CN = "cn";
    private static final String SPECIAL_COUNTRYCODE_EU = "eu";
    private static final String SPECIAL_COUNTRYCODE_GB = "gb";
    private static final String SPECIAL_COUNTRYCODE_LA = "la";
    private static final String SPECIAL_COUNTRYCODE_UK = "uk";
    private static final String TAG = "CountryCodeBean";
    private static final String VENDORCOUNTRY_SYSTEMPROP = "ro.hw.country";
    private String countryCode;
    private String countrySource;

    public CountryCodeBean(Context context, boolean z) {
    }

    private void checkCodeLenth() {
    }

    private void getLocaleCountryCode() {
    }

    private void getProductCountryCode() {
    }

    private void getRegionSettingCountryCode() {
    }

    private void getSimCountryCode(Context context) {
    }

    private void getSimCountryCode(Context context, boolean z) {
    }

    private void getVendorCountryCode() {
    }

    private void init(Context context, boolean z) {
    }

    private boolean isCodeValidate() {
    }

    public String getCountryCode() {
    }

    public String getCountrySource() {
    }
}
