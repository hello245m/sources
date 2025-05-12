package com.tencent.android.tpush.stat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.android.tpush.service.protocol.PushStatClientReport;
import com.tencent.android.tpush.service.protocol.j;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ServiceStat {
    public static final String ACCOUNT_EVENT_ID = "SdkAccount";
    public static final String ACK_EVENT_ID = "Ack";
    public static final String APP_LIST_EVENT_ID = "app_list";
    public static final int EnumPushAction_IN_MSG_ACTION_MOBILE_USER_DISABLED = 129;
    public static final int EnumPushAction_PUSH_ACTION_MOBILE_APP_RECEIVED = 8;
    public static final int EnumPushAction_PUSH_ACTION_MOBILE_CLEAN_UP = 64;
    public static final int EnumPushAction_PUSH_ACTION_MOBILE_REVOKE_MESSAGE_SERVICE_RECEIVED = 2048;
    public static final int EnumPushAction_PUSH_ACTION_MOBILE_SERVICE_RECEIVED = 4;
    public static final int EnumPushAction_PUSH_ACTION_MOBILE_SHOW = 128;
    public static final int EnumPushAction_PUSH_ACTION_MOBILE_USER_CLICK = 16;
    public static final int EnumPushChannel = 0;
    public static final int EnumPushChannel_CHANNEL_FCM = 101;
    public static final int EnumPushChannel_CHANNEL_HONOR = 107;
    public static final int EnumPushChannel_CHANNEL_HUAWEI = 102;
    public static final int EnumPushChannel_CHANNEL_LOCAL = 99;
    public static final int EnumPushChannel_CHANNEL_MEIZU = 106;
    public static final int EnumPushChannel_CHANNEL_OPPO = 105;
    public static final int EnumPushChannel_CHANNEL_VIVO = 104;
    public static final int EnumPushChannel_CHANNEL_XG = 100;
    public static final int EnumPushChannel_CHANNEL_XIAOMI = 103;
    public static final String FAILED_CNT = "failed_cnt";
    public static final String HEARTBEAT_EVENT_ID = "SdkHeartbeat";
    public static final String IS_CUSTOMDATA_VERSION_EVENT_ID = "IsCustomDataVersion";
    public static final String LAST_REPORT_APPLIST = "last_reportAppList_time";
    public static final String LAST_REPORT_NOTIFICATION = "last_reportNotification_time";
    public static final String NETWORKTYOE = "np";
    public static final String NOTIFACTION_CLICK_OR_CLEAR_EVENT_ID = "Action";
    public static final String NOTIFICATION_STATUS_EVENT_ID = "notification_st";
    public static final String REGISTER_EVENT_ID = "SdkRegister";
    public static final String SDK_ACK_EVENT_ID = "SdkAck";
    public static final String SDK_OTHER_PULLUP_ID = "OtherPull";
    public static final String SERVICE_EVENT_ID = "SdkService";
    public static final String SHOW_EVENT_ID = "SHOW";
    public static final String SRV_ACK_EVENT_ID = "SrvAck";
    public static final String STRATTIME = "failed_cnt";
    public static final String SUCC_CNT = "suc_cnt";
    public static final String UNREGISTER_EVENT_ID = "SdkUnRegister";
    public static final String VERIFY_EVENT_ID = "Verify";
    public static AtomicBoolean _isInited = null;
    private static Context a = null;
    private static boolean b = false;
    private static volatile a c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a extends BroadcastReceiver {

        /* renamed from: com.tencent.android.tpush.stat.ServiceStat$a$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1 extends TTask {
            public final /* synthetic */ Context a;
            public final /* synthetic */ a b;

            public AnonymousClass1(a aVar, Context context) {
            }

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        }

        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        public /* synthetic */ a(AnonymousClass1 anonymousClass1) {
        }
    }

    private static void a(Context context, Intent intent, int i2) {
    }

    public static void appReportInMsgUserDisabled(Context context, Intent intent) {
    }

    public static void appReportNotificationCleared(Context context, Intent intent) {
    }

    public static void appReportNotificationClicked(Context context, Intent intent) {
    }

    public static void appReportNotificationShowed(Context context, Intent intent) {
    }

    public static void appReportPullupAck(Context context, Intent intent) {
    }

    public static void appReportRevokeMessageServiceReceived(Context context, Intent intent) {
    }

    public static void appReportSDKReceived(Context context, Intent intent) {
    }

    public static void appReportServiceReceived(Context context, Intent intent) {
    }

    public static void commit() {
    }

    public static void debug(boolean z) {
    }

    public static synchronized void init(Context context) {
    }

    public static void reportAck(ArrayList<PushStatClientReport> arrayList) {
    }

    public static void reportCloudControl(Context context, long j2, int i2, String str, long j3) {
    }

    public static void reportCustomData(Context context, String str, Properties properties) {
    }

    public static void reportCustomData4FirstLaunch(Context context) {
    }

    public static void reportErrCode(Context context, int i2, String str, long j2, String str2) {
    }

    public static void reportIsCustomDataAcquisitionVersion(Context context) {
    }

    public static void reportLaunchEvent(Context context, int i2, int i3, long j2) {
    }

    public static void reportNotifactionClickedOrClear(ArrayList<PushStatClientReport> arrayList) {
    }

    public static void reportPullYYB() {
    }

    public static void reportSrvAck(ArrayList<j> arrayList) {
    }

    public static void reportTokenFailed(Context context) {
    }

    public static void reportXGLBS(Context context, String str, JSONObject jSONObject) {
    }

    public static void reportXGStat(Context context, long j2, String str, JSONObject jSONObject) {
    }

    public static void reportXGStat2(Context context, String str, JSONObject jSONObject) {
    }

    public static void sendLocalMsg(Context context) {
    }
}
