package com.tencent.android.tpush.message;

import android.content.Context;
import android.content.Intent;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.tencent.android.tpush.data.CachedMessageIntent;
import com.tencent.android.tpush.data.MessageId;
import java.util.ArrayList;
import java.util.List;

@JgClassChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20150316", reviewer = 3, vComment = {EType.INTENTSCHEMECHECK, EType.INTENTCHECK, EType.RECEIVERCHECK})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class MessageManager {
    public static final int MSG_CTRL_CMD_TYPE = 3;
    public static final int MSG_CTRL_CMD_TYPE_ACTION_CLEAR_PKG = 2;
    public static final int MSG_CTRL_CMD_TYPE_ACTION_CLEAR_PUSHID = 1;
    public static final int MSG_CTRL_CMD_TYPE_ACTION_LOG_ENABLED = 3;
    public static final String SHARED_PREFERENCES_CACHE_MSG_KEY = ".tpns.msg.id.cached";
    public static final String SHARED_PREFERENCES_KEY = ".tpns.msg.id";
    private static MessageManager a;
    private static final byte[] b = null;

    private MessageManager() {
    }

    private void a(Context context, String str, String str2, ArrayList<?> arrayList) {
    }

    public static MessageManager getInstance() {
    }

    public static String getNotifiedMsgIds(Context context, long j2) {
    }

    public static boolean setNotifiedMsgIds(Context context, long j2, String str, String str2) {
    }

    public void addCachedMsgIntentByPkgName(Context context, String str, Intent intent) {
    }

    public void addDonotCachedMsgId(Context context, String str, ArrayList<Intent> arrayList) {
    }

    public void addDonotSendCachedMsgIntentList(Context context, Intent intent) {
    }

    public void addMsgId(Context context, String str, MessageId messageId) {
    }

    public void addNewCachedMsgIntent(Context context, Intent intent) {
    }

    public void clearAllLocalMsg(Context context) {
    }

    public void clearLocalCachedMsgIntentList(Context context) {
    }

    public void deleteAllCachedMsgIntent(Context context) {
    }

    public void deleteAllCachedMsgIntentByPkgName(Context context, String str) {
    }

    public void deleteCachedMsgIntent(Context context, long j2) {
    }

    public void deleteCachedMsgIntentByBusiId(Context context, long j2) {
    }

    public void deleteCachedMsgIntentByPkgName(Context context, String str, long j2) {
    }

    public void deleteCachedMsgIntentByPkgNameBusiId(Context context, String str, long j2) {
    }

    public ArrayList<CachedMessageIntent> getCachedMsgIntentList(Context context) {
    }

    public ArrayList<CachedMessageIntent> getCachedMsgIntentListByPkgName(Context context, String str) {
    }

    public ArrayList<Intent> getDonotCachedMsgId(Context context, String str) {
    }

    public ArrayList<Intent> getDonotSendCachedMsgIntentList(Context context) {
    }

    public ArrayList<MessageId> getMessageIdListByPkgName(Context context, String str) {
    }

    public MessageId getMsgId(Context context, String str, long j2) {
    }

    public ArrayList<Intent> getNewCachedMsgIntentList(Context context) {
    }

    public boolean isMsgAcked(Context context, String str, long j2) {
    }

    public boolean isMsgCached(Context context, long j2) {
    }

    public void onCrtlMsgHandle(Context context, String str) {
    }

    public void updateCachedMsgIntentByPkgName(Context context, String str, ArrayList<CachedMessageIntent> arrayList) {
    }

    public void updateCachedMsgIntentToCancel(Context context, long j2) {
    }

    public void updateCachedMsgIntentToClick(Context context, long j2) {
    }

    public void updateCachedMsgIntentToShowed(Context context, long j2) {
    }

    public void updateCachedMsgIntentToVerifyErr(Context context, long j2) {
    }

    public void updateMsgId(Context context, String str, ArrayList<MessageId> arrayList) {
    }

    public void deleteCachedMsgIntent(Context context, List<CachedMessageIntent> list, ArrayList<CachedMessageIntent> arrayList) {
    }

    private Object a(Context context, String str, String str2) {
    }
}
