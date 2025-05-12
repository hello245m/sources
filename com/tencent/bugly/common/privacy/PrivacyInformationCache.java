package com.tencent.bugly.common.privacy;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class PrivacyInformationCache implements IPrivacyInformationProvider {
    public static final String KEY_MANUFACTURER = "manufacture";
    public static final String KEY_MODEL = "model";
    public static final String KEY_PRODUCT = "product";
    public static final String TAG = "RMonitor_Privacy";
    public static final String UNKNOWN = "unknown";
    private final WeakReference<Context> contextRef;

    public PrivacyInformationCache(Context context) {
    }

    private boolean hasContext() {
    }

    private String readValue(String str) {
    }

    private void writeValue(String str, String str2) {
    }

    @Override // com.tencent.bugly.common.privacy.IPrivacyInformationProvider
    public int getAndroidFrameworkVersion() {
    }

    @Override // com.tencent.bugly.common.privacy.IPrivacyInformationProvider
    public String getCpuABI() {
    }

    @Override // com.tencent.bugly.common.privacy.IPrivacyInformationProvider
    public String getCpuABI2() {
    }

    @Override // com.tencent.bugly.common.privacy.IPrivacyInformationProvider
    public String getHardware() {
    }

    @Override // com.tencent.bugly.common.privacy.IPrivacyInformationProvider
    public synchronized String getManufacture() {
    }

    @Override // com.tencent.bugly.common.privacy.IPrivacyInformationProvider
    public synchronized String getModel() {
    }

    @Override // com.tencent.bugly.common.privacy.IPrivacyInformationProvider
    public String getOSVersion() {
    }

    @Override // com.tencent.bugly.common.privacy.IPrivacyInformationProvider
    public synchronized String getProduct() {
    }

    @Override // com.tencent.bugly.common.privacy.IPrivacyInformationProvider
    public String[] getSupportedABIs() {
    }

    @Override // com.tencent.bugly.common.privacy.IPrivacyInformationProvider
    public boolean isX86CPU() {
    }
}
