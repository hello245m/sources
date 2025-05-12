package com.tencent.mars.magicbox;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class IPxxLogic {
    private static ICallBack callBack;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface ICallBack {
        String getCrashFilePath(int i2);

        String getUploadLogExtrasInfo(String str);

        void recoverLinkAddrs();

        void setNewDnsDebugHostInfo(String str, int i2);

        void uploadLogFail();

        void uploadLogResponse(long j2, long j3);

        void uploadLogSuccess();
    }

    private static String getCrashFilePath(int i2) {
    }

    private static String getUploadLogExtrasInfo(String str) {
    }

    public static native void onIPxx(String str, int i2);

    public static void recoverLinkAddrs() {
    }

    public static void setCallBack(ICallBack iCallBack) {
    }

    public static native void setHost(String str);

    private static void setNewDnsDebugHostInfo(String str, int i2) {
    }

    public static native void uploadFile(String str, int i2, long j2, String str2);

    public static native void uploadLog(int i2, int[] iArr, boolean z, long j2, String str);

    public static void uploadLogFail() {
    }

    public static void uploadLogResponse(long j2, long j3) {
    }

    public static void uploadLogSuccess() {
    }
}
