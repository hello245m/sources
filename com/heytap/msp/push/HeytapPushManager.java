package com.heytap.msp.push;

import android.content.Context;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.mode.MessageStat;
import java.util.List;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class HeytapPushManager {
    public static void clearNotificationType() {
    }

    public static void clearNotificationType(JSONObject jSONObject) {
    }

    public static void clearNotifications() {
    }

    public static void clearNotifications(JSONObject jSONObject) {
    }

    public static void disableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
    }

    public static void enableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
    }

    public static void getAppNotificationSwitch(IGetAppNotificationCallBackService iGetAppNotificationCallBackService) {
    }

    public static String getMcsPackageName(Context context) {
    }

    public static void getNotificationStatus() {
    }

    public static void getNotificationStatus(JSONObject jSONObject) {
    }

    public static ICallBackResultService getPushCallback() {
    }

    public static void getPushStatus() {
    }

    public static int getPushVersionCode() {
    }

    public static String getPushVersionName() {
    }

    public static String getReceiveSdkAction(Context context) {
    }

    public static void getRegister() {
    }

    public static void getRegister(JSONObject jSONObject) {
    }

    public static String getRegisterID() {
    }

    public static int getSDKVersionCode() {
    }

    public static String getSDKVersionName() {
    }

    public static void init(Context context, boolean z) {
    }

    public static boolean isSupportPush(Context context) {
    }

    public static void openNotificationSettings() {
    }

    public static void openNotificationSettings(JSONObject jSONObject) {
    }

    public static void pausePush() {
    }

    public static void pausePush(JSONObject jSONObject) {
    }

    public static void register(Context context, String str, String str2, ICallBackResultService iCallBackResultService) {
    }

    public static void register(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
    }

    public static void requestNotificationPermission() {
    }

    public static void resumePush() {
    }

    public static void resumePush(JSONObject jSONObject) {
    }

    public static void setAppKeySecret(String str, String str2) {
    }

    public static void setNotificationType(int i2) {
    }

    public static void setNotificationType(int i2, JSONObject jSONObject) {
    }

    public static void setPushCallback(ICallBackResultService iCallBackResultService) {
    }

    public static void setPushTime(List<Integer> list, int i2, int i3, int i4, int i5) {
    }

    public static void setPushTime(List<Integer> list, int i2, int i3, int i4, int i5, JSONObject jSONObject) {
    }

    public static void setRegisterID(String str) {
    }

    public static void statisticEvent(Context context, String str, DataMessage dataMessage) {
    }

    @Deprecated
    public static void statisticMessage(Context context, MessageStat messageStat) {
    }

    @Deprecated
    public static void statisticMessage(Context context, List<MessageStat> list) {
    }

    public static void unRegister() {
    }

    public static void unRegister(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
    }

    public static void unRegister(JSONObject jSONObject) {
    }
}
