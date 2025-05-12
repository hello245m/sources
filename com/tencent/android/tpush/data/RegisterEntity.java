package com.tencent.android.tpush.data;

import java.io.Serializable;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class RegisterEntity implements Serializable {
    private static final String TAG = "RegisterEntity";
    public static final byte TYPE_REGISTER = 0;
    public static final byte TYPE_REMOTE_UNINSTALL = 4;
    public static final byte TYPE_REMOTE_UNREGISTER = 3;
    public static final byte TYPE_UNINSTALL = 2;
    public static final byte TYPE_UNREGISTER = 1;
    private static final long serialVersionUID = -7991157757568940718L;
    public long accessId;
    public String accessKey;
    public String appVersion;
    public long channelId;
    public long guid;
    public String packageName;
    public int state;
    public long timestamp;
    public String token;
    public String xgSDKVersion;

    public static RegisterEntity decode(String str) {
    }

    public static String encode(RegisterEntity registerEntity) {
    }

    public long getGuid() {
    }

    public boolean isRegistered() {
    }

    public boolean isUnregistered() {
    }

    public boolean isUnstalled() {
    }

    public void setGuid(long j2) {
    }

    public void setRegistered() {
    }

    public void setUnregistered() {
    }

    public void setUnstalled() {
    }

    public String toString() {
    }
}
