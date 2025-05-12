package com.tencent.xweb;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IXWebPreferences {
    public static final String REMOTE_DEBUGGING = "remote-debugging";
    public static final String XWEB_LANGUAGE = "lang";

    boolean getBooleanValue(String str);

    int getIntegerValue(String str);

    String getStringValue(String str);

    boolean getValue(String str);

    void setValue(String str, int i2);

    void setValue(String str, String str2);

    void setValue(String str, boolean z);
}
