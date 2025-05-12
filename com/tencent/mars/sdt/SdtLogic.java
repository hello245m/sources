package com.tencent.mars.sdt;

import java.util.ArrayList;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class SdtLogic {
    private static final String TAG = "mars.SdtLogic";
    private static ICallBack callBack;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface ICallBack {
    }

    private static native ArrayList<String> getLoadLibraries();

    private static void reportSignalDetectResults(String str) {
    }

    public static void setCallBack(ICallBack iCallBack) {
    }

    public static native void setHttpNetcheckCGI(String str);
}
