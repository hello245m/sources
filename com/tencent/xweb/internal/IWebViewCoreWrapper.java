package com.tencent.xweb.internal;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IWebViewCoreWrapper {
    Class<?> getBridgeClass(String str);

    Object getBridgeObject(Object obj);

    String getBridgePackageName();

    Class<?> getClass(String str);

    ClassLoader getWebViewCoreClassLoader();

    boolean hasFeature(int i2);

    boolean invokeNativeChannel(int i2, Object[] objArr);

    Object invokeRuntimeChannel(int i2, Object[] objArr);
}
