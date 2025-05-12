package com.tencent.xweb.pinus.sdk;

import android.annotation.SuppressLint;
import com.tencent.xweb.util.ReflectMethod;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class JsResultInterfaceImpl implements JsResultInterface {
    public static final String TAG = "JsResultInterfaceImpl";
    public ReflectMethod cancelMethod;
    public ReflectMethod confirmMethod;
    public ReflectMethod confirmStringMethod;
    public final Object inner;

    public JsResultInterfaceImpl(Object obj) {
    }

    private synchronized ReflectMethod getCancelMethod() {
    }

    private synchronized ReflectMethod getConfirmMethod() {
    }

    private synchronized ReflectMethod getConfirmStringMethod() {
    }

    @SuppressLint({"LongLogTag"})
    public static void handleRuntimeError(Exception exc) {
    }

    @Override // com.tencent.xweb.pinus.sdk.JsResultInterface
    public void cancel() {
    }

    @Override // com.tencent.xweb.pinus.sdk.JsResultInterface
    public void confirm() {
    }

    @Override // com.tencent.xweb.pinus.sdk.JsResultInterface
    public void confirm(String str) {
    }
}
