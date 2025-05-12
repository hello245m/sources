package com.tencent.xweb.pinus.sdk;

import android.annotation.SuppressLint;
import com.tencent.xweb.util.ReflectMethod;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class HttpAuthHandlerInterfaceImpl implements HttpAuthHandlerInterface {
    public static final String TAG = "HttpAuthHandlerInterfaceImpl";
    public ReflectMethod cancelMethod;
    public final Object inner;
    public ReflectMethod proceedStringStringMethod;
    public ReflectMethod useHttpAuthUsernamePasswordMethod;

    public HttpAuthHandlerInterfaceImpl(Object obj) {
    }

    private synchronized ReflectMethod getCancelMethod() {
    }

    private synchronized ReflectMethod getProceedStringStringMethod() {
    }

    private synchronized ReflectMethod getUseHttpAuthUsernamePasswordMethod() {
    }

    @SuppressLint({"LongLogTag"})
    public static void handleRuntimeError(Exception exc) {
    }

    @Override // com.tencent.xweb.pinus.sdk.HttpAuthHandlerInterface
    public void cancel() {
    }

    @Override // com.tencent.xweb.pinus.sdk.HttpAuthHandlerInterface
    public void proceed(String str, String str2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.HttpAuthHandlerInterface
    public boolean useHttpAuthUsernamePassword() {
    }
}
