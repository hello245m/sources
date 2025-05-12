package com.jeremyliao.liveeventbus.ipc.core;

import android.os.Bundle;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface Processor {
    Object createFromBundle(Bundle bundle) throws Exception;

    boolean writeToBundle(Bundle bundle, Object obj) throws Exception;
}
