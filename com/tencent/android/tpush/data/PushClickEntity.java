package com.tencent.android.tpush.data;

import java.io.Serializable;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class PushClickEntity implements Serializable {
    private static final long serialVersionUID = -166678396447407161L;
    public long accessId;
    public int action;
    public long broadcastId;
    public long clickTime;
    public String groupId;
    public long msgId;
    public String pkgName;
    public long timestamp;
    public long type;

    public PushClickEntity() {
    }

    public PushClickEntity(long j2, long j3, long j4, long j5, String str, long j6, long j7, int i2, String str2) {
    }
}
