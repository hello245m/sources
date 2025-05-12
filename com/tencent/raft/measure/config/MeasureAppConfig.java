package com.tencent.raft.measure.config;

import com.tencent.raft.measure.log.ILogDelegate;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class MeasureAppConfig {
    private ScheduledExecutorService executor;
    private boolean isDebug;
    private ILogDelegate logDelegate;

    public MeasureAppConfig(ILogDelegate iLogDelegate, boolean z, ScheduledExecutorService scheduledExecutorService) {
    }

    public ScheduledExecutorService getExecutor() {
    }

    public ILogDelegate getLogDelegate() {
    }

    public boolean isDebug() {
    }

    public MeasureAppConfig setDebug(boolean z) {
    }

    public MeasureAppConfig setExecutor(ScheduledExecutorService scheduledExecutorService) {
    }

    public MeasureAppConfig setLogDelegate(ILogDelegate iLogDelegate) {
    }
}
