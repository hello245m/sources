package com.tencent.mars.app;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class AppLogic {
    private static final String TAG = "mars.app.NativeAppJni$C2Java";
    private static ICallBack callBack;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class DeviceInfo {
        public String devicename;
        public String devicetype;

        public DeviceInfo(String str, String str2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface ICallBack {
        AccountInfo getAccountInfo();

        String getAppFilePath();

        int getClientVersion();

        String getCurLanguage();

        DeviceInfo getDeviceType();
    }

    private static AccountInfo getAccountInfo() {
    }

    public static String getAppFilePath() {
    }

    private static int getClientVersion() {
    }

    private static String getCurLanguage() {
    }

    private static DeviceInfo getDeviceType() {
    }

    public static void setCallBack(ICallBack iCallBack) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class AccountInfo {
        public long uin;
        public String userName;

        public AccountInfo() {
        }

        public AccountInfo(long j2, String str) {
        }
    }
}
