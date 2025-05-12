package com.xiaomi.mipush.sdk;

import android.os.Bundle;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class MiPushMessage implements PushMessageHandler.a {
    private static final String KEY_ALIAS = "alias";
    private static final String KEY_CATEGORY = "category";
    private static final String KEY_CONTENT = "content";
    private static final String KEY_DESC = "description";
    private static final String KEY_EXTRA = "extra";
    private static final String KEY_MESSAGE_ID = "messageId";
    private static final String KEY_MESSAGE_TYPE = "messageType";
    private static final String KEY_NOTIFIED = "isNotified";
    private static final String KEY_NOTIFY_ID = "notifyId";
    private static final String KEY_NOTIFY_TYPE = "notifyType";
    private static final String KEY_PASS_THROUGH = "passThrough";
    private static final String KEY_TITLE = "title";
    private static final String KEY_TOPIC = "topic";
    private static final String KEY_USER_ACCOUNT = "user_account";
    public static final int MESSAGE_TYPE_ACCOUNT = 3;
    public static final int MESSAGE_TYPE_ALIAS = 1;
    public static final int MESSAGE_TYPE_REG = 0;
    public static final int MESSAGE_TYPE_TOPIC = 2;
    private static final long serialVersionUID = 1;
    private String alias;
    private boolean arrived;
    private String category;
    private String content;
    private String description;
    private HashMap<String, String> extra;
    private boolean isNotified;
    private String messageId;
    private int messageType;
    private int notifyId;
    private int notifyType;
    private int passThrough;
    private String title;
    private String topic;
    private String userAccount;

    public static MiPushMessage fromBundle(Bundle bundle) {
    }

    public String getAlias() {
    }

    public String getCategory() {
    }

    public String getContent() {
    }

    public String getDescription() {
    }

    public Map<String, String> getExtra() {
    }

    public String getMessageId() {
    }

    public int getMessageType() {
    }

    public int getNotifyId() {
    }

    public int getNotifyType() {
    }

    public int getPassThrough() {
    }

    public String getTitle() {
    }

    public String getTopic() {
    }

    public String getUserAccount() {
    }

    public boolean isArrivedMessage() {
    }

    public boolean isNotified() {
    }

    public void setAlias(String str) {
    }

    public void setArrivedMessage(boolean z) {
    }

    public void setCategory(String str) {
    }

    public void setContent(String str) {
    }

    public void setDescription(String str) {
    }

    public void setExtra(Map<String, String> map) {
    }

    public void setMessageId(String str) {
    }

    public void setMessageType(int i2) {
    }

    public void setNotified(boolean z) {
    }

    public void setNotifyId(int i2) {
    }

    public void setNotifyType(int i2) {
    }

    public void setPassThrough(int i2) {
    }

    public void setTitle(String str) {
    }

    public void setTopic(String str) {
    }

    public void setUserAccount(String str) {
    }

    public Bundle toBundle() {
    }

    public String toString() {
    }
}
