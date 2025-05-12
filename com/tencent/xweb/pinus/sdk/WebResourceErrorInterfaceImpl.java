package com.tencent.xweb.pinus.sdk;

import android.annotation.SuppressLint;
import com.tencent.xweb.util.ReflectMethod;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class WebResourceErrorInterfaceImpl implements WebResourceErrorInterface {
    public static final String TAG = "WebResourceErrorInterfaceImpl";
    public ReflectMethod getDescriptionMethod;
    public ReflectMethod getErrorCodeMethod;
    public final Object inner;

    public WebResourceErrorInterfaceImpl(Object obj) {
    }

    private synchronized ReflectMethod getGetDescriptionMethod() {
    }

    private synchronized ReflectMethod getGetErrorCodeMethod() {
    }

    @SuppressLint({"LongLogTag"})
    public static void handleRuntimeError(Exception exc) {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebResourceErrorInterface
    public CharSequence getDescription() {
    }

    @Override // com.tencent.xweb.pinus.sdk.WebResourceErrorInterface
    public int getErrorCode() {
    }
}
