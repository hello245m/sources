package com.tencent.android.tpush;

import android.content.Context;
import android.content.SharedPreferences;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.jg.JgMethodChecked;
import com.tencent.tpns.baseapi.base.logger.LoggerInterface;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.util.List;

@JgClassChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20150316", reviewer = 3, vComment = {EType.RECEIVERCHECK, EType.INTENTCHECK})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class XGPushConfig {
    public static final String TPUSH_ACCESS_CHANNAL = "XG_V4_CHANNEL_ID";
    public static final String TPUSH_ACCESS_ID = "XG_V2_ACCESS_ID";
    public static final String TPUSH_ACCESS_KEY = "XG_V2_ACCESS_KEY";
    public static final String TPUSH_IS_FOREIGINPUSH = "TPUSH_IS_FOREIGINPUSH";
    public static boolean _isHuaweiDebug = false;
    private static String a = "";
    public static boolean autoInit = true;
    private static String b = "";
    private static boolean c = true;
    private static String d = "";
    private static long e = -1;
    public static Boolean enableApplist = null;
    public static boolean enableDebug = false;
    public static Boolean enableLocation;
    public static Boolean enableNotification;
    private static Boolean f;
    public static Boolean fcmIsSuccess;
    private static Boolean g;
    private static Boolean h;

    /* renamed from: i, reason: collision with root package name */
    private static Boolean f724i;
    public static Boolean isUsedFcmPush;
    public static Boolean isUsedOtherPush;

    /* renamed from: j, reason: collision with root package name */
    private static Boolean f725j;

    /* renamed from: k, reason: collision with root package name */
    private static SharedPreferences f726k;
    public static String notificationChannelID;
    public static String notificationChannelName;
    public static Boolean useFcmFirst;

    /* renamed from: com.tencent.android.tpush.XGPushConfig$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 extends TTask {
        public final /* synthetic */ Context a;
        public final /* synthetic */ boolean b;

        public AnonymousClass1(Context context, boolean z) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        @JgMethodChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20150316", reviewer = 3, vComment = {EType.RECEIVERCHECK, EType.INTENTCHECK})
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushConfig$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass2 extends TTask {
        public final /* synthetic */ Context a;
        public final /* synthetic */ int b;

        public AnonymousClass2(Context context, int i2) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        @JgMethodChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20150316", reviewer = 3, vComment = {EType.RECEIVERCHECK, EType.INTENTCHECK})
        public void TRun() {
        }
    }

    /* renamed from: com.tencent.android.tpush.XGPushConfig$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass3 extends TTask {
        public final /* synthetic */ Context a;

        public AnonymousClass3(Context context) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class Build {
        private Context context;

        /* renamed from: com.tencent.android.tpush.XGPushConfig$Build$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1 extends TTask {
            public final /* synthetic */ int a;
            public final /* synthetic */ Build b;

            public AnonymousClass1(Build build, int i2) {
            }

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        }

        public Build(Context context) {
        }

        public static /* synthetic */ Context access$000(Build build) {
        }

        public Build enableDebug(boolean z) {
        }

        public Build enableFcmPush(boolean z) {
        }

        public Build enableOtherPush(boolean z) {
        }

        public Build setHuaweiDebug(boolean z) {
        }

        public Build setLogLevel(int i2) {
        }

        public Build setMiPushAppId(String str) {
        }

        public Build setMiPushAppKey(String str) {
        }

        public Build setMzPushAppId(String str) {
        }

        public Build setMzPushAppKey(String str) {
        }

        public Build setOppoPushAppId(String str) {
        }

        public Build setOppoPushAppKey(String str) {
        }
    }

    private static void a(Context context, boolean z) {
    }

    public static void changeHuaweiBadgeNum(Context context, int i2) {
    }

    public static void enableAutoStart(Context context, boolean z) {
    }

    public static void enableDebug(Context context, boolean z) {
    }

    public static void enableFcmPush(Context context, boolean z) {
    }

    public static void enableHttpAccountOperate(Context context, boolean z) {
    }

    public static void enableHuaweiV3Update(Context context, boolean z) {
    }

    public static void enableOppoNotification(Context context, boolean z) {
    }

    public static void enableOtherPush(Context context, boolean z) {
    }

    public static void enablePullUpOtherApp(Context context, boolean z) {
    }

    public static void enableShowInMsg(Context context, boolean z) {
    }

    public static void enableTpnsChannel(Context context, boolean z) {
    }

    public static synchronized long getAccessId(Context context) {
    }

    public static synchronized String getAccessKey(Context context) {
    }

    public static List<Long> getAccessidList(Context context) {
    }

    public static synchronized long getChannelId(Context context) {
    }

    public static String getFacilityImei(Context context) {
    }

    public static String getGameServer(Context context) {
    }

    public static String getInstallChannel(Context context) {
    }

    public static String getNotificationChannelID(Context context) {
    }

    public static String getNotificationChannelName(Context context) {
    }

    public static String getOtherPushErrCode(Context context) {
    }

    public static String getOtherPushToken(Context context) {
    }

    public static String getOtherPushType(Context context) {
    }

    public static boolean getReportDebugMode(Context context) {
    }

    public static XGServerInfo getServerIpList(Context context) {
    }

    public static boolean getStatAutoPage(Context context) {
    }

    public static String getToken(Context context) {
    }

    public static Build init(Context context) {
    }

    public static boolean isEnableDebug(Context context) {
    }

    public static boolean isEnableShowInMsg(Context context) {
    }

    public static boolean isForeiginPush(Context context) {
    }

    public static boolean isHuaweiDebug() {
    }

    public static boolean isLocationEnable(Context context) {
    }

    public static boolean isNotTryFcm(Context context) {
    }

    public static boolean isNotificationShowEnable(Context context) {
    }

    public static boolean isReportApplistEnable(Context context) {
    }

    public static boolean isReportNotificationStatusEnable(Context context) {
    }

    public static boolean isUseFcmFirst(Context context) {
    }

    public static boolean isUsedFcmPush(Context context) {
    }

    public static boolean isUsedHttpAccountOperate(Context context) {
    }

    public static boolean isUsedOtherPush(Context context) {
    }

    public static boolean isUsedTpnsChannel(Context context) {
    }

    public static void resetBadgeNum(Context context) {
    }

    public static void resetHuaweiBadgeNum(Context context) {
    }

    public static void setAccessId(Context context, long j2) {
    }

    public static void setAccessKey(Context context, String str) {
    }

    public static void setAutoInit(boolean z) {
    }

    public static void setBadgeNum(Context context, int i2) {
    }

    public static void setForeiginPushEnable(Context context, boolean z) {
    }

    public static void setForeignWeakAlarmMode(Context context, boolean z) {
    }

    public static void setGameServer(Context context, String str) {
    }

    public static void setHeartbeatInterval(Context context, int i2) {
    }

    public static void setHeartbeatIntervalMs(Context context, int i2) {
    }

    public static void setHuaweiBadgeNum(Context context, int i2) {
    }

    public static void setHuaweiDebug(boolean z) {
    }

    public static void setImei(Context context, String str) {
    }

    public static void setInstallChannel(Context context, String str) {
    }

    public static void setLocationEnable(Context context, boolean z) {
    }

    public static void setMiPushAppId(Context context, String str) {
    }

    public static void setMiPushAppKey(Context context, String str) {
    }

    public static void setMzPushAppId(Context context, String str) {
    }

    public static void setMzPushAppKey(Context context, String str) {
    }

    public static void setNotTryFcm(Context context, boolean z) {
    }

    public static void setNotificationChannelID(Context context, String str) {
    }

    public static void setNotificationChannelName(Context context, String str) {
    }

    public static void setNotificationShowEnable(Context context, boolean z) {
    }

    public static void setOPPOBadgeNum(Context context, int i2) {
    }

    public static void setOppoPushAppId(Context context, String str) {
    }

    public static void setOppoPushAppKey(Context context, String str) {
    }

    public static void setPowerSaveMode(Context context, boolean z) {
    }

    public static void setReportApplistEnable(Context context, boolean z) {
    }

    public static void setReportDebugMode(Context context, boolean z) {
    }

    public static void setReportNotificationStatusEnable(Context context, boolean z) {
    }

    public static void setServerIpList(Context context, XGServerInfo xGServerInfo) {
    }

    public static void setStatAutoPage(Context context, boolean z) {
    }

    public static void setTPushLogger(LoggerInterface loggerInterface) {
    }

    public static void setUseFcmFirst(Context context, boolean z) {
    }

    public static void setVivoBadgeNum(Context context, int i2) {
    }

    public static void setfcmSenderId(Context context, String str) {
    }
}
