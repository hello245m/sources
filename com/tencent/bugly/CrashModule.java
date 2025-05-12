package com.tencent.bugly;

import android.content.Context;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.o;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class CrashModule extends o {
    public static final int MODULE_ID = 1004;
    private static int c;
    private static CrashModule e;
    private long a;
    private BuglyStrategy.a b;
    private boolean d;

    private synchronized void a(Context context, BuglyStrategy buglyStrategy) {
    }

    public static CrashModule getInstance() {
    }

    @Override // com.tencent.bugly.proguard.o
    public String[] getTables() {
    }

    public synchronized boolean hasInitialized() {
    }

    @Override // com.tencent.bugly.proguard.o
    public synchronized void init(Context context, boolean z, BuglyStrategy buglyStrategy) {
    }

    @Override // com.tencent.bugly.proguard.o
    public void onServerStrategyChanged(StrategyBean strategyBean) {
    }
}
