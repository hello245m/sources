package com.tencent.android.tpush;

import android.content.Intent;
import java.io.Serializable;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class XGPushClickedResult implements XGIResult, Serializable {
    public static final int NOTIFACTION_CLICKED_TYPE = 0;
    public static final int NOTIFACTION_DELETED_TYPE = 0;
    public static final int NOTIFACTION_DOWNLOAD_CANCEL_TYPE = 0;
    public static final int NOTIFACTION_DOWNLOAD_TYPE = 0;
    public static final int NOTIFACTION_OPEN_CANCEL_TYPE = 0;
    public static final int NOTIFACTION_OPEN_TYPE = 0;
    public static final int NOTIFICATION_ACTION_ACTIVITY = 0;
    private static final String TAG = "XGPushClickedResult";
    private static final long serialVersionUID = 5485267763104201539L;
    public int actionType;
    public String activityName;
    public String content;
    public String customContent;
    public boolean isCustomLayout;
    public long msgId;
    public int notificationActionType;
    public int pushChannel;
    public String templateId;
    public String title;
    public String traceId;

    public long getActionType() {
    }

    public String getActivityName() {
    }

    public String getContent() {
    }

    public String getCustomContent() {
    }

    public long getMsgId() {
    }

    public int getNotificationActionType() {
    }

    public int getPushChannel() {
    }

    public String getTemplateId() {
    }

    public String getTitle() {
    }

    public String getTraceId() {
    }

    public boolean isCustomLayout() {
    }

    @Override // com.tencent.android.tpush.XGIResult
    public void parseIntent(Intent intent) {
    }

    public String toString() {
    }
}
