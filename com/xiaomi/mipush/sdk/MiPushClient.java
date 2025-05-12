package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.xiaomi.push.ds;
import com.xiaomi.push.gu;
import com.xiaomi.push.hd;
import com.xiaomi.push.he;
import com.xiaomi.push.service.ad;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class MiPushClient {
    public static final String COMMAND_REGISTER = "register";
    public static final String COMMAND_SET_ACCEPT_TIME = "accept-time";
    public static final String COMMAND_SET_ACCOUNT = "set-account";
    public static final String COMMAND_SET_ALIAS = "set-alias";
    public static final String COMMAND_SUBSCRIBE_TOPIC = "subscribe-topic";
    public static final String COMMAND_UNREGISTER = "unregister";
    public static final String COMMAND_UNSET_ACCOUNT = "unset-account";
    public static final String COMMAND_UNSET_ALIAS = "unset-alias";
    public static final String COMMAND_UNSUBSCRIBE_TOPIC = "unsubscibe-topic";
    public static final String PREF_EXTRA = "mipush_extra";
    private static Context sContext;
    private static long sCurMsgId;

    /* renamed from: com.xiaomi.mipush.sdk.MiPushClient$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class AnonymousClass1 implements Runnable {
        public final /* synthetic */ String val$alias;
        public final /* synthetic */ String val$appID;
        public final /* synthetic */ String val$appToken;
        public final /* synthetic */ ICallbackResult val$iCallbackResult;

        public AnonymousClass1(String str, String str2, String str3, ICallbackResult iCallbackResult) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.xiaomi.mipush.sdk.MiPushClient$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.xiaomi.mipush.sdk.MiPushClient$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.xiaomi.mipush.sdk.MiPushClient$4, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class AnonymousClass4 implements Runnable {
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ String[] val$packageNames;

        public AnonymousClass4(String[] strArr, Context context) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.xiaomi.mipush.sdk.MiPushClient$5, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class AnonymousClass5 implements ds.a {
        @Override // com.xiaomi.push.ds.a
        public void uploader(Context context, gu guVar) {
        }
    }

    /* renamed from: com.xiaomi.mipush.sdk.MiPushClient$6, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public final class AnonymousClass6 extends ad.a {
        public final /* synthetic */ Context val$context;

        public AnonymousClass6(int i2, String str, Context context) {
        }

        @Override // com.xiaomi.push.service.ad.a
        public void onCallback() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class CodeResult {
        private long resultCode;

        public long getResultCode() {
        }

        public void setResultCode(long j2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface ICallbackResult<R> {
        void onResult(R r2);
    }

    @Deprecated
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static abstract class MiPushClientCallback {
        private String category;

        public String getCategory() {
        }

        public void onCommandResult(String str, long j2, String str2, List<String> list) {
        }

        public void onInitializeResult(long j2, String str, String str2) {
        }

        public void onReceiveMessage(MiPushMessage miPushMessage) {
        }

        public void onReceiveMessage(String str, String str2, String str3, boolean z) {
        }

        public void onSubscribeResult(long j2, String str, String str2) {
        }

        public void onUnsubscribeResult(long j2, String str, String str2) {
        }

        public void setCategory(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class TokenResult {
        private long resultCode;
        private String token;

        public long getResultCode() {
        }

        public String getToken() {
        }

        public void setResultCode(long j2) {
        }

        public void setToken(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface UPSRegisterCallBack extends ICallbackResult<TokenResult> {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface UPSTurnCallBack extends ICallbackResult<CodeResult> {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface UPSUnRegisterCallBack extends ICallbackResult<TokenResult> {
    }

    private static boolean acceptTimeSet(Context context, String str, String str2) {
    }

    public static /* synthetic */ Context access$000() {
    }

    public static /* synthetic */ void access$100(Context context, String str, String str2, MiPushClientCallback miPushClientCallback, String str3, ICallbackResult iCallbackResult) {
    }

    public static /* synthetic */ void access$200(Context context, PackageInfo packageInfo) {
    }

    public static long accountSetTime(Context context, String str) {
    }

    public static synchronized void addAcceptTime(Context context, String str, String str2) {
    }

    public static synchronized void addAccount(Context context, String str) {
    }

    public static synchronized void addAlias(Context context, String str) {
    }

    private static void addPullNotificationTime(Context context) {
    }

    private static void addRegRequestTime(Context context) {
    }

    public static synchronized void addTopic(Context context, String str) {
    }

    public static long aliasSetTime(Context context, String str) {
    }

    public static void awakeApps(Context context, String[] strArr) {
    }

    private static void awakePushServiceByPackageInfo(Context context, PackageInfo packageInfo) {
    }

    private static void checkNotNull(Object obj, String str) {
    }

    public static void clearExtras(Context context) {
    }

    private static void clearExtrasForInitialize(Context context) {
    }

    public static void clearLocalNotificationType(Context context) {
    }

    public static void clearNotification(Context context) {
    }

    public static void clearNotification(Context context, int i2) {
    }

    public static void clearNotification(Context context, String str, String str2) {
    }

    public static void disablePush(Context context) {
    }

    public static void enablePush(Context context) {
    }

    public static String getAcceptTime(Context context) {
    }

    public static List<String> getAllAlias(Context context) {
    }

    public static List<String> getAllTopic(Context context) {
    }

    public static List<String> getAllUserAccount(Context context) {
    }

    public static String getAppRegion(Context context) {
    }

    private static boolean getDefaultSwitch() {
    }

    public static boolean getOpenFCMPush(Context context) {
    }

    public static boolean getOpenHmsPush(Context context) {
    }

    public static boolean getOpenOPPOPush(Context context) {
    }

    public static boolean getOpenVIVOPush(Context context) {
    }

    public static String getRegId(Context context) {
    }

    private static void initEventPerfLogic(Context context) {
    }

    @Deprecated
    public static void initialize(Context context, String str, String str2, MiPushClientCallback miPushClientCallback) {
    }

    private static void initialize(Context context, String str, String str2, MiPushClientCallback miPushClientCallback, String str3, ICallbackResult iCallbackResult) {
    }

    private static void operateSyncAction(Context context) {
    }

    public static void pausePush(Context context, String str) {
    }

    public static void reInitialize(Context context, he heVar) {
    }

    @Deprecated
    public static void registerCrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
    }

    private static void registerNetworkReceiver(Context context) {
    }

    public static void registerPush(Context context, String str, String str2) {
    }

    public static void registerPush(Context context, String str, String str2, PushConfiguration pushConfiguration) {
    }

    private static void registerPush(Context context, String str, String str2, PushConfiguration pushConfiguration, String str3, ICallbackResult iCallbackResult) {
    }

    public static void registerPush(Context context, String str, String str2, String str3) {
    }

    public static void registerToken(Context context, String str, String str2, String str3, UPSRegisterCallBack uPSRegisterCallBack) {
    }

    public static synchronized void removeAcceptTime(Context context) {
    }

    public static synchronized void removeAccount(Context context, String str) {
    }

    public static synchronized void removeAlias(Context context, String str) {
    }

    public static synchronized void removeAllAccounts(Context context) {
    }

    public static synchronized void removeAllAliases(Context context) {
    }

    public static synchronized void removeAllTopics(Context context) {
    }

    public static synchronized void removeTopic(Context context, String str) {
    }

    public static void removeWindow(Context context) {
    }

    public static void reportAppRunInBackground(Context context, boolean z) {
    }

    public static void reportIgnoreRegMessageClicked(Context context, String str, hd hdVar, String str2, String str3) {
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
    }

    @Deprecated
    public static void reportMessageClicked(Context context, String str) {
    }

    public static void reportMessageClicked(Context context, String str, hd hdVar, String str2) {
    }

    public static void resumePush(Context context, String str) {
    }

    private static void scheduleDataCollectionJobs(Context context) {
    }

    private static void scheduleOcVersionCheckJob() {
    }

    public static void setAcceptTime(Context context, int i2, int i3, int i4, int i5, String str) {
    }

    public static void setAlias(Context context, String str, String str2) {
    }

    public static void setCommand(Context context, String str, String str2, String str3) {
    }

    public static void setCommand(Context context, String str, ArrayList<String> arrayList, String str2) {
    }

    public static void setLocalNotificationType(Context context, int i2) {
    }

    public static void setUserAccount(Context context, String str, String str2) {
    }

    private static boolean shouldPullNotification(Context context) {
    }

    private static boolean shouldSendRegRequest(Context context) {
    }

    public static boolean shouldUseMIUIPush(Context context) {
    }

    public static void subscribe(Context context, String str, String str2) {
    }

    public static void syncAssembleCOSPushToken(Context context) {
    }

    public static void syncAssembleFCMPushToken(Context context) {
    }

    public static void syncAssembleFTOSPushToken(Context context) {
    }

    public static void syncAssemblePushToken(Context context) {
    }

    public static long topicSubscribedTime(Context context, String str) {
    }

    public static void turnOffPush(Context context, UPSTurnCallBack uPSTurnCallBack) {
    }

    public static void turnOnPush(Context context, UPSTurnCallBack uPSTurnCallBack) {
    }

    public static void unRegisterToken(Context context, UPSUnRegisterCallBack uPSUnRegisterCallBack) {
    }

    public static void unregisterPush(Context context) {
    }

    public static void unsetAlias(Context context, String str, String str2) {
    }

    public static void unsetUserAccount(Context context, String str, String str2) {
    }

    public static void unsubscribe(Context context, String str, String str2) {
    }

    private static void updateImeiOrOaid() {
    }
}
