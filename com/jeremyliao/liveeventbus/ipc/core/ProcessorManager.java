package com.jeremyliao.liveeventbus.ipc.core;

import android.content.Intent;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ProcessorManager {
    private final List<Processor> baseProcessors;
    private final Map<String, Processor> processorMap;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class SingletonHolder {
        private static final ProcessorManager INSTANCE = null;

        private SingletonHolder() {
        }

        public static /* synthetic */ ProcessorManager access$100() {
        }
    }

    public /* synthetic */ ProcessorManager(AnonymousClass1 anonymousClass1) {
    }

    public static ProcessorManager getManager() {
    }

    public Object createFrom(Intent intent) {
    }

    public boolean writeTo(Intent intent, Object obj) {
    }

    private ProcessorManager() {
    }
}
