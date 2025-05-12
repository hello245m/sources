package com.tencent.xweb.pinus.sdk;

import com.tencent.xweb.util.ReflectMethod;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class SslErrorHandlerInterfaceImpl implements SslErrorHandlerInterface {
    public static final String TAG = "SslErrHandlerInterface";
    public ReflectMethod cancelMethod;
    public final Object inner;
    public ReflectMethod proceedMethod;

    public SslErrorHandlerInterfaceImpl(Object obj) {
    }

    private synchronized ReflectMethod getCancelMethod() {
    }

    private synchronized ReflectMethod getProceedMethod() {
    }

    public static void handleRuntimeError(Exception exc) {
    }

    @Override // com.tencent.xweb.pinus.sdk.SslErrorHandlerInterface
    public void cancel() {
    }

    @Override // com.tencent.xweb.pinus.sdk.SslErrorHandlerInterface
    public void proceed() {
    }
}
