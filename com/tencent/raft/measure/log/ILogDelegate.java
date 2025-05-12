package com.tencent.raft.measure.log;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface ILogDelegate {
    void debug(String str, String str2);

    void debug(String str, String str2, Throwable th);

    void error(String str, String str2);

    void error(String str, String str2, Throwable th);

    void info(String str, String str2);

    void info(String str, String str2, Throwable th);

    void warn(String str, String str2);

    void warn(String str, String str2, Throwable th);
}
