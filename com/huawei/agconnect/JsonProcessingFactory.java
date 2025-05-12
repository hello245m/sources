package com.huawei.agconnect;

import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class JsonProcessingFactory {
    private static final Map<String, JsonProcessor> PROCESSOR_MAP = null;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface JsonProcessor {
        String processOption(AGConnectOptions aGConnectOptions);
    }

    public static Map<String, JsonProcessor> getProcessors() {
    }

    public static void registerProcessor(String str, JsonProcessor jsonProcessor) {
    }
}
