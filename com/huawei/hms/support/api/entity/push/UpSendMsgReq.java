package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class UpSendMsgReq implements IMessageEntity {

    @Packed
    private String collapseKey;

    @Packed
    private String data;

    @Packed
    private String msgId;

    @Packed
    private String msgType;

    @Packed
    private String packageName;

    @Packed
    private int receiptMode;

    @Packed
    private int sendMode;

    @Packed
    private String to;

    @Packed
    private String token;

    @Packed
    private int ttl;

    public String getCollapseKey() {
    }

    public String getData() {
    }

    public String getMessageId() {
    }

    public String getMessageType() {
    }

    public String getPackageName() {
    }

    public int getReceiptMode() {
    }

    public int getSendMode() {
    }

    public String getTo() {
    }

    public String getToken() {
    }

    public int getTtl() {
    }

    public void setCollapseKey(String str) {
    }

    public void setData(String str) {
    }

    public void setMessageId(String str) {
    }

    public void setMessageType(String str) {
    }

    public void setPackageName(String str) {
    }

    public void setReceiptMode(int i2) {
    }

    public void setSendMode(int i2) {
    }

    public void setTo(String str) {
    }

    public void setToken(String str) {
    }

    public void setTtl(int i2) {
    }
}
