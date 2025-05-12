package com.tencent.bugly.common.privacy;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface IPrivacyInformationProvider {
    public static final String[] EMPTY_STRING_ARRAY = null;
    public static final int INIT_FRAMEWORK_VERSION = -1;

    int getAndroidFrameworkVersion();

    String getCpuABI();

    String getCpuABI2();

    String getHardware();

    String getManufacture();

    String getModel();

    String getOSVersion();

    String getProduct();

    String[] getSupportedABIs();

    boolean isX86CPU();
}
