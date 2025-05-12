package com.tencent.android.tpush.data;

import java.io.Serializable;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class MessageId implements Serializable {
    public static final short FLAG_ACK = 1;
    public static final short FLAG_UNACK = 0;
    private static final long serialVersionUID = 8708157897391765794L;
    public long accessId;
    public byte apn;
    public long busiMsgId;
    public long channelId;
    public String date;
    public String groupId;
    public long host;
    public long id;
    public short isAck;
    public byte isp;
    public long msgType;
    public long multiPkg;
    public String nGroupId;
    public byte pact;
    public String pkgName;
    public int port;
    public int pushChannel;
    public long pushTime;
    public long receivedTime;
    public int revokeId;
    public long serverTime;
    public String serviceHost;
    public String statTag;
    public long timestamp;
    public long ttl;

    public boolean isMsgAcked() {
    }

    public String toString() {
    }
}
