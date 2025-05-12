package com.jeremyliao.liveeventbus.logger;

import java.util.logging.Level;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface Logger {
    void log(Level level, String str);

    void log(Level level, String str, Throwable th);
}
