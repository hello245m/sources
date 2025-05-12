package com.tencent.bugly.common.privacy;

import android.content.Context;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class PrivacyInformation implements IPrivacyInformationProvider {
    private static final PrivacyInformation instance = null;
    private int androidFrameworkVersion;
    private final b appSetValue;
    private String cpuABI;
    private String cpuABI2;
    private String hardware;
    private Boolean isX86CPU;
    private String manufacture;
    private String model;
    private String osVersion;
    private String product;
    private IPrivacyInformationProvider provider;
    private String[] supportedABIs;

    private String checkValue(String str) {
    }

    private String[] checkValue(String[] strArr) {
    }

    public static IPrivacyInformationProvider createProviderWithContext(Context context) {
    }

    public static PrivacyInformation getInstance() {
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
    public String getManufacture() {
    }

    @Override // com.tencent.bugly.common.privacy.IPrivacyInformationProvider
    public String getModel() {
    }

    @Override // com.tencent.bugly.common.privacy.IPrivacyInformationProvider
    public String getOSVersion() {
    }

    @Override // com.tencent.bugly.common.privacy.IPrivacyInformationProvider
    public String getProduct() {
    }

    @Override // com.tencent.bugly.common.privacy.IPrivacyInformationProvider
    public String[] getSupportedABIs() {
    }

    @Override // com.tencent.bugly.common.privacy.IPrivacyInformationProvider
    public boolean isX86CPU() {
    }

    public void reset() {
    }

    public void setModel(String str) {
    }

    public void setProvider(IPrivacyInformationProvider iPrivacyInformationProvider) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b {
        public String a;

        public b() {
        }

        public /* synthetic */ b(a aVar) {
        }
    }
}
