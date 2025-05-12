package com.jeremyliao.liveeventbus;

import com.jeremyliao.liveeventbus.core.Config;
import com.jeremyliao.liveeventbus.core.LiveEvent;
import com.jeremyliao.liveeventbus.core.Observable;
import com.jeremyliao.liveeventbus.core.ObservableConfig;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class LiveEventBus {
    public static Config config() {
    }

    public static <T> Observable<T> get(String str, Class<T> cls) {
    }

    public static ObservableConfig config(String str) {
    }

    public static <T> Observable<T> get(String str) {
    }

    public static <T extends LiveEvent> Observable<T> get(Class<T> cls) {
    }
}
