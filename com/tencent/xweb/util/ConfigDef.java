package com.tencent.xweb.util;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ConfigDef {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class BaseVersion {
        public String UPDATE_FORWARD_SPEED_CONFIG;
        public String UPDATE_SCHEDULE_TIME_RANGE_BIND;
        public String UPDATE_SPEED_CONFIG;
        public boolean bCanUseCellular;
        public boolean bForbidDownloadWhenNoUin;
        public boolean bUseCdn;
        public Filter filter;
        public boolean lowPriority;
        public int nPeriod;
        public Patch[] patches;
        public String releaseDate;
        public String strMd5;
        public String strUrl;
        public float updateEndTime;
        public String updateSchedule;
        public float updateStartTime;
        public int version;
        public int versionId;

        public int[] getSchedules() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class Command {
        public Filter filter;
        public String module;
        public String optype;
        public String opvalue;

        public String toString() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class Config {
        public Command[] commands;
        public String signature;
        public String strConfigVer;
        public String strMd5;
        public Version[] versions;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class Filter {
        public String a;
        public int apiMax;
        public int apiMin;
        public int apkMax;
        public int apkMin;
        public int appClientVerMax;
        public int appClientVerMin;
        public String appInfoBlackList;
        public String appInfoWhiteList;
        public String b;
        public String blackDeviceAbis;
        public String blackRuntimeAbis;
        public int chromeMax;
        public int chromeMin;
        public int dayGrayMax;
        public int dayGrayMin;
        public String deviceAbis;
        public String forbidAppRegex;
        public String forbidDeviceRegex;
        public int grayMax;
        public int grayMin;
        public double hoursEnd;
        public double hoursStart;
        public int preDownApkMax;
        public int preDownApkMin;
        public String runtimeAbis;
        public int sdkMax;
        public int sdkMin;
        public int targetApiMax;
        public int targetApiMin;
        public int usertype;
        public String whiteAppRegex;
        public String whiteDeviceRegex;
        public int x5coremax;
        public int x5coremin;
        public int x5sdkmax;
        public int x5sdkmin;

        public static boolean a(int i2, int i3, int i4) {
        }

        public final boolean a(double d) {
        }

        public final boolean a(int i2, int i3, int i4, int i5, boolean z) {
        }

        public final boolean b() {
        }

        public final boolean c() {
        }

        public boolean checkMatch(boolean z, boolean z2, String str) {
        }

        public final boolean d() {
        }

        public final boolean e() {
        }

        public final boolean f() {
        }

        public final boolean g() {
        }

        public String getTargetRuntimeAbi() {
        }

        public final boolean h() {
        }

        public final String i() {
        }

        public boolean isPredownMode() {
        }

        public final boolean j() {
        }

        public void setTargetRuntimeAbi(String str) {
        }

        public String toString() {
        }

        public static boolean b(String str, String str2) {
        }

        public final boolean a(boolean z) {
        }

        public final boolean a() {
        }

        public static boolean a(String str) {
        }

        public static boolean a(String str, String str2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class Patch {
        public boolean bCanUseCellular;
        public boolean bUseCdn;
        public int nPatchType;
        public int nTargetVersion;
        public String strMd5;
        public String strUrl;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class PluginConfig {
        public Command[] commands;
        public PluginInfo[] plugins;
        public String signature;
        public String strConfigVer;
        public String strMd5;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class PluginInfo extends BaseVersion {
        public String strName;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class Version extends BaseVersion {
        public boolean bTryUseSharedCore;
        public boolean supportPredown;
        public String updateHourSpeed;
        public VersionDes verDes;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class VersionDes {
        public String strVersion;
    }
}
