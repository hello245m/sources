package com.heytap.mcssdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.heytap.mcssdk.d.d;
import com.heytap.mcssdk.e.c;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class PushService implements com.heytap.mcssdk.a {
    private static final String APP_PACKAGE = "appPackage";
    private static final String APP_VERSION_CODE = "versionCode";
    private static final String APP_VERSION_NAME = "versionName";
    private static final int DEFAULT_API_MAX_COUNT = 2;
    private static final String EVENT_ID = "eventID";
    private static final String EXTRA = "extra";
    private static final String GLOBAL_ID = "globalID";
    private static final int MAX_HOUR_IN_DAY = 23;
    private static final int MAX_MIN_IN_HOUR = 59;
    private static final int MCS_SUPPORT_VERSION = 1019;
    private static final String MESSAGE_ID = "messageID";
    private static final String MESSAGE_TYPE = "messageType";
    private static String NEW_MCS_RECEIVE_SDK_ACTION = null;
    private static final String NEW_MCS_RECEIVE_SDK_ACTION_Base64 = "Y29tLm1jcy5hY3Rpb24uUkVDRUlWRV9TREtfTUVTU0FHRQ==";
    private static final int[] OLD_MCS_PACKAGE = null;
    private static final int[] OLD_MCS_RECEIVE_SDK_ACTION = null;
    private static final String PUSH_SDK_VERSION = "pushSdkVersion";
    private static final int SDK_INT_24 = 24;
    private static final String SUPPORT_OPEN_PUSH = "supportOpenPush";
    private static final int SYSTEM_UID = 1000;
    private static final String TASK_ID = "taskID";
    private static final String TYPE = "type";
    private static int sCount;
    private static boolean sIsNewMcsPkg;
    private static String sMcsPkgName;
    private ConcurrentHashMap<Integer, com.heytap.mcssdk.c.a> mAppLimitMap;
    private String mAuthCode;
    private Context mContext;
    private ICallBackResultService mICallBackResultService;
    private IGetAppNotificationCallBackService mIGetAppNotificationCallBackService;
    private ISetAppNotificationCallBackService mISetAppNotificationCallBackService;
    private List<d> mParsers;
    private List<c> mProcessors;
    private String mRegisterID;
    private String mVerifyCode;

    /* renamed from: com.heytap.mcssdk.PushService$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements ServiceConnection {
        public final /* synthetic */ Intent a;
        public final /* synthetic */ PushService b;

        public AnonymousClass1(PushService pushService, Intent intent) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a {
        private static final PushService a = null;

        private a() {
        }

        public static /* synthetic */ PushService a() {
        }
    }

    private PushService() {
    }

    public /* synthetic */ PushService(AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ Context access$100(PushService pushService) {
    }

    private com.heytap.mcssdk.c.a addCommandToMap(int i2) {
    }

    private synchronized void addParser(d dVar) {
    }

    private synchronized void addProcessor(c cVar) {
    }

    private boolean checkAll() {
    }

    private boolean checkContext() {
    }

    private boolean checkRegisterID() {
    }

    private boolean checkTimeNeedUpdate(com.heytap.mcssdk.c.a aVar) {
    }

    public static PushService getInstance() {
    }

    private Intent getIntent(int i2, String str, JSONObject jSONObject) {
    }

    private String getNewMcsPackageName(Context context) {
    }

    public static int getSDKVersionCode() {
    }

    public static String getSDKVersionName() {
    }

    private boolean isSupportPushInner(Context context) {
    }

    @Deprecated
    private static void onAppStart(Context context) {
    }

    private void startMcsService(int i2, String str, JSONObject jSONObject) {
    }

    private void startMcsService(int i2, JSONObject jSONObject) {
    }

    public void bindMcsService(int i2) {
    }

    public boolean checkCommandLimit(int i2) {
    }

    @Override // com.heytap.mcssdk.a
    public void clearNotificationType() {
    }

    @Override // com.heytap.mcssdk.a
    public void clearNotificationType(JSONObject jSONObject) {
    }

    @Override // com.heytap.mcssdk.a
    public void clearNotifications() {
    }

    @Override // com.heytap.mcssdk.a
    public void clearNotifications(JSONObject jSONObject) {
    }

    @Override // com.heytap.mcssdk.a
    public void disableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
    }

    @Override // com.heytap.mcssdk.a
    public void enableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
    }

    public Map<Integer, com.heytap.mcssdk.c.a> getAppLimitMap() {
    }

    @Override // com.heytap.mcssdk.a
    public void getAppNotificationSwitch(IGetAppNotificationCallBackService iGetAppNotificationCallBackService) {
    }

    public Context getContext() {
    }

    public int getErrorCode(int i2) {
    }

    public String getMcsPackageName(Context context) {
    }

    @Override // com.heytap.mcssdk.a
    public void getNotificationStatus() {
    }

    @Override // com.heytap.mcssdk.a
    public void getNotificationStatus(JSONObject jSONObject) {
    }

    public List<d> getParsers() {
    }

    public List<c> getProcessors() {
    }

    public ICallBackResultService getPushCallback() {
    }

    public IGetAppNotificationCallBackService getPushGetAppNotificationCallBack() {
    }

    public ISetAppNotificationCallBackService getPushSetAppNotificationCallBack() {
    }

    public void getPushStatus() {
    }

    public int getPushVersionCode() {
    }

    public String getPushVersionName() {
    }

    public String getReceiveSdkAction(Context context) {
    }

    @Override // com.heytap.mcssdk.a
    public void getRegister() {
    }

    @Override // com.heytap.mcssdk.a
    public void getRegister(JSONObject jSONObject) {
    }

    @Override // com.heytap.mcssdk.a
    public String getRegisterID() {
    }

    public PushService init(Context context, boolean z) {
    }

    public void innerInit(Context context) {
    }

    public boolean isSupportPushByClient(Context context) {
    }

    @Override // com.heytap.mcssdk.a
    public void openNotificationSettings() {
    }

    @Override // com.heytap.mcssdk.a
    public void openNotificationSettings(JSONObject jSONObject) {
    }

    @Override // com.heytap.mcssdk.a
    public void pausePush() {
    }

    @Override // com.heytap.mcssdk.a
    public void pausePush(JSONObject jSONObject) {
    }

    @Override // com.heytap.mcssdk.a
    public void register(Context context, String str, String str2, ICallBackResultService iCallBackResultService) {
    }

    @Override // com.heytap.mcssdk.a
    public void register(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
    }

    @Override // com.heytap.mcssdk.a
    public void requestNotificationPermission() {
    }

    @Override // com.heytap.mcssdk.a
    public void resumePush() {
    }

    @Override // com.heytap.mcssdk.a
    public void resumePush(JSONObject jSONObject) {
    }

    public void setAppKeySecret(String str, String str2) {
    }

    @Override // com.heytap.mcssdk.a
    public void setNotificationType(int i2) {
    }

    @Override // com.heytap.mcssdk.a
    public void setNotificationType(int i2, JSONObject jSONObject) {
    }

    public void setPushCallback(ICallBackResultService iCallBackResultService) {
    }

    @Override // com.heytap.mcssdk.a
    public void setPushTime(List<Integer> list, int i2, int i3, int i4, int i5) {
    }

    @Override // com.heytap.mcssdk.a
    public void setPushTime(List<Integer> list, int i2, int i3, int i4, int i5, JSONObject jSONObject) {
    }

    @Override // com.heytap.mcssdk.a
    public void setRegisterID(String str) {
    }

    @Override // com.heytap.mcssdk.a
    public void unRegister() {
    }

    public void unRegister(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
    }

    @Override // com.heytap.mcssdk.a
    public void unRegister(JSONObject jSONObject) {
    }
}
